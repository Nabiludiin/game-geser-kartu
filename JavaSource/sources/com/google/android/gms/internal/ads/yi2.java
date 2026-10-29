package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class yi2 implements ri2 {

    /* renamed from: a, reason: collision with root package name */
    private final v03 f19591a;

    /* renamed from: b, reason: collision with root package name */
    private final gu0 f19592b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19593c;

    /* renamed from: d, reason: collision with root package name */
    private final oi2 f19594d;

    /* renamed from: e, reason: collision with root package name */
    private final e63 f19595e;

    /* renamed from: f, reason: collision with root package name */
    private h51 f19596f;

    public yi2(gu0 gu0Var, Context context, oi2 oi2Var, v03 v03Var) {
        this.f19592b = gu0Var;
        this.f19593c = context;
        this.f19594d = oi2Var;
        this.f19591a = v03Var;
        this.f19595e = gu0Var.G();
        v03Var.S(oi2Var.c());
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean a(s2.b5 b5Var, String str, pi2 pi2Var, qi2 qi2Var) {
        r2.t.g();
        Context context = this.f19593c;
        if (v2.f2.l(context) && b5Var.I == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Failed to load the ad because app ID is missing.");
            this.f19592b.j().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xi2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    yi2.this.c();
                }
            });
            return false;
        }
        if (str == null) {
            int i8 = v2.n1.f26802b;
            w2.p.c("Ad unit ID should not be null for NativeAdLoader.");
            this.f19592b.j().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wi2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    yi2.this.d();
                }
            });
            return false;
        }
        boolean z7 = b5Var.f26061v;
        u13.b(context, z7);
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && z7) {
            this.f19592b.F().d(true);
        }
        int i9 = ((si2) pi2Var).f15636a;
        long a8 = r2.t.o().a();
        String c8 = yw1.PUBLIC_API_CALL.c();
        Long valueOf = Long.valueOf(a8);
        Bundle a9 = ax1.a(new Pair(c8, valueOf), new Pair(yw1.DYNAMITE_ENTER.c(), valueOf));
        v03 v03Var = this.f19591a;
        v03Var.z(b5Var);
        v03Var.U(a9);
        v03Var.K(i9);
        w03 Y = v03Var.Y();
        r53 b8 = q53.b(context, a63.g(Y), 8, b5Var);
        s2.l1 l1Var = Y.f17969o;
        if (l1Var != null) {
            this.f19594d.c().s(l1Var);
        }
        gu0 gu0Var = this.f19592b;
        vl1 w7 = gu0Var.w();
        d91 d91Var = new d91();
        d91Var.a(context);
        d91Var.b(Y);
        w7.e(d91Var.e());
        fg1 fg1Var = new fg1();
        oi2 oi2Var = this.f19594d;
        fg1Var.h(oi2Var.c(), gu0Var.j());
        w7.k(fg1Var.q());
        w7.r(oi2Var.b());
        b63 b63Var = null;
        w7.n(new e21(null));
        wl1 a10 = w7.a();
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            b63Var = a10.c();
            b63Var.i(8);
            b63Var.c(b5Var.F);
            b63Var.d(b5Var.C);
        }
        b63 b63Var2 = b63Var;
        gu0Var.E().a(1);
        z64 c9 = z33.c();
        ScheduledExecutorService k7 = gu0Var.k();
        w51 a11 = a10.a();
        h51 h51Var = new h51(c9, k7, a11.c(a11.b()));
        this.f19596f = h51Var;
        h51Var.a(new vi2(this, qi2Var, b63Var2, b8, a10));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean b() {
        h51 h51Var = this.f19596f;
        return h51Var != null && h51Var.b();
    }

    final /* synthetic */ void c() {
        this.f19594d.e().o(z13.d(4, null, null));
    }

    final /* synthetic */ void d() {
        this.f19594d.e().o(z13.d(6, null, null));
    }

    final /* synthetic */ gu0 e() {
        return this.f19592b;
    }

    final /* synthetic */ oi2 f() {
        return this.f19594d;
    }

    final /* synthetic */ e63 g() {
        return this.f19595e;
    }
}
