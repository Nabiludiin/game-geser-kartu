package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class il2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f10074a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.a f10075b;

    il2(w2.a aVar, z64 z64Var) {
        this.f10075b = aVar;
        this.f10074a = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f10074a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.hl2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return il2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 54;
    }

    final /* synthetic */ jl2 c() {
        return jl2.a(this.f10075b);
    }
}
