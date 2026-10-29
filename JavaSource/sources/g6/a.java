package g6;

import g6.i;
import p6.p;

/* compiled from: MyApplication */
public abstract class a implements i.b {

    /* renamed from: q, reason: collision with root package name */
    private final i.c f24042q;

    public a(i.c cVar) {
        q6.i.e(cVar, "key");
        this.f24042q = cVar;
    }

    @Override // g6.i
    public i H(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // g6.i.b, g6.i
    public i.b e(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // g6.i.b
    public i.c getKey() {
        return this.f24042q;
    }

    @Override // g6.i
    public i n(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // g6.i
    public Object s(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }
}
