package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class hc implements ub {

    /* renamed from: a, reason: collision with root package name */
    private final xb f21017a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21018b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f21019c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21020d;

    hc(xb xbVar, String str, Object[] objArr) {
        this.f21017a = xbVar;
        this.f21018b = str;
        this.f21019c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f21020d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.f21020d = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ub
    public final boolean a() {
        return (this.f21020d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.ub
    public final xb b() {
        return this.f21017a;
    }

    final String c() {
        return this.f21018b;
    }

    @Override // com.google.android.gms.internal.measurement.ub
    public final int d() {
        int i7 = this.f21020d;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    final Object[] e() {
        return this.f21019c;
    }
}
