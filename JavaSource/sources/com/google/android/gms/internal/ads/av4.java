package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: MyApplication */
public abstract class av4 {
    public static byte[] a(byte[] bArr) {
        byte[] bArr2;
        int i7;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i8 = length >> 1;
        byte[] c8 = c(Arrays.copyOf(bArr, i8));
        byte[] c9 = c(Arrays.copyOfRange(bArr, i8, length));
        int length2 = c8.length;
        int length3 = c9.length;
        int i9 = length2 + 4 + length3;
        if (i9 >= 128) {
            bArr2 = new byte[i9 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i9;
            i7 = 3;
        } else {
            bArr2 = new byte[i9 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i9;
            i7 = 2;
        }
        int i10 = i7 + 1;
        bArr2[i7] = 2;
        int i11 = i7 + 2;
        bArr2[i10] = (byte) length2;
        System.arraycopy(c8, 0, bArr2, i11, length2);
        int i12 = i11 + length2;
        bArr2[i12] = 2;
        bArr2[i12 + 1] = (byte) length3;
        System.arraycopy(c9, 0, bArr2, i12 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec b(yu4 yu4Var) {
        int ordinal = yu4Var.ordinal();
        if (ordinal == 0) {
            return gg4.f8906a;
        }
        if (ordinal == 1) {
            return gg4.f8907b;
        }
        if (ordinal == 2) {
            return gg4.f8908c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(yu4Var.toString()));
    }

    private static byte[] c(byte[] bArr) {
        int length;
        int i7 = 0;
        while (true) {
            length = bArr.length;
            if (i7 >= length || bArr[i7] != 0) {
                break;
            }
            i7++;
        }
        if (i7 == length) {
            i7 = length - 1;
        }
        int i8 = (bArr[i7] & 128) == 128 ? 1 : 0;
        int i9 = length - i7;
        byte[] bArr2 = new byte[i9 + i8];
        System.arraycopy(bArr, i7, bArr2, i8, i9);
        return bArr2;
    }
}
