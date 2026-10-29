package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class g implements r {

    /* renamed from: q, reason: collision with root package name */
    private final boolean f20969q;

    public g(Boolean bool) {
        this.f20969q = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        return Boolean.valueOf(this.f20969q);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        return Boolean.toString(this.f20969q);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f20969q == ((g) obj).f20969q;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        if ("toString".equals(str)) {
            return new v(Boolean.toString(this.f20969q));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f20969q), str));
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        return Double.valueOf(true != this.f20969q ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f20969q).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        return new g(Boolean.valueOf(this.f20969q));
    }

    public final String toString() {
        return String.valueOf(this.f20969q);
    }
}
