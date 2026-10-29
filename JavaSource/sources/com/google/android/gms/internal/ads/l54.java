package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class l54 extends n54 {
    l54(a5.d dVar, w54 w54Var) {
        super(dVar, w54Var);
    }

    @Override // com.google.android.gms.internal.ads.n54
    final /* synthetic */ void D(Object obj) {
        v((a5.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.n54
    final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) {
        w54 w54Var = (w54) obj;
        a5.d d8 = w54Var.d(obj2);
        rx3.l(d8, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w54Var);
        return d8;
    }
}
