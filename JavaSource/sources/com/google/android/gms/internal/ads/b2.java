package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class b2 implements n2 {

    /* renamed from: b, reason: collision with root package name */
    private final y95 f5498b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5499c;

    /* renamed from: d, reason: collision with root package name */
    private long f5500d;

    /* renamed from: f, reason: collision with root package name */
    private int f5502f;

    /* renamed from: g, reason: collision with root package name */
    private int f5503g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f5501e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5497a = new byte[4096];

    static {
        ka.b("media3.extractor");
    }

    public b2(y95 y95Var, long j7, long j8) {
        this.f5498b = y95Var;
        this.f5500d = j7;
        this.f5499c = j8;
    }

    private final void e(int i7) {
        int i8 = this.f5502f + i7;
        int length = this.f5501e.length;
        if (i8 > length) {
            String str = hi2.f9535a;
            this.f5501e = Arrays.copyOf(this.f5501e, Math.max(65536 + i8, Math.min(length + length, i8 + 524288)));
        }
    }

    private final int f(int i7) {
        int min = Math.min(this.f5503g, i7);
        j(min);
        return min;
    }

    private final int g(byte[] bArr, int i7, int i8) {
        int i9 = this.f5503g;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.f5501e, 0, bArr, i7, min);
        j(min);
        return min;
    }

    private final void j(int i7) {
        int i8 = this.f5503g - i7;
        this.f5503g = i8;
        this.f5502f = 0;
        byte[] bArr = this.f5501e;
        byte[] bArr2 = i8 < bArr.length + (-524288) ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f5501e = bArr2;
    }

    private final int l(byte[] bArr, int i7, int i8, int i9, boolean z7) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int r7 = this.f5498b.r(bArr, i7 + i9, i8 - i9);
        if (r7 != -1) {
            return i9 + r7;
        }
        if (i9 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    private final void m(int i7) {
        if (i7 != -1) {
            this.f5500d += i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void B(int i7) {
        t(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void P(int i7) {
        c(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int V(int i7) {
        int f8 = f(1);
        if (f8 == 0) {
            f8 = l(this.f5497a, 0, Math.min(1, 4096), 0, true);
        }
        m(f8);
        return f8;
    }

    public final boolean c(int i7, boolean z7) {
        e(i7);
        int i8 = this.f5503g - this.f5502f;
        while (i8 < i7) {
            int i9 = i7;
            boolean z8 = z7;
            i8 = l(this.f5501e, this.f5502f, i9, i8, z8);
            if (i8 == -1) {
                return false;
            }
            this.f5503g = this.f5502f + i8;
            i7 = i9;
            z7 = z8;
        }
        this.f5502f += i7;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void k() {
        this.f5502f = 0;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long n() {
        return this.f5500d + this.f5502f;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long o() {
        return this.f5500d;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long q() {
        return this.f5499c;
    }

    @Override // com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        int g8 = g(bArr, i7, i8);
        if (g8 == 0) {
            g8 = l(bArr, i7, i8, 0, true);
        }
        m(g8);
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void s(byte[] bArr, int i7, int i8) {
        v(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean t(int i7, boolean z7) {
        int f8 = f(i7);
        while (f8 < i7 && f8 != -1) {
            f8 = l(this.f5497a, -f8, Math.min(i7, f8 + 4096), f8, z7);
        }
        m(f8);
        return f8 != -1;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void u(byte[] bArr, int i7, int i8) {
        x(bArr, i7, i8, false);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean v(byte[] bArr, int i7, int i8, boolean z7) {
        int g8 = g(bArr, i7, i8);
        while (g8 < i8 && g8 != -1) {
            g8 = l(bArr, i7, i8, g8, z7);
        }
        m(g8);
        return g8 != -1;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int w(byte[] bArr, int i7, int i8) {
        b2 b2Var;
        int min;
        e(i8);
        int i9 = this.f5503g;
        int i10 = this.f5502f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            b2Var = this;
            min = b2Var.l(this.f5501e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            b2Var.f5503g += min;
        } else {
            b2Var = this;
            min = Math.min(i8, i11);
        }
        System.arraycopy(b2Var.f5501e, b2Var.f5502f, bArr, i7, min);
        b2Var.f5502f += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean x(byte[] bArr, int i7, int i8, boolean z7) {
        if (!c(i8, z7)) {
            return false;
        }
        System.arraycopy(this.f5501e, this.f5502f - i8, bArr, i7, i8);
        return true;
    }
}
