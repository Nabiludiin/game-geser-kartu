package g6;

import g6.i;
import java.io.Serializable;
import p6.p;

/* compiled from: MyApplication */
public final class d implements i, Serializable {

    /* renamed from: q, reason: collision with root package name */
    private final i f24045q;

    /* renamed from: r, reason: collision with root package name */
    private final i.b f24046r;

    public d(i iVar, i.b bVar) {
        q6.i.e(iVar, "left");
        q6.i.e(bVar, "element");
        this.f24045q = iVar;
        this.f24046r = bVar;
    }

    private final boolean b(i.b bVar) {
        return q6.i.a(e(bVar.getKey()), bVar);
    }

    private final boolean d(d dVar) {
        while (b(dVar.f24046r)) {
            i iVar = dVar.f24045q;
            if (!(iVar instanceof d)) {
                q6.i.c(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    private final int f() {
        int i7 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.f24045q;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i7;
            }
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(String str, i.b bVar) {
        q6.i.e(str, "acc");
        q6.i.e(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // g6.i
    public i H(i.c cVar) {
        q6.i.e(cVar, "key");
        if (this.f24046r.e(cVar) != null) {
            return this.f24045q;
        }
        i H = this.f24045q.H(cVar);
        return H == this.f24045q ? this : H == j.f24049q ? this.f24046r : new d(H, this.f24046r);
    }

    @Override // g6.i
    public i.b e(i.c cVar) {
        q6.i.e(cVar, "key");
        d dVar = this;
        while (true) {
            i.b e8 = dVar.f24046r.e(cVar);
            if (e8 != null) {
                return e8;
            }
            i iVar = dVar.f24045q;
            if (!(iVar instanceof d)) {
                return iVar.e(cVar);
            }
            dVar = (d) iVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f() == f() && dVar.d(this);
    }

    public int hashCode() {
        return this.f24045q.hashCode() + this.f24046r.hashCode();
    }

    @Override // g6.i
    public i n(i iVar) {
        return i.a.b(this, iVar);
    }

    @Override // g6.i
    public Object s(Object obj, p pVar) {
        q6.i.e(pVar, "operation");
        return pVar.i(this.f24045q.s(obj, pVar), this.f24046r);
    }

    public String toString() {
        return '[' + ((String) s("", new p() { // from class: g6.c
            @Override // p6.p
            public final Object i(Object obj, Object obj2) {
                String h8;
                h8 = d.h((String) obj, (i.b) obj2);
                return h8;
            }
        })) + ']';
    }
}
