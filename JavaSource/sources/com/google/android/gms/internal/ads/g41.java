package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class g41 implements qb1, gr, hf1 {

    /* renamed from: q, reason: collision with root package name */
    private final c03 f8634q;

    /* renamed from: r, reason: collision with root package name */
    private final pa1 f8635r;

    /* renamed from: s, reason: collision with root package name */
    private final zb1 f8636s;

    /* renamed from: v, reason: collision with root package name */
    private final wc1 f8639v;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f8637t = new AtomicBoolean();

    /* renamed from: u, reason: collision with root package name */
    private final AtomicBoolean f8638u = new AtomicBoolean();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f8640w = new AtomicBoolean();

    public g41(c03 c03Var, pa1 pa1Var, zb1 zb1Var, wc1 wc1Var) {
        this.f8634q = c03Var;
        this.f8635r = pa1Var;
        this.f8636s = zb1Var;
        this.f8639v = wc1Var;
    }

    private final void a() {
        if (this.f8637t.compareAndSet(false, true)) {
            this.f8635r.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void d() {
        if (this.f8634q.f6158e == 4) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final synchronized void f() {
        int i7 = this.f8634q.f6158e;
        if (i7 == 1 || i7 == 4) {
            return;
        }
        a();
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        int i7 = this.f8634q.f6158e;
        if (i7 == 1) {
            if (frVar.f8430j) {
                a();
            }
        } else if (i7 == 4 && frVar.f8430j && this.f8640w.compareAndSet(false, true)) {
            this.f8639v.a();
        }
        if (frVar.f8430j && this.f8638u.compareAndSet(false, true)) {
            this.f8636s.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void h() {
    }
}
