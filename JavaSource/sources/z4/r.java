package z4;

import java.util.Comparator;

/* compiled from: MyApplication */
public abstract class r implements Comparator {
    protected r() {
    }

    public static r a(Comparator comparator) {
        return comparator instanceof r ? (r) comparator : new f(comparator);
    }

    public r b(y4.c cVar) {
        return new c(cVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
