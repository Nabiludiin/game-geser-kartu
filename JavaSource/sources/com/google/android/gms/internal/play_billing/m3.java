package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* compiled from: MyApplication */
final class m3 extends p3 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f21674e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21675f;

    /* renamed from: g, reason: collision with root package name */
    private int f21676g;

    m3(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f21674e = bArr;
        this.f21676g = 0;
        this.f21675f = i8;
    }

    public final void A(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.f21674e, this.f21676g, i8);
            this.f21676g += i8;
        } catch (IndexOutOfBoundsException e8) {
            throw new n3(this.f21676g, this.f21675f, i8, e8);
        }
    }

    public final void B(i3 i3Var) {
        w(i3Var.g());
        i3Var.j(this);
    }

    public final void C(String str) {
        int i7 = this.f21676g;
        try {
            int c8 = p3.c(str.length() * 3);
            int c9 = p3.c(str.length());
            if (c9 != c8) {
                w(z5.c(str));
                byte[] bArr = this.f21674e;
                int i8 = this.f21676g;
                this.f21676g = z5.b(str, bArr, i8, this.f21675f - i8);
                return;
            }
            int i9 = i7 + c9;
            this.f21676g = i9;
            int b8 = z5.b(str, this.f21674e, i9, this.f21675f - i9);
            this.f21676g = i7;
            w((b8 - i7) - c9);
            this.f21676g = b8;
        } catch (y5 e8) {
            this.f21676g = i7;
            f(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new n3(e9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final int h() {
        return this.f21675f - this.f21676g;
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void i(byte b8) {
        int i7 = this.f21676g;
        try {
            int i8 = i7 + 1;
            try {
                this.f21674e[i7] = b8;
                this.f21676g = i8;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i7 = i8;
                throw new n3(i7, this.f21675f, 1, e);
            }
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void j(int i7, boolean z7) {
        w(i7 << 3);
        i(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void k(int i7, i3 i3Var) {
        w((i7 << 3) | 2);
        B(i3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void l(int i7, int i8) {
        w((i7 << 3) | 5);
        m(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void m(int i7) {
        int i8 = this.f21676g;
        try {
            byte[] bArr = this.f21674e;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.f21676g = i8 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new n3(i8, this.f21675f, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void n(int i7, long j7) {
        w((i7 << 3) | 1);
        o(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void o(long j7) {
        int i7 = this.f21676g;
        try {
            byte[] bArr = this.f21674e;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.f21676g = i7 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new n3(i7, this.f21675f, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void p(int i7, int i8) {
        w(i7 << 3);
        q(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void q(int i7) {
        if (i7 >= 0) {
            w(i7);
        } else {
            y(i7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void r(byte[] bArr, int i7, int i8) {
        A(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    final void s(int i7, z4 z4Var, j5 j5Var) {
        w((i7 << 3) | 2);
        w(((u2) z4Var).c(j5Var));
        j5Var.a(z4Var, this.f21709a);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void t(int i7, String str) {
        w((i7 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void u(int i7, int i8) {
        w((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void v(int i7, int i8) {
        w(i7 << 3);
        w(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void w(int i7) {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.f21676g;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.f21674e[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                    i9 = i8;
                    throw new n3(i9, this.f21675f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                throw new n3(i9, this.f21675f, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.f21674e[i9] = (byte) i7;
        this.f21676g = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void x(int i7, long j7) {
        w(i7 << 3);
        y(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.p3
    public final void y(long j7) {
        boolean z7;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i8 = this.f21676g;
        z7 = p3.f21707c;
        if (!z7 || this.f21675f - i8 < 10) {
            int i9 = i8;
            while ((j7 & (-128)) != 0) {
                try {
                    int i10 = i9 + 1;
                    try {
                        this.f21674e[i9] = (byte) (((int) j7) | 128);
                        j7 >>>= 7;
                        i9 = i10;
                    } catch (IndexOutOfBoundsException e8) {
                        indexOutOfBoundsException = e8;
                        i9 = i10;
                        throw new n3(i9, this.f21675f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e9) {
                    indexOutOfBoundsException = e9;
                }
            }
            i7 = i9 + 1;
            try {
                this.f21674e[i9] = (byte) j7;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i9 = i7;
                throw new n3(i9, this.f21675f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                w5.s(this.f21674e, i8, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            w5.s(this.f21674e, i8, (byte) j7);
        }
        this.f21676g = i7;
    }
}
