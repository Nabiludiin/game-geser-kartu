package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
final class ce implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final zd f6394a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6395b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6396c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6397d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6398e;

    public ce(zd zdVar, int i7, long j7, long j8) {
        this.f6394a = zdVar;
        this.f6395b = i7;
        this.f6396c = j7;
        long j9 = (j8 - j7) / zdVar.f20141d;
        this.f6397d = j9;
        this.f6398e = d(j9);
    }

    private final long d(long j7) {
        return hi2.Q(j7 * this.f6395b, 1000000L, this.f6394a.f20140c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f6398e;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        long j8 = this.f6395b;
        zd zdVar = this.f6394a;
        long j9 = (zdVar.f20140c * j7) / (j8 * 1000000);
        String str = hi2.f9535a;
        long j10 = this.f6397d - 1;
        long max = Math.max(0L, Math.min(j9, j10));
        long j11 = zdVar.f20141d;
        long d8 = d(max);
        long j12 = this.f6396c;
        r3 r3Var = new r3(d8, (max * j11) + j12);
        if (d8 >= j7 || max == j10) {
            return new o3(r3Var, r3Var);
        }
        long j13 = max + 1;
        return new o3(r3Var, new r3(d(j13), j12 + (j11 * j13)));
    }
}
