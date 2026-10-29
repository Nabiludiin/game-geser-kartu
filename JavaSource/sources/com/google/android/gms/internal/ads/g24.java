package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MyApplication */
final class g24 extends k24 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f8629a;

    g24(Comparator comparator) {
        this.f8629a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.k24
    final Map a() {
        return new TreeMap(this.f8629a);
    }
}
