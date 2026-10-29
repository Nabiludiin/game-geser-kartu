package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract /* synthetic */ class m {
    public static r a(n nVar, r rVar, o4 o4Var, List list) {
        if (nVar.V0(rVar.d())) {
            r h02 = nVar.h0(rVar.d());
            if (h02 instanceof k) {
                return ((k) h02).a(o4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", rVar.d()));
        }
        if (!"hasOwnProperty".equals(rVar.d())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", rVar.d()));
        }
        p5.a("hasOwnProperty", 1, list);
        return nVar.V0(o4Var.a((r) list.get(0)).d()) ? r.f21319k : r.f21320l;
    }

    public static Iterator b(Map map) {
        return new l(map.keySet().iterator());
    }
}
