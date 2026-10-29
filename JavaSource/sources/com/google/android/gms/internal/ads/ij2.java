package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: MyApplication */
public final class ij2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    final w03 f10065a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10066b;

    public ij2(w03 w03Var, long j7) {
        this.f10065a = w03Var;
        this.f10066b = j7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((x81) obj).f18665b;
        w03 w03Var = this.f10065a;
        bundle.putString("slotname", w03Var.f17961g);
        s2.b5 b5Var = w03Var.f17958d;
        if (b5Var.f26061v) {
            bundle.putBoolean("test_request", true);
        }
        int i7 = b5Var.f26062w;
        m13.c(bundle, "tag_for_child_directed_treatment", i7, i7 != -1);
        if (b5Var.f26056q >= 8) {
            int i8 = b5Var.J;
            m13.c(bundle, "tag_for_under_age_of_consent", i8, i8 != -1);
        }
        m13.e(bundle, "url", b5Var.B);
        m13.g(bundle, "neighboring_content_urls", b5Var.L);
        Bundle bundle2 = b5Var.f26058s;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) s2.b0.c().d(uy.f8)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        m13.f(bundle, "extras", bundle3);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        w03 w03Var = this.f10065a;
        s2.b5 b5Var = w03Var.f17958d;
        bundle.putInt("http_timeout_millis", b5Var.M);
        bundle.putString("slotname", w03Var.f17961g);
        int i7 = w03Var.f17970p.f10839a;
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i8 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f10066b);
        m13.d(bundle, "is_sdk_preload", true, b5Var.d());
        m13.b(bundle, "prefetch_type", "zenith_v2", b5Var.h());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j7 = b5Var.f26057r;
        m13.b(bundle, "cust_age", simpleDateFormat.format(new Date(j7)), j7 != -1);
        m13.f(bundle, "extras", b5Var.f26058s);
        int i9 = b5Var.f26059t;
        m13.c(bundle, "cust_gender", i9, i9 != -1);
        m13.g(bundle, "kw", b5Var.f26060u);
        int i10 = b5Var.f26062w;
        m13.c(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (b5Var.f26061v) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", b5Var.O);
        int i11 = b5Var.f26056q;
        m13.c(bundle, "d_imp_hdr", 1, i11 >= 2 && b5Var.f26063x);
        String str = b5Var.f26064y;
        m13.b(bundle, "ppid", str, i11 >= 2 && !TextUtils.isEmpty(str));
        Location location = b5Var.A;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        m13.e(bundle, "url", b5Var.B);
        m13.g(bundle, "neighboring_content_urls", b5Var.L);
        m13.f(bundle, "custom_targeting", b5Var.D);
        m13.g(bundle, "category_exclusions", b5Var.E);
        m13.e(bundle, "request_agent", b5Var.F);
        m13.e(bundle, "request_pkg", b5Var.G);
        m13.d(bundle, "is_designed_for_families", b5Var.H, i11 >= 7);
        if (i11 >= 8) {
            int i12 = b5Var.J;
            m13.c(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            m13.e(bundle, "max_ad_content_rating", b5Var.K);
        }
        Bundle bundle3 = w03Var.f17959e;
        m13.h(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        m13.h(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        m13.e(bundle, "plid", bundle3.getString("plid"));
    }
}
