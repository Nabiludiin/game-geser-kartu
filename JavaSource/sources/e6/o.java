package e6;

import java.io.Serializable;

/* compiled from: MyApplication */
final class o implements g, Serializable {

    /* renamed from: q, reason: collision with root package name */
    private p6.a f23249q;

    /* renamed from: r, reason: collision with root package name */
    private volatile Object f23250r;

    /* renamed from: s, reason: collision with root package name */
    private final Object f23251s;

    public o(p6.a aVar, Object obj) {
        q6.i.e(aVar, "initializer");
        this.f23249q = aVar;
        this.f23250r = q.f23252a;
        this.f23251s = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f23250r != q.f23252a;
    }

    @Override // e6.g
    public Object getValue() {
        Object obj;
        Object obj2 = this.f23250r;
        q qVar = q.f23252a;
        if (obj2 != qVar) {
            return obj2;
        }
        synchronized (this.f23251s) {
            obj = this.f23250r;
            if (obj == qVar) {
                p6.a aVar = this.f23249q;
                q6.i.b(aVar);
                obj = aVar.a();
                this.f23250r = obj;
                this.f23249q = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ o(p6.a aVar, Object obj, int i7, q6.e eVar) {
        this(aVar, (i7 & 2) != 0 ? null : obj);
    }
}
