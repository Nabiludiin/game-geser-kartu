package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: MyApplication */
final class zy4 extends wy4 {

    /* renamed from: i, reason: collision with root package name */
    private final OutputStream f20530i;

    zy4(OutputStream outputStream, int i7) {
        super(i7);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f20530i = outputStream;
    }

    private final void J(int i7) {
        if (this.f18476f - this.f18477g < i7) {
            K();
        }
    }

    private final void K() {
        this.f20530i.write(this.f18475e, 0, this.f18477g);
        this.f18477g = 0;
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void A(long j7) {
        J(8);
        I(j7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void B(String str) {
        int b8;
        try {
            int length = str.length() * 3;
            int b9 = az4.b(length);
            int i7 = b9 + length;
            int i8 = this.f18476f;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int c8 = k25.c(str, bArr, 0, length);
                x(c8);
                L(bArr, 0, c8);
                return;
            }
            if (i7 > i8 - this.f18477g) {
                K();
            }
            int b10 = az4.b(str.length());
            int i9 = this.f18477g;
            try {
                if (b10 == b9) {
                    int i10 = i9 + b10;
                    this.f18477g = i10;
                    int c9 = k25.c(str, this.f18475e, i10, i8 - i10);
                    this.f18477g = i9;
                    b8 = (c9 - i9) - b10;
                    F(b8);
                    this.f18477g = c9;
                } else {
                    b8 = k25.b(str);
                    F(b8);
                    this.f18477g = k25.c(str, this.f18475e, this.f18477g, b8);
                }
                this.f18478h += b8;
            } catch (j25 e8) {
                this.f18478h -= this.f18477g - i9;
                this.f18477g = i9;
                throw e8;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new yy4(e9);
            }
        } catch (j25 e10) {
            g(str, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void C() {
        if (this.f18477g > 0) {
            K();
        }
    }

    public final void L(byte[] bArr, int i7, int i8) {
        int i9 = this.f18476f;
        int i10 = this.f18477g;
        int i11 = i9 - i10;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, this.f18475e, i10, i8);
            this.f18477g += i8;
            this.f18478h += i8;
            return;
        }
        byte[] bArr2 = this.f18475e;
        System.arraycopy(bArr, i7, bArr2, i10, i11);
        int i12 = i7 + i11;
        this.f18477g = i9;
        this.f18478h += i11;
        K();
        int i13 = i8 - i11;
        if (i13 <= i9) {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f18477g = i13;
        } else {
            this.f20530i.write(bArr, i12, i13);
        }
        this.f18478h += i13;
    }

    @Override // com.google.android.gms.internal.ads.az4, com.google.android.gms.internal.ads.gy4
    public final void a(byte[] bArr, int i7, int i8) {
        L(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void i(int i7, int i8) {
        x((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void j(int i7, int i8) {
        J(20);
        F(i7 << 3);
        if (i8 >= 0) {
            F(i8);
        } else {
            G(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void k(int i7, int i8) {
        J(20);
        F(i7 << 3);
        F(i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void l(int i7, int i8) {
        J(14);
        F((i7 << 3) | 5);
        H(i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void m(int i7, long j7) {
        J(20);
        F(i7 << 3);
        G(j7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void o(int i7, long j7) {
        J(18);
        F((i7 << 3) | 1);
        I(j7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void p(int i7, boolean z7) {
        J(11);
        F(i7 << 3);
        E(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void q(int i7, String str) {
        x((i7 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void r(int i7, qy4 qy4Var) {
        x((i7 << 3) | 2);
        s(qy4Var);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void s(qy4 qy4Var) {
        x(qy4Var.h());
        qy4Var.o(this);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void t(byte[] bArr, int i7, int i8) {
        x(i8);
        L(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void u(v05 v05Var) {
        x(v05Var.m());
        v05Var.n(this);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void v(byte b8) {
        if (this.f18477g == this.f18476f) {
            K();
        }
        E(b8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void w(int i7) {
        if (i7 >= 0) {
            x(i7);
        } else {
            z(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void x(int i7) {
        J(5);
        F(i7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void y(int i7) {
        J(4);
        H(i7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void z(long j7) {
        J(10);
        G(j7);
    }
}
