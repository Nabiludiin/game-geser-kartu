package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class ty0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final v2.p1 f16486a;

    public ty0(v2.p1 p1Var) {
        this.f16486a = p1Var;
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        this.f16486a.o(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
