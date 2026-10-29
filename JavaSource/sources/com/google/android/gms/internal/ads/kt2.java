package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class kt2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final ql0 f11235a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f11236b;

    /* renamed from: c, reason: collision with root package name */
    private final z64 f11237c;

    kt2(String str, kt ktVar, ql0 ql0Var, ScheduledExecutorService scheduledExecutorService, z64 z64Var) {
        this.f11235a = ql0Var;
        this.f11236b = scheduledExecutorService;
        this.f11237c = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        if (((Boolean) s2.b0.c().d(uy.f17209t3)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.f17249y3)).booleanValue()) {
                a5.d a8 = xh3.a(w4.l.e(null), null);
                z64 z64Var = this.f11237c;
                a5.d j7 = p64.j(a8, jt2.f10758a, z64Var);
                if (((Boolean) j00.f10276a.e()).booleanValue()) {
                    j7 = p64.i(j7, ((Long) j00.f10277b.e()).longValue(), TimeUnit.MILLISECONDS, this.f11236b);
                }
                return p64.g(j7, Exception.class, new hx3() { // from class: com.google.android.gms.internal.ads.it2
                    @Override // com.google.android.gms.internal.ads.hx3
                    public final /* synthetic */ Object apply(Object obj) {
                        return kt2.this.c((Exception) obj);
                    }
                }, z64Var);
            }
        }
        return p64.a(new lt2(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 43;
    }

    final /* synthetic */ lt2 c(Exception exc) {
        this.f11235a.i(exc, "AppSetIdInfoGmscoreSignal");
        return new lt2(null, -1);
    }
}
