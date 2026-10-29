package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ug2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16748a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f16749b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f16750c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f16751d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f16752e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Executor f16753f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f16754g;

    ug2(Executor executor) {
        this.f16753f = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void h() {
        this.f16749b.clear();
        this.f16748a.clear();
        this.f16752e.clear();
        this.f16751d.clear();
        l();
        j();
        k();
    }

    private final synchronized void j() {
        JSONObject g8;
        if (!((Boolean) c10.f6211e.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.f17066c2)).booleanValue() && (g8 = r2.t.l().q().j().g()) != null) {
                try {
                    JSONArray jSONArray = g8.getJSONArray("signal_adapters");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i7);
                        Bundle p7 = p(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f16749b.put(optString, new yg2(optString, optBoolean2, optBoolean, true, p7));
                        }
                    }
                } catch (JSONException e8) {
                    v2.n1.l("Malformed config loading JSON.", e8);
                }
            }
        }
    }

    private final synchronized void k() {
        JSONObject g8;
        try {
            if (!((Boolean) c10.f6208b.e()).booleanValue()) {
                if (((Boolean) s2.b0.c().d(uy.f17075d2)).booleanValue() && (g8 = r2.t.l().q().j().g()) != null) {
                    JSONArray jSONArray = g8.getJSONArray("adapter_settings");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i7);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                yg2 yg2Var = new yg2(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f16751d.put(optString, yg2Var);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f16752e.put(optString, yg2Var);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e8) {
            v2.n1.l("Malformed config loading JSON.", e8);
        } finally {
        }
    }

    private final synchronized void l() {
        JSONArray optJSONArray;
        try {
            JSONObject g8 = r2.t.l().q().j().g();
            if (g8 != null) {
                try {
                    JSONArray optJSONArray2 = g8.optJSONArray("ad_unit_id_settings");
                    this.f16754g = g8.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i7);
                            String lowerCase = ((Boolean) s2.b0.c().d(uy.Vb)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                    arrayList.addAll(m(optJSONArray.getJSONObject(i8), optString));
                                }
                            }
                            n(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e8) {
                    v2.n1.l("Malformed config loading JSON.", e8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List m(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle p7 = p(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        String optString = optJSONArray.optString(i7, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String str2 = (String) arrayList2.get(i8);
                        e(str2);
                        if (((wg2) this.f16748a.get(str2)) != null) {
                            arrayList.add(new wg2(str2, str, p7));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    private final synchronized void n(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.f16750c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List list2 = (List) map2.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map2.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized z04 o(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(r2.t.l().q().j().d())) {
                boolean matches = Pattern.matches((String) s2.b0.c().d(uy.J3), str);
                boolean matches2 = Pattern.matches((String) s2.b0.c().d(uy.K3), str);
                if (matches) {
                    hashMap = new HashMap(this.f16752e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f16751d);
                }
                return z04.c(hashMap);
            }
            return z04.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle p(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void a() {
        r2.t.l().q().y(new Runnable() { // from class: com.google.android.gms.internal.ads.tg2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ug2.this.f();
            }
        });
        this.f16753f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.rg2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ug2.this.g();
            }
        });
    }

    public final synchronized Map b() {
        if (TextUtils.isEmpty(r2.t.l().q().j().d())) {
            return z04.a();
        }
        return z04.c(this.f16749b);
    }

    public final synchronized Map c(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(r2.t.l().q().j().d()) && (map = (Map) this.f16750c.get(str)) != null) {
                List<wg2> list = (List) map.get(str2);
                if (list == null) {
                    String a8 = mv1.a(this.f16754g, str2, str);
                    if (((Boolean) s2.b0.c().d(uy.Vb)).booleanValue()) {
                        a8 = a8.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(a8);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (wg2 wg2Var : list) {
                        String str3 = wg2Var.f18244a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(wg2Var.f18245b);
                    }
                    return z04.c(hashMap);
                }
            }
            return z04.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map d(String str, String str2) {
        HashMap hashMap;
        try {
            Map c8 = c(str, str2);
            z04 o7 = o(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : c8.entrySet()) {
                String str3 = (String) entry.getKey();
                if (o7.containsKey(str3)) {
                    yg2 yg2Var = (yg2) o7.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new yg2(str3, yg2Var.f19577b, yg2Var.f19578c, yg2Var.f19579d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            j34 c9 = o7.entrySet().c();
            while (c9.hasNext()) {
                Map.Entry entry2 = (Map.Entry) c9.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((yg2) entry2.getValue()).f19579d) {
                    hashMap.put(str4, (yg2) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.f16748a;
            if (!map.containsKey(str)) {
                map.put(str, new wg2(str, "", new Bundle()));
            }
        }
    }

    final /* synthetic */ void f() {
        this.f16753f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sg2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ug2.this.h();
            }
        });
    }
}
