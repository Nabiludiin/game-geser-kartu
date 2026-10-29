package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
public final class ba0 {

    /* renamed from: b, reason: collision with root package name */
    private final Context f5646b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5647c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f5648d;

    /* renamed from: e, reason: collision with root package name */
    private final e63 f5649e;

    /* renamed from: f, reason: collision with root package name */
    private final v2.e0 f5650f;

    /* renamed from: g, reason: collision with root package name */
    private final v2.e0 f5651g;

    /* renamed from: h, reason: collision with root package name */
    private aa0 f5652h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f5645a = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f5653i = 1;

    public ba0(Context context, w2.a aVar, String str, v2.e0 e0Var, v2.e0 e0Var2, e63 e63Var) {
        this.f5647c = str;
        this.f5646b = context.getApplicationContext();
        this.f5648d = aVar;
        this.f5649e = e63Var;
        this.f5650f = e0Var;
        this.f5651g = e0Var2;
    }

    protected final aa0 a(fn fnVar) {
        r53 a8 = q53.a(this.f5646b, 6);
        a8.a();
        final aa0 aa0Var = new aa0(this.f5651g);
        v2.n1.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final fn fnVar2 = null;
        cm0.f6505f.execute(new Runnable(fnVar2, aa0Var) { // from class: com.google.android.gms.internal.ads.q90

            /* renamed from: r, reason: collision with root package name */
            private final /* synthetic */ aa0 f14307r;

            {
                this.f14307r = aa0Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ba0.this.c(null, this.f14307r);
            }
        });
        v2.n1.k("loadNewJavascriptEngine: Promise created");
        aa0Var.a(new j90(this, aa0Var, a8), new k90(this, aa0Var, a8));
        return aa0Var;
    }

