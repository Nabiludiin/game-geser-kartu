package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class d70 {

    /* renamed from: b, reason: collision with root package name */
    public static final d70 f6956b = new d70(w04.m());

    /* renamed from: a, reason: collision with root package name */
    private final w04 f6957a;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
    }

    public d70(List list) {
        this.f6957a = w04.u(list);
    }

    public final w04 a() {
        return this.f6957a;
    }

    public final boolean b(int i7) {
        int i8 = 0;
        while (true) {
            w04 w04Var = this.f6957a;
            if (i8 >= w04Var.size()) {
                return false;
            }
            b60 b60Var = (b60) w04Var.get(i8);
            if (b60Var.b() && b60Var.d() == i7) {
                return true;
            }
            i8++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d70.class != obj.getClass()) {
            return false;
        }
        return this.f6957a.equals(((d70) obj).f6957a);
    }

    public final int hashCode() {
        return this.f6957a.hashCode();
    }
}
