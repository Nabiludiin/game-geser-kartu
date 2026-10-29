package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class h implements r {

    /* renamed from: q, reason: collision with root package name */
    private final r f20985q;

    /* renamed from: r, reason: collision with root package name */
    private final String f20986r;

    public h(String str) {
        this.f20985q = r.f21314f;
        this.f20986r = str;
    }

    public final r a() {
        return this.f20985q;
    }

    public final String b() {
        return this.f20986r;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20986r.equals(hVar.f20986r) && this.f20985q.equals(hVar.f20985q);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return (this.f20986r.hashCode() * 31) + this.f20985q.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        return new h(this.f20986r, this.f20985q.r());
    }

    public h(String str, r rVar) {
        this.f20985q = rVar;
        this.f20986r = str;
    }
}
