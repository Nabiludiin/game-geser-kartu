package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class pb2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13778a;

    /* renamed from: b, reason: collision with root package name */
    private final n31 f13779b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13780c;

    public pb2(Context context, n31 n31Var, Executor executor) {
        this.f13778a = context;
        this.f13779b = n31Var;
        this.f13780c = executor;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        s2.g5 g5Var;
        w03 w03Var = o03Var.f13136a.f11326a;
        s2.g5 g5Var2 = w03Var.f17960f;
        if (g5Var2.D) {
            g5Var = new s2.g5(this.f13778a, k2.a0.b(g5Var2.f26099u, g5Var2.f26096r));
        } else {
            g5Var = (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && c03Var.f6163g0) ? new s2.g5(this.f13778a, k2.a0.c(g5Var2.f26099u, g5Var2.f26096r)) : c13.a(this.f13778a, c03Var.f6190u);
        }
        s2.g5 g5Var3 = g5Var;
        if (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && c03Var.f6163g0) {
            ((v13) na2Var.f12649b).g(this.f13778a, g5Var3, w03Var.f17958d, c03Var.f6192v.toString(), v2.r0.m(c03Var.f6186s), (qb0) na2Var.f12650c);
        } else {
            ((v13) na2Var.f12649b).l(this.f13778a, g5Var3, w03Var.f17958d, c03Var.f6192v.toString(), v2.r0.m(c03Var.f6186s), (qb0) na2Var.f12650c);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, final c03 c03Var, na2 na2Var) {
        final View f8;
        if (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && c03Var.f6163g0) {
            tb0 h8 = ((v13) na2Var.f12649b).h();
            if (h8 == null) {
                int i7 = v2.n1.f26802b;
                w2.p.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new d13(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                f8 = (View) w3.b.r0(h8.c());
                boolean e8 = h8.e();
                if (f8 == null) {
                    throw new d13(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (e8) {
                    try {
                        f8 = (View) p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.nb2
                            @Override // com.google.android.gms.internal.ads.w54
                            public final /* synthetic */ a5.d d(Object obj) {
                                return pb2.this.c(f8, c03Var, obj);
                            }
                        }, cm0.f6505f).get();
                    } catch (InterruptedException | ExecutionException e9) {
                        throw new d13(e9);
                    }
                }
            } catch (RemoteException e10) {
                throw new d13(e10);
            }
        } else {
            f8 = ((v13) na2Var.f12649b).f();
        }
        n31 n31Var = this.f13779b;
        i51 i51Var = new i51(o03Var, c03Var, na2Var.f12648a);
        final v13 v13Var = (v13) na2Var.f12649b;
        Objects.requireNonNull(v13Var);
        i21 e11 = n31Var.e(i51Var, new o21(f8, null, new p41() { // from class: com.google.android.gms.internal.ads.ob2
            @Override // com.google.android.gms.internal.ads.p41
            public final /* synthetic */ s2.b3 a() {
                return v13.this.y();
            }
        }, (d03) c03Var.f6190u.get(0)));
        e11.j().U0(f8);
        e11.a().y0(new sz0(v13Var), this.f13780c);
        ((ac2) na2Var.f12650c).k8(e11.f());
        return e11.h();
    }

    final /* synthetic */ a5.d c(View view, c03 c03Var, Object obj) {
        return p64.a(d41.a(this.f13778a, view, c03Var));
    }
}
