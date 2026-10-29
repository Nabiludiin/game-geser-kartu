package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class q73 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f14282a;

    /* renamed from: b, reason: collision with root package name */
    private int f14283b;

    /* renamed from: c, reason: collision with root package name */
    private int f14284c;

    /* renamed from: d, reason: collision with root package name */
    private int f14285d = 0;

    public q73(byte[] bArr, int i7, int i8) {
        this.f14282a = bArr;
        this.f14284c = i7;
        this.f14283b = i8;
        k();
    }

    private final int i() {
        int i7 = 0;
        while (!e()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? f(i7) : 0);
    }

    private final boolean j(int i7) {
        if (i7 < 2 || i7 >= this.f14283b) {
            return false;
        }
        byte[] bArr = this.f14282a;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 + (-1)] == 0;
    }

    private final void k() {
        int i7;
        int i8 = this.f14284c;
        boolean z7 = false;
        if (i8 >= 0 && (i8 < (i7 = this.f14283b) || (i8 == i7 && this.f14285d == 0))) {
            z7 = true;
        }
        rx3.h(z7);
    }

    public final void a() {
        int i7 = this.f14285d + 1;
        this.f14285d = i7;
        if (i7 == 8) {
            this.f14285d = 0;
            int i8 = this.f14284c;
            this.f14284c = i8 + (true == j(i8 + 1) ? 2 : 1);
        }
        k();
    }

    public final void b(int i7) {
        int i8 = this.f14284c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        this.f14284c = i10;
        int i11 = this.f14285d + (i7 - (i9 * 8));
        this.f14285d = i11;
        if (i11 > 7) {
            this.f14284c = i10 + 1;
            this.f14285d = i11 - 8;
        }
        while (true) {
            i8++;
            if (i8 > this.f14284c) {
                k();
                return;
            } else if (j(i8)) {
                this.f14284c++;
                i8 += 2;
            }
        }
    }

    public final void c() {
        int i7 = this.f14285d;
        if (i7 > 0) {
            b(8 - i7);
        }
    }

    public final boolean d(int i7) {
        int i8 = this.f14284c;
        int i9 = i7 / 8;
        int i10 = i8 + i9;
        int i11 = (this.f14285d + i7) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i8++;
            if (i8 > i10 || i10 >= this.f14283b) {
                break;
            }
            if (j(i8)) {
                i10++;
                i8 += 2;
            }
        }
        int i12 = this.f14283b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public final boolean e() {
        int i7 = this.f14282a[this.f14284c] & (128 >> this.f14285d);
        a();
        return i7 != 0;
    }

    public final int f(int i7) {
        int i8;
        this.f14285d += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f14285d;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f14285d = i10;
            byte[] bArr = this.f14282a;
            int i11 = this.f14284c;
            i9 |= (bArr[i11] & 255) << i10;
            if (true != j(i11 + 1)) {
                r3 = 1;
            }
            this.f14284c = i11 + r3;
        }
        byte[] bArr2 = this.f14282a;
        int i12 = this.f14284c;
        int i13 = i9 | ((bArr2[i12] & 255) >> (8 - i8));
        int i14 = 32 - i7;
        if (i8 == 8) {
            this.f14285d = 0;
            this.f14284c = i12 + (true != j(i12 + 1) ? 1 : 2);
        }
        int i15 = ((-1) >>> i14) & i13;
        k();
        return i15;
    }

    public final int g() {
        return i();
    }

    public final int h() {
        int i7 = i();
        return (i7 % 2 == 0 ? -1 : 1) * ((i7 + 1) / 2);
    }
}
