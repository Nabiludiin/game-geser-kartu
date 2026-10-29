package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: MyApplication */
final class kr5 {

    /* renamed from: a, reason: collision with root package name */
    private final ku5 f11213a;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f11214b = new y82(32);

    /* renamed from: c, reason: collision with root package name */
    private jr5 f11215c;

    /* renamed from: d, reason: collision with root package name */
    private jr5 f11216d;

    /* renamed from: e, reason: collision with root package name */
    private jr5 f11217e;

    /* renamed from: f, reason: collision with root package name */
    private long f11218f;

    public kr5(ku5 ku5Var) {
        this.f11213a = ku5Var;
        jr5 jr5Var = new jr5(0L, 65536);
        this.f11215c = jr5Var;
        this.f11216d = jr5Var;
        this.f11217e = jr5Var;
    }

    private final int i(int i7) {
        jr5 jr5Var = this.f11217e;
        if (jr5Var.f10728c == null) {
            iu5 a8 = this.f11213a.a();
            jr5 jr5Var2 = new jr5(this.f11217e.f10727b, 65536);
            jr5Var.f10728c = a8;
            jr5Var.f10729d = jr5Var2;
        }
        return Math.min(i7, (int) (this.f11217e.f10727b - this.f11218f));
    }

    private final void j(int i7) {
        long j7 = this.f11218f + i7;
        this.f11218f = j7;
        jr5 jr5Var = this.f11217e;
        if (j7 == jr5Var.f10727b) {
            this.f11217e = jr5Var.f10729d;
        }
    }

