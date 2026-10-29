package f5;

/* compiled from: MyApplication */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f23778a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23779b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23780c;

    private r(Class cls, int i7, int i8) {
        this(e0.b(cls), i7, i8);
    }

    private static String a(int i7) {
        if (i7 == 0) {
            return "direct";
        }
        if (i7 == 1) {
            return "provider";
        }
        if (i7 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i7);
    }

    public static r g(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r h(e0 e0Var) {
        return new r(e0Var, 1, 0);
    }

    public static r i(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r j(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r k(Class cls) {
        return new r(cls, 2, 0);
    }

    public e0 b() {
        return this.f23778a;
    }

    public boolean c() {
        return this.f23780c == 2;
    }

    public boolean d() {
        return this.f23780c == 0;
    }

    public boolean e() {
        return this.f23779b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f23778a.equals(rVar.f23778a) && this.f23779b == rVar.f23779b && this.f23780c == rVar.f23780c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f23779b == 2;
    }

    public int hashCode() {
        return ((((this.f23778a.hashCode() ^ 1000003) * 1000003) ^ this.f23779b) * 1000003) ^ this.f23780c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f23778a);
        sb.append(", type=");
        int i7 = this.f23779b;
        sb.append(i7 == 1 ? "required" : i7 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(a(this.f23780c));
        sb.append("}");
        return sb.toString();
    }

    private r(e0 e0Var, int i7, int i8) {
        this.f23778a = (e0) d0.c(e0Var, "Null dependency anInterface.");
        this.f23779b = i7;
        this.f23780c = i8;
    }
}
