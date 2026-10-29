package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class gt2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9129a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9130b;

    public gt2(il0 il0Var, Executor executor, String str, PackageInfo packageInfo, int i7) {
        this.f9129a = executor;
        this.f9130b = str;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        a5.d a8 = p64.a(this.f9130b);
        ft2 ft2Var = ft2.f8478a;
        Executor executor = this.f9129a;
        return p64.h(p64.k(a8, ft2Var, executor), Throwable.class, new w54() { // from class: com.google.android.gms.internal.ads.et2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return gt2.this.c((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 41;
    }

    final /* synthetic */ a5.d c(Throwable th) {
        return p64.a(new ht2(this.f9130b));
    }
}
