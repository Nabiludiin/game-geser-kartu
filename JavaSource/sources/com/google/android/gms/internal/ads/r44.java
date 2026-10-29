package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class r44 extends u44 {
    r44(a5.d dVar, Class cls, w54 w54Var) {
        super(dVar, cls, w54Var);
    }

    @Override // com.google.android.gms.internal.ads.u44
    final /* synthetic */ void D(Object obj) {
        v((a5.d) obj);
    }

    @Override // com.google.android.gms.internal.ads.u44
    final /* bridge */ /* synthetic */ Object E(Object obj, Throwable th) {
        w54 w54Var = (w54) obj;
        a5.d d8 = w54Var.d(th);
        rx3.l(d8, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w54Var);
        return d8;
    }
}
