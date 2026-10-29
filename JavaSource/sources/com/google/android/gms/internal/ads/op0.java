package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class op0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f13433q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f13434r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f13435s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ qp0 f13436t;

    op0(qp0 qp0Var, String str, String str2, long j7) {
        this.f13433q = str;
        this.f13434r = str2;
        this.f13435s = j7;
        Objects.requireNonNull(qp0Var);
        this.f13436t = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f13433q);
        hashMap.put("cachedSrc", this.f13434r);
        hashMap.put("totalDuration", Long.toString(this.f13435s));
        this.f13436t.w("onPrecacheEvent", hashMap);
    }
}
