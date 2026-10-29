package v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import v.e;
import w.b;

/* compiled from: MyApplication */
public class f extends k {
    private int O0;
    int S0;
    int T0;
    int U0;
    int V0;
    w.b M0 = new w.b(this);
    public w.e N0 = new w.e(this);
    protected b.InterfaceC0139b P0 = null;
    private boolean Q0 = false;
    protected s.d R0 = new s.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];

    /* renamed from: a1, reason: collision with root package name */
    public boolean f26680a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f26681b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f26682c1 = false;

    /* renamed from: d1, reason: collision with root package name */
    public int f26683d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public int f26684e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    private int f26685f1 = 257;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f26686g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f26687h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f26688i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    int f26689j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference f26690k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference f26691l1 = null;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference f26692m1 = null;

    /* renamed from: n1, reason: collision with root package name */
    private WeakReference f26693n1 = null;

    /* renamed from: o1, reason: collision with root package name */
    HashSet f26694o1 = new HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public b.a f26695p1 = new b.a();

    public static boolean N1(int i7, e eVar, b.InterfaceC0139b interfaceC0139b, b.a aVar, int i8) {
        int i9;
        int i10;
        if (interfaceC0139b == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f26928e = 0;
            aVar.f26929f = 0;
            return false;
        }
        aVar.f26924a = eVar.y();
        aVar.f26925b = eVar.R();
        aVar.f26926c = eVar.U();
        aVar.f26927d = eVar.v();
        aVar.f26932i = false;
        aVar.f26933j = i8;
        e.b bVar = aVar.f26924a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f26925b == bVar2;
        boolean z9 = z7 && eVar.f26628d0 > 0.0f;
        boolean z10 = z8 && eVar.f26628d0 > 0.0f;
        if (z7 && eVar.Y(0) && eVar.f26665w == 0 && !z9) {
            aVar.f26924a = e.b.WRAP_CONTENT;
            if (z8 && eVar.f26667x == 0) {
                aVar.f26924a = e.b.FIXED;
            }
            z7 = false;
        }
        if (z8 && eVar.Y(1) && eVar.f26667x == 0 && !z10) {
            aVar.f26925b = e.b.WRAP_CONTENT;
            if (z7 && eVar.f26665w == 0) {
                aVar.f26925b = e.b.FIXED;
            }
            z8 = false;
        }
        if (eVar.l0()) {
            aVar.f26924a = e.b.FIXED;
            z7 = false;
        }
        if (eVar.m0()) {
            aVar.f26925b = e.b.FIXED;
            z8 = false;
        }
        if (z9) {
            if (eVar.f26669y[0] == 4) {
                aVar.f26924a = e.b.FIXED;
            } else if (!z8) {
                e.b bVar3 = aVar.f26925b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i10 = aVar.f26927d;
                } else {
                    aVar.f26924a = e.b.WRAP_CONTENT;
                    interfaceC0139b.b(eVar, aVar);
                    i10 = aVar.f26929f;
                }
                aVar.f26924a = bVar4;
                aVar.f26926c = (int) (eVar.t() * i10);
            }
        }
        if (z10) {
            if (eVar.f26669y[1] == 4) {
                aVar.f26925b = e.b.FIXED;
            } else if (!z7) {
                e.b bVar5 = aVar.f26924a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i9 = aVar.f26926c;
                } else {
                    aVar.f26925b = e.b.WRAP_CONTENT;
                    interfaceC0139b.b(eVar, aVar);
                    i9 = aVar.f26928e;
                }
                aVar.f26925b = bVar6;
                if (eVar.u() == -1) {
                    aVar.f26927d = (int) (i9 / eVar.t());
                } else {
                    aVar.f26927d = (int) (eVar.t() * i9);
                }
            }
        }
        interfaceC0139b.b(eVar, aVar);
        eVar.g1(aVar.f26928e);
        eVar.I0(aVar.f26929f);
        eVar.H0(aVar.f26931h);
        eVar.x0(aVar.f26930g);
        aVar.f26933j = b.a.f26921k;
        return aVar.f26932i;
    }

    private void P1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void t1(e eVar) {
        int i7 = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i7 >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, K1());
        this.W0++;
    }

    private void w1(d dVar, s.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void x1(d dVar, s.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void y1(e eVar) {
        int i7 = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i7 >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, K1());
        this.X0++;
    }

    void A1(d dVar) {
        WeakReference weakReference = this.f26690k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f26690k1.get()).d()) {
            this.f26690k1 = new WeakReference(dVar);
        }
    }

    public boolean B1(boolean z7) {
        return this.N0.f(z7);
    }

    public boolean C1(boolean z7) {
        return this.N0.g(z7);
    }

    public boolean D1(boolean z7, int i7) {
        return this.N0.h(z7, i7);
    }

    public b.InterfaceC0139b E1() {
        return this.P0;
    }

    public int F1() {
        return this.f26685f1;
    }

    public s.d G1() {
        return this.R0;
    }

    public void H1() {
        this.N0.j();
    }

    public void I1() {
        this.N0.k();
    }

    public boolean J1() {
        return this.f26688i1;
    }

    public boolean K1() {
        return this.Q0;
    }

    public boolean L1() {
        return this.f26687h1;
    }

    @Override // v.e
    public void M(StringBuilder sb) {
        sb.append(this.f26649o + ":{\n");
        sb.append("  actualWidth:" + this.f26624b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f26626c0);
        sb.append("\n");
        ArrayList n12 = n1();
        int size = n12.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = n12.get(i7);
            i7++;
            ((e) obj).M(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public long M1(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.S0 = i14;
        this.T0 = i15;
        return this.M0.d(this, i7, i14, i15, i8, i9, i10, i11, i12, i13);
    }

    public boolean O1(int i7) {
        return (this.f26685f1 & i7) == i7;
    }

    public void Q1(b.InterfaceC0139b interfaceC0139b) {
        this.P0 = interfaceC0139b;
        this.N0.n(interfaceC0139b);
    }

    public void R1(int i7) {
        this.f26685f1 = i7;
        s.d.f25925r = O1(512);
    }

    public void S1(int i7) {
        this.O0 = i7;
    }

    public void T1(boolean z7) {
        this.Q0 = z7;
    }

    public boolean U1(s.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean O1 = O1(64);
        m1(dVar, O1);
        int size = this.L0.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.L0.get(i7);
            eVar.m1(dVar, O1);
            if (eVar.a0()) {
                z7 = true;
            }
        }
        return z7;
    }

    public void V1() {
        this.M0.e(this);
    }

    @Override // v.e
    public void l1(boolean z7, boolean z8) {
        super.l1(z7, z8);
        int size = this.L0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.L0.get(i7)).l1(z7, z8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    @Override // v.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o1() {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.o1():void");
    }

    @Override // v.k, v.e
    public void r0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.f26686g1 = false;
        super.r0();
    }

    void r1(e eVar, int i7) {
        if (i7 == 0) {
            t1(eVar);
        } else if (i7 == 1) {
            y1(eVar);
        }
    }

    public boolean s1(s.d dVar) {
        f fVar;
        s.d dVar2;
        boolean O1 = O1(64);
        g(dVar, O1);
        int size = this.L0.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.L0.get(i7);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar2 = (e) this.L0.get(i8);
                if (eVar2 instanceof a) {
                    ((a) eVar2).u1();
                }
            }
        }
        this.f26694o1.clear();
        for (int i9 = 0; i9 < size; i9++) {
            e eVar3 = (e) this.L0.get(i9);
            if (eVar3.f()) {
                eVar3.g(dVar, O1);
            }
        }
        while (this.f26694o1.size() > 0) {
            int size2 = this.f26694o1.size();
            Iterator it = this.f26694o1.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a((e) it.next());
                throw null;
            }
            if (size2 == this.f26694o1.size()) {
                Iterator it2 = this.f26694o1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, O1);
                }
                this.f26694o1.clear();
            }
        }
        if (s.d.f25925r) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar4 = (e) this.L0.get(i10);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                j.a(this, dVar2, eVar5);
                eVar5.g(dVar2, O1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i11 = 0; i11 < size; i11++) {
                e eVar6 = (e) fVar.L0.get(i11);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.c1(e.b.FIXED);
                    }
                    eVar6.g(dVar2, O1);
                    if (bVar == bVar3) {
                        eVar6.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.c1(bVar2);
                    }
                } else {
                    j.a(this, dVar2, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar2, O1);
                    }
                }
            }
        }
        if (fVar.W0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.X0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void u1(d dVar) {
        WeakReference weakReference = this.f26693n1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f26693n1.get()).d()) {
            this.f26693n1 = new WeakReference(dVar);
        }
    }

    public void v1(d dVar) {
        WeakReference weakReference = this.f26691l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f26691l1.get()).d()) {
            this.f26691l1 = new WeakReference(dVar);
        }
    }

    void z1(d dVar) {
        WeakReference weakReference = this.f26692m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > ((d) this.f26692m1.get()).d()) {
            this.f26692m1 = new WeakReference(dVar);
        }
    }
}
