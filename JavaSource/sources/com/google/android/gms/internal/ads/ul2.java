package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class ul2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f16812a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16813b;

    ul2(z64 z64Var, Context context) {
        this.f16812a = z64Var;
        this.f16813b = context;
    }

    private final Intent d() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) s2.b0.c().d(uy.ac)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            return this.f16813b.registerReceiver(null, intentFilter);
        }
        registerReceiver = this.f16813b.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    private static final boolean e(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f16812a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.tl2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ul2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 14;
    }

    final /* synthetic */ vl2 c() {
        double intExtra;
        boolean z7;
        if (((Boolean) s2.b0.c().d(uy.ad)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.f16813b.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            z7 = batteryManager != null ? batteryManager.isCharging() : e(d());
        } else {
            Intent d8 = d();
            boolean e8 = e(d8);
            intExtra = d8 != null ? d8.getIntExtra("level", -1) / d8.getIntExtra("scale", -1) : -1.0d;
            z7 = e8;
        }
        return new vl2(intExtra, z7);
    }
}
