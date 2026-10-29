package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class iy extends ly {
    iy(int i7, String str, Long l7, Long l8) {
        super(1, str, l7, l8, null);
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object a(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(e())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(e()))) : (Long) f();
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ void b(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(e(), ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(e(), ((Long) f()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final /* bridge */ /* synthetic */ Object d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(e(), ((Long) f()).longValue()));
    }
}
