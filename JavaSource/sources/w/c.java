package w;

import java.util.ArrayList;

/* compiled from: MyApplication */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f26934k;

    /* renamed from: l, reason: collision with root package name */
    private int f26935l;

    public c(v.e eVar, int i7) {
        super(eVar);
        this.f26934k = new ArrayList();
        this.f27003f = i7;
        q();
    }

    private void q() {
        v.e eVar;
        v.e eVar2 = this.f26999b;
        v.e J = eVar2.J(this.f27003f);
        while (true) {
            v.e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                J = eVar2.J(this.f27003f);
            }
        }
        this.f26999b = eVar;
        this.f26934k.add(eVar.L(this.f27003f));
        v.e H = eVar.H(this.f27003f);
        while (H != null) {
            this.f26934k.add(H.L(this.f27003f));
            H = H.H(this.f27003f);
        }
        ArrayList arrayList = this.f26934k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            p pVar = (p) obj;
            int i8 = this.f27003f;
            if (i8 == 0) {
                pVar.f26999b.f26625c = this;
            } else if (i8 == 1) {
                pVar.f26999b.f26627d = this;
            }
        }
        if (this.f27003f == 0 && ((v.f) this.f26999b.I()).K1() && this.f26934k.size() > 1) {
            ArrayList arrayList2 = this.f26934k;
            this.f26999b = ((p) arrayList2.get(arrayList2.size() - 1)).f26999b;
        }
        this.f26935l = this.f27003f == 0 ? this.f26999b.x() : this.f26999b.Q();
    }

    private v.e r() {
        for (int i7 = 0; i7 < this.f26934k.size(); i7++) {
            p pVar = (p) this.f26934k.get(i7);
            if (pVar.f26999b.T() != 8) {
                return pVar.f26999b;
            }
        }
        return null;
    }

    private v.e s() {
        for (int size = this.f26934k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f26934k.get(size);
            if (pVar.f26999b.T() != 8) {
                return pVar.f26999b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f6, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
    
        if (r3.f26954j != false) goto L56;
     */
    @Override // w.p, w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(w.d r27) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(w.d):void");
    }

    @Override // w.p
    void d() {
        ArrayList arrayList = this.f26934k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p) obj).d();
        }
        int size2 = this.f26934k.size();
        if (size2 < 1) {
            return;
        }
        v.e eVar = ((p) this.f26934k.get(0)).f26999b;
        v.e eVar2 = ((p) this.f26934k.get(size2 - 1)).f26999b;
        if (this.f27003f == 0) {
            v.d dVar = eVar.O;
            v.d dVar2 = eVar2.Q;
            f i8 = i(dVar, 0);
            int e8 = dVar.e();
            v.e r7 = r();
            if (r7 != null) {
                e8 = r7.O.e();
            }
            if (i8 != null) {
                b(this.f27005h, i8, e8);
            }
            f i9 = i(dVar2, 0);
            int e9 = dVar2.e();
            v.e s7 = s();
            if (s7 != null) {
                e9 = s7.Q.e();
            }
            if (i9 != null) {
                b(this.f27006i, i9, -e9);
            }
        } else {
            v.d dVar3 = eVar.P;
            v.d dVar4 = eVar2.R;
            f i10 = i(dVar3, 1);
            int e10 = dVar3.e();
            v.e r8 = r();
            if (r8 != null) {
                e10 = r8.P.e();
            }
            if (i10 != null) {
                b(this.f27005h, i10, e10);
            }
            f i11 = i(dVar4, 1);
            int e11 = dVar4.e();
            v.e s8 = s();
            if (s8 != null) {
                e11 = s8.R.e();
            }
            if (i11 != null) {
                b(this.f27006i, i11, -e11);
            }
        }
        this.f27005h.f26945a = this;
        this.f27006i.f26945a = this;
    }

    @Override // w.p
    public void e() {
        for (int i7 = 0; i7 < this.f26934k.size(); i7++) {
            ((p) this.f26934k.get(i7)).e();
        }
    }

    @Override // w.p
    void f() {
        this.f27000c = null;
        ArrayList arrayList = this.f26934k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((p) obj).f();
        }
    }

    @Override // w.p
    public long j() {
        int size = this.f26934k.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j7 = j7 + r4.f27005h.f26950f + ((p) this.f26934k.get(i7)).j() + r4.f27006i.f26950f;
        }
        return j7;
    }

    @Override // w.p
    boolean m() {
        int size = this.f26934k.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((p) this.f26934k.get(i7)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f27003f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f26934k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            sb.append("<");
            sb.append((p) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
