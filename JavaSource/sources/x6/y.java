package x6;

/* compiled from: MyApplication */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27460a;

    /* renamed from: b, reason: collision with root package name */
    public final p6.l f27461b;

    public y(Object obj, p6.l lVar) {
        this.f27460a = obj;
        this.f27461b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return q6.i.a(this.f27460a, yVar.f27460a) && q6.i.a(this.f27461b, yVar.f27461b);
    }

    public int hashCode() {
        Object obj = this.f27460a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f27461b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f27460a + ", onCancellation=" + this.f27461b + ')';
    }
}
