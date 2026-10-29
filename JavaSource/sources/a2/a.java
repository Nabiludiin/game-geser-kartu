package a2;

/* compiled from: MyApplication */
public final class a implements d6.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile d6.a f4a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f5b = f3c;

    private a(d6.a aVar) {
        this.f4a = aVar;
    }

    public static d6.a a(d6.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f3c) {
            return obj2;
        }
        if (obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // d6.a
    public Object get() {
        Object obj;
        Object obj2 = this.f5b;
        Object obj3 = f3c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5b;
                if (obj == obj3) {
                    obj = this.f4a.get();
                    this.f5b = b(this.f5b, obj);
                    this.f4a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
