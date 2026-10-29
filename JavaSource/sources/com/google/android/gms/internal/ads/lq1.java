package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class lq1 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f11731a;

    /* renamed from: b, reason: collision with root package name */
    private final ar1 f11732b;

    /* renamed from: c, reason: collision with root package name */
    private final gr1 f11733c;

    /* renamed from: d, reason: collision with root package name */
    private final lx1 f11734d;

    lq1(z64 z64Var, ar1 ar1Var, gr1 gr1Var, lx1 lx1Var) {
        this.f11731a = z64Var;
        this.f11732b = ar1Var;
        this.f11733c = gr1Var;
        this.f11734d = lx1Var;
    }

    private final a5.d e(a5.d dVar, yw1 yw1Var) {
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            p64.r(dVar, new iq1(this, yw1Var), this.f11731a);
        }
        return dVar;
    }

    private static final boolean f(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final a5.d a(final o03 o03Var, final c03 c03Var, final JSONObject jSONObject, r2.b bVar, vj0 vj0Var) {
        a5.d a8;
        JSONArray optJSONArray;
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            this.f11734d.e().putLong(yw1.RENDERING_NATIVE_ASSETS_LOADING_START.c(), r2.t.o().a());
        }
        final a5.d B0 = this.f11731a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.kq1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return lq1.this.b(o03Var, c03Var, jSONObject);
            }
        });
        e(B0, yw1.NATIVE_ASSETS_LOADING_BASIC_END);
        ar1 ar1Var = this.f11732b;
        final a5.d b8 = ar1Var.b(jSONObject, "images", yw1.NATIVE_ASSETS_LOADING_IMAGE_START);
        e(b8, yw1.NATIVE_ASSETS_LOADING_IMAGE_END);
        f03 f03Var = o03Var.f13137b.f12530b;
        final a5.d c8 = ar1Var.c(jSONObject, "images", c03Var, f03Var, bVar, vj0Var);
        e(c8, yw1.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final a5.d a9 = ar1Var.a(jSONObject, "secondary_image", yw1.NATIVE_ASSETS_LOADING_LOGO_START);
        e(a9, yw1.NATIVE_ASSETS_LOADING_LOGO_END);
        final a5.d a10 = ar1Var.a(jSONObject, "app_icon", yw1.NATIVE_ASSETS_LOADING_ICON_START);
        e(a10, yw1.NATIVE_ASSETS_LOADING_ICON_END);
        final a5.d d8 = ar1Var.d(jSONObject, "attribution", yw1.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        e(d8, yw1.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final a5.d g8 = ar1Var.g(jSONObject, c03Var, f03Var, bVar, vj0Var);
        e(g8, yw1.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) s2.b0.c().d(uy.ae)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i7 = 0;
                while (true) {
                    if (i7 >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i7);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i7++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                a8 = this.f11732b.f(g8);
                                e(a8, yw1.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        a8 = p64.a(new Bundle());
        final a5.d a11 = this.f11733c.a(jSONObject, "custom_assets");
        e(a11, yw1.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final a5.d e8 = this.f11732b.e(jSONObject, bVar, vj0Var);
        e(e8, yw1.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(B0);
        arrayList.add(b8);
        arrayList.add(c8);
        arrayList.add(a9);
        arrayList.add(a10);
        arrayList.add(d8);
        arrayList.add(g8);
        arrayList.add(a8);
        arrayList.add(a11);
        if (!((Boolean) s2.b0.c().d(uy.W5)).booleanValue() || f(jSONObject)) {
            arrayList.add(e8);
        }
        final a5.d dVar = a8;
        return p64.n(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.jq1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return lq1.this.c(B0, b8, a10, a9, d8, jSONObject, g8, dVar, c8, e8, a11);
            }
        }, this.f11731a);
    }

    final /* synthetic */ pn1 b(o03 o03Var, c03 c03Var, JSONObject jSONObject) {
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f11734d.e().putLong(yw1.NATIVE_ASSETS_LOADING_BASIC_START.c(), r2.t.o().a());
        }
        pn1 pn1Var = new pn1();
        pn1Var.A(jSONObject.optInt("template_id", -1));
        pn1Var.Y(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        pn1Var.i0(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        w03 w03Var = o03Var.f13136a.f11326a;
        if (!w03Var.f17962h.contains(Integer.toString(pn1Var.k0()))) {
            int k02 = pn1Var.k0();
            StringBuilder sb = new StringBuilder(String.valueOf(k02).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(k02);
            throw new ce2(1, sb.toString());
        }
        if (pn1Var.k0() == 3) {
            if (pn1Var.s() == null) {
                throw new ce2(1, "No custom template id for custom template ad response.");
            }
            if (!w03Var.f17963i.contains(pn1Var.s())) {
                throw new ce2(1, "Unexpected custom template id in the response.");
            }
        }
        pn1Var.V(jSONObject.optDouble("rating", -1.0d));
        String optString = jSONObject.optString("headline", null);
        if (c03Var.M) {
            r2.t.g();
            String c8 = v2.f2.c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(c8).length() + 3 + String.valueOf(optString).length());
            sb2.append(c8);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        pn1Var.f0("headline", optString);
        pn1Var.f0("body", jSONObject.optString("body", null));
        pn1Var.f0("call_to_action", jSONObject.optString("call_to_action", null));
        pn1Var.f0("store", jSONObject.optString("store", null));
        pn1Var.f0("price", jSONObject.optString("price", null));
        pn1Var.f0("advertiser", jSONObject.optString("advertiser", null));
        return pn1Var;
    }

    final /* synthetic */ pn1 c(a5.d dVar, a5.d dVar2, a5.d dVar3, a5.d dVar4, a5.d dVar5, JSONObject jSONObject, a5.d dVar6, a5.d dVar7, a5.d dVar8, a5.d dVar9, a5.d dVar10) {
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            this.f11734d.e().putLong(yw1.RENDERING_NATIVE_ASSETS_LOADING_END.c(), r2.t.o().a());
        }
        pn1 pn1Var = (pn1) dVar.get();
        pn1Var.Q((List) dVar2.get());
        pn1Var.W((l20) dVar3.get());
        pn1Var.X((l20) dVar4.get());
        pn1Var.P((e20) dVar5.get());
        pn1Var.R(ar1.l(jSONObject));
        pn1Var.S(ar1.k(jSONObject));
        mr0 mr0Var = (mr0) dVar6.get();
        if (mr0Var != null) {
            pn1Var.Z(mr0Var);
            pn1Var.T(mr0Var.Z());
            pn1Var.O(mr0Var.g());
        }
        pn1Var.h().putAll((Bundle) dVar7.get());
        mr0 mr0Var2 = (mr0) dVar8.get();
        if (mr0Var2 != null) {
            pn1Var.a0(mr0Var2);
            pn1Var.U(mr0Var2.Z());
        }
        if (!((Boolean) s2.b0.c().d(uy.W5)).booleanValue() || f(jSONObject)) {
            mr0 mr0Var3 = (mr0) dVar9.get();
            if (mr0Var3 != null) {
                pn1Var.b0(mr0Var3);
            }
        } else {
            pn1Var.c0(dVar9);
            pn1Var.e0(new im0());
        }
        for (dr1 dr1Var : (List) dVar10.get()) {
            if (dr1Var.f7248a != 1) {
                pn1Var.g0(dr1Var.f7249b, dr1Var.f7251d);
            } else {
                pn1Var.f0(dr1Var.f7249b, dr1Var.f7250c);
            }
        }
        return pn1Var;
    }

    final /* synthetic */ lx1 d() {
        return this.f11734d;
    }
}
