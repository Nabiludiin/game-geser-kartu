package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ll0 {

    /* renamed from: d, reason: collision with root package name */
    private String f11640d;

    /* renamed from: e, reason: collision with root package name */
    private String f11641e;

    /* renamed from: f, reason: collision with root package name */
    private long f11642f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f11643g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11644h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11646j;

    /* renamed from: a, reason: collision with root package name */
    private final List f11637a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f11638b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f11639c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List f11645i = new ArrayList();

    public ll0(String str, long j7) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f11640d = "";
        this.f11644h = false;
        this.f11646j = false;
        this.f11641e = str;
        this.f11642f = j7;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f11643g = new JSONObject(str);
            if (((Boolean) s2.b0.c().d(uy.Hc)).booleanValue() && j()) {
                return;
            }
            if (this.f11643g.optInt("status", -1) != 1) {
                this.f11644h = false;
                int i7 = v2.n1.f26802b;
                w2.p.f("App settings could not be fetched successfully.");
                return;
            }
            this.f11644h = true;
            this.f11640d = this.f11643g.optString("app_id");
            JSONArray optJSONArray2 = this.f11643g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i8);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.f11638b.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f11639c.put(optString2, new eb0(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.f11643g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                    this.f11637a.add(optJSONArray3.optString(i9));
                }
            }
            if (((Boolean) s2.b0.c().d(uy.s7)).booleanValue() && (optJSONObject2 = this.f11643g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.f11645i.add(optJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) s2.b0.c().d(uy.O6)).booleanValue() || (optJSONObject = this.f11643g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f11646j = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e8) {
            int i11 = v2.n1.f26802b;
            w2.p.g("Exception occurred while processing app setting json", e8);
            r2.t.l().i(e8, "AppSettings.parseAppSettingsJson");
        }
    }

    private final boolean l() {
        if (!TextUtils.isEmpty(this.f11641e) && this.f11643g != null) {
            long m7 = m();
            long a8 = r2.t.o().a();
            if (m7 >= 0) {
                long j7 = this.f11642f;
                if (j7 > a8 || TimeUnit.MILLISECONDS.toSeconds(a8 - j7) > m7) {
                    return false;
                }
            }
        }
        return true;
    }

    private final long m() {
        ly lyVar = uy.Kc;
        return (!((Boolean) s2.b0.c().d(uy.Jc)).booleanValue() || TextUtils.isEmpty(this.f11641e)) ? ((Long) s2.b0.c().d(lyVar)).longValue() : this.f11643g.optLong("cache_ttl_sec", ((Long) s2.b0.c().d(lyVar)).longValue());
    }

    public final void a(long j7) {
        this.f11642f = j7;
    }

    public final long b() {
        return this.f11642f;
    }

    public final boolean c() {
        return this.f11644h;
    }

    public final String d() {
        return this.f11641e;
    }

    public final String e() {
        return this.f11640d;
    }

    public final Map f() {
        return this.f11639c;
    }

    public final JSONObject g() {
        return this.f11643g;
    }

    public final List h() {
        return this.f11645i;
    }

    public final boolean i() {
        return this.f11646j;
    }

    public final boolean j() {
        rx1 x7;
        if (l()) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.K4)).booleanValue() && (x7 = r2.t.l().x()) != null) {
            qx1 a8 = x7.a();
            a8.c("action", "cld_reset");
            a8.c("cld_lut_ms", String.valueOf(this.f11642f));
            a8.c("event_timestamp", String.valueOf(r2.t.o().a()));
            a8.c("cld_ttl_sec", String.valueOf(m()));
            a8.d();
        }
        this.f11637a.clear();
        this.f11638b.clear();
        this.f11639c.clear();
        this.f11640d = "";
        this.f11641e = "";
        this.f11643g = null;
        this.f11644h = false;
        this.f11645i.clear();
        this.f11646j = false;
        return true;
    }

    public final int k() {
        if (TextUtils.isEmpty(this.f11641e) || this.f11643g == null) {
            return 3;
        }
        return l() ? 1 : 2;
    }
}
