package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class m extends v4.d {

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference f4471q;

    m(p pVar) {
        this.f4471q = new WeakReference(pVar);
    }

    @Override // v4.f
    public final void x2(v4.l lVar) {
        x xVar;
        p pVar = (p) this.f4471q.get();
        if (pVar == null) {
            return;
        }
        xVar = pVar.f4474a;
        xVar.k(new l(this, pVar, pVar, lVar));
    }
}
