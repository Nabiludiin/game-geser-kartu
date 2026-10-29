package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: MyApplication */
public final class t8 implements u3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16029a;

    /* renamed from: b, reason: collision with root package name */
    public final j44 f16030b;

    public t8(int i7, int[] iArr) {
        this.f16029a = i7;
        this.f16030b = iArr != null ? j44.b(iArr) : j44.a();
    }

    public final String toString() {
        j44 j44Var = this.f16030b;
        ArrayList arrayList = new ArrayList(j44Var.c());
        for (int i7 = 0; i7 < j44Var.c(); i7++) {
            arrayList.add(hi2.U(j44Var.d(i7)));
        }
        String U = hi2.U(this.f16029a);
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(U.length() + 37 + obj.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(U);
        sb.append(", compatible=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
