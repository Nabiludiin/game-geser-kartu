package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class lz2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qi2 f11949a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b63 f11950b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r53 f11951c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ oz2 f11952d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ pz2 f11953e;

    lz2(pz2 pz2Var, qi2 qi2Var, b63 b63Var, r53 r53Var, oz2 oz2Var) {
        this.f11949a = qi2Var;
        this.f11950b = b63Var;
        this.f11951c = r53Var;
        this.f11952d = oz2Var;
        Objects.requireNonNull(pz2Var);
        this.f11953e = pz2Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        b63 b63Var;
        if (((Boolean) s2.b0.c().d(uy.f17188q6)).booleanValue()) {
            v2.n1.l("Rewarded ad failed to load", th);
        }
        pz2 pz2Var = this.f11953e;
        st1 st1Var = (st1) pz2Var.h().h();
        final s2.x2 b8 = st1Var == null ? z13.b(th, null) : st1Var.a().g(th);
        synchronized (pz2Var) {
            try {
                if (st1Var != null) {
                    st1Var.c().o(b8);
                    pz2Var.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.kz2
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            lz2.this.f11953e.g().o(b8);
                        }
                    });
                } else {
                    pz2Var.g().o(b8);
                    pz2Var.e(this.f11952d).g().a().d().q();
                }
                u13.a(b8.f26259q, th, "RewardedAdLoader.onFailure");
                this.f11949a.a();
                if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f11950b) == null) {
                    e63 i7 = pz2Var.i();
                    r53 r53Var = this.f11951c;
                    r53Var.l0(b8);
                    r53Var.j0(th);
                    r53Var.e(false);
                    i7.b(r53Var.n());
                } else {
                    b63Var.f(b8);
                    r53 r53Var2 = this.f11951c;
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
        pz2 pz2Var = this.f11953e;
        nt1 nt1Var = (nt1) obj;
        synchronized (pz2Var) {
            if (nt1Var != null) {
                try {
                    nt1Var.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            nt1Var.g().d(pz2Var.g());
            this.f11949a.b(nt1Var);
            Executor f8 = pz2Var.f();
            final fz2 g8 = pz2Var.g();
            Objects.requireNonNull(g8);
            f8.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jz2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    fz2.this.f();
                }
            });
            pz2Var.g().d();
            if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f11950b) == null) {
                e63 i7 = pz2Var.i();
                r53 r53Var = this.f11951c;
                r53Var.m0(nt1Var.h().f13137b);
                r53Var.c0(nt1Var.d().c());
                r53Var.e(true);
                i7.b(r53Var.n());
            } else {
                b63Var.e(nt1Var.h().f13137b);
                b63Var.g(nt1Var.d().c());
                r53 r53Var2 = this.f11951c;
                r53Var2.e(true);
                b63Var.a(r53Var2);
                b63Var.h();
            }
        }
    }
}
