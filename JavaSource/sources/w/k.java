package w;

import java.util.Iterator;
import w.f;

/* compiled from: MyApplication */
class k extends p {
    public k(v.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f27005h.f26955k.add(fVar);
        fVar.f26956l.add(this.f27005h);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        v.a aVar = (v.a) this.f26999b;
        int r12 = aVar.r1();
        Iterator it = this.f27005h.f26956l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = ((f) it.next()).f26951g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (r12 == 0 || r12 == 2) {
            this.f27005h.d(i8 + aVar.s1());
        } else {
            this.f27005h.d(i7 + aVar.s1());
        }
    }

    @Override // w.p
    void d() {
        v.e eVar = this.f26999b;
        if (eVar instanceof v.a) {
            this.f27005h.f26946b = true;
            v.a aVar = (v.a) eVar;
            int r12 = aVar.r1();
            boolean q12 = aVar.q1();
            int i7 = 0;
            if (r12 == 0) {
                this.f27005h.f26949e = f.a.LEFT;
                while (i7 < aVar.M0) {
                    v.e eVar2 = aVar.L0[i7];
                    if (q12 || eVar2.T() != 8) {
                        f fVar = eVar2.f26629e.f27005h;
                        fVar.f26955k.add(this.f27005h);
                        this.f27005h.f26956l.add(fVar);
                    }
                    i7++;
                }
                q(this.f26999b.f26629e.f27005h);
                q(this.f26999b.f26629e.f27006i);
                return;
            }
            if (r12 == 1) {
                this.f27005h.f26949e = f.a.RIGHT;
                while (i7 < aVar.M0) {
                    v.e eVar3 = aVar.L0[i7];
                    if (q12 || eVar3.T() != 8) {
                        f fVar2 = eVar3.f26629e.f27006i;
                        fVar2.f26955k.add(this.f27005h);
                        this.f27005h.f26956l.add(fVar2);
                    }
                    i7++;
                }
                q(this.f26999b.f26629e.f27005h);
                q(this.f26999b.f26629e.f27006i);
                return;
            }
            if (r12 == 2) {
                this.f27005h.f26949e = f.a.TOP;
                while (i7 < aVar.M0) {
                    v.e eVar4 = aVar.L0[i7];
                    if (q12 || eVar4.T() != 8) {
                        f fVar3 = eVar4.f26631f.f27005h;
                        fVar3.f26955k.add(this.f27005h);
                        this.f27005h.f26956l.add(fVar3);
                    }
                    i7++;
                }
                q(this.f26999b.f26631f.f27005h);
                q(this.f26999b.f26631f.f27006i);
                return;
            }
            if (r12 != 3) {
                return;
            }
            this.f27005h.f26949e = f.a.BOTTOM;
            while (i7 < aVar.M0) {
                v.e eVar5 = aVar.L0[i7];
                if (q12 || eVar5.T() != 8) {
                    f fVar4 = eVar5.f26631f.f27006i;
                    fVar4.f26955k.add(this.f27005h);
                    this.f27005h.f26956l.add(fVar4);
                }
                i7++;
            }
            q(this.f26999b.f26631f.f27005h);
            q(this.f26999b.f26631f.f27006i);
        }
    }

    @Override // w.p
    public void e() {
        v.e eVar = this.f26999b;
        if (eVar instanceof v.a) {
            int r12 = ((v.a) eVar).r1();
            if (r12 == 0 || r12 == 1) {
                this.f26999b.i1(this.f27005h.f26951g);
            } else {
                this.f26999b.j1(this.f27005h.f26951g);
            }
        }
    }

    @Override // w.p
    void f() {
        this.f27000c = null;
        this.f27005h.c();
    }

    @Override // w.p
    boolean m() {
        return false;
    }
}
