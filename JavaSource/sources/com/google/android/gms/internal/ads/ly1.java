package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ly1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final gy1 f11940a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f11941b;

    private ly1(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        this.f11940a = gy1Var;
        this.f11941b = w85Var;
    }

    public static ly1 a(gy1 gy1Var, w85 w85Var, w85 w85Var2) {
        return new ly1(gy1Var, w85Var, w85Var2);
    }

    public static Set c(gy1 gy1Var, ry1 ry1Var, Executor executor) {
        Set d8 = gy1.d(ry1Var, executor);
        v85.b(d8);
        return d8;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return c(this.f11940a, (ry1) this.f11941b.b(), z33.c());
    }
}
