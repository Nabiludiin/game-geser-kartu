package com.google.android.gms.common.util;

/* compiled from: MyApplication */
public abstract class m {
    public static int a(byte[] bArr, int i7, int i8, int i9) {
        int i10;
        int i11 = i7;
        while (true) {
            i10 = (i8 & (-4)) + i7;
            if (i11 >= i10) {
                break;
            }
            int i12 = ((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | (bArr[i11 + 3] << 24)) * (-862048943);
            int i13 = i9 ^ (((i12 >>> 17) | (i12 << 15)) * 461845907);
            i9 = (((i13 >>> 19) | (i13 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i14 = i8 & 3;
        if (i14 != 1) {
            if (i14 != 2) {
                r0 = i14 == 3 ? (bArr[i10 + 2] & 255) << 16 : 0;
                int i15 = i9 ^ i8;
                int i16 = (i15 ^ (i15 >>> 16)) * (-2048144789);
                int i17 = (i16 ^ (i16 >>> 13)) * (-1028477387);
                return i17 ^ (i17 >>> 16);
            }
            r0 |= (bArr[i10 + 1] & 255) << 8;
        }
        int i18 = ((bArr[i10] & 255) | r0) * (-862048943);
        i9 ^= ((i18 >>> 17) | (i18 << 15)) * 461845907;
        int i152 = i9 ^ i8;
        int i162 = (i152 ^ (i152 >>> 16)) * (-2048144789);
        int i172 = (i162 ^ (i162 >>> 13)) * (-1028477387);
        return i172 ^ (i172 >>> 16);
    }
}
