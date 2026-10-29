package s5;

/* compiled from: MyApplication */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f26283a;

    private b() {
    }

    public static b b() {
        if (f26283a == null) {
            f26283a = new b();
        }
        return f26283a;
    }

    @Override // s5.a
    public long a() {
        return System.currentTimeMillis();
    }
}
