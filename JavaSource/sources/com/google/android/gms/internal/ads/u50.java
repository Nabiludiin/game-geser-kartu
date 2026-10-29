package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final /* synthetic */ class u50 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ u50 f16584a = new u50();

    private /* synthetic */ u50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* synthetic */ void a(Object obj, Map map) {
        jt0 jt0Var = (jt0) obj;
        y50 y50Var = x50.f18542a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            fn P = jt0Var.P();
            if (P != null) {
                P.b().e(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Could not parse touch parameters from gmsg.");
        }
    }
}
