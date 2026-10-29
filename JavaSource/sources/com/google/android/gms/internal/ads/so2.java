package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class so2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15731a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f15732b;

    so2(z64 z64Var, Context context) {
        this.f15732b = z64Var;
        this.f15731a = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f15732b.B0(new Callable() { // from class: com.google.android.gms.internal.ads.qo2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return so2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 57;
    }

    final /* synthetic */ to2 c() {
        r2.t.g();
        return new to2(v2.f2.i0(this.f15731a));
    }
}
