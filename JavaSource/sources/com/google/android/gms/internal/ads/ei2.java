package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class ei2 implements s2.a, pi1 {

    /* renamed from: q, reason: collision with root package name */
    private s2.f0 f7646q;

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void M() {
    }

    public final synchronized void a(s2.f0 f0Var) {
        this.f7646q = f0Var;
    }

    @Override // s2.a
    public final synchronized void c0() {
        s2.f0 f0Var = this.f7646q;
        if (f0Var != null) {
            try {
                f0Var.b();
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.g("Remote Exception at onAdClicked.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final synchronized void z() {
        s2.f0 f0Var = this.f7646q;
        if (f0Var != null) {
            try {
                f0Var.b();
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.g("Remote Exception at onPhysicalClick.", e8);
            }
        }
    }
}
