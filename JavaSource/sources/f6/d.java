package f6;

import java.util.AbstractList;
import java.util.List;

/* compiled from: MyApplication */
public abstract class d extends AbstractList implements List {
    protected d() {
    }

    public abstract int c();

    public abstract Object e(int i7);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i7) {
        return e(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return c();
    }
}
