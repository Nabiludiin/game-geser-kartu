package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class j3 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f10320a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f10321b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f10322c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f10323d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f10324e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f10325f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f10326g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int a(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return -1;
        }
        int i12 = i10 - 1;
        int i13 = f10321b[i11];
        if (i8 == 2) {
            i13 /= 2;
        } else if (i8 == 0) {
            i13 /= 4;
        }
        int i14 = (i7 >>> 9) & 1;
        if (i9 == 3) {
            return ((((i8 == 3 ? f10322c[i12] : f10323d[i12]) * 12) / i13) + i14) * 4;
        }
        int i15 = i8 == 3 ? i9 == 2 ? f10324e[i12] : f10325f[i12] : f10326g[i12];
        if (i8 == 3) {
            return ((i15 * 144) / i13) + i14;
        }
        return (((i9 == 1 ? 72 : 144) * i15) / i13) + i14;
    }

    public static int b(int i7) {
        int i8;
        int i9;
        if (!l(i7) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0) {
            return -1;
        }
        int i10 = i7 >>> 12;
        int i11 = (i7 >>> 10) & 3;
        int i12 = i10 & 15;
        if (i12 == 0 || i12 == 15 || i11 == 3) {
            return -1;
        }
        return m(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i7) {
        return (i7 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i7, int i8) {
        return i8 != 1 ? i8 != 2 ? 384 : 1152 : i7 == 3 ? 1152 : 576;
    }
}
