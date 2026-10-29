package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: MyApplication */
final /* synthetic */ class ps5 implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ ps5 f14094q = new ps5();

    private /* synthetic */ ps5() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return j04.f().a((wt5) Collections.max(list2, vt5.f17766q), (wt5) Collections.max(list, qt5.f14626q), rt5.f15226q).b(list2.size(), list.size()).a((wt5) Collections.max(list2, st5.f15820q), (wt5) Collections.max(list, tt5.f16363q), ut5.f16986q).e();
    }
}
