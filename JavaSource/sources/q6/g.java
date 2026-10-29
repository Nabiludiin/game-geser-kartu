package q6;

/* compiled from: MyApplication */
public abstract class g extends a implements f, u6.d {

    /* renamed from: x, reason: collision with root package name */
    private final int f25703x;

    /* renamed from: y, reason: collision with root package name */
    private final int f25704y;

    public g(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f25703x = i7;
        this.f25704y = i8 >> 1;
    }

    @Override // q6.f
    public int b() {
        return this.f25703x;
    }

    @Override // q6.a
    protected u6.a d() {
        return q.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return h().equals(gVar.h()) && k().equals(gVar.k()) && this.f25704y == gVar.f25704y && this.f25703x == gVar.f25703x && i.a(f(), gVar.f()) && i.a(j(), gVar.j());
        }
        if (obj instanceof u6.d) {
            return obj.equals(c());
        }
        return false;
    }

    public int hashCode() {
        return (((j() == null ? 0 : j().hashCode() * 31) + h().hashCode()) * 31) + k().hashCode();
    }

    public String toString() {
        u6.a c8 = c();
        if (c8 != this) {
            return c8.toString();
        }
        if ("<init>".equals(h())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + h() + " (Kotlin reflection is not available)";
    }
}
