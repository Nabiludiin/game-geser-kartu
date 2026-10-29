package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class u81 implements u2.c0 {

    /* renamed from: r, reason: collision with root package name */
    private final o03 f16630r;

    /* renamed from: s, reason: collision with root package name */
    private final c03 f16631s;

    /* renamed from: t, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f16632t;

    /* renamed from: u, reason: collision with root package name */
    private final rx1 f16633u;

    /* renamed from: v, reason: collision with root package name */
    private final ScheduledExecutorService f16634v;

    /* renamed from: q, reason: collision with root package name */
    private final Object f16629q = new Object();

    /* renamed from: w, reason: collision with root package name */
    final w63 f16635w = x63.d0();

    /* renamed from: x, reason: collision with root package name */
    private boolean f16636x = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f16637y = false;

    u81(o03 o03Var, c03 c03Var, com.google.android.gms.common.util.e eVar, rx1 rx1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f16630r = o03Var;
        this.f16631s = c03Var;
        this.f16632t = eVar;
        this.f16633u = rx1Var;
        this.f16634v = scheduledExecutorService;
    }

    private final void c() {
        synchronized (this.f16629q) {
            try {
                rx1 rx1Var = this.f16633u;
                String str = this.f16630r.f13137b.f12530b.f7926b;
                String encodeToString = Base64.encodeToString(((x63) this.f16635w.A()).e(), 1);
                if (((Boolean) s2.b0.c().d(uy.Td)).booleanValue()) {
                    qx1 a8 = rx1Var.a();
                    a8.c("action", "pclma");
                    a8.c("pclmd", encodeToString);
                    a8.c("gqi", str);
                    a8.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d(int i7) {
        synchronized (this.f16629q) {
            try {
                if (!this.f16637y && this.f16636x) {
                    w63 w63Var = this.f16635w;
                    o53 d02 = p53.d0();
                    d02.F(i7);
                    d02.E(this.f16632t.a());
                    w63Var.E((p53) d02.A());
                    if (i7 == 10) {
                        c();
                        this.f16637y = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // u2.c0
    public final void C7() {
        d(3);
    }

    @Override // u2.c0
    public final void M5() {
        d(6);
    }

    @Override // u2.c0
    public final void P4() {
        d(8);
    }

    @Override // u2.c0
    public final void T5() {
        d(4);
    }

    @Override // u2.c0
    public final void Z4() {
        d(5);
    }

    public final void a() {
        synchronized (this.f16629q) {
            if (this.f16631s.E0 > 0 && !this.f16636x) {
                this.f16635w.F(this.f16632t.a());
                this.f16636x = true;
                this.f16634v.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.t81
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        u81.this.b();
                    }
                }, this.f16631s.E0, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // u2.c0
    public final void a4() {
        d(10);
    }

    final /* synthetic */ void b() {
        synchronized (this.f16629q) {
            try {
                if (this.f16637y) {
                    return;
                }
                this.f16637y = true;
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u2.c0
    public final void t7() {
        d(7);
    }

    @Override // u2.c0
    public final void v3() {
        d(9);
    }

    @Override // u2.c0
    public final void H2() {
    }

    @Override // u2.c0
    public final void g() {
    }

    @Override // u2.c0
    public final void V5(int i7) {
    }
}
