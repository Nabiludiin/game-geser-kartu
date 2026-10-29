package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class a60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final c60 f4767a;

    public a60(c60 c60Var) {
        this.f4767a = c60Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f8 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f8 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Fail to parse float", e8);
        }
        c60 c60Var = this.f4767a;
        c60Var.a(equals);
        c60Var.b(equals2, f8);
        mr0Var.p1(equals);
    }
}
