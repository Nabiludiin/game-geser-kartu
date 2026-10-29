package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class bp0 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final ap0 f5885a;

    public bp0(ap0 ap0Var) {
        this.f5885a = ap0Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.f5885a.b(str2);
            } else {
                int i8 = v2.n1.f26802b;
                w2.p.f("src missing from video GMSG.");
            }
        }
    }
}
