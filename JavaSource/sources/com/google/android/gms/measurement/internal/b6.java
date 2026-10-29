package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;

/* compiled from: MyApplication */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    final String f21892a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21893b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21894c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21895d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d6 f21896e;

    /* synthetic */ b6(d6 d6Var, String str, long j7, byte[] bArr) {
        Objects.requireNonNull(d6Var);
        this.f21896e = d6Var;
        p3.o.g("health_monitor");
        p3.o.a(j7 > 0);
        this.f21892a = "health_monitor:start";
        this.f21893b = "health_monitor:count";
        this.f21894c = "health_monitor:value";
        this.f21895d = j7;
    }

    private final void c() {
        d6 d6Var = this.f21896e;
        d6Var.h();
        long a8 = d6Var.f22928a.f().a();
        SharedPreferences.Editor edit = d6Var.p().edit();
        edit.remove(this.f21893b);
        edit.remove(this.f21894c);
        edit.putLong(this.f21892a, a8);
        edit.apply();
    }

    private final long d() {
        return this.f21896e.p().getLong(this.f21892a, 0L);
    }

    public final void a(String str, long j7) {
        d6 d6Var = this.f21896e;
        d6Var.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences p7 = d6Var.p();
        String str2 = this.f21893b;
        long j8 = p7.getLong(str2, 0L);
        if (j8 <= 0) {
            SharedPreferences.Editor edit = d6Var.p().edit();
            edit.putString(this.f21894c, str);
            edit.putLong(str2, 1L);
            edit.apply();
            return;
        }
        long nextLong = d6Var.f22928a.C().q0().nextLong() & Long.MAX_VALUE;
        long j9 = j8 + 1;
        long j10 = Long.MAX_VALUE / j9;
        SharedPreferences.Editor edit2 = d6Var.p().edit();
        if (nextLong < j10) {
            edit2.putString(this.f21894c, str);
        }
        edit2.putLong(str2, j9);
        edit2.apply();
    }

    public final Pair b() {
        long abs;
        d6 d6Var = this.f21896e;
        d6Var.h();
        d6Var.h();
        long d8 = d();
        if (d8 == 0) {
            c();
            abs = 0;
        } else {
            abs = Math.abs(d8 - d6Var.f22928a.f().a());
        }
        long j7 = this.f21895d;
        if (abs < j7) {
            return null;
        }
        if (abs > j7 + j7) {
            c();
            return null;
        }
        String string = d6Var.p().getString(this.f21894c, null);
        long j8 = d6Var.p().getLong(this.f21893b, 0L);
        c();
        return (string == null || j8 <= 0) ? d6.A : new Pair(string, Long.valueOf(j8));
    }
}
