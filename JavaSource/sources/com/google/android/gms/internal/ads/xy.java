package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: MyApplication */
public final class xy {

    /* renamed from: a, reason: collision with root package name */
    private final String f19298a = (String) q00.f14189a.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f19299b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19300c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19301d;

    public xy(Context context, String str) {
        this.f19300c = context;
        this.f19301d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f19299b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        r2.t.g();
        linkedHashMap.put("device", v2.f2.h0());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        r2.t.g();
        linkedHashMap.put("is_lite_sdk", true != v2.f2.i(context) ? "0" : "1");
        Future a8 = r2.t.t().a(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((ih0) a8.get()).f10044j));
            linkedHashMap.put("network_fine", Integer.toString(((ih0) a8.get()).f10045k));
        } catch (Exception e8) {
            r2.t.l().i(e8, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) s2.b0.c().d(uy.rc)).booleanValue()) {
            Map map = this.f19299b;
            r2.t.g();
            map.put("is_bstar", true != v2.f2.f(context) ? "0" : "1");
        }
        if (((Boolean) s2.b0.c().d(uy.va)).booleanValue()) {
            if (!((Boolean) s2.b0.c().d(uy.I2)).booleanValue() || iy3.c(r2.t.l().w())) {
                return;
            }
            this.f19299b.put("plugin", r2.t.l().w());
        }
    }

    final String a() {
        return this.f19298a;
    }

    final Context b() {
        return this.f19300c;
    }

    final String c() {
        return this.f19301d;
    }

    final Map d() {
        return this.f19299b;
    }
}
