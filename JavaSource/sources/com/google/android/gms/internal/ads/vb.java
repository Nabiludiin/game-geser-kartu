package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: MyApplication */
public final class vb implements zb {

    /* renamed from: x, reason: collision with root package name */
    private static final byte[] f17493x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17494a;

    /* renamed from: d, reason: collision with root package name */
    private final String f17497d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17498e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17499f;

    /* renamed from: g, reason: collision with root package name */
    private String f17500g;

    /* renamed from: h, reason: collision with root package name */
    private a4 f17501h;

    /* renamed from: i, reason: collision with root package name */
    private a4 f17502i;

    /* renamed from: j, reason: collision with root package name */
    private int f17503j;

    /* renamed from: k, reason: collision with root package name */
    private int f17504k;

    /* renamed from: l, reason: collision with root package name */
    private int f17505l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17506m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17507n;

    /* renamed from: q, reason: collision with root package name */
    private int f17510q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17511r;

    /* renamed from: t, reason: collision with root package name */
    private int f17513t;

    /* renamed from: v, reason: collision with root package name */
    private a4 f17515v;

    /* renamed from: w, reason: collision with root package name */
    private long f17516w;

    /* renamed from: b, reason: collision with root package name */
    private final w72 f17495b = new w72(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final y82 f17496c = new y82(Arrays.copyOf(f17493x, 10));

    /* renamed from: o, reason: collision with root package name */
    private int f17508o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f17509p = -1;

    /* renamed from: s, reason: collision with root package name */
    private long f17512s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    private long f17514u = -9223372036854775807L;

    public vb(boolean z7, String str, int i7, String str2) {
        this.f17494a = z7;
        this.f17497d = str;
        this.f17498e = i7;
        this.f17499f = str2;
        e();
    }

    public static boolean b(int i7) {
        return (i7 & 65526) == 65520;
    }

    private final void c() {
        this.f17507n = false;
        e();
    }

    private final boolean d(y82 y82Var, byte[] bArr, int i7) {
        int min = Math.min(y82Var.C(), i7 - this.f17504k);
        y82Var.L(bArr, this.f17504k, min);
        int i8 = this.f17504k + min;
        this.f17504k = i8;
        return i8 == i7;
    }

    private final void e() {
        this.f17503j = 0;
        this.f17504k = 0;
        this.f17505l = 256;
    }

    private final void f(a4 a4Var, long j7, int i7, int i8) {
        this.f17503j = 4;
        this.f17504k = i7;
        this.f17515v = a4Var;
        this.f17516w = j7;
        this.f17513t = i8;
    }

    private final void g() {
        this.f17503j = 3;
        this.f17504k = 0;
    }

    private static final boolean h(byte b8, byte b9) {
        return b((b9 & 255) | 65280);
    }

    private static final boolean i(y82 y82Var, byte[] bArr, int i7) {
        if (y82Var.C() < i7) {
            return false;
        }
        y82Var.L(bArr, 0, i7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        int i7;
        byte b8;
        char c8;
        int i8;
        int i9;
        boolean z7;
        int i10;
        this.f17501h.getClass();
        String str = hi2.f9535a;
        while (y82Var.C() > 0) {
            int i11 = this.f17503j;
            char c9 = 7;
            int i12 = 3;
            int i13 = 2;
            if (i11 == 0) {
                byte[] H = y82Var.H();
                int F = y82Var.F();
                int D = y82Var.D();
                while (true) {
                    if (F >= D) {
                        y82Var.G(F);
                        break;
                    }
                    i7 = F + 1;
                    b8 = H[F];
                    int i14 = b8 & 255;
                    int i15 = i12;
                    if (this.f17505l != 512 || !h((byte) -1, (byte) i14)) {
                        c8 = c9;
                    } else {
                        if (this.f17507n) {
                            break;
                        }
                        int i16 = F - 1;
                        y82Var.G(F);
                        w72 w72Var = this.f17495b;
                        if (i(y82Var, w72Var.f18098a, 1)) {
                            w72Var.f(4);
                            int j7 = w72Var.j(1);
                            int i17 = this.f17508o;
                            if (i17 == -1 || j7 == i17) {
                                if (this.f17509p != -1) {
                                    if (!i(y82Var, w72Var.f18098a, 1)) {
                                        break;
                                    }
                                    w72Var.f(i13);
                                    if (w72Var.j(4) == this.f17509p) {
                                        y82Var.G(F + 1);
                                    }
                                }
                                if (!i(y82Var, w72Var.f18098a, 4)) {
                                    break;
                                }
                                w72Var.f(14);
                                int j8 = w72Var.j(13);
                                c8 = 7;
                                if (j8 >= 7) {
                                    byte[] H2 = y82Var.H();
                                    int D2 = y82Var.D();
                                    int i18 = i16 + j8;
                                    if (i18 < D2) {
                                        byte b9 = H2[i18];
                                        if (b9 != -1) {
                                            if (b9 == 73) {
                                                int i19 = i18 + 1;
                                                if (i19 == D2) {
                                                    break;
                                                }
                                                if (H2[i19] == 68) {
                                                    int i20 = i18 + 2;
                                                    if (i20 == D2) {
                                                        break;
                                                    } else if (H2[i20] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i21 = i18 + 1;
                                            if (i21 == D2) {
                                                break;
                                            }
                                            byte b10 = H2[i21];
                                            if (h((byte) -1, b10) && ((b10 & 8) >> 3) == j7) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c8 = 7;
                    }
                    int i22 = this.f17505l;
                    int i23 = i22 | i14;
                    if (i23 == 329) {
                        i8 = i15;
                        i9 = 2;
                        z7 = false;
                        i10 = 768;
                    } else if (i23 == 511) {
                        i8 = i15;
                        i9 = 2;
                        z7 = false;
                        i10 = 512;
                    } else if (i23 == 836) {
                        i8 = i15;
                        i9 = 2;
                        z7 = false;
                        i10 = 1024;
                    } else {
                        if (i23 == 1075) {
                            this.f17503j = 2;
                            this.f17504k = i15;
                            this.f17513t = 0;
                            this.f17496c.G(0);
                            y82Var.G(i7);
                            break;
                        }
                        if (i22 != 256) {
                            this.f17505l = 256;
                            c9 = c8;
                            i12 = i15;
                            i13 = 2;
                        } else {
                            i8 = i15;
                            i9 = 2;
                            z7 = false;
                            F = i7;
                            i12 = i8;
                            c9 = c8;
                            i13 = i9;
                        }
                    }
                    this.f17505l = i10;
                    F = i7;
                    i12 = i8;
                    c9 = c8;
                    i13 = i9;
                }
                this.f17510q = (b8 & 8) >> 3;
                this.f17506m = 1 == ((b8 & 1) ^ 1);
                if (this.f17507n) {
                    g();
                } else {
                    this.f17503j = 1;
                    this.f17504k = 0;
                }
                y82Var.G(i7);
            } else if (i11 != 1) {
                if (i11 == 2) {
                    y82 y82Var2 = this.f17496c;
                    if (d(y82Var, y82Var2.H(), 10)) {
                        this.f17502i.e(y82Var2, 10);
                        y82Var2.G(6);
                        f(this.f17502i, 0L, 10, y82Var2.g() + 10);
                    }
                } else if (i11 != 3) {
                    int min = Math.min(y82Var.C(), this.f17513t - this.f17504k);
                    this.f17515v.e(y82Var, min);
                    int i24 = this.f17504k + min;
                    this.f17504k = i24;
                    if (i24 == this.f17513t) {
                        rx3.h(this.f17514u != -9223372036854775807L);
                        this.f17515v.a(this.f17514u, 1, this.f17513t, 0, null);
                        this.f17514u += this.f17516w;
                        e();
                    }
                } else {
                    int i25 = true != this.f17506m ? 5 : 7;
                    w72 w72Var2 = this.f17495b;
                    if (d(y82Var, w72Var2.f18098a, i25)) {
                        w72Var2.f(0);
                        if (this.f17511r) {
                            w72Var2.h(10);
                        } else {
                            int j9 = w72Var2.j(2) + 1;
                            if (j9 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(j9);
                                sb.append(", but assuming AAC LC.");
                                gv1.c("AdtsReader", sb.toString());
                            }
                            w72Var2.h(5);
                            int j10 = w72Var2.j(3);
                            int i26 = this.f17509p;
                            byte[] bArr = {(byte) (((i26 >> 1) & 7) | 16), (byte) (((j10 << 3) & 120) | ((i26 << 7) & 128))};
                            g1 a8 = h1.a(bArr);
                            xn5 xn5Var = new xn5();
                            xn5Var.A(this.f17500g);
                            xn5Var.k0(this.f17499f);
                            xn5Var.l0("audio/mp4a-latm");
                            xn5Var.i0(a8.f8597c);
                            xn5Var.e(a8.f8596b);
                            xn5Var.f(a8.f8595a);
                            xn5Var.o0(Collections.singletonList(bArr));
                            xn5Var.d0(this.f17497d);
                            xn5Var.f0(this.f17498e);
                            eq5 m7 = xn5Var.m();
                            this.f17512s = 1024000000 / m7.H;
                            this.f17501h.c(m7);
                            this.f17511r = true;
                        }
                        w72Var2.h(4);
                        int j11 = w72Var2.j(13);
                        int i27 = j11 - 7;
                        if (this.f17506m) {
                            i27 = j11 - 9;
                        }
                        f(this.f17501h, this.f17512s, 0, i27);
                    }
                }
            } else if (y82Var.C() != 0) {
                w72 w72Var3 = this.f17495b;
                w72Var3.f18098a[0] = y82Var.H()[y82Var.F()];
                w72Var3.f(2);
                int j12 = w72Var3.j(4);
                int i28 = this.f17509p;
                if (i28 == -1 || j12 == i28) {
                    if (!this.f17507n) {
                        this.f17507n = true;
                        this.f17508o = this.f17510q;
                        this.f17509p = j12;
                    }
                    g();
                } else {
                    c();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f17500g = qdVar.c();
        a4 A = p2Var.A(qdVar.b(), 1);
        this.f17501h = A;
        this.f17515v = A;
        if (!this.f17494a) {
            this.f17502i = new h2();
            return;
        }
        qdVar.a();
        a4 A2 = p2Var.A(qdVar.b(), 5);
        this.f17502i = A2;
        xn5 xn5Var = new xn5();
        xn5Var.A(qdVar.c());
        xn5Var.k0(this.f17499f);
        xn5Var.l0("application/id3");
        A2.c(xn5Var.m());
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f17514u = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f17514u = -9223372036854775807L;
        c();
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
