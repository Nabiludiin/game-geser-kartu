package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class h15 implements s05 {

    /* renamed from: a, reason: collision with root package name */
    private final v05 f9287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9288b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f9289c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9290d;

    h15(v05 v05Var, String str, Object[] objArr) {
        this.f9287a = v05Var;
        this.f9288b = str;
        this.f9289c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9290d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f9290d = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s05
    public final boolean a() {
        return (this.f9290d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.s05
    public final v05 b() {
        return this.f9287a;
    }

    final String c() {
        return this.f9288b;
    }

    @Override // com.google.android.gms.internal.ads.s05
    public final int d() {
        int i7 = this.f9290d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    final Object[] e() {
        return this.f9289c;
    }
}
