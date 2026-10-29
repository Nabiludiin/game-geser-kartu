package z4;

import java.util.Iterator;

/* compiled from: MyApplication */
public abstract class z implements Iterator {
    protected z() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
