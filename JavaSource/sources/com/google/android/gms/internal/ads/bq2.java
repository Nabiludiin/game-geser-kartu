package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class bq2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f5920a;

    /* renamed from: b, reason: collision with root package name */
    private final vy1 f5921b;

    bq2(z64 z64Var, vy1 vy1Var) {
        this.f5920a = z64Var;
        this.f5921b = vy1Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f5920a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.aq2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return bq2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 62;
    }

    final /* synthetic */ cq2 c() {
        return new cq2(this.f5921b.b());
    }
}
