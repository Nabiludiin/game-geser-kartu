package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class dh2 implements qi2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eh2 f7107a;

    dh2(eh2 eh2Var) {
        Objects.requireNonNull(eh2Var);
        this.f7107a = eh2Var;
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final void a() {
        eh2 eh2Var = this.f7107a;
        synchronized (eh2Var) {
            eh2Var.k8(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.qi2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eh2 eh2Var = this.f7107a;
        h21 h21Var = (h21) obj;
        synchronized (eh2Var) {
            try {
                if (eh2Var.j8() != null) {
                    if (h21Var.e() != null && eh2Var.j8().e() != null) {
                        h21Var.e().b(eh2Var.j8().e().a());
                    }
                    eh2Var.j8().a();
                }
                eh2Var.k8(h21Var);
                eh2Var.j8().b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
