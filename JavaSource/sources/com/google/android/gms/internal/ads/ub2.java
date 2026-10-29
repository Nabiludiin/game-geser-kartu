package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* compiled from: MyApplication */
public final class ub2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16681a;

    /* renamed from: b, reason: collision with root package name */
    private final n31 f16682b;

    /* renamed from: c, reason: collision with root package name */
    private View f16683c;

    /* renamed from: d, reason: collision with root package name */
    private tb0 f16684d;

    public ub2(Context context, n31 n31Var) {
        this.f16681a = context;
        this.f16682b = n31Var;
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            id0 id0Var = (id0) na2Var.f12649b;
            id0Var.O0(c03Var.Z);
            if (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && c03Var.f6163g0) {
                String str = c03Var.U;
                String jSONObject = c03Var.f6192v.toString();
                w03 w03Var = o03Var.f13136a.f11326a;
                id0Var.g5(str, jSONObject, w03Var.f17958d, w3.b.C1(this.f16681a), new tb2(this, na2Var, null), (qb0) na2Var.f12650c, w03Var.f17960f);
                return;
            }
            String str2 = c03Var.U;
            String jSONObject2 = c03Var.f6192v.toString();
            w03 w03Var2 = o03Var.f13136a.f11326a;
            id0Var.F4(str2, jSONObject2, w03Var2.f17958d, w3.b.C1(this.f16681a), new tb2(this, na2Var, null), (qb0) na2Var.f12650c, w03Var2.f17960f);
        } catch (RemoteException e8) {
            throw new d13(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, final c03 c03Var, final na2 na2Var) {
        final View view;
        if (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && c03Var.f6163g0) {
            try {
                view = (View) w3.b.r0(this.f16684d.c());
                boolean e8 = this.f16684d.e();
                if (view == null) {
                    throw new d13(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (e8) {
                    try {
                        view = (View) p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.rb2
                            @Override // com.google.android.gms.internal.ads.w54
                            public final /* synthetic */ a5.d d(Object obj) {
                                return ub2.this.c(view, c03Var, obj);
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
            view = this.f16683c;
        }
        i21 e11 = this.f16682b.e(new i51(o03Var, c03Var, na2Var.f12648a), new o21(view, null, new p41() { // from class: com.google.android.gms.internal.ads.sb2
            @Override // com.google.android.gms.internal.ads.p41
            public final /* synthetic */ s2.b3 a() {
                try {
                    return ((id0) na2.this.f12649b).g();
                } catch (RemoteException e12) {
                    throw new d13(e12);
                }
            }
        }, (d03) c03Var.f6190u.get(0)));
        e11.j().U0(view);
        ((ac2) na2Var.f12650c).k8(e11.g());
        return e11.h();
    }

    final /* synthetic */ a5.d c(View view, c03 c03Var, Object obj) {
        return p64.a(d41.a(this.f16681a, view, c03Var));
    }

    final /* synthetic */ void d(View view) {
        this.f16683c = view;
    }

    final /* synthetic */ void e(tb0 tb0Var) {
        this.f16684d = tb0Var;
    }
}
