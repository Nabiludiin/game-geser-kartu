package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class dd1 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference f7059q;

    @Override // java.lang.Runnable
    public final void run() {
        ed1 ed1Var = (ed1) this.f7059q.get();
        if (ed1Var != null) {
            ed1Var.K0(ad1.f4886a);
        }
    }
}
