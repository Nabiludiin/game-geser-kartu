package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class vy0 implements ry0 {

    /* renamed from: a, reason: collision with root package name */
    private final v2.p1 f17918a;

    public vy0(v2.p1 p1Var) {
        this.f17918a = p1Var;
    }

    @Override // com.google.android.gms.internal.ads.ry0
    public final void a(Map map) {
        this.f17918a.e(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
