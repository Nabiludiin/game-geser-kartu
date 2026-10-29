package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class yc2 implements sc2 {

    /* renamed from: a, reason: collision with root package name */
    private final wl1 f19488a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f19489b;

    /* renamed from: c, reason: collision with root package name */
    private final lq1 f19490c;

    /* renamed from: d, reason: collision with root package name */
    private final w13 f19491d;

    /* renamed from: e, reason: collision with root package name */
    private final dt1 f19492e;

    /* renamed from: f, reason: collision with root package name */
    private final lx1 f19493f;

    /* renamed from: g, reason: collision with root package name */
    private final w2.a f19494g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f19495h;

    /* renamed from: i, reason: collision with root package name */
    private final rj0 f19496i;

    public yc2(wl1 wl1Var, z64 z64Var, lq1 lq1Var, w13 w13Var, dt1 dt1Var, lx1 lx1Var, w2.a aVar, Context context, rj0 rj0Var) {
        this.f19494g = aVar;
        this.f19495h = context;
        this.f19496i = rj0Var;
        this.f19488a = wl1Var;
        this.f19489b = z64Var;
        this.f19490c = lq1Var;
        this.f19491d = w13Var;
        this.f19492e = dt1Var;
        this.f19493f = lx1Var;
    }

    private final a5.d g(final o03 o03Var, final c03 c03Var, final JSONObject jSONObject) {
        r2.b bVar;
        vj0 vj0Var;
        if (((Boolean) s2.b0.c().d(uy.f17248y2)).booleanValue()) {
            this.f19493f.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_START.c(), r2.t.o().a());
        }
        final a5.d b8 = this.f19491d.b();
        if (((Boolean) s2.b0.c().d(uy.Ce)).booleanValue()) {
            Context context = this.f19495h;
            vj0 a8 = r91.a(context, this.f19494g, c03Var, this.f19496i);
            bVar = new r2.b(context, a8, null);
            vj0Var = a8;
        } else {
            bVar = new r2.b(this.f19495h, null, null);
            vj0Var = null;
        }
        final r2.b bVar2 = bVar;
        final vj0 vj0Var2 = vj0Var;
        final a5.d a9 = this.f19490c.a(o03Var, c03Var, jSONObject, bVar2, vj0Var2);
        return p64.o(b8, a9).a(new Callable() { // from class: com.google.android.gms.internal.ads.wc2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return yc2.this.f(a9, b8, o03Var, c03Var, jSONObject, bVar2, vj0Var2);
            }
        }, this.f19489b);
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        h03 h03Var = c03Var.f6186s;
        return (h03Var == null || h03Var.f9279c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(final o03 o03Var, final c03 c03Var) {
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            this.f19493f.e().putLong(yw1.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.c(), r2.t.o().a());
        }
        a5.d b8 = this.f19491d.b();
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.xc2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yc2.this.c(c03Var, (xs1) obj);
            }
        };
        z64 z64Var = this.f19489b;
        return p64.j(p64.j(b8, w54Var, z64Var), new w54() { // from class: com.google.android.gms.internal.ads.tc2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yc2.this.d(o03Var, c03Var, (JSONArray) obj);
            }
        }, z64Var);
    }

    final /* synthetic */ a5.d c(c03 c03Var, final xs1 xs1Var) {
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            this.f19493f.e().putLong(yw1.RENDERING_NATIVE_ADS_PREPROCESS_START.c(), r2.t.o().a());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) s2.b0.c().d(uy.B9)).booleanValue() && com.google.android.gms.common.util.n.i()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", c03Var.f6186s.f9279c);
        jSONObject2.put("sdk_params", jSONObject);
        return p64.j(xs1Var.c("google.afma.nativeAds.preProcessJson", jSONObject2), new w54() { // from class: com.google.android.gms.internal.ads.uc2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yc2.this.e(xs1Var, (JSONObject) obj);
            }
        }, this.f19489b);
    }

    final /* synthetic */ a5.d d(o03 o03Var, c03 c03Var, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return p64.c(new j22(3));
        }
        int i7 = o03Var.f13136a.f11326a.f17966l;
        if (i7 <= 1) {
            return p64.k(g(o03Var, c03Var, jSONArray.getJSONObject(0)), vc2.f17554a, this.f19489b);
        }
        int length = jSONArray.length();
        if (((Boolean) s2.b0.c().d(uy.f17256z2)).booleanValue()) {
            this.f19493f.d("nsl", String.valueOf(length));
        }
        this.f19491d.a(Math.min(length, i7));
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 < length) {
                arrayList.add(g(o03Var, c03Var, jSONArray.getJSONObject(i8)));
            } else {
                arrayList.add(p64.c(new j22(3)));
            }
        }
        return p64.a(arrayList);
    }

    final /* synthetic */ a5.d e(xs1 xs1Var, JSONObject jSONObject) {
        this.f19491d.c(p64.a(xs1Var));
        if (!jSONObject.optBoolean("success")) {
            throw new ea0("process json failed");
        }
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            this.f19493f.e().putLong(yw1.RENDERING_NATIVE_ADS_PREPROCESS_END.c(), r2.t.o().a());
        }
        return p64.a(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    final /* synthetic */ kn1 f(a5.d dVar, a5.d dVar2, o03 o03Var, c03 c03Var, JSONObject jSONObject, r2.b bVar, vj0 vj0Var) {
        pn1 pn1Var = (pn1) dVar.get();
        xs1 xs1Var = (xs1) dVar2.get();
        ly lyVar = uy.f17248y2;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f19493f.e().putLong(yw1.RENDERING_WEBVIEW_CREATION_END.c(), r2.t.o().a());
        }
        qn1 d8 = this.f19488a.d(new i51(o03Var, c03Var, null), new bo1(pn1Var), new km1(jSONObject, xs1Var, bVar, vj0Var));
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            long a8 = r2.t.o().a();
            lx1 lx1Var = this.f19493f;
            lx1Var.e().putLong(yw1.RENDERING_AD_COMPONENT_CREATION_END.c(), a8);
            lx1Var.e().putLong(yw1.RENDERING_CONFIGURE_WEBVIEW_START.c(), a8);
        }
        d8.i().b();
        d8.j().a(xs1Var);
        d8.k().a(pn1Var.t());
        d8.l().a(this.f19492e, pn1Var.u());
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            this.f19493f.e().putLong(yw1.RENDERING_CONFIGURE_WEBVIEW_END.c(), r2.t.o().a());
        }
        return d8.h();
    }
}
