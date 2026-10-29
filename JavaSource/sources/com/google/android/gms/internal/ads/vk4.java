package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class vk4 {
    public static byte[] a(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 16) {
            int i8 = i7 + 1;
            byte b8 = bArr[i7];
            byte b9 = (byte) ((b8 + b8) & 254);
            bArr2[i7] = b9;
            if (i7 < 15) {
                bArr2[i7] = (byte) (((bArr[i8] >> 7) & 1) | b9);
            }
            i7 = i8;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
