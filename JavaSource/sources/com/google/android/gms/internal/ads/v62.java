package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class v62 {

    /* renamed from: f, reason: collision with root package name */
    private static v62 f17404f;

    /* renamed from: a, reason: collision with root package name */
    private final Executor f17405a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f17406b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f17407c;

    /* renamed from: d, reason: collision with root package name */
    private int f17408d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17409e;

    private v62(final Context context) {
        Executor a8 = f71.a();
        this.f17405a = a8;
        this.f17406b = new CopyOnWriteArrayList();
        this.f17407c = new Object();
        this.f17408d = 0;
        a8.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.q32
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new s52(v62.this, null), intentFilter);
            }
        });
    }

    public static synchronized v62 a(Context context) {
        v62 v62Var;
        synchronized (v62.class) {
            try {
                if (f17404f == null) {
                    f17404f = new v62(context);
                }
                v62Var = f17404f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v62Var;
    }

    private final void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17406b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p22 p22Var = (p22) it.next();
            if (p22Var.a()) {
                copyOnWriteArrayList.remove(p22Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(int i7) {
        g();
        synchronized (this.f17407c) {
            try {
                if (this.f17409e && this.f17408d == i7) {
                    return;
                }
                this.f17409e = true;
                this.f17408d = i7;
                Iterator it = this.f17406b.iterator();
                while (it.hasNext()) {
                    ((p22) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(m02 m02Var, Executor executor) {
        boolean z7;
        g();
        p22 p22Var = new p22(this, m02Var, executor);
        synchronized (this.f17407c) {
            this.f17406b.add(p22Var);
            z7 = this.f17409e;
        }
        if (z7) {
            p22Var.b();
        }
    }

    public final int c() {
        int i7;
        synchronized (this.f17407c) {
            i7 = this.f17408d;
        }
        return i7;
    }

    final /* synthetic */ void d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i7 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i7 = type != 9 ? 8 : 7;
                                }
                                i7 = 5;
                            }
                        }
                        i7 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i7 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i7 = 4;
                            break;
                        case 13:
                            i7 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i7 = 6;
                            break;
                        case 18:
                            i7 = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i7 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i7 = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i7 != 5) {
            e(i7);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            lz1 lz1Var = new lz1(this);
            telephonyManager.registerTelephonyCallback(this.f17405a, lz1Var);
            telephonyManager.unregisterTelephonyCallback(lz1Var);
        } catch (RuntimeException unused2) {
            e(5);
        }
    }

    final /* synthetic */ Executor f() {
        return this.f17405a;
    }
}
