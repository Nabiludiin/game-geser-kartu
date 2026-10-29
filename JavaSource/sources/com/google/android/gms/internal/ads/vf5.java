package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* compiled from: MyApplication */
public final class vf5 implements md5 {

    /* renamed from: q, reason: collision with root package name */
    private final pd1 f17596q;

    /* renamed from: r, reason: collision with root package name */
    private final ot f17597r;

    /* renamed from: s, reason: collision with root package name */
    private final yx f17598s;

    /* renamed from: t, reason: collision with root package name */
    private final uf5 f17599t;

    /* renamed from: u, reason: collision with root package name */
    private final SparseArray f17600u;

    /* renamed from: v, reason: collision with root package name */
    private fu1 f17601v;

    /* renamed from: w, reason: collision with root package name */
    private mr f17602w;

    /* renamed from: x, reason: collision with root package name */
    private zn1 f17603x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17604y;

    public vf5(pd1 pd1Var) {
        pd1Var.getClass();
        this.f17596q = pd1Var;
        this.f17601v = new fu1(hi2.B(), pd1Var, tf5.f16173a);
        ot otVar = new ot();
        this.f17597r = otVar;
        this.f17598s = new yx();
        this.f17599t = new uf5(otVar);
        this.f17600u = new SparseArray();
    }

    private final nd5 i0(xp5 xp5Var) {
        this.f17602w.getClass();
        az e8 = xp5Var == null ? null : this.f17599t.e(xp5Var);
        if (xp5Var != null && e8 != null) {
            return f0(e8, e8.o(xp5Var.f18924a, this.f17597r).f13477c, xp5Var);
        }
        int p7 = this.f17602w.p();
        az m7 = this.f17602w.m();
        if (p7 >= m7.a()) {
            m7 = az.f5406a;
        }
        return f0(m7, p7, null);
    }

    private final nd5 j0() {
        return i0(this.f17599t.b());
    }

    private final nd5 k0() {
        return i0(this.f17599t.c());
    }

    private final nd5 l0(int i7, xp5 xp5Var) {
        mr mrVar = this.f17602w;
        mrVar.getClass();
        if (xp5Var != null) {
            return this.f17599t.e(xp5Var) != null ? i0(xp5Var) : f0(az.f5406a, i7, xp5Var);
        }
        az m7 = mrVar.m();
        if (i7 >= m7.a()) {
            m7 = az.f5406a;
        }
        return f0(m7, i7, null);
    }

