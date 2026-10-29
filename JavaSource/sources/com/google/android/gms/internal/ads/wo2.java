package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class wo2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f18356a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f18357b;

    wo2(z64 z64Var, w03 w03Var) {
        this.f18356a = z64Var;
        this.f18357b = w03Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f18356a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.vo2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return wo2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 21;
    }

    final /* synthetic */ xo2 c() {
        return new xo2("requester_type_2".equals(b3.c.c(this.f18357b.f17958d)));
    }
}
