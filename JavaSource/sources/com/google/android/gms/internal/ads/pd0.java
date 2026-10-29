package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class pd0 implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yc0 f13825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ qb0 f13826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vd0 f13827c;

    pd0(vd0 vd0Var, yc0 yc0Var, qb0 qb0Var) {
        this.f13825a = yc0Var;
        this.f13826b = qb0Var;
        Objects.requireNonNull(vd0Var);
        this.f13827c = vd0Var;
    }

    @Override // y2.d
    public final void a(k2.b bVar) {
        try {
            this.f13825a.A(bVar.d());
        } catch (RemoteException e8) {
            w2.p.d("", e8);
        }
    }
}
