package v;

import v.d;
import v.e;

/* compiled from: MyApplication */
public class g extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26696a;

        static {
            int[] iArr = new int[d.b.values().length];
            f26696a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26696a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26696a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26696a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26696a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26696a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26696a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26696a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26696a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.W[i7] = this.P0;
        }
    }

    @Override // v.e
    public void g(s.d dVar, boolean z7) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m7 = fVar.m(d.b.LEFT);
        d m8 = fVar.m(d.b.RIGHT);
        e eVar = this.f26622a0;
        boolean z8 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            m7 = fVar.m(d.b.TOP);
            m8 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f26622a0;
            z8 = eVar2 != null && eVar2.Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.m()) {
            s.i q7 = dVar.q(this.P0);
            dVar.f(q7, this.P0.d());
            if (this.M0 != -1) {
                if (z8) {
                    dVar.h(dVar.q(m8), q7, 0, 5);
                }
            } else if (this.N0 != -1 && z8) {
                s.i q8 = dVar.q(m8);
                dVar.h(q7, dVar.q(m7), 0, 5);
                dVar.h(q8, q7, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            s.i q9 = dVar.q(this.P0);
            dVar.e(q9, dVar.q(m7), this.M0, 8);
            if (z8) {
                dVar.h(dVar.q(m8), q9, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                dVar.d(s.d.s(dVar, dVar.q(this.P0), dVar.q(m8), this.L0));
                return;
            }
            return;
        }
        s.i q10 = dVar.q(this.P0);
        s.i q11 = dVar.q(m8);
        dVar.e(q10, q11, -this.N0, 8);
        if (z8) {
            dVar.h(q10, dVar.q(m7), 0, 5);
            dVar.h(q11, q10, 0, 5);
        }
    }

    @Override // v.e
    public boolean h() {
        return true;
    }

    @Override // v.e
    public boolean l0() {
        return this.S0;
    }

    @Override // v.e
    public d m(d.b bVar) {
        int i7 = a.f26696a[bVar.ordinal()];
        if (i7 == 1 || i7 == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i7 == 3 || i7 == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // v.e
    public boolean m0() {
        return this.S0;
    }

    @Override // v.e
    public void m1(s.d dVar, boolean z7) {
        if (I() == null) {
            return;
        }
        int x7 = dVar.x(this.P0);
        if (this.Q0 == 1) {
            i1(x7);
            j1(0);
            I0(I().v());
            g1(0);
            return;
        }
        i1(0);
        j1(x7);
        g1(I().U());
        I0(0);
    }

    public d n1() {
        return this.P0;
    }

    public int o1() {
        return this.Q0;
    }

    public int p1() {
        return this.M0;
    }

    public int q1() {
        return this.N0;
    }

    public float r1() {
        return this.L0;
    }

    public void s1(int i7) {
        this.P0.s(i7);
        this.S0 = true;
    }

    public void t1(int i7) {
        if (i7 > -1) {
            this.L0 = -1.0f;
            this.M0 = i7;
            this.N0 = -1;
        }
    }

    public void u1(int i7) {
        if (i7 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i7;
        }
    }

    public void v1(float f8) {
        if (f8 > -1.0f) {
            this.L0 = f8;
            this.M0 = -1;
            this.N0 = -1;
        }
    }

    public void w1(int i7) {
        if (this.Q0 == i7) {
            return;
        }
        this.Q0 = i7;
        this.X.clear();
        if (this.Q0 == 1) {
            this.P0 = this.O;
        } else {
            this.P0 = this.P;
        }
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.W[i8] = this.P0;
        }
    }
}
