package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class fi4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8279a = new HashMap();

    public final fi4 a(hw4 hw4Var, Object obj) {
        List list;
        if (hw4Var.d() != 0 && hw4Var.d() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.f8279a;
        if (map.containsKey(hw4Var)) {
            list = (List) map.get(hw4Var);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(hw4Var, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final hi4 b() {
        return new hi4(this.f8279a, null);
    }
}
