package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.e;
import w.b;

/* compiled from: MyApplication */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private v.f f26936a;

    /* renamed from: d, reason: collision with root package name */
    private v.f f26939d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26937b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26938c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f26940e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f26941f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0139b f26942g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f26943h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList f26944i = new ArrayList();

    public e(v.f fVar) {
        this.f26936a = fVar;
        this.f26939d = fVar;
    }

    private void a(f fVar, int i7, int i8, f fVar2, ArrayList arrayList, m mVar) {
        int i9;
        f fVar3;
        ArrayList arrayList2;
        p pVar = fVar.f26948d;
        if (pVar.f27000c == null) {
            v.f fVar4 = this.f26936a;
            if (pVar == fVar4.f26629e || pVar == fVar4.f26631f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i8);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f27000c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f27005h.f26955k) {
                if (dVar instanceof f) {
                    i9 = i7;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i9, 0, fVar3, arrayList2, mVar2);
                } else {
                    i9 = i7;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i7 = i9;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i10 = i7;
            f fVar5 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : pVar.f27006i.f26955k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i10 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f26980k.f26955k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f27005h.f26956l) {
                if (fVar6 == fVar5) {
                    mVar2.f26974b = true;
                }
                a(fVar6, i10, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f27006i.f26956l) {
                if (fVar7 == fVar5) {
                    mVar2.f26974b = true;
                }
                a(fVar7, i10, 1, fVar5, arrayList3, mVar2);
            }
            if (i10 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f26980k.f26956l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i10, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    private boolean b(v.f fVar) {
        e.b bVar;
        int i7;
        e.b bVar2;
        float f8;
        float f9;
        e.b bVar3;
        e.b bVar4;
        e.b bVar5;
        ArrayList arrayList = fVar.L0;
        int size = arrayList.size();
        char c8 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            v.e eVar = (v.e) obj;
            e.b[] bVarArr = eVar.Z;
            e.b bVar6 = bVarArr[c8 == true ? 1 : 0];
            e.b bVar7 = bVarArr[1];
            if (eVar.T() == 8) {
                eVar.f26621a = true;
            } else {
                if (eVar.B < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar.f26665w = 2;
                }
                if (eVar.E < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    eVar.f26667x = 2;
                }
                if (eVar.t() > 0.0f) {
                    e.b bVar8 = e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        eVar.f26665w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar.f26667x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f26665w == 0) {
                            eVar.f26665w = 3;
                        }
                        if (eVar.f26667x == 0) {
                            eVar.f26667x = 3;
                        }
                    }
                }
                e.b bVar9 = e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f26665w == 1 && (eVar.O.f26606f == null || eVar.Q.f26606f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar.f26667x == 1 && (eVar.P.f26606f == null || eVar.R.f26606f == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                l lVar = eVar.f26629e;
                lVar.f27001d = bVar6;
                int i9 = eVar.f26665w;
                lVar.f26998a = i9;
                n nVar = eVar.f26631f;
                nVar.f27001d = bVar7;
                int i10 = eVar.f26667x;
                nVar.f26998a = i10;
                e.b bVar10 = e.b.MATCH_PARENT;
                char c9 = c8 == true ? 1 : 0;
                if ((bVar6 == bVar10 || bVar6 == e.b.FIXED || bVar6 == e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == e.b.FIXED || bVar7 == e.b.WRAP_CONTENT)) {
                    e.b bVar11 = bVar7;
                    e.b bVar12 = bVar6;
                    int U = eVar.U();
                    if (bVar12 == bVar10) {
                        U = (fVar.U() - eVar.O.f26607g) - eVar.Q.f26607g;
                        bVar12 = e.b.FIXED;
                    }
                    int i11 = U;
                    int v7 = eVar.v();
                    if (bVar11 == bVar10) {
                        v7 = (fVar.v() - eVar.P.f26607g) - eVar.R.f26607g;
                        bVar11 = e.b.FIXED;
                    }
                    l(eVar, bVar12, i11, bVar11, v7);
                    eVar.f26629e.f27002e.d(eVar.U());
                    eVar.f26631f.f27002e.d(eVar.v());
                    eVar.f26621a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        f9 = 0.5f;
                        e.b bVar13 = e.b.WRAP_CONTENT;
                        f8 = 1.0f;
                        if (bVar7 != bVar13 && bVar7 != e.b.FIXED) {
                            bVar = bVar7;
                            i7 = 3;
                        } else if (i9 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar, bVar13, 0, bVar13, 0);
                            }
                            int v8 = eVar.v();
                            int i12 = (int) ((v8 * eVar.f26628d0) + 0.5f);
                            e.b bVar14 = e.b.FIXED;
                            l(eVar, bVar14, i12, bVar14, v8);
                            eVar.f26629e.f27002e.d(eVar.U());
                            eVar.f26631f.f27002e.d(eVar.v());
                            eVar.f26621a = true;
                        } else if (i9 == 1) {
                            l(eVar, bVar13, 0, bVar7, 0);
                            eVar.f26629e.f27002e.f26966m = eVar.U();
                        } else {
                            bVar = bVar7;
                            i7 = 3;
                            if (i9 == 2) {
                                e.b bVar15 = fVar.Z[c9];
                                e.b bVar16 = e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar, bVar16, (int) ((eVar.B * fVar.U()) + 0.5f), bVar, eVar.v());
                                    eVar.f26629e.f27002e.d(eVar.U());
                                    eVar.f26631f.f27002e.d(eVar.v());
                                    eVar.f26621a = true;
                                }
                            } else {
                                v.d[] dVarArr = eVar.W;
                                if (dVarArr[c9].f26606f == null || dVarArr[1].f26606f == null) {
                                    l(eVar, bVar13, 0, bVar, 0);
                                    eVar.f26629e.f27002e.d(eVar.U());
                                    eVar.f26631f.f27002e.d(eVar.v());
                                    eVar.f26621a = true;
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i7 = 3;
                        bVar2 = bVar9;
                        f8 = 1.0f;
                        f9 = 0.5f;
                    }
                    if (bVar != bVar2 || (bVar6 != (bVar4 = e.b.WRAP_CONTENT) && bVar6 != e.b.FIXED)) {
                        bVar3 = bVar6;
                    } else if (i10 == i7) {
                        if (bVar6 == bVar4) {
                            l(eVar, bVar4, 0, bVar4, 0);
                        }
                        int U2 = eVar.U();
                        float f10 = eVar.f26628d0;
                        if (eVar.u() == -1) {
                            f10 = f8 / f10;
                        }
                        e.b bVar17 = e.b.FIXED;
                        l(eVar, bVar17, U2, bVar17, (int) ((U2 * f10) + f9));
                        eVar.f26629e.f27002e.d(eVar.U());
                        eVar.f26631f.f27002e.d(eVar.v());
                        eVar.f26621a = true;
                    } else if (i10 == 1) {
                        l(eVar, bVar6, 0, bVar4, 0);
                        eVar.f26631f.f27002e.f26966m = eVar.v();
                    } else {
                        bVar3 = bVar6;
                        if (i10 == 2) {
                            e.b bVar18 = fVar.Z[1];
                            bVar5 = bVar;
                            e.b bVar19 = e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                l(eVar, bVar3, eVar.U(), bVar19, (int) ((eVar.E * fVar.v()) + f9));
                                eVar.f26629e.f27002e.d(eVar.U());
                                eVar.f26631f.f27002e.d(eVar.v());
                                eVar.f26621a = true;
                            }
                            bVar = bVar5;
                        } else {
                            bVar5 = bVar;
                            v.d[] dVarArr2 = eVar.W;
                            if (dVarArr2[2].f26606f == null || dVarArr2[i7].f26606f == null) {
                                l(eVar, bVar4, 0, bVar5, 0);
                                eVar.f26629e.f27002e.d(eVar.U());
                                eVar.f26631f.f27002e.d(eVar.v());
                                eVar.f26621a = true;
                            }
                            bVar = bVar5;
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i9 == 1 || i10 == 1) {
                            e.b bVar20 = e.b.WRAP_CONTENT;
                            l(eVar, bVar20, 0, bVar20, 0);
                            eVar.f26629e.f27002e.f26966m = eVar.U();
                            eVar.f26631f.f27002e.f26966m = eVar.v();
                        } else if (i10 == 2 && i9 == 2) {
                            e.b[] bVarArr2 = fVar.Z;
                            e.b bVar21 = bVarArr2[c9];
                            e.b bVar22 = e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                l(eVar, bVar22, (int) ((eVar.B * fVar.U()) + f9), bVar22, (int) ((eVar.E * fVar.v()) + f9));
                                eVar.f26629e.f27002e.d(eVar.U());
                                eVar.f26631f.f27002e.d(eVar.v());
                                eVar.f26621a = true;
                            }
                        }
                    }
                }
                c8 = c9;
            }
        }
        return c8 == true ? 1 : 0;
    }

    private int e(v.f fVar, int i7) {
        int size = this.f26944i.size();
        long j7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            j7 = Math.max(j7, ((m) this.f26944i.get(i8)).b(fVar, i7));
        }
        return (int) j7;
    }

    private void i(p pVar, int i7, ArrayList arrayList) {
        for (d dVar : pVar.f27005h.f26955k) {
            if (dVar instanceof f) {
                a((f) dVar, i7, 0, pVar.f27006i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f27005h, i7, 0, pVar.f27006i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f27006i.f26955k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i7, 1, pVar.f27005h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f27006i, i7, 1, pVar.f27005h, arrayList, null);
            }
        }
        int i8 = i7;
        if (i8 == 1) {
            for (d dVar3 : ((n) pVar).f26980k.f26955k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i8, 2, null, arrayList, null);
                }
                i8 = i7;
            }
        }
    }

    private void l(v.e eVar, e.b bVar, int i7, e.b bVar2, int i8) {
        b.a aVar = this.f26943h;
        aVar.f26924a = bVar;
        aVar.f26925b = bVar2;
        aVar.f26926c = i7;
        aVar.f26927d = i8;
        this.f26942g.b(eVar, aVar);
        eVar.g1(this.f26943h.f26928e);
        eVar.I0(this.f26943h.f26929f);
        eVar.H0(this.f26943h.f26931h);
        eVar.x0(this.f26943h.f26930g);
    }

    public void c() {
        d(this.f26940e);
        this.f26944i.clear();
        m.f26972h = 0;
        i(this.f26936a.f26629e, 0, this.f26944i);
        i(this.f26936a.f26631f, 1, this.f26944i);
        this.f26937b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f26939d.f26629e.f();
        this.f26939d.f26631f.f();
        arrayList.add(this.f26939d.f26629e);
        arrayList.add(this.f26939d.f26631f);
        ArrayList arrayList2 = this.f26939d.L0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            v.e eVar = (v.e) obj;
            if (eVar instanceof v.g) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.g0()) {
                    if (eVar.f26625c == null) {
                        eVar.f26625c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f26625c);
                } else {
                    arrayList.add(eVar.f26629e);
                }
                if (eVar.i0()) {
                    if (eVar.f26627d == null) {
                        eVar.f26627d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f26627d);
                } else {
                    arrayList.add(eVar.f26631f);
                }
                if (eVar instanceof v.i) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            ((p) obj2).f();
        }
        int size3 = arrayList.size();
        while (i7 < size3) {
            Object obj3 = arrayList.get(i7);
            i7++;
            p pVar = (p) obj3;
            if (pVar.f26999b != this.f26939d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z7) {
        boolean z8;
        boolean z9 = false;
        if (this.f26937b || this.f26938c) {
            ArrayList arrayList = this.f26936a.L0;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v.e eVar = (v.e) obj;
                eVar.l();
                eVar.f26621a = false;
                eVar.f26629e.r();
                eVar.f26631f.q();
            }
            this.f26936a.l();
            v.f fVar = this.f26936a;
            fVar.f26621a = false;
            fVar.f26629e.r();
            this.f26936a.f26631f.q();
            this.f26938c = false;
        }
        if (b(this.f26939d)) {
            return false;
        }
        this.f26936a.i1(0);
        this.f26936a.j1(0);
        e.b s7 = this.f26936a.s(0);
        e.b s8 = this.f26936a.s(1);
        if (this.f26937b) {
            c();
        }
        int V = this.f26936a.V();
        int W = this.f26936a.W();
        this.f26936a.f26629e.f27005h.d(V);
        this.f26936a.f26631f.f27005h.d(W);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s7 == bVar || s8 == bVar) {
            if (z7) {
                ArrayList arrayList2 = this.f26940e;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    if (!((p) obj2).m()) {
                        z7 = false;
                        break;
                    }
                }
            }
            if (z7 && s7 == e.b.WRAP_CONTENT) {
                this.f26936a.M0(e.b.FIXED);
                v.f fVar2 = this.f26936a;
                fVar2.g1(e(fVar2, 0));
                v.f fVar3 = this.f26936a;
                fVar3.f26629e.f27002e.d(fVar3.U());
            }
            if (z7 && s8 == e.b.WRAP_CONTENT) {
                this.f26936a.c1(e.b.FIXED);
                v.f fVar4 = this.f26936a;
                fVar4.I0(e(fVar4, 1));
                v.f fVar5 = this.f26936a;
                fVar5.f26631f.f27002e.d(fVar5.v());
            }
        }
        v.f fVar6 = this.f26936a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int U = fVar6.U() + V;
            this.f26936a.f26629e.f27006i.d(U);
            this.f26936a.f26629e.f27002e.d(U - V);
            m();
            v.f fVar7 = this.f26936a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v7 = fVar7.v() + W;
                this.f26936a.f26631f.f27006i.d(v7);
                this.f26936a.f26631f.f27002e.d(v7 - W);
            }
            m();
            z8 = true;
        } else {
            z8 = false;
        }
        ArrayList arrayList3 = this.f26940e;
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj3 = arrayList3.get(i9);
            i9++;
            p pVar = (p) obj3;
            if (pVar.f26999b != this.f26936a || pVar.f27004g) {
                pVar.e();
            }
        }
        ArrayList arrayList4 = this.f26940e;
        int size4 = arrayList4.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                z9 = true;
                break;
            }
            Object obj4 = arrayList4.get(i10);
            i10++;
            p pVar2 = (p) obj4;
            if (z8 || pVar2.f26999b != this.f26936a) {
                if (!pVar2.f27005h.f26954j) {
                    break;
                }
                if (!pVar2.f27006i.f26954j) {
                    if (!(pVar2 instanceof j)) {
                        break;
                    }
                }
                if (!pVar2.f27002e.f26954j && !(pVar2 instanceof c) && !(pVar2 instanceof j)) {
                    break;
                }
            }
        }
        this.f26936a.M0(s7);
        this.f26936a.c1(s8);
        return z9;
    }

    public boolean g(boolean z7) {
        if (this.f26937b) {
            ArrayList arrayList = this.f26936a.L0;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                v.e eVar = (v.e) obj;
                eVar.l();
                eVar.f26621a = false;
                l lVar = eVar.f26629e;
                lVar.f27002e.f26954j = false;
                lVar.f27004g = false;
                lVar.r();
                n nVar = eVar.f26631f;
                nVar.f27002e.f26954j = false;
                nVar.f27004g = false;
                nVar.q();
            }
            this.f26936a.l();
            v.f fVar = this.f26936a;
            fVar.f26621a = false;
            l lVar2 = fVar.f26629e;
            lVar2.f27002e.f26954j = false;
            lVar2.f27004g = false;
            lVar2.r();
            n nVar2 = this.f26936a.f26631f;
            nVar2.f27002e.f26954j = false;
            nVar2.f27004g = false;
            nVar2.q();
            c();
        }
        if (b(this.f26939d)) {
            return false;
        }
        this.f26936a.i1(0);
        this.f26936a.j1(0);
        this.f26936a.f26629e.f27005h.d(0);
        this.f26936a.f26631f.f27005h.d(0);
        return true;
    }

    public boolean h(boolean z7, int i7) {
        boolean z8;
        e.b bVar;
        boolean z9 = false;
        e.b s7 = this.f26936a.s(0);
        e.b s8 = this.f26936a.s(1);
        int V = this.f26936a.V();
        int W = this.f26936a.W();
        if (z7 && (s7 == (bVar = e.b.WRAP_CONTENT) || s8 == bVar)) {
            ArrayList arrayList = this.f26940e;
            int size = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                Object obj = arrayList.get(i8);
                i8++;
                p pVar = (p) obj;
                if (pVar.f27003f == i7 && !pVar.m()) {
                    z7 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z7 && s7 == e.b.WRAP_CONTENT) {
                    this.f26936a.M0(e.b.FIXED);
                    v.f fVar = this.f26936a;
                    fVar.g1(e(fVar, 0));
                    v.f fVar2 = this.f26936a;
                    fVar2.f26629e.f27002e.d(fVar2.U());
                }
            } else if (z7 && s8 == e.b.WRAP_CONTENT) {
                this.f26936a.c1(e.b.FIXED);
                v.f fVar3 = this.f26936a;
                fVar3.I0(e(fVar3, 1));
                v.f fVar4 = this.f26936a;
                fVar4.f26631f.f27002e.d(fVar4.v());
            }
        }
        if (i7 == 0) {
            v.f fVar5 = this.f26936a;
            e.b bVar2 = fVar5.Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int U = fVar5.U() + V;
                this.f26936a.f26629e.f27006i.d(U);
                this.f26936a.f26629e.f27002e.d(U - V);
                z8 = true;
            }
            z8 = false;
        } else {
            v.f fVar6 = this.f26936a;
            e.b bVar3 = fVar6.Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v7 = fVar6.v() + W;
                this.f26936a.f26631f.f27006i.d(v7);
                this.f26936a.f26631f.f27002e.d(v7 - W);
                z8 = true;
            }
            z8 = false;
        }
        m();
        ArrayList arrayList2 = this.f26940e;
        int size2 = arrayList2.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            p pVar2 = (p) obj2;
            if (pVar2.f27003f == i7 && (pVar2.f26999b != this.f26936a || pVar2.f27004g)) {
                pVar2.e();
            }
        }
        ArrayList arrayList3 = this.f26940e;
        int size3 = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                z9 = true;
                break;
            }
            Object obj3 = arrayList3.get(i10);
            i10++;
            p pVar3 = (p) obj3;
            if (pVar3.f27003f == i7 && (z8 || pVar3.f26999b != this.f26936a)) {
                if (!pVar3.f27005h.f26954j) {
                    break;
                }
                if (!pVar3.f27006i.f26954j) {
                    break;
                }
                if (!(pVar3 instanceof c) && !pVar3.f27002e.f26954j) {
                    break;
                }
            }
        }
        this.f26936a.M0(s7);
        this.f26936a.c1(s8);
        return z9;
    }

    public void j() {
        this.f26937b = true;
    }

    public void k() {
        this.f26938c = true;
    }

    public void m() {
        g gVar;
        ArrayList arrayList = this.f26936a.L0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v.e eVar = (v.e) obj;
            if (!eVar.f26621a) {
                e.b[] bVarArr = eVar.Z;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i8 = eVar.f26665w;
                int i9 = eVar.f26667x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z7 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i8 == 1);
                boolean z8 = bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i9 == 1);
                g gVar2 = eVar.f26629e.f27002e;
                boolean z9 = gVar2.f26954j;
                g gVar3 = eVar.f26631f.f27002e;
                boolean z10 = gVar3.f26954j;
                if (z9 && z10) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar2.f26951g, bVar4, gVar3.f26951g);
                    eVar.f26621a = true;
                } else if (z9 && z8) {
                    l(eVar, e.b.FIXED, gVar2.f26951g, bVar3, gVar3.f26951g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f26631f.f27002e.f26966m = eVar.v();
                    } else {
                        eVar.f26631f.f27002e.d(eVar.v());
                        eVar.f26621a = true;
                    }
                } else if (z10 && z7) {
                    l(eVar, bVar3, gVar2.f26951g, e.b.FIXED, gVar3.f26951g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f26629e.f27002e.f26966m = eVar.U();
                    } else {
                        eVar.f26629e.f27002e.d(eVar.U());
                        eVar.f26621a = true;
                    }
                }
                if (eVar.f26621a && (gVar = eVar.f26631f.f26981l) != null) {
                    gVar.d(eVar.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0139b interfaceC0139b) {
        this.f26942g = interfaceC0139b;
    }
}
