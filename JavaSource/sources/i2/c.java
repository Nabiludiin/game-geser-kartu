package i2;

/* compiled from: MyApplication */
public final class c implements a2.b {

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f24169a = new c();
    }

    public static c a() {
        return a.f24169a;
    }

    public static i2.a b() {
        return (i2.a) a2.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i2.a get() {
        return b();
    }
}
