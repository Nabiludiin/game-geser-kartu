package p4;

/* compiled from: MyApplication */
public final class m2 implements q2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f25463c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile q2 f25464a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f25465b = f25463c;

    private m2(q2 q2Var) {
        this.f25464a = q2Var;
    }

    public static q2 b(q2 q2Var) {
        return q2Var instanceof m2 ? q2Var : new m2(q2Var);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f25465b;
            Object obj2 = f25463c;
            if (obj != obj2) {
                return obj;
            }
            Object a8 = this.f25464a.a();
            Object obj3 = this.f25465b;
            if (obj3 != obj2 && obj3 != a8) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + a8 + ". This is likely due to a circular dependency.");
            }
            this.f25465b = a8;
            this.f25464a = null;
            return a8;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p4.r2
    public final Object a() {
        Object obj = this.f25465b;
        return obj == f25463c ? c() : obj;
    }
}
