package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: MyApplication */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21997a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21998b;

    /* renamed from: c, reason: collision with root package name */
    private String f21999c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d6 f22000d;

    public c6(d6 d6Var, String str, String str2) {
        Objects.requireNonNull(d6Var);
        this.f22000d = d6Var;
        p3.o.g(str);
        this.f21997a = str;
    }

    public final String a() {
        if (!this.f21998b) {
            this.f21998b = true;
            d6 d6Var = this.f22000d;
            this.f21999c = d6Var.p().getString(this.f21997a, null);
        }
        return this.f21999c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f22000d.p().edit();
        edit.putString(this.f21997a, str);
        edit.apply();
        this.f21999c = str;
    }
}
