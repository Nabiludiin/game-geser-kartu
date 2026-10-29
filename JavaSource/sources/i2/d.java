package i2;

/* compiled from: MyApplication */
public final class d implements a2.b {

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f24170a = new d();
    }

    public static d a() {
        return a.f24170a;
    }

    public static i2.a c() {
        return (i2.a) a2.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i2.a get() {
        return c();
    }
}
