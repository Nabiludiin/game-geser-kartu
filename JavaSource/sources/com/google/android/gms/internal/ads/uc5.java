package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class uc5 {

    /* renamed from: a, reason: collision with root package name */
    private final pc5 f16704a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16705b;

    /* renamed from: c, reason: collision with root package name */
    private final pc5 f16706c;

    /* renamed from: d, reason: collision with root package name */
    private int f16707d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16708e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16709f = false;

    public uc5(pc5 pc5Var, pc5 pc5Var2, int i7) {
        this.f16704a = pc5Var;
        this.f16705b = i7;
        this.f16706c = pc5Var2;
    }

    private final boolean n() {
        int i7 = this.f16707d;
        return i7 == 2 || i7 == 4;
    }

    private final boolean o() {
        return this.f16707d == 3;
    }

    private final boolean p(pb5 pb5Var, pc5 pc5Var) {
        if (pc5Var == null) {
            return true;
        }
        qr5[] qr5VarArr = pb5Var.f13796c;
        int i7 = this.f16705b;
        qr5 qr5Var = qr5VarArr[i7];
        if (pc5Var.d() != null) {
            if (pc5Var.d() == qr5Var) {
                if (qr5Var != null && !pc5Var.C()) {
                    pb5Var.p();
                    boolean z7 = pb5Var.f13800g.f14367g;
                }
            }
            pb5 p7 = pb5Var.p();
            return p7 != null && p7.f13796c[i7] == pc5Var.d();
        }
        return true;
    }

    private final void q(boolean z7) {
        if (z7) {
            pc5 pc5Var = this.f16706c;
            pc5Var.getClass();
            pc5Var.y(17, this.f16704a);
        } else {
            pc5 pc5Var2 = this.f16704a;
            pc5 pc5Var3 = this.f16706c;
            pc5Var3.getClass();
            pc5Var2.y(17, pc5Var3);
        }
    }

    private final void r(pc5 pc5Var, qr5 qr5Var, v15 v15Var, long j7, boolean z7) {
        if (w(pc5Var)) {
            if (qr5Var != pc5Var.d()) {
                s(pc5Var, v15Var);
            } else if (z7) {
                pc5Var.u(j7, true);
            }
        }
    }

    private final void s(pc5 pc5Var, v15 v15Var) {
        boolean z7 = true;
        if (this.f16704a != pc5Var && this.f16706c != pc5Var) {
            z7 = false;
        }
        rx3.h(z7);
        if (w(pc5Var)) {
            v15Var.e(pc5Var);
            y(pc5Var);
            pc5Var.w();
        }
    }

    private final void t(boolean z7) {
        if (z7) {
            if (this.f16708e) {
                this.f16704a.p();
                this.f16708e = false;
                return;
            }
            return;
        }
        if (this.f16709f) {
            pc5 pc5Var = this.f16706c;
            pc5Var.getClass();
            pc5Var.p();
            this.f16709f = false;
        }
    }

    private final int u(pc5 pc5Var, pb5 pb5Var, hu5 hu5Var, v15 v15Var) {
        if (pc5Var != null && w(pc5Var)) {
            pc5 pc5Var2 = this.f16704a;
            boolean z7 = pc5Var != pc5Var2;
            if ((pc5Var != pc5Var2 || !n()) && (pc5Var != this.f16706c || !o())) {
                qr5 d8 = pc5Var.d();
                qr5[] qr5VarArr = pb5Var.f13796c;
                int i7 = this.f16705b;
                qr5 qr5Var = qr5VarArr[i7];
                boolean a8 = hu5Var.a(i7);
                if (a8 && d8 == qr5Var) {
                    return 1;
                }
                if (!pc5Var.n()) {
                    eq5[] v7 = v(hu5Var.f9704c[i7]);
                    qr5 qr5Var2 = qr5VarArr[i7];
                    qr5Var2.getClass();
                    pc5Var.x(v7, qr5Var2, pb5Var.c(), pb5Var.a(), pb5Var.f13800g.f14361a);
                    return 3;
                }
                if (!pc5Var.n0()) {
                    return 0;
                }
                s(pc5Var, v15Var);
                if (!a8 || C()) {
                    t(!z7);
                }
                return 1;
            }
        }
        return 1;
    }

    private static eq5[] v(zt5 zt5Var) {
        int c8 = zt5Var != null ? zt5Var.c() : 0;
        eq5[] eq5VarArr = new eq5[c8];
        for (int i7 = 0; i7 < c8; i7++) {
            zt5Var.getClass();
            eq5VarArr[i7] = zt5Var.b(i7);
        }
        return eq5VarArr;
    }

    private static boolean w(pc5 pc5Var) {
        return pc5Var.c() != 0;
    }

    private final pc5 x(pb5 pb5Var) {
        if (pb5Var != null) {
            int i7 = this.f16705b;
            qr5[] qr5VarArr = pb5Var.f13796c;
            if (qr5VarArr[i7] != null) {
                pc5 pc5Var = this.f16704a;
                qr5 d8 = pc5Var.d();
                qr5 qr5Var = qr5VarArr[i7];
                if (d8 == qr5Var) {
                    return pc5Var;
                }
                pc5 pc5Var2 = this.f16706c;
                if (pc5Var2 != null && pc5Var2.d() == qr5Var) {
                    return pc5Var2;
                }
            }
        }
        return null;
    }

    private static final void y(pc5 pc5Var) {
        if (pc5Var.c() == 2) {
            pc5Var.m();
        }
    }

    private static final void z(pc5 pc5Var, long j7) {
        pc5Var.k();
    }

    public final boolean A() {
        return this.f16706c != null;
    }

    public final void B() {
        int i7;
        rx3.h(!C());
        if (w(this.f16704a)) {
            i7 = 3;
        } else {
            pc5 pc5Var = this.f16706c;
            i7 = (pc5Var == null || !w(pc5Var)) ? 2 : 4;
        }
        this.f16707d = i7;
    }

    public final boolean C() {
        return n() || o();
    }

    public final int D() {
        pc5 pc5Var = this.f16706c;
        boolean w7 = w(this.f16704a);
        int i7 = 0;
        if (pc5Var != null && w(pc5Var)) {
            i7 = 1;
        }
        return (w7 ? 1 : 0) + i7;
    }

    public final int E() {
        return this.f16704a.a();
    }

    public final long F(pb5 pb5Var) {
        pc5 x7 = x(pb5Var);
        Objects.requireNonNull(x7);
        return x7.l();
    }

    public final boolean G(pb5 pb5Var) {
        pc5 x7 = x(pb5Var);
        x7.getClass();
        return x7.C();
    }

    public final void H(pb5 pb5Var, long j7) {
        pc5 x7 = x(pb5Var);
        x7.getClass();
        z(x7, j7);
    }

    public final void I(hu5 hu5Var, hu5 hu5Var2, long j7) {
        int i7;
        int i8 = this.f16705b;
        boolean a8 = hu5Var.a(i8);
        boolean a9 = hu5Var2.a(i8);
        pc5 pc5Var = this.f16706c;
        if (pc5Var == null || (i7 = this.f16707d) == 3 || (i7 == 0 && w(this.f16704a))) {
            pc5Var = this.f16704a;
        }
        if (!a8 || pc5Var.n()) {
            return;
        }
        E();
        tc5 tc5Var = hu5Var.f9703b[i8];
        tc5 tc5Var2 = hu5Var2.f9703b[i8];
        if (a9 && Objects.equals(tc5Var2, tc5Var) && !C()) {
            return;
        }
        z(pc5Var, j7);
    }

    public final void J(long j7) {
        int i7;
        pc5 pc5Var = this.f16704a;
        if (w(pc5Var) && (i7 = this.f16707d) != 4 && i7 != 2) {
            z(pc5Var, j7);
        }
        pc5 pc5Var2 = this.f16706c;
        if (pc5Var2 == null || !w(pc5Var2) || this.f16707d == 3) {
            return;
        }
        z(pc5Var2, j7);
    }

    public final long K(long j7, long j8) {
        pc5 pc5Var = this.f16704a;
        long z7 = w(pc5Var) ? pc5Var.z(j7, j8) : Long.MAX_VALUE;
        pc5 pc5Var2 = this.f16706c;
        return (pc5Var2 == null || !w(pc5Var2)) ? z7 : Math.min(z7, pc5Var2.z(j7, j8));
    }

    public final void L() {
        pc5 pc5Var = this.f16704a;
        if (w(pc5Var)) {
            pc5Var.W();
            return;
        }
        pc5 pc5Var2 = this.f16706c;
        if (pc5Var2 == null || !w(pc5Var2)) {
            return;
        }
        pc5Var2.W();
    }

    public final void M(float f8, float f9) {
        this.f16704a.D(f8, f9);
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            pc5Var.D(f8, f9);
        }
    }

    public final void N(az azVar) {
        this.f16704a.A(azVar);
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            pc5Var.A(azVar);
        }
    }

    public final boolean O() {
        pc5 pc5Var = this.f16704a;
        boolean n02 = w(pc5Var) ? pc5Var.n0() : true;
        pc5 pc5Var2 = this.f16706c;
        return (pc5Var2 == null || !w(pc5Var2)) ? n02 : n02 & pc5Var2.n0();
    }

    public final boolean P(pb5 pb5Var) {
        return x(pb5Var) != null;
    }

    public final boolean Q(pb5 pb5Var) {
        return (n() && x(pb5Var) == this.f16704a) || (o() && x(pb5Var) == this.f16706c);
    }

    public final boolean R(pb5 pb5Var) {
        return p(pb5Var, this.f16704a) && p(pb5Var, this.f16706c);
    }

    public final void S(long j7, long j8) {
        pc5 pc5Var = this.f16704a;
        if (w(pc5Var)) {
            pc5Var.e(j7, j8);
        }
        pc5 pc5Var2 = this.f16706c;
        if (pc5Var2 == null || !w(pc5Var2)) {
            return;
        }
        pc5Var2.e(j7, j8);
    }

    public final boolean T(pb5 pb5Var) {
        pc5 x7 = x(pb5Var);
        return x7 == null || x7.C() || x7.m0() || x7.n0();
    }

    public final void U(pb5 pb5Var) {
        pc5 x7 = x(pb5Var);
        x7.getClass();
        x7.o();
    }

    public final void V() {
        pc5 pc5Var = this.f16704a;
        if (pc5Var.c() == 1 && this.f16707d != 4) {
            pc5Var.B();
            return;
        }
        pc5 pc5Var2 = this.f16706c;
        if (pc5Var2 == null || pc5Var2.c() != 1 || this.f16707d == 3) {
            return;
        }
        pc5Var2.B();
    }

    public final void W() {
        pc5 pc5Var = this.f16704a;
        if (w(pc5Var)) {
            y(pc5Var);
        }
        pc5 pc5Var2 = this.f16706c;
        if (pc5Var2 == null || !w(pc5Var2)) {
            return;
        }
        y(pc5Var2);
    }

    public final void X(tc5 tc5Var, zt5 zt5Var, qr5 qr5Var, long j7, boolean z7, boolean z8, long j8, long j9, xp5 xp5Var, v15 v15Var) {
        eq5[] v7 = v(zt5Var);
        int i7 = this.f16707d;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            this.f16708e = true;
            pc5 pc5Var = this.f16704a;
            pc5Var.j(tc5Var, v7, qr5Var, j7, z7, z8, j8, j9, xp5Var);
            v15Var.d(pc5Var);
            return;
        }
        this.f16709f = true;
        pc5 pc5Var2 = this.f16706c;
        pc5Var2.getClass();
        pc5Var2.j(tc5Var, v7, qr5Var, j7, z7, z8, j8, j9, xp5Var);
        v15Var.d(pc5Var2);
    }

    public final void Y(int i7, Object obj, pb5 pb5Var) {
        pc5 x7 = x(pb5Var);
        x7.getClass();
        x7.y(11, obj);
    }

    public final void Z(xc5 xc5Var) {
        this.f16704a.y(18, xc5Var);
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            pc5Var.y(18, xc5Var);
        }
    }

    public final void a(v15 v15Var) {
        s(this.f16704a, v15Var);
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            boolean z7 = w(pc5Var) && this.f16707d != 3;
            s(pc5Var, v15Var);
            t(false);
            if (z7) {
                q(true);
            }
        }
        this.f16707d = 0;
    }

    public final void b() {
        int i7 = this.f16707d;
        if (i7 == 3 || i7 == 4) {
            q(i7 == 4);
            this.f16707d = this.f16707d != 4 ? 1 : 0;
        } else if (i7 == 2) {
            this.f16707d = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.v15 r7) {
        /*
            r6 = this;
            boolean r0 = r6.C()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r6.f16707d
            r1 = 0
            r2 = 4
            r3 = 1
            if (r0 == r2) goto L12
            r4 = 2
            if (r0 != r4) goto L14
            r0 = r4
        L12:
            r4 = r3
            goto L15
        L14:
            r4 = r1
        L15:
            if (r4 == 0) goto L1a
            com.google.android.gms.internal.ads.pc5 r5 = r6.f16704a
            goto L1f
        L1a:
            com.google.android.gms.internal.ads.pc5 r5 = r6.f16706c
            r5.getClass()
        L1f:
            r6.s(r5, r7)
            r6.t(r4)
            if (r0 != r2) goto L28
            r1 = r3
        L28:
            r6.f16707d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uc5.c(com.google.android.gms.internal.ads.v15):void");
    }

    public final void d(qr5 qr5Var, v15 v15Var, long j7, boolean z7) {
        r(this.f16704a, qr5Var, v15Var, j7, z7);
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            r(pc5Var, qr5Var, v15Var, j7, z7);
        }
    }

    public final void e(pb5 pb5Var, long j7, boolean z7) {
        pc5 x7 = x(pb5Var);
        if (x7 != null) {
            x7.u(j7, z7);
        }
    }

    public final boolean f(pb5 pb5Var, long j7) {
        pc5 x7 = x(pb5Var);
        return x7 != null && x7.q(j7);
    }

    public final void g() {
        if (!w(this.f16704a)) {
            t(true);
        }
        pc5 pc5Var = this.f16706c;
        if (pc5Var == null || w(pc5Var)) {
            return;
        }
        t(false);
    }

    public final int h(pb5 pb5Var, hu5 hu5Var, v15 v15Var) {
        int u7 = u(this.f16704a, pb5Var, hu5Var, v15Var);
        return u7 == 1 ? u(this.f16706c, pb5Var, hu5Var, v15Var) : u7;
    }

    public final void i() {
        this.f16704a.r();
        this.f16708e = false;
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            pc5Var.r();
            this.f16709f = false;
        }
    }

    public final void j(Object obj) {
        if (E() != 2) {
            return;
        }
        int i7 = this.f16707d;
        if (i7 != 4 && i7 != 1) {
            this.f16704a.y(1, obj);
            return;
        }
        pc5 pc5Var = this.f16706c;
        pc5Var.getClass();
        pc5Var.y(1, obj);
    }

    public final void k(c0 c0Var) {
        if (E() != 2) {
            E();
            return;
        }
        this.f16704a.y(7, c0Var);
        pc5 pc5Var = this.f16706c;
        if (pc5Var != null) {
            pc5Var.y(7, c0Var);
        }
    }

    public final void l(float f8) {
        if (E() != 1) {
            return;
        }
        pc5 pc5Var = this.f16704a;
        Float valueOf = Float.valueOf(f8);
        pc5Var.y(2, valueOf);
        pc5 pc5Var2 = this.f16706c;
        if (pc5Var2 != null) {
            pc5Var2.y(2, valueOf);
        }
    }

    public final boolean m() {
        int i7 = this.f16707d;
        if (i7 == 0 || i7 == 2 || i7 == 4) {
            return w(this.f16704a);
        }
        pc5 pc5Var = this.f16706c;
        pc5Var.getClass();
        return w(pc5Var);
    }
}
