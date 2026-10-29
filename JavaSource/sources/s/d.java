package s;

import java.util.Arrays;
import java.util.HashMap;
import s.i;
import v.d;

/* compiled from: MyApplication */
public class d {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f25925r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f25926s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f25927t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f25928u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f25929v = false;

    /* renamed from: w, reason: collision with root package name */
    private static int f25930w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f25931x;

    /* renamed from: y, reason: collision with root package name */
    public static long f25932y;

    /* renamed from: d, reason: collision with root package name */
    private a f25936d;

    /* renamed from: g, reason: collision with root package name */
    s.b[] f25939g;

    /* renamed from: n, reason: collision with root package name */
    final c f25946n;

    /* renamed from: q, reason: collision with root package name */
    private a f25949q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f25933a = false;

    /* renamed from: b, reason: collision with root package name */
    int f25934b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f25935c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f25937e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f25938f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25940h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25941i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f25942j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f25943k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f25944l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f25945m = 32;

    /* renamed from: o, reason: collision with root package name */
    private i[] f25947o = new i[f25930w];

    /* renamed from: p, reason: collision with root package name */
    private int f25948p = 0;

    /* compiled from: MyApplication */
    interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* compiled from: MyApplication */
    class b extends s.b {
        public b(c cVar) {
            this.f25919e = new j(this, cVar);
        }
    }

    public d() {
        this.f25939g = null;
        this.f25939g = new s.b[32];
        C();
        c cVar = new c();
        this.f25946n = cVar;
        this.f25936d = new h(cVar);
        if (f25929v) {
            this.f25949q = new b(cVar);
        } else {
            this.f25949q = new s.b(cVar);
        }
    }

    private final int B(a aVar, boolean z7) {
        for (int i7 = 0; i7 < this.f25943k; i7++) {
            this.f25942j[i7] = false;
        }
        boolean z8 = false;
        int i8 = 0;
        while (!z8) {
            i8++;
            if (i8 < this.f25943k * 2) {
                if (aVar.getKey() != null) {
                    this.f25942j[aVar.getKey().f25965s] = true;
                }
                i b8 = aVar.b(this, this.f25942j);
                if (b8 != null) {
                    boolean[] zArr = this.f25942j;
                    int i9 = b8.f25965s;
                    if (!zArr[i9]) {
                        zArr[i9] = true;
                    }
                }
                if (b8 != null) {
                    float f8 = Float.MAX_VALUE;
                    int i10 = -1;
                    for (int i11 = 0; i11 < this.f25944l; i11++) {
                        s.b bVar = this.f25939g[i11];
                        if (bVar.f25915a.f25972z != i.a.UNRESTRICTED && !bVar.f25920f && bVar.t(b8)) {
                            float f9 = bVar.f25919e.f(b8);
                            if (f9 < 0.0f) {
                                float f10 = (-bVar.f25916b) / f9;
                                if (f10 < f8) {
                                    i10 = i11;
                                    f8 = f10;
                                }
                            }
                        }
                    }
                    if (i10 > -1) {
                        s.b bVar2 = this.f25939g[i10];
                        bVar2.f25915a.f25966t = -1;
                        bVar2.x(b8);
                        i iVar = bVar2.f25915a;
                        iVar.f25966t = i10;
                        iVar.o(this, bVar2);
                    }
                } else {
                    z8 = true;
                }
            }
            return i8;
        }
        return i8;
    }

