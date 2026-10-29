package p4;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
abstract class x1 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    private final int f25534q;

    /* renamed from: r, reason: collision with root package name */
    private int f25535r;

    protected x1(int i7, int i8) {
        v1.b(i8, i7, "index");
        this.f25534q = i7;
        this.f25535r = i8;
    }

    protected abstract Object b(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f25535r < this.f25534q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25535r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f25535r;
        this.f25535r = i7 + 1;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25535r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f25535r - 1;
        this.f25535r = i7;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25535r - 1;
    }
}
