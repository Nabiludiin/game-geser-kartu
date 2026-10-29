package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public abstract class gu4 implements pc5, sc5 {
    private long A;
    private long B;
    private boolean D;
    private boolean E;
    private xp5 G;
    private qc5 H;

    /* renamed from: r, reason: collision with root package name */
    private final int f9155r;

    /* renamed from: t, reason: collision with root package name */
    private tc5 f9157t;

    /* renamed from: u, reason: collision with root package name */
    private int f9158u;

    /* renamed from: v, reason: collision with root package name */
    private ni5 f9159v;

    /* renamed from: w, reason: collision with root package name */
    private pd1 f9160w;

    /* renamed from: x, reason: collision with root package name */
    private int f9161x;

    /* renamed from: y, reason: collision with root package name */
    private qr5 f9162y;

    /* renamed from: z, reason: collision with root package name */
    private eq5[] f9163z;

    /* renamed from: q, reason: collision with root package name */
    private final Object f9154q = new Object();

    /* renamed from: s, reason: collision with root package name */
    private final hb5 f9156s = new hb5();
    private long C = Long.MIN_VALUE;
    private az F = az.f5406a;

    public gu4(int i7) {
        this.f9155r = i7;
    }

    private final void c0(long j7, boolean z7, boolean z8) {
        this.D = false;
        this.B = j7;
        this.C = j7;
        if (!z8) {
            z8 = Z(j7) != 0;
        }
        I(j7, z7, z8);
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void A(az azVar) {
        if (Objects.equals(this.F, azVar)) {
            return;
        }
        this.F = azVar;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void B() {
        rx3.h(this.f9161x == 1);
        this.f9161x = 2;
        J();
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final boolean C() {
        return this.C == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.sc5
    public final void E(qc5 qc5Var) {
        synchronized (this.f9154q) {
            this.H = qc5Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.sc5
    public final void G() {
        synchronized (this.f9154q) {
            this.H = null;
        }
    }

    protected abstract void I(long j7, boolean z7, boolean z8);

    protected abstract void J();

    protected abstract void K();

    protected abstract void L();

    protected abstract void M();

    protected abstract void N();

    protected final long O() {
        return this.B;
    }

    protected final hb5 Q() {
        hb5 hb5Var = this.f9156s;
        hb5Var.f9415a = null;
        hb5Var.f9416b = null;
        return hb5Var;
    }

    protected final eq5[] R() {
        eq5[] eq5VarArr = this.f9163z;
        eq5VarArr.getClass();
        return eq5VarArr;
    }

    protected final tc5 S() {
        tc5 tc5Var = this.f9157t;
        tc5Var.getClass();
        return tc5Var;
    }

    protected final ni5 T() {
        ni5 ni5Var = this.f9159v;
        ni5Var.getClass();
        return ni5Var;
    }

    protected final pd1 U() {
        pd1 pd1Var = this.f9160w;
        pd1Var.getClass();
        return pd1Var;
    }

    protected final az V() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public /* synthetic */ void W() {
        oc5.c(this);
    }

    protected final b45 X(Throwable th, eq5 eq5Var, boolean z7, int i7) {
        int i8 = 4;
        if (eq5Var != null && !this.E) {
            this.E = true;
            try {
                i8 = H(eq5Var) & 7;
            } catch (b45 unused) {
            } finally {
                this.E = false;
            }
        }
        return b45.b(th, P(), this.f9158u, eq5Var, i8, this.G, z7, i7);
    }

    protected final int Y(hb5 hb5Var, wj4 wj4Var, int i7) {
        qr5 qr5Var = this.f9162y;
        qr5Var.getClass();
        int a8 = qr5Var.a(hb5Var, wj4Var, i7);
        if (a8 == -4) {
            if (wj4Var.b()) {
                this.C = Long.MIN_VALUE;
                return this.D ? -4 : -3;
            }
            long j7 = wj4Var.f18273f + this.A;
            wj4Var.f18273f = j7;
            this.C = Math.max(this.C, j7);
            return a8;
        }
        if (a8 == -5) {
            eq5 eq5Var = hb5Var.f9416b;
            eq5Var.getClass();
            long j8 = eq5Var.f7780t;
            if (j8 != Long.MAX_VALUE) {
                xn5 a9 = eq5Var.a();
                a9.q0(j8 + this.A);
                hb5Var.f9416b = a9.m();
                return -5;
            }
        }
        return a8;
    }

    protected final int Z(long j7) {
        qr5 qr5Var = this.f9162y;
        qr5Var.getClass();
        return qr5Var.g(j7 - this.A);
    }

    @Override // com.google.android.gms.internal.ads.pc5, com.google.android.gms.internal.ads.sc5
    public final int a() {
        return this.f9155r;
    }

    protected final boolean a0() {
        if (C()) {
            return this.D;
        }
        qr5 qr5Var = this.f9162y;
        qr5Var.getClass();
        return qr5Var.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b0() {
        qc5 qc5Var;
        synchronized (this.f9154q) {
            qc5Var = this.H;
        }
        if (qc5Var != null) {
            qc5Var.a(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final int c() {
        return this.f9161x;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final qr5 d() {
        return this.f9162y;
    }

    protected abstract void d0(boolean z7, boolean z8);

    protected abstract void e0(eq5[] eq5VarArr, long j7, long j8, xp5 xp5Var);

    @Override // com.google.android.gms.internal.ads.pc5
    public ob5 h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void j(tc5 tc5Var, eq5[] eq5VarArr, qr5 qr5Var, long j7, boolean z7, boolean z8, long j8, long j9, xp5 xp5Var) {
        rx3.h(this.f9161x == 0);
        this.f9157t = tc5Var;
        this.G = xp5Var;
        this.f9161x = 1;
        d0(z7, z8);
        x(eq5VarArr, qr5Var, j8, j9, xp5Var);
        c0(j8, z7, true);
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void k() {
        this.D = true;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final long l() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void m() {
        rx3.h(this.f9161x == 2);
        this.f9161x = 1;
        K();
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final boolean n() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void o() {
        qr5 qr5Var = this.f9162y;
        qr5Var.getClass();
        qr5Var.d();
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void p() {
        rx3.h(this.f9161x == 0);
        hb5 hb5Var = this.f9156s;
        hb5Var.f9415a = null;
        hb5Var.f9416b = null;
        M();
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public /* synthetic */ boolean q(long j7) {
        return oc5.b(this, j7);
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void r() {
        rx3.h(this.f9161x == 0);
        N();
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void s(int i7, ni5 ni5Var, pd1 pd1Var) {
        this.f9158u = i7;
        this.f9159v = ni5Var;
        this.f9160w = pd1Var;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void u(long j7, boolean z7) {
        c0(j7, false, z7);
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void w() {
        rx3.h(this.f9161x == 1);
        hb5 hb5Var = this.f9156s;
        hb5Var.f9415a = null;
        hb5Var.f9416b = null;
        this.f9161x = 0;
        this.f9162y = null;
        this.f9163z = null;
        this.D = false;
        L();
        this.G = null;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final void x(eq5[] eq5VarArr, qr5 qr5Var, long j7, long j8, xp5 xp5Var) {
        rx3.h(!this.D);
        this.f9162y = qr5Var;
        this.G = xp5Var;
        if (this.C == Long.MIN_VALUE) {
            this.C = j7;
        }
        this.f9163z = eq5VarArr;
        this.A = j8;
        e0(eq5VarArr, j7, j8, xp5Var);
    }

    @Override // com.google.android.gms.internal.ads.jc5
    public abstract void y(int i7, Object obj);

    @Override // com.google.android.gms.internal.ads.pc5
    public /* synthetic */ long z(long j7, long j8) {
        return oc5.a(this, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final sc5 b() {
        return this;
    }
}
