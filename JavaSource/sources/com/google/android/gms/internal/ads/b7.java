package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: MyApplication */
final class b7 implements f7 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f5605a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f5606b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5607c;

    private b7(long[] jArr, long[] jArr2, long j7) {
        this.f5605a = jArr;
        this.f5606b = jArr2;
        this.f5607c = j7 == -9223372036854775807L ? hi2.N(jArr2[jArr2.length - 1]) : j7;
    }

    public static b7 d(long j7, g6 g6Var, long j8) {
        int length = g6Var.f8660e.length;
        int i7 = length + 1;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        jArr[0] = j7;
        long j9 = 0;
        jArr2[0] = 0;
        for (int i8 = 1; i8 <= length; i8++) {
            int i9 = i8 - 1;
            j7 += g6Var.f8658c + r0[i9];
            j9 += g6Var.f8659d + g6Var.f8661f[i9];
            jArr[i8] = j7;
            jArr2[i8] = j9;
        }
        return new b7(jArr, jArr2, j8);
    }

    private static Pair h(long j7, long[] jArr, long[] jArr2) {
        int J = hi2.J(jArr, j7, true, true);
        long j8 = jArr[J];
        long j9 = jArr2[J];
        int i7 = J + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((jArr[i7] == j8 ? 0.0d : (j7 - j8) / (r6 - j8)) * (jArr2[i7] - j9))) + j9));
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f5607c;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        String str = hi2.f9535a;
        Pair h8 = h(hi2.M(Math.max(0L, Math.min(j7, this.f5607c))), this.f5606b, this.f5605a);
        r3 r3Var = new r3(hi2.N(((Long) h8.first).longValue()), ((Long) h8.second).longValue());
        return new o3(r3Var, r3Var);
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long e() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final int f() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long g(long j7) {
        return hi2.N(((Long) h(j7, this.f5605a, this.f5606b).second).longValue());
    }
}
