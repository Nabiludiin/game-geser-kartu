package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class rk2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f14962a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f14963b;

    /* renamed from: c, reason: collision with root package name */
    private final tl0 f14964c;

    public rk2(z64 z64Var, w03 w03Var, tl0 tl0Var) {
        this.f14962a = z64Var;
        this.f14963b = w03Var;
        this.f14964c = tl0Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f14962a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.qk2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return rk2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 9;
    }

    final /* synthetic */ sk2 c() {
        return new sk2(this.f14963b.f17965k, this.f14964c.k());
    }
}
