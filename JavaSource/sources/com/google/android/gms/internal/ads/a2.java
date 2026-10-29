package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class a2 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f4688a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4689b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4690c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4691d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4692e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4693f;

    public a2(long j7, long j8, int i7, int i8, boolean z7) {
        long h8;
        this.f4688a = j7;
        this.f4689b = j8;
        this.f4690c = i8 == -1 ? 1 : i8;
        this.f4692e = i7;
        if (j7 == -1) {
            this.f4691d = -1L;
            h8 = -9223372036854775807L;
        } else {
            this.f4691d = j7 - j8;
            h8 = h(j7, j8, i7);
        }
        this.f4693f = h8;
    }

    private static long h(long j7, long j8, int i7) {
        return (Math.max(0L, j7 - j8) * 8000000) / i7;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f4693f;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return this.f4691d != -1;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        long j8 = this.f4691d;
        if (j8 == -1) {
            r3 r3Var = new r3(0L, this.f4689b);
            return new o3(r3Var, r3Var);
        }
        long j9 = this.f4690c;
        long j10 = (((this.f4692e * j7) / 8000000) / j9) * j9;
        if (j8 != -1) {
            j10 = Math.min(j10, j8 - j9);
        }
        long max = this.f4689b + Math.max(j10, 0L);
        long d8 = d(max);
        r3 r3Var2 = new r3(d8, max);
        if (j8 != -1 && d8 < j7) {
            long j11 = max + j9;
            if (j11 < this.f4688a) {
                return new o3(r3Var2, new r3(d(j11), j11));
            }
        }
        return new o3(r3Var2, r3Var2);
    }

    public final long d(long j7) {
        return h(j7, this.f4689b, this.f4692e);
    }
}
