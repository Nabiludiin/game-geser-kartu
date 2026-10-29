package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class v83 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f17439a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17440b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f17441c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17442d = ((Long) s2.b0.c().d(uy.I)).longValue() * 1000;

    public v83(Object obj, com.google.android.gms.common.util.e eVar) {
        this.f17439a = obj;
        this.f17441c = eVar;
        this.f17440b = eVar.a();
    }

    public final Object a() {
        return this.f17439a;
    }

    public final boolean b() {
        return this.f17441c.a() >= this.f17440b + this.f17442d;
    }

    public final long c() {
        return (this.f17442d + Math.min(Math.max(((Long) s2.b0.c().d(uy.C)).longValue(), -900000L), 10000L)) - (this.f17441c.a() - this.f17440b);
    }

    public final long d() {
        return this.f17440b;
    }
}
