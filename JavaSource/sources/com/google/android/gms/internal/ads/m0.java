package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* compiled from: MyApplication */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final f f11984a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final k0 f11985b;

    /* renamed from: c, reason: collision with root package name */
    private final l0 f11986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11987d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f11988e;

    /* renamed from: f, reason: collision with root package name */
    private float f11989f;

    /* renamed from: g, reason: collision with root package name */
    private float f11990g;

    /* renamed from: h, reason: collision with root package name */
    private float f11991h;

    /* renamed from: i, reason: collision with root package name */
    private float f11992i;

    /* renamed from: j, reason: collision with root package name */
    private int f11993j;

    /* renamed from: k, reason: collision with root package name */
    private long f11994k;

    /* renamed from: l, reason: collision with root package name */
    private long f11995l;

    /* renamed from: m, reason: collision with root package name */
    private long f11996m;

    /* renamed from: n, reason: collision with root package name */
    private long f11997n;

    /* renamed from: o, reason: collision with root package name */
    private long f11998o;

    /* renamed from: p, reason: collision with root package name */
    private long f11999p;

    /* renamed from: q, reason: collision with root package name */
    private long f12000q;

    public m0(Context context) {
        DisplayManager displayManager;
        k0 k0Var = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new k0(this, displayManager);
        this.f11985b = k0Var;
        this.f11986c = k0Var != null ? l0.a() : null;
        this.f11994k = -9223372036854775807L;
        this.f11995l = -9223372036854775807L;
        this.f11989f = -1.0f;
        this.f11992i = 1.0f;
        this.f11993j = 0;
    }

    private final void k() {
        this.f11996m = 0L;
        this.f11999p = -1L;
        this.f11997n = -1L;
    }

    private final void l() {
        if (Build.VERSION.SDK_INT < 30 || this.f11988e == null) {
            return;
        }
        f fVar = this.f11984a;
        float g8 = fVar.c() ? fVar.g() : this.f11989f;
        float f8 = this.f11990g;
        if (g8 != f8) {
            if (g8 != -1.0f && f8 != -1.0f) {
                float f9 = 1.0f;
                if (fVar.c() && fVar.e() >= 5000000000L) {
                    f9 = 0.1f;
                }
                if (Math.abs(g8 - this.f11990g) < f9) {
                    return;
                }
            } else if (g8 == -1.0f && fVar.d() < 30) {
                return;
            }
            this.f11990g = g8;
            m(false);
        }
    }

    private final void m(boolean z7) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f11988e) == null || this.f11993j == Integer.MIN_VALUE) {
            return;
        }
        float f8 = 0.0f;
        if (this.f11987d) {
            float f9 = this.f11990g;
            if (f9 != -1.0f) {
                f8 = this.f11992i * f9;
            }
        }
        if (z7 || this.f11991h != f8) {
            this.f11991h = f8;
            j0.a(surface, f8);
        }
    }

    private final void n() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f11988e) == null || this.f11993j == Integer.MIN_VALUE || this.f11991h == 0.0f) {
            return;
        }
        this.f11991h = 0.0f;
        j0.a(surface, 0.0f);
    }

    public final void a(int i7) {
        if (this.f11993j == i7) {
            return;
        }
        this.f11993j = i7;
        m(true);
    }

    public final void b() {
        this.f11987d = true;
        k();
        k0 k0Var = this.f11985b;
        if (k0Var != null) {
            l0 l0Var = this.f11986c;
            l0Var.getClass();
            l0Var.b();
            k0Var.a();
        }
        m(false);
    }

    public final void c(Surface surface) {
        if (this.f11988e == surface) {
            return;
        }
        n();
        this.f11988e = surface;
        m(true);
    }

    public final void d() {
        k();
    }

    public final void e(float f8) {
        this.f11992i = f8;
        k();
        m(false);
    }

    public final void f(float f8) {
        this.f11989f = f8;
        this.f11984a.a();
        l();
    }

    public final void g(long j7) {
        long j8 = this.f11997n;
        if (j8 != -1) {
            this.f11999p = j8;
            this.f12000q = this.f11998o;
        }
        this.f11996m++;
        this.f11984a.b(j7 * 1000);
        l();
    }

    public final void h() {
        this.f11987d = false;
        k0 k0Var = this.f11985b;
        if (k0Var != null) {
            k0Var.b();
            l0 l0Var = this.f11986c;
            l0Var.getClass();
            l0Var.c();
        }
        n();
    }

    public final long i(long j7) {
        long j8;
        if (this.f11999p != -1) {
            f fVar = this.f11984a;
            if (fVar.c()) {
                long f8 = fVar.f();
                long j9 = this.f12000q + ((long) ((f8 * (this.f11996m - this.f11999p)) / this.f11992i));
                if (Math.abs(j7 - j9) > 20000000) {
                    k();
                } else {
                    j7 = j9;
                }
            }
        }
        this.f11997n = this.f11996m;
        this.f11998o = j7;
        l0 l0Var = this.f11986c;
        if (l0Var != null && this.f11994k != -9223372036854775807L) {
            long j10 = l0Var.f11310q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f11994k;
                long j12 = j10 + (((j7 - j10) / j11) * j11);
                if (j7 <= j12) {
                    j8 = j12 - j11;
                } else {
                    long j13 = j11 + j12;
                    j8 = j12;
                    j12 = j13;
                }
                long j14 = this.f11995l;
                if (j12 - j7 >= j7 - j8) {
                    j12 = j8;
                }
                return j12 - j14;
            }
        }
        return j7;
    }

    final /* synthetic */ void j(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f11994k = refreshRate;
            this.f11995l = (refreshRate * 80) / 100;
        } else {
            gv1.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f11994k = -9223372036854775807L;
            this.f11995l = -9223372036854775807L;
        }
    }
}
