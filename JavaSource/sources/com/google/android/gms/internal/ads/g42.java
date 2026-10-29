package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class g42 extends l42 {

    /* renamed from: g, reason: collision with root package name */
    private final Context f8641g;

    /* renamed from: h, reason: collision with root package name */
    private final w2.a f8642h;

    /* renamed from: i, reason: collision with root package name */
    private final f42 f8643i;

    g42(Context context, w2.a aVar, f42 f42Var, ig0 ig0Var) {
        this.f8641g = context;
        this.f8642h = aVar;
        this.f8643i = f42Var;
    }

    @Override // com.google.android.gms.internal.ads.l42, p3.c.a
    public final void O(int i7) {
        int i8 = v2.n1.f26802b;
        w2.p.a("Cannot connect to remote service, fallback to local instance.");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 33);
        sb.append("Connection suspended with cause: ");
        sb.append(i7);
        this.f8643i.b(new RemoteException(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.l42, p3.c.b
    public final void a(k3.b bVar) {
        super.a(bVar);
        this.f8643i.b(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.N0()))));
    }

    public final void d() {
        synchronized (this.f11413b) {
            try {
                if (this.f11414c) {
                    return;
                }
                this.f11414c = true;
                hg0 hg0Var = new hg0(this.f8641g, r2.t.w().a(), this, this);
                this.f11417f = hg0Var;
                hg0Var.v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        synchronized (this.f11413b) {
            if (!this.f11415d) {
                this.f11415d = true;
                try {
                    this.f11417f.o0().c0(this.f8642h.f27051q);
                    this.f8643i.a();
                } catch (RemoteException e8) {
                    this.f8643i.b(e8);
                }
            }
        }
    }
}
