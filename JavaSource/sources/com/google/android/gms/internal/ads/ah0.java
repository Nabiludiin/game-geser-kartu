package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ah0 extends yg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4959a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f4960b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f4961c;

    /* renamed from: d, reason: collision with root package name */
    private final fa0 f4962d;

    /* renamed from: e, reason: collision with root package name */
    private final w2.a f4963e;

    public ah0(Context context, fa0 fa0Var, w2.a aVar) {
        this.f4960b = context.getApplicationContext();
        this.f4963e = aVar;
        this.f4962d = fa0Var;
    }

    public static JSONObject b(Context context, w2.a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) w00.f17937d.e()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f27051q);
            jSONObject.put("mf", w00.f17938e.e());
            jSONObject.put("cl", "811902923");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", k3.k.f24503a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", k3.k.f24503a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.yg0
    public final a5.d a() {
        synchronized (this.f4959a) {
            try {
                if (this.f4961c == null) {
                    this.f4961c = this.f4960b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f4961c;
        if (r2.t.o().a() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) w00.f17939f.e()).longValue()) {
            return p64.a(null);
        }
        return p64.k(this.f4962d.b(b(this.f4960b, this.f4963e)), new hx3() { // from class: com.google.android.gms.internal.ads.zg0
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                ah0.this.c((JSONObject) obj);
                return null;
            }
        }, cm0.f6506g);
    }

    final /* synthetic */ Void c(JSONObject jSONObject) {
        ly lyVar = uy.f17045a;
        s2.b0.a();
        Context context = this.f4960b;
        SharedPreferences b8 = ny.b(context);
        if (b8 == null) {
            return null;
        }
        SharedPreferences.Editor edit = b8.edit();
        Objects.requireNonNull(s2.b0.b());
        int i7 = m00.f12001a;
        s2.b0.b().d(edit, 1, jSONObject);
        s2.b0.a();
        edit.commit();
        if (((Boolean) w00.f17936c.e()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            s2.b0.a();
            SharedPreferences a8 = ny.a(context);
            if (a8 != null) {
                SharedPreferences.Editor edit2 = a8.edit();
                s2.b0.b();
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
                edit2.putString("flag_configuration", jSONObject2.toString());
                edit2.commit();
            }
        }
        SharedPreferences sharedPreferences = this.f4961c;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", r2.t.o().a()).apply();
        return null;
    }
}
