package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ev2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qi2 f7834a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b63 f7835b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r53 f7836c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ fv2 f7837d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ iv2 f7838e;

    ev2(iv2 iv2Var, qi2 qi2Var, b63 b63Var, r53 r53Var, fv2 fv2Var) {
        this.f7834a = qi2Var;
        this.f7835b = b63Var;
        this.f7836c = r53Var;
        this.f7837d = fv2Var;
        Objects.requireNonNull(iv2Var);
        this.f7838e = iv2Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        b63 b63Var;
        if (((Boolean) s2.b0.c().d(uy.f17188q6)).booleanValue()) {
            v2.n1.l("App open ad failed to load", th);
        }
        iv2 iv2Var = this.f7838e;
        q11 q11Var = (q11) iv2Var.j().h();
        final s2.x2 b8 = q11Var == null ? z13.b(th, null) : q11Var.a().g(th);
        synchronized (iv2Var) {
            try {
                iv2Var.l(null);
                if (q11Var != null) {
                    q11Var.c().o(b8);
                    if (((Boolean) s2.b0.c().d(uy.b9)).booleanValue()) {
                        iv2Var.h().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cv2
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                ev2.this.f7838e.i().o(b8);
                            }
                        });
                    }
                } else {
                    iv2Var.i().o(b8);
                    ((q11) iv2Var.g(this.f7837d).g()).a().d().q();
                }
                u13.a(b8.f26259q, th, "AppOpenAdLoader.onFailure");
                this.f7834a.a();
                if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f7835b) == null) {
                    e63 k7 = iv2Var.k();
                    r53 r53Var = this.f7836c;
                    r53Var.l0(b8);
                    r53Var.j0(th);
                    r53Var.e(false);
                    k7.b(r53Var.n());
                } else {
                    b63Var.f(b8);
                    r53 r53Var2 = this.f7836c;
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
        iv2 iv2Var = this.f7838e;
        r41 r41Var = (r41) obj;
        synchronized (iv2Var) {
            if (r41Var != null) {
                try {
                    r41Var.j();
                } catch (Throwable th) {
                    throw th;
                }
            }
            iv2Var.l(null);
            if (((Boolean) s2.b0.c().d(uy.b9)).booleanValue()) {
                r41Var.g().c(iv2Var.i());
            }
            this.f7834a.b(r41Var);
            if (!((Boolean) p00.f13596c.e()).booleanValue() || (b63Var = this.f7835b) == null) {
                e63 k7 = iv2Var.k();
                r53 r53Var = this.f7836c;
                r53Var.m0(r41Var.h().f13137b);
                r53Var.c0(r41Var.d().c());
                r53Var.e(true);
                k7.b(r53Var.n());
            } else {
                b63Var.e(r41Var.h().f13137b);
                b63Var.g(r41Var.d().c());
                r53 r53Var2 = this.f7836c;
                r53Var2.e(true);
                b63Var.a(r53Var2);
                b63Var.h();
            }
        }
    }
}
