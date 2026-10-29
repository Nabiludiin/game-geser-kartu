package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class e33 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h33 f7411a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j33 f7412b;

    e33(j33 j33Var, h33 h33Var) {
        this.f7411a = h33Var;
        Objects.requireNonNull(j33Var);
        this.f7412b = j33Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        j33 j33Var = this.f7412b;
        synchronized (j33Var) {
            j33Var.f(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        j33 j33Var = this.f7412b;
        synchronized (j33Var) {
            try {
                j33Var.f(null);
                j33Var.e().addFirst(this.f7411a);
                if (j33Var.g() == 1) {
                    j33Var.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
