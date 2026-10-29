package z4;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: MyApplication */
final class f extends r implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    final Comparator f27853q;

    f(Comparator comparator) {
        this.f27853q = (Comparator) y4.h.h(comparator);
    }

    @Override // z4.r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27853q.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f27853q.equals(((f) obj).f27853q);
        }
        return false;
    }

    public int hashCode() {
        return this.f27853q.hashCode();
    }

    public String toString() {
        return this.f27853q.toString();
    }
}
