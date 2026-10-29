package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: MyApplication */
public final class ts implements Comparator {
    public ts(us usVar) {
        Objects.requireNonNull(usVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        is isVar = (is) obj;
        is isVar2 = (is) obj2;
        if (isVar.b() < isVar2.b()) {
            return -1;
        }
        if (isVar.b() > isVar2.b()) {
            return 1;
        }
        if (isVar.a() < isVar2.a()) {
            return -1;
        }
        if (isVar.a() > isVar2.a()) {
            return 1;
        }
        float d8 = (isVar.d() - isVar.b()) * (isVar.c() - isVar.a());
        float d9 = (isVar2.d() - isVar2.b()) * (isVar2.c() - isVar2.a());
        if (d8 > d9) {
            return -1;
        }
        return d8 < d9 ? 1 : 0;
    }
}
