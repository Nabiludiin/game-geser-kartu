package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ws5 extends pt5 implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    private final int f18414u;

    /* renamed from: v, reason: collision with root package name */
    private final int f18415v;

    public ws5(int i7, b00 b00Var, int i8, zs5 zs5Var, int i9) {
        super(i7, b00Var, i8);
        this.f18414u = rc5.a(i9, zs5Var.U) ? 1 : 0;
        this.f18415v = this.f14107t.c();
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final int a() {
        return this.f18414u;
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final /* bridge */ /* synthetic */ boolean c(pt5 pt5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ws5 ws5Var) {
        return Integer.compare(this.f18415v, ws5Var.f18415v);
    }
}
