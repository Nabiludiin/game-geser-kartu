package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class c03 {
    public final sj0 A;
    public final List A0;
    public final String B;
    public final boolean B0;
    public final JSONObject C;
    public final List C0;
    public final JSONObject D;
    public final boolean D0;
    public final String E;
    public final int E0;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final z03 V;
    public final boolean W;
    public final boolean X;
    public final int Y;
    public final String Z;

    /* renamed from: a, reason: collision with root package name */
    public final List f6150a;

    /* renamed from: a0, reason: collision with root package name */
    public final int f6151a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f6152b;

    /* renamed from: b0, reason: collision with root package name */
    public final String f6153b0;

    /* renamed from: c, reason: collision with root package name */
    public final List f6154c;

    /* renamed from: c0, reason: collision with root package name */
    public final boolean f6155c0;

    /* renamed from: d, reason: collision with root package name */
    public final List f6156d;

    /* renamed from: d0, reason: collision with root package name */
    public final if0 f6157d0;

    /* renamed from: e, reason: collision with root package name */
    public final int f6158e;

    /* renamed from: e0, reason: collision with root package name */
    public final s2.i5 f6159e0;

    /* renamed from: f, reason: collision with root package name */
    public final List f6160f;

    /* renamed from: f0, reason: collision with root package name */
    public final String f6161f0;

    /* renamed from: g, reason: collision with root package name */
    public final List f6162g;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f6163g0;

    /* renamed from: h, reason: collision with root package name */
    public final List f6164h;

    /* renamed from: h0, reason: collision with root package name */
    public final JSONObject f6165h0;

    /* renamed from: i, reason: collision with root package name */
    public final List f6166i;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f6167i0;

    /* renamed from: j, reason: collision with root package name */
    public final String f6168j;

    /* renamed from: j0, reason: collision with root package name */
    public final JSONObject f6169j0;

    /* renamed from: k, reason: collision with root package name */
    public final String f6170k;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f6171k0;

    /* renamed from: l, reason: collision with root package name */
    public final di0 f6172l;

    /* renamed from: l0, reason: collision with root package name */
    public final String f6173l0;

    /* renamed from: m, reason: collision with root package name */
    public final List f6174m;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f6175m0;

    /* renamed from: n, reason: collision with root package name */
    public final List f6176n;

    /* renamed from: n0, reason: collision with root package name */
    public final String f6177n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f6178o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f6179o0;

    /* renamed from: p, reason: collision with root package name */
    public final List f6180p;

    /* renamed from: p0, reason: collision with root package name */
    public final String f6181p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f6182q;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f6183q0;

    /* renamed from: r, reason: collision with root package name */
    public final List f6184r;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f6185r0;

    /* renamed from: s, reason: collision with root package name */
    public final h03 f6186s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f6187s0;

    /* renamed from: t, reason: collision with root package name */
    public final List f6188t;

    /* renamed from: t0, reason: collision with root package name */
    public final String f6189t0;

    /* renamed from: u, reason: collision with root package name */
    public final List f6190u;

    /* renamed from: u0, reason: collision with root package name */
    public final List f6191u0;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f6192v;

    /* renamed from: v0, reason: collision with root package name */
    public final boolean f6193v0;

    /* renamed from: w, reason: collision with root package name */
    public final String f6194w;

    /* renamed from: w0, reason: collision with root package name */
    public final Map f6195w0;

    /* renamed from: x, reason: collision with root package name */
    public final String f6196x;

    /* renamed from: x0, reason: collision with root package name */
    public final w2.w f6197x0;

    /* renamed from: y, reason: collision with root package name */
    public final String f6198y;

    /* renamed from: y0, reason: collision with root package name */
    public final w2.x f6199y0;

    /* renamed from: z, reason: collision with root package name */
    public final String f6200z;

    /* renamed from: z0, reason: collision with root package name */
    public final double f6201z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v121, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v197, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List] */
    c03(JsonReader jsonReader) {
        List list;
        List list2;
        List list3 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        w04.m();
        w04 m7 = w04.m();
        HashMap hashMap = new HashMap();
        w04 m8 = w04.m();
        w04 m9 = w04.m();
        jsonReader.beginObject();
        List list4 = list3;
        List list5 = list4;
        List list6 = list5;
        List list7 = list6;
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        w04 w04Var = m7;
        HashMap hashMap2 = hashMap;
        w04 w04Var2 = m8;
        w04 w04Var3 = m9;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i10 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        int i11 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        int i12 = 0;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        int i13 = 0;
        double d8 = 0.0d;
        di0 di0Var = null;
        h03 h03Var = null;
        sj0 sj0Var = null;
        if0 if0Var = null;
        s2.i5 i5Var = null;
        String str = null;
        w2.w wVar = null;
        w2.x xVar = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        String str20 = str19;
        List list8 = list7;
        List list9 = list8;
        List list10 = list9;
        List list11 = list10;
        List list12 = list11;
        List list13 = list12;
        List list14 = list13;
        List list15 = list14;
        JSONObject jSONObject12 = jSONObject;
        int i14 = 0;
        int i15 = 0;
        String str21 = str20;
        List list16 = list15;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_source_instance_name")) {
                        str15 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1980587809:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("debug_signals")) {
                        jSONObject7 = v2.r0.d(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1965512151:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("omid_settings")) {
                        jSONObject9 = v2.r0.d(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1964744830:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("offline_ad_config")) {
                        if (((Boolean) uy.x9.g()).booleanValue()) {
                            xVar = w2.x.d(v2.r0.d(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1871425831:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("recursive_server_response_data")) {
                        str18 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1843156475:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_consent")) {
                        z24 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1840512279:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("presentation_urls")) {
                        w04Var2 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1828733410:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("network_ping_config")) {
                        if (((Boolean) uy.v9.g()).booleanValue()) {
                            wVar = w2.w.b(v2.r0.d(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1812055556:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("play_prewarm_options")) {
                        if0Var = if0.a(v2.r0.d(jsonReader));
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1785028569:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("parallel_key")) {
                        str20 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1776946669:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_source_name")) {
                        str13 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1662989631:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_interscroller")) {
                        z18 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1620470467:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("backend_query_id")) {
                        str10 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1550155393:
                    list = list14;
                    list2 = list15;
                    if (!str22.equals("nofill_urls")) {
                        jsonReader.skipValue();
                        list15 = list2;
                        list14 = list;
                        break;
                    } else {
                        list14 = v2.r0.b(jsonReader);
                        list15 = list2;
                        break;
                    }
                case -1440104884:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_custom_close_blocked")) {
                        z12 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1439500848:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("orientation")) {
                        i7 = e(jsonReader.nextString());
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1428969291:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("enable_omid")) {
                        z14 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1406227629:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        z22 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1403779768:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("showable_impression_type")) {
                        i11 = jsonReader.nextInt();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1375413093:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_cover")) {
                        jSONObject10 = v2.r0.d(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1360811658:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_sizes")) {
                        list4 = d03.a(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1306015996:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("adapters")) {
                        list5 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1303332046:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("test_mode_enabled")) {
                        z11 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1289032093:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("extras")) {
                        jSONObject8 = v2.r0.d(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1240082064:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_event_value")) {
                        i5Var = s2.i5.M0(v2.r0.d(jsonReader));
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1234181075:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        z7 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1168140544:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("presentation_error_urls")) {
                        list15 = v2.r0.b(jsonReader);
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1152230954:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_type")) {
                        i15 = c(jsonReader.nextString());
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1146534047:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_scroll_aware")) {
                        z16 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1115838944:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("fill_urls")) {
                        list13 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1081936678:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("allocation_id")) {
                        str3 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1078050970:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("video_complete_urls")) {
                        list12 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -1051269058:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("active_view")) {
                        str6 = v2.r0.d(jsonReader).toString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -982608540:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("valid_from_timestamp")) {
                        str2 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -972056451:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_source_instance_id")) {
                        str16 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -776859333:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("click_urls")) {
                        list16 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -652881372:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("on_device_storage_configs")) {
                        if (((Boolean) uy.u8.g()).booleanValue()) {
                            w04Var3 = wy1.a(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -570101180:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("late_load_urls")) {
                        w04Var = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -544216775:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("safe_browsing")) {
                        sj0Var = sj0.M0(v2.r0.d(jsonReader));
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -437057161:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("imp_urls")) {
                        list8 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -404433734:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("rtb_native_required_assets")) {
                        jSONObject11 = v2.r0.d(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -404326515:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("render_timeout_ms")) {
                        i10 = jsonReader.nextInt();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -397704715:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_close_time_ms")) {
                        i8 = jsonReader.nextInt();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -388807511:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("content_url")) {
                        str = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -369773488:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -213449460:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        z21 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -213424028:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("watermark")) {
                        str9 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -180214626:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("native_required_asset_viewability")) {
                        z20 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -154616268:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_offline_ad")) {
                        z19 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case -29338502:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("allow_custom_click_gesture")) {
                        z9 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 3107:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad")) {
                        h03Var = new h03(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        list15 = list2;
                        list14 = list;
                    }
                case 3355:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("id")) {
                        str4 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 3076010:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("data")) {
                        jSONObject12 = v2.r0.d(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 37109963:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("request_id")) {
                        str17 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 63195984:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("render_test_label")) {
                        z10 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 107433883:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("qdata")) {
                        str5 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 230323073:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_load_urls")) {
                        list9 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 418392395:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_closable_area_disabled")) {
                        z13 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 542250332:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("consent_form_action_identifier")) {
                        i12 = jsonReader.nextInt();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 549176928:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        i13 = jsonReader.nextInt();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 597473788:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("debug_dialog_string")) {
                        str7 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 754887508:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("container_sizes")) {
                        list6 = d03.a(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 791122864:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("impression_type")) {
                        i14 = d(jsonReader.nextInt());
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 805095541:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) uy.f17222v0.g()).booleanValue()) {
                            hashMap2 = v2.r0.c(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1010584092:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("transaction_id")) {
                        str21 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1100650276:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("rewards")) {
                        di0Var = di0.M0(v2.r0.e(jsonReader));
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1141602460:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("adapter_response_info_key")) {
                        str19 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1186014765:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("cache_hit_urls")) {
                        v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1303622534:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("preload_sort_value")) {
                        d8 = jsonReader.nextDouble();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1321720943:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        z8 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1422388341:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_collapsible")) {
                        z23 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1437255331:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_source_id")) {
                        str14 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1556932485:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) uy.Sd.g()).booleanValue()) {
                            i9 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1565514205:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("adapter_only_third_party_impression")) {
                        z27 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1637553475:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("bid_response")) {
                        str8 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1638957285:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("video_start_urls")) {
                        list10 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1686319423:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("ad_network_class_name")) {
                        str12 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1688341040:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("video_reward_urls")) {
                        list11 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1799285870:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("use_third_party_container_height")) {
                        z17 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1839650832:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("renderers")) {
                        list3 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 1875425491:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        z15 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 2068142375:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("rule_line_external_id")) {
                        str11 = jsonReader.nextString();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 2072888499:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("manual_tracking_urls")) {
                        list7 = v2.r0.b(jsonReader);
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 2075506442:
                    list = list14;
                    list2 = list15;
                    if (str22.equals("render_serially")) {
                        z25 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                case 2117205836:
                    list2 = list15;
                    list = list14;
                    if (str22.equals("flow_control")) {
                        z26 = jsonReader.nextBoolean();
                        list15 = list2;
                        list14 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                default:
                    list = list14;
                    list2 = list15;
                    jsonReader.skipValue();
                    list15 = list2;
                    list14 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.f6150a = list3;
        this.f6152b = i15;
        this.f6154c = list16;
        this.f6156d = list8;
        this.f6160f = list9;
        this.f6158e = i14;
        this.f6162g = list10;
        this.f6164h = list11;
        this.f6166i = list12;
        this.f6168j = str21;
        this.f6170k = str2;
        this.f6172l = di0Var;
        this.f6174m = list13;
        this.f6176n = list14;
        this.f6178o = list15;
        this.f6180p = list7;
        this.f6182q = i13;
        this.f6184r = list6;
        this.f6186s = h03Var;
        this.f6188t = list5;
        this.f6190u = list4;
        this.f6194w = str3;
        this.f6192v = jSONObject12;
        this.f6196x = str4;
        this.f6198y = str5;
        this.f6200z = str6;
        this.A = sj0Var;
        this.B = str7;
        this.C = jSONObject7;
        this.D = jSONObject8;
        this.J = z7;
        this.K = z8;
        this.L = z9;
        this.M = z10;
        this.N = z11;
        this.O = z12;
        this.P = z13;
        this.Q = i7;
        this.R = i10;
        this.T = z14;
        this.U = str8;
        this.V = new z03(jSONObject9);
        this.W = z15;
        this.X = z16;
        this.Y = i11;
        this.Z = str9;
        this.f6151a0 = i8;
        this.f6153b0 = str10;
        this.f6155c0 = z17;
        this.f6157d0 = if0Var;
        this.f6159e0 = i5Var;
        this.f6161f0 = str11;
        this.f6163g0 = z18;
        this.f6165h0 = jSONObject10;
        this.E = str12;
        this.F = str13;
        this.G = str14;
        this.H = str15;
        this.I = str16;
        this.f6167i0 = z19;
        this.f6169j0 = jSONObject11;
        this.f6171k0 = z20;
        this.f6173l0 = str;
        this.f6175m0 = z21;
        this.S = z22;
        this.f6177n0 = str17;
        this.f6179o0 = str18;
        this.f6181p0 = str19;
        this.f6183q0 = z23;
        this.f6185r0 = z24;
        this.f6187s0 = i12;
        this.f6191u0 = w04Var;
        this.f6189t0 = str20;
        this.f6193v0 = z25;
        this.f6195w0 = hashMap2;
        this.f6197x0 = wVar;
        this.f6199y0 = xVar;
        this.f6201z0 = d8;
        this.A0 = w04Var2;
        this.B0 = z26;
        this.C0 = w04Var3;
        this.D0 = z27;
        this.E0 = i9;
    }

    public static String a(int i7) {
        switch (i7) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int c(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int d(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) {
            return i7;
        }
        return 0;
    }

    private static int e(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean b() {
        return this.f6167i0 || this.f6199y0 != null;
    }
}
