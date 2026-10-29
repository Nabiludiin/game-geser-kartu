package androidx.lifecycle;

/* compiled from: MyApplication */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final a f2549a;

    /* renamed from: b, reason: collision with root package name */
    private final y f2550b;

    /* compiled from: MyApplication */
    public interface a {
        w a(Class cls);
    }

    public x(y yVar, a aVar) {
        this.f2549a = aVar;
        this.f2550b = yVar;
    }

    public w a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public w b(String str, Class cls) {
        w b8 = this.f2550b.b(str);
        if (cls.isInstance(b8)) {
            return b8;
        }
        w a8 = this.f2549a.a(cls);
        this.f2550b.d(str, a8);
        return a8;
    }
}
