package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class cq {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6560a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                Map map = this.f6560a;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f6560a.get(str);
    }
}
