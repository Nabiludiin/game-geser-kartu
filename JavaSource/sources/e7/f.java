package e7;

import x6.d1;

/* compiled from: MyApplication */
public abstract class f extends d1 {

    /* renamed from: t, reason: collision with root package name */
    private final int f23285t;

    /* renamed from: u, reason: collision with root package name */
    private final int f23286u;

    /* renamed from: v, reason: collision with root package name */
    private final long f23287v;

    /* renamed from: w, reason: collision with root package name */
    private final String f23288w;

    /* renamed from: x, reason: collision with root package name */
    private a f23289x = M();

    public f(int i7, int i8, long j7, String str) {
        this.f23285t = i7;
        this.f23286u = i8;
        this.f23287v = j7;
        this.f23288w = str;
    }

    private final a M() {
        return new a(this.f23285t, this.f23286u, this.f23287v, this.f23288w);
    }

    public final void O(Runnable runnable, i iVar, boolean z7) {
        this.f23289x.k(runnable, iVar, z7);
    }

    @Override // x6.d0
    public void h(g6.i iVar, Runnable runnable) {
        a.l(this.f23289x, runnable, null, false, 6, null);
    }
}
