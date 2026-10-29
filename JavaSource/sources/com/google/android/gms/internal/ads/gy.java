package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class gy extends ly {
    gy(int i7, String str, Boolean bool, Boolean bool2) {
        super(i7, str, bool, bool2, null);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(e()))) : (Boolean) f();
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(e(), ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(e(), ((Boolean) f()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(e(), ((Boolean) f()).booleanValue()));
    }
}
