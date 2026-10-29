package v;

import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class k extends e {
    public ArrayList L0 = new ArrayList();

    public void b(e eVar) {
        this.L0.add(eVar);
        if (eVar.I() != null) {
            ((k) eVar.I()).p1(eVar);
        }
        eVar.Y0(this);
    }

    public ArrayList n1() {
        return this.L0;
    }

    public abstract void o1();

    public void p1(e eVar) {
        this.L0.remove(eVar);
        eVar.r0();
    }

    public void q1() {
        this.L0.clear();
    }

    @Override // v.e
    public void r0() {
        this.L0.clear();
        super.r0();
    }

    @Override // v.e
    public void t0(s.c cVar) {
        super.t0(cVar);
        int size = this.L0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.L0.get(i7)).t0(cVar);
        }
    }
}
