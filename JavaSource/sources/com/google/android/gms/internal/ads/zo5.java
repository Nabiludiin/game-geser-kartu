package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class zo5 implements qr5 {

    /* renamed from: a, reason: collision with root package name */
    public final qr5 f20260a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20261b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap5 f20262c;

    public zo5(ap5 ap5Var, qr5 qr5Var) {
        Objects.requireNonNull(ap5Var);
        this.f20262c = ap5Var;
        this.f20260a = qr5Var;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final int a(hb5 hb5Var, wj4 wj4Var, int i7) {
        ap5 ap5Var = this.f20262c;
        if (ap5Var.l()) {
            return -3;
        }
        if (this.f20261b) {
            wj4Var.g(4);
            return -4;
        }
        long j7 = ap5Var.j();
        int a8 = this.f20260a.a(hb5Var, wj4Var, i7);
        if (a8 != -5) {
            long j8 = ap5Var.f5202u;
            if (j8 == Long.MIN_VALUE || ((a8 != -4 || wj4Var.f18273f < j8) && !(a8 == -3 && j7 == Long.MIN_VALUE && !wj4Var.f18272e))) {
                return a8;
            }
            wj4Var.a();
            wj4Var.g(4);
            this.f20261b = true;
            return -4;
        }
        eq5 eq5Var = hb5Var.f9416b;
        eq5Var.getClass();
        int i8 = eq5Var.J;
        if (i8 == 0) {
            if (eq5Var.K != 0) {
                i8 = 0;
            }
            return -5;
        }
        int i9 = ap5Var.f5202u == Long.MIN_VALUE ? eq5Var.K : 0;
        xn5 a9 = eq5Var.a();
        a9.h(i8);
        a9.i(i9);
        hb5Var.f9416b = a9.m();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final boolean b() {
        return !this.f20262c.l() && this.f20260a.b();
    }

    public final void c() {
        this.f20261b = false;
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final void d() {
        this.f20260a.d();
    }

    @Override // com.google.android.gms.internal.ads.qr5
    public final int g(long j7) {
        if (this.f20262c.l()) {
            return -3;
        }
        return this.f20260a.g(j7);
    }
}
