package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class uf4 {
    public static byte[] a(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] b(BigInteger bigInteger, int i7) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i7) {
            return byteArray;
        }
        int i8 = i7 + 1;
        if (length > i8) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i8) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(byteArray, 0, bArr, i7 - length, length);
        return bArr;
    }
}
