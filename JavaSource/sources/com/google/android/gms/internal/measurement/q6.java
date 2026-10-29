package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class q6 {
    public static r a(Object obj) {
        if (obj == null) {
            return r.f21315g;
        }
        if (obj instanceof String) {
            return new v((String) obj);
        }
        if (obj instanceof Double) {
            return new j((Double) obj);
        }
        if (obj instanceof Long) {
            return new j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            f fVar = new f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                fVar.n(fVar.k(), a(it.next()));
            }
            return fVar;
        }
        o oVar = new o();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            r a8 = a(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                oVar.W0((String) obj2, a8);
            }
        }
        return oVar;
    }

    public static r b(w7 w7Var) {
        if (w7Var == null) {
            return r.f21314f;
        }
        int O = w7Var.O() - 1;
        if (O == 1) {
            return w7Var.H() ? new v(w7Var.I()) : r.f21321m;
        }
        if (O == 2) {
            return w7Var.L() ? new j(Double.valueOf(w7Var.M())) : new j(null);
        }
        if (O == 3) {
            return w7Var.J() ? new g(Boolean.valueOf(w7Var.K())) : new g(null);
        }
        if (O != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List F = w7Var.F();
        ArrayList arrayList = new ArrayList();
        Iterator it = F.iterator();
        while (it.hasNext()) {
            arrayList.add(b((w7) it.next()));
        }
        return new s(w7Var.G(), arrayList);
    }
}
