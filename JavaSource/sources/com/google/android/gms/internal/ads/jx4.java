package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: MyApplication */
public final class jx4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f10809a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10810b;

    /* renamed from: c, reason: collision with root package name */
    private long f10811c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f10812d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f10814f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f10815g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f10818j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f10817i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f10819k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f10820l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f10813e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f10816h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f10821m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f10822n = -9223372036854775807L;

    /* synthetic */ jx4(float f8, float f9, long j7, float f10, long j8, long j9, float f11, byte[] bArr) {
        this.f10809a = j8;
        this.f10810b = j9;
    }

    private final void f() {
        long j7;
        long j8 = this.f10811c;
        if (j8 != -9223372036854775807L) {
            j7 = this.f10812d;
            if (j7 == -9223372036854775807L) {
                long j9 = this.f10814f;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j7 = this.f10815g;
                if (j7 == -9223372036854775807L || j8 <= j7) {
                    j7 = j8;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f10813e == j7) {
            return;
        }
        this.f10813e = j7;
        this.f10816h = j7;
        this.f10821m = -9223372036854775807L;
        this.f10822n = -9223372036854775807L;
        this.f10820l = -9223372036854775807L;
    }

    private static long g(long j7, long j8, float f8) {
        return (long) ((j7 * 0.999f) + (j8 * 9.999871E-4f));
    }

    public final void a(n4 n4Var) {
        long j7 = n4Var.f12563a;
        this.f10811c = hi2.N(-9223372036854775807L);
        this.f10814f = hi2.N(-9223372036854775807L);
        this.f10815g = hi2.N(-9223372036854775807L);
        this.f10818j = 0.97f;
        this.f10817i = 1.03f;
        f();
    }

    public final void b(long j7) {
        this.f10812d = j7;
        f();
    }

    public final void c() {
        long j7 = this.f10816h;
        if (j7 == -9223372036854775807L) {
            return;
        }
        long j8 = j7 + this.f10810b;
        this.f10816h = j8;
        long j9 = this.f10815g;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.f10816h = j9;
        }
        this.f10820l = -9223372036854775807L;
    }

    public final float d(long j7, long j8) {
        long j9;
        if (this.f10811c == -9223372036854775807L) {
            return 1.0f;
        }
        long j10 = j7 - j8;
        long j11 = this.f10821m;
        if (j11 == -9223372036854775807L) {
            this.f10821m = j10;
            this.f10822n = 0L;
        } else {
            long max = Math.max(j10, g(j11, j10, 0.999f));
            this.f10821m = max;
            this.f10822n = g(this.f10822n, Math.abs(j10 - max), 0.999f);
        }
        if (this.f10820l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f10820l < 1000) {
            return this.f10819k;
        }
        this.f10820l = SystemClock.elapsedRealtime();
        long j12 = this.f10821m + (this.f10822n * 3);
        if (this.f10816h > j12) {
            float N = hi2.N(1000L);
            long[] jArr = {j12, this.f10813e, this.f10816h - (((long) ((this.f10819k - 1.0f) * N)) + ((long) ((this.f10817i - 1.0f) * N)))};
            j9 = jArr[0];
            for (int i7 = 1; i7 < 3; i7++) {
                long j13 = jArr[i7];
                if (j13 > j9) {
                    j9 = j13;
                }
            }
            this.f10816h = j9;
        } else {
            long max2 = j7 - ((long) (Math.max(0.0f, this.f10819k - 1.0f) / 1.0E-7f));
            long j14 = this.f10816h;
            String str = hi2.f9535a;
            long max3 = Math.max(j14, Math.min(max2, j12));
            this.f10816h = max3;
            long j15 = this.f10815g;
            if (j15 == -9223372036854775807L || max3 <= j15) {
                j9 = max3;
            } else {
                this.f10816h = j15;
                j9 = j15;
            }
        }
        long j16 = j7 - j9;
        if (Math.abs(j16) < this.f10809a) {
            this.f10819k = 1.0f;
            return 1.0f;
        }
        float max4 = Math.max(this.f10818j, Math.min((j16 * 1.0E-7f) + 1.0f, this.f10817i));
        this.f10819k = max4;
        return max4;
    }

    public final long e() {
        return this.f10816h;
    }
}
