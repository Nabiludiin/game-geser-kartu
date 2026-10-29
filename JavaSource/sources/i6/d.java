package i6;

import g6.i;

/* compiled from: MyApplication */
public abstract class d extends a {

    /* renamed from: r, reason: collision with root package name */
    private final g6.i f24181r;

    /* renamed from: s, reason: collision with root package name */
    private transient g6.e f24182s;

    public d(g6.e eVar, g6.i iVar) {
        super(eVar);
        this.f24181r = iVar;
    }

    @Override // g6.e
    public g6.i getContext() {
        g6.i iVar = this.f24181r;
        q6.i.b(iVar);
        return iVar;
    }

    @Override // i6.a
    protected void n() {
        g6.e eVar = this.f24182s;
        if (eVar != null && eVar != this) {
            i.b e8 = getContext().e(g6.f.f24047n);
            q6.i.b(e8);
            ((g6.f) e8).r(eVar);
        }
        this.f24182s = c.f24180q;
    }

    public final g6.e o() {
        g6.e eVar = this.f24182s;
        if (eVar == null) {
            g6.f fVar = (g6.f) getContext().e(g6.f.f24047n);
            if (fVar == null || (eVar = fVar.o(this)) == null) {
                eVar = this;
            }
            this.f24182s = eVar;
        }
        return eVar;
    }

    public d(g6.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
