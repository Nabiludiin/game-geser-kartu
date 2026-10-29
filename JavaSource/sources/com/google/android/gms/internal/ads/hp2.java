package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class hp2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f9607a;

    /* renamed from: b, reason: collision with root package name */
    private final b12 f9608b;

    hp2(z64 z64Var, b12 b12Var) {
        this.f9607a = z64Var;
        this.f9608b = b12Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f9607a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.gp2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return hp2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 23;
    }

    final /* synthetic */ ip2 c() {
        b12 b12Var = this.f9608b;
        return new ip2(b12Var.h(), b12Var.e(), r2.t.s().k(), b12Var.r(), b12Var.n());
    }
}
