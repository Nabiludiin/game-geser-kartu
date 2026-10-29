package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public abstract class l3 {
    public static List a(byte[] bArr) {
        long e8 = e(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(h(i(e8)));
        arrayList.add(h(i(3840L)));
        return arrayList;
    }

    public static int b(ByteBuffer byteBuffer) {
        int i7;
        if ((byteBuffer.get(5) & 2) == 0) {
            i7 = 0;
        } else {
            byte b8 = byteBuffer.get(26);
            int i8 = 28;
            int i9 = 28;
            for (int i10 = 0; i10 < b8; i10++) {
                i9 += byteBuffer.get(i10 + 27);
            }
            byte b9 = byteBuffer.get(i9 + 26);
            for (int i11 = 0; i11 < b9; i11++) {
                i8 += byteBuffer.get(i9 + 27 + i11);
            }
            i7 = i9 + i8;
        }
        int i12 = byteBuffer.get(i7 + 26) + 27 + i7;
        return (int) ((g(byteBuffer.get(i12), byteBuffer.limit() - i12 > 1 ? byteBuffer.get(i12 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (int) ((g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int e(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean f(long j7, long j8) {
        return j7 - j8 <= i(3840L) / 1000;
    }

    private static long g(byte b8, byte b9) {
        int i7;
        int i8 = b8 & 255;
        int i9 = b8 & 3;
        if (i9 != 0) {
            i7 = 2;
            if (i9 != 1 && i9 != 2) {
                i7 = b9 & 63;
            }
        } else {
            i7 = 1;
        }
        int i10 = i8 >> 3;
        return i7 * (i10 >= 16 ? 2500 << r6 : i10 >= 12 ? 10000 << (i10 & 1) : (i10 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static byte[] h(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }

    private static long i(long j7) {
        return (j7 * 1000000000) / 48000;
    }
}
