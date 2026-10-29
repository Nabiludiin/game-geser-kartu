package x6;

/* compiled from: MyApplication */
public final class q extends o1 implements p {

    /* renamed from: u, reason: collision with root package name */
    public final r f27418u;

    public q(r rVar) {
        this.f27418u = rVar;
    }

    @Override // x6.z
    public void A(Throwable th) {
        this.f27418u.G(B());
    }

    @Override // x6.p
    public boolean d(Throwable th) {
        return B().O(th);
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ Object g(Object obj) {
        A((Throwable) obj);
        return e6.s.f23253a;
    }

    @Override // x6.p
    public m1 getParent() {
        return B();
    }
}
