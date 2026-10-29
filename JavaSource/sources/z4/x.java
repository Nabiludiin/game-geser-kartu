package z4;

/* compiled from: MyApplication */
final class x extends k {

    /* renamed from: s, reason: collision with root package name */
    final transient Object f27907s;

    x(Object obj) {
        this.f27907s = y4.h.h(obj);
    }

    @Override // z4.h
    int c(Object[] objArr, int i7) {
        objArr[i7] = this.f27907s;
        return i7 + 1;
    }

    @Override // z4.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27907s.equals(obj);
    }

    @Override // z4.k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27907s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n */
    public z iterator() {
        return l.b(this.f27907s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f27907s.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
