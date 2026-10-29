package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class t44 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15970a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f15971b;

    public final synchronized Map a() {
        try {
            if (this.f15971b == null) {
                this.f15971b = Collections.unmodifiableMap(new HashMap(this.f15970a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15971b;
    }
}
