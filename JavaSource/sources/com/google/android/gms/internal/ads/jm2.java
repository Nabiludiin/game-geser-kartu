package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class jm2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f10639a;

    /* renamed from: b, reason: collision with root package name */
    private final kv1 f10640b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10641c;

    /* renamed from: d, reason: collision with root package name */
    private final w03 f10642d;

    public jm2(z64 z64Var, kv1 kv1Var, w03 w03Var, String str) {
        this.f10639a = z64Var;
        this.f10640b = kv1Var;
        this.f10642d = w03Var;
        this.f10641c = str;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f10639a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.im2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return jm2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 17;
    }

    final /* synthetic */ km2 c() {
        w03 w03Var = this.f10642d;
        kv1 kv1Var = this.f10640b;
        return new km2(kv1Var.b(w03Var.f17961g, this.f10641c), kv1Var.c());
    }
}
