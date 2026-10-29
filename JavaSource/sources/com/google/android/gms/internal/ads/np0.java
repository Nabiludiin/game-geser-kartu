package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class np0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f12829q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f12830r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ int f12831s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ qp0 f12832t;

    np0(qp0 qp0Var, String str, String str2, int i7) {
        this.f12829q = str;
        this.f12830r = str2;
        this.f12831s = i7;
        Objects.requireNonNull(qp0Var);
        this.f12832t = qp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f12829q);
        hashMap.put("cachedSrc", this.f12830r);
        hashMap.put("totalBytes", Integer.toString(this.f12831s));
        this.f12832t.w("onPrecacheEvent", hashMap);
    }
}
