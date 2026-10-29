package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract /* synthetic */ class rc {
    public static /* synthetic */ long a(long j7, long j8) {
        long j9 = j7 + j8;
        if (((j8 ^ j7) < 0) || ((j7 ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }
}
