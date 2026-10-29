package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MyApplication */
public abstract class eh {
    public static byte[] a() {
        int i7 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i8 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        ByteBuffer allocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ (i15 + ((((i10 & (~i9)) | i11) + ((i9 & i12) | i13)) - i14)));
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i8);
        allocate.putInt(i7);
        return allocate.array();
    }
}
