package i6;

import e6.m;
import e6.n;
import java.io.Serializable;

/* compiled from: MyApplication */
public abstract class a implements g6.e, e, Serializable {

    /* renamed from: q, reason: collision with root package name */
    private final g6.e f24179q;

    public a(g6.e eVar) {
        this.f24179q = eVar;
    }

    public e d() {
        g6.e eVar = this.f24179q;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    @Override // g6.e
    public final void h(Object obj) {
        Object m7;
        g6.e eVar = this;
        while (true) {
            h.b(eVar);
            a aVar = (a) eVar;
            g6.e eVar2 = aVar.f24179q;
            q6.i.b(eVar2);
            try {
                m7 = aVar.m(obj);
            } catch (Throwable th) {
                m.a aVar2 = m.f23247q;
                obj = m.a(n.a(th));
            }
            if (m7 == h6.b.e()) {
                return;
            }
            obj = m.a(m7);
            aVar.n();
            if (!(eVar2 instanceof a)) {
                eVar2.h(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public g6.e j(Object obj, g6.e eVar) {
        q6.i.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final g6.e k() {
        return this.f24179q;
    }

    public StackTraceElement l() {
        return g.d(this);
    }

    protected abstract Object m(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object l7 = l();
        if (l7 == null) {
            l7 = getClass().getName();
        }
        sb.append(l7);
        return sb.toString();
    }

    protected void n() {
    }
}
