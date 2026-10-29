package e6;

import java.io.Serializable;

/* compiled from: MyApplication */
public final class l implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    private final Object f23245q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f23246r;

    public l(Object obj, Object obj2) {
        this.f23245q = obj;
        this.f23246r = obj2;
    }

    public final Object a() {
        return this.f23245q;
    }

    public final Object b() {
        return this.f23246r;
    }

    public final Object c() {
        return this.f23245q;
    }

    public final Object d() {
        return this.f23246r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return q6.i.a(this.f23245q, lVar.f23245q) && q6.i.a(this.f23246r, lVar.f23246r);
    }

    public int hashCode() {
        Object obj = this.f23245q;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f23246r;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f23245q + ", " + this.f23246r + ')';
    }
}
