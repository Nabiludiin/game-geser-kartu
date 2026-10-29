package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class e42 extends l42 {

    /* renamed from: g, reason: collision with root package name */
    private final Context f7422g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f7423h;

    public e42(Context context, Executor executor) {
        this.f7422g = context;
        this.f7423h = executor;
        this.f11417f = new hg0(context, r2.t.w().a(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.l42, p3.c.b
    public final void a(k3.b bVar) {
        int i7 = v2.n1.f26802b;
        w2.p.a("Cannot connect to remote service, fallback to local instance.");
        this.f11412a.e(new b52(1));
    }

    public final a5.d d(eh0 eh0Var) {
        synchronized (this.f11413b) {
            try {
                if (this.f11414c) {
                    return this.f11412a;
                }
                this.f11414c = true;
                this.f11416e = eh0Var;
                this.f11417f.v();
                im0 im0Var = this.f11412a;
                im0Var.c(new Runnable() { // from class: com.google.android.gms.internal.ads.d42
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        e42.this.b();
                    }
                }, cm0.f6506g);
                l42.c(this.f7422g, im0Var, this.f7423h);
                return im0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        synchronized (this.f11413b) {
            try {
                if (!this.f11415d) {
                    this.f11415d = true;
                    try {
                        this.f11417f.o0().a2(this.f11416e, ((Boolean) s2.b0.c().d(uy.Yd)).booleanValue() ? new k42(this.f11412a, this.f11416e) : new j42(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f11412a.e(new b52(1));
                    } catch (Throwable th) {
                        r2.t.l().i(th, "RemoteAdRequestClientTask.onConnected");
                        this.f11412a.e(new b52(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
