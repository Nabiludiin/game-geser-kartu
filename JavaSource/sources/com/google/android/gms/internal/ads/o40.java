package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class o40 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final p40 f13184a;

    public o40(p40 p40Var) {
        this.f13184a = p40Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str != null) {
            this.f13184a.Y0(str, (String) map.get("info"));
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("App event with no name parameter.");
        }
    }
}
