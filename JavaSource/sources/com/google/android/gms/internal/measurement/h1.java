package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
final class h1 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    boolean f20989a;

    /* renamed from: b, reason: collision with root package name */
    final Set f20990b;

    /* renamed from: c, reason: collision with root package name */
    final Map f20991c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ i1 f20992d;

    /* synthetic */ h1(i1 i1Var, byte[] bArr) {
        Objects.requireNonNull(i1Var);
        this.f20992d = i1Var;
        this.f20989a = false;
        this.f20990b = new HashSet();
        this.f20991c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f20991c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f20989a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f20989a) {
            this.f20992d.a().clear();
        }
        i1 i1Var = this.f20992d;
        Set set = this.f20990b;
        i1Var.a().keySet().removeAll(set);
        Map map = this.f20991c;
        for (Map.Entry entry : map.entrySet()) {
            i1Var.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : i1Var.b()) {
            z4.z it = z4.w.c(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(i1Var, (String) it.next());
            }
        }
        return (!this.f20989a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z7) {
        a(str, Boolean.valueOf(z7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f8) {
        a(str, Float.valueOf(f8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        a(str, Integer.valueOf(i7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j7) {
        a(str, Long.valueOf(j7));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f20990b.add(str);
        return this;
    }
}
