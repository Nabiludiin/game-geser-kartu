package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class mg extends k {

    /* renamed from: s, reason: collision with root package name */
    private final r7 f21141s;

    /* renamed from: t, reason: collision with root package name */
    final Map f21142t;

    public mg(r7 r7Var) {
        super("require");
        this.f21142t = new HashMap();
        this.f21141s = r7Var;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        r rVar;
        p5.a("require", 1, list);
        String d8 = o4Var.a((r) list.get(0)).d();
        Map map = this.f21142t;
        if (map.containsKey(d8)) {
            return (r) map.get(d8);
        }
        Map map2 = this.f21141s.f21327a;
        if (map2.containsKey(d8)) {
            try {
                rVar = (r) ((Callable) map2.get(d8)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(d8)));
            }
        } else {
            rVar = r.f21314f;
        }
        if (rVar instanceof k) {
            this.f21142t.put(d8, (k) rVar);
        }
        return rVar;
    }
}
