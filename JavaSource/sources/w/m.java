package w;

import java.util.ArrayList;

/* compiled from: MyApplication */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f26972h;

    /* renamed from: c, reason: collision with root package name */
    p f26975c;

    /* renamed from: d, reason: collision with root package name */
    p f26976d;

    /* renamed from: f, reason: collision with root package name */
    int f26978f;

    /* renamed from: g, reason: collision with root package name */
    int f26979g;

    /* renamed from: a, reason: collision with root package name */
    public int f26973a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26974b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f26977e = new ArrayList();

    public m(p pVar, int i7) {
        this.f26975c = null;
        this.f26976d = null;
        int i8 = f26972h;
        this.f26978f = i8;
        f26972h = i8 + 1;
        this.f26975c = pVar;
        this.f26976d = pVar;
        this.f26979g = i7;
    }

    private long c(f fVar, long j7) {
        p pVar = fVar.f26948d;
        if (pVar instanceof k) {
            return j7;
        }
        int size = fVar.f26955k.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) fVar.f26955k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f26948d != pVar) {
                    j8 = Math.min(j8, c(fVar2, fVar2.f26950f + j7));
                }
            }
        }
        if (fVar != pVar.f27006i) {
            return j8;
        }
        long j9 = j7 - pVar.j();
        return Math.min(Math.min(j8, c(pVar.f27005h, j9)), j9 - pVar.f27005h.f26950f);
    }

    private long d(f fVar, long j7) {
        p pVar = fVar.f26948d;
        if (pVar instanceof k) {
            return j7;
        }
        int size = fVar.f26955k.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) fVar.f26955k.get(i7);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f26948d != pVar) {
                    j8 = Math.max(j8, d(fVar2, fVar2.f26950f + j7));
                }
            }
        }
        if (fVar != pVar.f27005h) {
            return j8;
        }
        long j9 = j7 + pVar.j();
        return Math.max(Math.max(j8, d(pVar.f27006i, j9)), j9 - pVar.f27006i.f26950f);
    }

    public void a(p pVar) {
        this.f26977e.add(pVar);
        this.f26976d = pVar;
    }

    public long b(v.f fVar, int i7) {
        long j7;
        int i8;
        p pVar = this.f26975c;
        if (pVar instanceof c) {
            if (((c) pVar).f27003f != i7) {
                return 0L;
            }
        } else if (i7 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i7 == 0 ? fVar.f26629e : fVar.f26631f).f27005h;
        f fVar3 = (i7 == 0 ? fVar.f26629e : fVar.f26631f).f27006i;
        boolean contains = pVar.f27005h.f26956l.contains(fVar2);
        boolean contains2 = this.f26975c.f27006i.f26956l.contains(fVar3);
        long j8 = this.f26975c.j();
        if (contains && contains2) {
            long d8 = d(this.f26975c.f27005h, 0L);
            long c8 = c(this.f26975c.f27006i, 0L);
            long j9 = d8 - j8;
            p pVar2 = this.f26975c;
            int i9 = pVar2.f27006i.f26950f;
            if (j9 >= (-i9)) {
                j9 += i9;
            }
            int i10 = pVar2.f27005h.f26950f;
            long j10 = ((-c8) - j8) - i10;
            if (j10 >= i10) {
                j10 -= i10;
            }
            float o7 = pVar2.f26999b.o(i7);
            float f8 = o7 > 0.0f ? (long) ((j10 / o7) + (j9 / (1.0f - o7))) : 0L;
            long j11 = ((long) ((f8 * o7) + 0.5f)) + j8 + ((long) ((f8 * (1.0f - o7)) + 0.5f));
            j7 = r12.f27005h.f26950f + j11;
            i8 = this.f26975c.f27006i.f26950f;
        } else {
            if (contains) {
                return Math.max(d(this.f26975c.f27005h, r12.f26950f), this.f26975c.f27005h.f26950f + j8);
            }
            if (contains2) {
                return Math.max(-c(this.f26975c.f27006i, r12.f26950f), (-this.f26975c.f27006i.f26950f) + j8);
            }
            j7 = r12.f27005h.f26950f + this.f26975c.j();
            i8 = this.f26975c.f27006i.f26950f;
        }
        return j7 - i8;
    }
}
