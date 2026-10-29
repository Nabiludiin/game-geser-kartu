package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: MyApplication */
final /* synthetic */ class us5 implements Comparator {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ us5 f16969q = new us5();

    private /* synthetic */ us5() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        int i7 = xt5.f19029l;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }
}
