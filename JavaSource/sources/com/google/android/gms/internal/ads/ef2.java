package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
public final class ef2 {

    /* renamed from: a, reason: collision with root package name */
    private long f7595a;

    /* renamed from: b, reason: collision with root package name */
    private long f7596b;

    /* renamed from: c, reason: collision with root package name */
    private long f7597c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f7598d = new ThreadLocal();

    public ef2(long j7) {
        d(0L);
    }

    public static long i(long j7) {
        return hi2.Q(j7, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long j(long j7) {
        return hi2.Q(j7, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long a() {
        long j7 = this.f7595a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j7;
    }

    public final synchronized long b() {
        long j7;
        try {
            j7 = this.f7597c;
        } catch (Throwable th) {
            throw th;
        }
        return j7 != -9223372036854775807L ? j7 + this.f7596b : a();
    }

    public final synchronized long c() {
        return this.f7596b;
    }

    public final synchronized void d(long j7) {
        this.f7595a = j7;
        this.f7596b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f7597c = -9223372036854775807L;
    }

    public final synchronized long e(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j8 = this.f7597c;
            if (j8 != -9223372036854775807L) {
                long j9 = j(j8);
                long j10 = (4294967296L + j9) / 8589934592L;
                long j11 = (((-1) + j10) * 8589934592L) + j7;
                j7 += j10 * 8589934592L;
                if (Math.abs(j11 - j9) < Math.abs(j7 - j9)) {
                    j7 = j11;
                }
            }
            return g(i(j7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long f(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = this.f7597c;
        if (j8 != -9223372036854775807L) {
            long j9 = j(j8);
            long j10 = j9 / 8589934592L;
            Long.signum(j10);
            long j11 = (j10 * 8589934592L) + j7;
            j7 += (j10 + 1) * 8589934592L;
            if (j11 >= j9) {
                j7 = j11;
            }
        }
        return g(i(j7));
    }

    public final synchronized long g(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!h()) {
                long j8 = this.f7595a;
                if (j8 == 9223372036854775806L) {
                    Long l7 = (Long) this.f7598d.get();
                    if (l7 == null) {
                        throw null;
                    }
                    j8 = l7.longValue();
                }
                this.f7596b = j8 - j7;
                notifyAll();
            }
            this.f7597c = j7;
            return j7 + this.f7596b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        return this.f7596b != -9223372036854775807L;
    }
}
