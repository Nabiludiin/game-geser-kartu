package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class yf4 extends xf4 {

    /* renamed from: d, reason: collision with root package name */
    private final long[] f19553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yf4(bg4 bg4Var) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.f19553d = jArr;
        long[] jArr2 = this.f18802a;
        ag4 ag4Var = bg4Var.f5764a;
        jg4.a(jArr2, ag4Var.f4945b, ag4Var.f4944a);
        long[] jArr3 = this.f18803b;
        ag4 ag4Var2 = bg4Var.f5764a;
        jg4.b(jArr3, ag4Var2.f4945b, ag4Var2.f4944a);
        System.arraycopy(bg4Var.f5764a.f4946c, 0, jArr, 0, 10);
        jg4.e(this.f18804c, bg4Var.f5765b, eg4.f7613b);
    }

    @Override // com.google.android.gms.internal.ads.xf4
    public final void a(long[] jArr, long[] jArr2) {
        jg4.e(jArr, jArr2, this.f19553d);
    }
}
