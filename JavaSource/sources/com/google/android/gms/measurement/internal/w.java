package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class w implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ b8 f22756q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ x f22757r;

    w(x xVar, b8 b8Var) {
        this.f22756q = b8Var;
        Objects.requireNonNull(xVar);
        this.f22757r = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b8 b8Var = this.f22756q;
        b8Var.c();
        if (f.a()) {
            b8Var.b().t(this);
            return;
        }
        x xVar = this.f22757r;
        boolean c8 = xVar.c();
        xVar.e(0L);
        if (c8) {
            xVar.a();
        }
    }
}
