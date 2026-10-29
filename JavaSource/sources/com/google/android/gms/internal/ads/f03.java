package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class f03 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7925a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7926b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7927c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7928d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7929e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7930f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7931g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7932h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7933i;

    /* renamed from: j, reason: collision with root package name */
    public final e03 f7934j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f7935k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7936l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7937m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7938n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f7939o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f7940p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7941q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7942r;

    /* renamed from: s, reason: collision with root package name */
    public long f7943s;

    /* renamed from: t, reason: collision with root package name */
    public long f7944t;

    f03(JsonReader jsonReader) {
        List list = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i7 = 0;
        int i8 = 0;
        boolean z7 = false;
        e03 e03Var = null;
        long j7 = -1;
        long j8 = -1;
        long j9 = 0;
        int i9 = -1;
        int i10 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                list = v2.r0.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i7 = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i9 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z7 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i8 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j9 = jsonReader.nextLong();
            } else {
                String str8 = str3;
                if (((Boolean) s2.b0.c().d(uy.h9)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    e03Var = new e03(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) s2.b0.c().d(uy.vb)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) s2.b0.c().d(uy.o7)).booleanValue()) {
                            try {
                                try {
                                    Bundle l7 = v2.r0.l(v2.r0.d(jsonReader));
                                    if (l7 != null) {
                                        bundle = l7;
                                    }
                                } catch (IOException | JSONException unused) {
                                }
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) s2.b0.c().d(uy.na)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) s2.b0.c().d(uy.na)).booleanValue()) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        ly lyVar = uy.oa;
                        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str2 = jsonReader.nextString();
                        } else if (((Boolean) s2.b0.c().d(lyVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = v2.r0.d(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i10 = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) s2.b0.c().d(uy.wa)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = v2.r0.d(jsonReader);
                            } else {
                                if (((Boolean) s2.b0.c().d(uy.f17232w2)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        Bundle l8 = v2.r0.l(v2.r0.d(jsonReader));
                                        if (l8 != null) {
                                            j8 = a(l8.getDouble("start_time"));
                                            j7 = a(l8.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                str3 = str8;
            }
        }
        String str9 = str3;
        jsonReader.endObject();
        this.f7925a = list;
        this.f7927c = i7;
        if (((Boolean) c10.f6209c.e()).booleanValue()) {
            this.f7928d = -1;
        } else {
            g00 g00Var = k00.f10832a;
            if (((Long) g00Var.e()).longValue() > -1) {
                this.f7928d = ((Long) g00Var.e()).intValue();
            } else {
                this.f7928d = i9;
            }
        }
        this.f7926b = str;
        this.f7929e = str6;
        this.f7930f = i8;
        this.f7931g = j9;
        this.f7934j = e03Var;
        this.f7932h = z7;
        this.f7933i = str7;
        this.f7935k = bundle;
        this.f7936l = str4;
        this.f7937m = str5;
        this.f7938n = str2;
        this.f7939o = jSONObject;
        this.f7940p = jSONObject2;
        this.f7941q = str9;
        g00 g00Var2 = a10.f4667a;
        this.f7942r = ((Long) g00Var2.e()).longValue() > 0 ? ((Long) g00Var2.e()).intValue() : i10;
        this.f7943s = j8;
        this.f7944t = j7;
    }

    private static final long a(double d8) {
        if (d8 > 9.223372036854776E18d || d8 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d8;
    }
}
