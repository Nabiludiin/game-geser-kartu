package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: MyApplication */
final class h04 extends j04 {
    h04() {
        super(null);
    }

    static final j04 j(int i7) {
        j04 j04Var;
        j04 j04Var2;
        j04 j04Var3;
        if (i7 < 0) {
            j04Var3 = j04.f10282b;
            return j04Var3;
        }
        if (i7 > 0) {
            j04Var2 = j04.f10283c;
            return j04Var2;
        }
        j04Var = j04.f10281a;
        return j04Var;
    }

    @Override // com.google.android.gms.internal.ads.j04
    public final j04 a(Object obj, Object obj2, Comparator comparator) {
        return j(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.j04
    public final j04 b(int i7, int i8) {
        return j(Integer.compare(i7, i8));
    }

    @Override // com.google.android.gms.internal.ads.j04
    public final j04 c(boolean z7, boolean z8) {
        return j(Boolean.compare(z8, z7));
    }

    @Override // com.google.android.gms.internal.ads.j04
    public final j04 d(boolean z7, boolean z8) {
        return j(Boolean.compare(z7, z8));
    }

    @Override // com.google.android.gms.internal.ads.j04
    public final int e() {
        return 0;
    }
}
