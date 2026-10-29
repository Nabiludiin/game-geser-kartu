package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class mp0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f12343q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f12344r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ int f12345s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f12346t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ long f12347u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ long f12348v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ boolean f12349w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ int f12350x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ int f12351y;

    /* renamed from: z, reason: collision with root package name */
    final /* synthetic */ qp0 f12352z;

    mp0(qp0 qp0Var, String str, String str2, int i7, int i8, long j7, long j8, boolean z7, int i9, int i10) {
        this.f12343q = str;
        this.f12344r = str2;
        this.f12345s = i7;
        this.f12346t = i8;
        this.f12347u = j7;
        this.f12348v = j8;
        this.f12349w = z7;
        this.f12350x = i9;
        this.f12351y = i10;
        Objects.requireNonNull(qp0Var);
        this.f12352z = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f12343q);
        hashMap.put("cachedSrc", this.f12344r);
        hashMap.put("bytesLoaded", Integer.toString(this.f12345s));
        hashMap.put("totalBytes", Integer.toString(this.f12346t));
        hashMap.put("bufferedDuration", Long.toString(this.f12347u));
        hashMap.put("totalDuration", Long.toString(this.f12348v));
        hashMap.put("cacheReady", true != this.f12349w ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f12350x));
        hashMap.put("playerPreparedCount", Integer.toString(this.f12351y));
        this.f12352z.w("onPrecacheEvent", hashMap);
    }
}
