package x6;

/* compiled from: MyApplication */
final class j1 extends h {

    /* renamed from: q, reason: collision with root package name */
    private final p6.l f27395q;

    public j1(p6.l lVar) {
        this.f27395q = lVar;
    }

    @Override // x6.i
    public void c(Throwable th) {
        this.f27395q.g(th);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ Object g(Object obj) {
        c((Throwable) obj);
        return e6.s.f23253a;
    }

    public String toString() {
        return "InvokeOnCancel[" + k0.a(this.f27395q) + '@' + k0.b(this) + ']';
    }
}
