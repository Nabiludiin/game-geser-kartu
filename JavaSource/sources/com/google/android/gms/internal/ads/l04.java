package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class l04 extends m04 implements Map {
    protected l04() {
    }

    @Override // java.util.Map
    public final void clear() {
        k().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return k().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    protected abstract Map k();

    protected final boolean l(Object obj) {
        y14 y14Var = new y14(entrySet().iterator());
        if (obj == null) {
            while (y14Var.hasNext()) {
                if (y14Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (y14Var.hasNext()) {
            if (obj.equals(y14Var.next())) {
                return true;
            }
        }
        return false;
    }

    protected final boolean m(Object obj) {
        return d24.b(this, obj);
    }

    protected final int n() {
        return f34.c(entrySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return k().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        k().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return k().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return k().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return k().values();
    }
}
