package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* compiled from: MyApplication */
final class fa extends ha {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f20946e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20947f;

    /* renamed from: g, reason: collision with root package name */
    private int f20948g;

    fa(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f20946e = bArr;
        this.f20948g = 0;
        this.f20947f = i8;
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void A(long j7) {
        int i7 = this.f20948g;
        try {
            byte[] bArr = this.f20946e;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.f20948g = i7 + 8;
        } catch (IndexOutOfBoundsException e8) {
            throw new ga(i7, this.f20947f, 8, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void B(byte[] bArr, int i7, int i8) {
        F(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void C(String str) {
        int i7 = this.f20948g;
        try {
            int E = ha.E(str.length() * 3);
            int E2 = ha.E(str.length());
            if (E2 != E) {
                x(dd.b(str));
                byte[] bArr = this.f20946e;
                int i8 = this.f20948g;
                this.f20948g = dd.c(str, bArr, i8, this.f20947f - i8);
                return;
            }
            int i9 = i7 + E2;
            this.f20948g = i9;
            int c8 = dd.c(str, this.f20946e, i9, this.f20947f - i9);
            this.f20948g = i7;
            x((c8 - i7) - E2);
            this.f20948g = c8;
        } catch (cd e8) {
            this.f20948g = i7;
            f(str, e8);
        } catch (IndexOutOfBoundsException e9) {
            throw new ga(e9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final int D() {
        return this.f20947f - this.f20948g;
    }

    public final void F(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.f20946e, this.f20948g, i8);
            this.f20948g += i8;
        } catch (IndexOutOfBoundsException e8) {
            throw new ga(this.f20948g, this.f20947f, i8, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void i(int i7, int i8) {
        x((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void j(int i7, int i8) {
        x(i7 << 3);
        w(i8);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void k(int i7, int i8) {
        x(i7 << 3);
        x(i8);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void l(int i7, int i8) {
        x((i7 << 3) | 5);
        y(i8);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void m(int i7, long j7) {
        x(i7 << 3);
        z(j7);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void n(int i7, long j7) {
        x((i7 << 3) | 1);
        A(j7);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void o(int i7, boolean z7) {
        x(i7 << 3);
        v(z7 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void p(int i7, String str) {
        x((i7 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void q(int i7, ca caVar) {
        x((i7 << 3) | 2);
        r(caVar);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void r(ca caVar) {
        x(caVar.g());
        caVar.i(this);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void s(byte[] bArr, int i7, int i8) {
        x(i8);
        F(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    final void t(int i7, xb xbVar, ic icVar) {
        x((i7 << 3) | 2);
        x(((o9) xbVar).f(icVar));
        icVar.d(xbVar, this.f21006a);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void u(xb xbVar) {
        x(xbVar.a());
        xbVar.d(this);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void v(byte b8) {
        int i7 = this.f20948g;
        try {
            int i8 = i7 + 1;
            try {
                this.f20946e[i7] = b8;
                this.f20948g = i8;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                i7 = i8;
                throw new ga(i7, this.f20947f, 1, e);
            }
        } catch (IndexOutOfBoundsException e9) {
            e = e9;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void w(int i7) {
        if (i7 >= 0) {
            x(i7);
        } else {
            z(i7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void x(int i7) {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.f20948g;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.f20946e[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e8) {
                    indexOutOfBoundsException = e8;
                    i9 = i8;
                    throw new ga(i9, this.f20947f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                throw new ga(i9, this.f20947f, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.f20946e[i9] = (byte) i7;
        this.f20948g = i8;
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void y(int i7) {
        int i8 = this.f20948g;
        try {
            byte[] bArr = this.f20946e;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.f20948g = i8 + 4;
        } catch (IndexOutOfBoundsException e8) {
            throw new ga(i8, this.f20947f, 4, e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void z(long j7) {
        boolean z7;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        z7 = ha.f21004c;
        int i8 = this.f20948g;
        if (!z7 || this.f20947f - i8 < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    int i9 = i8 + 1;
                    try {
                        this.f20946e[i8] = (byte) (((int) j7) | 128);
                        j7 >>>= 7;
                        i8 = i9;
                    } catch (IndexOutOfBoundsException e8) {
                        indexOutOfBoundsException = e8;
                        i8 = i9;
                        throw new ga(i8, this.f20947f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e9) {
                    indexOutOfBoundsException = e9;
                }
            }
            i7 = i8 + 1;
            try {
                this.f20946e[i8] = (byte) j7;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i8 = i7;
                throw new ga(i8, this.f20947f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j7 & (-128)) != 0) {
                ad.u(this.f20946e, i8, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            ad.u(this.f20946e, i8, (byte) j7);
        }
        this.f20948g = i7;
    }
}
