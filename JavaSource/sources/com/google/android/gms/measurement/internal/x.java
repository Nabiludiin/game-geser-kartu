package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* compiled from: MyApplication */
abstract class x {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Handler f22835d;

    /* renamed from: a, reason: collision with root package name */
    private final b8 f22836a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f22837b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f22838c;

    x(b8 b8Var) {
        p3.o.m(b8Var);
        this.f22836a = b8Var;
        this.f22837b = new w(this, b8Var);
    }

    private final Handler f() {
        Handler handler;
        if (f22835d != null) {
            return f22835d;
        }
        synchronized (x.class) {
            try {
                if (f22835d == null) {
                    f22835d = new com.google.android.gms.internal.measurement.r1(this.f22836a.e().getMainLooper());
                }
                handler = f22835d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void a();

    public final void b(long j7) {
        d();
        if (j7 >= 0) {
            b8 b8Var = this.f22836a;
            this.f22838c = b8Var.f().a();
            if (f().postDelayed(this.f22837b, j7)) {
                return;
            }
            b8Var.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }

    public final boolean c() {
        return this.f22838c != 0;
    }

    final void d() {
        this.f22838c = 0L;
        f().removeCallbacks(this.f22837b);
    }

    final /* synthetic */ void e(long j7) {
        this.f22838c = 0L;
    }
}
