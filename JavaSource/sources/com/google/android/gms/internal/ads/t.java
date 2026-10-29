package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15897a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f15898b;

    /* renamed from: c, reason: collision with root package name */
    private ac0 f15899c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15900d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15902f;

    /* renamed from: g, reason: collision with root package name */
    private long f15903g = 15000;

    /* renamed from: h, reason: collision with root package name */
    private final h0 f15904h = new h0(1.0f);

    /* renamed from: e, reason: collision with root package name */
    private pd1 f15901e = pd1.f13828a;

    public t(Context context, g0 g0Var) {
        this.f15897a = context.getApplicationContext();
        this.f15898b = g0Var;
    }

    public final t a(boolean z7) {
        this.f15900d = true;
        return this;
    }

    public final t b(pd1 pd1Var) {
        this.f15901e = pd1Var;
        return this;
    }

    public final t c(long j7) {
        this.f15903g = j7;
        return this;
    }

    public final b0 d() {
        rx3.h(!this.f15902f);
        if (this.f15899c == null) {
            this.f15899c = new z(false);
        }
        b0 b0Var = new b0(this, null);
        this.f15902f = true;
        return b0Var;
    }

    final /* synthetic */ Context e() {
        return this.f15897a;
    }

    final /* synthetic */ g0 f() {
        return this.f15898b;
    }

    final /* synthetic */ ac0 g() {
        return this.f15899c;
    }

    final /* synthetic */ boolean h() {
        return this.f15900d;
    }

    final /* synthetic */ pd1 i() {
        return this.f15901e;
    }

    final /* synthetic */ long j() {
        return this.f15903g;
    }

    final /* synthetic */ h0 k() {
        return this.f15904h;
    }
}
