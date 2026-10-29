package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: MyApplication */
final class e50 implements y50 {
    e50() {
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        mr0 mr0Var = (mr0) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(mr0Var.getContext()).edit();
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                edit.remove(jSONArray.getString(i7));
            }
            edit.apply();
        } catch (JSONException e8) {
            r2.t.l().i(e8, "GMSG clear local storage keys handler");
        }
    }
}
