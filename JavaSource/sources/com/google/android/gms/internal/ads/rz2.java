package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class rz2 implements f3.a {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ s2.n2 f15399q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ tz2 f15400r;

    rz2(tz2 tz2Var, s2.n2 n2Var) {
        this.f15399q = n2Var;
        Objects.requireNonNull(tz2Var);
        this.f15400r = tz2Var;
    }

    @Override // f3.a
    public final void d() {
        if (this.f15400r.l8() != null) {
            try {
                this.f15399q.c();
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.i("#007 Could not call remote method.", e8);
            }
        }
    }
}
