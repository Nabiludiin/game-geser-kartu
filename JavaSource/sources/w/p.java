package w;

import v.d;
import v.e;

/* compiled from: MyApplication */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f26998a;

    /* renamed from: b, reason: collision with root package name */
    v.e f26999b;

    /* renamed from: c, reason: collision with root package name */
    m f27000c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f27001d;

    /* renamed from: e, reason: collision with root package name */
    g f27002e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f27003f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f27004g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f27005h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f27006i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f27007j = b.NONE;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27008a;

        static {
            int[] iArr = new int[d.b.values().length];
            f27008a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27008a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27008a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27008a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27008a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: MyApplication */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(v.e eVar) {
        this.f26999b = eVar;
    }

    private void l(int i7, int i8) {
        int i9 = this.f26998a;
        if (i9 == 0) {
            this.f27002e.d(g(i8, i7));
            return;
        }
        if (i9 == 1) {
            this.f27002e.d(Math.min(g(this.f27002e.f26966m, i7), i8));
            return;
        }
        if (i9 == 2) {
            v.e I = this.f26999b.I();
            if (I != null) {
                if ((i7 == 0 ? I.f26629e : I.f26631f).f27002e.f26954j) {
                    v.e eVar = this.f26999b;
                    this.f27002e.d(g((int) ((r9.f26951g * (i7 == 0 ? eVar.B : eVar.E)) + 0.5f), i7));
                    return;
                }
                return;
            }
            return;
        }
        if (i9 != 3) {
            return;
        }
        v.e eVar2 = this.f26999b;
        p pVar = eVar2.f26629e;
        e.b bVar = pVar.f27001d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f26998a == 3) {
            n nVar = eVar2.f26631f;
            if (nVar.f27001d == bVar2 && nVar.f26998a == 3) {
                return;
            }
        }
        if (i7 == 0) {
            pVar = eVar2.f26631f;
        }
        if (pVar.f27002e.f26954j) {
            float t7 = eVar2.t();
            this.f27002e.d(i7 == 1 ? (int) ((pVar.f27002e.f26951g / t7) + 0.5f) : (int) ((t7 * pVar.f27002e.f26951g) + 0.5f));
        }
    }

    @Override // w.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i7) {
        fVar.f26956l.add(fVar2);
        fVar.f26950f = i7;
        fVar2.f26955k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i7, g gVar) {
        fVar.f26956l.add(fVar2);
        fVar.f26956l.add(this.f27002e);
        fVar.f26952h = i7;
        fVar.f26953i = gVar;
        fVar2.f26955k.add(fVar);
        gVar.f26955k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i7, int i8) {
        if (i8 == 0) {
            v.e eVar = this.f26999b;
            int i9 = eVar.A;
            int max = Math.max(eVar.f26671z, i7);
            if (i9 > 0) {
                max = Math.min(i9, i7);
            }
            if (max != i7) {
                return max;
            }
        } else {
            v.e eVar2 = this.f26999b;
            int i10 = eVar2.D;
            int max2 = Math.max(eVar2.C, i7);
            if (i10 > 0) {
                max2 = Math.min(i10, i7);
            }
            if (max2 != i7) {
                return max2;
            }
        }
        return i7;
    }

    protected final f h(v.d dVar) {
        v.d dVar2 = dVar.f26606f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f26604d;
        int i7 = a.f27008a[dVar2.f26605e.ordinal()];
        if (i7 == 1) {
            return eVar.f26629e.f27005h;
        }
        if (i7 == 2) {
            return eVar.f26629e.f27006i;
        }
        if (i7 == 3) {
            return eVar.f26631f.f27005h;
        }
        if (i7 == 4) {
            return eVar.f26631f.f26980k;
        }
        if (i7 != 5) {
            return null;
        }
        return eVar.f26631f.f27006i;
    }

    protected final f i(v.d dVar, int i7) {
        v.d dVar2 = dVar.f26606f;
        if (dVar2 == null) {
            return null;
        }
        v.e eVar = dVar2.f26604d;
        p pVar = i7 == 0 ? eVar.f26629e : eVar.f26631f;
        int i8 = a.f27008a[dVar2.f26605e.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f27006i;
        }
        return pVar.f27005h;
    }

    public long j() {
        if (this.f27002e.f26954j) {
            return r0.f26951g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f27004g;
    }

    abstract boolean m();

    protected void n(d dVar, v.d dVar2, v.d dVar3, int i7) {
        f h8 = h(dVar2);
        f h9 = h(dVar3);
        if (h8.f26954j && h9.f26954j) {
            int e8 = h8.f26951g + dVar2.e();
            int e9 = h9.f26951g - dVar3.e();
            int i8 = e9 - e8;
            if (!this.f27002e.f26954j && this.f27001d == e.b.MATCH_CONSTRAINT) {
                l(i7, i8);
            }
            g gVar = this.f27002e;
            if (gVar.f26954j) {
                if (gVar.f26951g == i8) {
                    this.f27005h.d(e8);
                    this.f27006i.d(e9);
                    return;
                }
                v.e eVar = this.f26999b;
                float w7 = i7 == 0 ? eVar.w() : eVar.P();
                if (h8 == h9) {
                    e8 = h8.f26951g;
                    e9 = h9.f26951g;
                    w7 = 0.5f;
                }
                this.f27005h.d((int) (e8 + 0.5f + (((e9 - e8) - this.f27002e.f26951g) * w7)));
                this.f27006i.d(this.f27005h.f26951g + this.f27002e.f26951g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
