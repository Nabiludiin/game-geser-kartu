package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: MyApplication */
final class ks implements Comparator {
    ks(ms msVar) {
        Objects.requireNonNull(msVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qs qsVar = (qs) obj;
        qs qsVar2 = (qs) obj2;
        int i7 = qsVar.f14599c - qsVar2.f14599c;
        return i7 != 0 ? i7 : Long.compare(qsVar.f14597a, qsVar2.f14597a);
    }
}
