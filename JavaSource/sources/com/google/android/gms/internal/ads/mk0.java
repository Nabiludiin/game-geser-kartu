package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class mk0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f12285a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ pk0 f12286b;

    public mk0(pk0 pk0Var, String str) {
        Objects.requireNonNull(pk0Var);
        this.f12286b = pk0Var;
        this.f12285a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        pk0 pk0Var = this.f12286b;
        synchronized (pk0Var) {
            try {
                Iterator it = pk0Var.d().iterator();
                while (it.hasNext()) {
                    ((nk0) it.next()).a(sharedPreferences, this.f12285a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
