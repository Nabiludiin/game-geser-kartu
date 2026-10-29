package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
final class sb5 {

    /* renamed from: c, reason: collision with root package name */
    private final md5 f15536c;

    /* renamed from: d, reason: collision with root package name */
    private final zn1 f15537d;

    /* renamed from: e, reason: collision with root package name */
    private long f15538e;

    /* renamed from: f, reason: collision with root package name */
    private int f15539f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15540g;

    /* renamed from: h, reason: collision with root package name */
    private j95 f15541h;

    /* renamed from: i, reason: collision with root package name */
    private pb5 f15542i;

    /* renamed from: j, reason: collision with root package name */
    private pb5 f15543j;

    /* renamed from: k, reason: collision with root package name */
    private pb5 f15544k;

    /* renamed from: l, reason: collision with root package name */
    private pb5 f15545l;

    /* renamed from: m, reason: collision with root package name */
    private pb5 f15546m;

    /* renamed from: n, reason: collision with root package name */
    private int f15547n;

    /* renamed from: o, reason: collision with root package name */
    private Object f15548o;

    /* renamed from: p, reason: collision with root package name */
    private long f15549p;

    /* renamed from: r, reason: collision with root package name */
    private final ab5 f15551r;

    /* renamed from: a, reason: collision with root package name */
    private final ot f15534a = new ot();

    /* renamed from: b, reason: collision with root package name */
    private final yx f15535b = new yx();

    /* renamed from: q, reason: collision with root package name */
    private List f15550q = new ArrayList();

    public sb5(md5 md5Var, zn1 zn1Var, ab5 ab5Var, j95 j95Var) {
        this.f15536c = md5Var;
        this.f15537d = zn1Var;
        this.f15551r = ab5Var;
        this.f15541h = j95Var;
    }

    private static xp5 a(az azVar, Object obj, long j7, long j8, yx yxVar, ot otVar) {
        azVar.o(obj, otVar);
        azVar.b(otVar.f13477c, yxVar, 0L);
        azVar.e(obj);
        otVar.b();
        azVar.o(obj, otVar);
        int e8 = otVar.e(j7);
        return e8 == -1 ? new xp5(obj, j8, otVar.f(j7)) : new xp5(obj, e8, otVar.d(e8), j8);
    }

