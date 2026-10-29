package x6;

import e6.m;

/* compiled from: MyApplication */
final class c2 extends s1 {

    /* renamed from: u, reason: collision with root package name */
    private final k f27373u;

    public c2(k kVar) {
        this.f27373u = kVar;
    }

    @Override // x6.z
    public void A(Throwable th) {
        Object b02 = B().b0();
        if (b02 instanceof x) {
            k kVar = this.f27373u;
            m.a aVar = e6.m.f23247q;
            kVar.h(e6.m.a(e6.n.a(((x) b02).f27456a)));
        } else {
            k kVar2 = this.f27373u;
            m.a aVar2 = e6.m.f23247q;
            kVar2.h(e6.m.a(u1.h(b02)));
        }
    }

    @Override // p6.l
    public /* bridge */ /* synthetic */ Object g(Object obj) {
        A((Throwable) obj);
        return e6.s.f23253a;
    }
}
