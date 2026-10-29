package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
final class x54 extends z54 {
    x54(s04 s04Var, boolean z7) {
        super(s04Var, z7);
        M();
    }

    @Override // com.google.android.gms.internal.ads.z54
    public final /* bridge */ /* synthetic */ Object R(List list) {
        ArrayList b8 = x14.b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y54 y54Var = (y54) it.next();
            b8.add(y54Var != null ? y54Var.f19388a : null);
        }
        return Collections.unmodifiableList(b8);
    }
}
