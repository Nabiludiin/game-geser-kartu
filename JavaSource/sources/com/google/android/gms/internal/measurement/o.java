package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public class o implements r, n {

    /* renamed from: q, reason: collision with root package name */
    final Map f21161q = new HashMap();

    @Override // com.google.android.gms.internal.measurement.n
    public final boolean V0(String str) {
        return this.f21161q.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final void W0(String str, r rVar) {
        if (rVar == null) {
            this.f21161q.remove(str);
        } else {
            this.f21161q.put(str, rVar);
        }
    }

    public final List a() {
        return new ArrayList(this.f21161q.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return m.b(this.f21161q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f21161q.equals(((o) obj).f21161q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public r g(String str, o4 o4Var, List list) {
        return "toString".equals(str) ? new v(toString()) : m.a(this, new v(str), o4Var, list);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final r h0(String str) {
        Map map = this.f21161q;
        return map.containsKey(str) ? (r) map.get(str) : r.f21314f;
    }

    public final int hashCode() {
        return this.f21161q.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        o oVar = new o();
        for (Map.Entry entry : this.f21161q.entrySet()) {
            if (entry.getValue() instanceof n) {
                oVar.f21161q.put((String) entry.getKey(), (r) entry.getValue());
            } else {
                oVar.f21161q.put((String) entry.getKey(), ((r) entry.getValue()).r());
            }
        }
        return oVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        Map map = this.f21161q;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
