package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class cc {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f6356f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f6357a;

    /* renamed from: b, reason: collision with root package name */
    private int f6358b;

    /* renamed from: c, reason: collision with root package name */
    public int f6359c;

    /* renamed from: d, reason: collision with root package name */
    public int f6360d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f6361e = new byte[128];

    public cc(int i7) {
    }

    public final void a() {
        this.f6357a = false;
        this.f6359c = 0;
        this.f6358b = 0;
    }

    public final boolean b(int i7, int i8) {
        int i9 = this.f6358b;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i7 == 179 || i7 == 181) {
                            this.f6359c -= i8;
                            this.f6357a = false;
                            return true;
                        }
                    } else if ((i7 & 240) != 32) {
                        gv1.c("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f6360d = this.f6359c;
                        this.f6358b = 4;
                    }
                } else if (i7 > 31) {
                    gv1.c("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f6358b = 3;
                }
            } else if (i7 != 181) {
                gv1.c("H263Reader", "Unexpected start code value");
                a();
            } else {
                this.f6358b = 2;
            }
        } else if (i7 == 176) {
            this.f6358b = 1;
            this.f6357a = true;
        }
        c(f6356f, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i7, int i8) {
        if (this.f6357a) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.f6361e;
            int length = bArr2.length;
            int i10 = this.f6359c + i9;
            if (length < i10) {
                this.f6361e = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.f6361e, this.f6359c, i9);
            this.f6359c += i9;
        }
    }
}
