package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class bx2 implements m64 {
    bx2(ex2 ex2Var) {
        Objects.requireNonNull(ex2Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        v2.n1.k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* synthetic */ void b(Object obj) {
        v2.n1.k("Notification of cache hit successful.");
    }
}
