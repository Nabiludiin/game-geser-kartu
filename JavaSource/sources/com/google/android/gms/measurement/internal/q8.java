package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class q8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f22536q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22537r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ long f22538s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Bundle f22539t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ boolean f22540u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ boolean f22541v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ boolean f22542w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ String f22543x;

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ w9 f22544y;

    q8(w9 w9Var, String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        this.f22536q = str;
        this.f22537r = str2;
        this.f22538s = j7;
        this.f22539t = bundle;
        this.f22540u = z7;
        this.f22541v = z8;
        this.f22542w = z9;
        this.f22543x = str3;
        Objects.requireNonNull(w9Var);
        this.f22544y = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22544y.v(this.f22536q, this.f22537r, this.f22538s, this.f22539t, this.f22540u, this.f22541v, this.f22542w, this.f22543x);
    }
}
