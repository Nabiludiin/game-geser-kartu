package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class jy extends ly {
    jy(int i7, String str, Float f8, Float f9) {
        super(1, str, f8, f9, null);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(e()))) : (Float) f();
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(e(), ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(e(), ((Float) f()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(e(), ((Float) f()).floatValue()));
    }
}
