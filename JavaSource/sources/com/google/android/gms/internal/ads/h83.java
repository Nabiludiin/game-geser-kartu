package com.google.android.gms.internal.ads;

import java.util.Random;

/* compiled from: MyApplication */
public final class h83 {

    /* renamed from: a, reason: collision with root package name */
    private final long f9368a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9369b;

    /* renamed from: e, reason: collision with root package name */
    private long f9372e;

    /* renamed from: d, reason: collision with root package name */
    private long f9371d = 5;

    /* renamed from: f, reason: collision with root package name */
    private final Random f9373f = new Random();

    /* renamed from: c, reason: collision with root package name */
    private long f9370c = 0;

    public h83(long j7, double d8, long j8, double d9) {
        this.f9368a = j7;
        this.f9369b = j8;
        a();
    }

    public final void a() {
        this.f9372e = this.f9368a;
        this.f9370c = 0L;
    }

    public final long b() {
        double d8 = this.f9372e;
        double d9 = 0.2d * d8;
        long j7 = (long) (d8 + d9);
        return ((long) (d8 - d9)) + ((long) (this.f9373f.nextDouble() * ((j7 - r0) + 1)));
    }

    public final void c() {
        double d8 = this.f9372e;
        this.f9372e = Math.min((long) (d8 + d8), this.f9369b);
        this.f9370c++;
    }

    public final boolean d() {
        ly lyVar = uy.G;
        return ((Integer) s2.b0.c().d(lyVar)).intValue() >= 0 && this.f9370c > Math.max(this.f9371d, (long) ((Integer) s2.b0.c().d(lyVar)).intValue()) && this.f9372e >= this.f9369b;
    }

    public final synchronized void e(int i7) {
        p3.o.a(i7 > 0);
        this.f9371d = i7;
    }
}
