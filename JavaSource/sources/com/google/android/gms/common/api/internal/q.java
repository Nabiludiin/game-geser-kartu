package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import l3.a;

/* compiled from: MyApplication */
public final class q implements m3.z {

    /* renamed from: a, reason: collision with root package name */
    private final x f4495a;

    public q(x xVar) {
        this.f4495a = xVar;
    }

    @Override // m3.z
    public final void b() {
        this.f4495a.i();
    }

    @Override // m3.z
    public final void e() {
        Iterator it = this.f4495a.f4530v.values().iterator();
        while (it.hasNext()) {
            ((a.f) it.next()).h();
        }
        this.f4495a.D.f4513p = Collections.EMPTY_SET;
    }

    @Override // m3.z
    public final boolean f() {
        return true;
    }

    @Override // m3.z
    public final a g(a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // m3.z
    public final void a(Bundle bundle) {
    }

    @Override // m3.z
    public final void c(int i7) {
    }

    @Override // m3.z
    public final void d(k3.b bVar, l3.a aVar, boolean z7) {
    }
}
