package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class gc implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final ed f8760a;

    /* renamed from: f, reason: collision with root package name */
    private long f8765f;

    /* renamed from: h, reason: collision with root package name */
    private String f8767h;

    /* renamed from: i, reason: collision with root package name */
    private a4 f8768i;

    /* renamed from: j, reason: collision with root package name */
    private fc f8769j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8770k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8772m;

    /* renamed from: b, reason: collision with root package name */
    private final String f8761b = "video/mp2t";

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f8766g = new boolean[3];

    /* renamed from: c, reason: collision with root package name */
    private final tc f8762c = new tc(7, 128);

    /* renamed from: d, reason: collision with root package name */
    private final tc f8763d = new tc(8, 128);

    /* renamed from: e, reason: collision with root package name */
    private final tc f8764e = new tc(6, 128);

    /* renamed from: l, reason: collision with root package name */
    private long f8771l = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final y82 f8773n = new y82();

    public gc(ed edVar, boolean z7, boolean z8, String str) {
        this.f8760a = edVar;
    }

    private final void b(long j7, int i7, long j8) {
        if (!this.f8770k) {
            this.f8762c.c(i7);
            this.f8763d.c(i7);
        }
        this.f8764e.c(i7);
        this.f8769j.d(j7, i7, j8, this.f8772m);
    }

    private final void c(byte[] bArr, int i7, int i8) {
        if (!this.f8770k) {
            this.f8762c.d(bArr, i7, i8);
            this.f8763d.d(bArr, i7, i8);
        }
        this.f8764e.d(bArr, i7, i8);
    }

    private final void d(long j7, int i7, int i8, long j8) {
        if (!this.f8770k) {
            tc tcVar = this.f8762c;
            tcVar.e(i8);
            tc tcVar2 = this.f8763d;
            tcVar2.e(i8);
            if (this.f8770k) {
                if (tcVar.b()) {
                    n53 d8 = p63.d(tcVar.f16123d, 4, tcVar.f16124e);
                    this.f8760a.b(d8.f12591m);
                    this.f8769j.a(d8);
                    tcVar.a();
                } else if (tcVar2.b()) {
                    this.f8769j.b(p63.g(tcVar2.f16123d, 4, tcVar2.f16124e));
                    tcVar2.a();
                }
            } else if (tcVar.b() && tcVar2.b()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(tcVar.f16123d, tcVar.f16124e));
                arrayList.add(Arrays.copyOf(tcVar2.f16123d, tcVar2.f16124e));
                n53 d9 = p63.d(tcVar.f16123d, 4, tcVar.f16124e);
                m43 g8 = p63.g(tcVar2.f16123d, 4, tcVar2.f16124e);
                String a8 = qe1.a(d9.f12579a, d9.f12580b, d9.f12581c);
                a4 a4Var = this.f8768i;
                xn5 xn5Var = new xn5();
                xn5Var.A(this.f8767h);
                xn5Var.k0(this.f8761b);
                xn5Var.l0("video/avc");
                xn5Var.i0(a8);
                xn5Var.s0(d9.f12583e);
                xn5Var.t0(d9.f12584f);
                lc4 lc4Var = new lc4();
                lc4Var.a(d9.f12588j);
                lc4Var.b(d9.f12589k);
                lc4Var.c(d9.f12590l);
                lc4Var.e(d9.f12586h + 8);
                lc4Var.f(d9.f12587i + 8);
                xn5Var.c(lc4Var.g());
                xn5Var.y0(d9.f12585g);
                xn5Var.o0(arrayList);
                int i9 = d9.f12591m;
                xn5Var.n0(i9);
                a4Var.c(xn5Var.m());
                this.f8770k = true;
                this.f8760a.b(i9);
                this.f8769j.a(d9);
                this.f8769j.b(g8);
                tcVar.a();
                tcVar2.a();
            }
        }
        tc tcVar3 = this.f8764e;
        if (tcVar3.e(i8)) {
            int a9 = p63.a(tcVar3.f16123d, tcVar3.f16124e);
            y82 y82Var = this.f8773n;
            y82Var.A(tcVar3.f16123d, a9);
            y82Var.G(4);
            this.f8760a.c(j8, y82Var);
        }
        if (this.f8769j.e(j7, i7, this.f8770k)) {
            this.f8772m = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
        this.f8768i.getClass();
        String str = hi2.f9535a;
        if (z7) {
            this.f8760a.d();
            d(this.f8765f, 0, 0, this.f8771l);
            b(this.f8765f, 9, this.f8771l);
            d(this.f8765f, 0, 0, this.f8771l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // com.google.android.gms.internal.ads.zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(com.google.android.gms.internal.ads.y82 r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.a4 r1 = r14.f8768i
            r1.getClass()
            java.lang.String r1 = com.google.android.gms.internal.ads.hi2.f9535a
            int r1 = r15.F()
            int r7 = r15.D()
            byte[] r8 = r15.H()
            long r2 = r14.f8765f
            int r4 = r15.C()
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.f8765f = r2
            com.google.android.gms.internal.ads.a4 r2 = r14.f8768i
            int r3 = r15.C()
            r2.e(r15, r3)
        L26:
            boolean[] r2 = r14.f8766g
            int r2 = com.google.android.gms.internal.ads.p63.h(r8, r1, r7, r2)
            if (r2 == r7) goto L68
            int r3 = r2 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r2 <= 0) goto L41
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L41
            r3 = 4
            r11 = r3
            r10 = r4
            goto L43
        L41:
            r10 = r2
            r11 = r3
        L43:
            int r2 = r10 - r1
            if (r2 <= 0) goto L4a
            r14.c(r8, r1, r10)
        L4a:
            int r3 = r7 - r10
            long r4 = r14.f8765f
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r2 >= 0) goto L55
            int r1 = -r2
        L53:
            r12 = r4
            goto L57
        L55:
            r1 = 0
            goto L53
        L57:
            long r5 = r14.f8771l
            r0 = r14
            r4 = r1
            r1 = r12
            r0.d(r1, r3, r4, r5)
            long r4 = r14.f8771l
            r3 = r9
            r0.b(r1, r3, r4)
            int r1 = r10 + r11
            goto L26
        L68:
            r14.c(r8, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gc.B0(com.google.android.gms.internal.ads.y82):void");
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f8767h = qdVar.c();
        a4 A = p2Var.A(qdVar.b(), 2);
        this.f8768i = A;
        this.f8769j = new fc(A, false, false);
        this.f8760a.a(p2Var, qdVar);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f8771l = j7;
        int i8 = i7 & 2;
        this.f8772m = (i8 != 0) | this.f8772m;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f8765f = 0L;
        this.f8772m = false;
        this.f8771l = -9223372036854775807L;
        p63.i(this.f8766g);
        this.f8762c.a();
        this.f8763d.a();
        this.f8764e.a();
        this.f8760a.e();
        fc fcVar = this.f8769j;
        if (fcVar != null) {
            fcVar.c();
        }
    }
}
