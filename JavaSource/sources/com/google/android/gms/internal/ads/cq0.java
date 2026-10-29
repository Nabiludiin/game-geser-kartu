package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cq0 implements kb5 {

    /* renamed from: a, reason: collision with root package name */
    private final ru5 f6561a = new ru5(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f6562b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f6563c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f6564d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f6565e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f6566f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6567g;

    cq0() {
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void a(ni5 ni5Var) {
        o(false);
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final long b(ni5 ni5Var) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean c(ib5 ib5Var) {
        long j7 = ib5Var.f9958e;
        boolean z7 = true;
        char c8 = j7 > this.f6563c ? (char) 0 : j7 < this.f6562b ? (char) 2 : (char) 1;
        int f8 = this.f6561a.f();
        int i7 = this.f6566f;
        if (c8 != 2 && (c8 != 1 || !this.f6567g || f8 >= i7)) {
            z7 = false;
        }
        this.f6567g = z7;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final ku5 d(ni5 ni5Var) {
        return this.f6561a;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void e(ib5 ib5Var, as5 as5Var, zt5[] zt5VarArr) {
        int i7;
        this.f6566f = 0;
        for (zt5 zt5Var : zt5VarArr) {
            if (zt5Var != null) {
                int i8 = this.f6566f;
                int i9 = zt5Var.a().f5436c;
                if (i9 == 0) {
                    i7 = 144310272;
                } else if (i9 == 1) {
                    i7 = 13107200;
                } else if (i9 != 2) {
                    i7 = 131072;
                    if (i9 != 3 && i9 != 5 && i9 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i7 = 131072000;
                }
                this.f6566f = i8 + i7;
            }
        }
        this.f6561a.e(this.f6566f);
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean f(ni5 ni5Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean g(ib5 ib5Var) {
        long j7 = ib5Var.f9960g ? this.f6565e : this.f6564d;
        return j7 <= 0 || ib5Var.f9958e >= j7;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public /* synthetic */ boolean h(ni5 ni5Var, az azVar, xp5 xp5Var, long j7) {
        return jb5.a(this, ni5Var, azVar, xp5Var, j7);
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void i(ni5 ni5Var) {
        o(true);
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void j(ni5 ni5Var) {
        o(true);
    }

    public final synchronized void k(int i7) {
        this.f6562b = i7 * 1000;
    }

    public final synchronized void l(int i7) {
        this.f6563c = i7 * 1000;
    }

    public final synchronized void m(int i7) {
        this.f6564d = i7 * 1000;
    }

    public final synchronized void n(int i7) {
        this.f6565e = i7 * 1000;
    }

    final void o(boolean z7) {
        this.f6566f = 0;
        this.f6567g = false;
        if (z7) {
            this.f6561a.d();
        }
    }
}
