package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class vc implements rd {

    /* renamed from: a, reason: collision with root package name */
    private final zb f17542a;

    /* renamed from: b, reason: collision with root package name */
    private final w72 f17543b = new w72(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f17544c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f17545d;

    /* renamed from: e, reason: collision with root package name */
    private ef2 f17546e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17547f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17548g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17549h;

    /* renamed from: i, reason: collision with root package name */
    private int f17550i;

    /* renamed from: j, reason: collision with root package name */
    private int f17551j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17552k;

    public vc(zb zbVar) {
        this.f17542a = zbVar;
    }

    private final void e(int i7) {
        this.f17544c = i7;
        this.f17545d = 0;
    }

    private final boolean f(y82 y82Var, byte[] bArr, int i7) {
        int min = Math.min(y82Var.C(), i7 - this.f17545d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            y82Var.J(min);
        } else {
            y82Var.L(bArr, this.f17545d, min);
        }
        int i8 = this.f17545d + min;
        this.f17545d = i8;
        return i8 == i7;
    }

    @Override // com.google.android.gms.internal.ads.rd
    public final void a(ef2 ef2Var, p2 p2Var, qd qdVar) {
        this.f17546e = ef2Var;
        this.f17542a.C0(p2Var, qdVar);
    }

    @Override // com.google.android.gms.internal.ads.rd
    public final void b() {
        this.f17544c = 0;
        this.f17545d = 0;
        this.f17549h = false;
        this.f17542a.a();
    }

    @Override // com.google.android.gms.internal.ads.rd
    public final void c(y82 y82Var, int i7) {
        int i8;
        int i9;
        long j7;
        long j8;
        this.f17546e.getClass();
        int i10 = -1;
        int i11 = 2;
        if ((i7 & 1) != 0) {
            int i12 = this.f17544c;
            if (i12 != 0 && i12 != 1) {
                if (i12 != 2) {
                    int i13 = this.f17551j;
                    if (i13 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i13).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i13);
                        sb.append(" more bytes");
                        gv1.c("PesReader", sb.toString());
                    }
                    this.f17542a.A0(y82Var.D() == 0);
                } else {
                    gv1.c("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            e(1);
        }
        int i14 = i7;
        while (y82Var.C() > 0) {
            int i15 = this.f17544c;
            if (i15 == 0) {
                i8 = i11;
                y82Var.J(y82Var.C());
            } else if (i15 != 1) {
                if (i15 != i11) {
                    int C = y82Var.C();
                    int i16 = this.f17551j;
                    int i17 = i16 == i10 ? 0 : C - i16;
                    if (i17 > 0) {
                        C -= i17;
                        y82Var.E(y82Var.F() + C);
                    }
                    zb zbVar = this.f17542a;
                    zbVar.B0(y82Var);
                    int i18 = this.f17551j;
                    if (i18 != i10) {
                        int i19 = i18 - C;
                        this.f17551j = i19;
                        if (i19 == 0) {
                            zbVar.A0(false);
                            e(1);
                        }
                    }
                } else {
                    int min = Math.min(10, this.f17550i);
                    w72 w72Var = this.f17543b;
                    if (f(y82Var, w72Var.f18098a, min) && f(y82Var, null, this.f17550i)) {
                        w72Var.f(0);
                        if (this.f17547f) {
                            w72Var.h(4);
                            long j9 = w72Var.j(3);
                            w72Var.h(1);
                            int j10 = w72Var.j(15) << 15;
                            w72Var.h(1);
                            long j11 = w72Var.j(15);
                            w72Var.h(1);
                            if (this.f17549h || !this.f17548g) {
                                j8 = j9;
                            } else {
                                w72Var.h(4);
                                j8 = j9;
                                w72Var.h(1);
                                int j12 = w72Var.j(15) << 15;
                                w72Var.h(1);
                                long j13 = w72Var.j(15);
                                w72Var.h(1);
                                this.f17546e.e((w72Var.j(3) << 30) | j12 | j13);
                                this.f17549h = true;
                            }
                            j7 = this.f17546e.e(j11 | (j8 << 30) | j10);
                        } else {
                            j7 = -9223372036854775807L;
                        }
                        i14 |= true != this.f17552k ? 0 : 4;
                        this.f17542a.D0(j7, i14);
                        e(3);
                        i10 = -1;
                        i11 = 2;
                    }
                }
                i8 = i11;
            } else {
                w72 w72Var2 = this.f17543b;
                if (f(y82Var, w72Var2.f18098a, 9)) {
                    w72Var2.f(0);
                    int j14 = w72Var2.j(24);
                    if (j14 != 1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j14).length() + 30);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(j14);
                        gv1.c("PesReader", sb2.toString());
                        i10 = -1;
                        this.f17551j = -1;
                        i9 = 0;
                        i8 = 2;
                    } else {
                        w72Var2.h(8);
                        int j15 = w72Var2.j(16);
                        w72Var2.h(5);
                        this.f17552k = w72Var2.i();
                        i8 = 2;
                        w72Var2.h(2);
                        this.f17547f = w72Var2.i();
                        this.f17548g = w72Var2.i();
                        w72Var2.h(6);
                        int j16 = w72Var2.j(8);
                        this.f17550i = j16;
                        if (j15 == 0) {
                            this.f17551j = -1;
                            i10 = -1;
                        } else {
                            int i20 = (j15 - 3) - j16;
                            this.f17551j = i20;
                            if (i20 < 0) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i20).length() + 36);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i20);
                                gv1.c("PesReader", sb3.toString());
                                i10 = -1;
                                this.f17551j = -1;
                            } else {
                                i10 = -1;
                            }
                        }
                        i9 = 2;
                    }
                    e(i9);
                } else {
                    i10 = -1;
                    i8 = 2;
                }
            }
            i11 = i8;
        }
    }

    public final boolean d(boolean z7) {
        return this.f17544c == 3 && this.f17551j == -1;
    }
}
