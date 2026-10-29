package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class r15 implements Map.Entry, Comparable {

    /* renamed from: q, reason: collision with root package name */
    private final Comparable f14705q;

    /* renamed from: r, reason: collision with root package name */
    private Object f14706r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ u15 f14707s;

    r15(u15 u15Var, Comparable comparable, Object obj) {
        Objects.requireNonNull(u15Var);
        this.f14707s = u15Var;
        this.f14705q = comparable;
        this.f14706r = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f14705q;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f14705q.compareTo(((r15) obj).f14705q);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return d(this.f14705q, entry.getKey()) && d(this.f14706r, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f14705q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14706r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14705q;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14706r;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f14707s.h();
        Object obj2 = this.f14706r;
        this.f14706r = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14705q);
        String valueOf2 = String.valueOf(this.f14706r);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
