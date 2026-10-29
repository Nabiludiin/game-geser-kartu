package o2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k3.h;
import k3.i;
import k3.k;
import l4.e;
import l4.f;
import p3.o;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    k3.a f25048a;

    /* renamed from: b, reason: collision with root package name */
    f f25049b;

    /* renamed from: c, reason: collision with root package name */
    boolean f25050c;

    /* renamed from: d, reason: collision with root package name */
    final Object f25051d;

    /* renamed from: e, reason: collision with root package name */
    c f25052e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f25053f;

    /* renamed from: g, reason: collision with root package name */
    final long f25054g;

    /* compiled from: MyApplication */
    /* renamed from: o2.a$a, reason: collision with other inner class name */
    public static final class C0117a {

        /* renamed from: a, reason: collision with root package name */
        private final String f25055a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f25056b;

        public C0117a(String str, boolean z7) {
            this.f25055a = str;
            this.f25056b = z7;
        }

        public String a() {
            return this.f25055a;
        }

        public boolean b() {
            return this.f25056b;
        }

        public String toString() {
            String str = this.f25055a;
            boolean z7 = this.f25056b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z7);
            return sb.toString();
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public static C0117a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.f(false);
            C0117a h8 = aVar.h(-1);
            aVar.g(h8, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return h8;
        } finally {
        }
    }

    public static boolean b(Context context) {
        boolean h8;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.f(false);
            o.l("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                try {
                    if (!aVar.f25050c) {
                        synchronized (aVar.f25051d) {
                            c cVar = aVar.f25052e;
                            if (cVar == null || !cVar.f25061t) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            aVar.f(false);
                            if (!aVar.f25050c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e8) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                        }
                    }
                    o.m(aVar.f25048a);
                    o.m(aVar.f25049b);
                    try {
                        h8 = aVar.f25049b.h();
                    } catch (RemoteException e9) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.i();
            aVar.e();
            return h8;
        } catch (Throwable th2) {
            aVar.e();
            throw th2;
        }
    }

    private final C0117a h(int i7) {
        C0117a c0117a;
        o.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f25050c) {
                    synchronized (this.f25051d) {
                        c cVar = this.f25052e;
                        if (cVar == null || !cVar.f25061t) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        f(false);
                        if (!this.f25050c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                o.m(this.f25048a);
                o.m(this.f25049b);
                try {
                    c0117a = new C0117a(this.f25049b.d(), this.f25049b.A0(true));
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
        return c0117a;
    }

    private final void i() {
        synchronized (this.f25051d) {
            c cVar = this.f25052e;
            if (cVar != null) {
                cVar.f25060s.countDown();
                try {
                    this.f25052e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j7 = this.f25054g;
            if (j7 > 0) {
                this.f25052e = new c(this, j7);
            }
        }
    }

    public void d() {
        f(true);
    }

    public final void e() {
        o.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f25053f == null || this.f25048a == null) {
                    return;
                }
                try {
                    if (this.f25050c) {
                        s3.a.b().c(this.f25053f, this.f25048a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f25050c = false;
                this.f25049b = null;
                this.f25048a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void f(boolean z7) {
        o.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f25050c) {
                    e();
                }
                Context context = this.f25053f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int j7 = h.h().j(context, k.f24503a);
                    if (j7 != 0 && j7 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    k3.a aVar = new k3.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!s3.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f25048a = aVar;
                        try {
                            this.f25049b = e.a(aVar.a(10000L, TimeUnit.MILLISECONDS));
                            this.f25050c = true;
                            if (z7) {
                                i();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new i(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void finalize() {
        e();
        super.finalize();
    }

    final boolean g(C0117a c0117a, boolean z7, float f8, long j7, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (c0117a != null) {
            hashMap.put("limit_ad_tracking", true != c0117a.b() ? "0" : "1");
            String a8 = c0117a.a();
            if (a8 != null) {
                hashMap.put("ad_id_size", Integer.toString(a8.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j7));
        new b(this, hashMap).start();
        return true;
    }

    public a(Context context, long j7, boolean z7, boolean z8) {
        Context applicationContext;
        this.f25051d = new Object();
        o.m(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f25053f = context;
        this.f25050c = false;
        this.f25054g = j7;
    }

    public static void c(boolean z7) {
    }
}
