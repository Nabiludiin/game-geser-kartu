package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class i1 implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private final Map f21025a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f21026b = new HashSet();

    private final Object c(String str, Object obj) {
        Object obj2 = this.f21025a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    final /* synthetic */ Map a() {
        return this.f21025a;
    }

    final /* synthetic */ Set b() {
        return this.f21026b;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f21025a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new h1(this, null);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f21025a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z7) {
        return ((Boolean) c(str, Boolean.valueOf(z7))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f8) {
        return ((Float) c(str, Float.valueOf(f8))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        return ((Integer) c(str, Integer.valueOf(i7))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j7) {
        return ((Long) c(str, Long.valueOf(j7))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) c(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) c(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f21026b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f21026b.remove(onSharedPreferenceChangeListener);
    }
}
