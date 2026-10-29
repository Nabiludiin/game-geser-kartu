package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class jp0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f10679q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f10680r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ int f10681s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f10682t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ qp0 f10683u;

    jp0(qp0 qp0Var, String str, String str2, int i7, int i8, boolean z7) {
        this.f10679q = str;
        this.f10680r = str2;
        this.f10681s = i7;
        this.f10682t = i8;
        Objects.requireNonNull(qp0Var);
        this.f10683u = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f10679q);
        hashMap.put("cachedSrc", this.f10680r);
        hashMap.put("bytesLoaded", Integer.toString(this.f10681s));
        hashMap.put("totalBytes", Integer.toString(this.f10682t));
        hashMap.put("cacheReady", "0");
        this.f10683u.w("onPrecacheEvent", hashMap);
    }
}
