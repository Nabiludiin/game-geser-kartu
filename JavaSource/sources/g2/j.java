package g2;

/* compiled from: MyApplication */
public final class j implements a2.b {

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final j f23979a = new j();
    }

    public static j a() {
        return a.f23979a;
    }

    public static e c() {
        return (e) a2.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
