package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
abstract class z54 extends q54 {
    private List F;

    z54(s04 s04Var, boolean z7) {
        super(s04Var, z7, true);
        List b8 = s04Var.isEmpty() ? Collections.EMPTY_LIST : x14.b(s04Var.size());
        for (int i7 = 0; i7 < s04Var.size(); i7++) {
            b8.add(null);
        }
        this.F = b8;
    }

    @Override // com.google.android.gms.internal.ads.q54
    final void F(int i7) {
        super.F(i7);
        this.F = null;
    }

    @Override // com.google.android.gms.internal.ads.q54
    final void N(int i7, Object obj) {
        List list = this.F;
        if (list != null) {
            list.set(i7, new y54(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.q54
    final void O() {
        List list = this.F;
        if (list != null) {
            l(R(list));
        }
    }

    abstract Object R(List list);
}
