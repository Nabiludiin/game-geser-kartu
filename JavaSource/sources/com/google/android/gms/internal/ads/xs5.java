package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class xs5 implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    private final boolean f19016q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f19017r;

    public xs5(eq5 eq5Var, int i7) {
        this.f19016q = 1 == (eq5Var.f7765e & 1);
        this.f19017r = rc5.a(i7, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xs5 xs5Var) {
        return j04.f().d(this.f19017r, xs5Var.f19017r).d(this.f19016q, xs5Var.f19016q).e();
    }
}
