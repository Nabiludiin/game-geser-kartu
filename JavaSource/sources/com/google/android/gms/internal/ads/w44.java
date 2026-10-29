package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class w44 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final b54 f18030q;

    /* renamed from: r, reason: collision with root package name */
    final a5.d f18031r;

    w44(b54 b54Var, a5.d dVar) {
        this.f18030q = b54Var;
        this.f18031r = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object p7;
        if (this.f18030q.f9841q != this) {
            return;
        }
        a5.d dVar = this.f18031r;
        b54 b54Var = this.f18030q;
        p7 = b54.p(dVar);
        if (i54.f(b54Var, this, p7)) {
            b54.z(this.f18030q, false);
        }
    }
}
