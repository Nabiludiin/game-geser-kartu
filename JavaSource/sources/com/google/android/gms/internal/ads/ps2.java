package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class ps2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f14087a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14088b;

    public ps2(z64 z64Var, Context context) {
        this.f14087a = z64Var;
        this.f14088b = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f14087a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.os2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ps2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 39;
    }

    final /* synthetic */ ns2 c() {
        boolean z7;
        int i7;
        Context context = this.f14088b;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        r2.t.g();
        int i8 = -1;
        if (v2.f2.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i7 = type;
                i8 = ordinal;
            } else {
                i7 = -1;
            }
            z7 = connectivityManager.isActiveNetworkMetered();
        } else {
            z7 = false;
            i7 = -2;
        }
        return new ns2(networkOperator, i7, r2.t.j().k(context), phoneType, z7, i8);
    }
}
