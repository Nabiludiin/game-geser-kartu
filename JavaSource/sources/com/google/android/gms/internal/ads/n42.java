package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class n42 extends l42 {

    /* renamed from: g, reason: collision with root package name */
    private final Context f12569g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f12570h;

    n42(Context context, Executor executor) {
        this.f12569g = context;
        this.f12570h = executor;
        this.f11417f = new hg0(context, r2.t.w().a(), this, this);
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
                im0Var.c(new Runnable() { // from class: com.google.android.gms.internal.ads.m42
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        n42.this.b();
                    }
                }, cm0.f6506g);
                l42.c(this.f12569g, im0Var, this.f12570h);
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
                        this.f11417f.o0().z4(this.f11416e, ((Boolean) s2.b0.c().d(uy.Yd)).booleanValue() ? new k42(this.f11412a, this.f11416e) : new j42(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f11412a.e(new b52(1));
                    } catch (Throwable th) {
                        r2.t.l().i(th, "RemoteSignalsClientTask.onConnected");
                        this.f11412a.e(new b52(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
