package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class wt2 implements yr2 {
    public wt2(cl0 cl0Var, z64 z64Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        final a5.d a8 = p64.a(null);
        if (((Boolean) s2.b0.c().d(uy.f17212t6)).booleanValue()) {
            a8 = p64.a(null);
        }
        final a5.d a9 = p64.a(null);
        return p64.o(a8, a9).a(new Callable() { // from class: com.google.android.gms.internal.ads.vt2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new xt2((String) a5.d.this.get(), (String) a9.get());
            }
        }, cm0.f6500a);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 47;
    }
}
