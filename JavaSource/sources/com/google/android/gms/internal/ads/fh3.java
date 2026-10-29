package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class fh3 implements xf3 {

    /* renamed from: a, reason: collision with root package name */
    private final x6.g0 f8252a;

    /* renamed from: b, reason: collision with root package name */
    private final g7.a f8253b;

    /* renamed from: c, reason: collision with root package name */
    private final g7.a f8254c;

    /* renamed from: d, reason: collision with root package name */
    private final g7.a f8255d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8256e;

    /* renamed from: f, reason: collision with root package name */
    private vf3 f8257f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8258g;

    /* renamed from: h, reason: collision with root package name */
    private final g0.e f8259h;

    /* renamed from: i, reason: collision with root package name */
    private final yu1 f8260i;

    public fh3(g0.e eVar, hh3 hh3Var, yu1 yu1Var, gg3 gg3Var) {
        q6.i.e(eVar, "adQualityDataStore");
        q6.i.e(hh3Var, "coroutineScopeProvider");
        q6.i.e(yu1Var, "dataPinger");
        q6.i.e(gg3Var, "clock");
        this.f8260i = yu1Var;
        this.f8252a = hh3Var.a();
        this.f8253b = g7.c.b(false, 1, null);
        this.f8254c = g7.c.b(false, 1, null);
        this.f8255d = g7.c.b(false, 1, null);
        this.f8259h = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r9.b(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r8, g6.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.jg3
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.jg3 r0 = (com.google.android.gms.internal.ads.jg3) r0
            int r1 = r0.f10542x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10542x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.jg3 r0 = new com.google.android.gms.internal.ads.jg3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f10540v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f10542x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f10538t
            g7.a r8 = (g7.a) r8
            e6.n.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r9 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f10539u
            g7.a r8 = (g7.a) r8
            java.lang.Object r2 = r0.f10538t
            java.lang.String r2 = (java.lang.String) r2
            e6.n.b(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L49:
            e6.n.b(r9)
            g7.a r9 = r7.f8255d
            r0.f10538t = r8
            r0.f10539u = r9
            r0.f10542x = r4
            java.lang.Object r2 = r9.b(r5, r0)
            if (r2 == r1) goto L80
        L5a:
            g0.e r2 = r7.f8259h     // Catch: java.lang.Throwable -> L78
            com.google.android.gms.internal.ads.kg3 r4 = new com.google.android.gms.internal.ads.kg3     // Catch: java.lang.Throwable -> L78
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L78
            r0.f10538t = r9     // Catch: java.lang.Throwable -> L78
            r0.f10539u = r5     // Catch: java.lang.Throwable -> L78
            r0.f10542x = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 == r1) goto L80
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            com.google.android.gms.internal.ads.ag3 r9 = (com.google.android.gms.internal.ads.ag3) r9     // Catch: java.lang.Throwable -> L31
            r8.a(r5)
            e6.s r8 = e6.s.f23253a
            return r8
        L78:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7c:
            r8.a(r5)
            throw r9
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.r(java.lang.String, g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.b(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(g6.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.mg3
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.mg3 r0 = (com.google.android.gms.internal.ads.mg3) r0
            int r1 = r0.f12253w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12253w = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.mg3 r0 = new com.google.android.gms.internal.ads.mg3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12251u
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f12253w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f12250t
            g7.a r0 = (g7.a) r0
            e6.n.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L67
        L31:
            r8 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.f12250t
            g7.a r2 = (g7.a) r2
            e6.n.b(r8)
            r8 = r2
            goto L53
        L44:
            e6.n.b(r8)
            g7.a r8 = r7.f8255d
            r0.f12250t = r8
            r0.f12253w = r4
            java.lang.Object r2 = r8.b(r5, r0)
            if (r2 == r1) goto L77
        L53:
            g0.e r2 = r7.f8259h     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.internal.ads.ng3 r4 = new com.google.android.gms.internal.ads.ng3     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r0.f12250t = r8     // Catch: java.lang.Throwable -> L6f
            r0.f12253w = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == r1) goto L77
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.ag3 r8 = (com.google.android.gms.internal.ads.ag3) r8     // Catch: java.lang.Throwable -> L31
            r0.a(r5)
            e6.s r8 = e6.s.f23253a
            return r8
        L6f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L73:
            r0.a(r5)
            throw r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.s(g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0057, B:17:0x005b, B:18:0x005f, B:20:0x0068, B:21:0x006c), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0057, B:17:0x005b, B:18:0x005f, B:20:0x0068, B:21:0x006c), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0057, B:17:0x005b, B:18:0x005f, B:20:0x0068, B:21:0x006c), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(long r6, g6.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.lg3
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.lg3 r0 = (com.google.android.gms.internal.ads.lg3) r0
            int r1 = r0.f11609x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11609x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.lg3 r0 = new com.google.android.gms.internal.ads.lg3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f11607v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f11609x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r6 = r0.f11605t
            java.lang.Object r0 = r0.f11606u
            g7.a r0 = (g7.a) r0
            e6.n.b(r8)
            goto L4a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            e6.n.b(r8)
            g7.a r8 = r5.f8253b
            r0.f11606u = r8
            r0.f11605t = r6
            r0.f11609x = r3
            java.lang.Object r0 = r8.b(r4, r0)
            if (r0 == r1) goto L7e
            r0 = r8
        L4a:
            com.google.android.gms.internal.ads.vf3 r8 = r5.f8257f     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "adQualityDataBuilder"
            if (r8 != 0) goto L57
            q6.i.o(r1)     // Catch: java.lang.Throwable -> L55
            r8 = r4
            goto L57
        L55:
            r6 = move-exception
            goto L7a
        L57:
            com.google.android.gms.internal.ads.vf3 r2 = r5.f8257f     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L5f
            q6.i.o(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r4
        L5f:
            long r2 = r2.M()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 - r2
            com.google.android.gms.internal.ads.vf3 r2 = r5.f8257f     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L6c
            q6.i.o(r1)     // Catch: java.lang.Throwable -> L55
            r2 = r4
        L6c:
            long r1 = r2.K()     // Catch: java.lang.Throwable -> L55
            long r6 = r6 - r1
            r8.F(r6)     // Catch: java.lang.Throwable -> L55
            r0.a(r4)
            e6.s r6 = e6.s.f23253a
            return r6
        L7a:
            r0.a(r4)
            throw r6
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.t(long, g6.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0061, code lost:
    
        if (r2.b(null, r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: all -> 0x006e, TryCatch #2 {all -> 0x006e, blocks: (B:35:0x0063, B:37:0x0067, B:38:0x0070), top: B:34:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(g6.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.rg3
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.rg3 r0 = (com.google.android.gms.internal.ads.rg3) r0
            int r1 = r0.f14903x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14903x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.rg3 r0 = new com.google.android.gms.internal.ads.rg3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f14901v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f14903x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r0 = r0.f14899t
            g7.a r0 = (g7.a) r0
            e6.n.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L9f
        L35:
            r8 = move-exception
            goto La9
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L40:
            java.lang.Object r2 = r0.f14900u
            g7.a r2 = (g7.a) r2
            java.lang.Object r4 = r0.f14899t
            com.google.android.gms.internal.ads.wf3 r4 = (com.google.android.gms.internal.ads.wf3) r4
            e6.n.b(r8)
            goto L8b
        L4c:
            java.lang.Object r2 = r0.f14899t
            g7.a r2 = (g7.a) r2
            e6.n.b(r8)
            goto L63
        L54:
            e6.n.b(r8)
            g7.a r2 = r7.f8253b
            r0.f14899t = r2
            r0.f14903x = r5
            java.lang.Object r8 = r2.b(r6, r0)
            if (r8 == r1) goto Lb1
        L63:
            com.google.android.gms.internal.ads.vf3 r8 = r7.f8257f     // Catch: java.lang.Throwable -> L6e
            if (r8 != 0) goto L70
            java.lang.String r8 = "adQualityDataBuilder"
            q6.i.o(r8)     // Catch: java.lang.Throwable -> L6e
            r8 = r6
            goto L70
        L6e:
            r8 = move-exception
            goto Lad
        L70:
            com.google.android.gms.internal.ads.sz4 r8 = r8.A()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.internal.ads.wf3 r8 = (com.google.android.gms.internal.ads.wf3) r8     // Catch: java.lang.Throwable -> L6e
            r2.a(r6)
            q6.i.b(r8)
            g7.a r2 = r7.f8255d
            r0.f14899t = r8
            r0.f14900u = r2
            r0.f14903x = r4
            java.lang.Object r4 = r2.b(r6, r0)
            if (r4 == r1) goto Lb1
            r4 = r8
        L8b:
            g0.e r8 = r7.f8259h     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.internal.ads.sg3 r5 = new com.google.android.gms.internal.ads.sg3     // Catch: java.lang.Throwable -> La7
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> La7
            r0.f14899t = r2     // Catch: java.lang.Throwable -> La7
            r0.f14900u = r6     // Catch: java.lang.Throwable -> La7
            r0.f14903x = r3     // Catch: java.lang.Throwable -> La7
            java.lang.Object r8 = r8.a(r5, r0)     // Catch: java.lang.Throwable -> La7
            if (r8 == r1) goto Lb1
            r0 = r2
        L9f:
            com.google.android.gms.internal.ads.ag3 r8 = (com.google.android.gms.internal.ads.ag3) r8     // Catch: java.lang.Throwable -> L35
            r0.a(r6)
            e6.s r8 = e6.s.f23253a
            return r8
        La7:
            r8 = move-exception
            r0 = r2
        La9:
            r0.a(r6)
            throw r8
        Lad:
            r2.a(r6)
            throw r8
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.u(g6.e):java.lang.Object");
    }

    private static final boolean w(wf3 wf3Var) {
        boolean z7;
        List q02 = wf3Var.q0();
        Long l7 = q02 != null ? (Long) f6.l.n(q02) : null;
        boolean z8 = wf3Var.r0() > wf3Var.s0() && !wf3Var.k0();
        if (l7 != null) {
            if (wf3Var.o0() - l7.longValue() > 5000) {
                z7 = true;
                return !z8 || z7;
            }
        }
        z7 = false;
        if (z8) {
        }
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void a() {
        x6.g.d(this.f8252a, null, null, new ah3(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (s(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [g7.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [g7.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.fh3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(g6.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zg3
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zg3 r0 = (com.google.android.gms.internal.ads.zg3) r0
            int r1 = r0.f20177w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20177w = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zg3 r0 = new com.google.android.gms.internal.ads.zg3
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f20175u
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f20177w
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            e6.n.b(r9)
            goto Ld3
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.f20174t
            g7.a r2 = (g7.a) r2
            e6.n.b(r9)     // Catch: java.lang.Throwable -> L41
            goto L6c
        L41:
            r9 = move-exception
            goto Ld9
        L44:
            java.lang.Object r2 = r0.f20174t
            g7.a r2 = (g7.a) r2
            e6.n.b(r9)
            goto L5c
        L4c:
            e6.n.b(r9)
            g7.a r9 = r8.f8255d
            r0.f20174t = r9
            r0.f20177w = r5
            java.lang.Object r2 = r9.b(r6, r0)
            if (r2 == r1) goto Ldd
            r2 = r9
        L5c:
            g0.e r9 = r8.f8259h     // Catch: java.lang.Throwable -> L41
            a7.b r9 = r9.getData()     // Catch: java.lang.Throwable -> L41
            r0.f20174t = r2     // Catch: java.lang.Throwable -> L41
            r0.f20177w = r4     // Catch: java.lang.Throwable -> L41
            java.lang.Object r9 = a7.d.d(r9, r0)     // Catch: java.lang.Throwable -> L41
            if (r9 == r1) goto Ldd
        L6c:
            com.google.android.gms.internal.ads.ag3 r9 = (com.google.android.gms.internal.ads.ag3) r9     // Catch: java.lang.Throwable -> L41
            r2.a(r6)
            if (r9 == 0) goto Ld6
            int r2 = r9.d0()
            if (r2 != 0) goto L7a
            goto Ld6
        L7a:
            java.util.Map r9 = r9.e0()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L86:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            com.google.android.gms.internal.ads.wf3 r4 = (com.google.android.gms.internal.ads.wf3) r4
            com.google.android.gms.internal.ads.oz4 r4 = r4.Q()
            java.lang.String r7 = "toBuilder(...)"
            q6.i.d(r4, r7)
            com.google.android.gms.internal.ads.vf3 r4 = (com.google.android.gms.internal.ads.vf3) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r7 = "<get-value>(...)"
            q6.i.d(r2, r7)
            com.google.android.gms.internal.ads.wf3 r2 = (com.google.android.gms.internal.ads.wf3) r2
            boolean r2 = w(r2)
            if (r2 == 0) goto Lb7
            r4.J(r5)
        Lb7:
            com.google.android.gms.internal.ads.yu1 r2 = r8.f8260i
            com.google.android.gms.internal.ads.sz4 r4 = r4.A()
            java.lang.String r7 = "build(...)"
            q6.i.d(r4, r7)
            com.google.android.gms.internal.ads.wf3 r4 = (com.google.android.gms.internal.ads.wf3) r4
            r2.a(r4)
            goto L86
        Lc8:
            r0.f20174t = r6
            r0.f20177w = r3
            java.lang.Object r9 = r8.s(r0)
            if (r9 != r1) goto Ld3
            goto Ldd
        Ld3:
            e6.s r9 = e6.s.f23253a
            return r9
        Ld6:
            e6.s r9 = e6.s.f23253a
            return r9
        Ld9:
            r2.a(r6)
            throw r9
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.b(g6.e):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void c() {
        x6.g.d(this.f8252a, null, null, new yg3(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void d() {
        x6.g.d(this.f8252a, null, null, new pg3(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void e() {
        x6.g.d(this.f8252a, null, null, new ch3(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void f() {
        x6.g.d(this.f8252a, null, null, new wg3(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0054, B:13:0x0058, B:17:0x0060, B:19:0x0075, B:20:0x007b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x0054, B:13:0x0058, B:17:0x0060, B:19:0x0075, B:20:0x007b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, g6.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.tg3
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.tg3 r0 = (com.google.android.gms.internal.ads.tg3) r0
            int r1 = r0.f16180x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16180x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.tg3 r0 = new com.google.android.gms.internal.ads.tg3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f16178v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f16180x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r1 = r0.f16177u
            java.lang.Object r8 = r0.f16176t
            g7.a r8 = (g7.a) r8
            java.lang.String r0 = r0.f16181y
            e6.n.b(r9)
            goto L54
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            e6.n.b(r9)
            g7.a r9 = r7.f8253b
            long r5 = java.lang.System.currentTimeMillis()
            r0.f16181y = r8
            r0.f16176t = r9
            r0.f16177u = r5
            r0.f16180x = r3
            java.lang.Object r0 = r9.b(r4, r0)
            if (r0 == r1) goto L8b
            r0 = r8
            r8 = r9
            r1 = r5
        L54:
            boolean r9 = r7.f8256e     // Catch: java.lang.Throwable -> L5e
            if (r9 == 0) goto L60
            e6.s r9 = e6.s.f23253a     // Catch: java.lang.Throwable -> L5e
            r8.a(r4)
            return r9
        L5e:
            r9 = move-exception
            goto L87
        L60:
            r7.f8256e = r3     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.wf3 r9 = com.google.android.gms.internal.ads.wf3.v0()     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.oz4 r9 = r9.Q()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "toBuilder(...)"
            q6.i.d(r9, r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.vf3 r9 = (com.google.android.gms.internal.ads.vf3) r9     // Catch: java.lang.Throwable -> L5e
            r7.f8257f = r9     // Catch: java.lang.Throwable -> L5e
            if (r9 != 0) goto L7b
            java.lang.String r9 = "adQualityDataBuilder"
            q6.i.o(r9)     // Catch: java.lang.Throwable -> L5e
            r9 = r4
        L7b:
            r9.E(r0)     // Catch: java.lang.Throwable -> L5e
            r9.N(r1)     // Catch: java.lang.Throwable -> L5e
            r8.a(r4)
            e6.s r8 = e6.s.f23253a
            return r8
        L87:
            r8.a(r4)
            throw r9
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.g(java.lang.String, g6.e):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void h() {
        x6.g.d(this.f8252a, null, null, new eh3(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (u(r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (t(r5, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005f, code lost:
    
        if (r2.b(null, r0) != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:24:0x0087, B:26:0x008b, B:27:0x0094), top: B:23:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065 A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:37:0x0061, B:39:0x0065, B:42:0x006d), top: B:36:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d A[Catch: all -> 0x006b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:37:0x0061, B:39:0x0065, B:42:0x006d), top: B:36:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(g6.e r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.og3
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.og3 r0 = (com.google.android.gms.internal.ads.og3) r0
            int r1 = r0.f13324x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13324x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.og3 r0 = new com.google.android.gms.internal.ads.og3
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f13322v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f13324x
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            e6.n.b(r11)
            goto Lad
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            e6.n.b(r11)
            goto La4
        L40:
            long r5 = r0.f13321u
            java.lang.Object r2 = r0.f13320t
            g7.a r2 = (g7.a) r2
            e6.n.b(r11)
            goto L87
        L4a:
            java.lang.Object r2 = r0.f13320t
            g7.a r2 = (g7.a) r2
            e6.n.b(r11)
            goto L61
        L52:
            e6.n.b(r11)
            g7.a r2 = r10.f8254c
            r0.f13320t = r2
            r0.f13324x = r6
            java.lang.Object r11 = r2.b(r7, r0)
            if (r11 == r1) goto Lb8
        L61:
            boolean r11 = r10.f8258g     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L6d
            e6.s r11 = e6.s.f23253a     // Catch: java.lang.Throwable -> L6b
            r2.a(r7)
            return r11
        L6b:
            r11 = move-exception
            goto Lb4
        L6d:
            r10.f8258g = r6     // Catch: java.lang.Throwable -> L6b
            e6.s r11 = e6.s.f23253a     // Catch: java.lang.Throwable -> L6b
            r2.a(r7)
            g7.a r2 = r10.f8253b
            long r8 = java.lang.System.currentTimeMillis()
            r0.f13320t = r2
            r0.f13321u = r8
            r0.f13324x = r5
            java.lang.Object r11 = r2.b(r7, r0)
            if (r11 == r1) goto Lb8
            r5 = r8
        L87:
            com.google.android.gms.internal.ads.vf3 r11 = r10.f8257f     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L94
            java.lang.String r11 = "adQualityDataBuilder"
            q6.i.o(r11)     // Catch: java.lang.Throwable -> L92
            r11 = r7
            goto L94
        L92:
            r11 = move-exception
            goto Lb0
        L94:
            r11.S(r5)     // Catch: java.lang.Throwable -> L92
            r2.a(r7)
            r0.f13320t = r7
            r0.f13324x = r4
            java.lang.Object r11 = r10.t(r5, r0)
            if (r11 == r1) goto Lb8
        La4:
            r0.f13324x = r3
            java.lang.Object r11 = r10.u(r0)
            if (r11 != r1) goto Lad
            goto Lb8
        Lad:
            e6.s r11 = e6.s.f23253a
            return r11
        Lb0:
            r2.a(r7)
            throw r11
        Lb4:
            r2.a(r7)
            throw r11
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.i(g6.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0050, code lost:
    
        if (r2.b(null, r0) != r1) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:12:0x007b, B:15:0x0081, B:16:0x0089, B:19:0x0091, B:21:0x0095, B:22:0x0099, B:24:0x00b5, B:25:0x00b9, B:27:0x00c2, B:29:0x00c6, B:30:0x00ca, B:31:0x00d2, B:33:0x00d6, B:34:0x00da, B:36:0x00e0, B:38:0x00e4, B:39:0x00e8, B:41:0x0104, B:42:0x0108, B:43:0x0110, B:45:0x0114, B:46:0x0118), top: B:11:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:59:0x0052, B:61:0x0056, B:65:0x0060), top: B:58:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(g6.e r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.j(g6.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fc, code lost:
    
        if (r(r14, r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0064, code lost:
    
        if (r2.b(null, r0) != r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:26:0x008e, B:29:0x0094, B:30:0x009b, B:32:0x009f, B:33:0x00a3, B:35:0x00ad, B:36:0x00b1, B:38:0x00bd, B:39:0x00c1, B:41:0x00c8, B:42:0x00cc), top: B:25:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:53:0x0066, B:55:0x006a, B:59:0x0074), top: B:52:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(g6.e r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.k(g6.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0107, code lost:
    
        if (r(r15, r0) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008b, code lost:
    
        if (r2.b(null, r0) != r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        if (r2.b(null, r0) != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006a A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:56:0x0066, B:58:0x006a, B:62:0x0074), top: B:55:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(g6.e r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.l(g6.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x005c), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(g6.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.vg3
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.vg3 r0 = (com.google.android.gms.internal.ads.vg3) r0
            int r1 = r0.f17610x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17610x = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.vg3 r0 = new com.google.android.gms.internal.ads.vg3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f17608v
            java.lang.Object r1 = h6.b.e()
            int r2 = r0.f17610x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.f17606t
            java.lang.Object r0 = r0.f17607u
            g7.a r0 = (g7.a) r0
            e6.n.b(r8)
            goto L4f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            e6.n.b(r8)
            g7.a r8 = r7.f8253b
            long r5 = java.lang.System.currentTimeMillis()
            r0.f17607u = r8
            r0.f17606t = r5
            r0.f17610x = r3
            java.lang.Object r0 = r8.b(r4, r0)
            if (r0 == r1) goto L69
            r0 = r8
            r1 = r5
        L4f:
            com.google.android.gms.internal.ads.vf3 r8 = r7.f8257f     // Catch: java.lang.Throwable -> L5a
            if (r8 != 0) goto L5c
            java.lang.String r8 = "adQualityDataBuilder"
            q6.i.o(r8)     // Catch: java.lang.Throwable -> L5a
            r8 = r4
            goto L5c
        L5a:
            r8 = move-exception
            goto L65
        L5c:
            r8.W(r1)     // Catch: java.lang.Throwable -> L5a
            r0.a(r4)
            e6.s r8 = e6.s.f23253a
            return r8
        L65:
            r0.a(r4)
            throw r8
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fh3.m(g6.e):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.ads.xf3
    public final void v(String str) {
        q6.i.e(str, "gwsQueryId");
        x6.g.d(this.f8252a, null, null, new ug3(this, str, null), 3, null);
    }
}
