package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class w72 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f18098a;

    /* renamed from: b, reason: collision with root package name */
    private int f18099b;

    /* renamed from: c, reason: collision with root package name */
    private int f18100c;

    /* renamed from: d, reason: collision with root package name */
    private int f18101d;

    public w72(byte[] bArr, int i7) {
        this.f18098a = bArr;
        this.f18101d = i7;
    }

    private final void q() {
        int i7;
        int i8 = this.f18099b;
        boolean z7 = false;
        if (i8 >= 0 && (i8 < (i7 = this.f18101d) || (i8 == i7 && this.f18100c == 0))) {
            z7 = true;
        }
        rx3.h(z7);
    }

    public final void a(y82 y82Var) {
        b(y82Var.H(), y82Var.D());
        f(y82Var.F() * 8);
    }

    public final void b(byte[] bArr, int i7) {
        this.f18098a = bArr;
        this.f18099b = 0;
        this.f18100c = 0;
        this.f18101d = i7;
    }

    public final int c() {
        return ((this.f18101d - this.f18099b) * 8) - this.f18100c;
    }

    public final int d() {
        return (this.f18099b * 8) + this.f18100c;
    }

    public final int e() {
        rx3.h(this.f18100c == 0);
        return this.f18099b;
    }

    public final void f(int i7) {
        int i8 = i7 / 8;
        this.f18099b = i8;
        this.f18100c = i7 - (i8 * 8);
        q();
    }

    public final void g() {
        int i7 = this.f18100c + 1;
        this.f18100c = i7;
        if (i7 == 8) {
            this.f18100c = 0;
            this.f18099b++;
        }
        q();
    }

    public final void h(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f18099b + i8;
        this.f18099b = i9;
        int i10 = this.f18100c + (i7 - (i8 * 8));
        this.f18100c = i10;
        if (i10 > 7) {
            this.f18099b = i9 + 1;
            this.f18100c = i10 - 8;
        }
        q();
    }

    public final boolean i() {
        int i7 = this.f18098a[this.f18099b] & (128 >> this.f18100c);
        g();
        return i7 != 0;
    }

    public final int j(int i7) {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        this.f18100c += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f18100c;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f18100c = i10;
            byte[] bArr = this.f18098a;
            int i11 = this.f18099b;
            this.f18099b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f18098a;
        int i12 = this.f18099b;
        int i13 = i9 | ((bArr2[i12] & 255) >> (8 - i8));
        int i14 = 32 - i7;
        if (i8 == 8) {
            this.f18100c = 0;
            this.f18099b = i12 + 1;
        }
        int i15 = ((-1) >>> i14) & i13;
        q();
        return i15;
    }

    public final long k(int i7) {
        if (i7 <= 32) {
            int j7 = j(i7);
            String str = hi2.f9535a;
            return 4294967295L & j7;
        }
        int j8 = j(i7 - 32);
        int j9 = j(32);
        String str2 = hi2.f9535a;
        return (4294967295L & j9) | ((j8 & 4294967295L) << 32);
    }

    public final void l(byte[] bArr, int i7, int i8) {
        int i9;
        int i10 = 0;
        while (true) {
            i9 = i8 >> 3;
            if (i10 >= i9) {
                break;
            }
            byte[] bArr2 = this.f18098a;
            int i11 = this.f18099b;
            int i12 = i11 + 1;
            this.f18099b = i12;
            byte b8 = bArr2[i11];
            int i13 = this.f18100c;
            byte b9 = (byte) (b8 << i13);
            bArr[i10] = b9;
            bArr[i10] = (byte) (((bArr2[i12] & 255) >> (8 - i13)) | b9);
            i10++;
        }
        int i14 = i8 & 7;
        if (i14 == 0) {
            return;
        }
        byte b10 = (byte) (bArr[i9] & (255 >> i14));
        bArr[i9] = b10;
        int i15 = this.f18100c;
        if (i15 + i14 > 8) {
            byte[] bArr3 = this.f18098a;
            int i16 = this.f18099b;
            this.f18099b = i16 + 1;
            b10 = (byte) (b10 | ((bArr3[i16] & 255) << i15));
            bArr[i9] = b10;
            i15 -= 8;
        }
        int i17 = i15 + i14;
        this.f18100c = i17;
        byte[] bArr4 = this.f18098a;
        int i18 = this.f18099b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i14))) | b10);
        if (i17 == 8) {
            this.f18100c = 0;
            this.f18099b = i18 + 1;
        }
        q();
    }

    public final void m() {
        if (this.f18100c == 0) {
            return;
        }
        this.f18100c = 0;
        this.f18099b++;
        q();
    }

    public final void n(byte[] bArr, int i7, int i8) {
        rx3.h(this.f18100c == 0);
        System.arraycopy(this.f18098a, this.f18099b, bArr, 0, i8);
        this.f18099b += i8;
        q();
    }

    public final void o(int i7) {
        rx3.h(this.f18100c == 0);
        this.f18099b += i7;
        q();
    }

    public final void p(int i7, int i8) {
        int min = Math.min(8 - this.f18100c, 14);
        int i9 = this.f18100c;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.f18098a;
        int i11 = this.f18099b;
        byte b8 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b8;
        int i12 = 14 - min;
        int i13 = i7 & 16383;
        bArr[i11] = (byte) (b8 | ((i13 >>> i12) << i10));
        int i14 = i11 + 1;
        while (i12 > 8) {
            i12 -= 8;
            this.f18098a[i14] = (byte) (i13 >>> i12);
            i14++;
        }
        byte[] bArr2 = this.f18098a;
        byte b9 = (byte) (bArr2[i14] & ((1 << r0) - 1));
        bArr2[i14] = b9;
        bArr2[i14] = (byte) (((i13 & ((1 << i12) - 1)) << (8 - i12)) | b9);
        h(14);
        q();
    }

    public w72() {
        this.f18098a = hi2.f9536b;
    }
}
