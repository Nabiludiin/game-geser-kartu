package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class s25 extends p25 implements Set {

    /* renamed from: r, reason: collision with root package name */
    private final Set f15442r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s25(Set set) {
        super(set);
        q6.i.e(set, "delegate");
        this.f15442r = set;
    }

    @Override // com.google.android.gms.internal.ads.p25, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p25, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r25(this.f15442r.iterator());
    }
}
