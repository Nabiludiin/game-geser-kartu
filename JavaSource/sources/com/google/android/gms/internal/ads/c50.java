package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class c50 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mr0 f6263a;

    c50(mr0 mr0Var) {
        this.f6263a = mr0Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        r2.t.l().i(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        mr0 mr0Var = this.f6263a;
        new v2.v0(mr0Var.getContext(), mr0Var.p().f27051q, str, null, mr0Var.T() != null ? mr0Var.T().f6197x0 : null).b();
    }
}
