package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class ud0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fd0 f16714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qb0 f16715b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vd0 f16716c;

    ud0(vd0 vd0Var, fd0 fd0Var, qb0 qb0Var) {
        this.f16714a = fd0Var;
        this.f16715b = qb0Var;
        Objects.requireNonNull(vd0Var);
        this.f16716c = vd0Var;
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            this.f16714a.A(bVar.d());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
