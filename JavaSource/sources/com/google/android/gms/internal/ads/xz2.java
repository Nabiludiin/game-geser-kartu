package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class xz2 implements qi2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zz2 f19319a;

    xz2(zz2 zz2Var) {
        Objects.requireNonNull(zz2Var);
        this.f19319a = zz2Var;
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final void a() {
        zz2 zz2Var = this.f19319a;
        synchronized (zz2Var) {
            zz2Var.l8(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zz2 zz2Var = this.f19319a;
        nt1 nt1Var = (nt1) obj;
        synchronized (zz2Var) {
            try {
                zz2Var.l8(nt1Var);
                if (((Boolean) s2.b0.c().d(uy.f17068c4)).booleanValue()) {
                    nt1Var.r().f14206a = zz2Var.j8();
                }
                zz2Var.k8().b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
