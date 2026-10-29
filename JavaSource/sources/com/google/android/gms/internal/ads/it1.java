package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import k2.w;

/* compiled from: MyApplication */
public final class it1 extends w.a {

    /* renamed from: a, reason: collision with root package name */
    private final pn1 f10183a;

    public it1(pn1 pn1Var) {
        this.f10183a = pn1Var;
    }

    private static s2.e3 f(pn1 pn1Var) {
        s2.b3 l02 = pn1Var.l0();
        if (l02 == null) {
            return null;
        }
        try {
            return l02.q();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // k2.w.a
    public final void a() {
        s2.e3 f8 = f(this.f10183a);
        if (f8 == null) {
            return;
        }
        try {
            f8.g();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // k2.w.a
    public final void c() {
        s2.e3 f8 = f(this.f10183a);
        if (f8 == null) {
            return;
        }
        try {
            f8.f();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Unable to call onVideoEnd()", e8);
        }
    }

    @Override // k2.w.a
    public final void e() {
        s2.e3 f8 = f(this.f10183a);
        if (f8 == null) {
            return;
        }
        try {
            f8.c();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Unable to call onVideoEnd()", e8);
        }
    }
}
