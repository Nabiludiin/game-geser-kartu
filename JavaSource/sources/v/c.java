package v;

import java.util.ArrayList;
import v.e;

/* compiled from: MyApplication */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f26579a;

    /* renamed from: b, reason: collision with root package name */
    protected e f26580b;

    /* renamed from: c, reason: collision with root package name */
    protected e f26581c;

    /* renamed from: d, reason: collision with root package name */
    protected e f26582d;

    /* renamed from: e, reason: collision with root package name */
    protected e f26583e;

    /* renamed from: f, reason: collision with root package name */
    protected e f26584f;

    /* renamed from: g, reason: collision with root package name */
    protected e f26585g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f26586h;

    /* renamed from: i, reason: collision with root package name */
    protected int f26587i;

    /* renamed from: j, reason: collision with root package name */
    protected int f26588j;

    /* renamed from: k, reason: collision with root package name */
    protected float f26589k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f26590l;

    /* renamed from: m, reason: collision with root package name */
    int f26591m;

    /* renamed from: n, reason: collision with root package name */
    int f26592n;

    /* renamed from: o, reason: collision with root package name */
    boolean f26593o;

    /* renamed from: p, reason: collision with root package name */
    private int f26594p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26595q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f26596r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f26597s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f26598t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f26599u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26600v;

    public c(e eVar, int i7, boolean z7) {
        this.f26579a = eVar;
        this.f26594p = i7;
        this.f26595q = z7;
    }

    private void b() {
        int i7 = this.f26594p * 2;
        e eVar = this.f26579a;
        this.f26593o = true;
        e eVar2 = eVar;
        boolean z7 = false;
        while (!z7) {
            this.f26587i++;
            e[] eVarArr = eVar.F0;
            int i8 = this.f26594p;
            e eVar3 = null;
            eVarArr[i8] = null;
            eVar.E0[i8] = null;
            if (eVar.T() != 8) {
                this.f26590l++;
                e.b s7 = eVar.s(this.f26594p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s7 != bVar) {
                    this.f26591m += eVar.C(this.f26594p);
                }
                int e8 = this.f26591m + eVar.W[i7].e();
                this.f26591m = e8;
                int i9 = i7 + 1;
                this.f26591m = e8 + eVar.W[i9].e();
                int e9 = this.f26592n + eVar.W[i7].e();
                this.f26592n = e9;
                this.f26592n = e9 + eVar.W[i9].e();
                if (this.f26580b == null) {
                    this.f26580b = eVar;
                }
                this.f26582d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i10 = this.f26594p;
                if (bVarArr[i10] == bVar) {
                    int i11 = eVar.f26669y[i10];
                    if (i11 == 0 || i11 == 3 || i11 == 2) {
                        this.f26588j++;
                        float f8 = eVar.D0[i10];
                        if (f8 > 0.0f) {
                            this.f26589k += f8;
                        }
                        if (c(eVar, i10)) {
                            if (f8 < 0.0f) {
                                this.f26596r = true;
                            } else {
                                this.f26597s = true;
                            }
                            if (this.f26586h == null) {
                                this.f26586h = new ArrayList();
                            }
                            this.f26586h.add(eVar);
                        }
                        if (this.f26584f == null) {
                            this.f26584f = eVar;
                        }
                        e eVar4 = this.f26585g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f26594p] = eVar;
                        }
                        this.f26585g = eVar;
                    }
                    if (this.f26594p == 0) {
                        if (eVar.f26665w != 0) {
                            this.f26593o = false;
                        } else if (eVar.f26671z != 0 || eVar.A != 0) {
                            this.f26593o = false;
                        }
                    } else if (eVar.f26667x != 0) {
                        this.f26593o = false;
                    } else if (eVar.C != 0 || eVar.D != 0) {
                        this.f26593o = false;
                    }
                    if (eVar.f26628d0 != 0.0f) {
                        this.f26593o = false;
                        this.f26599u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f26594p] = eVar;
            }
            d dVar = eVar.W[i7 + 1].f26606f;
            if (dVar != null) {
                e eVar5 = dVar.f26604d;
                d dVar2 = eVar5.W[i7].f26606f;
                if (dVar2 != null && dVar2.f26604d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z7 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f26580b;
        if (eVar6 != null) {
            this.f26591m -= eVar6.W[i7].e();
        }
        e eVar7 = this.f26582d;
        if (eVar7 != null) {
            this.f26591m -= eVar7.W[i7 + 1].e();
        }
        this.f26581c = eVar;
        if (this.f26594p == 0 && this.f26595q) {
            this.f26583e = eVar;
        } else {
            this.f26583e = this.f26579a;
        }
        this.f26598t = this.f26597s && this.f26596r;
    }

    private static boolean c(e eVar, int i7) {
        if (eVar.T() == 8 || eVar.Z[i7] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i8 = eVar.f26669y[i7];
        return i8 == 0 || i8 == 3;
    }

    public void a() {
        if (!this.f26600v) {
            b();
        }
        this.f26600v = true;
    }
}
