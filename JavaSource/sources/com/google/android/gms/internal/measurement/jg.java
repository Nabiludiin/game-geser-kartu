package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class jg extends k {

    /* renamed from: s, reason: collision with root package name */
    private final of f21065s;

    public jg(of ofVar) {
        super("internal.logger");
        this.f21065s = ofVar;
        this.f21067r.put("log", new ig(this, false, true));
        this.f21067r.put("silent", new ld(this, "silent"));
        ((k) this.f21067r.get("silent")).W0("log", new ig(this, true, true));
        this.f21067r.put("unmonitored", new me(this, "unmonitored"));
        ((k) this.f21067r.get("unmonitored")).W0("log", new ig(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        return r.f21314f;
    }

    final /* synthetic */ of f() {
        return this.f21065s;
    }
}
