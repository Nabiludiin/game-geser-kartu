package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class k implements r, n {

    /* renamed from: q, reason: collision with root package name */
    protected final String f21066q;

    /* renamed from: r, reason: collision with root package name */
    protected final Map f21067r = new HashMap();

    public k(String str) {
        this.f21066q = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final boolean V0(String str) {
        return this.f21067r.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final void W0(String str, r rVar) {
        if (rVar == null) {
            this.f21067r.remove(str);
        } else {
            this.f21067r.put(str, rVar);
        }
    }

    public abstract r a(o4 o4Var, List list);

    public final String b() {
        return this.f21066q;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        return this.f21066q;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return m.b(this.f21067r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        String str = this.f21066q;
        if (str != null) {
            return str.equals(kVar.f21066q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        return "toString".equals(str) ? new v(this.f21066q) : m.a(this, new v(str), o4Var, list);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final r h0(String str) {
        Map map = this.f21067r;
        return map.containsKey(str) ? (r) map.get(str) : r.f21314f;
    }

    public final int hashCode() {
        String str = this.f21066q;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r r() {
        return this;
    }
}
