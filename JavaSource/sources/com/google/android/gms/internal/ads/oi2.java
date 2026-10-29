package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: MyApplication */
public final class oi2 {

    /* renamed from: a, reason: collision with root package name */
    private final ao1 f13334a;

    /* renamed from: b, reason: collision with root package name */
    private final ai2 f13335b;

    /* renamed from: c, reason: collision with root package name */
    private final z91 f13336c;

    public oi2(ao1 ao1Var, rx1 rx1Var) {
        this.f13334a = ao1Var;
        final ai2 ai2Var = new ai2(rx1Var);
        this.f13335b = ai2Var;
        final o80 e8 = ao1Var.e();
        this.f13336c = new z91() { // from class: com.google.android.gms.internal.ads.ni2
            @Override // com.google.android.gms.internal.ads.z91
            public final /* synthetic */ void o(s2.x2 x2Var) {
                ai2.this.o(x2Var);
                o80 o80Var = e8;
                if (o80Var != null) {
                    try {
                        o80Var.A(x2Var);
                    } catch (RemoteException e9) {
                        w2.p.i("#007 Could not call remote method.", e9);
                    }
                }
                if (o80Var != null) {
                    try {
                        o80Var.B(x2Var.f26259q);
                    } catch (RemoteException e10) {
                        w2.p.i("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
    }

    public final void a(s2.i0 i0Var) {
        this.f13335b.k(i0Var);
    }

    public final rl1 b() {
        return new rl1(this.f13334a, this.f13335b.d());
    }

    public final ai2 c() {
        return this.f13335b;
    }

    public final qb1 d() {
        return this.f13335b;
    }

    public final z91 e() {
        return this.f13336c;
    }
}
