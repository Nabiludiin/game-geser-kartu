package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
final class pk0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13903a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f13904b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f13905c;

    /* renamed from: d, reason: collision with root package name */
    private final ak0 f13906d;

    pk0(Context context, ak0 ak0Var) {
        this.f13905c = context;
        this.f13906d = ak0Var;
    }

    final synchronized void a(nk0 nk0Var) {
        this.f13904b.add(nk0Var);
    }

    final synchronized void b(String str) {
        try {
            Map map = this.f13903a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f13905c) : this.f13905c.getSharedPreferences(str, 0);
            mk0 mk0Var = new mk0(this, str);
            map.put(str, mk0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(mk0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void c(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f13906d.b();
        }
    }

    final /* synthetic */ List d() {
        return this.f13904b;
    }
}
