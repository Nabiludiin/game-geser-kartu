package v;

import v.d;
import v.e;

/* compiled from: MyApplication */
public class a extends i {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    @Override // v.e
    public void g(s.d dVar, boolean z7) {
        d[] dVarArr;
        boolean z8;
        int i7;
        int i8;
        int i9;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i10 = 0;
        while (true) {
            dVarArr = this.W;
            if (i10 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i10];
            dVar2.f26609i = dVar.q(dVar2);
            i10++;
        }
        int i11 = this.N0;
        if (i11 < 0 || i11 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i11];
        if (!this.Q0) {
            p1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i12 = this.N0;
            if (i12 == 0 || i12 == 1) {
                dVar.f(this.O.f26609i, this.f26632f0);
                dVar.f(this.Q.f26609i, this.f26632f0);
                return;
            } else {
                if (i12 == 2 || i12 == 3) {
                    dVar.f(this.P.f26609i, this.f26634g0);
                    dVar.f(this.R.f26609i, this.f26634g0);
                    return;
                }
                return;
            }
        }
        for (int i13 = 0; i13 < this.M0; i13++) {
            e eVar = this.L0[i13];
            if ((this.O0 || eVar.h()) && ((((i8 = this.N0) == 0 || i8 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.O.f26606f != null && eVar.Q.f26606f != null) || (((i9 = this.N0) == 2 || i9 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.P.f26606f != null && eVar.R.f26606f != null))) {
                z8 = true;
                break;
            }
        }
        z8 = false;
        boolean z9 = this.O.k() || this.Q.k();
        boolean z10 = this.P.k() || this.R.k();
        int i14 = !(!z8 && (((i7 = this.N0) == 0 && z9) || ((i7 == 2 && z10) || ((i7 == 1 && z9) || (i7 == 3 && z10))))) ? 4 : 5;
        for (int i15 = 0; i15 < this.M0; i15++) {
            e eVar2 = this.L0[i15];
            if (this.O0 || eVar2.h()) {
                s.i q7 = dVar.q(eVar2.W[this.N0]);
                d[] dVarArr3 = eVar2.W;
                int i16 = this.N0;
                d dVar4 = dVarArr3[i16];
                dVar4.f26609i = q7;
                d dVar5 = dVar4.f26606f;
                int i17 = (dVar5 == null || dVar5.f26604d != this) ? 0 : dVar4.f26607g;
                if (i16 == 0 || i16 == 2) {
                    dVar.i(dVar3.f26609i, q7, this.P0 - i17, z8);
                } else {
                    dVar.g(dVar3.f26609i, q7, this.P0 + i17, z8);
                }
                dVar.e(dVar3.f26609i, q7, this.P0 + i17, i14);
            }
        }
        int i18 = this.N0;
        if (i18 == 0) {
            dVar.e(this.Q.f26609i, this.O.f26609i, 0, 8);
            dVar.e(this.O.f26609i, this.f26622a0.Q.f26609i, 0, 4);
            dVar.e(this.O.f26609i, this.f26622a0.O.f26609i, 0, 0);
            return;
        }
        if (i18 == 1) {
            dVar.e(this.O.f26609i, this.Q.f26609i, 0, 8);
            dVar.e(this.O.f26609i, this.f26622a0.O.f26609i, 0, 4);
            dVar.e(this.O.f26609i, this.f26622a0.Q.f26609i, 0, 0);
        } else if (i18 == 2) {
            dVar.e(this.R.f26609i, this.P.f26609i, 0, 8);
            dVar.e(this.P.f26609i, this.f26622a0.R.f26609i, 0, 4);
            dVar.e(this.P.f26609i, this.f26622a0.P.f26609i, 0, 0);
        } else if (i18 == 3) {
            dVar.e(this.P.f26609i, this.R.f26609i, 0, 8);
            dVar.e(this.P.f26609i, this.f26622a0.P.f26609i, 0, 4);
            dVar.e(this.P.f26609i, this.f26622a0.R.f26609i, 0, 0);
        }
    }

    @Override // v.e
    public boolean h() {
        return true;
    }

    @Override // v.e
    public boolean l0() {
        return this.Q0;
    }

    @Override // v.e
    public boolean m0() {
        return this.Q0;
    }

    public boolean p1() {
        int i7;
        int i8;
        int i9;
        boolean z7 = true;
        int i10 = 0;
        while (true) {
            i7 = this.M0;
            if (i10 >= i7) {
                break;
            }
            e eVar = this.L0[i10];
            if ((this.O0 || eVar.h()) && ((((i8 = this.N0) == 0 || i8 == 1) && !eVar.l0()) || (((i9 = this.N0) == 2 || i9 == 3) && !eVar.m0()))) {
                z7 = false;
            }
            i10++;
        }
        if (!z7 || i7 <= 0) {
            return false;
        }
        int i11 = 0;
        boolean z8 = false;
        for (int i12 = 0; i12 < this.M0; i12++) {
            e eVar2 = this.L0[i12];
            if (this.O0 || eVar2.h()) {
                if (!z8) {
                    int i13 = this.N0;
                    if (i13 == 0) {
                        i11 = eVar2.m(d.b.LEFT).d();
                    } else if (i13 == 1) {
                        i11 = eVar2.m(d.b.RIGHT).d();
                    } else if (i13 == 2) {
                        i11 = eVar2.m(d.b.TOP).d();
                    } else if (i13 == 3) {
                        i11 = eVar2.m(d.b.BOTTOM).d();
                    }
                    z8 = true;
                }
                int i14 = this.N0;
                if (i14 == 0) {
                    i11 = Math.min(i11, eVar2.m(d.b.LEFT).d());
                } else if (i14 == 1) {
                    i11 = Math.max(i11, eVar2.m(d.b.RIGHT).d());
                } else if (i14 == 2) {
                    i11 = Math.min(i11, eVar2.m(d.b.TOP).d());
                } else if (i14 == 3) {
                    i11 = Math.max(i11, eVar2.m(d.b.BOTTOM).d());
                }
            }
        }
        int i15 = i11 + this.P0;
        int i16 = this.N0;
        if (i16 == 0 || i16 == 1) {
            C0(i15, i15);
        } else {
            F0(i15, i15);
        }
        this.Q0 = true;
        return true;
    }

    public boolean q1() {
        return this.O0;
    }

    public int r1() {
        return this.N0;
    }

    public int s1() {
        return this.P0;
    }

    public int t1() {
        int i7 = this.N0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    @Override // v.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i7 = 0; i7 < this.M0; i7++) {
            e eVar = this.L0[i7];
            if (i7 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    protected void u1() {
        for (int i7 = 0; i7 < this.M0; i7++) {
            e eVar = this.L0[i7];
            if (this.O0 || eVar.h()) {
                int i8 = this.N0;
                if (i8 == 0 || i8 == 1) {
                    eVar.P0(0, true);
                } else if (i8 == 2 || i8 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void v1(boolean z7) {
        this.O0 = z7;
    }

    public void w1(int i7) {
        this.N0 = i7;
    }

    public void x1(int i7) {
        this.P0 = i7;
    }
}
