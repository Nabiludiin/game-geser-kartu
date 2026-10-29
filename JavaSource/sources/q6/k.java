package q6;

/* compiled from: MyApplication */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Class f25706a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25707b;

    public k(Class cls, String str) {
        i.e(cls, "jClass");
        i.e(str, "moduleName");
        this.f25706a = cls;
        this.f25707b = str;
    }

    @Override // q6.b
    public Class b() {
        return this.f25706a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(b(), ((k) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
