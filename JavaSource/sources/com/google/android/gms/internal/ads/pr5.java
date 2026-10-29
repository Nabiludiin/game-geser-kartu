package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class pr5 implements a4 {
    private boolean B;

    /* renamed from: a, reason: collision with root package name */
    private final kr5 f14035a;

    /* renamed from: d, reason: collision with root package name */
    private final jm5 f14038d;

    /* renamed from: e, reason: collision with root package name */
    private final em5 f14039e;

    /* renamed from: f, reason: collision with root package name */
    private or5 f14040f;

    /* renamed from: g, reason: collision with root package name */
    private eq5 f14041g;

    /* renamed from: h, reason: collision with root package name */
    private cm5 f14042h;

    /* renamed from: p, reason: collision with root package name */
    private int f14050p;

    /* renamed from: q, reason: collision with root package name */
    private int f14051q;

    /* renamed from: r, reason: collision with root package name */
    private int f14052r;

    /* renamed from: s, reason: collision with root package name */
    private int f14053s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14057w;

    /* renamed from: z, reason: collision with root package name */
    private eq5 f14060z;

    /* renamed from: b, reason: collision with root package name */
    private final lr5 f14036b = new lr5();

    /* renamed from: i, reason: collision with root package name */
    private int f14043i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private long[] f14044j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f14045k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f14048n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f14047m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f14046l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private y3[] f14049o = new y3[1000];

    /* renamed from: c, reason: collision with root package name */
    private final vr5 f14037c = new vr5(mr5.f12395a);

    /* renamed from: t, reason: collision with root package name */
    private long f14054t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f14055u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f14056v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f14059y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14058x = true;
    private boolean A = true;

    protected pr5(ku5 ku5Var, jm5 jm5Var, em5 em5Var) {
        this.f14038d = jm5Var;
        this.f14039e = em5Var;
        this.f14035a = new kr5(ku5Var);
    }

    private final synchronized void g() {
        this.f14053s = 0;
        this.f14035a.b();
    }

    private final synchronized int h(hb5 hb5Var, wj4 wj4Var, boolean z7, boolean z8, lr5 lr5Var) {
        try {
            wj4Var.f18272e = false;
            if (!n()) {
                if (!z8 && !this.f14057w) {
                    eq5 eq5Var = this.f14060z;
                    if (eq5Var == null || (!z7 && eq5Var == this.f14041g)) {
                        return -3;
                    }
                    o(eq5Var, hb5Var);
                    return -5;
                }
                wj4Var.g(4);
                wj4Var.f18273f = Long.MIN_VALUE;
                return -4;
            }
            eq5 eq5Var2 = ((nr5) this.f14037c.a(this.f14051q + this.f14053s)).f12876a;
            if (!z7 && eq5Var2 == this.f14041g) {
                int s7 = s(this.f14053s);
                if (!p(s7)) {
                    wj4Var.f18272e = true;
                    return -3;
                }
                wj4Var.g(this.f14047m[s7]);
                if (this.f14053s == this.f14050p - 1 && (z8 || this.f14057w)) {
                    wj4Var.h(536870912);
                }
                wj4Var.f18273f = this.f14048n[s7];
                lr5Var.f11759a = this.f14046l[s7];
                lr5Var.f11760b = this.f14045k[s7];
                lr5Var.f11761c = this.f14049o[s7];
                return -4;
            }
            o(eq5Var2, hb5Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean i(eq5 eq5Var) {
        try {
            this.f14059y = false;
            if (Objects.equals(eq5Var, this.f14060z)) {
                return false;
            }
            vr5 vr5Var = this.f14037c;
            if (vr5Var.f() || !((nr5) vr5Var.c()).f12876a.equals(eq5Var)) {
                this.f14060z = eq5Var;
            } else {
                this.f14060z = ((nr5) vr5Var.c()).f12876a;
            }
            boolean z7 = this.A;
            eq5 eq5Var2 = this.f14060z;
            this.A = z7 & th.d(eq5Var2.f7775o, eq5Var2.f7771k);
            this.B = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long j(long j7, boolean z7, boolean z8) {
        Throwable th;
        try {
            try {
                int i7 = this.f14050p;
                if (i7 != 0) {
                    long[] jArr = this.f14048n;
                    int i8 = this.f14052r;
                    if (j7 >= jArr[i8]) {
                        if (z8) {
                            try {
                                int i9 = this.f14053s;
                                if (i9 != i7) {
                                    i7 = i9 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int q7 = q(i8, i7, j7, false);
                        if (q7 != -1) {
                            return r(q7);
                        }
                        return -1L;
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long k() {
        int i7 = this.f14050p;
        if (i7 == 0) {
            return -1L;
        }
        return r(i7);
    }

    private final void l() {
        if (this.f14042h != null) {
            this.f14042h = null;
            this.f14041g = null;
        }
    }

    private final synchronized void m(long j7, int i7, long j8, int i8, y3 y3Var) {
        try {
            int i9 = this.f14050p;
            if (i9 > 0) {
                int s7 = s(i9 - 1);
                rx3.a(this.f14045k[s7] + ((long) this.f14046l[s7]) <= j8);
            }
            this.f14057w = (536870912 & i7) != 0;
            this.f14056v = Math.max(this.f14056v, j7);
            int s8 = s(this.f14050p);
            this.f14048n[s8] = j7;
            this.f14045k[s8] = j8;
            this.f14046l[s8] = i8;
            this.f14047m[s8] = i7;
            this.f14049o[s8] = y3Var;
            this.f14044j[s8] = 0;
            vr5 vr5Var = this.f14037c;
            if (vr5Var.f() || !((nr5) vr5Var.c()).f12876a.equals(this.f14060z)) {
                eq5 eq5Var = this.f14060z;
                if (eq5Var == null) {
                    throw null;
                }
                vr5Var.b(this.f14051q + this.f14050p, new nr5(eq5Var, im5.f10091a, null));
            }
            int i10 = this.f14050p + 1;
            this.f14050p = i10;
            int i11 = this.f14043i;
            if (i10 == i11) {
                int i12 = i11 + 1000;
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                long[] jArr3 = new long[i12];
                int[] iArr = new int[i12];
                int[] iArr2 = new int[i12];
                y3[] y3VarArr = new y3[i12];
                int i13 = this.f14052r;
                int i14 = i11 - i13;
                System.arraycopy(this.f14045k, i13, jArr2, 0, i14);
                System.arraycopy(this.f14048n, this.f14052r, jArr3, 0, i14);
                System.arraycopy(this.f14047m, this.f14052r, iArr, 0, i14);
                System.arraycopy(this.f14046l, this.f14052r, iArr2, 0, i14);
                System.arraycopy(this.f14049o, this.f14052r, y3VarArr, 0, i14);
                System.arraycopy(this.f14044j, this.f14052r, jArr, 0, i14);
                int i15 = this.f14052r;
                System.arraycopy(this.f14045k, 0, jArr2, i14, i15);
                System.arraycopy(this.f14048n, 0, jArr3, i14, i15);
                System.arraycopy(this.f14047m, 0, iArr, i14, i15);
                System.arraycopy(this.f14046l, 0, iArr2, i14, i15);
                System.arraycopy(this.f14049o, 0, y3VarArr, i14, i15);
                System.arraycopy(this.f14044j, 0, jArr, i14, i15);
                this.f14045k = jArr2;
                this.f14048n = jArr3;
                this.f14047m = iArr;
                this.f14046l = iArr2;
                this.f14049o = y3VarArr;
                this.f14044j = jArr;
                this.f14052r = 0;
                this.f14043i = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean n() {
        return this.f14053s != this.f14050p;
    }

    private final void o(eq5 eq5Var, hb5 hb5Var) {
        eq5 eq5Var2 = this.f14041g;
        uj5 uj5Var = eq5Var2 == null ? null : eq5Var2.f7779s;
        this.f14041g = eq5Var;
        uj5 uj5Var2 = eq5Var.f7779s;
        jm5 jm5Var = this.f14038d;
        hb5Var.f9416b = eq5Var.b(jm5Var.a(eq5Var));
        hb5Var.f9415a = this.f14042h;
        if (eq5Var2 == null || !Objects.equals(uj5Var, uj5Var2)) {
            cm5 b8 = jm5Var.b(this.f14039e, eq5Var);
            this.f14042h = b8;
            hb5Var.f9415a = b8;
        }
    }

    private final boolean p(int i7) {
        if (this.f14042h == null) {
            return true;
        }
        int i8 = this.f14047m[i7];
        return false;
    }

    private final int q(int i7, int i8, long j7, boolean z7) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = this.f14048n[i7];
            if (j8 > j7) {
                break;
            }
            if (!z7 || (this.f14047m[i7] & 1) != 0) {
                if (j8 == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f14043i) {
                i7 = 0;
            }
        }
        return i9;
    }

    private final long r(int i7) {
        long j7 = this.f14055u;
        long j8 = Long.MIN_VALUE;
        if (i7 != 0) {
            int s7 = s(i7 - 1);
            for (int i8 = 0; i8 < i7; i8++) {
                j8 = Math.max(j8, this.f14048n[s7]);
                if ((this.f14047m[s7] & 1) != 0) {
                    break;
                }
                s7--;
                if (s7 == -1) {
                    s7 = this.f14043i - 1;
                }
            }
        }
        this.f14055u = Math.max(j7, j8);
        this.f14050p -= i7;
        int i9 = this.f14051q + i7;
        this.f14051q = i9;
        int i10 = this.f14052r + i7;
        this.f14052r = i10;
        int i11 = this.f14043i;
        if (i10 >= i11) {
            this.f14052r = i10 - i11;
        }
        int i12 = this.f14053s - i7;
        this.f14053s = i12;
        if (i12 < 0) {
            this.f14053s = 0;
        }
        this.f14037c.d(i9);
        if (this.f14050p != 0) {
            return this.f14045k[this.f14052r];
        }
        int i13 = this.f14052r;
        if (i13 == 0) {
            i13 = this.f14043i;
        }
        return this.f14045k[i13 - 1] + this.f14046l[r12];
    }

    private final int s(int i7) {
        int i8 = this.f14052r + i7;
        int i9 = this.f14043i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    public final int A() {
        return this.f14051q + this.f14053s;
    }

    public final synchronized eq5 B() {
        if (this.f14059y) {
            return null;
        }
        return this.f14060z;
    }

    public final synchronized long C() {
        return this.f14056v;
    }

    public final synchronized boolean D() {
        return this.f14057w;
    }

    public final synchronized boolean E(boolean z7) {
        boolean z8 = true;
        if (n()) {
            if (((nr5) this.f14037c.a(this.f14051q + this.f14053s)).f12876a != this.f14041g) {
                return true;
            }
            return p(s(this.f14053s));
        }
        if (!z7 && !this.f14057w) {
            eq5 eq5Var = this.f14060z;
            if (eq5Var == null) {
                z8 = false;
            } else if (eq5Var == this.f14041g) {
                return false;
            }
        }
        return z8;
    }

    public final int F(hb5 hb5Var, wj4 wj4Var, int i7, boolean z7) {
        boolean z8 = (i7 & 2) != 0;
        lr5 lr5Var = this.f14036b;
        int h8 = h(hb5Var, wj4Var, z8, z7, lr5Var);
        if (h8 != -4) {
            return h8;
        }
        if (!wj4Var.b()) {
            int i8 = i7 & 1;
            if ((i7 & 4) == 0) {
                if (i8 != 0) {
                    this.f14035a.d(wj4Var, lr5Var);
                    return -4;
                }
                this.f14035a.c(wj4Var, lr5Var);
            } else if (i8 != 0) {
                return -4;
            }
            this.f14053s++;
        }
        return -4;
    }

    public final synchronized boolean G(int i7) {
        g();
        int i8 = this.f14051q;
        if (i7 >= i8 && i7 <= this.f14050p + i8) {
            this.f14054t = Long.MIN_VALUE;
            this.f14053s = i7 - i8;
            return true;
        }
        return false;
    }

    public final synchronized boolean H(long j7, boolean z7) {
        Throwable th;
        pr5 pr5Var;
        long j8;
        int i7;
        try {
            try {
                g();
                int i8 = this.f14053s;
                int s7 = s(i8);
                if (n() && j7 >= this.f14048n[s7]) {
                    if (j7 > this.f14056v) {
                        if (z7) {
                            z7 = true;
                        }
                    }
                    if (this.A) {
                        try {
                            int i9 = this.f14050p - i8;
                            int i10 = 0;
                            while (true) {
                                if (i10 < i9) {
                                    if (this.f14048n[s7] >= j7) {
                                        pr5Var = this;
                                        j8 = j7;
                                        i7 = i10;
                                        break;
                                    }
                                    s7++;
                                    if (s7 == this.f14043i) {
                                        s7 = 0;
                                    }
                                    i10++;
                                } else if (z7) {
                                    j8 = j7;
                                    i7 = i9;
                                    pr5Var = this;
                                } else {
                                    pr5Var = this;
                                    j8 = j7;
                                    i7 = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        pr5Var = this;
                        j8 = j7;
                        i7 = pr5Var.q(s7, this.f14050p - i8, j8, true);
                    }
                    if (i7 == -1) {
                        return false;
                    }
                    pr5Var.f14054t = j8;
                    pr5Var.f14053s += i7;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int I(long j7, boolean z7) {
        Throwable th;
        try {
            try {
                int i7 = this.f14053s;
                int s7 = s(i7);
                if (!n() || j7 < this.f14048n[s7]) {
                    return 0;
                }
                if (j7 <= this.f14056v || !z7) {
                    int q7 = q(s7, this.f14050p - i7, j7, true);
                    if (q7 == -1) {
                        return 0;
                    }
                    return q7;
                }
                try {
                    return this.f14050p - i7;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void J(int i7) {
        boolean z7 = false;
        if (i7 >= 0) {
            try {
                if (this.f14053s + i7 <= this.f14050p) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        rx3.a(z7);
        this.f14053s += i7;
    }

    public final void K(long j7, boolean z7, boolean z8) {
        this.f14035a.e(j(j7, false, z8));
    }

    public final void L() {
        this.f14035a.e(k());
    }

    public final void M(or5 or5Var) {
        this.f14040f = or5Var;
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void a(long j7, int i7, int i8, int i9, y3 y3Var) {
        if (this.f14058x) {
            if ((i7 & 1) == 0) {
                return;
            } else {
                this.f14058x = false;
            }
        }
        if (this.A) {
            if (j7 < this.f14054t) {
                return;
            }
            if ((i7 & 1) == 0) {
                if (!this.B) {
                    gv1.c("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f14060z)));
                    this.B = true;
                }
                i7 |= 1;
            }
        }
        m(j7, i7, (this.f14035a.f() - i8) - i9, i8, y3Var);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final int b(y95 y95Var, int i7, boolean z7, int i8) {
        return this.f14035a.g(y95Var, i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void c(eq5 eq5Var) {
        boolean i7 = i(eq5Var);
        or5 or5Var = this.f14040f;
        if (or5Var == null || !i7) {
            return;
        }
        or5Var.m(eq5Var);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void d(y82 y82Var, int i7, int i8) {
        this.f14035a.h(y82Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public /* synthetic */ void e(y82 y82Var, int i7) {
        z3.b(this, y82Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public /* synthetic */ int f(y95 y95Var, int i7, boolean z7) {
        return z3.a(this, y95Var, i7, z7);
    }

    public final void t() {
        u(true);
        l();
    }

    public final void u(boolean z7) {
        this.f14035a.a();
        this.f14050p = 0;
        this.f14051q = 0;
        this.f14052r = 0;
        this.f14053s = 0;
        this.f14058x = true;
        this.f14054t = Long.MIN_VALUE;
        this.f14055u = Long.MIN_VALUE;
        this.f14056v = Long.MIN_VALUE;
        this.f14057w = false;
        this.f14037c.e();
        if (z7) {
            this.f14060z = null;
            this.f14059y = true;
            this.A = true;
        }
    }

    public final void v(long j7) {
        this.f14054t = j7;
    }

    public final int w() {
        return this.f14051q + this.f14050p;
    }

    public final void x() {
        L();
        l();
    }

    public final void y() {
        cm5 cm5Var = this.f14042h;
        if (cm5Var != null) {
            throw cm5Var.a();
        }
    }

    public final int z() {
        return this.f14051q;
    }
}
