package w;

import w.f;

/* compiled from: MyApplication */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f26966m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f26949e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f26949e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // w.f
    public void d(int i7) {
        if (this.f26954j) {
            return;
        }
        this.f26954j = true;
        this.f26951g = i7;
        for (d dVar : this.f26955k) {
            dVar.a(dVar);
        }
    }
}
