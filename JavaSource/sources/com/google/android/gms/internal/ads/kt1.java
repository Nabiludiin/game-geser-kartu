package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class kt1 implements r60 {

    /* renamed from: q, reason: collision with root package name */
    private final eb1 f11231q;

    /* renamed from: r, reason: collision with root package name */
    private final di0 f11232r;

    /* renamed from: s, reason: collision with root package name */
    private final String f11233s;

    /* renamed from: t, reason: collision with root package name */
    private final String f11234t;

    public kt1(eb1 eb1Var, c03 c03Var) {
        this.f11231q = eb1Var;
        this.f11232r = c03Var.f6172l;
        this.f11233s = c03Var.f6168j;
        this.f11234t = c03Var.f6170k;
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void a() {
        this.f11231q.W0();
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void d() {
        this.f11231q.e();
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void d0(di0 di0Var) {
        int i7;
        String str;
        di0 di0Var2 = this.f11232r;
        if (di0Var2 != null) {
            di0Var = di0Var2;
        }
        if (di0Var != null) {
            str = di0Var.f7114q;
            i7 = di0Var.f7115r;
        } else {
            i7 = 1;
            str = "";
        }
        this.f11231q.X0(new nh0(str, i7), this.f11233s, this.f11234t);
    }
}
