package w;

import java.util.ArrayList;
import java.util.Iterator;
import v.d;
import v.e;
import w.b;

/* compiled from: MyApplication */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f26967a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f26968b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f26969c = 0;

    private static boolean a(int i7, v.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b y7 = eVar.y();
        e.b R = eVar.R();
        v.f fVar = eVar.I() != null ? (v.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z7 = y7 == bVar5 || eVar.l0() || y7 == e.b.WRAP_CONTENT || (y7 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f26665w == 0 && eVar.f26628d0 == 0.0f && eVar.Y(0)) || (y7 == bVar2 && eVar.f26665w == 1 && eVar.b0(0, eVar.U()));
        boolean z8 = R == bVar5 || eVar.m0() || R == e.b.WRAP_CONTENT || (R == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f26667x == 0 && eVar.f26628d0 == 0.0f && eVar.Y(1)) || (R == bVar && eVar.f26667x == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f26628d0 <= 0.0f || !(z7 || z8)) {
            return z7 && z8;
        }
        return true;
    }

    private static void b(int i7, v.e eVar, b.InterfaceC0139b interfaceC0139b, boolean z7) {
        v.d dVar;
        v.d dVar2;
        boolean z8;
        v.d dVar3;
        v.d dVar4;
        if (eVar.e0()) {
            return;
        }
        boolean z9 = true;
        f26968b++;
        if (!(eVar instanceof v.f) && eVar.k0()) {
            int i8 = i7 + 1;
            if (a(i8, eVar)) {
                v.f.N1(i8, eVar, interfaceC0139b, new b.a(), b.a.f26921k);
            }
        }
        v.d m7 = eVar.m(d.b.LEFT);
        v.d m8 = eVar.m(d.b.RIGHT);
        int d8 = m7.d();
        int d9 = m8.d();
        if (m7.c() != null && m7.m()) {
            Iterator it = m7.c().iterator();
            while (it.hasNext()) {
                v.d dVar5 = (v.d) it.next();
                v.e eVar2 = dVar5.f26604d;
                int i9 = i7 + 1;
                boolean a8 = a(i9, eVar2);
                if (eVar2.k0() && a8) {
                    z8 = z9;
                    v.f.N1(i9, eVar2, interfaceC0139b, new b.a(), b.a.f26921k);
                } else {
                    z8 = z9;
                }
                boolean z10 = ((dVar5 == eVar2.O && (dVar4 = eVar2.Q.f26606f) != null && dVar4.m()) || (dVar5 == eVar2.Q && (dVar3 = eVar2.O.f26606f) != null && dVar3.m())) ? z8 : false;
                e.b y7 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y7 != bVar || a8) {
                    if (!eVar2.k0()) {
                        v.d dVar6 = eVar2.O;
                        if (dVar5 == dVar6 && eVar2.Q.f26606f == null) {
                            int e8 = dVar6.e() + d8;
                            eVar2.C0(e8, eVar2.U() + e8);
                            b(i9, eVar2, interfaceC0139b, z7);
                        } else {
                            v.d dVar7 = eVar2.Q;
                            if (dVar5 == dVar7 && dVar6.f26606f == null) {
                                int e9 = d8 - dVar7.e();
                                eVar2.C0(e9 - eVar2.U(), e9);
                                b(i9, eVar2, interfaceC0139b, z7);
                            } else if (z10 && !eVar2.g0()) {
                                d(i9, interfaceC0139b, eVar2, z7);
                            }
                        }
                    }
                } else if (eVar2.y() == bVar && eVar2.A >= 0 && eVar2.f26671z >= 0 && ((eVar2.T() == 8 || (eVar2.f26665w == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z10 && !eVar2.g0())) {
                    e(i9, eVar, interfaceC0139b, eVar2, z7);
                }
                z9 = z8;
            }
        }
        boolean z11 = z9;
        if (eVar instanceof v.g) {
            return;
        }
        if (m8.c() != null && m8.m()) {
            Iterator it2 = m8.c().iterator();
            while (it2.hasNext()) {
                v.d dVar8 = (v.d) it2.next();
                v.e eVar3 = dVar8.f26604d;
                int i10 = i7 + 1;
                boolean a9 = a(i10, eVar3);
                if (eVar3.k0() && a9) {
                    v.f.N1(i10, eVar3, interfaceC0139b, new b.a(), b.a.f26921k);
                }
                boolean z12 = ((dVar8 == eVar3.O && (dVar2 = eVar3.Q.f26606f) != null && dVar2.m()) || (dVar8 == eVar3.Q && (dVar = eVar3.O.f26606f) != null && dVar.m())) ? z11 : false;
                e.b y8 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (y8 != bVar2 || a9) {
                    if (!eVar3.k0()) {
                        v.d dVar9 = eVar3.O;
                        if (dVar8 == dVar9 && eVar3.Q.f26606f == null) {
                            int e10 = dVar9.e() + d9;
                            eVar3.C0(e10, eVar3.U() + e10);
                            b(i10, eVar3, interfaceC0139b, z7);
                        } else {
                            v.d dVar10 = eVar3.Q;
                            if (dVar8 == dVar10 && dVar9.f26606f == null) {
                                int e11 = d9 - dVar10.e();
                                eVar3.C0(e11 - eVar3.U(), e11);
                                b(i10, eVar3, interfaceC0139b, z7);
                            } else if (z12 && !eVar3.g0()) {
                                d(i10, interfaceC0139b, eVar3, z7);
                            }
                        }
                    }
                } else if (eVar3.y() == bVar2 && eVar3.A >= 0 && eVar3.f26671z >= 0 && (eVar3.T() == 8 || (eVar3.f26665w == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.g0() && !eVar3.j0() && z12 && !eVar3.g0()) {
                        e(i10, eVar, interfaceC0139b, eVar3, z7);
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i7, v.a aVar, b.InterfaceC0139b interfaceC0139b, int i8, boolean z7) {
        if (aVar.p1()) {
            if (i8 == 0) {
                b(i7 + 1, aVar, interfaceC0139b, z7);
            } else {
                i(i7 + 1, aVar, interfaceC0139b);
            }
        }
    }

    private static void d(int i7, b.InterfaceC0139b interfaceC0139b, v.e eVar, boolean z7) {
        float w7 = eVar.w();
        int d8 = eVar.O.f26606f.d();
        int d9 = eVar.Q.f26606f.d();
        int e8 = eVar.O.e() + d8;
        int e9 = d9 - eVar.Q.e();
        if (d8 == d9) {
            w7 = 0.5f;
        } else {
            d8 = e8;
            d9 = e9;
        }
        int U = eVar.U();
        int i8 = (d9 - d8) - U;
        if (d8 > d9) {
            i8 = (d8 - d9) - U;
        }
        int i9 = ((int) (i8 > 0 ? (w7 * i8) + 0.5f : w7 * i8)) + d8;
        int i10 = i9 + U;
        if (d8 > d9) {
            i10 = i9 - U;
        }
        eVar.C0(i9, i10);
        b(i7 + 1, eVar, interfaceC0139b, z7);
    }

    private static void e(int i7, v.e eVar, b.InterfaceC0139b interfaceC0139b, v.e eVar2, boolean z7) {
        float w7 = eVar2.w();
        int d8 = eVar2.O.f26606f.d() + eVar2.O.e();
        int d9 = eVar2.Q.f26606f.d() - eVar2.Q.e();
        if (d9 >= d8) {
            int U = eVar2.U();
            if (eVar2.T() != 8) {
                int i8 = eVar2.f26665w;
                if (i8 == 2) {
                    U = (int) (eVar2.w() * 0.5f * (eVar instanceof v.f ? eVar.U() : eVar.I().U()));
                } else if (i8 == 0) {
                    U = d9 - d8;
                }
                U = Math.max(eVar2.f26671z, U);
                int i9 = eVar2.A;
                if (i9 > 0) {
                    U = Math.min(i9, U);
                }
            }
            int i10 = d8 + ((int) ((w7 * ((d9 - d8) - U)) + 0.5f));
            eVar2.C0(i10, U + i10);
            b(i7 + 1, eVar2, interfaceC0139b, z7);
        }
    }

    private static void f(int i7, b.InterfaceC0139b interfaceC0139b, v.e eVar) {
        float P = eVar.P();
        int d8 = eVar.P.f26606f.d();
        int d9 = eVar.R.f26606f.d();
        int e8 = eVar.P.e() + d8;
        int e9 = d9 - eVar.R.e();
        if (d8 == d9) {
            P = 0.5f;
        } else {
            d8 = e8;
            d9 = e9;
        }
        int v7 = eVar.v();
        int i8 = (d9 - d8) - v7;
        if (d8 > d9) {
            i8 = (d8 - d9) - v7;
        }
        int i9 = (int) (i8 > 0 ? (P * i8) + 0.5f : P * i8);
        int i10 = d8 + i9;
        int i11 = i10 + v7;
        if (d8 > d9) {
            i10 = d8 - i9;
            i11 = i10 - v7;
        }
        eVar.F0(i10, i11);
        i(i7 + 1, eVar, interfaceC0139b);
    }

    private static void g(int i7, v.e eVar, b.InterfaceC0139b interfaceC0139b, v.e eVar2) {
        float P = eVar2.P();
        int d8 = eVar2.P.f26606f.d() + eVar2.P.e();
        int d9 = eVar2.R.f26606f.d() - eVar2.R.e();
        if (d9 >= d8) {
            int v7 = eVar2.v();
            if (eVar2.T() != 8) {
                int i8 = eVar2.f26667x;
                if (i8 == 2) {
                    v7 = (int) (P * 0.5f * (eVar instanceof v.f ? eVar.v() : eVar.I().v()));
                } else if (i8 == 0) {
                    v7 = d9 - d8;
                }
                v7 = Math.max(eVar2.C, v7);
                int i9 = eVar2.D;
                if (i9 > 0) {
                    v7 = Math.min(i9, v7);
                }
            }
            int i10 = d8 + ((int) ((P * ((d9 - d8) - v7)) + 0.5f));
            eVar2.F0(i10, v7 + i10);
            i(i7 + 1, eVar2, interfaceC0139b);
        }
    }

    public static void h(v.f fVar, b.InterfaceC0139b interfaceC0139b) {
        e.b y7 = fVar.y();
        e.b R = fVar.R();
        f26968b = 0;
        f26969c = 0;
        fVar.s0();
        ArrayList n12 = fVar.n1();
        int size = n12.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((v.e) n12.get(i7)).s0();
        }
        boolean K1 = fVar.K1();
        if (y7 == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            v.e eVar = (v.e) n12.get(i8);
            if (eVar instanceof v.g) {
                v.g gVar = (v.g) eVar;
                if (gVar.o1() == 1) {
                    if (gVar.p1() != -1) {
                        gVar.s1(gVar.p1());
                    } else if (gVar.q1() != -1 && fVar.l0()) {
                        gVar.s1(fVar.U() - gVar.q1());
                    } else if (fVar.l0()) {
                        gVar.s1((int) ((gVar.r1() * fVar.U()) + 0.5f));
                    }
                    z7 = true;
                }
            } else if ((eVar instanceof v.a) && ((v.a) eVar).t1() == 0) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i9 = 0; i9 < size; i9++) {
                v.e eVar2 = (v.e) n12.get(i9);
                if (eVar2 instanceof v.g) {
                    v.g gVar2 = (v.g) eVar2;
                    if (gVar2.o1() == 1) {
                        b(0, gVar2, interfaceC0139b, K1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0139b, K1);
        if (z8) {
            for (int i10 = 0; i10 < size; i10++) {
                v.e eVar3 = (v.e) n12.get(i10);
                if (eVar3 instanceof v.a) {
                    v.a aVar = (v.a) eVar3;
                    if (aVar.t1() == 0) {
                        c(0, aVar, interfaceC0139b, 0, K1);
                    }
                }
            }
        }
        if (R == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z9 = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            v.e eVar4 = (v.e) n12.get(i11);
            if (eVar4 instanceof v.g) {
                v.g gVar3 = (v.g) eVar4;
                if (gVar3.o1() == 0) {
                    if (gVar3.p1() != -1) {
                        gVar3.s1(gVar3.p1());
                    } else if (gVar3.q1() != -1 && fVar.m0()) {
                        gVar3.s1(fVar.v() - gVar3.q1());
                    } else if (fVar.m0()) {
                        gVar3.s1((int) ((gVar3.r1() * fVar.v()) + 0.5f));
                    }
                    z9 = true;
                }
            } else if ((eVar4 instanceof v.a) && ((v.a) eVar4).t1() == 1) {
                z10 = true;
            }
        }
        if (z9) {
            for (int i12 = 0; i12 < size; i12++) {
                v.e eVar5 = (v.e) n12.get(i12);
                if (eVar5 instanceof v.g) {
                    v.g gVar4 = (v.g) eVar5;
                    if (gVar4.o1() == 0) {
                        i(1, gVar4, interfaceC0139b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0139b);
        if (z10) {
            for (int i13 = 0; i13 < size; i13++) {
                v.e eVar6 = (v.e) n12.get(i13);
                if (eVar6 instanceof v.a) {
                    v.a aVar2 = (v.a) eVar6;
                    if (aVar2.t1() == 1) {
                        c(0, aVar2, interfaceC0139b, 1, K1);
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            v.e eVar7 = (v.e) n12.get(i14);
            if (eVar7.k0() && a(0, eVar7)) {
                v.f.N1(0, eVar7, interfaceC0139b, f26967a, b.a.f26921k);
                if (!(eVar7 instanceof v.g)) {
                    b(0, eVar7, interfaceC0139b, K1);
                    i(0, eVar7, interfaceC0139b);
                } else if (((v.g) eVar7).o1() == 0) {
                    i(0, eVar7, interfaceC0139b);
                } else {
                    b(0, eVar7, interfaceC0139b, K1);
                }
            }
        }
    }

    private static void i(int i7, v.e eVar, b.InterfaceC0139b interfaceC0139b) {
        v.d dVar;
        v.d dVar2;
        v.d dVar3;
        v.d dVar4;
        if (eVar.n0()) {
            return;
        }
        boolean z7 = true;
        f26969c++;
        if (!(eVar instanceof v.f) && eVar.k0()) {
            int i8 = i7 + 1;
            if (a(i8, eVar)) {
                v.f.N1(i8, eVar, interfaceC0139b, new b.a(), b.a.f26921k);
            }
        }
        v.d m7 = eVar.m(d.b.TOP);
        v.d m8 = eVar.m(d.b.BOTTOM);
        int d8 = m7.d();
        int d9 = m8.d();
        if (m7.c() != null && m7.m()) {
            Iterator it = m7.c().iterator();
            while (it.hasNext()) {
                v.d dVar5 = (v.d) it.next();
                v.e eVar2 = dVar5.f26604d;
                int i9 = i7 + 1;
                boolean a8 = a(i9, eVar2);
                if (eVar2.k0() && a8) {
                    v.f.N1(i9, eVar2, interfaceC0139b, new b.a(), b.a.f26921k);
                }
                boolean z8 = ((dVar5 == eVar2.P && (dVar4 = eVar2.R.f26606f) != null && dVar4.m()) || (dVar5 == eVar2.R && (dVar3 = eVar2.P.f26606f) != null && dVar3.m())) ? z7 : false;
                e.b R = eVar2.R();
                boolean z9 = z7;
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (R != bVar || a8) {
                    if (!eVar2.k0()) {
                        v.d dVar6 = eVar2.P;
                        if (dVar5 == dVar6 && eVar2.R.f26606f == null) {
                            int e8 = dVar6.e() + d8;
                            eVar2.F0(e8, eVar2.v() + e8);
                            i(i9, eVar2, interfaceC0139b);
                        } else {
                            v.d dVar7 = eVar2.R;
                            if (dVar5 == dVar7 && dVar6.f26606f == null) {
                                int e9 = d8 - dVar7.e();
                                eVar2.F0(e9 - eVar2.v(), e9);
                                i(i9, eVar2, interfaceC0139b);
                            } else if (z8 && !eVar2.i0()) {
                                f(i9, interfaceC0139b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.R() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.T() == 8 || (eVar2.f26667x == 0 && eVar2.t() == 0.0f)) && !eVar2.i0() && !eVar2.j0() && z8 && !eVar2.i0())) {
                    g(i9, eVar, interfaceC0139b, eVar2);
                }
                z7 = z9;
            }
        }
        boolean z10 = z7;
        if (eVar instanceof v.g) {
            return;
        }
        if (m8.c() != null && m8.m()) {
            Iterator it2 = m8.c().iterator();
            while (it2.hasNext()) {
                v.d dVar8 = (v.d) it2.next();
                v.e eVar3 = dVar8.f26604d;
                int i10 = i7 + 1;
                boolean a9 = a(i10, eVar3);
                if (eVar3.k0() && a9) {
                    v.f.N1(i10, eVar3, interfaceC0139b, new b.a(), b.a.f26921k);
                }
                boolean z11 = ((dVar8 == eVar3.P && (dVar2 = eVar3.R.f26606f) != null && dVar2.m()) || (dVar8 == eVar3.R && (dVar = eVar3.P.f26606f) != null && dVar.m())) ? z10 : false;
                e.b R2 = eVar3.R();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (R2 != bVar2 || a9) {
                    if (!eVar3.k0()) {
                        v.d dVar9 = eVar3.P;
                        if (dVar8 == dVar9 && eVar3.R.f26606f == null) {
                            int e10 = dVar9.e() + d9;
                            eVar3.F0(e10, eVar3.v() + e10);
                            i(i10, eVar3, interfaceC0139b);
                        } else {
                            v.d dVar10 = eVar3.R;
                            if (dVar8 == dVar10 && dVar9.f26606f == null) {
                                int e11 = d9 - dVar10.e();
                                eVar3.F0(e11 - eVar3.v(), e11);
                                i(i10, eVar3, interfaceC0139b);
                            } else if (z11 && !eVar3.i0()) {
                                f(i10, interfaceC0139b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.R() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.T() == 8 || (eVar3.f26667x == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.j0() && z11 && !eVar3.i0()) {
                        g(i10, eVar, interfaceC0139b, eVar3);
                    }
                }
            }
        }
        v.d m9 = eVar.m(d.b.BASELINE);
        if (m9.c() != null && m9.m()) {
            int d10 = m9.d();
            Iterator it3 = m9.c().iterator();
            while (it3.hasNext()) {
                v.d dVar11 = (v.d) it3.next();
                v.e eVar4 = dVar11.f26604d;
                int i11 = i7 + 1;
                boolean a10 = a(i11, eVar4);
                if (eVar4.k0() && a10) {
                    v.f.N1(i11, eVar4, interfaceC0139b, new b.a(), b.a.f26921k);
                }
                if (eVar4.R() != e.b.MATCH_CONSTRAINT || a10) {
                    if (!eVar4.k0() && dVar11 == eVar4.S) {
                        eVar4.B0(dVar11.e() + d10);
                        i(i11, eVar4, interfaceC0139b);
                    }
                }
            }
        }
        eVar.p0();
    }
}
