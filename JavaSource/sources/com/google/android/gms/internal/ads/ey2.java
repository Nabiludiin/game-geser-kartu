package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ey2 implements ri2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7867a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7868b;

    /* renamed from: c, reason: collision with root package name */
    private final gu0 f7869c;

    /* renamed from: d, reason: collision with root package name */
    private final ai2 f7870d;

    /* renamed from: e, reason: collision with root package name */
    private final fz2 f7871e;

    /* renamed from: f, reason: collision with root package name */
    private qz f7872f;

    /* renamed from: g, reason: collision with root package name */
    private final e63 f7873g;

    /* renamed from: h, reason: collision with root package name */
    private final v03 f7874h;

    /* renamed from: i, reason: collision with root package name */
    private a5.d f7875i;

    public ey2(Context context, Executor executor, gu0 gu0Var, ai2 ai2Var, fz2 fz2Var, v03 v03Var) {
        this.f7867a = context;
        this.f7868b = executor;
        this.f7869c = gu0Var;
        this.f7870d = ai2Var;
        this.f7874h = v03Var;
        this.f7871e = fz2Var;
        this.f7873g = gu0Var.G();
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean a(s2.b5 b5Var, String str, pi2 pi2Var, qi2 qi2Var) {
        al1 a8;
        b63 b63Var;
        if (str == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Ad unit ID should not be null for interstitial ad.");
            this.f7868b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dy2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ey2.this.d();
                }
            });
            return false;
        }
        if (b()) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && b5Var.f26061v) {
            this.f7869c.F().d(true);
        }
        s2.g5 g5Var = ((xx2) pi2Var).f19286a;
        Bundle a9 = ax1.a(new Pair(yw1.PUBLIC_API_CALL.c(), Long.valueOf(b5Var.P)), new Pair(yw1.DYNAMITE_ENTER.c(), Long.valueOf(r2.t.o().a())));
        v03 v03Var = this.f7874h;
        v03Var.F(str);
        v03Var.B(g5Var);
        v03Var.z(b5Var);
        v03Var.U(a9);
        Context context = this.f7867a;
        w03 Y = v03Var.Y();
        r53 b8 = q53.b(context, a63.g(Y), 4, b5Var);
        if (((Boolean) s2.b0.c().d(uy.c9)).booleanValue()) {
            zk1 u7 = this.f7869c.u();
            d91 d91Var = new d91();
            d91Var.a(context);
            d91Var.b(Y);
            u7.f(d91Var.e());
            fg1 fg1Var = new fg1();
            ai2 ai2Var = this.f7870d;
            Executor executor = this.f7868b;
            fg1Var.p(ai2Var, executor);
            fg1Var.h(ai2Var, executor);
            u7.m(fg1Var.q());
            u7.t(new gg2(this.f7872f));
            a8 = u7.a();
        } else {
            fg1 fg1Var2 = new fg1();
            fz2 fz2Var = this.f7871e;
            if (fz2Var != null) {
                Executor executor2 = this.f7868b;
                fg1Var2.d(fz2Var, executor2);
                fg1Var2.e(fz2Var, executor2);
                fg1Var2.f(fz2Var, executor2);
            }
            zk1 u8 = this.f7869c.u();
            d91 d91Var2 = new d91();
            d91Var2.a(context);
            d91Var2.b(Y);
            u8.f(d91Var2.e());
            ai2 ai2Var2 = this.f7870d;
            Executor executor3 = this.f7868b;
            fg1Var2.p(ai2Var2, executor3);
            fg1Var2.d(ai2Var2, executor3);
            fg1Var2.e(ai2Var2, executor3);
            fg1Var2.f(ai2Var2, executor3);
            fg1Var2.i(ai2Var2, executor3);
            fg1Var2.j(ai2Var2, executor3);
            fg1Var2.h(ai2Var2, executor3);
            fg1Var2.n(ai2Var2, executor3);
            fg1Var2.g(ai2Var2, executor3);
            u8.m(fg1Var2.q());
            u8.t(new gg2(this.f7872f));
            a8 = u8.a();
        }
        al1 al1Var = a8;
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            b63Var = al1Var.c();
            b63Var.i(4);
            b63Var.c(b5Var.F);
            b63Var.d(b5Var.C);
        } else {
            b63Var = null;
        }
        b63 b63Var2 = b63Var;
        w51 b9 = al1Var.b();
        a5.d c8 = b9.c(b9.b());
        this.f7875i = c8;
        p64.r(c8, new cy2(this, qi2Var, b63Var2, b8, al1Var), this.f7868b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean b() {
        a5.d dVar = this.f7875i;
        return (dVar == null || dVar.isDone()) ? false : true;
    }

    public final void c(qz qzVar) {
        this.f7872f = qzVar;
    }

    final /* synthetic */ void d() {
        this.f7870d.o(z13.d(6, null, null));
    }

    final /* synthetic */ Executor e() {
        return this.f7868b;
    }

    final /* synthetic */ ai2 f() {
        return this.f7870d;
    }

    final /* synthetic */ fz2 g() {
        return this.f7871e;
    }

    final /* synthetic */ e63 h() {
        return this.f7873g;
    }

    final /* synthetic */ void i(a5.d dVar) {
        this.f7875i = null;
    }
}
