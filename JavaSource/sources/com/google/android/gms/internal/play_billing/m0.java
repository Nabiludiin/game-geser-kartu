package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class m0 implements Map, Serializable {

    /* renamed from: q, reason: collision with root package name */
    private transient n0 f21671q;

    /* renamed from: r, reason: collision with root package name */
    private transient n0 f21672r;

    /* renamed from: s, reason: collision with root package name */
    private transient g0 f21673s;

    m0() {
    }

    public static m0 c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        e0.a("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        e0.a("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        e0.a("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return w0.g(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract g0 a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g0 values() {
        g0 g0Var = this.f21673s;
        if (g0Var != null) {
            return g0Var;
        }
        g0 a8 = a();
        this.f21673s = a8;
        return a8;
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

    abstract n0 d();

    abstract n0 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final n0 entrySet() {
        n0 n0Var = this.f21671q;
        if (n0Var != null) {
            return n0Var;
        }
        n0 d8 = d();
        this.f21671q = d8;
        return d8;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return x0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        n0 n0Var = this.f21672r;
        if (n0Var != null) {
            return n0Var;
        }
        n0 e8 = e();
        this.f21672r = e8;
        return e8;
    }

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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
