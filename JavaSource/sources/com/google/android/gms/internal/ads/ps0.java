package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: MyApplication */
final class ps0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f14062a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14063b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14064c;

    /* renamed from: d, reason: collision with root package name */
    private final float f14065d;

    /* renamed from: e, reason: collision with root package name */
    private final float f14066e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14067f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14068g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14069h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f14070i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f14071j;

    /* renamed from: k, reason: collision with root package name */
    private int f14072k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f14073l;

    /* renamed from: m, reason: collision with root package name */
    private int f14074m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f14075n;

    /* renamed from: o, reason: collision with root package name */
    private int f14076o;

    /* renamed from: p, reason: collision with root package name */
    private int f14077p;

    /* renamed from: q, reason: collision with root package name */
    private int f14078q;

    /* renamed from: r, reason: collision with root package name */
    private int f14079r;

    /* renamed from: s, reason: collision with root package name */
    private int f14080s;

    /* renamed from: t, reason: collision with root package name */
    private int f14081t;

    /* renamed from: u, reason: collision with root package name */
    private int f14082u;

    /* renamed from: v, reason: collision with root package name */
    private int f14083v;

    /* renamed from: w, reason: collision with root package name */
    private double f14084w;

    public ps0(int i7, int i8, float f8, float f9, int i9) {
        this.f14062a = i7;
        this.f14063b = i8;
        this.f14064c = f8;
        this.f14065d = f9;
        this.f14066e = i7 / i9;
        this.f14067f = i7 / 400;
        int i10 = i7 / 65;
        this.f14068g = i10;
        int i11 = i10 + i10;
        this.f14069h = i11;
        this.f14070i = new short[i11];
        int i12 = i11 * i8;
        this.f14071j = new short[i12];
        this.f14073l = new short[i12];
        this.f14075n = new short[i12];
    }

    private final short[] g(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f14063b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    private final void h(short[] sArr, int i7, int i8) {
        short[] g8 = g(this.f14073l, this.f14074m, i8);
        this.f14073l = g8;
        int i9 = this.f14074m;
        int i10 = this.f14063b;
        System.arraycopy(sArr, i7 * i10, g8, i9 * i10, i8 * i10);
        this.f14074m += i8;
    }

    private final void i(short[] sArr, int i7, int i8) {
        int i9;
        for (int i10 = 0; i10 < this.f14069h / i8; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f14063b;
                i9 = i13 * i8;
                if (i11 < i9) {
                    i12 += sArr[(i13 * i7) + (i9 * i10) + i11];
                    i11++;
                }
            }
            this.f14070i[i10] = (short) (i12 / i9);
        }
    }

    private final int j(short[] sArr, int i7, int i8, int i9) {
        int i10 = 1;
        int i11 = 255;
        int i12 = 0;
        int i13 = 0;
        while (i8 <= i9) {
            int i14 = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                int i16 = this.f14063b * i7;
                i14 += Math.abs(sArr[i16 + i15] - sArr[(i16 + i8) + i15]);
            }
            int i17 = i14 * i12;
            int i18 = i10 * i8;
            if (i17 < i18) {
                i10 = i14;
            }
            if (i17 < i18) {
                i12 = i8;
            }
            int i19 = i14 * i11;
            int i20 = i13 * i8;
            if (i19 > i20) {
                i13 = i14;
            }
            if (i19 > i20) {
                i11 = i8;
            }
            i8++;
        }
        this.f14082u = i10 / i12;
        this.f14083v = i13 / i11;
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0295 A[LOOP:4: B:58:0x0036->B:64:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194 A[EDGE_INSN: B:65:0x0194->B:66:0x0194 BREAK  A[LOOP:4: B:58:0x0036->B:64:0x0295], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ps0.k():void");
    }

    private static void l(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i10 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i9 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i15] = (short) (((sArr2[i13] * (i7 - i16)) + (sArr3[i14] * i16)) / i7);
                i15 += i8;
                i13 += i8;
                i14 += i8;
            }
        }
    }

    public final int a() {
        int i7 = this.f14072k * this.f14063b;
        return i7 + i7;
    }

    public final void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i7 = this.f14063b;
        int i8 = remaining / i7;
        int i9 = i8 * i7;
        short[] g8 = g(this.f14071j, this.f14072k, i8);
        this.f14071j = g8;
        shortBuffer.get(g8, this.f14072k * i7, (i9 + i9) / 2);
        this.f14072k += i8;
        k();
    }

    public final void c(ShortBuffer shortBuffer) {
        rx3.h(this.f14074m >= 0);
        int remaining = shortBuffer.remaining();
        int i7 = this.f14063b;
        int min = Math.min(remaining / i7, this.f14074m);
        int i8 = min * i7;
        shortBuffer.put(this.f14073l, 0, i8);
        int i9 = this.f14074m - min;
        this.f14074m = i9;
        short[] sArr = this.f14073l;
        System.arraycopy(sArr, i8, sArr, 0, i9 * i7);
    }

    public final void d() {
        int i7 = this.f14072k;
        int i8 = this.f14079r;
        int i9 = this.f14074m;
        float f8 = this.f14064c;
        float f9 = this.f14065d;
        int i10 = i9 + ((int) (((((((i7 - i8) / (f8 / f9)) + i8) + this.f14084w) + this.f14076o) / (this.f14066e * f9)) + 0.5d));
        this.f14084w = 0.0d;
        int i11 = this.f14069h;
        int i12 = i11 + i11;
        this.f14071j = g(this.f14071j, i7, i7 + i12);
        int i13 = 0;
        while (true) {
            int i14 = this.f14063b;
            if (i13 >= i12 * i14) {
                break;
            }
            this.f14071j[(i14 * i7) + i13] = 0;
            i13++;
        }
        this.f14072k += i12;
        k();
        if (this.f14074m > i10) {
            this.f14074m = Math.max(i10, 0);
        }
        this.f14072k = 0;
        this.f14079r = 0;
        this.f14076o = 0;
    }

    public final void e() {
        this.f14072k = 0;
        this.f14074m = 0;
        this.f14076o = 0;
        this.f14077p = 0;
        this.f14078q = 0;
        this.f14079r = 0;
        this.f14080s = 0;
        this.f14081t = 0;
        this.f14082u = 0;
        this.f14083v = 0;
        this.f14084w = 0.0d;
    }

    public final int f() {
        rx3.h(this.f14074m >= 0);
        int i7 = this.f14074m * this.f14063b;
        return i7 + i7;
    }
}
