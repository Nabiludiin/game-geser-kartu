package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class v80 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final y50 f17430a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d90 f17431b;

    public v80(d90 d90Var, y50 y50Var) {
        Objects.requireNonNull(d90Var);
        this.f17431b = d90Var;
        this.f17430a = y50Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        this.f17430a.a(this.f17431b, map);
    }

    final /* synthetic */ y50 b() {
        return this.f17430a;
    }
}
