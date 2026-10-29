package q6;

/* compiled from: MyApplication */
public abstract class n extends a implements u6.f {

    /* renamed from: x, reason: collision with root package name */
    private final boolean f25708x;

    public n(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f25708x = (i7 & 2) == 2;
    }

    @Override // q6.a
    public u6.a c() {
        return this.f25708x ? this : super.c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return j().equals(nVar.j()) && h().equals(nVar.h()) && k().equals(nVar.k()) && i.a(f(), nVar.f());
        }
        if (obj instanceof u6.f) {
            return obj.equals(c());
        }
        return false;
    }

    public int hashCode() {
        return (((j().hashCode() * 31) + h().hashCode()) * 31) + k().hashCode();
    }

    public String toString() {
        u6.a c8 = c();
        if (c8 != this) {
            return c8.toString();
        }
        return "property " + h() + " (Kotlin reflection is not available)";
    }
}
