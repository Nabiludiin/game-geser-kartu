package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: MyApplication */
public abstract class p24 implements Comparator {
    protected p24() {
    }

    public static p24 b() {
        return n24.f12554q;
    }

    public static p24 c(Comparator comparator) {
        return new f04(comparator);
    }

    public p24 a() {
        return new y24(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final p24 d(hx3 hx3Var) {
        return new rz3(hx3Var, this);
    }
}
