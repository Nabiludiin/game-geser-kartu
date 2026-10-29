package w1;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f27046a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f27046a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f27046a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f27046a.equals(((b) obj).f27046a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27046a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f27046a + "\"}";
    }
}
