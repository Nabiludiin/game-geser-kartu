package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class gc implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final long f22184q;

    /* renamed from: r, reason: collision with root package name */
    final long f22185r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ hc f22186s;

    gc(hc hcVar, long j7, long j8) {
        Objects.requireNonNull(hcVar);
        this.f22186s = hcVar;
        this.f22184q = j7;
        this.f22185r = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22186s.f22209b.f22928a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.fc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                gc gcVar = gc.this;
                mc mcVar = gcVar.f22186s.f22209b;
                mcVar.h();
                w6 w6Var = mcVar.f22928a;
                w6Var.a().v().a("Application going to the background");
                w6Var.x().f22040t.b(true);
                mcVar.o(true);
                if (!w6Var.w().N()) {
                    long j7 = gcVar.f22185r;
                    kc kcVar = mcVar.f22377f;
                    kcVar.d(false, false, j7);
                    kcVar.b(j7);
                }
                w6Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(gcVar.f22184q));
                w6 w6Var2 = mcVar.f22928a;
                w9 B = w6Var2.B();
                B.h();
                w6 w6Var3 = B.f22928a;
                B.j();
                vb J = w6Var3.J();
                J.h();
                J.j();
                if (!J.y() || J.f22928a.C().W() >= 242600) {
                    w6Var3.J().t();
                }
                if (w6Var.w().H(null, c5.O0)) {
                    long D = w6Var.C().P(w6Var.e().getPackageName(), w6Var.w().R()) ? 1000L : w6Var.w().D(w6Var.e().getPackageName(), c5.E);
                    w6Var.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(D));
                    w6Var2.N().o(D);
                }
            }
        });
    }
}
