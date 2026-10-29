package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class dw2 implements qi2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hw2 f7340a;

    dw2(hw2 hw2Var) {
        Objects.requireNonNull(hw2Var);
        this.f7340a = hw2Var;
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final void a() {
        hw2 hw2Var = this.f7340a;
        synchronized (hw2Var) {
            hw2Var.A = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        b21 b21Var = (b21) obj;
        hw2 hw2Var = this.f7340a;
        synchronized (hw2Var) {
            try {
                b21 b21Var2 = hw2Var.A;
                if (b21Var2 != null) {
                    b21Var2.a();
                }
                hw2Var.A = b21Var;
                b21Var.k(hw2Var);
                hw2Var.k8().f(new c21(b21Var, hw2Var, hw2Var.k8(), hw2Var.l8()));
                b21Var.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
