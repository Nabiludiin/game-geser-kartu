package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: MyApplication */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21844a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21845b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21846c;

    /* renamed from: d, reason: collision with root package name */
    private long f21847d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d6 f21848e;

    public a6(d6 d6Var, String str, long j7) {
        Objects.requireNonNull(d6Var);
        this.f21848e = d6Var;
        p3.o.g(str);
        this.f21844a = str;
        this.f21845b = j7;
    }

    public final long a() {
        if (!this.f21846c) {
            this.f21846c = true;
            d6 d6Var = this.f21848e;
            this.f21847d = d6Var.p().getLong(this.f21844a, this.f21845b);
        }
        return this.f21847d;
    }

    public final void b(long j7) {
        SharedPreferences.Editor edit = this.f21848e.p().edit();
        edit.putLong(this.f21844a, j7);
        edit.apply();
        this.f21847d = j7;
    }
}
