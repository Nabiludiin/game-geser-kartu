package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: MyApplication */
public final class ur5 extends az {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f16939g = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f16940b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16941c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16942d;

    /* renamed from: e, reason: collision with root package name */
    private final j9 f16943e;

    /* renamed from: f, reason: collision with root package name */
    private final n4 f16944f;

    static {
        pu5 pu5Var = new pu5();
        pu5Var.a("SinglePeriodTimeline");
        pu5Var.b(Uri.EMPTY);
        pu5Var.c();
    }

    public ur5(long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z7, boolean z8, boolean z9, Object obj, j9 j9Var, n4 n4Var) {
        this.f16940b = j10;
        this.f16941c = j11;
        this.f16942d = z7;
        j9Var.getClass();
        this.f16943e = j9Var;
        this.f16944f = n4Var;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final yx b(int i7, yx yxVar, long j7) {
        rx3.m(i7, 1, "index");
        boolean z7 = this.f16942d;
        yxVar.a(yx.f19894o, this.f16943e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z7, false, this.f16944f, 0L, this.f16941c, 0, 0, 0L);
        return yxVar;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final ot d(int i7, ot otVar, boolean z7) {
        rx3.m(i7, 1, "index");
        otVar.a(null, z7 ? f16939g : null, 0, this.f16940b, 0L, ck0.f6475e, false);
        return otVar;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final int e(Object obj) {
        return f16939g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.az
    public final Object f(int i7) {
        rx3.m(i7, 1, "index");
        return f16939g;
    }
}
