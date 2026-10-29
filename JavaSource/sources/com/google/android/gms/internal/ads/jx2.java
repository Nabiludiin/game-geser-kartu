package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class jx2 implements sx2 {

    /* renamed from: a, reason: collision with root package name */
    private final sx2 f10806a;

    /* renamed from: b, reason: collision with root package name */
    private c91 f10807b;

    public jx2(sx2 sx2Var) {
        this.f10806a = sx2Var;
    }

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* bridge */ /* synthetic */ a5.d a(tx2 tx2Var, rx2 rx2Var, Object obj) {
        return c(tx2Var, rx2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.sx2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized c91 h() {
        return this.f10807b;
    }

    public final synchronized a5.d c(tx2 tx2Var, rx2 rx2Var, c91 c91Var) {
        eh0 eh0Var;
        this.f10807b = c91Var;
        if (c91Var == null || (eh0Var = tx2Var.f16481a) == null) {
            return ((ix2) this.f10806a).c(tx2Var, rx2Var, c91Var);
        }
        w51 a8 = c91Var.a();
        return a8.c(a8.a(p64.a(eh0Var)));
    }
}
