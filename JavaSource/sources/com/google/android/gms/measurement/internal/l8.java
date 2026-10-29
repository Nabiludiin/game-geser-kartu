package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class l8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ boolean f22322q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22323r;

    l8(w9 w9Var, boolean z7) {
        this.f22322q = z7;
        Objects.requireNonNull(w9Var);
        this.f22323r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22323r;
        w6 w6Var = w9Var.f22928a;
        boolean g8 = w6Var.g();
        boolean d8 = w6Var.d();
        boolean z7 = this.f22322q;
        w6Var.P(z7);
        if (d8 == z7) {
            w6Var.a().w().b("Default data collection state already set to", Boolean.valueOf(z7));
        }
        if (w6Var.g() == g8 || w6Var.g() != w6Var.d()) {
            w6Var.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z7), Boolean.valueOf(g8));
        }
        w9Var.Y();
    }
}
