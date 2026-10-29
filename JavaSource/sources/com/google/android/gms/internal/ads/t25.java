package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class t25 implements Map.Entry {

    /* renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Map.Entry f15955q;

    public t25(Map.Entry entry) {
        q6.i.e(entry, "delegate");
        this.f15955q = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15955q.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15955q.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
