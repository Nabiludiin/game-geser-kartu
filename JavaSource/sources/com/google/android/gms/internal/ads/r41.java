package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public abstract class r41 implements zd2 {

    /* renamed from: a, reason: collision with root package name */
    protected final o03 f14725a;

    /* renamed from: b, reason: collision with root package name */
    protected final c03 f14726b;

    /* renamed from: c, reason: collision with root package name */
    private final wa1 f14727c;

    /* renamed from: d, reason: collision with root package name */
    private final ob1 f14728d;

    /* renamed from: e, reason: collision with root package name */
    private final px2 f14729e;

    /* renamed from: f, reason: collision with root package name */
    private final p91 f14730f;

    /* renamed from: g, reason: collision with root package name */
    private final we1 f14731g;

    /* renamed from: h, reason: collision with root package name */
    private final sb1 f14732h;

    /* renamed from: i, reason: collision with root package name */
    private final ei1 f14733i;

    /* renamed from: j, reason: collision with root package name */
    private final p81 f14734j;

    /* renamed from: k, reason: collision with root package name */
    private final vy1 f14735k;

    protected r41(q41 q41Var) {
        this.f14725a = q41Var.a();
        this.f14726b = q41Var.b();
        this.f14727c = q41Var.c();
        this.f14728d = q41Var.d();
        this.f14729e = q41Var.e();
        this.f14730f = q41Var.f();
        this.f14731g = q41Var.g();
        this.f14732h = q41Var.h();
        this.f14733i = q41Var.i();
        this.f14734j = q41Var.j();
        this.f14735k = q41Var.k();
    }

    public void a() {
        this.f14727c.X0(null);
    }

    public void b() {
        this.f14728d.f();
        this.f14732h.H(this);
    }

    public final wa1 c() {
        return this.f14727c;
    }

    public final p91 d() {
        return this.f14730f;
    }

    public final p81 e() {
        return this.f14734j;
    }

    public final px2 f() {
        return this.f14729e;
    }

    public final ud1 g() {
        return this.f14731g.f();
    }

    public final o03 h() {
        return this.f14725a;
    }

    public final boolean i() {
        return this.f14726b.f6183q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        vy1 vy1Var;
        List list = this.f14726b.C0;
        if (list == null || list.isEmpty() || (vy1Var = this.f14735k) == null) {
            return;
        }
        if (!((Boolean) s2.b0.c().d(uy.v8)).booleanValue() || list.isEmpty()) {
            return;
        }
        k34 listIterator = ((w04) list).listIterator(0);
        while (listIterator.hasNext()) {
            wy1 wy1Var = (wy1) listIterator.next();
            int[] iArr = wy1Var.f18472b;
            int length = iArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (iArr[i7] == 1) {
                    vy1Var.a(wy1Var.f18471a, 1, r2.t.o().a());
                    break;
                }
                i7++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zd2
    public final void n() {
        this.f14733i.j();
    }
}
