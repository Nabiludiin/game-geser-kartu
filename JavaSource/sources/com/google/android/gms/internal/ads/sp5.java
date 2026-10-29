package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sp5 extends cs5 {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f15741l;

    /* renamed from: m, reason: collision with root package name */
    private final yx f15742m;

    /* renamed from: n, reason: collision with root package name */
    private final ot f15743n;

    /* renamed from: o, reason: collision with root package name */
    private qp5 f15744o;

    /* renamed from: p, reason: collision with root package name */
    private pp5 f15745p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15746q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15747r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15748s;

    public sp5(aq5 aq5Var, boolean z7) {
        super(aq5Var);
        boolean z8;
        if (z7) {
            aq5Var.U();
            z8 = true;
        } else {
            z8 = false;
        }
        this.f15741l = z8;
        this.f15742m = new yx();
        this.f15743n = new ot();
        aq5Var.M();
        this.f15744o = qp5.p(aq5Var.V());
    }

    private final Object H(Object obj) {
        return (this.f15744o.s() == null || !obj.equals(qp5.f14553e)) ? obj : this.f15744o.s();
    }

    private final boolean I(long j7) {
        pp5 pp5Var = this.f15745p;
        int e8 = this.f15744o.e(pp5Var.f14004q.f18924a);
        if (e8 == -1) {
            return false;
        }
        qp5 qp5Var = this.f15744o;
        ot otVar = this.f15743n;
        qp5Var.d(e8, otVar, false);
        long j8 = otVar.f13478d;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        pp5Var.l(j7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.cs5
    public final void D() {
        if (this.f15741l) {
            return;
        }
        this.f15746q = true;
        z(null, this.f6609k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r6 != 0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.cs5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void E(com.google.android.gms.internal.ads.az r12) {
        /*
            r11 = this;
            boolean r0 = r11.f15747r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.qp5 r0 = r11.f15744o
            com.google.android.gms.internal.ads.qp5 r12 = r0.r(r12)
            r11.f15744o = r12
            com.google.android.gms.internal.ads.pp5 r12 = r11.f15745p
            if (r12 == 0) goto L97
            long r2 = r12.m()
            r11.I(r2)
            goto L97
        L1a:
            boolean r0 = r12.g()
            if (r0 == 0) goto L36
            boolean r0 = r11.f15748s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.qp5 r0 = r11.f15744o
            com.google.android.gms.internal.ads.qp5 r12 = r0.r(r12)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.yx.f19894o
            java.lang.Object r2 = com.google.android.gms.internal.ads.qp5.f14553e
            com.google.android.gms.internal.ads.qp5 r12 = com.google.android.gms.internal.ads.qp5.q(r12, r0, r2)
        L33:
            r11.f15744o = r12
            goto L97
        L36:
            com.google.android.gms.internal.ads.yx r3 = r11.f15742m
            r0 = 0
            r4 = 0
            r12.b(r0, r3, r4)
            java.lang.Object r8 = r3.f19896a
            com.google.android.gms.internal.ads.pp5 r2 = r11.f15745p
            if (r2 == 0) goto L5d
            long r6 = r2.i()
            com.google.android.gms.internal.ads.qp5 r9 = r11.f15744o
            com.google.android.gms.internal.ads.ot r10 = r11.f15743n
            com.google.android.gms.internal.ads.xp5 r2 = r2.f14004q
            java.lang.Object r2 = r2.f18924a
            r9.o(r2, r10)
            com.google.android.gms.internal.ads.qp5 r2 = r11.f15744o
            r2.b(r0, r3, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r6 = r4
        L5e:
            com.google.android.gms.internal.ads.ot r4 = r11.f15743n
            r5 = 0
            r2 = r12
            android.util.Pair r12 = r2.m(r3, r4, r5, r6)
            java.lang.Object r0 = r12.first
            java.lang.Object r12 = r12.second
            java.lang.Long r12 = (java.lang.Long) r12
            long r3 = r12.longValue()
            boolean r12 = r11.f15748s
            if (r12 == 0) goto L7b
            com.google.android.gms.internal.ads.qp5 r12 = r11.f15744o
            com.google.android.gms.internal.ads.qp5 r12 = r12.r(r2)
            goto L7f
        L7b:
            com.google.android.gms.internal.ads.qp5 r12 = com.google.android.gms.internal.ads.qp5.q(r2, r8, r0)
        L7f:
            r11.f15744o = r12
            com.google.android.gms.internal.ads.pp5 r12 = r11.f15745p
            if (r12 == 0) goto L97
            boolean r0 = r11.I(r3)
            if (r0 == 0) goto L97
            com.google.android.gms.internal.ads.xp5 r12 = r12.f14004q
            java.lang.Object r0 = r12.f18924a
            java.lang.Object r0 = r11.H(r0)
            com.google.android.gms.internal.ads.xp5 r1 = r12.a(r0)
        L97:
            r12 = 1
            r11.f15748s = r12
            r11.f15747r = r12
            com.google.android.gms.internal.ads.qp5 r12 = r11.f15744o
            r11.q(r12)
            if (r1 == 0) goto Lab
            com.google.android.gms.internal.ads.pp5 r12 = r11.f15745p
            r12.getClass()
            r12.t(r1)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sp5.E(com.google.android.gms.internal.ads.az):void");
    }

    @Override // com.google.android.gms.internal.ads.cs5
    protected final xp5 F(xp5 xp5Var) {
        Object s7 = this.f15744o.s();
        Object obj = xp5Var.f18924a;
        if (s7 != null && this.f15744o.s().equals(obj)) {
            obj = qp5.f14553e;
        }
        return xp5Var.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.aq5
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final pp5 f(xp5 xp5Var, ku5 ku5Var, long j7) {
        pp5 pp5Var = new pp5(xp5Var, ku5Var, j7);
        pp5Var.q(this.f6609k);
        if (this.f15747r) {
            pp5Var.t(xp5Var.a(H(xp5Var.f18924a)));
            return pp5Var;
        }
        this.f15745p = pp5Var;
        if (!this.f15746q) {
            this.f15746q = true;
            z(null, this.f6609k);
        }
        return pp5Var;
    }

    public final az J() {
        return this.f15744o;
    }

    @Override // com.google.android.gms.internal.ads.cs5, com.google.android.gms.internal.ads.aq5
    public final void h(vp5 vp5Var) {
        ((pp5) vp5Var).u();
        if (vp5Var == this.f15745p) {
            this.f15745p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.aq5
    public final void i(j9 j9Var) {
        if (this.f15748s) {
            this.f15744o = this.f15744o.r(new yr5(this.f15744o.f11719b, j9Var));
        } else {
            this.f15744o = qp5.p(j9Var);
        }
        this.f6609k.i(j9Var);
    }

    @Override // com.google.android.gms.internal.ads.fp5, com.google.android.gms.internal.ads.wo5
    public final void p() {
        this.f15747r = false;
        this.f15746q = false;
        super.p();
    }
}
