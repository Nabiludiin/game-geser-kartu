package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class z6 {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f20023d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f20024a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f20025b;

    /* renamed from: c, reason: collision with root package name */
    private int f20026c;

    public static int d(int i7) {
        int i8 = 0;
        while (i8 < 8) {
            int i9 = i8 + 1;
            if ((f20023d[i8] & i7) != 0) {
                return i9;
            }
            i8 = i9;
        }
        return -1;
    }

    public static long e(byte[] bArr, int i7, boolean z7) {
        long j7 = bArr[0] & 255;
        if (z7) {
            j7 &= ~f20023d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }

    public final void a() {
        this.f20025b = 0;
        this.f20026c = 0;
    }

    public final long b(n2 n2Var, boolean z7, boolean z8, int i7) {
        if (this.f20025b == 0) {
            byte[] bArr = this.f20024a;
            if (!n2Var.v(bArr, 0, 1, z7)) {
                return -1L;
            }
            int d8 = d(bArr[0] & 255);
            this.f20026c = d8;
            if (d8 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f20025b = 1;
        }
        int i8 = this.f20026c;
        if (i8 > i7) {
            this.f20025b = 0;
            return -2L;
        }
        if (i8 != 1) {
            n2Var.s(this.f20024a, 1, i8 - 1);
        }
        this.f20025b = 0;
        return e(this.f20024a, this.f20026c, z8);
    }

    public final int c() {
        return this.f20026c;
    }
}