    private final nd5 m0(xj xjVar) {
        xp5 xp5Var;
        return (!(xjVar instanceof b45) || (xp5Var = ((b45) xjVar).f5575x) == null) ? e0() : i0(xp5Var);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void A(final int i7, final int i8) {
        final nd5 k02 = k0();
        d0(k02, 24, new ap1(k02, i7, i8) { // from class: com.google.android.gms.internal.ads.ke5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void B(List list, xp5 xp5Var) {
        mr mrVar = this.f17602w;
        mrVar.getClass();
        this.f17599t.h(list, xp5Var, mrVar);
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void C() {
        if (this.f17604y) {
            return;
        }
        final nd5 e02 = e0();
        this.f17604y = true;
        d0(e02, -1, new ap1(e02) { // from class: com.google.android.gms.internal.ads.oe5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ou5
    public final void D(final int i7, final long j7, final long j8) {
        final nd5 i02 = i0(this.f17599t.d());
        d0(i02, 1006, new ap1() { // from class: com.google.android.gms.internal.ads.mf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).m(nd5.this, i7, j7, j8);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void E() {
        zn1 zn1Var = this.f17603x;
        zn1Var.getClass();
        zn1Var.j(new Runnable() { // from class: com.google.android.gms.internal.ads.ce5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vf5.this.h0();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void F(final int i7, final long j7, final long j8) {
        final nd5 k02 = k0();
        d0(k02, 1011, new ap1(k02, i7, j7, j8) { // from class: com.google.android.gms.internal.ads.rf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void G(final wj5 wj5Var) {
        final nd5 k02 = k0();
        d0(k02, 1031, new ap1(k02, wj5Var) { // from class: com.google.android.gms.internal.ads.vd5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void H(final float f8) {
        final nd5 k02 = k0();
        d0(k02, 22, new ap1(k02, f8) { // from class: com.google.android.gms.internal.ads.xd5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void I(final int i7) {
        final nd5 e02 = e0();
        d0(e02, 4, new ap1() { // from class: com.google.android.gms.internal.ads.xe5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).a(nd5.this, i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void J(final String str, final long j7, final long j8) {
        final nd5 k02 = k0();
        d0(k02, 1016, new ap1(k02, str, j8, j7) { // from class: com.google.android.gms.internal.ads.zd5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void K(final eq5 eq5Var, final iw4 iw4Var) {
        final nd5 k02 = k0();
        d0(k02, 1017, new ap1() { // from class: com.google.android.gms.internal.ads.ae5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).b(nd5.this, eq5Var, iw4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void L(final xj xjVar) {
        final nd5 m02 = m0(xjVar);
        d0(m02, 10, new ap1() { // from class: com.google.android.gms.internal.ads.cf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).f(nd5.this, xjVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void M(final Exception exc) {
        final nd5 k02 = k0();
        d0(k02, 1030, new ap1(k02, exc) { // from class: com.google.android.gms.internal.ads.ie5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void N(final long j7, final int i7) {
        final nd5 j02 = j0();
        d0(j02, 1021, new ap1(j02, j7, i7) { // from class: com.google.android.gms.internal.ads.he5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void O(final hv4 hv4Var) {
        final nd5 j02 = j0();
        d0(j02, 1013, new ap1(j02, hv4Var) { // from class: com.google.android.gms.internal.ads.sd5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void P(final int i7) {
        final nd5 e02 = e0();
        d0(e02, 6, new ap1(e02, i7) { // from class: com.google.android.gms.internal.ads.af5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void Q(int i7, xp5 xp5Var, final tp5 tp5Var) {
        final nd5 l02 = l0(i7, xp5Var);
        d0(l02, 1004, new ap1() { // from class: com.google.android.gms.internal.ads.qe5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).h(nd5.this, tp5Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void R(final boolean z7) {
        final nd5 e02 = e0();
        d0(e02, 3, new ap1(e02, z7) { // from class: com.google.android.gms.internal.ads.ue5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void S(final hv4 hv4Var) {
        final nd5 k02 = k0();
        d0(k02, 1007, new ap1(k02, hv4Var) { // from class: com.google.android.gms.internal.ads.lf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void T(final String str, final long j7, final long j8) {
        final nd5 k02 = k0();
        d0(k02, 1008, new ap1(k02, str, j8, j7) { // from class: com.google.android.gms.internal.ads.of5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void U(final String str) {
        final nd5 k02 = k0();
        d0(k02, 1012, new ap1(k02, str) { // from class: com.google.android.gms.internal.ads.sf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void V(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var) {
        final nd5 l02 = l0(i7, xp5Var);
        d0(l02, 1002, new ap1(l02, op5Var, tp5Var) { // from class: com.google.android.gms.internal.ads.ne5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void W(final hv4 hv4Var) {
        final nd5 j02 = j0();
        d0(j02, 1020, new ap1() { // from class: com.google.android.gms.internal.ads.ee5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).g(nd5.this, hv4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void X(final j9 j9Var, final int i7) {
        final nd5 e02 = e0();
        d0(e02, 1, new ap1(e02, j9Var, i7) { // from class: com.google.android.gms.internal.ads.se5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void Y(final jc jcVar) {
        final nd5 e02 = e0();
        d0(e02, 14, new ap1(e02, jcVar) { // from class: com.google.android.gms.internal.ads.hf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void Z(final long j7) {
        final nd5 k02 = k0();
        d0(k02, 1010, new ap1(k02, j7) { // from class: com.google.android.gms.internal.ads.qf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void a(final Exception exc) {
        final nd5 k02 = k0();
        d0(k02, 1029, new ap1(k02, exc) { // from class: com.google.android.gms.internal.ads.ud5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void a0(final int i7) {
        final nd5 e02 = e0();
        d0(e02, 1034, new ap1(e02, i7) { // from class: com.google.android.gms.internal.ads.je5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void b(final te0 te0Var) {
        final nd5 k02 = k0();
        d0(k02, 25, new ap1() { // from class: com.google.android.gms.internal.ads.kf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                nd5 nd5Var = nd5.this;
                te0 te0Var2 = te0Var;
                ((qd5) obj).c(nd5Var, te0Var2);
                int i7 = te0Var2.f16149a;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void b0(final wj5 wj5Var) {
        final nd5 k02 = k0();
        d0(k02, 1032, new ap1(k02, wj5Var) { // from class: com.google.android.gms.internal.ads.wd5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void c(final boolean z7) {
        final nd5 e02 = e0();
        d0(e02, 7, new ap1(e02, z7) { // from class: com.google.android.gms.internal.ads.bf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void c0(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var) {
        final nd5 l02 = l0(i7, xp5Var);
        d0(l02, 1001, new ap1(l02, op5Var, tp5Var) { // from class: com.google.android.gms.internal.ads.me5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void d(final String str) {
        final nd5 k02 = k0();
        d0(k02, 1019, new ap1(k02, str) { // from class: com.google.android.gms.internal.ads.de5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    protected final void d0(nd5 nd5Var, int i7, ap1 ap1Var) {
        this.f17600u.put(i7, nd5Var);
        fu1 fu1Var = this.f17601v;
        fu1Var.d(i7, ap1Var);
        fu1Var.e();
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void e(final boolean z7, final int i7) {
        final nd5 e02 = e0();
        d0(e02, 5, new ap1(e02, z7, i7) { // from class: com.google.android.gms.internal.ads.ye5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    protected final nd5 e0() {
        return i0(this.f17599t.a());
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void f(qd5 qd5Var) {
        this.f17601v.b(qd5Var);
    }

    protected final nd5 f0(az azVar, int i7, xp5 xp5Var) {
        xp5 xp5Var2 = true == azVar.g() ? null : xp5Var;
        long b8 = this.f17596q.b();
        boolean z7 = azVar.equals(this.f17602w.m()) && i7 == this.f17602w.p();
        long j7 = 0;
        if (xp5Var2 == null || !xp5Var2.b()) {
            if (z7) {
                j7 = this.f17602w.C();
            } else if (!azVar.g()) {
                long j8 = azVar.b(i7, this.f17598s, 0L).f19906k;
                j7 = hi2.M(0L);
            }
        } else if (z7 && this.f17602w.E() == xp5Var2.f18925b && this.f17602w.x() == xp5Var2.f18926c) {
            j7 = this.f17602w.t();
        }
        return new nd5(b8, azVar, i7, xp5Var2, j7, this.f17602w.m(), this.f17602w.p(), this.f17599t.a(), this.f17602w.t(), this.f17602w.G());
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void g(final int i7, final long j7) {
        final nd5 j02 = j0();
        d0(j02, 1018, new ap1() { // from class: com.google.android.gms.internal.ads.be5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).j(nd5.this, i7, j7);
            }
        });
    }

    final /* synthetic */ void g0(mr mrVar, qd5 qd5Var, km5 km5Var) {
        qd5Var.o(mrVar, new od5(km5Var, this.f17600u));
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void h(final hv4 hv4Var) {
        final nd5 k02 = k0();
        d0(k02, 1015, new ap1(k02, hv4Var) { // from class: com.google.android.gms.internal.ads.yd5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    final /* synthetic */ void h0() {
        final nd5 e02 = e0();
        d0(e02, 1028, new ap1(e02) { // from class: com.google.android.gms.internal.ads.nf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
        this.f17601v.f();
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void i(final Exception exc) {
        final nd5 k02 = k0();
        d0(k02, 1014, new ap1(k02, exc) { // from class: com.google.android.gms.internal.ads.td5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void j(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var, final IOException iOException, final boolean z7) {
        final nd5 l02 = l0(i7, xp5Var);
        d0(l02, 1003, new ap1() { // from class: com.google.android.gms.internal.ads.pe5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).q(nd5.this, op5Var, tp5Var, iOException, z7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void k(final yk ykVar) {
        final nd5 e02 = e0();
        d0(e02, 12, new ap1(e02, ykVar) { // from class: com.google.android.gms.internal.ads.ff5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void l(final boolean z7, final int i7) {
        final nd5 e02 = e0();
        d0(e02, -1, new ap1(e02, z7, i7) { // from class: com.google.android.gms.internal.ads.we5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void m(final boolean z7) {
        final nd5 k02 = k0();
        d0(k02, 23, new ap1(k02, z7) { // from class: com.google.android.gms.internal.ads.if5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void o(final eq5 eq5Var, final iw4 iw4Var) {
        final nd5 k02 = k0();
        d0(k02, 1009, new ap1() { // from class: com.google.android.gms.internal.ads.pf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).e(nd5.this, eq5Var, iw4Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void p(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var, final int i8) {
        final nd5 l02 = l0(i7, xp5Var);
        d0(l02, 1000, new ap1(l02, op5Var, tp5Var, i8) { // from class: com.google.android.gms.internal.ads.le5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void q(final en enVar) {
        final nd5 e02 = e0();
        d0(e02, 13, new ap1(e02, enVar) { // from class: com.google.android.gms.internal.ads.ve5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void r(qd5 qd5Var) {
        this.f17601v.c(qd5Var);
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void s(final int i7, final int i8, final boolean z7) {
        final nd5 k02 = k0();
        d0(k02, 1033, new ap1(k02, i7, i8, z7) { // from class: com.google.android.gms.internal.ads.ze5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void t(final d70 d70Var) {
        final nd5 e02 = e0();
        d0(e02, 2, new ap1(e02, d70Var) { // from class: com.google.android.gms.internal.ads.te5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void u(final mr mrVar, Looper looper) {
        boolean z7 = true;
        if (this.f17602w != null && !this.f17599t.i().isEmpty()) {
            z7 = false;
        }
        rx3.h(z7);
        mrVar.getClass();
        this.f17602w = mrVar;
        this.f17603x = this.f17596q.c(looper, null);
        this.f17601v = this.f17601v.a(looper, new bq1() { // from class: com.google.android.gms.internal.ads.rd5
            @Override // com.google.android.gms.internal.ads.bq1
            public final /* synthetic */ void a(Object obj, km5 km5Var) {
                vf5.this.g0(mrVar, (qd5) obj, km5Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void v(final int i7) {
        final nd5 k02 = k0();
        d0(k02, 21, new ap1(k02, i7) { // from class: com.google.android.gms.internal.ads.jf5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void w(az azVar, final int i7) {
        mr mrVar = this.f17602w;
        mrVar.getClass();
        this.f17599t.g(mrVar);
        final nd5 e02 = e0();
        d0(e02, 0, new ap1(e02, i7) { // from class: com.google.android.gms.internal.ads.re5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void x(final lq lqVar, final lq lqVar2, final int i7) {
        if (i7 == 1) {
            this.f17604y = false;
            i7 = 1;
        }
        uf5 uf5Var = this.f17599t;
        mr mrVar = this.f17602w;
        mrVar.getClass();
        uf5Var.f(mrVar);
        final nd5 e02 = e0();
        d0(e02, 11, new ap1() { // from class: com.google.android.gms.internal.ads.ef5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
                ((qd5) obj).k(nd5.this, lqVar, lqVar2, i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.md5
    public final void y(final Object obj, final long j7) {
        final nd5 k02 = k0();
        d0(k02, 26, new ap1() { // from class: com.google.android.gms.internal.ads.ge5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj2) {
                ((qd5) obj2).n(nd5.this, obj, j7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void z(final xj xjVar) {
        final nd5 m02 = m0(xjVar);
        d0(m02, 10, new ap1(m02, xjVar) { // from class: com.google.android.gms.internal.ads.df5
            @Override // com.google.android.gms.internal.ads.ap1
            public final /* synthetic */ void d(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void n(mr mrVar, go goVar) {
    }
}
