package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class b03 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f5443a;

    /* renamed from: b, reason: collision with root package name */
    private final rx1 f5444b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5445c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private volatile int f5447e = 1;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f5446d = 0;

    public b03(com.google.android.gms.common.util.e eVar, rx1 rx1Var) {
        this.f5443a = eVar;
        this.f5444b = rx1Var;
    }

    private final void e() {
        long a8 = this.f5443a.a();
        synchronized (this.f5445c) {
            try {
                if (this.f5447e == 3) {
                    if (this.f5446d + ((Long) s2.b0.c().d(uy.f17260z6)).longValue() <= a8) {
                        this.f5447e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(int i7, int i8) {
        e();
        Object obj = this.f5445c;
        long a8 = this.f5443a.a();
        synchronized (obj) {
            try {
                if (this.f5447e != i7) {
                    return;
                }
                this.f5447e = i8;
                if (this.f5447e == 3) {
                    this.f5446d = a8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(boolean z7) {
        if (((Boolean) s2.b0.c().d(uy.ee)).booleanValue()) {
            qx1 a8 = this.f5444b.a();
            a8.c("action", "mbs_state");
            a8.c("mbs_state", true != z7 ? "0" : "1");
            a8.d();
        }
        if (z7) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean b() {
        boolean z7;
        synchronized (this.f5445c) {
            e();
            z7 = this.f5447e == 2;
        }
        return z7;
    }

    public final boolean c() {
        boolean z7;
        synchronized (this.f5445c) {
            e();
            z7 = this.f5447e == 3;
        }
        return z7;
    }

    public final void d() {
        f(2, 3);
    }
}
