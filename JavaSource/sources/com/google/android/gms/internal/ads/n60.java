package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.nativead.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.g;
import k2.x;
import l2.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class n60 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final z12 f12595a;

    public n60(z12 z12Var) {
        this.f12595a = z12Var;
    }

    private static final Bundle b(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e8) {
                r2.t.l().i(e8, "OutOfContextTestingGmsgHandler.generateNetworkExtras");
            }
        }
        return bundle;
    }

    private static final List c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                arrayList.add(jSONArray.getString(i7));
            }
            return arrayList;
        } catch (JSONException e8) {
            r2.t.l().i(e8, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        k2.g k7;
        k2.h hVar;
        if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue()) {
            a22 a22Var = new a22();
            String str = (String) map.get("adUnitId");
            if (!TextUtils.isEmpty(str)) {
                a22Var.h(str);
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                a22Var.i(str2);
            }
            if (((Boolean) s2.b0.c().d(uy.ua)).booleanValue()) {
                boolean z7 = false;
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                    z7 = true;
                }
                a22Var.n(z7);
                if (a22Var.g()) {
                    a.C0105a c0105a = new a.C0105a();
                    if (map.containsKey("keywords")) {
                        Iterator it = c((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            c0105a.b((String) it.next());
                        }
                    }
                    c0105a.c(AdMobAdapter.class, b(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                c0105a.a(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e8) {
                            r2.t.l().i(e8, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        c0105a.e((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        c0105a.f(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        c0105a.g((String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        c0105a.m((String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = c((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            c0105a.k((String) it2.next());
                        }
                    }
                    k7 = c0105a.l();
                } else {
                    g.a aVar = new g.a();
                    if (map.containsKey("keywords")) {
                        Iterator it3 = c((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            aVar.b((String) it3.next());
                        }
                    }
                    aVar.c(AdMobAdapter.class, b(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                aVar.a(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e9) {
                            r2.t.l().i(e9, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        aVar.e((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        aVar.f(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        aVar.g((String) map.get("requestAgent"));
                    }
                    k7 = aVar.k();
                }
                a22Var.j(k7);
                String str3 = (String) map.get("width");
                String str4 = (String) map.get("height");
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    hVar = k2.h.f24400i;
                } else {
                    try {
                        hVar = new k2.h(Integer.parseInt(str3), Integer.parseInt(str4));
                    } catch (NumberFormatException e10) {
                        r2.t.l().i(e10, "OutOfContextTestingGmsgHandler.generateAdSize");
                        hVar = k2.h.f24400i;
                    }
                }
                a22Var.k(hVar);
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    x.a aVar2 = new x.a();
                    if (map.containsKey("startMuted")) {
                        aVar2.d(((String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        aVar2.c(((String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        aVar2.b(((String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    a22Var.m(aVar2.a());
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (a22Var.f() != null && a22Var.b().equals("NATIVE"))) {
                    c.a aVar3 = new c.a();
                    if (map.containsKey("disableImageLoading")) {
                        aVar3.g(((String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str5 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str5)) {
                            try {
                                aVar3.d(Integer.parseInt(str5));
                            } catch (NumberFormatException e11) {
                                r2.t.l().i(e11, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio");
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        aVar3.f(((String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str6 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                aVar3.c(Integer.parseInt(str6));
                            } catch (NumberFormatException e12) {
                                r2.t.l().i(e12, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition");
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        aVar3.e(((String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    k2.x f8 = a22Var.f();
                    if (f8 != null) {
                        aVar3.h(f8);
                    }
                    a22Var.l(aVar3.a());
                }
            }
            String str7 = (String) map.get("action");
            if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(a22Var.a())) {
                return;
            }
            if (str7.equals("load") && !TextUtils.isEmpty(a22Var.b())) {
                this.f12595a.k8(a22Var);
            } else if (str7.equals("show")) {
                this.f12595a.l8(a22Var.a());
            }
        }
    }
}
