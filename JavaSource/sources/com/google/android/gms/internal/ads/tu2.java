package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class tu2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final ql0 f16372a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16373b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f16374c;

    /* renamed from: d, reason: collision with root package name */
    private final z64 f16375d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16376e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16377f;

    tu2(ql0 ql0Var, boolean z7, dl0 dl0Var, z64 z64Var, String str, ScheduledExecutorService scheduledExecutorService, int i7, int i8) {
        this.f16372a = ql0Var;
        this.f16373b = z7;
        this.f16375d = z64Var;
        this.f16374c = scheduledExecutorService;
        this.f16376e = i7;
        this.f16377f = i8;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        if (((Boolean) s2.b0.c().d(uy.A7)).booleanValue() && this.f16373b) {
            return p64.a(new uu2(null));
        }
        if (this.f16377f == 2) {
            return p64.a(new uu2(null));
        }
        if (!Arrays.asList(((String) s2.b0.c().d(uy.C7)).split(",")).contains(String.valueOf(this.f16376e))) {
            return p64.a(new uu2(null));
        }
        a5.d a8 = p64.a(null);
        z64 z64Var = this.f16375d;
        return p64.g(p64.i(p64.k(a8, su2.f15823a, z64Var), ((Long) l10.f11336b.e()).longValue(), TimeUnit.MILLISECONDS, this.f16374c), Exception.class, new hx3() { // from class: com.google.android.gms.internal.ads.ru2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return tu2.this.c((Exception) obj);
            }
        }, z64Var);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 50;
    }

    final /* synthetic */ uu2 c(Exception exc) {
        this.f16372a.i(exc, "TrustlessTokenSignal");
        return new uu2(null);
    }
}
