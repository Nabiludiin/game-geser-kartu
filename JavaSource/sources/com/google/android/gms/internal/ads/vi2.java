package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vi2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qi2 f17620a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b63 f17621b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r53 f17622c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ wl1 f17623d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ yi2 f17624e;

    vi2(yi2 yi2Var, qi2 qi2Var, b63 b63Var, r53 r53Var, wl1 wl1Var) {
        this.f17620a = qi2Var;
        this.f17621b = b63Var;
        this.f17622c = r53Var;
        this.f17623d = wl1Var;
        Objects.requireNonNull(yi2Var);
        this.f17624e = yi2Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        b63 b63Var;
        if (((Boolean) s2.b0.c().d(uy.f17188q6)).booleanValue()) {
            v2.n1.l("Native ad failed to load", th);
        }
        wl1 wl1Var = this.f17623d;
        final s2.x2 g8 = wl1Var.a().g(th);
        wl1Var.b().o(g8);
        yi2 yi2Var = this.f17624e;
        yi2Var.e().j().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ti2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vi2.this.f17624e.f().e().o(g8);
            }
        });
        u13.a(g8.f26259q, th, "NativeAdLoader.onFailure");
        this.f17620a.a();
        if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f17621b) == null) {
            e63 g9 = yi2Var.g();
            r53 r53Var = this.f17622c;
            r53Var.l0(g8);
            r53Var.j0(th);
            r53Var.e(false);
            g9.b(r53Var.n());
            return;
        }
        b63Var.f(g8);
        r53 r53Var2 = this.f17622c;
        r53Var2.j0(th);
        r53Var2.e(false);
        b63Var.a(r53Var2);
        b63Var.h();
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        b63 b63Var;
        yi2 yi2Var = this.f17624e;
        r41 r41Var = (r41) obj;
        synchronized (yi2Var) {
            if (r41Var != null) {
                try {
                    r41Var.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            r41Var.g().a(yi2Var.f().c());
            this.f17620a.b(r41Var);
            yi2Var.e().j().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ui2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    vi2.this.f17624e.f().d().f();
                }
            });
            if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f17621b) == null) {
                e63 g8 = yi2Var.g();
                r53 r53Var = this.f17622c;
                r53Var.m0(r41Var.h().f13137b);
                r53Var.c0(r41Var.d().c());
                r53Var.e(true);
                g8.b(r53Var.n());
            } else {
                b63Var.e(r41Var.h().f13137b);
                b63Var.g(r41Var.d().c());
                r53 r53Var2 = this.f17622c;
                r53Var2.e(true);
                b63Var.a(r53Var2);
                b63Var.h();
            }
        }
    }
}
