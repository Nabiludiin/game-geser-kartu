package p4;

import java.util.Iterator;

/* compiled from: MyApplication */
final class i2 extends e2 {

    /* renamed from: s, reason: collision with root package name */
    final transient Object f25407s;

    i2(Object obj) {
        obj.getClass();
        this.f25407s = obj;
    }

    @Override // p4.a2
    final int c(Object[] objArr, int i7) {
        objArr[0] = this.f25407s;
        return 1;
    }

    @Override // p4.a2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f25407s.equals(obj);
    }

    @Override // p4.e2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25407s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new f2(this.f25407s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f25407s.toString() + "]";
    }
}
