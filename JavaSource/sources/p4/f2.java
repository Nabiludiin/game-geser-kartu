package p4;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
final class f2 extends j2 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f25360q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25361r;

    f2(Object obj) {
        this.f25360q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f25361r;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f25361r) {
            throw new NoSuchElementException();
        }
        this.f25361r = true;
        return this.f25360q;
    }
}
