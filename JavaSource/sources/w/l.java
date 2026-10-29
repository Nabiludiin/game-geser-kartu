package w;

import v.d;
import v.e;
import w.f;
import w.p;

/* compiled from: MyApplication */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f26970k = new int[2];

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26971a;

        static {
            int[] iArr = new int[p.b.values().length];
            f26971a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26971a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26971a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(v.e eVar) {
        super(eVar);
        this.f27005h.f26949e = f.a.LEFT;
        this.f27006i.f26949e = f.a.RIGHT;
        this.f27003f = 0;
    }

    private void q(int[] iArr, int i7, int i8, int i9, int i10, float f8, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f8) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f8) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f8) + 0.5f);
        int i15 = (int) ((i12 / f8) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a5, code lost:
    
        if (r7 != 1) goto L131;
     */
    @Override // w.p, w.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(w.d r14) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    @Override // w.p
    void d() {
        v.e I;
        v.e I2;
        v.e eVar = this.f26999b;
        if (eVar.f26621a) {
            this.f27002e.d(eVar.U());
        }
        if (this.f27002e.f26954j) {
            e.b bVar = this.f27001d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (I = this.f26999b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar2)) {
                b(this.f27005h, I.f26629e.f27005h, this.f26999b.O.e());
                b(this.f27006i, I.f26629e.f27006i, -this.f26999b.Q.e());
                return;
            }
        } else {
            e.b y7 = this.f26999b.y();
            this.f27001d = y7;
            if (y7 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (y7 == bVar3 && (I2 = this.f26999b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar3)) {
                    int U = (I2.U() - this.f26999b.O.e()) - this.f26999b.Q.e();
                    b(this.f27005h, I2.f26629e.f27005h, this.f26999b.O.e());
                    b(this.f27006i, I2.f26629e.f27006i, -this.f26999b.Q.e());
                    this.f27002e.d(U);
                    return;
                }
                if (this.f27001d == e.b.FIXED) {
                    this.f27002e.d(this.f26999b.U());
                }
            }
        }
        g gVar = this.f27002e;
        if (gVar.f26954j) {
            v.e eVar2 = this.f26999b;
            if (eVar2.f26621a) {
                v.d[] dVarArr = eVar2.W;
                v.d dVar = dVarArr[0];
                v.d dVar2 = dVar.f26606f;
                if (dVar2 != null && dVarArr[1].f26606f != null) {
                    if (eVar2.g0()) {
                        this.f27005h.f26950f = this.f26999b.W[0].e();
                        this.f27006i.f26950f = -this.f26999b.W[1].e();
                        return;
                    }
                    f h8 = h(this.f26999b.W[0]);
                    if (h8 != null) {
                        b(this.f27005h, h8, this.f26999b.W[0].e());
                    }
                    f h9 = h(this.f26999b.W[1]);
                    if (h9 != null) {
                        b(this.f27006i, h9, -this.f26999b.W[1].e());
                    }
                    this.f27005h.f26946b = true;
                    this.f27006i.f26946b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h10 = h(dVar);
                    if (h10 != null) {
                        b(this.f27005h, h10, this.f26999b.W[0].e());
                        b(this.f27006i, this.f27005h, this.f27002e.f26951g);
                        return;
                    }
                    return;
                }
                v.d dVar3 = dVarArr[1];
                if (dVar3.f26606f != null) {
                    f h11 = h(dVar3);
                    if (h11 != null) {
                        b(this.f27006i, h11, -this.f26999b.W[1].e());
                        b(this.f27005h, this.f27006i, -this.f27002e.f26951g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof v.h) || eVar2.I() == null || this.f26999b.m(d.b.CENTER).f26606f != null) {
                    return;
                }
                b(this.f27005h, this.f26999b.I().f26629e.f27005h, this.f26999b.V());
                b(this.f27006i, this.f27005h, this.f27002e.f26951g);
                return;
            }
        }
        if (this.f27001d == e.b.MATCH_CONSTRAINT) {
            v.e eVar3 = this.f26999b;
            int i7 = eVar3.f26665w;
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
            } else if (i7 == 3) {
                if (eVar3.f26667x == 3) {
                    this.f27005h.f26945a = this;
                    this.f27006i.f26945a = this;
                    n nVar = eVar3.f26631f;
                    nVar.f27005h.f26945a = this;
                    nVar.f27006i.f26945a = this;
                    gVar.f26945a = this;
                    if (eVar3.i0()) {
                        this.f27002e.f26956l.add(this.f26999b.f26631f.f27002e);
                        this.f26999b.f26631f.f27002e.f26955k.add(this.f27002e);
                        n nVar2 = this.f26999b.f26631f;
                        nVar2.f27002e.f26945a = this;
                        this.f27002e.f26956l.add(nVar2.f27005h);
                        this.f27002e.f26956l.add(this.f26999b.f26631f.f27006i);
                        this.f26999b.f26631f.f27005h.f26955k.add(this.f27002e);
                        this.f26999b.f26631f.f27006i.f26955k.add(this.f27002e);
                    } else if (this.f26999b.g0()) {
                        this.f26999b.f26631f.f27002e.f26956l.add(this.f27002e);
                        this.f27002e.f26955k.add(this.f26999b.f26631f.f27002e);
                    } else {
                        this.f26999b.f26631f.f27002e.f26956l.add(this.f27002e);
                    }
                } else {
                    g gVar4 = eVar3.f26631f.f27002e;
                    gVar.f26956l.add(gVar4);
                    gVar4.f26955k.add(this.f27002e);
                    this.f26999b.f26631f.f27005h.f26955k.add(this.f27002e);
                    this.f26999b.f26631f.f27006i.f26955k.add(this.f27002e);
                    g gVar5 = this.f27002e;
                    gVar5.f26946b = true;
                    gVar5.f26955k.add(this.f27005h);
                    this.f27002e.f26955k.add(this.f27006i);
                    this.f27005h.f26956l.add(this.f27002e);
                    this.f27006i.f26956l.add(this.f27002e);
                }
            }
        }
        v.e eVar4 = this.f26999b;
        v.d[] dVarArr2 = eVar4.W;
        v.d dVar4 = dVarArr2[0];
        v.d dVar5 = dVar4.f26606f;
        if (dVar5 != null && dVarArr2[1].f26606f != null) {
            if (eVar4.g0()) {
                this.f27005h.f26950f = this.f26999b.W[0].e();
                this.f27006i.f26950f = -this.f26999b.W[1].e();
                return;
            }
            f h12 = h(this.f26999b.W[0]);
            f h13 = h(this.f26999b.W[1]);
            if (h12 != null) {
                h12.b(this);
            }
            if (h13 != null) {
                h13.b(this);
            }
            this.f27007j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h14 = h(dVar4);
            if (h14 != null) {
                b(this.f27005h, h14, this.f26999b.W[0].e());
                c(this.f27006i, this.f27005h, 1, this.f27002e);
                return;
            }
            return;
        }
        v.d dVar6 = dVarArr2[1];
        if (dVar6.f26606f != null) {
            f h15 = h(dVar6);
            if (h15 != null) {
                b(this.f27006i, h15, -this.f26999b.W[1].e());
                c(this.f27005h, this.f27006i, -1, this.f27002e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof v.h) || eVar4.I() == null) {
            return;
        }
        b(this.f27005h, this.f26999b.I().f26629e.f27005h, this.f26999b.V());
        c(this.f27006i, this.f27005h, 1, this.f27002e);
    }

    @Override // w.p
    public void e() {
        f fVar = this.f27005h;
        if (fVar.f26954j) {
            this.f26999b.i1(fVar.f26951g);
        }
    }

    @Override // w.p
    void f() {
        this.f27000c = null;
        this.f27005h.c();
        this.f27006i.c();
        this.f27002e.c();
        this.f27004g = false;
    }

    @Override // w.p
    boolean m() {
        return this.f27001d != e.b.MATCH_CONSTRAINT || this.f26999b.f26665w == 0;
    }

    void r() {
        this.f27004g = false;
        this.f27005h.c();
        this.f27005h.f26954j = false;
        this.f27006i.c();
        this.f27006i.f26954j = false;
        this.f27002e.f26954j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f26999b.r();
    }
}
