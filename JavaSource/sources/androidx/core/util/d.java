package androidx.core.util;

/* compiled from: MyApplication */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1815a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1816b;

    public d(Object obj, Object obj2) {
        this.f1815a = obj;
        this.f1816b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f1815a, this.f1815a) && c.a(dVar.f1816b, this.f1816b);
    }

    public int hashCode() {
        Object obj = this.f1815a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1816b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f1815a + " " + this.f1816b + "}";
    }
}
