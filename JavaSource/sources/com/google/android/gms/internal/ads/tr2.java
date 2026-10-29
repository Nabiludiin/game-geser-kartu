package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class tr2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f16331a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16332b;

    tr2(z64 z64Var, Context context) {
        this.f16331a = z64Var;
        this.f16332b = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f16331a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.sr2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return tr2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 37;
    }

    final /* synthetic */ rr2 c() {
        return new rr2(v2.d.b(this.f16332b, (String) s2.b0.c().d(uy.H6)));
    }
}
