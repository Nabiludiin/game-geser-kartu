package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public abstract class h13 {
    public static y50 a(final v82 v82Var, final x73 x73Var, final d01 d01Var, final pi1 pi1Var) {
        return new y50() { // from class: com.google.android.gms.internal.ads.g13
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mr0 mr0Var = (mr0) obj;
                x50.c(map, pi1.this);
                String str = (String) map.get("u");
                if (str == null) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("URL missing from click GMSG.");
                } else {
                    v82 v82Var2 = v82Var;
                    x73 x73Var2 = x73Var;
                    p64.r(x50.a(mr0Var, str), new e13(mr0Var, d01Var, x73Var2, v82Var2), cm0.f6500a);
                }
            }
        };
    }

    public static y50 b(final v82 v82Var, final x73 x73Var) {
        return new y50() { // from class: com.google.android.gms.internal.ads.f13
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                dr0 dr0Var = (dr0) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("URL missing from httpTrack GMSG.");
                    return;
                }
                c03 T = dr0Var.T();
                if (T != null && !T.f6167i0) {
                    x73.this.b(str, T.f6197x0, null, null);
                    return;
                }
                f03 t02 = ((vs0) dr0Var).t0();
                if (t02 != null) {
                    v82Var.h(new z82(r2.t.o().a(), t02.f7926b, str, 2));
                } else {
                    r2.t.l().i(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
