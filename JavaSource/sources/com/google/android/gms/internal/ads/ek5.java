package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: MyApplication */
final class ek5 {

    /* renamed from: a, reason: collision with root package name */
    private final dk5 f7668a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7669b;

    /* renamed from: c, reason: collision with root package name */
    private final fk5 f7670c;

    /* renamed from: d, reason: collision with root package name */
    private int f7671d;

    /* renamed from: e, reason: collision with root package name */
    private long f7672e;

    /* renamed from: f, reason: collision with root package name */
    private long f7673f;

    /* renamed from: g, reason: collision with root package name */
    private long f7674g;

    /* renamed from: h, reason: collision with root package name */
    private long f7675h;

    /* renamed from: i, reason: collision with root package name */
    private long f7676i;

    public ek5(AudioTrack audioTrack, fk5 fk5Var) {
        this.f7668a = new dk5(audioTrack);
        this.f7669b = audioTrack.getSampleRate();
        this.f7670c = fk5Var;
        f(0);
    }

    private final void f(int i7) {
        this.f7671d = i7;
        long j7 = 10000;
        if (i7 == 0) {
            this.f7674g = 0L;
            this.f7675h = -1L;
            this.f7676i = -9223372036854775807L;
            this.f7672e = System.nanoTime() / 1000;
        } else {
            if (i7 == 1) {
                this.f7673f = 10000L;
                return;
            }
            j7 = (i7 == 2 || i7 == 3) ? 10000000L : 500000L;
        }
        this.f7673f = j7;
    }

    private final long g(long j7, float f8) {
        dk5 dk5Var = this.f7668a;
        return h(dk5Var.c(), dk5Var.b(), j7, f8);
    }

    private final long h(long j7, long j8, long j9, float f8) {
        return hi2.O(j7, this.f7669b) + hi2.S(j9 - j8, f8);
    }

    public final void a(long j7, float f8, long j8) {
        if (j7 - this.f7674g < this.f7673f) {
            return;
        }
        this.f7674g = j7;
        dk5 dk5Var = this.f7668a;
        boolean a8 = dk5Var.a();
        if (a8) {
            long b8 = dk5Var.b();
            long g8 = g(j7, f8);
            if (Math.abs(b8 - j7) > 5000000) {
                this.f7670c.a(dk5Var.c(), b8, j7, j8);
                f(4);
            } else if (Math.abs(g8 - j8) > 5000000) {
                this.f7670c.b(dk5Var.c(), b8, j7, j8);
                f(4);
            } else if (this.f7671d == 4) {
                f(0);
            }
        }
        int i7 = this.f7671d;
        if (i7 == 0) {
            if (!a8) {
                if (j7 - this.f7672e > 500000) {
                    f(3);
                    return;
                }
                return;
            } else {
                if (dk5Var.b() >= this.f7672e) {
                    this.f7675h = dk5Var.c();
                    this.f7676i = dk5Var.b();
                    f(1);
                    return;
                }
                return;
            }
        }
        if (i7 != 1) {
            if (i7 == 2) {
                if (a8) {
                    return;
                }
                f(0);
                return;
            } else {
                if (i7 == 3 && a8) {
                    f(0);
                    return;
                }
                return;
            }
        }
        if (!a8) {
            f(0);
            return;
        }
        long c8 = dk5Var.c();
        long j9 = this.f7675h;
        if (c8 > j9) {
            if (Math.abs(g(j7, f8) - h(j9, this.f7676i, j7, f8)) < 1000) {
                f(2);
                return;
            }
        }
        if (j7 - this.f7672e > 2000000) {
            f(3);
        } else {
            this.f7675h = dk5Var.c();
            this.f7676i = dk5Var.b();
        }
    }

    public final boolean b() {
        return this.f7671d == 2;
    }

    public final boolean c() {
        int i7 = this.f7671d;
        return i7 == 0 || i7 == 1;
    }

    public final void d() {
        f(0);
    }

    public final long e(long j7, float f8) {
        return g(j7, f8);
    }
}
