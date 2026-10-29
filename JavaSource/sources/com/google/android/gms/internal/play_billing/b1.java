package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class b1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final f1 f21482q;

    /* renamed from: r, reason: collision with root package name */
    final a2 f21483r;

    b1(f1 f1Var, a2 a2Var) {
        this.f21482q = f1Var;
        this.f21483r = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object t7;
        if (this.f21482q.f21602q != this) {
            return;
        }
        a2 a2Var = this.f21483r;
        f1 f1Var = this.f21482q;
        t7 = f1.t(a2Var);
        if (l1.k(f1Var, this, t7)) {
            f1.w(this.f21482q, false);
        }
    }
}
