package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class nd0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ vc0 f12698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qb0 f12699b;

    nd0(vd0 vd0Var, vc0 vc0Var, qb0 qb0Var) {
        this.f12698a = vc0Var;
        this.f12699b = qb0Var;
        Objects.requireNonNull(vd0Var);
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            this.f12698a.A(bVar.d());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
