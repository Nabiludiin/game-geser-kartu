package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ao0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5171c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5172d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5173e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5174f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5175g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5176h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5177i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5178j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5179k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5180l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5181m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5182n;

    public ao0(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f5169a = a(jSONObject, "aggressive_media_codec_release", uy.f17073d0);
        this.f5170b = b(jSONObject, "byte_buffer_precache_limit", uy.f17141l);
        this.f5171c = b(jSONObject, "exo_cache_buffer_size", uy.f17221v);
        this.f5172d = b(jSONObject, "exo_connect_timeout_millis", uy.f17108h);
        ly lyVar = uy.f17099g;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f5173e = b(jSONObject, "exo_read_timeout_millis", uy.f17117i);
            this.f5174f = b(jSONObject, "load_check_interval_bytes", uy.f17125j);
            this.f5175g = b(jSONObject, "player_precache_limit", uy.f17133k);
            this.f5176h = b(jSONObject, "socket_receive_buffer_size", uy.f17149m);
            this.f5177i = a(jSONObject, "use_cache_data_source", uy.R4);
            b(jSONObject, "min_retry_count", uy.f17157n);
            this.f5178j = a(jSONObject, "treat_load_exception_as_non_fatal", uy.f17173p);
            this.f5179k = a(jSONObject, "enable_multiple_video_playback", uy.f17120i2);
            this.f5180l = a(jSONObject, "use_range_http_data_source", uy.f17136k2);
            this.f5181m = c(jSONObject, "range_http_data_source_high_water_mark", uy.f17144l2);
            this.f5182n = c(jSONObject, "range_http_data_source_low_water_mark", uy.f17152m2);
        }
        this.f5173e = b(jSONObject, "exo_read_timeout_millis", uy.f17117i);
        this.f5174f = b(jSONObject, "load_check_interval_bytes", uy.f17125j);
        this.f5175g = b(jSONObject, "player_precache_limit", uy.f17133k);
        this.f5176h = b(jSONObject, "socket_receive_buffer_size", uy.f17149m);
        this.f5177i = a(jSONObject, "use_cache_data_source", uy.R4);
        b(jSONObject, "min_retry_count", uy.f17157n);
        this.f5178j = a(jSONObject, "treat_load_exception_as_non_fatal", uy.f17173p);
        this.f5179k = a(jSONObject, "enable_multiple_video_playback", uy.f17120i2);
        this.f5180l = a(jSONObject, "use_range_http_data_source", uy.f17136k2);
        this.f5181m = c(jSONObject, "range_http_data_source_high_water_mark", uy.f17144l2);
        this.f5182n = c(jSONObject, "range_http_data_source_low_water_mark", uy.f17152m2);
    }

    private static final boolean a(JSONObject jSONObject, String str, ly lyVar) {
        boolean booleanValue = ((Boolean) s2.b0.c().d(lyVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    private static final int b(JSONObject jSONObject, String str, ly lyVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) s2.b0.c().d(lyVar)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, ly lyVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) s2.b0.c().d(lyVar)).longValue();
    }
}
