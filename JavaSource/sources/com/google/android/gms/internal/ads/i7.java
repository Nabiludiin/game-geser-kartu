package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class i7 implements f7 {

    /* renamed from: a, reason: collision with root package name */
    private final long f9854a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9855b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9856c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9857d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9858e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9859f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f9860g;

    private i7(long j7, int i7, long j8, int i8, long j9, long[] jArr) {
        this.f9854a = j7;
        this.f9855b = i7;
        this.f9856c = j8;
        this.f9857d = i8;
        this.f9858e = j9;
        this.f9860g = jArr;
        this.f9859f = j9 != -1 ? j7 + j9 : -1L;
    }

    public static i7 d(h7 h7Var, long j7) {
        long b8 = h7Var.b();
        if (b8 == -9223372036854775807L) {
            return null;
        }
        i3 i3Var = h7Var.f9354a;
        return new i7(j7, i3Var.f9817c, b8, i3Var.f9820f, h7Var.f9356c, h7Var.f9359f);
    }

    private final long h(int i7) {
        return (this.f9856c * i7) / 100;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f9856c;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return this.f9860g != null;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        if (!b()) {
            r3 r3Var = new r3(0L, this.f9854a + this.f9855b);
            return new o3(r3Var, r3Var);
        }
        long j8 = this.f9856c;
        String str = hi2.f9535a;
        long max = Math.max(0L, Math.min(j7, j8));
        double d8 = (max * 100.0d) / j8;
        double d9 = 0.0d;
        if (d8 > 0.0d) {
            if (d8 >= 100.0d) {
                d9 = 256.0d;
            } else {
                int i7 = (int) d8;
                long[] jArr = this.f9860g;
                jArr.getClass();
                double d10 = jArr[i7];
                d9 = d10 + ((d8 - i7) * ((i7 == 99 ? 256.0d : jArr[i7 + 1]) - d10));
            }
        }
        long j9 = this.f9858e;
        r3 r3Var2 = new r3(max, this.f9854a + Math.max(this.f9855b, Math.min(Math.round((d9 / 256.0d) * j9), j9 - 1)));
        return new o3(r3Var2, r3Var2);
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long e() {
        return this.f9859f;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final int f() {
        return this.f9857d;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long g(long j7) {
        if (!b()) {
            return 0L;
        }
        long j8 = j7 - this.f9854a;
        if (j8 <= this.f9855b) {
            return 0L;
        }
        long[] jArr = this.f9860g;
        jArr.getClass();
        double d8 = (j8 * 256.0d) / this.f9858e;
        int J = hi2.J(jArr, (long) d8, true, true);
        long h8 = h(J);
        long j9 = jArr[J];
        int i7 = J + 1;
        long h9 = h(i7);
        return h8 + Math.round((j9 == (J == 99 ? 256L : jArr[i7]) ? 0.0d : (d8 - j9) / (r0 - j9)) * (h9 - h8));
    }
}
