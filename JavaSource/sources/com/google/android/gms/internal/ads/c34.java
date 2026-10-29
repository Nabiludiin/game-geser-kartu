package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: MyApplication */
final class c34 extends b34 implements SortedSet {
    c34(SortedSet sortedSet, sx3 sx3Var) {
        super(sortedSet, sx3Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f16515q).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f16515q.iterator();
        it.getClass();
        sx3 sx3Var = this.f16516r;
        sx3Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (sx3Var.d(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new c34(((SortedSet) this.f16515q).headSet(obj), this.f16516r);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f16515q;
        while (true) {
            sx3 sx3Var = this.f16516r;
            Object last = sortedSet.last();
            if (sx3Var.d(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new c34(((SortedSet) this.f16515q).subSet(obj, obj2), this.f16516r);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new c34(((SortedSet) this.f16515q).tailSet(obj), this.f16516r);
    }
}
