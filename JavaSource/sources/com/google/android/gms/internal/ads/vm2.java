package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class vm2 implements n85 {
    public static vm2 a() {
        return um2.f16829a;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        Object arrayList = new ArrayList();
        ly lyVar = uy.Mc;
        if (!((String) s2.b0.c().d(lyVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) s2.b0.c().d(lyVar)).split(","));
        }
        v85.b(arrayList);
        return arrayList;
    }
}
