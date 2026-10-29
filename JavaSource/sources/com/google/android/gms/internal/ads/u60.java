package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class u60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final b12 f16606a;

    public u60(b12 b12Var) {
        p3.o.n(b12Var, "The Inspector Manager must not be null");
        this.f16606a = b12Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j7 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j7 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f16606a.j((String) map.get("extras"), j7);
    }
}
