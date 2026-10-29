package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: MyApplication */
public abstract class z04 implements Map, Serializable {

    /* renamed from: q, reason: collision with root package name */
    private transient g14 f19936q;

    /* renamed from: r, reason: collision with root package name */
    private transient g14 f19937r;

    /* renamed from: s, reason: collision with root package name */
    private transient s04 f19938s;

    z04() {
    }

    public static z04 a() {
        return v24.f17365w;
    }

    public static z04 b(Object obj, Object obj2) {
        sz3.a("dialog_not_shown_reason", obj2);
        return v24.k(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static z04 c(Map map) {
        if ((map instanceof z04) && !(map instanceof SortedMap)) {
            z04 z04Var = (z04) map;
            z04Var.j();
            return z04Var;
        }
        Set entrySet = map.entrySet();
        y04 y04Var = new y04(kc0.a(entrySet) ? entrySet.size() : 4);
        y04Var.b(entrySet);
        return y04Var.c();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final g14 entrySet() {
        g14 g14Var = this.f19936q;
        if (g14Var != null) {
            return g14Var;
        }
        g14 e8 = e();
        this.f19936q = e8;
        return e8;
    }

    abstract g14 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return d24.b(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final g14 keySet() {
        g14 g14Var = this.f19937r;
        if (g14Var != null) {
            return g14Var;
        }
        g14 g8 = g();
        this.f19937r = g8;
        return g8;
    }

    abstract g14 g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final s04 values() {
        s04 s04Var = this.f19938s;
        if (s04Var != null) {
            return s04Var;
        }
        s04 i7 = i();
        this.f19938s = i7;
        return i7;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return f34.c(entrySet());
    }

    abstract s04 i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    abstract boolean j();

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        sz3.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z7 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
