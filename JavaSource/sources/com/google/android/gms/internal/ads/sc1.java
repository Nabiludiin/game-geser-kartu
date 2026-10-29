package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class sc1 extends eg1 implements ra1, bc1 {

    /* renamed from: r, reason: collision with root package name */
    private final c03 f15552r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicBoolean f15553s;

    /* renamed from: t, reason: collision with root package name */
    private final o03 f15554t;

    public sc1(Set set, c03 c03Var, o03 o03Var) {
        super(set);
        this.f15553s = new AtomicBoolean();
        this.f15552r = c03Var;
        this.f15554t = o03Var;
    }

    private final void W0() {
        final s2.i5 i5Var;
        if (((Boolean) s2.b0.c().d(uy.G8)).booleanValue() && this.f15553s.compareAndSet(false, true) && (i5Var = this.f15552r.f6159e0) != null && i5Var.f26141q == 3) {
            K0(new dg1() { // from class: com.google.android.gms.internal.ads.rc1
                @Override // com.google.android.gms.internal.ads.dg1
                public final /* synthetic */ void d(Object obj) {
                    ((uc1) obj).h(s2.i5.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        int i7 = this.f15552r.f6152b;
        if (i7 == 2 || i7 == 5 || i7 == 4 || i7 == 6 || i7 == 7) {
            W0();
        }
    }

    public final void U0(final s2.i5 i5Var) {
        if (b3.c.a(this.f15554t) && this.f15552r.B0) {
            K0(new dg1() { // from class: com.google.android.gms.internal.ads.qc1
                @Override // com.google.android.gms.internal.ads.dg1
                public final /* synthetic */ void d(Object obj) {
                    ((uc1) obj).h(s2.i5.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.bc1
    public final void k() {
        if (this.f15552r.f6152b == 1) {
            W0();
        }
    }
}
