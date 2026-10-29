package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final /* synthetic */ class t50 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ t50 f15976a = new t50();

    private /* synthetic */ t50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* synthetic */ void a(Object obj, Map map) {
        at0 at0Var = (at0) obj;
        y50 y50Var = x50.f18542a;
        String str = (String) map.get("u");
        if (str == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.f17090f)).booleanValue() && str.isEmpty()) {
            int i8 = v2.n1.f26802b;
            w2.p.f("URL is empty from httpTrack GMSG.");
        } else {
            dr0 dr0Var = (dr0) at0Var;
            new v2.v0(at0Var.getContext(), ((kt0) at0Var).p().f27051q, str, null, dr0Var.T() != null ? dr0Var.T().f6197x0 : null).b();
        }
    }
}
