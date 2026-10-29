package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class tp2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f16292a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f16293b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f16294c;

    /* renamed from: d, reason: collision with root package name */
    private final v2.p1 f16295d;

    public tp2(z64 z64Var, w03 w03Var, PackageInfo packageInfo, v2.p1 p1Var) {
        this.f16292a = z64Var;
        this.f16293b = w03Var;
        this.f16294c = packageInfo;
        this.f16295d = p1Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f16292a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.rp2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return tp2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 26;
    }

    final /* synthetic */ up2 c() {
        return new up2(this.f16293b, this.f16294c, this.f16295d);
    }
}
