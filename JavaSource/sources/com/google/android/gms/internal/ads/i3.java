package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public int f9815a;

    /* renamed from: b, reason: collision with root package name */
    public String f9816b;

    /* renamed from: c, reason: collision with root package name */
    public int f9817c;

    /* renamed from: d, reason: collision with root package name */
    public int f9818d;

    /* renamed from: e, reason: collision with root package name */
    public int f9819e;

    /* renamed from: f, reason: collision with root package name */
    public int f9820f;

    /* renamed from: g, reason: collision with root package name */
    public int f9821g;

    public i3() {
    }

    public final boolean a(int i7) {
        boolean l7;
        int i8;
        int i9;
        int i10;
        int i11;
        String[] strArr;
        int[] iArr;
        int m7;
        int[] iArr2;
        int[] iArr3;
        int i12;
        int[] iArr4;
        int[] iArr5;
        int i13;
        int[] iArr6;
        l7 = j3.l(i7);
        if (!l7 || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i10 - 1;
        this.f9815a = i8;
        strArr = j3.f10320a;
        this.f9816b = strArr[3 - i9];
        iArr = j3.f10321b;
        int i15 = iArr[i11];
        this.f9818d = i15;
        if (i8 == 2) {
            i15 /= 2;
            this.f9818d = i15;
        } else if (i8 == 0) {
            i15 /= 4;
            this.f9818d = i15;
        }
        int i16 = (i7 >>> 9) & 1;
        m7 = j3.m(i8, i9);
        this.f9821g = m7;
        if (i9 == 3) {
            if (i8 == 3) {
                iArr6 = j3.f10322c;
                i13 = iArr6[i14];
            } else {
                iArr5 = j3.f10323d;
                i13 = iArr5[i14];
            }
            this.f9820f = i13;
            this.f9817c = (((i13 * 12) / i15) + i16) * 4;
        } else {
            if (i8 == 3) {
                if (i9 == 2) {
                    iArr4 = j3.f10324e;
                    i12 = iArr4[i14];
                } else {
                    iArr3 = j3.f10325f;
                    i12 = iArr3[i14];
                }
                this.f9820f = i12;
                this.f9817c = ((i12 * 144) / i15) + i16;
            } else {
                iArr2 = j3.f10326g;
                int i17 = iArr2[i14];
                this.f9820f = i17;
                this.f9817c = (((i9 == 1 ? 72 : 144) * i17) / i15) + i16;
            }
        }
        this.f9819e = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public i3(i3 i3Var) {
        this.f9815a = i3Var.f9815a;
        this.f9816b = i3Var.f9816b;
        this.f9817c = i3Var.f9817c;
        this.f9818d = i3Var.f9818d;
        this.f9819e = i3Var.f9819e;
        this.f9820f = i3Var.f9820f;
        this.f9821g = i3Var.f9821g;
    }
}
