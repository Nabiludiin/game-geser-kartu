package x1;

import java.util.List;

/* compiled from: MyApplication */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final List f27271a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f27271a = list;
    }

    @Override // x1.j
    public List c() {
        return this.f27271a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f27271a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f27271a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f27271a + "}";
    }
}
