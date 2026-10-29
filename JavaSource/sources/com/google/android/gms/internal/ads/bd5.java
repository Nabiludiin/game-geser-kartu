package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: MyApplication */
public final class bd5 implements ob5 {

    /* renamed from: q, reason: collision with root package name */
    private boolean f5722q;

    /* renamed from: r, reason: collision with root package name */
    private long f5723r;

    /* renamed from: s, reason: collision with root package name */
    private long f5724s;

    /* renamed from: t, reason: collision with root package name */
    private yk f5725t = yk.f19629d;

    public bd5(pd1 pd1Var) {
    }

    public final void a() {
        if (this.f5722q) {
            return;
        }
        this.f5724s = SystemClock.elapsedRealtime();
        this.f5722q = true;
    }

    public final void b() {
        if (this.f5722q) {
            c(f());
            this.f5722q = false;
        }
    }

    public final void c(long j7) {
        this.f5723r = j7;
        if (this.f5722q) {
            this.f5724s = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final long f() {
        long j7 = this.f5723r;
        if (!this.f5722q) {
            return j7;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5724s;
        yk ykVar = this.f5725t;
        return j7 + (ykVar.f19630a == 1.0f ? hi2.N(elapsedRealtime) : ykVar.a(elapsedRealtime));
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public /* synthetic */ boolean g() {
        return nb5.a(this);
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final yk i() {
        return this.f5725t;
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final void v(yk ykVar) {
        if (this.f5722q) {
            c(f());
        }
        this.f5725t = ykVar;
    }
}
