package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ar1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5222a;

    /* renamed from: b, reason: collision with root package name */
    private final gq1 f5223b;

    /* renamed from: c, reason: collision with root package name */
    private final fn f5224c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f5225d;

    /* renamed from: e, reason: collision with root package name */
    private final r2.a f5226e;

    /* renamed from: f, reason: collision with root package name */
    private final iu f5227f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f5228g;

    /* renamed from: h, reason: collision with root package name */
    private final z10 f5229h;

    /* renamed from: i, reason: collision with root package name */
    private final tr1 f5230i;

    /* renamed from: j, reason: collision with root package name */
    private final ku1 f5231j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f5232k;

    /* renamed from: l, reason: collision with root package name */
    private final dt1 f5233l;

    /* renamed from: m, reason: collision with root package name */
    private final rx1 f5234m;

    /* renamed from: n, reason: collision with root package name */
    private final x73 f5235n;

    /* renamed from: o, reason: collision with root package name */
    private final v82 f5236o;

    /* renamed from: p, reason: collision with root package name */
    private final i92 f5237p;

    /* renamed from: q, reason: collision with root package name */
    private final a13 f5238q;

    /* renamed from: r, reason: collision with root package name */
    private final lx1 f5239r;

    /* renamed from: s, reason: collision with root package name */
    private final vy1 f5240s;

    public ar1(Context context, gq1 gq1Var, fn fnVar, w2.a aVar, r2.a aVar2, iu iuVar, Executor executor, w03 w03Var, tr1 tr1Var, ku1 ku1Var, ScheduledExecutorService scheduledExecutorService, rx1 rx1Var, x73 x73Var, v82 v82Var, dt1 dt1Var, i92 i92Var, a13 a13Var, lx1 lx1Var, vy1 vy1Var) {
        this.f5222a = context;
        this.f5223b = gq1Var;
        this.f5224c = fnVar;
        this.f5225d = aVar;
        this.f5226e = aVar2;
        this.f5227f = iuVar;
        this.f5228g = executor;
        this.f5229h = w03Var.f17964j;
        this.f5230i = tr1Var;
        this.f5231j = ku1Var;
        this.f5232k = scheduledExecutorService;
        this.f5234m = rx1Var;
        this.f5235n = x73Var;
        this.f5236o = v82Var;
        this.f5233l = dt1Var;
        this.f5237p = i92Var;
        this.f5238q = a13Var;
        this.f5239r = lx1Var;
        this.f5240s = vy1Var;
    }

    public static final s2.u3 k(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return t(optJSONObject);
    }

    public static final List l(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return w04.m();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return w04.m();
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
            s2.u3 t7 = t(optJSONArray.optJSONObject(i7));
            if (t7 != null) {
                arrayList.add(t7);
            }
        }
        return w04.u(arrayList);
    }

    private final a5.d m(JSONArray jSONArray, boolean z7, boolean z8, yw1 yw1Var) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return p64.a(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z8 ? jSONArray.length() : 1;
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f5239r.e().putLong(yw1Var.c(), r2.t.o().a());
        }
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(n(jSONArray.optJSONObject(i7), z7, null));
        }
        return p64.k(p64.m(arrayList), zq1.f20281a, this.f5228g);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final a5.d n(org.json.JSONObject r14, boolean r15, com.google.android.gms.internal.ads.yw1 r16) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L8
            a5.d r14 = com.google.android.gms.internal.ads.p64.a(r0)
            return r14
        L8:
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.f17242x4
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L55
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.f17250y4
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L55
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.f17258z4
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()
            java.lang.Object r2 = r3.d(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L53
            r5 = r2[r4]
            java.lang.String r6 = r14.getString(r5)     // Catch: org.json.JSONException -> L50
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L50
        L50:
            int r4 = r4 + 1
            goto L45
        L53:
            r12 = r1
            goto L56
        L55:
            r12 = r0
        L56:
            java.lang.String r1 = "url"
            java.lang.String r3 = r14.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L6a
            if (r12 == 0) goto L65
            goto L6a
        L65:
            a5.d r14 = com.google.android.gms.internal.ads.p64.a(r0)
            return r14
        L6a:
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.C2
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L93
            if (r16 == 0) goto L93
            com.google.android.gms.internal.ads.lx1 r1 = r13.f5239r
            android.os.Bundle r1 = r1.e()
            java.lang.String r2 = r16.c()
            com.google.android.gms.common.util.e r4 = r2.t.o()
            long r4 = r4.a()
            r1.putLong(r2, r4)
        L93:
            java.lang.String r1 = "scale"
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r14.optDouble(r1, r4)
            java.lang.String r1 = "is_transparent"
            r2 = 1
            boolean r1 = r14.optBoolean(r1, r2)
            java.lang.String r2 = "width"
            r6 = -1
            int r10 = r14.optInt(r2, r6)
            java.lang.String r2 = "height"
            int r7 = r14.optInt(r2, r6)
            if (r15 != 0) goto Ld3
            if (r12 == 0) goto Lb6
            r8 = r4
            r6 = r10
            goto Ld5
        Lb6:
            com.google.android.gms.internal.ads.gq1 r2 = r13.f5223b
            a5.d r1 = r2.a(r3, r4, r1)
            com.google.android.gms.internal.ads.pq1 r2 = new com.google.android.gms.internal.ads.pq1
            r6 = r10
            r2.<init>()
            java.util.concurrent.Executor r3 = r13.f5228g
            a5.d r1 = com.google.android.gms.internal.ads.p64.k(r1, r2, r3)
            java.lang.String r2 = "require"
            boolean r14 = r14.optBoolean(r2)
            a5.d r14 = r(r14, r1, r0)
            return r14
        Ld3:
            r6 = r10
            r8 = r4
        Ld5:
            com.google.android.gms.internal.ads.v10 r5 = new com.google.android.gms.internal.ads.v10
            r10 = r6
            r6 = 0
            android.net.Uri r14 = android.net.Uri.parse(r3)
            r11 = r7
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12)
            a5.d r14 = com.google.android.gms.internal.ads.p64.a(r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ar1.n(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.yw1):a5.d");
    }

    private static Integer o(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final a5.d p(JSONObject jSONObject, c03 c03Var, f03 f03Var, r2.b bVar, vj0 vj0Var) {
        final a5.d b8 = this.f5230i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), c03Var, f03Var, s(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), bVar, vj0Var);
        return p64.j(b8, new w54() { // from class: com.google.android.gms.internal.ads.uq1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                mr0 mr0Var = (mr0) obj;
                if (mr0Var == null || mr0Var.g() == null) {
                    throw new ce2(1, "Retrieve video view in html5 ad response failed.");
                }
                return a5.d.this;
            }
        }, cm0.f6506g);
    }

    private static a5.d q(a5.d dVar, Object obj) {
        final Object obj2 = null;
        return p64.h(dVar, Exception.class, new w54(obj2) { // from class: com.google.android.gms.internal.ads.vq1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj3) {
                v2.n1.l("Error during loading assets.", (Exception) obj3);
                return p64.a(null);
            }
        }, cm0.f6506g);
    }

    private static a5.d r(boolean z7, final a5.d dVar, Object obj) {
        return z7 ? p64.j(dVar, new w54() { // from class: com.google.android.gms.internal.ads.wq1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj2) {
                return obj2 != null ? a5.d.this : p64.c(new ce2(1, "Retrieve required value in native ad response failed."));
            }
        }, cm0.f6506g) : q(dVar, null);
    }

    private final s2.g5 s(int i7, int i8) {
        if (i7 == 0) {
            if (i8 == 0) {
                return s2.g5.N0();
            }
            i7 = 0;
        }
        return new s2.g5(this.f5222a, new k2.h(i7, i8));
    }

    private static final s2.u3 t(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new s2.u3(optString, optString2);
    }

    public final a5.d a(JSONObject jSONObject, String str, yw1 yw1Var) {
        return n(jSONObject.optJSONObject(str), this.f5229h.f19955r, yw1Var);
    }

    public final a5.d b(JSONObject jSONObject, String str, yw1 yw1Var) {
        z10 z10Var = this.f5229h;
        return m(jSONObject.optJSONArray("images"), z10Var.f19955r, z10Var.f19957t, yw1Var);
    }

    public final a5.d c(JSONObject jSONObject, String str, final c03 c03Var, final f03 f03Var, final r2.b bVar, final vj0 vj0Var) {
        if (!((Boolean) s2.b0.c().d(uy.bb)).booleanValue()) {
            return p64.a(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return p64.a(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return p64.a(null);
        }
        if (((Boolean) s2.b0.c().d(uy.f17242x4)).booleanValue()) {
            if (optJSONObject.has((String) s2.b0.c().d(uy.f17250y4))) {
                return p64.a(null);
            }
        }
        final String optString = optJSONObject.optString("base_url");
        final String optString2 = optJSONObject.optString("html");
        final s2.g5 s7 = s(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return p64.a(null);
        }
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f5239r.e().putLong(yw1.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.c(), r2.t.o().a());
        }
        final a5.d j7 = p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.qq1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return ar1.this.h(s7, c03Var, f03Var, bVar, vj0Var, optString, optString2, obj);
            }
        }, cm0.f6505f);
        return p64.j(j7, new w54() { // from class: com.google.android.gms.internal.ads.rq1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                if (((mr0) obj) != null) {
                    return a5.d.this;
                }
                throw new ce2(1, "Retrieve Web View from image ad response failed.");
            }
        }, cm0.f6506g);
    }

    public final a5.d d(JSONObject jSONObject, String str, yw1 yw1Var) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return p64.a(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return r(optJSONObject.optBoolean("require"), p64.k(m(optJSONArray, false, true, yw1Var), new hx3() { // from class: com.google.android.gms.internal.ads.sq1
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return ar1.this.i(optJSONObject, (List) obj);
            }
        }, this.f5228g), null);
    }

    public final a5.d e(JSONObject jSONObject, final r2.b bVar, final vj0 vj0Var) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return p64.a(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return p64.a(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return p64.a(null);
        }
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f5239r.e().putLong(yw1.NATIVE_ASSETS_LOADING_OMID_START.c(), r2.t.o().a());
        }
        return p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.tq1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return ar1.this.j(optString, vj0Var, bVar, obj);
            }
        }, cm0.f6505f);
    }

    public final a5.d f(a5.d dVar) {
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f5239r.e().putLong(yw1.NATIVE_ASSETS_LOADING_MEDIA_START.c(), r2.t.o().a());
        }
        im0 im0Var = new im0();
        p64.r(dVar, new oq1(this, im0Var), cm0.f6505f);
        return im0Var;
    }

    public final a5.d g(JSONObject jSONObject, c03 c03Var, f03 f03Var, r2.b bVar, vj0 vj0Var) {
        a5.d a8;
        ar1 ar1Var;
        JSONObject i7 = v2.r0.i(jSONObject, "html_containers", "instream");
        if (i7 != null) {
            return p(i7, c03Var, f03Var, bVar, vj0Var);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return p64.a(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z7 = false;
        if (((Boolean) s2.b0.c().d(uy.ab)).booleanValue() && optJSONObject.has("html")) {
            z7 = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z7) {
                int i8 = v2.n1.f26802b;
                w2.p.f("Required field 'vast_xml' or 'html' is missing");
                return p64.a(null);
            }
        } else if (!z7) {
            a8 = this.f5230i.a(optJSONObject, bVar, vj0Var);
            ar1Var = this;
            return q(p64.i(a8, ((Integer) s2.b0.c().d(uy.f17178p4)).intValue(), TimeUnit.SECONDS, ar1Var.f5232k), null);
        }
        ar1Var = this;
        a8 = ar1Var.p(optJSONObject, c03Var, f03Var, bVar, vj0Var);
        return q(p64.i(a8, ((Integer) s2.b0.c().d(uy.f17178p4)).intValue(), TimeUnit.SECONDS, ar1Var.f5232k), null);
    }

    final /* synthetic */ a5.d h(s2.g5 g5Var, c03 c03Var, f03 f03Var, r2.b bVar, vj0 vj0Var, String str, String str2, Object obj) {
        vy1 vy1Var;
        mr0 a8 = this.f5231j.a(g5Var, c03Var, f03Var);
        final gm0 f8 = gm0.f(a8);
        at1 a9 = this.f5233l.a();
        ot0 s02 = a8.s0();
        ly lyVar = uy.Ce;
        s02.L(a9, a9, a9, a9, a9, false, null, !((Boolean) s2.b0.c().d(lyVar)).booleanValue() ? new r2.b(this.f5222a, null, null) : bVar, null, true != ((Boolean) s2.b0.c().d(lyVar)).booleanValue() ? null : vj0Var, this.f5236o, this.f5235n, this.f5234m, null, a9, null, null, null, null, null, null);
        a8.O0("/getNativeAdViewSignals", x50.f18560s);
        a8.O0("/getNativeClickMeta", x50.f18561t);
        if (((Boolean) s2.b0.c().d(uy.u8)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.w8)).booleanValue() && (vy1Var = this.f5240s) != null) {
                a8.O0("/onDeviceStorageEvent", new h60(vy1Var));
            }
        }
        a8.s0().I(true);
        a8.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.yq1
            @Override // com.google.android.gms.internal.ads.mt0
            public final /* synthetic */ void a(boolean z7, int i7, String str3, String str4) {
                gm0 gm0Var = gm0.this;
                if (z7) {
                    gm0Var.g();
                    return;
                }
                int length = String.valueOf(i7).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i7);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                gm0Var.e(new ce2(1, sb.toString()));
            }
        });
        a8.a1(str, str2, null);
        return f8;
    }

    final /* synthetic */ s10 i(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer o7 = o(jSONObject, "bg_color");
        Integer o8 = o(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new s10(optString, list, o7, o8, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f5229h.f19958u, optBoolean);
    }

    final /* synthetic */ a5.d j(String str, vj0 vj0Var, r2.b bVar, Object obj) {
        r2.t.h();
        Context context = this.f5222a;
        i92 i92Var = this.f5237p;
        mr0 a8 = ds0.a(context, bu0.b(), "native-omid", false, false, this.f5224c, null, this.f5225d, null, null, this.f5226e, this.f5227f, null, null, i92Var, this.f5238q, this.f5234m);
        final gm0 f8 = gm0.f(a8);
        a8.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.xq1
            @Override // com.google.android.gms.internal.ads.mt0
            public final /* synthetic */ void a(boolean z7, int i7, String str2, String str3) {
                gm0.this.g();
            }
        });
        a8.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) s2.b0.c().d(uy.Ce)).booleanValue()) {
            if (vj0Var != null) {
                a8.s0().b0(vj0Var);
            }
            a8.s0().G(bVar);
        }
        return f8;
    }
}
