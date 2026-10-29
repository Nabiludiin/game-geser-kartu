package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class r85 extends j85 {
    static {
        o85.a(Collections.EMPTY_MAP);
    }

    /* synthetic */ r85(Map map, p85 p85Var) {
        super(map);
    }

    public static q85 c(int i7) {
        return new q85(i7, null);
    }

    @Override // com.google.android.gms.internal.ads.b95
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        LinkedHashMap c8 = k85.c(a().size());
        for (Map.Entry entry : a().entrySet()) {
            c8.put(entry.getKey(), ((w85) entry.getValue()).b());
        }
        return Collections.unmodifiableMap(c8);
    }
}
