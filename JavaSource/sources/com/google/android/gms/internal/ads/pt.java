package com.google.android.gms.internal.ads;

import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
final class pt implements c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qt f14095a;

    pt(qt qtVar) {
        Objects.requireNonNull(qtVar);
        this.f14095a = qtVar;
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
        qt qtVar = this.f14095a;
        synchronized (qtVar.h()) {
            try {
                qtVar.k(null);
                if (qtVar.i() != null) {
                    qtVar.j(null);
                }
                qtVar.h().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
