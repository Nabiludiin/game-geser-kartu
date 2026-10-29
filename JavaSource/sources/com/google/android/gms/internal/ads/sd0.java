package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class sd0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sc0 f15559a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qb0 f15560b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vd0 f15561c;

    sd0(vd0 vd0Var, sc0 sc0Var, qb0 qb0Var) {
        this.f15559a = sc0Var;
        this.f15560b = qb0Var;
        Objects.requireNonNull(vd0Var);
        this.f15561c = vd0Var;
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            this.f15559a.A(bVar.d());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
