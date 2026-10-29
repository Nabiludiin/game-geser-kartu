package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
public final class yf2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19548a;

    /* renamed from: b, reason: collision with root package name */
    private final n31 f19549b;

    /* renamed from: c, reason: collision with root package name */
    private final qz f19550c;

    /* renamed from: d, reason: collision with root package name */
    private final z64 f19551d;

    /* renamed from: e, reason: collision with root package name */
    private final f53 f19552e;

    public yf2(Context context, n31 n31Var, f53 f53Var, z64 z64Var, qz qzVar) {
        this.f19548a = context;
        this.f19549b = n31Var;
        this.f19552e = f53Var;
        this.f19551d = z64Var;
        this.f19550c = qzVar;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        h03 h03Var;
        return (this.f19550c == null || (h03Var = c03Var.f6186s) == null || h03Var.f9277a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(o03 o03Var, c03 c03Var) {
        uf2 uf2Var = new uf2(this, new View(this.f19548a), null, wf2.f18240a, (d03) c03Var.f6190u.get(0));
        i21 e8 = this.f19549b.e(new i51(o03Var, c03Var, null), uf2Var);
        xf2 k7 = e8.k();
        h03 h03Var = c03Var.f6186s;
        final lz lzVar = new lz(k7, h03Var.f9278b, h03Var.f9277a);
        z43 z43Var = z43.CUSTOM_RENDER_SYN;
        f53 f53Var = this.f19552e;
        Objects.requireNonNull(f53Var);
        return q43.d(new k43() { // from class: com.google.android.gms.internal.ads.vf2
            @Override // com.google.android.gms.internal.ads.k43
            public final /* synthetic */ void a() {
                yf2.this.c(lzVar);
            }
        }, this.f19551d, z43Var, f53Var).j(z43.CUSTOM_RENDER_ACK).e(p64.a(e8.h())).i();
    }

    final /* synthetic */ void c(lz lzVar) {
        this.f19550c.N5(lzVar);
    }
}
