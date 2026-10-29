package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ix2 implements sx2 {

    /* renamed from: a, reason: collision with root package name */
    private c91 f10256a;

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* bridge */ /* synthetic */ a5.d a(tx2 tx2Var, rx2 rx2Var, Object obj) {
        return c(tx2Var, rx2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.sx2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized c91 h() {
        return this.f10256a;
    }

    public final synchronized a5.d c(tx2 tx2Var, rx2 rx2Var, c91 c91Var) {
        w51 a8;
        try {
            if (c91Var != null) {
                this.f10256a = c91Var;
            } else {
                this.f10256a = (c91) rx2Var.a(tx2Var.f16482b).g();
            }
            a8 = this.f10256a.a();
        } catch (Throwable th) {
            throw th;
        }
        return a8.c(a8.b());
    }
}
