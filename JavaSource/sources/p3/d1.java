package p3;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class d1 extends n0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f25166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c cVar, int i7, Bundle bundle) {
        super(cVar, i7, bundle);
        this.f25166g = cVar;
    }

    @Override // p3.n0
    protected final void f(k3.b bVar) {
        if (this.f25166g.y() && c.m0(this.f25166g)) {
            c.i0(this.f25166g, 16);
        } else {
            this.f25166g.f25136p.b(bVar);
            this.f25166g.Q(bVar);
        }
    }

    @Override // p3.n0
    protected final boolean g() {
        this.f25166g.f25136p.b(k3.b.f24462u);
        return true;
    }
}
