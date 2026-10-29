package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class vp0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f17702a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f17703b;

    vp0() {
    }

    final long a() {
        Iterator it = this.f17702a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((nx3) it.next()).i().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f17703b = Math.max(this.f17703b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f17703b;
    }

    final void b(nx3 nx3Var) {
        this.f17702a.add(nx3Var);
    }
}
