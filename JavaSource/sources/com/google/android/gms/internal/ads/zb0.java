package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class zb0 extends s2.a3 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f20110q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private volatile s2.e3 f20111r;

    @Override // s2.b3
    public final void c() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final void e() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final boolean g() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final float i() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final int j() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final float l() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final void m() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final float n() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final boolean o() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final s2.e3 q() {
        s2.e3 e3Var;
        synchronized (this.f20110q) {
            e3Var = this.f20111r;
        }
        return e3Var;
    }

    @Override // s2.b3
    public final void r5(s2.e3 e3Var) {
        synchronized (this.f20110q) {
            this.f20111r = e3Var;
        }
    }

    @Override // s2.b3
    public final boolean s() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final void v0(boolean z7) {
        throw new RemoteException();
    }
}
