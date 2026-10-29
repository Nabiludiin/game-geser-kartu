package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class u7 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f16610a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16611b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16612c;

    /* renamed from: d, reason: collision with root package name */
    private int f16613d;

    /* renamed from: e, reason: collision with root package name */
    private int f16614e;

    public u7(ro2 ro2Var) {
        y82 y82Var = ro2Var.f15139b;
        this.f16610a = y82Var;
        y82Var.G(12);
        this.f16612c = y82Var.h() & 255;
        this.f16611b = y82Var.h();
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final int a() {
        return this.f16611b;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final int b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final int d() {
        int i7 = this.f16612c;
        if (i7 == 8) {
            return this.f16610a.R();
        }
        if (i7 == 16) {
            return this.f16610a.S();
        }
        int i8 = this.f16613d;
        this.f16613d = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f16614e & 15;
        }
        int R = this.f16610a.R();
        this.f16614e = R;
        return (R & 240) >> 4;
    }
}
