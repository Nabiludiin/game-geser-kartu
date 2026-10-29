package w;

import java.util.ArrayList;
import v.d;
import v.e;

/* compiled from: MyApplication */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f26918a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private a f26919b = new a();

    /* renamed from: c, reason: collision with root package name */
    private v.f f26920c;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f26921k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f26922l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f26923m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f26924a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f26925b;

        /* renamed from: c, reason: collision with root package name */
        public int f26926c;

        /* renamed from: d, reason: collision with root package name */
        public int f26927d;

        /* renamed from: e, reason: collision with root package name */
        public int f26928e;

        /* renamed from: f, reason: collision with root package name */
        public int f26929f;

        /* renamed from: g, reason: collision with root package name */
        public int f26930g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f26931h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f26932i;

        /* renamed from: j, reason: collision with root package name */
        public int f26933j;
    }

    /* compiled from: MyApplication */
    /* renamed from: w.b$b, reason: collision with other inner class name */
    public interface InterfaceC0139b {
        void a();

        void b(v.e eVar, a aVar);
    }

    public b(v.f fVar) {
        this.f26920c = fVar;
    }

    private boolean a(InterfaceC0139b interfaceC0139b, v.e eVar, int i7) {
        this.f26919b.f26924a = eVar.y();
        this.f26919b.f26925b = eVar.R();
        this.f26919b.f26926c = eVar.U();
        this.f26919b.f26927d = eVar.v();
        a aVar = this.f26919b;
        aVar.f26932i = false;
        aVar.f26933j = i7;
        e.b bVar = aVar.f26924a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f26925b == bVar2;
        boolean z9 = z7 && eVar.f26628d0 > 0.0f;
        boolean z10 = z8 && eVar.f26628d0 > 0.0f;
        if (z9 && eVar.f26669y[0] == 4) {
            aVar.f26924a = e.b.FIXED;
        }
        if (z10 && eVar.f26669y[1] == 4) {
            aVar.f26925b = e.b.FIXED;
        }
        interfaceC0139b.b(eVar, aVar);
        eVar.g1(this.f26919b.f26928e);
        eVar.I0(this.f26919b.f26929f);
        eVar.H0(this.f26919b.f26931h);
        eVar.x0(this.f26919b.f26930g);
        a aVar2 = this.f26919b;
        aVar2.f26933j = a.f26921k;
        return aVar2.f26932i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        if (r8 != r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0090, code lost:
    
        if (r5.f26628d0 <= 0.0f) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(v.f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.O1(r1)
            w.b$b r2 = r13.E1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La0
            java.util.ArrayList r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            v.e r5 = (v.e) r5
            boolean r6 = r5 instanceof v.g
            if (r6 == 0) goto L22
            goto L9c
        L22:
            boolean r6 = r5 instanceof v.a
            if (r6 == 0) goto L28
            goto L9c
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto L9c
        L30:
            if (r1 == 0) goto L47
            w.l r6 = r5.f26629e
            if (r6 == 0) goto L47
            w.n r7 = r5.f26631f
            if (r7 == 0) goto L47
            w.g r6 = r6.f27002e
            boolean r6 = r6.f26954j
            if (r6 == 0) goto L47
            w.g r6 = r7.f27002e
            boolean r6 = r6.f26954j
            if (r6 == 0) goto L47
            goto L9c
        L47:
            v.e$b r6 = r5.s(r3)
            r7 = 1
            v.e$b r8 = r5.s(r7)
            v.e$b r9 = v.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f26665w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f26667x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L93
            boolean r11 = r13.O1(r7)
            if (r11 == 0) goto L93
            if (r6 != r9) goto L78
            int r11 = r5.f26665w
            if (r11 != 0) goto L78
            if (r8 == r9) goto L78
            boolean r11 = r5.g0()
            if (r11 != 0) goto L78
            r10 = r7
        L78:
            if (r8 != r9) goto L87
            int r11 = r5.f26667x
            if (r11 != 0) goto L87
            if (r6 == r9) goto L87
            boolean r11 = r5.g0()
            if (r11 != 0) goto L87
            r10 = r7
        L87:
            if (r6 == r9) goto L8b
            if (r8 != r9) goto L93
        L8b:
            float r6 = r5.f26628d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L93
            goto L94
        L93:
            r7 = r10
        L94:
            if (r7 == 0) goto L97
            goto L9c
        L97:
            int r6 = w.b.a.f26921k
            r12.a(r2, r5, r6)
        L9c:
            int r4 = r4 + 1
            goto L12
        La0:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.b(v.f):void");
    }

    private void c(v.f fVar, String str, int i7, int i8, int i9) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.W0(0);
        fVar.V0(0);
        fVar.g1(i8);
        fVar.I0(i9);
        fVar.W0(G);
        fVar.V0(F);
        this.f26920c.S1(i7);
        this.f26920c.o1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    public long d(v.f fVar, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean z7;
        int i16;
        int i17;
        int i18;
        v.f fVar2;
        long j7;
        int i19;
        boolean z8;
        int i20;
        b bVar = this;
        InterfaceC0139b E1 = fVar.E1();
        int size = fVar.L0.size();
        int U = fVar.U();
        int v7 = fVar.v();
        boolean b8 = v.j.b(i7, 128);
        boolean z9 = false;
        boolean z10 = b8 || v.j.b(i7, 64);
        if (z10) {
            for (int i21 = 0; i21 < size; i21++) {
                v.e eVar = (v.e) fVar.L0.get(i21);
                e.b y7 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z11 = (y7 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z11) || ((eVar.i0() && z11) || eVar.g0() || eVar.i0())) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            boolean z12 = s.d.f25925r;
        }
        boolean z13 = z10 & ((i10 == 1073741824 && i12 == 1073741824) || b8);
        if (z13) {
            int min = Math.min(fVar.E(), i11);
            int min2 = Math.min(fVar.D(), i13);
            if (i10 == 1073741824 && fVar.U() != min) {
                fVar.g1(min);
                fVar.H1();
            }
            if (i12 == 1073741824 && fVar.v() != min2) {
                fVar.I0(min2);
                fVar.H1();
            }
            if (i10 == 1073741824 && i12 == 1073741824) {
                z7 = fVar.B1(b8);
                i16 = 2;
            } else {
                boolean C1 = fVar.C1(b8);
                if (i10 == 1073741824) {
                    C1 &= fVar.D1(b8, 0);
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                if (i12 == 1073741824) {
                    z7 = fVar.D1(b8, 1) & C1;
                    i16++;
                } else {
                    z7 = C1;
                }
            }
            if (z7) {
                fVar.l1(i10 == 1073741824, i12 == 1073741824);
            }
        } else {
            z7 = false;
            i16 = 0;
        }
        long j8 = 0;
        if (z7 && i16 == 2) {
            return 0L;
        }
        int F1 = fVar.F1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f26918a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, U, v7);
            i17 = U;
            i18 = v7;
        } else {
            i17 = U;
            i18 = v7;
        }
        if (size2 > 0) {
            e.b y8 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z14 = y8 == bVar3;
            boolean z15 = fVar.R() == bVar3;
            int max = Math.max(fVar.U(), bVar.f26920c.G());
            int max2 = Math.max(fVar.v(), bVar.f26920c.F());
            int i22 = 0;
            while (i22 < size2) {
                long j9 = j8;
                i22++;
                j8 = j9;
            }
            j7 = j8;
            int i23 = 0;
            for (int i24 = 2; i23 < i24; i24 = 2) {
                boolean z16 = z9;
                for (?? r14 = z16; r14 < size2; r14++) {
                    v.e eVar2 = (v.e) bVar.f26918a.get(r14);
                    if ((eVar2 instanceof v.h) || (eVar2 instanceof v.g)) {
                        i19 = i17;
                    } else {
                        i19 = i17;
                        if (eVar2.T() != 8 && (!z13 || !eVar2.f26629e.f27002e.f26954j || !eVar2.f26631f.f27002e.f26954j)) {
                            int U2 = eVar2.U();
                            int v8 = eVar2.v();
                            z8 = z13;
                            int n7 = eVar2.n();
                            int i25 = a.f26922l;
                            boolean z17 = z16;
                            if (i23 == 1) {
                                i25 = a.f26923m;
                            }
                            z16 = z17 | bVar.a(E1, eVar2, i25);
                            int U3 = eVar2.U();
                            i20 = i23;
                            int v9 = eVar2.v();
                            if (U3 != U2) {
                                eVar2.g1(U3);
                                if (z14 && eVar2.K() > max) {
                                    max = Math.max(max, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                                }
                                z16 = true;
                            }
                            if (v9 != v8) {
                                eVar2.I0(v9);
                                if (z15 && eVar2.p() > max2) {
                                    max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                                }
                                z16 = true;
                            }
                            if (eVar2.X() && n7 != eVar2.n()) {
                                z16 = true;
                            }
                            bVar = this;
                            i17 = i19;
                            z13 = z8;
                            i23 = i20;
                        }
                    }
                    z8 = z13;
                    i20 = i23;
                    bVar = this;
                    i17 = i19;
                    z13 = z8;
                    i23 = i20;
                }
                int i26 = i17;
                boolean z18 = z13;
                int i27 = i23;
                if (!z16) {
                    break;
                }
                i23 = i27 + 1;
                c(fVar, "intermediate pass", i23, i26, i18);
                bVar = this;
                i17 = i26;
                z13 = z18;
                z9 = false;
            }
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            j7 = 0;
        }
        fVar2.R1(F1);
        return j7;
    }

    public void e(v.f fVar) {
        this.f26918a.clear();
        int size = fVar.L0.size();
        for (int i7 = 0; i7 < size; i7++) {
            v.e eVar = (v.e) fVar.L0.get(i7);
            e.b y7 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y7 == bVar || eVar.R() == bVar) {
                this.f26918a.add(eVar);
            }
        }
        fVar.H1();
    }
}
