package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
final class lw3 extends l04 {

    /* renamed from: q, reason: collision with root package name */
    private final Map f11915q;

    public lw3(Map map) {
        this.f11915q = map;
    }

    @Override // com.google.android.gms.internal.ads.l04, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.android.gms.internal.ads.m04
    protected final /* synthetic */ Object d() {
        return this.f11915q;
    }

    @Override // com.google.android.gms.internal.ads.l04, java.util.Map
    public final Set entrySet() {
        return f34.b(this.f11915q.entrySet(), ju3.f10786q);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.m(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f11915q.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.n();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f11915q.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.l04
    protected final Map k() {
        return this.f11915q;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return f34.b(this.f11915q.keySet(), kv3.f11273q);
    }

    @Override // com.google.android.gms.internal.ads.l04, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
