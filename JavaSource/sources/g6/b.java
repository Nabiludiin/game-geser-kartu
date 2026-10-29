package g6;

import g6.i;
import p6.l;

/* compiled from: MyApplication */
public abstract class b implements i.c {

    /* renamed from: q, reason: collision with root package name */
    private final l f24043q;

    /* renamed from: r, reason: collision with root package name */
    private final i.c f24044r;

    public b(i.c cVar, l lVar) {
        q6.i.e(cVar, "baseKey");
        q6.i.e(lVar, "safeCast");
        this.f24043q = lVar;
        this.f24044r = cVar instanceof b ? ((b) cVar).f24044r : cVar;
    }

    public final boolean a(i.c cVar) {
        q6.i.e(cVar, "key");
        return cVar == this || this.f24044r == cVar;
    }

    public final i.b b(i.b bVar) {
        q6.i.e(bVar, "element");
        return (i.b) this.f24043q.g(bVar);
    }
}
