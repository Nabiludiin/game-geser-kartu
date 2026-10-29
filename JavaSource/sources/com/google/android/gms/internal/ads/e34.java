package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class e34 extends AbstractSet {
    /* synthetic */ e34(byte[] bArr) {
    }

    static int h(Set set) {
        return set instanceof e34 ? ((e34) set).g() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract j34 c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    abstract int e();

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int h8;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (h8 = h((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof e34) {
            ((e34) set).e();
            size = 0;
        } else {
            size = set.size();
        }
        if (g() < size) {
            return false;
        }
        j34 c8 = c();
        int i7 = 0;
        while (c8.hasNext()) {
            if (!set.contains(c8.next())) {
                return false;
            }
            i7++;
        }
        if (i7 == h8) {
            return true;
        }
        if (i7 < size) {
            return false;
        }
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            it.next();
            i8++;
            if (i8 > i7) {
                return false;
            }
        }
        return true;
    }

    abstract int g();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
