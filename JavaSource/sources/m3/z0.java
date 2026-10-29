package m3;

import l3.a;
import m3.q;

/* compiled from: MyApplication */
final class z0 extends q {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ q.a f24889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z0(q.a aVar, k3.d[] dVarArr, boolean z7, int i7) {
        super(dVarArr, z7, i7);
        this.f24889d = aVar;
    }

    @Override // m3.q
    protected final void b(a.b bVar, w4.j jVar) {
        o oVar;
        oVar = this.f24889d.f24843a;
        oVar.accept(bVar, jVar);
    }
}
