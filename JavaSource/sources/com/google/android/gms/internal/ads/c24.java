package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: MyApplication */
abstract class c24 extends AbstractMap {

    /* renamed from: q, reason: collision with root package name */
    private transient Set f6232q;

    /* renamed from: r, reason: collision with root package name */
    private transient Collection f6233r;

    c24() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f6232q;
        if (set != null) {
            return set;
        }
        Set a8 = a();
        this.f6232q = a8;
        return a8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f6233r;
        if (collection != null) {
            return collection;
        }
        b24 b24Var = new b24(this);
        this.f6233r = b24Var;
        return b24Var;
    }
}
