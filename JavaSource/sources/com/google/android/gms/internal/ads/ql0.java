package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14480a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final v2.s1 f14481b;

    /* renamed from: c, reason: collision with root package name */
    private final tl0 f14482c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14483d;

    /* renamed from: e, reason: collision with root package name */
    private Context f14484e;

    /* renamed from: f, reason: collision with root package name */
    private w2.a f14485f;

    /* renamed from: g, reason: collision with root package name */
    private String f14486g;

    /* renamed from: h, reason: collision with root package name */
    private zy f14487h;

    /* renamed from: i, reason: collision with root package name */
    private rx1 f14488i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f14489j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f14490k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f14491l;

    /* renamed from: m, reason: collision with root package name */
    private final pl0 f14492m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f14493n;

    /* renamed from: o, reason: collision with root package name */
    private a5.d f14494o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f14495p;

    public ql0() {
        v2.s1 s1Var = new v2.s1();
        this.f14481b = s1Var;
        this.f14482c = new tl0(s2.z.c(), s1Var);
        this.f14483d = false;
        this.f14487h = null;
        this.f14488i = null;
        this.f14489j = null;
        this.f14490k = new AtomicInteger(0);
        this.f14491l = new AtomicInteger(0);
        this.f14492m = new pl0(null);
        this.f14493n = new Object();
        this.f14495p = new AtomicBoolean();
    }

    final /* synthetic */ Context A() {
        return this.f14484e;
    }

    final /* synthetic */ w2.a B() {
        return this.f14485f;
    }

    final /* synthetic */ zy a() {
        return this.f14487h;
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f14495p;
    }

    public final zy c() {
        zy zyVar;
        synchronized (this.f14480a) {
            zyVar = this.f14487h;
        }
        return zyVar;
    }

    public final void d(Boolean bool) {
        synchronized (this.f14480a) {
            this.f14489j = bool;
        }
    }

    public final Boolean e() {
        Boolean bool;
        synchronized (this.f14480a) {
            bool = this.f14489j;
        }
        return bool;
    }

    public final void f() {
        this.f14492m.a();
    }

    public final void g(Context context, w2.a aVar, rx1 rx1Var) {
        zy zyVar;
        synchronized (this.f14480a) {
            try {
                if (!this.f14483d) {
                    this.f14484e = context.getApplicationContext();
                    this.f14485f = aVar;
                    r2.t.k().b(this.f14482c);
                    this.f14481b.h(this.f14484e);
                    ag0.d(this.f14484e, this.f14485f);
                    this.f14488i = rx1Var;
                    r2.t.q();
                    if (((Boolean) s2.b0.c().d(uy.f17168o2)).booleanValue()) {
                        zyVar = new zy();
                    } else {
                        v2.n1.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zyVar = null;
                    }
                    this.f14487h = zyVar;
                    if (zyVar != null) {
                        fm0.a(new ml0(this).b(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f14484e;
                    if (com.google.android.gms.common.util.n.f()) {
                        if (((Boolean) s2.b0.c().d(uy.n9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new nl0(this));
                            } catch (RuntimeException e8) {
                                int i7 = v2.n1.f26802b;
                                w2.p.g("Failed to register network callback", e8);
                                this.f14495p.set(true);
                            }
                        }
                    }
                    this.f14483d = true;
                    s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) s2.b0.c().d(uy.Je)).booleanValue()) {
            return;
        }
        r2.t.g().Q(context, aVar.f27051q);
    }

    public final Resources h() {
        if (this.f14485f.f27054t) {
            return this.f14484e.getResources();
        }
        try {
            if (((Boolean) s2.b0.c().d(uy.Ub)).booleanValue()) {
                return w2.t.b(this.f14484e).getResources();
            }
            w2.t.b(this.f14484e).getResources();
            return null;
        } catch (w2.s e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Cannot load resource from dynamite apk or local jar", e8);
            return null;
        }
    }

    public final void i(Throwable th, String str) {
        ag0.d(this.f14484e, this.f14485f).a(th, str);
    }

    public final void j(Throwable th, String str) {
        ag0.d(this.f14484e, this.f14485f).b(th, str, ((Double) f10.f7960f.e()).floatValue());
    }

    public final void k(Throwable th, String str) {
        ag0.f(this.f14484e, this.f14485f).a(th, str);
    }

    public final void l() {
        this.f14490k.incrementAndGet();
    }

    public final void m() {
        this.f14490k.decrementAndGet();
    }

    public final int n() {
        return this.f14490k.get();
    }

    public final void o() {
        this.f14491l.incrementAndGet();
    }

    public final int p() {
        return this.f14491l.get();
    }

    public final v2.p1 q() {
        v2.s1 s1Var;
        synchronized (this.f14480a) {
            s1Var = this.f14481b;
        }
        return s1Var;
    }

    public final Context r() {
        return this.f14484e;
    }

    public final a5.d s() {
        if (this.f14484e != null) {
            if (!((Boolean) s2.b0.c().d(uy.f17201s3)).booleanValue()) {
                synchronized (this.f14493n) {
                    try {
                        a5.d dVar = this.f14494o;
                        if (dVar != null) {
                            return dVar;
                        }
                        a5.d B0 = cm0.f6500a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.ol0
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return ql0.this.y();
                            }
                        });
                        this.f14494o = B0;
                        return B0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return p64.a(new ArrayList());
    }

    public final tl0 t() {
        return this.f14482c;
    }

    public final boolean u(Context context) {
        if (com.google.android.gms.common.util.n.f()) {
            if (((Boolean) s2.b0.c().d(uy.n9)).booleanValue()) {
                return this.f14495p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void v(String str) {
        this.f14486g = str;
    }

    public final String w() {
        return this.f14486g;
    }

    public final rx1 x() {
        return this.f14488i;
    }

    final /* synthetic */ ArrayList y() {
        Context a8 = oh0.a(this.f14484e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f8 = u3.e.a(a8).f(a8.getApplicationInfo().packageName, 4096);
            if (f8.requestedPermissions != null && f8.requestedPermissionsFlags != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr = f8.requestedPermissions;
                    if (i7 >= strArr.length) {
                        break;
                    }
                    if ((f8.requestedPermissionsFlags[i7] & 2) != 0) {
                        arrayList.add(strArr[i7]);
                    }
                    i7++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    final /* synthetic */ Object z() {
        return this.f14480a;
    }
}
