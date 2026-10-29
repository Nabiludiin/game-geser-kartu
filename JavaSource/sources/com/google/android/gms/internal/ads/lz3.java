package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: MyApplication */
abstract class lz3 extends oz3 implements Serializable {

    /* renamed from: t, reason: collision with root package name */
    private final transient Map f11954t;

    /* renamed from: u, reason: collision with root package name */
    private transient int f11955u;

    protected lz3(Map map) {
        rx3.a(map.isEmpty());
        this.f11954t = map;
    }

    @Override // com.google.android.gms.internal.ads.e24
    public final boolean a(Object obj, Object obj2) {
        Map map = this.f11954t;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f11955u++;
            return true;
        }
        Collection l7 = l();
        if (!l7.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f11955u++;
        map.put(obj, l7);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final Collection c() {
        return new nz3(this);
    }

    @Override // com.google.android.gms.internal.ads.oz3
    final Iterator d() {
        return new vy3(this);
    }

    @Override // com.google.android.gms.internal.ads.e24
    public final void e() {
        Map map = this.f11954t;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f11955u = 0;
    }

    @Override // com.google.android.gms.internal.ads.e24
    public final int h() {
        return this.f11955u;
    }

    abstract Collection j(Collection collection);

    abstract Collection k(Object obj, Collection collection);

    abstract Collection l();

    final List m(Object obj, List list, iz3 iz3Var) {
        return list instanceof RandomAccess ? new ez3(this, obj, list, iz3Var) : new kz3(this, obj, list, iz3Var);
    }

    final Set n() {
        Map map = this.f11954t;
        return map instanceof NavigableMap ? new dz3(this, (NavigableMap) map) : map instanceof SortedMap ? new gz3(this, (SortedMap) map) : new bz3(this, map);
    }

    final Map o() {
        Map map = this.f11954t;
        return map instanceof NavigableMap ? new cz3(this, (NavigableMap) map) : map instanceof SortedMap ? new fz3(this, (SortedMap) map) : new yy3(this, map);
    }

    final /* synthetic */ void p(Object obj) {
        Object obj2;
        try {
            obj2 = this.f11954t.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f11955u -= size;
        }
    }

    final /* synthetic */ Map q() {
        return this.f11954t;
    }

    final /* synthetic */ int s() {
        return this.f11955u;
    }

    final /* synthetic */ void u(int i7) {
        this.f11955u = i7;
    }
}
