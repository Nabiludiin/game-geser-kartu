package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class i5 implements w4 {

    /* renamed from: a, reason: collision with root package name */
    private final z4 f21566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21567b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f21568c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21569d;

    i5(z4 z4Var, String str, Object[] objArr) {
        this.f21566a = z4Var;
        this.f21567b = str;
        this.f21568c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f21569d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f21569d = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w4
    public final z4 a() {
        return this.f21566a;
    }

    @Override // com.google.android.gms.internal.play_billing.w4
    public final boolean b() {
        return (this.f21569d & 2) == 2;
    }

    final String c() {
        return this.f21567b;
    }

    @Override // com.google.android.gms.internal.play_billing.w4
    public final int d() {
        int i7 = this.f21569d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    final Object[] e() {
        return this.f21568c;
    }
}
