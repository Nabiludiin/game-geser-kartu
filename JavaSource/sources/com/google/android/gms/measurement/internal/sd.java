package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* compiled from: MyApplication */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    private final long f22631a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.s6 f22632b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22633c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f22634d;

    /* renamed from: e, reason: collision with root package name */
    private final t4.k0 f22635e;

    /* renamed from: f, reason: collision with root package name */
    private final long f22636f;

    /* renamed from: g, reason: collision with root package name */
    private final long f22637g;

    /* renamed from: h, reason: collision with root package name */
    private final long f22638h;

    /* renamed from: i, reason: collision with root package name */
    private final int f22639i;

    /* synthetic */ sd(long j7, com.google.android.gms.internal.measurement.s6 s6Var, String str, Map map, t4.k0 k0Var, long j8, long j9, long j10, int i7, byte[] bArr) {
        this.f22631a = j7;
        this.f22632b = s6Var;
        this.f22633c = str;
        this.f22634d = map;
        this.f22635e = k0Var;
        this.f22636f = j8;
        this.f22637g = j9;
        this.f22638h = j10;
        this.f22639i = i7;
    }

    public final bd a() {
        return new bd(this.f22633c, this.f22634d, this.f22635e, null);
    }

    public final wc b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f22634d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j7 = this.f22631a;
        com.google.android.gms.internal.measurement.s6 s6Var = this.f22632b;
        String str = this.f22633c;
        t4.k0 k0Var = this.f22635e;
        return new wc(j7, s6Var.c(), str, bundle, k0Var.a(), this.f22637g, "");
    }

    public final long c() {
        return this.f22631a;
    }

    public final com.google.android.gms.internal.measurement.s6 d() {
        return this.f22632b;
    }

    public final String e() {
        return this.f22633c;
    }

    public final t4.k0 f() {
        return this.f22635e;
    }

    public final long g() {
        return this.f22636f;
    }

    public final long h() {
        return this.f22638h;
    }

    public final int i() {
        return this.f22639i;
    }
}
