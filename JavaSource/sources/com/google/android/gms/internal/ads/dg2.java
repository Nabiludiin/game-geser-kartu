package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class dg2 implements ka2 {

    /* renamed from: a, reason: collision with root package name */
    private final qz f7097a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f7098b;

    /* renamed from: c, reason: collision with root package name */
    private final f53 f7099c;

    /* renamed from: d, reason: collision with root package name */
    private final ng2 f7100d;

    public dg2(f53 f53Var, z64 z64Var, qz qzVar, ng2 ng2Var) {
        this.f7099c = f53Var;
        this.f7098b = z64Var;
        this.f7097a = qzVar;
        this.f7100d = ng2Var;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        h03 h03Var;
        return (this.f7097a == null || (h03Var = c03Var.f6186s) == null || h03Var.f9277a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(o03 o03Var, c03 c03Var) {
        im0 im0Var = new im0();
        jg2 jg2Var = new jg2();
        jg2Var.c(new bg2(this, im0Var, o03Var, c03Var, jg2Var));
        h03 h03Var = c03Var.f6186s;
        final lz lzVar = new lz(jg2Var, h03Var.f9278b, h03Var.f9277a);
        z43 z43Var = z43.CUSTOM_RENDER_SYN;
        f53 f53Var = this.f7099c;
        Objects.requireNonNull(f53Var);
        return q43.d(new k43() { // from class: com.google.android.gms.internal.ads.cg2
            @Override // com.google.android.gms.internal.ads.k43
            public final /* synthetic */ void a() {
                dg2.this.c(lzVar);
            }
        }, this.f7098b, z43Var, f53Var).j(z43.CUSTOM_RENDER_ACK).e(im0Var).i();
    }

    final /* synthetic */ void c(lz lzVar) {
        this.f7097a.N5(lzVar);
    }

    final /* synthetic */ ng2 d() {
        return this.f7100d;
    }
}
