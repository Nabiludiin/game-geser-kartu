package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class zr implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ as f20288q;

    zr(as asVar) {
        Objects.requireNonNull(asVar);
        this.f20288q = asVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        as asVar = this.f20288q;
        synchronized (asVar.f()) {
            if (asVar.g().get() && asVar.h()) {
                asVar.g().set(false);
                int i7 = v2.n1.f26802b;
                w2.p.a("App went background");
                Iterator it = asVar.i().iterator();
                while (it.hasNext()) {
                    try {
                        ((bs) it.next()).r0(false);
                    } catch (Exception e8) {
                        w2.p.d("", e8);
                    }
                }
            } else {
                int i8 = v2.n1.f26802b;
                w2.p.a("App is still foreground");
            }
        }
    }
}
