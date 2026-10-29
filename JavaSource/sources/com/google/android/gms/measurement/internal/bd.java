package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final String f21908a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21909b;

    /* renamed from: c, reason: collision with root package name */
    private final t4.k0 f21910c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.j7 f21911d;

    bd(String str, Map map, t4.k0 k0Var, com.google.android.gms.internal.measurement.j7 j7Var) {
        this.f21908a = str;
        this.f21909b = map;
        this.f21910c = k0Var;
        this.f21911d = j7Var;
    }

    public final String a() {
        return this.f21908a;
    }

    public final Map b() {
        Map map = this.f21909b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final t4.k0 c() {
        return this.f21910c;
    }

    public final com.google.android.gms.internal.measurement.j7 d() {
        return this.f21911d;
    }
}
