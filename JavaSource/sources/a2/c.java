package a2;

/* compiled from: MyApplication */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    private static final c f6b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f7a;

    private c(Object obj) {
        this.f7a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // d6.a
    public Object get() {
        return this.f7a;
    }
}
