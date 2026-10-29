package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    final Map f21459a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final m0 f21460b = new m0();

    public z() {
        a(new x());
        a(new a0());
        a(new b0());
        a(new f0());
        a(new k0());
        a(new l0());
        a(new n0());
    }

    final void a(y yVar) {
        Iterator it = yVar.f21443a.iterator();
        while (it.hasNext()) {
            this.f21459a.put(((o0) it.next()).d().toString(), yVar);
        }
    }

    public final r b(o4 o4Var, r rVar) {
        p5.l(o4Var);
        if (!(rVar instanceof s)) {
            return rVar;
        }
        s sVar = (s) rVar;
        ArrayList b8 = sVar.b();
        String a8 = sVar.a();
        Map map = this.f21459a;
        return (map.containsKey(a8) ? (y) map.get(a8) : this.f21460b).a(a8, o4Var, b8);
    }
}
