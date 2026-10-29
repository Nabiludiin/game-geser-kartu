package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
abstract class uy3 extends lz3 implements r14 {
    protected uy3(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.lz3
    final Collection j(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.lz3
    final Collection k(Object obj, Collection collection) {
        return m(obj, (List) collection, null);
    }
}
