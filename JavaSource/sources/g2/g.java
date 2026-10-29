package g2;

/* compiled from: MyApplication */
public final class g implements a2.b {

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final g f23973a = new g();
    }

    public static g a() {
        return a.f23973a;
    }

    public static String b() {
        return (String) a2.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // d6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
