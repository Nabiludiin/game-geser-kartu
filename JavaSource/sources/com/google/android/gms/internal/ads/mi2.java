package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class mi2 {

    /* renamed from: a, reason: collision with root package name */
    private final ri2 f12265a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12266b;

    /* renamed from: c, reason: collision with root package name */
    private s2.y2 f12267c;

    public mi2(ri2 ri2Var, String str) {
        this.f12265a = ri2Var;
        this.f12266b = str;
    }

    public final synchronized boolean a() {
        return this.f12265a.b();
    }

    public final synchronized void b(s2.b5 b5Var, int i7) {
        this.f12267c = null;
        si2 si2Var = new si2(i7);
        li2 li2Var = new li2(this);
        this.f12265a.a(b5Var, this.f12266b, si2Var, li2Var);
    }

    public final synchronized String c() {
        s2.y2 y2Var;
        try {
            y2Var = this.f12267c;
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
            return null;
        }
        return y2Var != null ? y2Var.c() : null;
    }

    public final synchronized String d() {
        s2.y2 y2Var;
        try {
            y2Var = this.f12267c;
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
            return null;
        }
        return y2Var != null ? y2Var.c() : null;
    }

    final /* synthetic */ void e(s2.y2 y2Var) {
        this.f12267c = y2Var;
    }
}
