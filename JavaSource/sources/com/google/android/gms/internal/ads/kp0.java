package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class kp0 implements Runnable {
    final /* synthetic */ qp0 A;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f11179q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f11180r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f11181s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f11182t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ long f11183u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ long f11184v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ long f11185w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ boolean f11186x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ int f11187y;

    /* renamed from: z, reason: collision with root package name */
    final /* synthetic */ int f11188z;

    kp0(qp0 qp0Var, String str, String str2, long j7, long j8, long j9, long j10, long j11, boolean z7, int i7, int i8) {
        this.f11179q = str;
        this.f11180r = str2;
        this.f11181s = j7;
        this.f11182t = j8;
        this.f11183u = j9;
        this.f11184v = j10;
        this.f11185w = j11;
        this.f11186x = z7;
        this.f11187y = i7;
        this.f11188z = i8;
        Objects.requireNonNull(qp0Var);
        this.A = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f11179q);
        hashMap.put("cachedSrc", this.f11180r);
        hashMap.put("bufferedDuration", Long.toString(this.f11181s));
        hashMap.put("totalDuration", Long.toString(this.f11182t));
        if (((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f11183u));
            hashMap.put("qoeCachedBytes", Long.toString(this.f11184v));
            hashMap.put("totalBytes", Long.toString(this.f11185w));
            hashMap.put("reportTime", Long.toString(r2.t.o().a()));
        }
        hashMap.put("cacheReady", true != this.f11186x ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f11187y));
        hashMap.put("playerPreparedCount", Integer.toString(this.f11188z));
        this.A.w("onPrecacheEvent", hashMap);
    }
}
