package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final class fx4 implements Map.Entry {

    /* renamed from: q, reason: collision with root package name */
    fx4 f8528q;

    /* renamed from: r, reason: collision with root package name */
    fx4 f8529r;

    /* renamed from: s, reason: collision with root package name */
    fx4 f8530s;

    /* renamed from: t, reason: collision with root package name */
    fx4 f8531t;

    /* renamed from: u, reason: collision with root package name */
    fx4 f8532u;

    /* renamed from: v, reason: collision with root package name */
    final Object f8533v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f8534w;

    /* renamed from: x, reason: collision with root package name */
    Object f8535x;

    /* renamed from: y, reason: collision with root package name */
    int f8536y;

    fx4(boolean z7) {
        this.f8533v = null;
        this.f8534w = z7;
        this.f8532u = this;
        this.f8531t = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f8533v;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f8535x;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8533v;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8535x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f8533v;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f8535x;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f8534w) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f8535x;
        this.f8535x = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8533v);
        String valueOf2 = String.valueOf(this.f8535x);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    fx4(boolean z7, fx4 fx4Var, Object obj, fx4 fx4Var2, fx4 fx4Var3) {
        this.f8528q = fx4Var;
        this.f8533v = obj;
        this.f8534w = z7;
        this.f8536y = 1;
        this.f8531t = fx4Var2;
        this.f8532u = fx4Var3;
        fx4Var3.f8531t = this;
        fx4Var2.f8532u = this;
    }
}
