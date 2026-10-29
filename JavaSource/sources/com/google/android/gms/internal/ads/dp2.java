package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: MyApplication */
public final class dp2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7222a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f7223b;

    dp2(Context context, Intent intent) {
        this.f7222a = context;
        this.f7223b = intent;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        v2.n1.k("HsdpMigrationSignal.produce");
        if (!((Boolean) s2.b0.c().d(uy.Qd)).booleanValue()) {
            return p64.a(new ep2(null));
        }
        boolean z7 = false;
        try {
            if (this.f7223b.resolveActivity(this.f7222a.getPackageManager()) != null) {
                v2.n1.k("HSDP intent is supported");
                z7 = true;
            }
        } catch (Exception e8) {
            r2.t.l().i(e8, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return p64.a(new ep2(Boolean.valueOf(z7)));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 60;
    }
}
