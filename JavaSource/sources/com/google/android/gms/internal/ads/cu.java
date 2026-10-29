package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
final class cu implements c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ut f6631a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ im0 f6632b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eu f6633c;

    cu(eu euVar, ut utVar, im0 im0Var) {
        this.f6631a = utVar;
        this.f6632b = im0Var;
        Objects.requireNonNull(euVar);
        this.f6633c = euVar;
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        eu euVar = this.f6633c;
        synchronized (euVar.f()) {
            try {
                if (euVar.d()) {
                    return;
                }
                euVar.e(true);
                final tt c8 = euVar.c();
                if (c8 == null) {
                    return;
                }
                z64 z64Var = cm0.f6500a;
                final ut utVar = this.f6631a;
                final im0 im0Var = this.f6632b;
                final a5.d H0 = z64Var.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.bu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        im0 im0Var2 = im0Var;
                        tt ttVar = c8;
                        cu cuVar = cu.this;
                        try {
                            wt p02 = ttVar.p0();
                            boolean o02 = ttVar.o0();
                            ut utVar2 = utVar;
                            rt H2 = o02 ? p02.H2(utVar2) : p02.D2(utVar2);
                            if (!H2.a()) {
                                im0Var2.e(new RuntimeException("No entry contents."));
                                cuVar.f6633c.b();
                                return;
                            }
                            zt ztVar = new zt(cuVar, H2.M0(), 1);
                            int read = ztVar.read();
                            if (read == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            ztVar.unread(read);
                            im0Var2.b(gu.a(ztVar, H2.h(), H2.Q0(), H2.P0(), H2.O0()));
                        } catch (RemoteException e8) {
                            e = e8;
                            int i7 = v2.n1.f26802b;
                            w2.p.d("Unable to obtain a cache service instance.", e);
                            im0Var2.e(e);
                            cuVar.f6633c.b();
                        } catch (IOException e9) {
                            e = e9;
                            int i72 = v2.n1.f26802b;
                            w2.p.d("Unable to obtain a cache service instance.", e);
                            im0Var2.e(e);
                            cuVar.f6633c.b();
                        }
                    }
                });
                im0Var.c(new Runnable() { // from class: com.google.android.gms.internal.ads.au
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (im0.this.isCancelled()) {
                            H0.cancel(true);
                        }
                    }
                }, cm0.f6506g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p3.c.a
    public final void O(int i7) {
    }
}
