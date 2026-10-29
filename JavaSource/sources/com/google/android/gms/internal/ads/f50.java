package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final class f50 implements y50 {
    f50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        if (mr0Var.x0() != null) {
            mr0Var.x0().a();
        }
        u2.a0 O = mr0Var.O();
        if (O != null) {
            O.b();
            return;
        }
        u2.a0 v02 = mr0Var.v0();
        if (v02 != null) {
            v02.b();
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
