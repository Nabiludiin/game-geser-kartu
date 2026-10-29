package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class qd0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd0 f14385a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qb0 f14386b;

    qd0(vd0 vd0Var, cd0 cd0Var, qb0 qb0Var) {
        this.f14385a = cd0Var;
        this.f14386b = qb0Var;
        Objects.requireNonNull(vd0Var);
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            this.f14385a.A(bVar.d());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
