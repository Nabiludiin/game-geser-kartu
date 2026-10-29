package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vm implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ wm f17670q;

    vm(wm wmVar) {
        Objects.requireNonNull(wmVar);
        this.f17670q = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wm wmVar = this.f17670q;
        synchronized (wmVar.p()) {
            if (wmVar.q()) {
                return;
            }
            wmVar.r(true);
            try {
                wmVar.n();
            } catch (Exception e8) {
                this.f17670q.o().c(2023, -1L, e8);
            }
            wm wmVar2 = this.f17670q;
            synchronized (wmVar2.p()) {
                wmVar2.r(false);
            }
        }
    }
}
