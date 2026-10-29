package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class lg extends k {

    /* renamed from: s, reason: collision with root package name */
    private final pg f21122s;

    public lg(pg pgVar) {
        super("internal.registerCallback");
        this.f21122s = pgVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        p5.a(this.f21066q, 3, list);
        String d8 = o4Var.a((r) list.get(0)).d();
        r a8 = o4Var.a((r) list.get(1));
        if (!(a8 instanceof q)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        r a9 = o4Var.a((r) list.get(2));
        if (!(a9 instanceof o)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        o oVar = (o) a9;
        if (!oVar.V0("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f21122s.a(d8, oVar.V0("priority") ? p5.g(oVar.h0("priority").h().doubleValue()) : 1000, (q) a8, oVar.h0("type").d());
        return r.f21314f;
    }
}
