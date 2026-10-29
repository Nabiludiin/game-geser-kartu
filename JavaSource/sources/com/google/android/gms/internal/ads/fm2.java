package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class fm2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f8324a;

    fm2(z64 z64Var) {
        this.f8324a = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f8324a.B0(new Callable(this) { // from class: com.google.android.gms.internal.ads.em2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new gm2(r2.t.o().a() - r2.t.l().q().j().b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 55;
    }
}