    private void C() {
        int i7 = 0;
        if (f25929v) {
            while (i7 < this.f25944l) {
                s.b bVar = this.f25939g[i7];
                if (bVar != null) {
                    this.f25946n.f25921a.a(bVar);
                }
                this.f25939g[i7] = null;
                i7++;
            }
            return;
        }
        while (i7 < this.f25944l) {
            s.b bVar2 = this.f25939g[i7];
            if (bVar2 != null) {
                this.f25946n.f25922b.a(bVar2);
            }
            this.f25939g[i7] = null;
            i7++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f25946n.f25923c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.n(aVar, str);
        } else {
            iVar.l();
            iVar.n(aVar, str);
        }
        int i7 = this.f25948p;
        int i8 = f25930w;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            f25930w = i9;
            this.f25947o = (i[]) Arrays.copyOf(this.f25947o, i9);
        }
        i[] iVarArr = this.f25947o;
        int i10 = this.f25948p;
        this.f25948p = i10 + 1;
        iVarArr[i10] = iVar;
        return iVar;
    }

    private final void l(s.b bVar) {
        int i7;
        if (f25927t && bVar.f25920f) {
            bVar.f25915a.m(this, bVar.f25916b);
        } else {
            s.b[] bVarArr = this.f25939g;
            int i8 = this.f25944l;
            bVarArr[i8] = bVar;
            i iVar = bVar.f25915a;
            iVar.f25966t = i8;
            this.f25944l = i8 + 1;
            iVar.o(this, bVar);
        }
        if (f25927t && this.f25933a) {
            int i9 = 0;
            while (i9 < this.f25944l) {
                if (this.f25939g[i9] == null) {
                    System.out.println("WTF");
                }
                s.b bVar2 = this.f25939g[i9];
                if (bVar2 != null && bVar2.f25920f) {
                    bVar2.f25915a.m(this, bVar2.f25916b);
                    if (f25929v) {
                        this.f25946n.f25921a.a(bVar2);
                    } else {
                        this.f25946n.f25922b.a(bVar2);
                    }
                    this.f25939g[i9] = null;
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (true) {
                        i7 = this.f25944l;
                        if (i10 >= i7) {
                            break;
                        }
                        s.b[] bVarArr2 = this.f25939g;
                        int i12 = i10 - 1;
                        s.b bVar3 = bVarArr2[i10];
                        bVarArr2[i12] = bVar3;
                        i iVar2 = bVar3.f25915a;
                        if (iVar2.f25966t == i10) {
                            iVar2.f25966t = i12;
                        }
                        i11 = i10;
                        i10++;
                    }
                    if (i11 < i7) {
                        this.f25939g[i11] = null;
                    }
                    this.f25944l = i7 - 1;
                    i9--;
                }
                i9++;
            }
            this.f25933a = false;
        }
    }

    private void n() {
        for (int i7 = 0; i7 < this.f25944l; i7++) {
            s.b bVar = this.f25939g[i7];
            bVar.f25915a.f25968v = bVar.f25916b;
        }
    }

    public static s.b s(d dVar, i iVar, i iVar2, float f8) {
        return dVar.r().j(iVar, iVar2, f8);
    }

    private int u(a aVar) {
        float f8;
        float f9;
        for (int i7 = 0; i7 < this.f25944l; i7++) {
            s.b bVar = this.f25939g[i7];
            if (bVar.f25915a.f25972z != i.a.UNRESTRICTED) {
                float f10 = 0.0f;
                if (bVar.f25916b < 0.0f) {
                    boolean z7 = false;
                    int i8 = 0;
                    while (!z7) {
                        i8++;
                        float f11 = Float.MAX_VALUE;
                        int i9 = 0;
                        int i10 = -1;
                        int i11 = -1;
                        int i12 = 0;
                        while (true) {
                            if (i9 >= this.f25944l) {
                                break;
                            }
                            s.b bVar2 = this.f25939g[i9];
                            if (bVar2.f25915a.f25972z != i.a.UNRESTRICTED && !bVar2.f25920f && bVar2.f25916b < f10) {
                                if (f25928u) {
                                    int b8 = bVar2.f25919e.b();
                                    int i13 = 0;
                                    while (i13 < b8) {
                                        i e8 = bVar2.f25919e.e(i13);
                                        float f12 = bVar2.f25919e.f(e8);
                                        if (f12 <= f10) {
                                            f9 = f10;
                                        } else {
                                            f9 = f10;
                                            for (int i14 = 0; i14 < 9; i14++) {
                                                float f13 = e8.f25970x[i14] / f12;
                                                if ((f13 < f11 && i14 == i12) || i14 > i12) {
                                                    i12 = i14;
                                                    i11 = e8.f25965s;
                                                    i10 = i9;
                                                    f11 = f13;
                                                }
                                            }
                                        }
                                        i13++;
                                        f10 = f9;
                                    }
                                } else {
                                    f8 = f10;
                                    for (int i15 = 1; i15 < this.f25943k; i15++) {
                                        i iVar = this.f25946n.f25924d[i15];
                                        float f14 = bVar2.f25919e.f(iVar);
                                        if (f14 > f8) {
                                            for (int i16 = 0; i16 < 9; i16++) {
                                                float f15 = iVar.f25970x[i16] / f14;
                                                if ((f15 < f11 && i16 == i12) || i16 > i12) {
                                                    i12 = i16;
                                                    i10 = i9;
                                                    i11 = i15;
                                                    f11 = f15;
                                                }
                                            }
                                        }
                                    }
                                    i9++;
                                    f10 = f8;
                                }
                            }
                            f8 = f10;
                            i9++;
                            f10 = f8;
                        }
                        float f16 = f10;
                        if (i10 != -1) {
                            s.b bVar3 = this.f25939g[i10];
                            bVar3.f25915a.f25966t = -1;
                            bVar3.x(this.f25946n.f25924d[i11]);
                            i iVar2 = bVar3.f25915a;
                            iVar2.f25966t = i10;
                            iVar2.o(this, bVar3);
                        } else {
                            z7 = true;
                        }
                        if (i8 > this.f25943k / 2) {
                            z7 = true;
                        }
                        f10 = f16;
                    }
                    return i8;
                }
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i7 = this.f25937e * 2;
        this.f25937e = i7;
        this.f25939g = (s.b[]) Arrays.copyOf(this.f25939g, i7);
        c cVar = this.f25946n;
        cVar.f25924d = (i[]) Arrays.copyOf(cVar.f25924d, this.f25937e);
        int i8 = this.f25937e;
        this.f25942j = new boolean[i8];
        this.f25938f = i8;
        this.f25945m = i8;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i7 = 0;
        while (true) {
            cVar = this.f25946n;
            i[] iVarArr = cVar.f25924d;
            if (i7 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i7];
            if (iVar != null) {
                iVar.l();
            }
            i7++;
        }
        cVar.f25923c.c(this.f25947o, this.f25948p);
        this.f25948p = 0;
        Arrays.fill(this.f25946n.f25924d, (Object) null);
        HashMap hashMap = this.f25935c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f25934b = 0;
        this.f25936d.clear();
        this.f25943k = 1;
        for (int i8 = 0; i8 < this.f25944l; i8++) {
            s.b bVar = this.f25939g[i8];
            if (bVar != null) {
                bVar.f25917c = false;
            }
        }
        C();
        this.f25944l = 0;
        if (f25929v) {
            this.f25949q = new b(this.f25946n);
        } else {
            this.f25949q = new s.b(this.f25946n);
        }
    }

    public void b(v.e eVar, v.e eVar2, float f8, int i7) {
        d.b bVar = d.b.LEFT;
        i q7 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q8 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q9 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q10 = q(eVar.m(bVar4));
        i q11 = q(eVar2.m(bVar));
        i q12 = q(eVar2.m(bVar2));
        i q13 = q(eVar2.m(bVar3));
        i q14 = q(eVar2.m(bVar4));
        s.b r7 = r();
        double d8 = f8;
        double d9 = i7;
        r7.q(q8, q10, q12, q14, (float) (Math.sin(d8) * d9));
        d(r7);
        s.b r8 = r();
        r8.q(q7, q9, q11, q13, (float) (Math.cos(d8) * d9));
        d(r8);
    }

    public void c(i iVar, i iVar2, int i7, float f8, i iVar3, i iVar4, int i8, int i9) {
        s.b r7 = r();
        r7.h(iVar, iVar2, i7, f8, iVar3, iVar4, i8);
        if (i9 != 8) {
            r7.d(this, i9);
        }
        d(r7);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(s.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f25944l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f25945m
            if (r0 >= r2) goto L13
            int r0 = r5.f25943k
            int r0 = r0 + r1
            int r2 = r5.f25938f
            if (r0 < r2) goto L16
        L13:
            r5.y()
        L16:
            boolean r0 = r6.f25920f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            s.i r0 = r5.p()
            r6.f25915a = r0
            int r3 = r5.f25944l
            r5.l(r6)
            int r4 = r5.f25944l
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            s.d$a r2 = r5.f25949q
            r2.c(r6)
            s.d$a r2 = r5.f25949q
            r5.B(r2, r1)
            int r2 = r0.f25966t
            r3 = -1
            if (r2 != r3) goto L7d
            s.i r2 = r6.f25915a
            if (r2 != r0) goto L5a
            s.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f25920f
            if (r0 != 0) goto L63
            s.i r0 = r6.f25915a
            r0.o(r5, r6)
        L63:
            boolean r0 = s.d.f25929v
            if (r0 == 0) goto L6f
            s.c r0 = r5.f25946n
            s.f r0 = r0.f25921a
            r0.a(r6)
            goto L76
        L6f:
            s.c r0 = r5.f25946n
            s.f r0 = r0.f25922b
            r0.a(r6)
        L76:
            int r0 = r5.f25944l
            int r0 = r0 - r1
            r5.f25944l = r0
            goto L7d
        L7c:
            r1 = r2
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.d(s.b):void");
    }

    public s.b e(i iVar, i iVar2, int i7, int i8) {
        if (f25926s && i8 == 8 && iVar2.f25969w && iVar.f25966t == -1) {
            iVar.m(this, iVar2.f25968v + i7);
            return null;
        }
        s.b r7 = r();
        r7.n(iVar, iVar2, i7);
        if (i8 != 8) {
            r7.d(this, i8);
        }
        d(r7);
        return r7;
    }

    public void f(i iVar, int i7) {
        if (f25926s && iVar.f25966t == -1) {
            float f8 = i7;
            iVar.m(this, f8);
            for (int i8 = 0; i8 < this.f25934b + 1; i8++) {
                i iVar2 = this.f25946n.f25924d[i8];
                if (iVar2 != null && iVar2.D && iVar2.E == iVar.f25965s) {
                    iVar2.m(this, iVar2.F + f8);
                }
            }
            return;
        }
        int i9 = iVar.f25966t;
        if (i9 == -1) {
            s.b r7 = r();
            r7.i(iVar, i7);
            d(r7);
            return;
        }
        s.b bVar = this.f25939g[i9];
        if (bVar.f25920f) {
            bVar.f25916b = i7;
            return;
        }
        if (bVar.f25919e.b() == 0) {
            bVar.f25920f = true;
            bVar.f25916b = i7;
        } else {
            s.b r8 = r();
            r8.m(iVar, i7);
            d(r8);
        }
    }

    public void g(i iVar, i iVar2, int i7, boolean z7) {
        s.b r7 = r();
        i t7 = t();
        t7.f25967u = 0;
        r7.o(iVar, iVar2, t7, i7);
        d(r7);
    }

    public void h(i iVar, i iVar2, int i7, int i8) {
        s.b r7 = r();
        i t7 = t();
        t7.f25967u = 0;
        r7.o(iVar, iVar2, t7, i7);
        if (i8 != 8) {
            m(r7, (int) (r7.f25919e.f(t7) * (-1.0f)), i8);
        }
        d(r7);
    }

    public void i(i iVar, i iVar2, int i7, boolean z7) {
        s.b r7 = r();
        i t7 = t();
        t7.f25967u = 0;
        r7.p(iVar, iVar2, t7, i7);
        d(r7);
    }

    public void j(i iVar, i iVar2, int i7, int i8) {
        s.b r7 = r();
        i t7 = t();
        t7.f25967u = 0;
        r7.p(iVar, iVar2, t7, i7);
        if (i8 != 8) {
            m(r7, (int) (r7.f25919e.f(t7) * (-1.0f)), i8);
        }
        d(r7);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f8, int i7) {
        s.b r7 = r();
        r7.k(iVar, iVar2, iVar3, iVar4, f8);
        if (i7 != 8) {
            r7.d(this, i7);
        }
        d(r7);
    }

    void m(s.b bVar, int i7, int i8) {
        bVar.e(o(i8, null), i7);
    }

    public i o(int i7, String str) {
        if (this.f25943k + 1 >= this.f25938f) {
            y();
        }
        i a8 = a(i.a.ERROR, str);
        int i8 = this.f25934b + 1;
        this.f25934b = i8;
        this.f25943k++;
        a8.f25965s = i8;
        a8.f25967u = i7;
        this.f25946n.f25924d[i8] = a8;
        this.f25936d.a(a8);
        return a8;
    }

    public i p() {
        if (this.f25943k + 1 >= this.f25938f) {
            y();
        }
        i a8 = a(i.a.SLACK, null);
        int i7 = this.f25934b + 1;
        this.f25934b = i7;
        this.f25943k++;
        a8.f25965s = i7;
        this.f25946n.f25924d[i7] = a8;
        return a8;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f25943k + 1 >= this.f25938f) {
            y();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f25946n);
                iVar = dVar.h();
            }
            int i7 = iVar.f25965s;
            if (i7 != -1 && i7 <= this.f25934b && this.f25946n.f25924d[i7] != null) {
                return iVar;
            }
            if (i7 != -1) {
                iVar.l();
            }
            int i8 = this.f25934b + 1;
            this.f25934b = i8;
            this.f25943k++;
            iVar.f25965s = i8;
            iVar.f25972z = i.a.UNRESTRICTED;
            this.f25946n.f25924d[i8] = iVar;
        }
        return iVar;
    }

    public s.b r() {
        s.b bVar;
        if (f25929v) {
            bVar = (s.b) this.f25946n.f25921a.b();
            if (bVar == null) {
                bVar = new b(this.f25946n);
                f25932y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (s.b) this.f25946n.f25922b.b();
            if (bVar == null) {
                bVar = new s.b(this.f25946n);
                f25931x++;
            } else {
                bVar.y();
            }
        }
        i.j();
        return bVar;
    }

    public i t() {
        if (this.f25943k + 1 >= this.f25938f) {
            y();
        }
        i a8 = a(i.a.SLACK, null);
        int i7 = this.f25934b + 1;
        this.f25934b = i7;
        this.f25943k++;
        a8.f25965s = i7;
        this.f25946n.f25924d[i7] = a8;
        return a8;
    }

    public c v() {
        return this.f25946n;
    }

    public int x(Object obj) {
        i h8 = ((v.d) obj).h();
        if (h8 != null) {
            return (int) (h8.f25968v + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f25936d.isEmpty()) {
            n();
            return;
        }
        if (!this.f25940h && !this.f25941i) {
            A(this.f25936d);
            return;
        }
        for (int i7 = 0; i7 < this.f25944l; i7++) {
            if (!this.f25939g[i7].f25920f) {
                A(this.f25936d);
                return;
            }
        }
        n();
    }
}
