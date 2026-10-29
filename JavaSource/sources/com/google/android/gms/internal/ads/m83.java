package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* compiled from: MyApplication */
public final class m83 {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f12129a;

    m83(rx1 rx1Var, Context context) {
        this.f12129a = rx1Var;
    }

    private final void q(String str, long j7, String str2, String str3, k2.c cVar, int i7, int i8, int i9, String str4) {
        qx1 a8 = this.f12129a.a();
        a8.c("action", str);
        a8.c("pat", Long.toString(j7));
        a8.c("ad_format", cVar.name().toLowerCase(Locale.ENGLISH));
        a8.c("max_ads", Integer.toString(i7));
        a8.c("cache_size", Integer.toString(i8));
        a8.c("pas", Integer.toString(i9));
        a8.c("pv", "2");
        a8.c("ad_unit_id", str3);
        a8.c("pid", str2);
        a8.d();
    }

    private final void r(String str, String str2, long j7, int i7, int i8, String str3, u83 u83Var, String str4) {
        qx1 a8 = this.f12129a.a();
        a8.c(str2, Long.toString(j7));
        if (u83Var != null) {
            a8.c("ad_unit_id", u83Var.a());
            a8.c("ad_format", u83Var.b());
            a8.c("pid", u83Var.c());
        }
        a8.c("action", str);
        if (str3 != null) {
            a8.c("gqi", str3);
        }
        if (i7 >= 0) {
            a8.c("max_ads", Integer.toString(i7));
        }
        if (i8 >= 0) {
            a8.c("cache_size", Integer.toString(i8));
        }
        a8.c("pv", str4);
        a8.d();
    }

    public final void a(int i7, long j7, u83 u83Var, String str) {
        qx1 a8 = this.f12129a.a();
        a8.c("action", "start_preload");
        a8.c("sp_ts", Long.toString(j7));
        a8.c("ad_format", u83Var.b());
        a8.c("ad_unit_id", u83Var.a());
        a8.c("pid", u83Var.c());
        a8.c("max_ads", Integer.toString(i7));
        a8.c("pv", str);
        a8.d();
    }

    public final void b(Map map, long j7, String str) {
        qx1 a8 = this.f12129a.a();
        a8.c("action", "start_preload");
        a8.c("sp_ts", Long.toString(j7));
        a8.c("pv", "1");
        for (k2.c cVar : map.keySet()) {
            String valueOf = String.valueOf(cVar.name().toLowerCase(Locale.ENGLISH));
            a8.c(valueOf.concat("_count"), Integer.toString(((Integer) map.get(cVar)).intValue()));
        }
        a8.d();
    }

    public final void c(int i7, int i8, long j7, u83 u83Var) {
        qx1 a8 = this.f12129a.a();
        a8.c("action", "cache_resize");
        a8.c("cs_ts", Long.toString(j7));
        a8.c("orig_ma", Integer.toString(i7));
        a8.c("max_ads", Integer.toString(i8));
        a8.c("ad_format", u83Var.b());
        a8.c("ad_unit_id", u83Var.a());
        a8.c("pid", u83Var.c());
        a8.c("pv", "1");
        a8.d();
    }

    public final void d(int i7, int i8, long j7, Long l7, String str, u83 u83Var, String str2) {
        qx1 a8 = this.f12129a.a();
        a8.c("plaac_ts", Long.toString(j7));
        a8.c("max_ads", Integer.toString(i7));
        a8.c("cache_size", Integer.toString(i8));
        a8.c("action", "is_ad_available");
        if (u83Var != null) {
            a8.c("ad_unit_id", u83Var.a());
            a8.c("pid", u83Var.c());
            a8.c("ad_format", u83Var.b());
        }
        if (l7 != null) {
            a8.c("plaay_ts", Long.toString(l7.longValue()));
        }
        if (str != null) {
            a8.c("gqi", str);
        }
        a8.c("pv", str2);
        a8.d();
    }

    public final void e(long j7, String str) {
        r("poll_ad", "ppacwe_ts", j7, -1, -1, null, null, "2");
    }

    public final void f(long j7, u83 u83Var, int i7, int i8, String str) {
        r("poll_ad", "ppac_ts", j7, i7, i8, null, u83Var, str);
    }

    public final void g(long j7, int i7, int i8, String str, u83 u83Var, String str2) {
        r("poll_ad", "psvroc_ts", j7, i7, i8, str, u83Var, str2);
    }

    public final void h(long j7, int i7, int i8, String str, u83 u83Var, String str2) {
        qx1 a8 = this.f12129a.a();
        a8.c("ppla_ts", Long.toString(j7));
        a8.c("ad_format", u83Var.b());
        a8.c("ad_unit_id", u83Var.a());
        a8.c("pid", u83Var.c());
        a8.c("max_ads", Integer.toString(i7));
        a8.c("cache_size", Integer.toString(i8));
        a8.c("action", "poll_ad");
        if (str != null) {
            a8.c("gqi", str);
        }
        a8.c("pv", str2);
        a8.d();
    }

    public final void i(long j7, String str, u83 u83Var, int i7, int i8, String str2) {
        r("paa", "pano_ts", j7, i7, i8, str, u83Var, str2);
    }

    public final void j(long j7, u83 u83Var, int i7, String str) {
        r("pae", "paeo_ts", j7, i7, 0, null, u83Var, str);
    }

    public final void k(long j7, u83 u83Var, s2.x2 x2Var, int i7, int i8, String str) {
        qx1 a8 = this.f12129a.a();
        a8.c("action", "pftla");
        a8.c("pftlat_ts", Long.toString(j7));
        a8.c("pftlaec", Integer.toString(x2Var.f26259q));
        a8.c("ad_format", u83Var.b());
        a8.c("max_ads", Integer.toString(i7));
        a8.c("cache_size", Integer.toString(i8));
        a8.c("ad_unit_id", u83Var.a());
        a8.c("pid", u83Var.c());
        a8.c("pv", str);
        a8.d();
    }

    public final void l(long j7, k2.c cVar, int i7) {
        q("pda", j7, null, null, cVar, -1, -1, i7, "2");
    }

    public final void m(long j7, String str, String str2, k2.c cVar, int i7, int i8) {
        q("pd", j7, str, str2, cVar, i7, i8, 1, "2");
    }

    public final void n(k2.c cVar, long j7, int i7) {
        q("pgcs", j7, null, null, cVar, -1, -1, i7, "2");
    }

    public final void o(long j7, String str, String str2, k2.c cVar, int i7, int i8) {
        q("pgc", j7, str, str2, cVar, i7, i8, 1, "2");
    }

    public final void p(int i7, long j7, String str, String str2, k2.c cVar, int i8) {
        q("pnav", j7, str, str2, cVar, i8, i7, 1, "2");
    }
}
