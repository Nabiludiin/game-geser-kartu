package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class nc implements Map.Entry, Comparable {

    /* renamed from: q, reason: collision with root package name */
    private final Comparable f21155q;

    /* renamed from: r, reason: collision with root package name */
    private Object f21156r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ qc f21157s;

    nc(qc qcVar, Comparable comparable, Object obj) {
        Objects.requireNonNull(qcVar);
        this.f21157s = qcVar;
        this.f21155q = comparable;
        this.f21156r = obj;
    }

    private static final boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f21155q;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f21155q.compareTo(((nc) obj).f21155q);
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
        return d(this.f21155q, entry.getKey()) && d(this.f21156r, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f21155q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f21156r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f21155q;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f21156r;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f21157s.h();
        Object obj2 = this.f21156r;
        this.f21156r = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21155q);
        String valueOf2 = String.valueOf(this.f21156r);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