    private final void b() {
        int i7 = w04.f17978s;
        final t04 t04Var = new t04();
        for (pb5 pb5Var = this.f15542i; pb5Var != null; pb5Var = pb5Var.p()) {
            t04Var.g(pb5Var.f13800g.f14361a);
        }
        pb5 pb5Var2 = this.f15543j;
        final xp5 xp5Var = pb5Var2 == null ? null : pb5Var2.f13800g.f14361a;
        this.f15537d.j(new Runnable() { // from class: com.google.android.gms.internal.ads.rb5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                sb5.this.L(t04Var, xp5Var);
            }
        });
    }

    private final long c(Object obj) {
        for (int i7 = 0; i7 < this.f15550q.size(); i7++) {
            pb5 pb5Var = (pb5) this.f15550q.get(i7);
            if (pb5Var.f13795b.equals(obj)) {
                return pb5Var.f13800g.f14361a.f18927d;
            }
        }
        return -1L;
    }

    private final int d(az azVar) {
        az azVar2;
        pb5 pb5Var = this.f15542i;
        if (pb5Var == null) {
            return 0;
        }
        int e8 = azVar.e(pb5Var.f13795b);
        while (true) {
            azVar2 = azVar;
            e8 = azVar2.l(e8, this.f15534a, this.f15535b, this.f15539f, this.f15540g);
            while (true) {
                pb5Var.getClass();
                if (pb5Var.p() == null || pb5Var.f13800g.f14368h) {
                    break;
                }
                pb5Var = pb5Var.p();
            }
            pb5 p7 = pb5Var.p();
            if (e8 == -1 || p7 == null || azVar2.e(p7.f13795b) != e8) {
                break;
            }
            pb5Var = p7;
            azVar = azVar2;
        }
        int E = E(pb5Var);
        pb5Var.f13800g = J(azVar2, pb5Var.f13800g);
        return E;
    }

    private final qb5 e(az azVar, pb5 pb5Var, long j7) {
        az azVar2;
        long j8;
        az azVar3;
        ot otVar;
        yx yxVar;
        Object obj;
        long j9;
        long j10;
        long j11;
        qb5 qb5Var = pb5Var.f13800g;
        long a8 = pb5Var.a();
        long j12 = qb5Var.f14365e;
        long j13 = (a8 + j12) - j7;
        if (!qb5Var.f14368h) {
            xp5 xp5Var = qb5Var.f14361a;
            Object obj2 = xp5Var.f18924a;
            ot otVar2 = this.f15534a;
            azVar.o(obj2, otVar2);
            if (!xp5Var.b()) {
                int i7 = xp5Var.f18928e;
                if (i7 != -1) {
                    otVar2.i(i7);
                }
                int d8 = otVar2.d(i7);
                otVar2.k(i7);
                if (d8 != otVar2.g(i7)) {
                    return g(azVar, obj2, i7, d8, j12, xp5Var.f18927d, false);
                }
                k(azVar, obj2, i7);
                return h(azVar, obj2, 0L, j12, xp5Var.f18927d, false);
            }
            int i8 = xp5Var.f18925b;
            if (otVar2.g(i8) == -1) {
                return null;
            }
            int a9 = otVar2.f13481g.a(i8).a(xp5Var.f18926c);
            if (a9 < 0) {
                return g(azVar, obj2, i8, a9, qb5Var.f14363c, xp5Var.f18927d, false);
            }
            long j14 = qb5Var.f14363c;
            if (j14 == -9223372036854775807L) {
                Pair n7 = azVar.n(this.f15535b, otVar2, otVar2.f13477c, -9223372036854775807L, Math.max(0L, j13));
                azVar2 = azVar;
                if (n7 == null) {
                    return null;
                }
                j14 = ((Long) n7.second).longValue();
                j8 = -9223372036854775807L;
            } else {
                azVar2 = azVar;
                j8 = j14;
            }
            k(azVar2, obj2, i8);
            return h(azVar2, obj2, Math.max(0L, j14), j8, xp5Var.f18927d, false);
        }
        xp5 xp5Var2 = qb5Var.f14361a;
        Object obj3 = xp5Var2.f18924a;
        int e8 = azVar.e(obj3);
        int i9 = this.f15539f;
        boolean z7 = this.f15540g;
        yx yxVar2 = this.f15535b;
        ot otVar3 = this.f15534a;
        long j15 = 0;
        int l7 = azVar.l(e8, otVar3, yxVar2, i9, z7);
        if (l7 == -1) {
            return null;
        }
        int i10 = azVar.d(l7, otVar3, true).f13477c;
        Object obj4 = otVar3.f13476b;
        obj4.getClass();
        long j16 = xp5Var2.f18927d;
        if (azVar.b(i10, yxVar2, 0L).f19908m == l7) {
            Pair n8 = azVar.n(yxVar2, otVar3, i10, -9223372036854775807L, Math.max(0L, j13));
            if (n8 == null) {
                return null;
            }
            Object obj5 = n8.first;
            long longValue = ((Long) n8.second).longValue();
            pb5 p7 = pb5Var.p();
            if (p7 == null || !p7.f13795b.equals(obj5)) {
                long c8 = c(obj5);
                if (c8 == -1) {
                    c8 = this.f15538e;
                    this.f15538e = 1 + c8;
                }
                j11 = c8;
            } else {
                j11 = p7.f13800g.f14361a.f18927d;
            }
            azVar3 = azVar;
            yxVar = yxVar2;
            otVar = otVar3;
            j9 = longValue;
            obj = obj5;
            j10 = j11;
            j15 = -9223372036854775807L;
        } else {
            azVar3 = azVar;
            otVar = otVar3;
            yxVar = yxVar2;
            obj = obj4;
            j9 = 0;
            j10 = j16;
        }
        xp5 a10 = a(azVar3, obj, j9, j10, yxVar, otVar);
        long j17 = j9;
        ot otVar4 = otVar;
        if (j15 != -9223372036854775807L && qb5Var.f14363c != -9223372036854775807L) {
            azVar3.o(obj3, otVar4).b();
            int i11 = otVar4.f13481g.f6479c;
        }
        return f(azVar3, a10, j15, j17);
    }

    private final qb5 f(az azVar, xp5 xp5Var, long j7, long j8) {
        Object obj = xp5Var.f18924a;
        azVar.o(obj, this.f15534a);
        return xp5Var.b() ? g(azVar, obj, xp5Var.f18925b, xp5Var.f18926c, j7, xp5Var.f18927d, false) : h(azVar, obj, j8, j7, xp5Var.f18927d, false);
    }

    private final qb5 g(az azVar, Object obj, int i7, int i8, long j7, long j8, boolean z7) {
        xp5 xp5Var = new xp5(obj, i7, i8, j8);
        Object obj2 = xp5Var.f18924a;
        int i9 = xp5Var.f18925b;
        int i10 = xp5Var.f18926c;
        ot otVar = this.f15534a;
        long h8 = azVar.o(obj2, otVar).h(i9, i10);
        if (i8 == otVar.d(i7)) {
            otVar.j();
        }
        otVar.k(i9);
        long j9 = 0;
        if (h8 != -9223372036854775807L && h8 <= 0) {
            j9 = Math.max(0L, (-1) + h8);
        }
        return new qb5(xp5Var, j9, j7, -9223372036854775807L, h8, false, false, false, false, false);
    }

    private final qb5 h(az azVar, Object obj, long j7, long j8, long j9, boolean z7) {
        long j10;
        long j11;
        long j12;
        long j13 = j7;
        ot otVar = this.f15534a;
        azVar.o(obj, otVar);
        int f8 = otVar.f(j13);
        if (f8 == -1) {
            otVar.b();
        } else {
            otVar.k(f8);
        }
        xp5 xp5Var = new xp5(obj, j9, f8);
        boolean l7 = l(xp5Var);
        boolean i7 = i(azVar, xp5Var);
        boolean j14 = j(azVar, xp5Var, l7);
        if (f8 != -1) {
            otVar.k(f8);
        }
        if (f8 != -1) {
            otVar.i(f8);
        }
        if (f8 != -1) {
            otVar.c(f8);
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != -9223372036854775807L) {
            j12 = j10;
            j11 = j12;
        } else {
            j11 = otVar.f13478d;
            j12 = -9223372036854775807L;
        }
        if (j11 != -9223372036854775807L && j13 >= j11) {
            j13 = Math.max(0L, j11 - 1);
        }
        return new qb5(xp5Var, j13, j8, j12, j11, false, false, l7, i7, j14);
    }

    private final boolean i(az azVar, xp5 xp5Var) {
        if (!l(xp5Var)) {
            return false;
        }
        Object obj = xp5Var.f18924a;
        return azVar.b(azVar.o(obj, this.f15534a).f13477c, this.f15535b, 0L).f19909n == azVar.e(obj);
    }

    private final boolean j(az azVar, xp5 xp5Var, boolean z7) {
        int e8 = azVar.e(xp5Var.f18924a);
        ot otVar = this.f15534a;
        int i7 = azVar.d(e8, otVar, false).f13477c;
        yx yxVar = this.f15535b;
        return !azVar.b(i7, yxVar, 0L).f19903h && azVar.l(e8, otVar, yxVar, this.f15539f, this.f15540g) == -1 && z7;
    }

    private final long k(az azVar, Object obj, int i7) {
        ot otVar = this.f15534a;
        azVar.o(obj, otVar);
        otVar.c(i7);
        long j7 = otVar.f13481g.a(i7).f4622i;
        return 0L;
    }

    private static final boolean l(xp5 xp5Var) {
        return !xp5Var.b() && xp5Var.f18928e == -1;
    }

    public final pb5 A() {
        return this.f15544k;
    }

    public final pb5 B() {
        pb5 pb5Var = this.f15544k;
        pb5 pb5Var2 = this.f15543j;
        if (pb5Var == pb5Var2) {
            pb5Var2.getClass();
            this.f15544k = pb5Var2.p();
        }
        pb5Var2.getClass();
        this.f15543j = pb5Var2.p();
        b();
        pb5 pb5Var3 = this.f15543j;
        pb5Var3.getClass();
        return pb5Var3;
    }

    public final pb5 C() {
        pb5 pb5Var = this.f15544k;
        pb5Var.getClass();
        this.f15544k = pb5Var.p();
        b();
        pb5 pb5Var2 = this.f15544k;
        pb5Var2.getClass();
        return pb5Var2;
    }

    public final pb5 D() {
        pb5 pb5Var = this.f15542i;
        if (pb5Var == null) {
            return null;
        }
        if (pb5Var == this.f15543j) {
            this.f15543j = pb5Var.p();
        }
        if (pb5Var == this.f15544k) {
            this.f15544k = pb5Var.p();
        }
        pb5Var.n();
        int i7 = this.f15547n - 1;
        this.f15547n = i7;
        if (i7 == 0) {
            this.f15545l = null;
            pb5 pb5Var2 = this.f15542i;
            this.f15548o = pb5Var2.f13795b;
            this.f15549p = pb5Var2.f13800g.f14361a.f18927d;
        }
        this.f15542i = this.f15542i.p();
        b();
        return this.f15542i;
    }

    public final int E(pb5 pb5Var) {
        pb5Var.getClass();
        int i7 = 0;
        if (pb5Var.equals(this.f15545l)) {
            return 0;
        }
        this.f15545l = pb5Var;
        while (pb5Var.p() != null) {
            pb5Var = pb5Var.p();
            pb5Var.getClass();
            if (pb5Var == this.f15543j) {
                pb5 pb5Var2 = this.f15542i;
                this.f15543j = pb5Var2;
                this.f15544k = pb5Var2;
                i7 = 3;
            }
            if (pb5Var == this.f15544k) {
                this.f15544k = this.f15543j;
                i7 |= 2;
            }
            pb5Var.n();
            this.f15547n--;
        }
        pb5 pb5Var3 = this.f15545l;
        pb5Var3.getClass();
        pb5Var3.o(null);
        b();
        return i7;
    }

    public final void F() {
        pb5 pb5Var = this.f15546m;
        if (pb5Var == null || pb5Var.e()) {
            this.f15546m = null;
            for (int i7 = 0; i7 < this.f15550q.size(); i7++) {
                pb5 pb5Var2 = (pb5) this.f15550q.get(i7);
                if (!pb5Var2.e()) {
                    this.f15546m = pb5Var2;
                    return;
                }
            }
        }
    }

    public final pb5 G(vp5 vp5Var) {
        for (int i7 = 0; i7 < this.f15550q.size(); i7++) {
            pb5 pb5Var = (pb5) this.f15550q.get(i7);
            if (pb5Var.f13794a == vp5Var) {
                return pb5Var;
            }
        }
        return null;
    }

    public final void H() {
        if (this.f15547n == 0) {
            return;
        }
        pb5 pb5Var = this.f15542i;
        pb5Var.getClass();
        this.f15548o = pb5Var.f13795b;
        this.f15549p = pb5Var.f13800g.f14361a.f18927d;
        while (pb5Var != null) {
            pb5Var.n();
            pb5Var = pb5Var.p();
        }
        this.f15542i = null;
        this.f15545l = null;
        this.f15543j = null;
        this.f15544k = null;
        this.f15547n = 0;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int I(com.google.android.gms.internal.ads.az r14, long r15, long r17, long r19) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.pb5 r0 = r13.f15542i
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.qb5 r3 = r0.f13800g
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.qb5 r1 = r13.J(r14, r3)
            r4 = r15
            goto L2a
        L10:
            r4 = r15
            com.google.android.gms.internal.ads.qb5 r6 = r13.e(r14, r1, r4)
            if (r6 == 0) goto L99
            long r7 = r3.f14362b
            long r9 = r6.f14362b
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L99
            com.google.android.gms.internal.ads.xp5 r7 = r3.f14361a
            com.google.android.gms.internal.ads.xp5 r8 = r6.f14361a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L99
            r1 = r6
        L2a:
            long r6 = r3.f14363c
            com.google.android.gms.internal.ads.qb5 r6 = r1.b(r6)
            r0.f13800g = r6
            long r6 = r3.f14365e
            long r8 = r1.f14365e
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L90
            r0.s()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r14 != 0) goto L4c
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L51
        L4c:
            long r10 = r0.a()
            long r8 = r8 + r10
        L51:
            com.google.android.gms.internal.ads.pb5 r14 = r13.f15543j
            r10 = -9223372036854775808
            r1 = 1
            if (r0 != r14) goto L66
            com.google.android.gms.internal.ads.qb5 r14 = r0.f13800g
            boolean r14 = r14.f14367g
            int r14 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r14 == 0) goto L64
            int r14 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r14 < 0) goto L66
        L64:
            r14 = r1
            goto L67
        L66:
            r14 = r2
        L67:
            com.google.android.gms.internal.ads.pb5 r5 = r13.f15544k
            if (r0 != r5) goto L75
            int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r5 == 0) goto L73
            int r5 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r5 < 0) goto L75
        L73:
            r5 = r1
            goto L76
        L75:
            r5 = r2
        L76:
            int r0 = r13.E(r0)
            if (r0 == 0) goto L7d
            return r0
        L7d:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L82
            r6 = r3
        L82:
            if (r14 == 0) goto L8a
            int r14 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r14 != 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            if (r5 == 0) goto L8f
            r14 = r2 | 2
            return r14
        L8f:
            return r2
        L90:
            com.google.android.gms.internal.ads.pb5 r1 = r0.p()
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L99:
            int r14 = r13.E(r1)
            return r14
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sb5.I(com.google.android.gms.internal.ads.az, long, long, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.qb5 J(com.google.android.gms.internal.ads.az r19, com.google.android.gms.internal.ads.qb5 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.xp5 r3 = r2.f14361a
            boolean r13 = l(r3)
            boolean r14 = r0.i(r1, r3)
            boolean r15 = r0.j(r1, r3, r13)
            java.lang.Object r4 = r3.f18924a
            com.google.android.gms.internal.ads.ot r5 = r0.f15534a
            r1.o(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r6 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.f18928e
            if (r1 != r4) goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r5.c(r1)
            r10 = r6
        L33:
            boolean r1 = r3.b()
            if (r1 == 0) goto L47
            int r1 = r3.f18925b
            int r6 = r3.f18926c
            long r6 = r5.h(r1, r6)
        L41:
            r16 = r10
            r9 = r6
            r7 = r16
            goto L51
        L47:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L4e
            r9 = r6
            r7 = r9
            goto L51
        L4e:
            long r6 = r5.f13478d
            goto L41
        L51:
            boolean r1 = r3.b()
            if (r1 == 0) goto L5d
            int r1 = r3.f18925b
            r5.k(r1)
            goto L64
        L5d:
            int r1 = r3.f18928e
            if (r1 == r4) goto L64
            r5.k(r1)
        L64:
            com.google.android.gms.internal.ads.qb5 r1 = new com.google.android.gms.internal.ads.qb5
            r5 = r3
            long r3 = r2.f14362b
            long r11 = r2.f14363c
            r2 = r5
            r5 = r11
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sb5.J(com.google.android.gms.internal.ads.az, com.google.android.gms.internal.ads.qb5):com.google.android.gms.internal.ads.qb5");
    }

    public final xp5 K(az azVar, Object obj, long j7) {
        long c8;
        int e8;
        ot otVar = this.f15534a;
        int i7 = azVar.o(obj, otVar).f13477c;
        Object obj2 = this.f15548o;
        if (obj2 == null || (e8 = azVar.e(obj2)) == -1 || azVar.d(e8, otVar, false).f13477c != i7) {
            pb5 pb5Var = this.f15542i;
            while (true) {
                if (pb5Var == null) {
                    pb5 pb5Var2 = this.f15542i;
                    while (true) {
                        if (pb5Var2 != null) {
                            int e9 = azVar.e(pb5Var2.f13795b);
                            if (e9 != -1 && azVar.d(e9, otVar, false).f13477c == i7) {
                                c8 = pb5Var2.f13800g.f14361a.f18927d;
                                break;
                            }
                            pb5Var2 = pb5Var2.p();
                        } else {
                            c8 = c(obj);
                            if (c8 == -1) {
                                c8 = this.f15538e;
                                this.f15538e = 1 + c8;
                                if (this.f15542i == null) {
                                    this.f15548o = obj;
                                    this.f15549p = c8;
                                }
                            }
                        }
                    }
                } else {
                    if (pb5Var.f13795b.equals(obj)) {
                        c8 = pb5Var.f13800g.f14361a.f18927d;
                        break;
                    }
                    pb5Var = pb5Var.p();
                }
            }
        } else {
            c8 = this.f15549p;
        }
        long j8 = c8;
        azVar.o(obj, otVar);
        int i8 = otVar.f13477c;
        yx yxVar = this.f15535b;
        azVar.b(i8, yxVar, 0L);
        Object obj3 = obj;
        for (int e10 = azVar.e(obj); e10 >= yxVar.f19908m; e10--) {
            azVar.d(e10, otVar, true);
            otVar.b();
            if (otVar.e(otVar.f13478d) != -1) {
                Object obj4 = otVar.f13476b;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return a(azVar, obj3, j7, j8, yxVar, otVar);
    }

    final /* synthetic */ void L(t04 t04Var, xp5 xp5Var) {
        this.f15536c.B(t04Var.j(), xp5Var);
    }

    public final int m(az azVar, int i7) {
        this.f15539f = i7;
        return d(azVar);
    }

    public final int n(az azVar, boolean z7) {
        this.f15540g = z7;
        return d(azVar);
    }

    public final void o(az azVar, j95 j95Var) {
        this.f15541h = j95Var;
        long j7 = j95Var.f10416a;
        v();
    }

    public final boolean p(vp5 vp5Var) {
        pb5 pb5Var = this.f15545l;
        return pb5Var != null && pb5Var.f13794a == vp5Var;
    }

    public final boolean q(vp5 vp5Var) {
        pb5 pb5Var = this.f15546m;
        return pb5Var != null && pb5Var.f13794a == vp5Var;
    }

    public final void r(long j7) {
        pb5 pb5Var = this.f15545l;
        if (pb5Var != null) {
            pb5Var.i(j7);
        }
    }

    public final boolean s() {
        pb5 pb5Var = this.f15545l;
        if (pb5Var != null) {
            return !pb5Var.f13800g.f14370j && pb5Var.d() && this.f15545l.f13800g.f14365e != -9223372036854775807L && this.f15547n < 100;
        }
        return true;
    }

    public final qb5 t(long j7, gc5 gc5Var) {
        pb5 pb5Var = this.f15545l;
        return pb5Var == null ? f(gc5Var.f8793a, gc5Var.f8794b, gc5Var.f8795c, gc5Var.f8811s) : e(gc5Var.f8793a, pb5Var, j7);
    }

    public final pb5 u(qb5 qb5Var) {
        pb5 pb5Var;
        pb5 pb5Var2 = this.f15545l;
        long a8 = pb5Var2 == null ? 1000000000000L : (pb5Var2.a() + pb5Var2.f13800g.f14365e) - qb5Var.f14362b;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f15550q.size()) {
                pb5Var = null;
                break;
            }
            qb5 qb5Var2 = ((pb5) this.f15550q.get(i7)).f13800g;
            long j7 = qb5Var2.f14365e;
            long j8 = qb5Var.f14365e;
            if ((j7 == -9223372036854775807L || j7 == j8) && qb5Var2.f14362b == qb5Var.f14362b && qb5Var2.f14361a.equals(qb5Var.f14361a)) {
                pb5Var = (pb5) this.f15550q.remove(i7);
                break;
            }
            i7++;
        }
        if (pb5Var == null) {
            pb5Var = this.f15551r.a(qb5Var, a8);
        } else {
            pb5Var.f13800g = qb5Var;
            pb5Var.b(a8);
        }
        pb5 pb5Var3 = this.f15545l;
        if (pb5Var3 != null) {
            pb5Var3.o(pb5Var);
        } else {
            this.f15542i = pb5Var;
            this.f15543j = pb5Var;
            this.f15544k = pb5Var;
        }
        this.f15548o = null;
        this.f15545l = pb5Var;
        this.f15547n++;
        b();
        return pb5Var;
    }

    public final void v() {
        if (this.f15550q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.f15550q.size(); i7++) {
            ((pb5) this.f15550q.get(i7)).n();
        }
        this.f15550q = arrayList;
        this.f15546m = null;
        F();
    }

    public final pb5 w() {
        return this.f15545l;
    }

    public final pb5 x() {
        return this.f15546m;
    }

    public final pb5 y() {
        return this.f15542i;
    }

    public final pb5 z() {
        return this.f15543j;
    }
}
