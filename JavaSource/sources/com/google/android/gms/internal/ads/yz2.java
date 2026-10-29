package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class yz2 implements f3.a {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ s2.a1 f19929q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ zz2 f19930r;

    yz2(zz2 zz2Var, s2.a1 a1Var) {
        this.f19929q = a1Var;
        Objects.requireNonNull(zz2Var);
        this.f19930r = zz2Var;
    }

    @Override // f3.a
    public final void d() {
        if (this.f19930r.k8() != null) {
            try {
                this.f19929q.c();
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.i("#007 Could not call remote method.", e8);
            }
        }
    }
}
