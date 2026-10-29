package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class dy implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7350a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f7351b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f7352c = new JSONObject();

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.f7352c = new JSONObject((String) wy.a(new jy3() { // from class: com.google.android.gms.internal.ads.cy
                    @Override // com.google.android.gms.internal.ads.jy3
                    public final /* synthetic */ Object a() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.f7350a) {
            try {
                if (this.f7351b != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                s2.b0.a();
                SharedPreferences a8 = ny.a(context);
                this.f7351b = a8;
                g(a8);
                if (!((Boolean) w00.f17934a.e()).booleanValue() && (sharedPreferences = this.f7351b) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.f7352c.optString(str, str2);
    }

    public final long c(String str, long j7) {
        return !str.startsWith("adapter:") ? j7 : this.f7352c.optLong(str, j7);
    }

    public final int d(String str, int i7) {
        return !str.startsWith("adapter:") ? i7 : this.f7352c.optInt(str, i7);
    }

    public final float e(String str, float f8) {
        return !str.startsWith("adapter:") ? f8 : (float) this.f7352c.optDouble(str, f8);
    }

    public final boolean f(String str, boolean z7) {
        return !str.startsWith("adapter:") ? z7 : this.f7352c.optBoolean(str, z7);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
