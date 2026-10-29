package w;

import v.d;
import v.e;
import w.f;
import w.p;

/* compiled from: MyApplication */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f26980k;

    /* renamed from: l, reason: collision with root package name */
    g f26981l;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26982a;

        static {
            int[] iArr = new int[p.b.values().length];
            f26982a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26982a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26982a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(v.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f26980k = fVar;
        this.f26981l = null;
        this.f27005h.f26949e = f.a.TOP;
        this.f27006i.f26949e = f.a.BOTTOM;
        fVar.f26949e = f.a.BASELINE;
        this.f27003f = 1;
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        float f8;
        float t7;
        float f9;
        int i7;
        int i8 = a.f26982a[this.f27007j.ordinal()];
        if (i8 == 1) {
            p(dVar);
        } else if (i8 == 2) {
            o(dVar);
        } else if (i8 == 3) {
            v.e eVar = this.f26999b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f27002e;
        if (gVar.f26947c && !gVar.f26954j && this.f27001d == e.b.MATCH_CONSTRAINT) {
            v.e eVar2 = this.f26999b;
            int i9 = eVar2.f26667x;
            if (i9 == 2) {
                v.e I = eVar2.I();
                if (I != null) {
                    if (I.f26631f.f27002e.f26954j) {
                        this.f27002e.d((int) ((r7.f26951g * this.f26999b.E) + 0.5f));
                    }
                }
            } else if (i9 == 3 && eVar2.f26629e.f27002e.f26954j) {
                int u7 = eVar2.u();
                if (u7 == -1) {
                    v.e eVar3 = this.f26999b;
                    f8 = eVar3.f26629e.f27002e.f26951g;
                    t7 = eVar3.t();
                } else if (u7 == 0) {
                    f9 = r7.f26629e.f27002e.f26951g * this.f26999b.t();
                    i7 = (int) (f9 + 0.5f);
                    this.f27002e.d(i7);
                } else if (u7 != 1) {
                    i7 = 0;
                    this.f27002e.d(i7);
                } else {
                    v.e eVar4 = this.f26999b;
                    f8 = eVar4.f26629e.f27002e.f26951g;
                    t7 = eVar4.t();
                }
                f9 = f8 / t7;
                i7 = (int) (f9 + 0.5f);
                this.f27002e.d(i7);
            }
        }
        f fVar = this.f27005h;
        if (fVar.f26947c) {
            f fVar2 = this.f27006i;
            if (fVar2.f26947c) {
                if (fVar.f26954j && fVar2.f26954j && this.f27002e.f26954j) {
                    return;
                }
                if (!this.f27002e.f26954j && this.f27001d == e.b.MATCH_CONSTRAINT) {
                    v.e eVar5 = this.f26999b;
                    if (eVar5.f26665w == 0 && !eVar5.i0()) {
                        f fVar3 = (f) this.f27005h.f26956l.get(0);
                        f fVar4 = (f) this.f27006i.f26956l.get(0);
                        int i10 = fVar3.f26951g;
                        f fVar5 = this.f27005h;
                        int i11 = i10 + fVar5.f26950f;
                        int i12 = fVar4.f26951g + this.f27006i.f26950f;
                        fVar5.d(i11);
                        this.f27006i.d(i12);
                        this.f27002e.d(i12 - i11);
                        return;
                    }
                }
                if (!this.f27002e.f26954j && this.f27001d == e.b.MATCH_CONSTRAINT && this.f26998a == 1 && this.f27005h.f26956l.size() > 0 && this.f27006i.f26956l.size() > 0) {
                    f fVar6 = (f) this.f27005h.f26956l.get(0);
                    int i13 = (((f) this.f27006i.f26956l.get(0)).f26951g + this.f27006i.f26950f) - (fVar6.f26951g + this.f27005h.f26950f);
                    g gVar2 = this.f27002e;
                    int i14 = gVar2.f26966m;
                    if (i13 < i14) {
                        gVar2.d(i13);
                    } else {
                        gVar2.d(i14);
                    }
                }
                if (this.f27002e.f26954j && this.f27005h.f26956l.size() > 0 && this.f27006i.f26956l.size() > 0) {
                    f fVar7 = (f) this.f27005h.f26956l.get(0);
                    f fVar8 = (f) this.f27006i.f26956l.get(0);
                    int i15 = fVar7.f26951g + this.f27005h.f26950f;
                    int i16 = fVar8.f26951g + this.f27006i.f26950f;
                    float P = this.f26999b.P();
                    if (fVar7 == fVar8) {
                        i15 = fVar7.f26951g;
                        i16 = fVar8.f26951g;
                        P = 0.5f;
                    }
                    this.f27005h.d((int) (i15 + 0.5f + (((i16 - i15) - this.f27002e.f26951g) * P)));
                    this.f27006i.d(this.f27005h.f26951g + this.f27002e.f26951g);
                }
            }
        }
    }

    @Override // w.p
    void d() {
        v.e I;
        v.e I2;
        v.e eVar = this.f26999b;
        if (eVar.f26621a) {
            this.f27002e.d(eVar.v());
        }
        if (!this.f27002e.f26954j) {
            this.f27001d = this.f26999b.R();
            if (this.f26999b.X()) {
                this.f26981l = new w.a(this);
            }
            e.b bVar = this.f27001d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f26999b.I()) != null && I2.R() == e.b.FIXED) {
                    int v7 = (I2.v() - this.f26999b.P.e()) - this.f26999b.R.e();
                    b(this.f27005h, I2.f26631f.f27005h, this.f26999b.P.e());
                    b(this.f27006i, I2.f26631f.f27006i, -this.f26999b.R.e());
                    this.f27002e.d(v7);
                    return;
                }
                if (this.f27001d == e.b.FIXED) {
                    this.f27002e.d(this.f26999b.v());
                }
            }
        } else if (this.f27001d == e.b.MATCH_PARENT && (I = this.f26999b.I()) != null && I.R() == e.b.FIXED) {
            b(this.f27005h, I.f26631f.f27005h, this.f26999b.P.e());
            b(this.f27006i, I.f26631f.f27006i, -this.f26999b.R.e());
            return;
        }
        g gVar = this.f27002e;
        boolean z7 = gVar.f26954j;
        if (z7) {
            v.e eVar2 = this.f26999b;
            if (eVar2.f26621a) {
                v.d[] dVarArr = eVar2.W;
                v.d dVar = dVarArr[2];
                v.d dVar2 = dVar.f26606f;
                if (dVar2 != null && dVarArr[3].f26606f != null) {
                    if (eVar2.i0()) {
                        this.f27005h.f26950f = this.f26999b.W[2].e();
                        this.f27006i.f26950f = -this.f26999b.W[3].e();
                    } else {
                        f h8 = h(this.f26999b.W[2]);
                        if (h8 != null) {
                            b(this.f27005h, h8, this.f26999b.W[2].e());
                        }
                        f h9 = h(this.f26999b.W[3]);
                        if (h9 != null) {
                            b(this.f27006i, h9, -this.f26999b.W[3].e());
                        }
                        this.f27005h.f26946b = true;
                        this.f27006i.f26946b = true;
                    }
                    if (this.f26999b.X()) {
                        b(this.f26980k, this.f27005h, this.f26999b.n());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h10 = h(dVar);
                    if (h10 != null) {
                        b(this.f27005h, h10, this.f26999b.W[2].e());
                        b(this.f27006i, this.f27005h, this.f27002e.f26951g);
                        if (this.f26999b.X()) {
                            b(this.f26980k, this.f27005h, this.f26999b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                v.d dVar3 = dVarArr[3];
                if (dVar3.f26606f != null) {
                    f h11 = h(dVar3);
                    if (h11 != null) {
                        b(this.f27006i, h11, -this.f26999b.W[3].e());
                        b(this.f27005h, this.f27006i, -this.f27002e.f26951g);
                    }
                    if (this.f26999b.X()) {
                        b(this.f26980k, this.f27005h, this.f26999b.n());
                        return;
                    }
                    return;
                }
                v.d dVar4 = dVarArr[4];
                if (dVar4.f26606f != null) {
                    f h12 = h(dVar4);
                    if (h12 != null) {
                        b(this.f26980k, h12, 0);
                        b(this.f27005h, this.f26980k, -this.f26999b.n());
                        b(this.f27006i, this.f27005h, this.f27002e.f26951g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof v.h) || eVar2.I() == null || this.f26999b.m(d.b.CENTER).f26606f != null) {
                    return;
                }
                b(this.f27005h, this.f26999b.I().f26631f.f27005h, this.f26999b.W());
                b(this.f27006i, this.f27005h, this.f27002e.f26951g);
                if (this.f26999b.X()) {
                    b(this.f26980k, this.f27005h, this.f26999b.n());
                    return;
                }
                return;
            }
        }
        if (z7 || this.f27001d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            v.e eVar3 = this.f26999b;
            int i7 = eVar3.f26667x;
            if (i7 == 2) {
                v.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f26631f.f27002e;
                    this.f27002e.f26956l.add(gVar2);
                    gVar2.f26955k.add(this.f27002e);
                    g gVar3 = this.f27002e;
                    gVar3.f26946b = true;
                    gVar3.f26955k.add(this.f27005h);
                    this.f27002e.f26955k.add(this.f27006i);
                }
            } else if (i7 == 3 && !eVar3.i0()) {
                v.e eVar4 = this.f26999b;
                if (eVar4.f26665w != 3) {
                    g gVar4 = eVar4.f26629e.f27002e;
                    this.f27002e.f26956l.add(gVar4);
                    gVar4.f26955k.add(this.f27002e);
                    g gVar5 = this.f27002e;
                    gVar5.f26946b = true;
                    gVar5.f26955k.add(this.f27005h);
                    this.f27002e.f26955k.add(this.f27006i);
                }
            }
        }
        v.e eVar5 = this.f26999b;
        v.d[] dVarArr2 = eVar5.W;
        v.d dVar5 = dVarArr2[2];
        v.d dVar6 = dVar5.f26606f;
        if (dVar6 != null && dVarArr2[3].f26606f != null) {
            if (eVar5.i0()) {
                this.f27005h.f26950f = this.f26999b.W[2].e();
                this.f27006i.f26950f = -this.f26999b.W[3].e();
            } else {
                f h13 = h(this.f26999b.W[2]);
                f h14 = h(this.f26999b.W[3]);
                if (h13 != null) {
                    h13.b(this);
                }
                if (h14 != null) {
                    h14.b(this);
                }
                this.f27007j = p.b.CENTER;
            }
            if (this.f26999b.X()) {
                c(this.f26980k, this.f27005h, 1, this.f26981l);
            }
        } else if (dVar6 != null) {
            f h15 = h(dVar5);
            if (h15 != null) {
                b(this.f27005h, h15, this.f26999b.W[2].e());
                c(this.f27006i, this.f27005h, 1, this.f27002e);
                if (this.f26999b.X()) {
                    c(this.f26980k, this.f27005h, 1, this.f26981l);
                }
                e.b bVar2 = this.f27001d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f26999b.t() > 0.0f) {
                    l lVar = this.f26999b.f26629e;
                    if (lVar.f27001d == bVar3) {
                        lVar.f27002e.f26955k.add(this.f27002e);
                        this.f27002e.f26956l.add(this.f26999b.f26629e.f27002e);
                        this.f27002e.f26945a = this;
                    }
                }
            }
        } else {
            v.d dVar7 = dVarArr2[3];
            if (dVar7.f26606f != null) {
                f h16 = h(dVar7);
                if (h16 != null) {
                    b(this.f27006i, h16, -this.f26999b.W[3].e());
                    c(this.f27005h, this.f27006i, -1, this.f27002e);
                    if (this.f26999b.X()) {
                        c(this.f26980k, this.f27005h, 1, this.f26981l);
                    }
                }
            } else {
                v.d dVar8 = dVarArr2[4];
                if (dVar8.f26606f != null) {
                    f h17 = h(dVar8);
                    if (h17 != null) {
                        b(this.f26980k, h17, 0);
                        c(this.f27005h, this.f26980k, -1, this.f26981l);
                        c(this.f27006i, this.f27005h, 1, this.f27002e);
                    }
                } else if (!(eVar5 instanceof v.h) && eVar5.I() != null) {
                    b(this.f27005h, this.f26999b.I().f26631f.f27005h, this.f26999b.W());
                    c(this.f27006i, this.f27005h, 1, this.f27002e);
                    if (this.f26999b.X()) {
                        c(this.f26980k, this.f27005h, 1, this.f26981l);
                    }
                    e.b bVar4 = this.f27001d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f26999b.t() > 0.0f) {
                        l lVar2 = this.f26999b.f26629e;
                        if (lVar2.f27001d == bVar5) {
                            lVar2.f27002e.f26955k.add(this.f27002e);
                            this.f27002e.f26956l.add(this.f26999b.f26629e.f27002e);
                            this.f27002e.f26945a = this;
                        }
                    }
                }
            }
        }
        if (this.f27002e.f26956l.size() == 0) {
            this.f27002e.f26947c = true;
        }
    }

    @Override // w.p
    public void e() {
        f fVar = this.f27005h;
        if (fVar.f26954j) {
            this.f26999b.j1(fVar.f26951g);
        }
    }

    @Override // w.p
    void f() {
        this.f27000c = null;
        this.f27005h.c();
        this.f27006i.c();
        this.f26980k.c();
        this.f27002e.c();
        this.f27004g = false;
    }

    @Override // w.p
    boolean m() {
        return this.f27001d != e.b.MATCH_CONSTRAINT || this.f26999b.f26667x == 0;
    }

    void q() {
        this.f27004g = false;
        this.f27005h.c();
        this.f27005h.f26954j = false;
        this.f27006i.c();
        this.f27006i.f26954j = false;
        this.f26980k.c();
        this.f26980k.f26954j = false;
        this.f27002e.f26954j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f26999b.r();
    }
}
