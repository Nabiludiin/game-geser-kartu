package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class cd1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference f6381q;

    @Override // java.lang.Runnable
    public final void run() {
        ed1 ed1Var = (ed1) this.f6381q.get();
        if (ed1Var != null) {
            ed1Var.K0(bd1.f5717a);
        }
    }
}
