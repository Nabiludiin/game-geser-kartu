package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class hg4 {

    /* renamed from: a, reason: collision with root package name */
    final Map f9500a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final Map f9501b = new HashMap();

    /* synthetic */ hg4(byte[] bArr) {
    }

    public final hg4 a(Enum r22, Object obj) {
        this.f9500a.put(r22, obj);
        this.f9501b.put(obj, r22);
        return this;
    }

    public final ig4 b() {
        return new ig4(Collections.unmodifiableMap(this.f9500a), Collections.unmodifiableMap(this.f9501b), null);
    }
}
