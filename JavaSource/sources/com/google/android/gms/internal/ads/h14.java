package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class h14 extends c14 {
    public final h14 b(Object obj, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = asList.iterator();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            boolean z7 = true;
            while (it.hasNext()) {
                if (!z7) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z7 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = asList.iterator();
        if (it2.hasNext()) {
            p04 p04Var = (p04) a().get(obj);
            if (p04Var == null) {
                p04Var = g14.w(asList instanceof Set ? Math.max(4, ((Set) asList).size()) : 4);
                a().put(obj, p04Var);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                sz3.a(obj, next);
                p04Var.a(next);
            }
        }
        return this;
    }

    public final j14 c() {
        Map map = this.f6220a;
        if (map == null) {
            return k04.f10840x;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return k04.f10840x;
        }
        y04 y04Var = new y04(entrySet.size());
        int i7 = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            g14 s7 = g14.s(((f14) entry.getValue()).j());
            if (!s7.isEmpty()) {
                y04Var.a(key, s7);
                i7 += s7.size();
            }
        }
        return new j14(y04Var.c(), i7, null);
    }
}
