package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class sz2 implements qi2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ tz2 f15896a;

    sz2(tz2 tz2Var) {
        Objects.requireNonNull(tz2Var);
        this.f15896a = tz2Var;
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final void a() {
        tz2 tz2Var = this.f15896a;
        synchronized (tz2Var) {
            tz2Var.m8(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tz2 tz2Var = this.f15896a;
        nt1 nt1Var = (nt1) obj;
        synchronized (tz2Var) {
            try {
                tz2Var.m8(nt1Var);
                if (((Boolean) s2.b0.c().d(uy.f17068c4)).booleanValue()) {
                    nt1Var.r().f14206a = tz2Var.k8();
                }
                tz2Var.l8().b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
