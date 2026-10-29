package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
final class nt implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qt f12893a;

    nt(qt qtVar) {
        Objects.requireNonNull(qtVar);
        this.f12893a = qtVar;
    }

    @Override // p3.c.a
    public final void O(int i7) {
        qt qtVar = this.f12893a;
        synchronized (qtVar.h()) {
            qtVar.k(null);
            qtVar.h().notifyAll();
        }
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        qt qtVar = this.f12893a;
        synchronized (qtVar.h()) {
            try {
                if (qtVar.i() != null) {
                    qtVar.k(qtVar.i().p0());
                }
            } catch (DeadObjectException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Unable to obtain a cache service instance.", e8);
                this.f12893a.g();
            }
            this.f12893a.h().notifyAll();
        }
    }
}
