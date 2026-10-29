package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: MyApplication */
public abstract class f34 {
    public static e34 a(Set set, Set set2) {
        rx3.k(set, "set1");
        rx3.k(set2, "set2");
        return new a34(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set b(Set set, sx3 sx3Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (!(sortedSet instanceof b34)) {
                return new c34(sortedSet, sx3Var);
            }
            b34 b34Var = (b34) sortedSet;
            return new c34((SortedSet) b34Var.f16515q, vx3.b(b34Var.f16516r, sx3Var));
        }
        if (!(set instanceof b34)) {
            set.getClass();
            return new b34(set, sx3Var);
        }
        b34 b34Var2 = (b34) set;
        return new b34((Set) b34Var2.f16515q, vx3.b(b34Var2.f16516r, sx3Var));
    }

    static int c(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 += next != null ? next.hashCode() : 0;
        }
        return i7;
    }

    static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean e(Set set, Iterator it) {
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= set.remove(it.next());
        }
        return z7;
    }

    static boolean f(Set set, Collection collection) {
        collection.getClass();
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }
}
