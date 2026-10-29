package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ef implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f7591q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f7592r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ gf f7593s;

    ef(gf gfVar, String str, long j7) {
        this.f7591q = str;
        this.f7592r = j7;
        Objects.requireNonNull(gfVar);
        this.f7593s = gfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf gfVar = this.f7593s;
        gfVar.D().a(this.f7591q, this.f7592r);
        gfVar.D().b(gfVar.toString());
    }
}