    public final u90 b(fn fnVar) {
        v2.n1.k("getEngine: Trying to acquire lock");
        Object obj = this.f5645a;
        synchronized (obj) {
            try {
                v2.n1.k("getEngine: Lock acquired");
                v2.n1.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        v2.n1.k("refreshIfDestroyed: Lock acquired");
                        aa0 aa0Var = this.f5652h;
                        if (aa0Var != null && this.f5653i == 0) {
                            aa0Var.a(new mm0() { // from class: com.google.android.gms.internal.ads.m90
                                @Override // com.google.android.gms.internal.ads.mm0
                                public final /* synthetic */ void d(Object obj2) {
                                    ba0.this.d((u80) obj2);
                                }
                            }, n90.f12633a);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v2.n1.k("refreshIfDestroyed: Lock released");
        aa0 aa0Var2 = this.f5652h;
        if (aa0Var2 != null && aa0Var2.e() != -1) {
            int i7 = this.f5653i;
            if (i7 == 0) {
                v2.n1.k("getEngine (NO_UPDATE): Lock released");
                return this.f5652h.g();
            }
            if (i7 != 1) {
                v2.n1.k("getEngine (UPDATING): Lock released");
                return this.f5652h.g();
            }
            this.f5653i = 2;
            a(null);
            v2.n1.k("getEngine (PENDING_UPDATE): Lock released");
            return this.f5652h.g();
        }
        this.f5653i = 2;
        this.f5652h = a(null);
        v2.n1.k("getEngine (NULL or REJECTED): Lock released");
        return this.f5652h.g();
    }

    final /* synthetic */ void c(fn fnVar, final aa0 aa0Var) {
        final long a8 = r2.t.o().a();
        final ArrayList arrayList = new ArrayList();
        try {
            v2.n1.k("loadJavascriptEngine > Before createJavascriptEngine");
            final d90 d90Var = new d90(this.f5646b, this.f5648d, null, null);
            v2.n1.k("loadJavascriptEngine > After createJavascriptEngine");
            v2.n1.k("loadJavascriptEngine > Before setting new engine loaded listener");
            d90Var.X0(new t80() { // from class: com.google.android.gms.internal.ads.o90
                @Override // com.google.android.gms.internal.ads.t80
                public final /* synthetic */ void a() {
                    long a9 = r2.t.o().a();
                    final long j7 = a8;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(a9 - j7));
                    String valueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(valueOf.length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(valueOf);
                    sb.append(" ms.");
                    v2.n1.k(sb.toString());
                    of3 of3Var = v2.f2.f26746l;
                    final ba0 ba0Var = ba0.this;
                    final aa0 aa0Var2 = aa0Var;
                    final u80 u80Var = d90Var;
                    of3Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.p90
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            ba0.this.e(aa0Var2, u80Var, arrayList2, j7);
                        }
                    }, ((Integer) s2.b0.c().d(uy.f17063c)).intValue());
                }
            });
            v2.n1.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            d90Var.K("/jsLoaded", new f90(this, a8, aa0Var, d90Var));
            v2.x0 x0Var = new v2.x0();
            g90 g90Var = new g90(this, null, d90Var, x0Var);
            x0Var.b(g90Var);
            v2.n1.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            d90Var.K("/requestReload", g90Var);
            String str = this.f5647c;
            v2.n1.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                v2.n1.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                d90Var.u(str);
                v2.n1.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                v2.n1.k("loadJavascriptEngine > Before newEngine.loadHtml");
                d90Var.p0(str);
                v2.n1.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                v2.n1.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                d90Var.a0(str);
                v2.n1.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            v2.n1.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            v2.f2.f26746l.postDelayed(new i90(this, aa0Var, d90Var, arrayList, a8), ((Integer) s2.b0.c().d(uy.f17072d)).intValue());
        } catch (Throwable th) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error creating webview.", th);
            if (((Boolean) s2.b0.c().d(uy.p8)).booleanValue()) {
                aa0Var.d(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) s2.b0.c().d(uy.r8)).booleanValue()) {
                r2.t.l().j(th, "SdkJavascriptFactory.loadJavascriptEngine");
                aa0Var.c();
            } else {
                r2.t.l().i(th, "SdkJavascriptFactory.loadJavascriptEngine");
                aa0Var.c();
            }
        }
    }

    final /* synthetic */ void d(u80 u80Var) {
        if (u80Var.l()) {
            this.f5653i = 1;
        }
    }

    final /* synthetic */ void e(aa0 aa0Var, final u80 u80Var, ArrayList arrayList, long j7) {
        v2.n1.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f5645a) {
            try {
                v2.n1.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (aa0Var.e() != -1 && aa0Var.e() != 1) {
                    if (((Boolean) s2.b0.c().d(uy.p8)).booleanValue()) {
                        aa0Var.d(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        aa0Var.c();
                    }
                    z64 z64Var = cm0.f6505f;
                    Objects.requireNonNull(u80Var);
                    z64Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.l90
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            u80.this.i();
                        }
                    });
                    String valueOf = String.valueOf(s2.b0.c().d(uy.f17063c));
                    int e8 = aa0Var.e();
                    int i7 = this.f5653i;
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    long a8 = r2.t.o().a() - j7;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 94 + String.valueOf(e8).length() + 39 + String.valueOf(i7).length() + 57 + valueOf2.length() + 42 + String.valueOf(a8).length() + 15);
                    sb.append("Could not receive /jsLoaded in ");
                    sb.append(valueOf);
                    sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb.append(e8);
                    sb.append(". Update status(onEngLoadedTimeout) is ");
                    sb.append(i7);
                    sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb.append(valueOf2);
                    sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb.append(a8);
                    sb.append(" ms. Rejecting.");
                    v2.n1.k(sb.toString());
                    v2.n1.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                v2.n1.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object f() {
        return this.f5645a;
    }

    final /* synthetic */ e63 g() {
        return this.f5649e;
    }

    final /* synthetic */ aa0 h() {
        return this.f5652h;
    }

    final /* synthetic */ void i(aa0 aa0Var) {
        this.f5652h = aa0Var;
    }

    final /* synthetic */ int j() {
        return this.f5653i;
    }

    final /* synthetic */ void k(int i7) {
        this.f5653i = i7;
    }
}
