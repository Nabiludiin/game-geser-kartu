package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: MyApplication */
final /* synthetic */ class ms5 implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ ms5 f12410q = new ms5();

    private /* synthetic */ ms5() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ls5) Collections.max((List) obj)).compareTo((ls5) Collections.max((List) obj2));
    }
}
