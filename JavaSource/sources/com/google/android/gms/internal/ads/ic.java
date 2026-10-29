package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: MyApplication */
public final class ic implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final ed f9962a;

    /* renamed from: b, reason: collision with root package name */
    private String f9963b;

    /* renamed from: c, reason: collision with root package name */
    private a4 f9964c;

    /* renamed from: d, reason: collision with root package name */
    private hc f9965d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9966e;

    /* renamed from: l, reason: collision with root package name */
    private long f9973l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f9967f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final tc f9968g = new tc(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final tc f9969h = new tc(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final tc f9970i = new tc(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final tc f9971j = new tc(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final tc f9972k = new tc(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f9974m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final y82 f9975n = new y82();

    public ic(ed edVar, String str) {
        this.f9962a = edVar;
    }

    private final void b(long j7, int i7, int i8, long j8) {
        this.f9965d.b(j7, i7, i8, j8, this.f9966e);
        if (!this.f9966e) {
            this.f9968g.c(i8);
            this.f9969h.c(i8);
            this.f9970i.c(i8);
        }
        this.f9971j.c(i8);
        this.f9972k.c(i8);
    }

    private final void c(byte[] bArr, int i7, int i8) {
        this.f9965d.c(bArr, i7, i8);
        if (!this.f9966e) {
            this.f9968g.d(bArr, i7, i8);
            this.f9969h.d(bArr, i7, i8);
            this.f9970i.d(bArr, i7, i8);
        }
        this.f9971j.d(bArr, i7, i8);
        this.f9972k.d(bArr, i7, i8);
    }

    private final void d(long j7, int i7, int i8, long j8) {
        this.f9965d.d(j7, i7, this.f9966e);
        if (!this.f9966e) {
            tc tcVar = this.f9968g;
            tcVar.e(i8);
            tc tcVar2 = this.f9969h;
            tcVar2.e(i8);
            tc tcVar3 = this.f9970i;
            tcVar3.e(i8);
            if (tcVar.b() && tcVar2.b() && tcVar3.b()) {
                String str = this.f9963b;
                int i9 = tcVar.f16124e;
                byte[] bArr = new byte[tcVar2.f16124e + i9 + tcVar3.f16124e];
                System.arraycopy(tcVar.f16123d, 0, bArr, 0, i9);
                System.arraycopy(tcVar2.f16123d, 0, bArr, tcVar.f16124e, tcVar2.f16124e);
                System.arraycopy(tcVar3.f16123d, 0, bArr, tcVar.f16124e + tcVar2.f16124e, tcVar3.f16124e);
                String str2 = null;
                i03 f8 = p63.f(tcVar2.f16123d, 3, tcVar2.f16124e, null);
                dv2 dv2Var = f8.f9785b;
                if (dv2Var != null) {
                    int i10 = dv2Var.f7328f;
                    int[] iArr = dv2Var.f7327e;
                    int i11 = dv2Var.f7326d;
                    str2 = qe1.b(dv2Var.f7323a, dv2Var.f7324b, dv2Var.f7325c, i11, iArr, i10);
                }
                xn5 xn5Var = new xn5();
                xn5Var.A(str);
                xn5Var.k0("video/mp2t");
                xn5Var.l0("video/hevc");
                xn5Var.i0(str2);
                xn5Var.s0(f8.f9788e);
                xn5Var.t0(f8.f9789f);
                xn5Var.u0(f8.f9790g);
                xn5Var.v0(f8.f9791h);
                lc4 lc4Var = new lc4();
                lc4Var.a(f8.f9794k);
                lc4Var.b(f8.f9795l);
                lc4Var.c(f8.f9796m);
                lc4Var.e(f8.f9786c + 8);
                lc4Var.f(f8.f9787d + 8);
                xn5Var.c(lc4Var.g());
                xn5Var.y0(f8.f9792i);
                xn5Var.n0(f8.f9793j);
                xn5Var.d(f8.f9784a + 1);
                xn5Var.o0(Collections.singletonList(bArr));
                eq5 m7 = xn5Var.m();
                this.f9964c.c(m7);
                int i12 = m7.f7777q;
                rx3.h(i12 != -1);
                this.f9962a.b(i12);
                this.f9966e = true;
            }
        }
        tc tcVar4 = this.f9971j;
        if (tcVar4.e(i8)) {
            int a8 = p63.a(tcVar4.f16123d, tcVar4.f16124e);
            y82 y82Var = this.f9975n;
            y82Var.A(tcVar4.f16123d, a8);
            y82Var.J(5);
            this.f9962a.c(j8, y82Var);
        }
        tc tcVar5 = this.f9972k;
        if (tcVar5.e(i8)) {
            int a9 = p63.a(tcVar5.f16123d, tcVar5.f16124e);
            y82 y82Var2 = this.f9975n;
            y82Var2.A(tcVar5.f16123d, a9);
            y82Var2.J(5);
            this.f9962a.c(j8, y82Var2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
        this.f9964c.getClass();
        String str = hi2.f9535a;
        if (z7) {
            this.f9962a.d();
            d(this.f9973l, 0, 0, this.f9974m);
            b(this.f9973l, 0, 48, this.f9974m);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        this.f9964c.getClass();
        String str = hi2.f9535a;
        while (y82Var.C() > 0) {
            int F = y82Var.F();
            int D = y82Var.D();
            byte[] H = y82Var.H();
            this.f9973l += y82Var.C();
            this.f9964c.e(y82Var, y82Var.C());
            while (F < D) {
                int h8 = p63.h(H, F, D, this.f9967f);
                if (h8 == D) {
                    c(H, F, D);
                    return;
                }
                int i7 = H[h8 + 3] & 126;
                int i8 = 3;
                if (h8 > 0) {
                    int i9 = h8 - 1;
                    if (H[i9] == 0) {
                        i8 = 4;
                        h8 = i9;
                    }
                }
                int i10 = h8 - F;
                if (i10 > 0) {
                    c(H, F, h8);
                }
                int i11 = D - h8;
                long j7 = this.f9973l - i11;
                d(j7, i11, i10 < 0 ? -i10 : 0, this.f9974m);
                b(j7, i11, i7 >> 1, this.f9974m);
                F = h8 + i8;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f9963b = qdVar.c();
        a4 A = p2Var.A(qdVar.b(), 2);
        this.f9964c = A;
        this.f9965d = new hc(A);
        this.f9962a.a(p2Var, qdVar);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f9974m = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f9973l = 0L;
        this.f9974m = -9223372036854775807L;
        p63.i(this.f9967f);
        this.f9968g.a();
        this.f9969h.a();
        this.f9970i.a();
        this.f9971j.a();
        this.f9972k.a();
        this.f9962a.e();
        hc hcVar = this.f9965d;
        if (hcVar != null) {
            hcVar.a();
        }
    }
}
