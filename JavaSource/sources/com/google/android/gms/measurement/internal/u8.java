package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class u8 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ long f22691q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22692r;

    u8(w9 w9Var, long j7) {
        this.f22691q = j7;
        Objects.requireNonNull(w9Var);
        this.f22692r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22692r;
        w9Var.h();
        w9Var.j();
        w6 w6Var = w9Var.f22928a;
        w6Var.a().v().a("Resetting analytics data (FE)");
        w6 w6Var2 = w9Var.f22928a;
        mc z7 = w6Var2.z();
        z7.h();
        z7.f22377f.c();
        w6Var2.L().p();
        boolean z8 = !w9Var.f22928a.g();
        d6 x7 = w6Var.x();
        x7.f22026f.b(this.f22691q);
        w6 w6Var3 = x7.f22928a;
        if (!TextUtils.isEmpty(w6Var3.x().f22043w.a())) {
            x7.f22043w.b(null);
        }
        x7.f22037q.b(0L);
        x7.f22038r.b(0L);
        if (!w6Var3.w().L()) {
            x7.y(z8);
        }
        x7.f22044x.b(null);
        x7.f22045y.b(0L);
        x7.f22046z.b(null);
        w6Var2.J().p();
        w6Var2.z().f22376e.a();
        w9Var.f22813s = z8;
        w6Var2.J().q(new AtomicReference());
    }
}
