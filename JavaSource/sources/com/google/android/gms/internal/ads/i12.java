package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class i12 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f9802a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    private List f9803b;

    i12() {
    }

    final void a(SharedPreferences sharedPreferences, List list) {
        this.f9803b = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    public final JSONObject b() {
        return this.f9802a;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.f9803b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.f9802a.remove(str);
                } else {
                    this.f9802a.put(str, obj);
                }
            } catch (JSONException e8) {
                r2.t.l().j(e8, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }
}
