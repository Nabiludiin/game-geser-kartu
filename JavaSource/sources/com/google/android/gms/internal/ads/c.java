package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private eq5 f6137a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f6138b;

    /* synthetic */ c(d dVar, byte[] bArr) {
        Objects.requireNonNull(dVar);
        this.f6138b = dVar;
    }

    public final void a(final te0 te0Var) {
        xn5 xn5Var = new xn5();
        xn5Var.s0(te0Var.f16149a);
        xn5Var.t0(te0Var.f16150b);
        xn5Var.l0("video/raw");
        this.f6137a = xn5Var.m();
        this.f6138b.g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qv5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c.this.f6138b.f().e(te0Var);
            }
        });
    }

    public final void b(long j7, long j8, boolean z7) {
        if (z7) {
            d dVar = this.f6138b;
            if (dVar.d() != null) {
                dVar.g().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ov5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c.this.f6138b.f().b();
                    }
                });
            }
        }
        eq5 eq5Var = this.f6137a;
        if (eq5Var == null) {
            eq5Var = new xn5().m();
        }
        eq5 eq5Var2 = eq5Var;
        d dVar2 = this.f6138b;
        dVar2.h().f(j8, j7, eq5Var2, null);
        ((d1) dVar2.n().remove()).K(j7);
    }
}
