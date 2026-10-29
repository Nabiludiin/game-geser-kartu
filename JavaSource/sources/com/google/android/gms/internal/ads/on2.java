package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class on2 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13401a;

    private on2(w85 w85Var, w85 w85Var2) {
        this.f13401a = w85Var2;
    }

    public static on2 a(w85 w85Var, w85 w85Var2) {
        return new on2(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        g14 l7;
        fm2 c8 = hm2.c();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f13401a.b();
        if (((Boolean) s2.b0.c().d(uy.G4)).booleanValue()) {
            l7 = g14.m(new fq2(c8, ((Integer) s2.b0.c().d(uy.H4)).intValue(), scheduledExecutorService));
        } else {
            l7 = g14.l();
        }
        v85.b(l7);
        return l7;
    }
}
