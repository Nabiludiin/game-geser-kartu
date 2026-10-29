package x6;

/* compiled from: MyApplication */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final h2 f27384a = new h2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f27385b = c7.k0.a(new c7.f0("ThreadLocalEventLoop"));

    private h2() {
    }

    public final x0 a() {
        ThreadLocal threadLocal = f27385b;
        x0 x0Var = (x0) threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        x0 a8 = a1.a();
        threadLocal.set(a8);
        return a8;
    }

    public final void b() {
        f27385b.set(null);
    }

    public final void c(x0 x0Var) {
        f27385b.set(x0Var);
    }
}
