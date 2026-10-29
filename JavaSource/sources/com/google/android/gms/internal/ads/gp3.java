package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class gp3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9067a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9068b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f9069c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f9070d;

    private gp3(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        this.f9067a = w85Var;
        this.f9068b = w85Var2;
        this.f9069c = w85Var3;
        this.f9070d = w85Var4;
    }

    public static gp3 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4) {
        return new gp3(w85Var, w85Var2, w85Var3, w85Var4);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        w85 w85Var = this.f9070d;
        w85 w85Var2 = this.f9069c;
        w85 w85Var3 = this.f9068b;
        h85 c8 = m85.c(this.f9067a);
        h85 c9 = m85.c(w85Var3);
        h85 c10 = m85.c(w85Var2);
        li3 li3Var = (li3) w85Var.b();
        return new fp3(c8, c9, c10, li3Var.o0().d0(), li3Var.o0().g0());
    }
}