    private static jr5 k(jr5 jr5Var, wj4 wj4Var, lr5 lr5Var, y82 y82Var) {
        jr5 jr5Var2;
        if (wj4Var.k()) {
            long j7 = lr5Var.f11760b;
            int i7 = 1;
            y82Var.z(1);
            jr5 m7 = m(jr5Var, j7, y82Var.H(), 1);
            long j8 = j7 + 1;
            byte b8 = y82Var.H()[0];
            int i8 = b8 & 128;
            int i9 = b8 & Byte.MAX_VALUE;
            tg4 tg4Var = wj4Var.f18270c;
            byte[] bArr = tg4Var.f16182a;
            if (bArr == null) {
                tg4Var.f16182a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z7 = i8 != 0;
            jr5Var2 = m(m7, j8, tg4Var.f16182a, i9);
            long j9 = j8 + i9;
            if (z7) {
                y82Var.z(2);
                jr5Var2 = m(jr5Var2, j9, y82Var.H(), 2);
                j9 += 2;
                i7 = y82Var.S();
            }
            int i10 = i7;
            int[] iArr = tg4Var.f16185d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = tg4Var.f16186e;
            if (iArr3 == null || iArr3.length < i10) {
                iArr3 = new int[i10];
            }
            int[] iArr4 = iArr3;
            if (z7) {
                int i11 = i10 * 6;
                y82Var.z(i11);
                jr5Var2 = m(jr5Var2, j9, y82Var.H(), i11);
                j9 += i11;
                y82Var.G(0);
                for (int i12 = 0; i12 < i10; i12++) {
                    iArr2[i12] = y82Var.S();
                    iArr4[i12] = y82Var.h();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = lr5Var.f11759a - ((int) (j9 - lr5Var.f11760b));
            }
            y3 y3Var = lr5Var.f11761c;
            String str = hi2.f9535a;
            tg4Var.a(i10, iArr2, iArr4, y3Var.f19347b, tg4Var.f16182a, y3Var.f19346a, y3Var.f19348c, y3Var.f19349d);
            long j10 = lr5Var.f11760b;
            int i13 = (int) (j9 - j10);
            lr5Var.f11760b = j10 + i13;
            lr5Var.f11759a -= i13;
        } else {
            jr5Var2 = jr5Var;
        }
        if (!wj4Var.e()) {
            wj4Var.j(lr5Var.f11759a);
            return l(jr5Var2, lr5Var.f11760b, wj4Var.f18271d, lr5Var.f11759a);
        }
        y82Var.z(4);
        jr5 m8 = m(jr5Var2, lr5Var.f11760b, y82Var.H(), 4);
        int h8 = y82Var.h();
        lr5Var.f11760b += 4;
        lr5Var.f11759a -= 4;
        wj4Var.j(h8);
        jr5 l7 = l(m8, lr5Var.f11760b, wj4Var.f18271d, h8);
        lr5Var.f11760b += h8;
        int i14 = lr5Var.f11759a - h8;
        lr5Var.f11759a = i14;
        ByteBuffer byteBuffer = wj4Var.f18274g;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            wj4Var.f18274g = ByteBuffer.allocate(i14);
        } else {
            wj4Var.f18274g.clear();
        }
        return l(l7, lr5Var.f11760b, wj4Var.f18274g, lr5Var.f11759a);
    }

    private static jr5 l(jr5 jr5Var, long j7, ByteBuffer byteBuffer, int i7) {
        jr5 n7 = n(jr5Var, j7);
        while (i7 > 0) {
            int min = Math.min(i7, (int) (n7.f10727b - j7));
            byteBuffer.put(n7.f10728c.f10215a, n7.b(j7), min);
            i7 -= min;
            j7 += min;
            if (j7 == n7.f10727b) {
                n7 = n7.f10729d;
            }
        }
        return n7;
    }

    private static jr5 m(jr5 jr5Var, long j7, byte[] bArr, int i7) {
        jr5 n7 = n(jr5Var, j7);
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (n7.f10727b - j7));
            System.arraycopy(n7.f10728c.f10215a, n7.b(j7), bArr, i7 - i8, min);
            i8 -= min;
            j7 += min;
            if (j7 == n7.f10727b) {
                n7 = n7.f10729d;
            }
        }
        return n7;
    }

    private static jr5 n(jr5 jr5Var, long j7) {
        while (j7 >= jr5Var.f10727b) {
            jr5Var = jr5Var.f10729d;
        }
        return jr5Var;
    }

    public final void a() {
        jr5 jr5Var = this.f11215c;
        if (jr5Var.f10728c != null) {
            this.f11213a.c(jr5Var);
            jr5Var.d();
        }
        this.f11215c.a(0L, 65536);
        jr5 jr5Var2 = this.f11215c;
        this.f11216d = jr5Var2;
        this.f11217e = jr5Var2;
        this.f11218f = 0L;
        this.f11213a.h();
    }

    public final void b() {
        this.f11216d = this.f11215c;
    }

    public final void c(wj4 wj4Var, lr5 lr5Var) {
        this.f11216d = k(this.f11216d, wj4Var, lr5Var, this.f11214b);
    }

    public final void d(wj4 wj4Var, lr5 lr5Var) {
        k(this.f11216d, wj4Var, lr5Var, this.f11214b);
    }

    public final void e(long j7) {
        jr5 jr5Var;
        if (j7 != -1) {
            while (true) {
                jr5Var = this.f11215c;
                if (j7 < jr5Var.f10727b) {
                    break;
                }
                this.f11213a.b(jr5Var.f10728c);
                this.f11215c = this.f11215c.d();
            }
            if (this.f11216d.f10726a < jr5Var.f10726a) {
                this.f11216d = jr5Var;
            }
        }
    }

    public final long f() {
        return this.f11218f;
    }

    public final int g(y95 y95Var, int i7, boolean z7) {
        int i8 = i(i7);
        jr5 jr5Var = this.f11217e;
        int r7 = y95Var.r(jr5Var.f10728c.f10215a, jr5Var.b(this.f11218f), i8);
        if (r7 != -1) {
            j(r7);
            return r7;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(y82 y82Var, int i7) {
        while (i7 > 0) {
            int i8 = i(i7);
            jr5 jr5Var = this.f11217e;
            y82Var.L(jr5Var.f10728c.f10215a, jr5Var.b(this.f11218f), i8);
            i7 -= i8;
            j(i8);
        }
    }
}
