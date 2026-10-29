package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
public abstract class g44 {
    public static long a(long j7, long j8, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j9 = j7 / j8;
        long j10 = j7 - (j8 * j9);
        if (j10 == 0) {
            return j9;
        }
        int i7 = ((int) ((j7 ^ j8) >> 63)) | 1;
        switch (f44.f8035a[roundingMode.ordinal()]) {
            case 1:
                h44.b(false);
                return j9;
            case 2:
                return j9;
            case 3:
                if (i7 >= 0) {
                    return j9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i7 <= 0) {
                    return j9;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j10);
                long abs2 = abs - (Math.abs(j8) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j9) == 0)) {
                        return j9;
                    }
                } else if (abs2 <= 0) {
                    return j9;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j9 + i7;
    }

    public static long b(long j7, long j8) {
        h44.a("a", j7);
        h44.a("b", j8);
        if (j7 == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j7;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
        long j9 = j7 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j10 = j8 >> numberOfTrailingZeros2;
        while (j9 != j10) {
            long j11 = j9 - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            j9 = j13 >> Long.numberOfTrailingZeros(j13);
            j10 += j12;
        }
        return j9 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static long c(long j7, long j8) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j7) + Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8);
        if (numberOfLeadingZeros > 65) {
            return j7 * j8;
        }
        long j9 = j7 ^ j8;
        long j10 = (j9 >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j8 == Long.MIN_VALUE) & (j7 < 0)))) {
            long j11 = j7 * j8;
            if (j7 == 0 || j11 / j7 == j8) {
                return j11;
            }
        }
        return j10;
    }
}
