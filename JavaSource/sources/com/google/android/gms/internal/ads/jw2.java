package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class jw2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b63 f10798a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r53 f10799b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n31 f10800c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ nw2 f10801d;

    jw2(nw2 nw2Var, b63 b63Var, r53 r53Var, n31 n31Var) {
        this.f10798a = b63Var;
        this.f10799b = r53Var;
        this.f10800c = n31Var;
        Objects.requireNonNull(nw2Var);
        this.f10801d = nw2Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        b63 b63Var;
        if (((Boolean) s2.b0.c().d(uy.f17188q6)).booleanValue()) {
            v2.n1.l("Banner ad failed to load", th);
        }
        nw2 nw2Var = this.f10801d;
        synchronized (nw2Var) {
            try {
                n31 n31Var = this.f10800c;
                s2.x2 g8 = n31Var.b().g(th);
                nw2Var.s(g8);
                n31Var.a().o(g8);
                u13.a(g8.f26259q, th, "BannerAdLoader.onFailure");
                if (nw2Var.r()) {
                    nw2Var.n();
                    nw2Var.o().W0(nw2Var.q().a());
                }
                if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f10798a) == null) {
                    e63 p7 = nw2Var.p();
                    r53 r53Var = this.f10799b;
                    r53Var.l0(g8);
                    r53Var.j0(th);
                    r53Var.e(false);
                    p7.b(r53Var.n());
                } else {
                    b63Var.f(g8);
                    r53 r53Var2 = this.f10799b;
                    r53Var2.j0(th);
                    r53Var2.e(false);
                    b63Var.a(r53Var2);
                    b63Var.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        b63 b63Var;
        nw2 nw2Var = this.f10801d;
        h21 h21Var = (h21) obj;
        synchronized (nw2Var) {
            if (h21Var != null) {
                try {
                    h21Var.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (nw2Var.r()) {
                nw2Var.c();
            }
            if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f10798a) == null) {
                e63 p7 = nw2Var.p();
                r53 r53Var = this.f10799b;
                r53Var.m0(h21Var.h().f13137b);
                r53Var.c0(h21Var.d().c());
                r53Var.e(true);
                p7.b(r53Var.n());
            } else {
                b63Var.e(h21Var.h().f13137b);
                b63Var.g(h21Var.d().c());
                r53 r53Var2 = this.f10799b;
                r53Var2.e(true);
                b63Var.a(r53Var2);
                b63Var.h();
            }
        }
    }
}
