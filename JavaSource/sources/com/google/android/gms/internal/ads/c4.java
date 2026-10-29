package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6242a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6243b;

    /* renamed from: c, reason: collision with root package name */
    private int f6244c;

    /* renamed from: d, reason: collision with root package name */
    private int f6245d;

    public c4(byte[] bArr) {
        this.f6242a = bArr;
        this.f6243b = bArr.length;
    }

    public final boolean a() {
        int i7 = (this.f6242a[this.f6244c] & 255) >> this.f6245d;
        c(1);
        return 1 == (i7 & 1);
    }

    public final int b(int i7) {
        int i8 = this.f6244c;
        int i9 = 8 - this.f6245d;
        int i10 = i8 + 1;
        byte[] bArr = this.f6242a;
        int min = Math.min(i7, i9);
        int i11 = ((bArr[i8] & 255) >> this.f6245d) & (255 >> (8 - min));
        while (min < i7) {
            i11 |= (bArr[i10] & 255) << min;
            min += 8;
            i10++;
        }
        int i12 = i11 & ((-1) >>> (32 - i7));
        c(i7);
        return i12;
    }

    public final void c(int i7) {
        int i8;
        int i9 = i7 / 8;
        int i10 = this.f6244c + i9;
        this.f6244c = i10;
        int i11 = this.f6245d + (i7 - (i9 * 8));
        this.f6245d = i11;
        if (i11 > 7) {
            i10++;
            this.f6244c = i10;
            i11 -= 8;
            this.f6245d = i11;
        }
        boolean z7 = false;
        if (i10 >= 0 && (i10 < (i8 = this.f6243b) || (i10 == i8 && i11 == 0))) {
            z7 = true;
        }
        rx3.h(z7);
    }

    public final int d() {
        return (this.f6244c * 8) + this.f6245d;
    }
}
