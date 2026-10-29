package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p3.c;

/* compiled from: MyApplication */
public final class qt {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledFuture f14617a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f14618b = new lt(this);

    /* renamed from: c, reason: collision with root package name */
    private final Object f14619c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private tt f14620d;

    /* renamed from: e, reason: collision with root package name */
    private Context f14621e;

    /* renamed from: f, reason: collision with root package name */
    private wt f14622f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void f() {
        synchronized (this.f14619c) {
            try {
                if (this.f14621e != null && this.f14620d == null) {
                    tt e8 = e(new nt(this), new pt(this));
                    this.f14620d = e8;
                    e8.v();
                }
            } finally {
            }
        }
    }

    public final void a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f14619c) {
            try {
                if (this.f14621e != null) {
                    return;
                }
                this.f14621e = context.getApplicationContext();
                if (((Boolean) s2.b0.c().d(uy.O4)).booleanValue()) {
                    f();
                } else {
                    if (((Boolean) s2.b0.c().d(uy.N4)).booleanValue()) {
                        r2.t.k().b(new mt(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) s2.b0.c().d(uy.P4)).booleanValue()) {
            synchronized (this.f14619c) {
                try {
                    f();
                    ScheduledFuture scheduledFuture = this.f14617a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f14617a = cm0.f6503d.schedule(this.f14618b, ((Long) s2.b0.c().d(uy.Q4)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final rt c(ut utVar) {
        synchronized (this.f14619c) {
            if (this.f14622f == null) {
                return new rt();
            }
            try {
                if (this.f14620d.o0()) {
                    return this.f14622f.H2(utVar);
                }
                return this.f14622f.D2(utVar);
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Unable to call into cache service.", e8);
                return new rt();
            }
        }
    }

    public final long d(ut utVar) {
        synchronized (this.f14619c) {
            try {
                if (this.f14622f == null) {
                    return -2L;
                }
                if (this.f14620d.o0()) {
                    try {
                        return this.f14622f.v3(utVar);
                    } catch (RemoteException e8) {
                        int i7 = v2.n1.f26802b;
                        w2.p.d("Unable to call into cache service.", e8);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final synchronized tt e(c.a aVar, c.b bVar) {
        return new tt(this.f14621e, r2.t.w().a(), aVar, bVar);
    }

    final /* synthetic */ void g() {
        synchronized (this.f14619c) {
            try {
                tt ttVar = this.f14620d;
                if (ttVar == null) {
                    return;
                }
                if (ttVar.a() || this.f14620d.f()) {
                    this.f14620d.h();
                }
                this.f14620d = null;
                this.f14622f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object h() {
        return this.f14619c;
    }

    final /* synthetic */ tt i() {
        return this.f14620d;
    }

    final /* synthetic */ void j(tt ttVar) {
        this.f14620d = null;
    }

    final /* synthetic */ void k(wt wtVar) {
        this.f14622f = wtVar;
    }
}
