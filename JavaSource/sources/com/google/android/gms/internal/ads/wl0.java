package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class wl0 {

    /* renamed from: a, reason: collision with root package name */
    private z64 f18284a;

    /* renamed from: b, reason: collision with root package name */
    private rx1 f18285b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18286c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f18287d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private long f18288e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f18289f = -1;

    public final void a(z64 z64Var, rx1 rx1Var) {
        if (this.f18286c.getAndSet(true)) {
            return;
        }
        this.f18284a = z64Var;
        this.f18285b = rx1Var;
        this.f18288e = ((Long) s2.b0.c().d(uy.Ge)).longValue();
        this.f18289f = ((Long) s2.b0.c().d(uy.He)).longValue();
    }

    public final void b() {
        z64 z64Var;
        if (!this.f18286c.get() || this.f18288e < 0 || this.f18289f < 0 || !this.f18287d.compareAndSet(false, true) || (z64Var = this.f18284a) == null) {
            return;
        }
        z64Var.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.vl0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                wl0.this.c();
            }
        });
    }

    final /* synthetic */ void c() {
        rx1 rx1Var;
        while (this.f18287d.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ul0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.f18288e);
                if (!atomicBoolean.get()) {
                    if (((Boolean) s2.b0.c().d(uy.Ie)).booleanValue() && (rx1Var = this.f18285b) != null) {
                        qx1 a8 = rx1Var.a();
                        a8.c("action", "paa");
                        a8.f();
                    }
                }
                do {
                    try {
                        Thread.sleep(this.f18289f);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
