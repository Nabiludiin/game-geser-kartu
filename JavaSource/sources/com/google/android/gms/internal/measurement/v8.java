package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* compiled from: MyApplication */
public final class v8 extends k {

    /* renamed from: s, reason: collision with root package name */
    private final c f21411s;

    public v8(c cVar) {
        super("internal.eventLogger");
        this.f21411s = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        p5.a(this.f21066q, 3, list);
        String d8 = o4Var.a((r) list.get(0)).d();
        long i7 = (long) p5.i(o4Var.a((r) list.get(1)).h().doubleValue());
        r a8 = o4Var.a((r) list.get(2));
        this.f21411s.e(d8, i7, a8 instanceof o ? p5.k((o) a8) : new HashMap());
        return r.f21314f;
    }
}
