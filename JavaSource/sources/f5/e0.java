package f5;

/* compiled from: MyApplication */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f23737a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f23738b;

    /* compiled from: MyApplication */
    private @interface a {
    }

    public e0(Class cls, Class cls2) {
        this.f23737a = cls;
        this.f23738b = cls2;
    }

    public static e0 a(Class cls, Class cls2) {
        return new e0(cls, cls2);
    }

    public static e0 b(Class cls) {
        return new e0(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f23738b.equals(e0Var.f23738b)) {
            return this.f23737a.equals(e0Var.f23737a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23738b.hashCode() * 31) + this.f23737a.hashCode();
    }

    public String toString() {
        if (this.f23737a == a.class) {
            return this.f23738b.getName();
        }
        return "@" + this.f23737a.getName() + " " + this.f23738b.getName();
    }
}
