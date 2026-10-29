package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
public final class ck2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6482a;

    ck2(Set set) {
        this.f6482a = set;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6482a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return p64.a(new bk2(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 8;
    }
}
