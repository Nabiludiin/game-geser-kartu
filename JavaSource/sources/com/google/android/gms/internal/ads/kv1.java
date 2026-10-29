package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class kv1 {

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f11267b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f11268c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11269d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f11270e;

    /* renamed from: a, reason: collision with root package name */
    private final Map f11266a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f11271f = new AtomicBoolean(false);

    public kv1(Executor executor) {
        this.f11268c = executor;
    }

    private final void g() {
        if (this.f11271f.getAndSet(true)) {
            return;
        }
        r2.t.l().q().y(new Runnable() { // from class: com.google.android.gms.internal.ads.hv1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                kv1.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        JSONObject g8;
        Map map;
        try {
            this.f11269d = true;
            ll0 j7 = r2.t.l().q().j();
            if (j7 != null && (g8 = j7.g()) != null) {
                this.f11267b = ((Boolean) s2.b0.c().d(uy.F4)).booleanValue() ? g8.optJSONObject("common_settings") : null;
                this.f11270e = g8.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = g8.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                Map map2 = this.f11266a;
                                if (map2.containsKey(optString2)) {
                                    map = (Map) map2.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    map2.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final void a() {
        g();
        this.f11268c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jv1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                kv1.this.d();
            }
        });
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) s2.b0.c().d(uy.D4)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f11269d) {
            f();
            if (((Boolean) s2.b0.c().d(uy.E4)).booleanValue()) {
                g();
            }
        }
        Map map = (Map) this.f11266a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a8 = mv1.a(this.f11270e, str, str2);
        if (a8 != null) {
            return (JSONObject) map.get(a8);
        }
        return null;
    }

    public final JSONObject c() {
        if (((Boolean) s2.b0.c().d(uy.F4)).booleanValue()) {
            return this.f11267b;
        }
        return null;
    }

    final /* synthetic */ void e() {
        this.f11268c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iv1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                kv1.this.f();
            }
        });
    }
}
