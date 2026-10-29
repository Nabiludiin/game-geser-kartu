package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class rd0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd0 f14858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qb0 f14859b;

    rd0(vd0 vd0Var, cd0 cd0Var, qb0 qb0Var) {
        this.f14858a = cd0Var;
        this.f14859b = qb0Var;
        Objects.requireNonNull(vd0Var);
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            this.f14858a.A(bVar.d());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
