package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class s42 extends l42 {

    /* renamed from: g, reason: collision with root package name */
    private String f15454g;

    /* renamed from: h, reason: collision with root package name */
    private int f15455h = 1;

    s42(Context context) {
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
                int i7 = this.f15455h;
                if (i7 != 1 && i7 != 2) {
                    return p64.c(new b52(2));
                }
                if (this.f11414c) {
                    return this.f11412a;
                }
                this.f15455h = 2;
                this.f11414c = true;
                this.f11416e = eh0Var;
                this.f11417f.v();
                im0 im0Var = this.f11412a;
                im0Var.c(new Runnable() { // from class: com.google.android.gms.internal.ads.q42
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        s42.this.b();
                    }
                }, cm0.f6506g);
                return im0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a5.d e(String str) {
        synchronized (this.f11413b) {
            try {
                int i7 = this.f15455h;
                if (i7 != 1 && i7 != 3) {
                    return p64.c(new b52(2));
                }
                if (this.f11414c) {
                    return this.f11412a;
                }
                this.f15455h = 3;
                this.f11414c = true;
                this.f15454g = str;
                this.f11417f.v();
                im0 im0Var = this.f11412a;
                im0Var.c(new Runnable() { // from class: com.google.android.gms.internal.ads.p42
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        s42.this.b();
                    }
                }, cm0.f6506g);
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
                        int i7 = this.f15455h;
                        if (i7 == 2) {
                            this.f11417f.o0().y3(this.f11416e, ((Boolean) s2.b0.c().d(uy.Yd)).booleanValue() ? new k42(this.f11412a, this.f11416e) : new j42(this));
                        } else if (i7 == 3) {
                            this.f11417f.o0().h4(this.f15454g, ((Boolean) s2.b0.c().d(uy.Yd)).booleanValue() ? new k42(this.f11412a, this.f11416e) : new j42(this));
                        } else {
                            this.f11412a.e(new b52(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f11412a.e(new b52(1));
                    } catch (Throwable th) {
                        r2.t.l().i(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.f11412a.e(new b52(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
