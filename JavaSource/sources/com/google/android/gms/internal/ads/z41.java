package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class z41 implements zd2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f20006a;

    public z41(List list) {
        this.f20006a = list;
    }

    public static ka2 a(sc2 sc2Var) {
        return new la2(sc2Var, y41.f19367a);
    }

    public static ka2 b(ka2 ka2Var) {
        return new la2(ka2Var, x41.f18530a);
    }

    @Override // com.google.android.gms.internal.ads.zd2
    public final void n() {
        Iterator it = this.f20006a.iterator();
        while (it.hasNext()) {
            p64.r((a5.d) it.next(), new w41(this), g74.a());
        }
    }

    public z41(r41 r41Var) {
        this.f20006a = Collections.singletonList(p64.a(r41Var));
    }
}
