package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class i40 extends n30 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ k40 f9827q;

    /* synthetic */ i40(k40 k40Var, byte[] bArr) {
        Objects.requireNonNull(k40Var);
        this.f9827q = k40Var;
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final void t1(e30 e30Var, String str) {
        k40 k40Var = this.f9827q;
        if (k40Var.d() == null) {
            return;
        }
        k40Var.d().b(k40Var.e(e30Var), str);
    }
}
