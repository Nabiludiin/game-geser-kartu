package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class ky extends ly {
    ky(int i7, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(e())) : (String) f();
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putString(e(), (String) obj);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return jSONObject.optString(e(), (String) f());
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(e(), (String) f());
    }
}
