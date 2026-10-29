package z4;

import java.util.NoSuchElementException;

/* compiled from: MyApplication */
abstract class a extends a0 {

    /* renamed from: q, reason: collision with root package name */
    private final int f27841q;

    /* renamed from: r, reason: collision with root package name */
    private int f27842r;

    protected a(int i7, int i8) {
        y4.h.j(i8, i7);
        this.f27841q = i7;
        this.f27842r = i8;
    }

    protected abstract Object b(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27842r < this.f27841q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27842r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f27842r;
        this.f27842r = i7 + 1;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27842r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f27842r - 1;
        this.f27842r = i7;
        return b(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27842r - 1;
    }
}
