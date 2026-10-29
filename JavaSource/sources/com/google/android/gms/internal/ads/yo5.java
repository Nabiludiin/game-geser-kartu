package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class yo5 implements sq5 {

    /* renamed from: a, reason: collision with root package name */
    private final s2 f19701a;

    /* renamed from: b, reason: collision with root package name */
    private m2 f19702b;

    /* renamed from: c, reason: collision with root package name */
    private n2 f19703c;

    public yo5(s2 s2Var) {
        this.f19701a = s2Var;
    }

    @Override // com.google.android.gms.internal.ads.sq5
    public final int a(n3 n3Var) {
        n2 n2Var;
        m2 m2Var = this.f19702b;
        if (m2Var == null || (n2Var = this.f19703c) == null) {
            throw null;
        }
        return m2Var.l(n2Var, n3Var);
    }

    @Override // com.google.android.gms.internal.ads.sq5
    public final void b() {
        if (this.f19702b != null) {
            this.f19702b = null;
        }
        this.f19703c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r1.o() != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r1.o() != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.sq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.y95 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.p2 r15) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.b2 r1 = new com.google.android.gms.internal.ads.b2
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f19703c = r1
            com.google.android.gms.internal.ads.m2 r8 = r7.f19702b
            if (r8 == 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.s2 r8 = r7.f19701a
            com.google.android.gms.internal.ads.m2[] r8 = r8.b(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.t04 r11 = com.google.android.gms.internal.ads.w04.z(r10)
            r12 = 0
            r13 = 1
            if (r10 != r13) goto L23
            r8 = r8[r12]
            r7.f19702b = r8
            goto L7f
        L23:
            r14 = r12
        L24:
            if (r14 >= r10) goto L7b
            r0 = r8[r14]
            boolean r2 = r0.j(r1)     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            if (r2 == 0) goto L3a
            r7.f19702b = r0     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            com.google.android.gms.internal.ads.rx3.h(r13)
            r1.k()
            goto L7b
        L37:
            r0 = move-exception
            r8 = r0
            goto L57
        L3a:
            java.util.List r0 = r0.b()     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            r11.i(r0)     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            com.google.android.gms.internal.ads.m2 r0 = r7.f19702b
            if (r0 != 0) goto L4d
            long r5 = r1.o()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4f
        L4d:
            r0 = r13
            goto L50
        L4f:
            r0 = r12
        L50:
            com.google.android.gms.internal.ads.rx3.h(r0)
            r1.k()
            goto L78
        L57:
            com.google.android.gms.internal.ads.m2 r9 = r7.f19702b
            if (r9 != 0) goto L63
            long r9 = r1.o()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L64
        L63:
            r12 = r13
        L64:
            com.google.android.gms.internal.ads.rx3.h(r12)
            r1.k()
            throw r8
        L6b:
            com.google.android.gms.internal.ads.m2 r0 = r7.f19702b
            if (r0 != 0) goto L4d
            long r5 = r1.o()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4f
            goto L4d
        L78:
            int r14 = r14 + 1
            goto L24
        L7b:
            com.google.android.gms.internal.ads.m2 r10 = r7.f19702b
            if (r10 == 0) goto L85
        L7f:
            com.google.android.gms.internal.ads.m2 r8 = r7.f19702b
            r8.k(r15)
            return
        L85:
            com.google.android.gms.internal.ads.bs5 r10 = new com.google.android.gms.internal.ads.bs5
            com.google.android.gms.internal.ads.w04 r8 = com.google.android.gms.internal.ads.w04.v(r8)
            com.google.android.gms.internal.ads.xo5 r12 = com.google.android.gms.internal.ads.xo5.f18912a
            java.util.List r8 = com.google.android.gms.internal.ads.x14.c(r8, r12)
            java.lang.String r12 = ", "
            java.lang.String r8 = com.google.android.gms.internal.ads.kx3.d(r8, r12)
            int r12 = r8.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 58
            r13.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r13.append(r12)
            r13.append(r8)
            java.lang.String r8 = ") could read the stream."
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            com.google.android.gms.internal.ads.w04 r11 = r11.j()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yo5.c(com.google.android.gms.internal.ads.y95, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.p2):void");
    }

    @Override // com.google.android.gms.internal.ads.sq5
    public final void d() {
        m2 m2Var = this.f19702b;
        if (m2Var != null && (m2Var instanceof d7)) {
            ((d7) m2Var).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.sq5
    public final long h() {
        n2 n2Var = this.f19703c;
        if (n2Var != null) {
            return n2Var.o();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.sq5
    public final void i(long j7, long j8) {
        m2 m2Var = this.f19702b;
        m2Var.getClass();
        m2Var.i(j7, j8);
    }
}
