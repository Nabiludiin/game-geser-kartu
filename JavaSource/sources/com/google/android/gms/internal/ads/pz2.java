package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class pz2 implements ri2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14167a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14168b;

    /* renamed from: c, reason: collision with root package name */
    private final gu0 f14169c;

    /* renamed from: d, reason: collision with root package name */
    private final fz2 f14170d;

    /* renamed from: e, reason: collision with root package name */
    private final sx2 f14171e;

    /* renamed from: f, reason: collision with root package name */
    private final p03 f14172f;

    /* renamed from: g, reason: collision with root package name */
    private final e63 f14173g;

    /* renamed from: h, reason: collision with root package name */
    private final v03 f14174h;

    /* renamed from: i, reason: collision with root package name */
    private a5.d f14175i;

    public pz2(Context context, Executor executor, gu0 gu0Var, sx2 sx2Var, fz2 fz2Var, v03 v03Var, p03 p03Var) {
        this.f14167a = context;
        this.f14168b = executor;
        this.f14169c = gu0Var;
        this.f14171e = sx2Var;
        this.f14170d = fz2Var;
        this.f14174h = v03Var;
        this.f14172f = p03Var;
        this.f14173g = gu0Var.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final rt1 e(qx2 qx2Var) {
        rt1 x7 = this.f14169c.x();
        d91 d91Var = new d91();
        d91Var.a(this.f14167a);
        d91Var.b(((oz2) qx2Var).f13559a);
        d91Var.f(this.f14172f);
        x7.b(d91Var.e());
        x7.c(new fg1().q());
        return x7;
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean a(s2.b5 b5Var, String str, pi2 pi2Var, qi2 qi2Var) {
        b63 b63Var;
        yh0 yh0Var = new yh0(b5Var, str);
        String str2 = yh0Var.f19585r;
        if (str2 == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Ad unit ID should not be null for rewarded video ad.");
            this.f14168b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nz2
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    pz2.this.c();
                }
            });
            return false;
        }
        a5.d dVar = this.f14175i;
        if (dVar != null && !dVar.isDone()) {
            return false;
        }
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            sx2 sx2Var = this.f14171e;
            if (sx2Var.h() != null) {
                b63 h8 = ((st1) sx2Var.h()).h();
                h8.i(5);
                s2.b5 b5Var2 = yh0Var.f19584q;
                h8.c(b5Var2.F);
                h8.d(b5Var2.C);
                b63Var = h8;
                Context context = this.f14167a;
                s2.b5 b5Var3 = yh0Var.f19584q;
                boolean z7 = b5Var3.f26061v;
                u13.b(context, z7);
                if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && z7) {
                    this.f14169c.F().d(true);
                }
                Bundle a8 = ax1.a(new Pair(yw1.PUBLIC_API_CALL.c(), Long.valueOf(b5Var3.P)), new Pair(yw1.DYNAMITE_ENTER.c(), Long.valueOf(r2.t.o().a())));
                v03 v03Var = this.f14174h;
                v03Var.F(str2);
                v03Var.B(s2.g5.O0());
                v03Var.z(b5Var3);
                v03Var.U(a8);
                w03 Y = v03Var.Y();
                r53 b8 = q53.b(context, a63.g(Y), 5, b5Var3);
                oz2 oz2Var = new oz2(null);
                oz2Var.f13559a = Y;
                a5.d a9 = this.f14171e.a(new tx2(oz2Var, null), new rx2() { // from class: com.google.android.gms.internal.ads.mz2
                    @Override // com.google.android.gms.internal.ads.rx2
                    public final /* synthetic */ b91 a(qx2 qx2Var) {
                        return pz2.this.d(qx2Var);
                    }
                }, null);
                this.f14175i = a9;
                p64.r(a9, new lz2(this, qi2Var, b63Var, b8, oz2Var), this.f14168b);
                return true;
            }
        }
        b63Var = null;
        Context context2 = this.f14167a;
        s2.b5 b5Var32 = yh0Var.f19584q;
        boolean z72 = b5Var32.f26061v;
        u13.b(context2, z72);
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue()) {
            this.f14169c.F().d(true);
        }
        Bundle a82 = ax1.a(new Pair(yw1.PUBLIC_API_CALL.c(), Long.valueOf(b5Var32.P)), new Pair(yw1.DYNAMITE_ENTER.c(), Long.valueOf(r2.t.o().a())));
        v03 v03Var2 = this.f14174h;
        v03Var2.F(str2);
        v03Var2.B(s2.g5.O0());
        v03Var2.z(b5Var32);
        v03Var2.U(a82);
        w03 Y2 = v03Var2.Y();
        r53 b82 = q53.b(context2, a63.g(Y2), 5, b5Var32);
        oz2 oz2Var2 = new oz2(null);
        oz2Var2.f13559a = Y2;
        a5.d a92 = this.f14171e.a(new tx2(oz2Var2, null), new rx2() { // from class: com.google.android.gms.internal.ads.mz2
            @Override // com.google.android.gms.internal.ads.rx2
            public final /* synthetic */ b91 a(qx2 qx2Var) {
                return pz2.this.d(qx2Var);
            }
        }, null);
        this.f14175i = a92;
        p64.r(a92, new lz2(this, qi2Var, b63Var, b82, oz2Var2), this.f14168b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ri2
    public final boolean b() {
        throw null;
    }

    final /* synthetic */ void c() {
        this.f14170d.o(z13.d(6, null, null));
    }

    final /* synthetic */ Executor f() {
        return this.f14168b;
    }

    final /* synthetic */ fz2 g() {
        return this.f14170d;
    }

    final /* synthetic */ sx2 h() {
        return this.f14171e;
    }

    final /* synthetic */ e63 i() {
        return this.f14173g;
    }

    final void j(int i7) {
        this.f14174h.I().a(i7);
    }
}
