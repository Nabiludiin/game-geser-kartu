package q6;

/* compiled from: MyApplication */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final r f25711a;

    /* renamed from: b, reason: collision with root package name */
    private static final u6.b[] f25712b;

    static {
        r rVar = null;
        try {
            rVar = (r) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (rVar == null) {
            rVar = new r();
        }
        f25711a = rVar;
        f25712b = new u6.b[0];
    }

    public static u6.d a(g gVar) {
        return f25711a.a(gVar);
    }

    public static u6.b b(Class cls) {
        return f25711a.b(cls);
    }

    public static u6.c c(Class cls) {
        return f25711a.c(cls, "");
    }

    public static u6.e d(l lVar) {
        return f25711a.d(lVar);
    }

    public static String e(f fVar) {
        return f25711a.e(fVar);
    }

    public static String f(j jVar) {
        return f25711a.f(jVar);
    }
}
