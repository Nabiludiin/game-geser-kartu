package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
abstract class oz3 implements e24 {

    /* renamed from: q, reason: collision with root package name */
    private transient Set f13560q;

    /* renamed from: r, reason: collision with root package name */
    private transient Collection f13561r;

    /* renamed from: s, reason: collision with root package name */
    private transient Map f13562s;

    oz3() {
    }

    abstract Set b();

    abstract Collection c();

    Iterator d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e24) {
            return t().equals(((e24) obj).t());
        }
        return false;
    }

    abstract Map f();

    public boolean g(Object obj) {
        Iterator it = t().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return t().hashCode();
    }

    public final Set i() {
        Set set = this.f13560q;
        if (set != null) {
            return set;
        }
        Set b8 = b();
        this.f13560q = b8;
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.e24
    public Collection r() {
        Collection collection = this.f13561r;
        if (collection != null) {
            return collection;
        }
        Collection c8 = c();
        this.f13561r = c8;
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.e24
    public Map t() {
        Map map = this.f13562s;
        if (map != null) {
            return map;
        }
        Map f8 = f();
        this.f13562s = f8;
        return f8;
    }

    public final String toString() {
        return t().toString();
    }
}
