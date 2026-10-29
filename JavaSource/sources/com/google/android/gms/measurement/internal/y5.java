package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: MyApplication */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22878a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22879b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22880c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22881d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d6 f22882e;

    public y5(d6 d6Var, String str, boolean z7) {
        Objects.requireNonNull(d6Var);
        this.f22882e = d6Var;
        p3.o.g(str);
        this.f22878a = str;
        this.f22879b = z7;
    }

    public final boolean a() {
        if (!this.f22880c) {
            this.f22880c = true;
            d6 d6Var = this.f22882e;
            this.f22881d = d6Var.p().getBoolean(this.f22878a, this.f22879b);
        }
        return this.f22881d;
    }

    public final void b(boolean z7) {
        SharedPreferences.Editor edit = this.f22882e.p().edit();
        edit.putBoolean(this.f22878a, z7);
        edit.apply();
        this.f22881d = z7;
    }
}
