package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class do0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final pn0 f7185q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7186r = false;

    do0(pn0 pn0Var) {
        this.f7185q = pn0Var;
    }

    private final void c() {
        of3 of3Var = v2.f2.f26746l;
        of3Var.removeCallbacks(this);
        of3Var.postDelayed(this, 250L);
    }

    public final void a() {
        this.f7186r = true;
        this.f7185q.q();
    }

    public final void b() {
        this.f7186r = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7186r) {
            return;
        }
        this.f7185q.q();
        c();
    }
}
