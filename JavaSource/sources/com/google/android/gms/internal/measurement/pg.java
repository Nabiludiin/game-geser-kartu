package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: MyApplication */
public final class pg {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f21240a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f21241b = new TreeMap();

    private static final int c(o4 o4Var, q qVar, r rVar) {
        r a8 = qVar.a(o4Var, Collections.singletonList(rVar));
        if (a8 instanceof j) {
            return p5.g(a8.h().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i7, q qVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f21241b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f21240a;
        }
        if (treeMap.containsKey(Integer.valueOf(i7))) {
            i7 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i7), qVar);
    }

    public final void b(o4 o4Var, c cVar) {
        u9 u9Var = new u9(cVar);
        TreeMap treeMap = this.f21240a;
        for (Integer num : treeMap.keySet()) {
            b clone = cVar.c().clone();
            int c8 = c(o4Var, (q) treeMap.get(num), u9Var);
            if (c8 == 2 || c8 == -1) {
                cVar.d(clone);
            }
        }
        TreeMap treeMap2 = this.f21241b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(o4Var, (q) treeMap2.get((Integer) it.next()), u9Var);
        }
    }
}
