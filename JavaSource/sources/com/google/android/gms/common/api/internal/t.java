package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import m3.n0;

/* compiled from: MyApplication */
final class t extends n0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f4498a;

    t(u uVar) {
        this.f4498a = new WeakReference(uVar);
    }

    @Override // m3.n0
    public final void a() {
        u uVar = (u) this.f4498a.get();
        if (uVar == null) {
            return;
        }
        u.s(uVar);
    }
}
