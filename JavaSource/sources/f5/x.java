package f5;

/* compiled from: MyApplication */
public class x implements o5.b {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f23786c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f23787a = f23786c;

    /* renamed from: b, reason: collision with root package name */
    private volatile o5.b f23788b;

    public x(o5.b bVar) {
        this.f23788b = bVar;
    }

    @Override // o5.b
    public Object get() {
        Object obj;
        Object obj2 = this.f23787a;
        Object obj3 = f23786c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f23787a;
                if (obj == obj3) {
                    obj = this.f23788b.get();
                    this.f23787a = obj;
                    this.f23788b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
