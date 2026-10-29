package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class cy2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qi2 f6856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b63 f6857b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r53 f6858c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ al1 f6859d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ey2 f6860e;

    cy2(ey2 ey2Var, qi2 qi2Var, b63 b63Var, r53 r53Var, al1 al1Var) {
        this.f6856a = qi2Var;
        this.f6857b = b63Var;
        this.f6858c = r53Var;
        this.f6859d = al1Var;
        Objects.requireNonNull(ey2Var);
        this.f6860e = ey2Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        b63 b63Var;
        if (((Boolean) s2.b0.c().d(uy.f17188q6)).booleanValue()) {
            v2.n1.l("Interstitial ad failed to load", th);
        }
        al1 al1Var = this.f6859d;
        final s2.x2 g8 = al1Var.b().g(th);
        ey2 ey2Var = this.f6860e;
        synchronized (ey2Var) {
            try {
                ey2Var.i(null);
                al1Var.a().o(g8);
                if (((Boolean) s2.b0.c().d(uy.c9)).booleanValue()) {
                    ey2Var.e().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zx2
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            cy2.this.f6860e.f().o(g8);
                        }
                    });
                    ey2Var.e().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ay2
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            cy2.this.f6860e.g().o(g8);
                        }
                    });
                }
                u13.a(g8.f26259q, th, "InterstitialAdLoader.onFailure");
                this.f6856a.a();
                if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f6857b) == null) {
                    e63 h8 = ey2Var.h();
                    r53 r53Var = this.f6858c;
                    r53Var.l0(g8);
                    r53Var.j0(th);
                    r53Var.e(false);
                    h8.b(r53Var.n());
                } else {
                    b63Var.f(g8);
                    r53 r53Var2 = this.f6858c;
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
        ey2 ey2Var = this.f6860e;
        rj1 rj1Var = (rj1) obj;
        synchronized (ey2Var) {
            if (rj1Var != null) {
                try {
                    rj1Var.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ey2Var.i(null);
            ly lyVar = uy.c9;
            if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                ud1 g8 = rj1Var.g();
                g8.a(ey2Var.f());
                g8.d(ey2Var.g());
            }
            this.f6856a.b(rj1Var);
            if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                ey2Var.e().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.by2
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        cy2.this.f6860e.f().f();
                    }
                });
                ey2Var.e().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yx2
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        cy2.this.f6860e.g().f();
                    }
                });
            }
            if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f6857b) == null) {
                e63 h8 = ey2Var.h();
                r53 r53Var = this.f6858c;
                r53Var.m0(rj1Var.h().f13137b);
                r53Var.c0(rj1Var.d().c());
                r53Var.e(true);
                h8.b(r53Var.n());
            } else {
                b63Var.e(rj1Var.h().f13137b);
                b63Var.g(rj1Var.d().c());
                r53 r53Var2 = this.f6858c;
                r53Var2.e(true);
                b63Var.a(r53Var2);
                b63Var.h();
            }
        }
    }
}
