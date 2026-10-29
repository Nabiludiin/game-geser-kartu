package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class hc {

    /* renamed from: a, reason: collision with root package name */
    private gc f22208a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mc f22209b;

    hc(mc mcVar) {
        Objects.requireNonNull(mcVar);
        this.f22209b = mcVar;
    }

    final void a() {
        mc mcVar = this.f22209b;
        mcVar.h();
        gc gcVar = this.f22208a;
        if (gcVar != null) {
            mcVar.t().removeCallbacks(gcVar);
        }
        w6 w6Var = mcVar.f22928a;
        w6Var.x().f22040t.b(false);
        mcVar.o(false);
        if (w6Var.w().H(null, c5.U0)) {
            w6 w6Var2 = mcVar.f22928a;
            if (w6Var2.B().v0()) {
                w6Var.a().w().a("Retrying trigger URI registration in foreground");
                w6Var2.B().x0();
            }
        }
    }

    final void b(long j7) {
        mc mcVar = this.f22209b;
        this.f22208a = new gc(this, mcVar.f22928a.f().a(), j7);
        mcVar.t().postDelayed(this.f22208a, 2000L);
    }
}
