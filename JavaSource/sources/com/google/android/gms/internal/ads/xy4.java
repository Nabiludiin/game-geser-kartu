package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: MyApplication */
final class xy4 extends az4 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f19308e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19309f;

    /* renamed from: g, reason: collision with root package name */
    private int f19310g;

    xy4(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f19308e = bArr;
        this.f19310g = 0;
        this.f19309f = i8;
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void A(long j7) {
        int i7 = this.f19310g;
        try {
            byte[] bArr = this.f19308e;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.f19310g = i7 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new yy4(i7, this.f19309f, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void B(String str) {
        int i7 = this.f19310g;
        try {
            int b8 = az4.b(str.length() * 3);
            int b9 = az4.b(str.length());
            if (b9 != b8) {
                x(k25.b(str));
                byte[] bArr = this.f19308e;
                int i8 = this.f19310g;
                this.f19310g = k25.c(str, bArr, i8, this.f19309f - i8);
                return;
            }
            int i9 = i7 + b9;
            this.f19310g = i9;
            int c8 = k25.c(str, this.f19308e, i9, this.f19309f - i9);
            this.f19310g = i7;
            x((c8 - i7) - b9);
            this.f19310g = c8;
        } catch (j25 e8) {
            this.f19310g = i7;
            g(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new yy4(e9);
        }
    }

    public final void E(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f19308e, this.f19310g, i8);
            this.f19310g += i8;
        } catch (IndexOutOfBoundsException e8) {
            throw new yy4(this.f19310g, this.f19309f, i8, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.az4, com.google.android.gms.internal.ads.gy4
    public final void a(byte[] bArr, int i7, int i8) {
        E(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void i(int i7, int i8) {
        x((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void j(int i7, int i8) {
        x(i7 << 3);
        w(i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void k(int i7, int i8) {
        x(i7 << 3);
        x(i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void l(int i7, int i8) {
        x((i7 << 3) | 5);
        y(i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void m(int i7, long j7) {
        x(i7 << 3);
        z(j7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final int n() {
        return this.f19309f - this.f19310g;
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void o(int i7, long j7) {
        x((i7 << 3) | 1);
        A(j7);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void p(int i7, boolean z7) {
        x(i7 << 3);
        v(z7 ? (byte) 1 : (byte) 0);
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
        E(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void u(v05 v05Var) {
        x(v05Var.m());
        v05Var.n(this);
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void v(byte b8) {
        int i7 = this.f19310g;
        try {
            int i8 = i7 + 1;
            try {
                this.f19308e[i7] = b8;
                this.f19310g = i8;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i7 = i8;
                throw new yy4(i7, this.f19309f, 1, e);
            }
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
        }
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
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.f19310g;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.f19308e[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                    i9 = i8;
                    throw new yy4(i9, this.f19309f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                throw new yy4(i9, this.f19309f, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.f19308e[i9] = (byte) i7;
        this.f19310g = i8;
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void y(int i7) {
        int i8 = this.f19310g;
        try {
            byte[] bArr = this.f19308e;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.f19310g = i8 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new yy4(i8, this.f19309f, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void z(long j7) {
        boolean z7;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        z7 = az4.f5413c;
        int i8 = this.f19310g;
        if (!z7 || this.f19309f - i8 < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    int i9 = i8 + 1;
                    try {
                        this.f19308e[i8] = (byte) (((int) j7) | 128);
                        j7 >>>= 7;
                        i8 = i9;
                    } catch (IndexOutOfBoundsException e8) {
                        indexOutOfBoundsException = e8;
                        i8 = i9;
                        throw new yy4(i8, this.f19309f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e9) {
                    indexOutOfBoundsException = e9;
                }
            }
            i7 = i8 + 1;
            try {
                this.f19308e[i8] = (byte) j7;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i8 = i7;
                throw new yy4(i8, this.f19309f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                f25.x(this.f19308e, i8, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            f25.x(this.f19308e, i8, (byte) j7);
        }
        this.f19310g = i7;
    }

    @Override // com.google.android.gms.internal.ads.az4
    public final void C() {
    }
}
