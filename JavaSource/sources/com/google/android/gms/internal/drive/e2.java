package com.google.android.gms.internal.drive;

import java.util.Map;

final class e2 implements Comparable, Map.Entry {

    /* renamed from: q, reason: collision with root package name */
    private final Comparable f20561q;

    /* renamed from: r, reason: collision with root package name */
    private Object f20562r;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ x1 f20563s;

    e2(x1 x1Var, Map.Entry entry) {
        this(x1Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((e2) obj).getKey());
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
        return c(this.f20561q, entry.getKey()) && c(this.f20562r, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f20561q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20562r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f20561q;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f20562r;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f20563s.p();
        Object obj2 = this.f20562r;
        this.f20562r = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20561q);
        String valueOf2 = String.valueOf(this.f20562r);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    e2(x1 x1Var, Comparable comparable, Object obj) {
        this.f20563s = x1Var;
        this.f20561q = comparable;
        this.f20562r = obj;
    }
}
