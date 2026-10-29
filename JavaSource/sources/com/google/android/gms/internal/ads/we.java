package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class we implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final gf f18224q;

    /* renamed from: r, reason: collision with root package name */
    private final lf f18225r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f18226s;

    public we(gf gfVar, lf lfVar, Runnable runnable) {
        this.f18224q = gfVar;
        this.f18225r = lfVar;
        this.f18226s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf gfVar = this.f18224q;
        gfVar.r();
        lf lfVar = this.f18225r;
        if (lfVar.c()) {
            gfVar.y(lfVar.f11594a);
        } else {
            gfVar.z(lfVar.f11596c);
        }
        if (lfVar.f11597d) {
            gfVar.d("intermediate-response");
        } else {
            gfVar.j("done");
        }
        Runnable runnable = this.f18226s;
        if (runnable != null) {
            runnable.run();
        }
    }
}
