package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class ux2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17037a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f17038b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f17039c;

    private ux2(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f17037a = w85Var;
        this.f17038b = w85Var2;
        this.f17039c = w85Var3;
    }

    public static ux2 c(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new ux2(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sx2 b() {
        Context context = (Context) this.f17037a.b();
        i23 i23Var = (i23) this.f17038b.b();
        b33 b33Var = (b33) this.f17039c.b();
        ll0 j7 = ((Boolean) s2.b0.c().d(uy.Q6)).booleanValue() ? r2.t.l().q().j() : r2.t.l().q().i();
        boolean z7 = false;
        if (j7 != null && j7.i()) {
            z7 = true;
        }
        if (((Integer) s2.b0.c().d(uy.f17107g7)).intValue() > 0) {
            if (!((Boolean) s2.b0.c().d(uy.P6)).booleanValue() || z7) {
                a33 a8 = b33Var.a(r23.AppOpen, context, i23Var, new uw2(new tw2()));
                jx2 jx2Var = new jx2(new ix2());
                n23 n23Var = a8.f4710a;
                z64 z64Var = cm0.f6500a;
                return new yw2(jx2Var, new ex2(n23Var, z64Var), a8.f4711b, n23Var.c().f16558x, z64Var);
            }
        }
        return new ix2();
    }
}
