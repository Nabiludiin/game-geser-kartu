package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class xb implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f18707a;

    /* renamed from: c, reason: collision with root package name */
    private final String f18709c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18710d;

    /* renamed from: f, reason: collision with root package name */
    private String f18712f;

    /* renamed from: g, reason: collision with root package name */
    private a4 f18713g;

    /* renamed from: i, reason: collision with root package name */
    private int f18715i;

    /* renamed from: j, reason: collision with root package name */
    private int f18716j;

    /* renamed from: k, reason: collision with root package name */
    private long f18717k;

    /* renamed from: l, reason: collision with root package name */
    private eq5 f18718l;

    /* renamed from: m, reason: collision with root package name */
    private int f18719m;

    /* renamed from: n, reason: collision with root package name */
    private int f18720n;

    /* renamed from: h, reason: collision with root package name */
    private int f18714h = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f18723q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f18708b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    private int f18721o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f18722p = -1;

    /* renamed from: e, reason: collision with root package name */
    private final String f18711e = "video/mp2t";

    public xb(String str, int i7, int i8, String str2) {
        this.f18707a = new y82(new byte[i8]);
        this.f18709c = str;
        this.f18710d = i7;
    }

    private final boolean b(y82 y82Var, byte[] bArr, int i7) {
        int min = Math.min(y82Var.C(), i7 - this.f18715i);
        y82Var.L(bArr, this.f18715i, min);
        int i8 = this.f18715i + min;
        this.f18715i = i8;
        return i8 == i7;
    }

    private final void c(i2 i2Var) {
        int i7;
        int i8 = i2Var.f9808b;
        if (i8 == -2147483647 || (i7 = i2Var.f9809c) == -1) {
            return;
        }
        eq5 eq5Var = this.f18718l;
        if (eq5Var != null && i7 == eq5Var.G && i8 == eq5Var.H && Objects.equals(i2Var.f9807a, eq5Var.f7775o)) {
            return;
        }
        eq5 eq5Var2 = this.f18718l;
        xn5 xn5Var = eq5Var2 == null ? new xn5() : eq5Var2.a();
        xn5Var.A(this.f18712f);
        xn5Var.k0(this.f18711e);
        xn5Var.l0(i2Var.f9807a);
        xn5Var.e(i7);
        xn5Var.f(i8);
        xn5Var.d0(this.f18709c);
        xn5Var.f0(this.f18710d);
        eq5 m7 = xn5Var.m();
        this.f18718l = m7;
        this.f18713g.c(m7);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        int i7;
        byte b8;
        int i8;
        byte b9;
        this.f18713g.getClass();
        while (y82Var.C() > 0) {
            int i9 = this.f18714h;
            if (i9 == 0) {
                while (true) {
                    if (y82Var.C() > 0) {
                        int i10 = this.f18716j << 8;
                        this.f18716j = i10;
                        int R = i10 | y82Var.R();
                        this.f18716j = R;
                        int a8 = j2.a(R);
                        this.f18720n = a8;
                        if (a8 != 0) {
                            byte[] H = this.f18707a.H();
                            int i11 = this.f18716j;
                            H[0] = (byte) ((i11 >> 24) & 255);
                            H[1] = (byte) ((i11 >> 16) & 255);
                            H[2] = (byte) ((i11 >> 8) & 255);
                            H[3] = (byte) (i11 & 255);
                            this.f18715i = 4;
                            this.f18716j = 0;
                            if (a8 == 3 || a8 == 4) {
                                this.f18714h = 4;
                            } else if (a8 == 1) {
                                this.f18714h = 1;
                            } else {
                                this.f18714h = 2;
                            }
                        }
                    }
                }
            } else if (i9 == 1) {
                y82 y82Var2 = this.f18707a;
                if (b(y82Var, y82Var2.H(), 18)) {
                    byte[] H2 = y82Var2.H();
                    if (this.f18718l == null) {
                        eq5 b10 = j2.b(H2, this.f18712f, this.f18709c, this.f18710d, this.f18711e, null);
                        this.f18718l = b10;
                        this.f18713g.c(b10);
                    }
                    this.f18719m = j2.c(H2);
                    byte b11 = H2[0];
                    if (b11 != -2) {
                        if (b11 == -1) {
                            i7 = (H2[4] & 7) << 4;
                            b9 = H2[7];
                        } else if (b11 != 31) {
                            i7 = (H2[4] & 1) << 6;
                            b8 = H2[5];
                        } else {
                            i7 = (H2[5] & 7) << 4;
                            b9 = H2[6];
                        }
                        i8 = b9 & 60;
                        this.f18717k = m44.a(hi2.O(((i7 | (i8 >> 2)) + 1) * 32, this.f18718l.H));
                        y82Var2.G(0);
                        this.f18713g.e(y82Var2, 18);
                        this.f18714h = 6;
                    } else {
                        i7 = (H2[5] & 1) << 6;
                        b8 = H2[4];
                    }
                    i8 = b8 & 252;
                    this.f18717k = m44.a(hi2.O(((i7 | (i8 >> 2)) + 1) * 32, this.f18718l.H));
                    y82Var2.G(0);
                    this.f18713g.e(y82Var2, 18);
                    this.f18714h = 6;
                }
            } else if (i9 != 2) {
                if (i9 == 3) {
                    y82 y82Var3 = this.f18707a;
                    if (b(y82Var, y82Var3.H(), this.f18721o)) {
                        i2 d8 = j2.d(y82Var3.H());
                        c(d8);
                        this.f18719m = d8.f9810d;
                        long j7 = d8.f9811e;
                        this.f18717k = j7 != -9223372036854775807L ? j7 : 0L;
                        y82Var3.G(0);
                        this.f18713g.e(y82Var3, this.f18721o);
                        this.f18714h = 6;
                    }
                } else if (i9 == 4) {
                    y82 y82Var4 = this.f18707a;
                    if (b(y82Var, y82Var4.H(), 6)) {
                        int g8 = j2.g(y82Var4.H());
                        this.f18722p = g8;
                        int i12 = this.f18715i;
                        if (i12 > g8) {
                            int i13 = i12 - g8;
                            this.f18715i = i12 - i13;
                            y82Var.G(y82Var.F() - i13);
                        }
                        this.f18714h = 5;
                    }
                } else if (i9 != 5) {
                    int min = Math.min(y82Var.C(), this.f18719m - this.f18715i);
                    this.f18713g.e(y82Var, min);
                    int i14 = this.f18715i + min;
                    this.f18715i = i14;
                    if (i14 == this.f18719m) {
                        rx3.h(this.f18723q != -9223372036854775807L);
                        this.f18713g.a(this.f18723q, this.f18720n == 4 ? 0 : 1, this.f18719m, 0, null);
                        this.f18723q += this.f18717k;
                        this.f18714h = 0;
                    }
                } else {
                    y82 y82Var5 = this.f18707a;
                    if (b(y82Var, y82Var5.H(), this.f18722p)) {
                        i2 f8 = j2.f(y82Var5.H(), this.f18708b);
                        if (this.f18720n == 3) {
                            c(f8);
                        }
                        this.f18719m = f8.f9810d;
                        long j8 = f8.f9811e;
                        this.f18717k = j8 != -9223372036854775807L ? j8 : 0L;
                        y82Var5.G(0);
                        this.f18713g.e(y82Var5, this.f18722p);
                        this.f18714h = 6;
                    }
                }
            } else {
                y82 y82Var6 = this.f18707a;
                if (b(y82Var, y82Var6.H(), 7)) {
                    this.f18721o = j2.e(y82Var6.H());
                    this.f18714h = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f18712f = qdVar.c();
        this.f18713g = p2Var.A(qdVar.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f18723q = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f18714h = 0;
        this.f18715i = 0;
        this.f18716j = 0;
        this.f18723q = -9223372036854775807L;
        this.f18708b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
