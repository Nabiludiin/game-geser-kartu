package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class on1 extends s2.a3 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f13398q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private final s2.b3 f13399r;

    /* renamed from: s, reason: collision with root package name */
    private final yb0 f13400s;

    public on1(s2.b3 b3Var, yb0 yb0Var) {
        this.f13399r = b3Var;
        this.f13400s = yb0Var;
    }

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
        yb0 yb0Var = this.f13400s;
        if (yb0Var != null) {
            return yb0Var.C();
        }
        return 0.0f;
    }

    @Override // s2.b3
    public final int j() {
        throw new RemoteException();
    }

    @Override // s2.b3
    public final float l() {
        yb0 yb0Var = this.f13400s;
        if (yb0Var != null) {
            return yb0Var.J();
        }
        return 0.0f;
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
        synchronized (this.f13398q) {
            try {
                s2.b3 b3Var = this.f13399r;
                if (b3Var == null) {
                    return null;
                }
                return b3Var.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s2.b3
    public final void r5(s2.e3 e3Var) {
        synchronized (this.f13398q) {
            try {
                s2.b3 b3Var = this.f13399r;
                if (b3Var != null) {
                    b3Var.r5(e3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
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
