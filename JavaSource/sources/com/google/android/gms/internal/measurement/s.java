package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class s implements r {

    /* renamed from: q, reason: collision with root package name */
    private final String f21367q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f21368r;

    public s(String str, List list) {
        this.f21367q = str;
        ArrayList arrayList = new ArrayList();
        this.f21368r = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f21367q;
    }

    public final ArrayList b() {
        return this.f21368r;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        String str = this.f21367q;
        if (str == null ? sVar.f21367q == null : str.equals(sVar.f21367q)) {
            return this.f21368r.equals(sVar.f21368r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.f21367q;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f21368r.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        return this;
    }
}
