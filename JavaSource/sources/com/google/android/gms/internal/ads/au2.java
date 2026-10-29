package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class au2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    final z64 f5290a;

    /* renamed from: b, reason: collision with root package name */
    final List f5291b;

    public au2(ey eyVar, z64 z64Var, List list) {
        this.f5290a = z64Var;
        this.f5291b = list;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f5290a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.zt2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new du2(au2.this.f5291b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 48;
    }
}
