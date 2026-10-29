package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class c21 extends at {

    /* renamed from: q, reason: collision with root package name */
    private final b21 f6223q;

    /* renamed from: r, reason: collision with root package name */
    private final s2.v0 f6224r;

    /* renamed from: s, reason: collision with root package name */
    private final yv2 f6225s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6226t = ((Boolean) s2.b0.c().d(uy.Y0)).booleanValue();

    /* renamed from: u, reason: collision with root package name */
    private final rx1 f6227u;

    public c21(b21 b21Var, s2.v0 v0Var, yv2 yv2Var, rx1 rx1Var) {
        this.f6223q = b21Var;
        this.f6224r = v0Var;
        this.f6225s = yv2Var;
        this.f6227u = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final void A1(s2.q2 q2Var) {
        p3.o.f("setOnPaidEventListener must be called on the main UI thread.");
        if (this.f6225s != null) {
            try {
                if (!q2Var.e()) {
                    this.f6227u.b();
                }
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.b("Error in making CSI ping for reporting paid event callback", e8);
            }
            this.f6225s.e(q2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final void J0(long j7) {
        b21 b21Var = this.f6223q;
        if (b21Var == null || b21Var.e() == null) {
            return;
        }
        b21Var.e().b(j7);
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final s2.v0 c() {
        return this.f6224r;
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final s2.y2 f() {
        if (((Boolean) s2.b0.c().d(uy.m7)).booleanValue()) {
            return this.f6223q.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final String i() {
        try {
            return this.f6224r.t();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final long l() {
        b21 b21Var = this.f6223q;
        if (b21Var == null || b21Var.e() == null) {
            return 0L;
        }
        return b21Var.e().a();
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final void n7(w3.a aVar, ht htVar) {
        try {
            this.f6225s.c(htVar);
            this.f6223q.l((Activity) w3.b.r0(aVar), htVar, this.f6226t);
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.bt
    public final void o0(boolean z7) {
        this.f6226t = z7;
    }
}
