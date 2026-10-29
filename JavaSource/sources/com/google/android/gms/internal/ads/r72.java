package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class r72 {

    /* renamed from: a, reason: collision with root package name */
    private long f14759a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f14760b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f14761c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f14762d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f14763e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f14764f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f14765g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f14766h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Object f14767i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final Object f14768j = new Object();

    public final synchronized void a(long j7) {
        synchronized (this.f14764f) {
            this.f14759a = j7;
        }
    }

    public final synchronized long b() {
        long j7;
        synchronized (this.f14764f) {
            j7 = this.f14759a;
        }
        return j7;
    }

    public final void c(int i7) {
        synchronized (this.f14765g) {
            this.f14760b = i7;
        }
    }

    public final int d() {
        int i7;
        synchronized (this.f14765g) {
            i7 = this.f14760b;
        }
        return i7;
    }

    public final void e(long j7) {
        synchronized (this.f14766h) {
            this.f14761c = j7;
        }
    }

    public final long f() {
        long j7;
        synchronized (this.f14766h) {
            j7 = this.f14761c;
        }
        return j7;
    }

    public final synchronized void g(long j7) {
        synchronized (this.f14767i) {
            this.f14762d = j7;
        }
    }

    public final synchronized long h() {
        long j7;
        synchronized (this.f14767i) {
            j7 = this.f14762d;
        }
        return j7;
    }

    public final synchronized void i(long j7) {
        synchronized (this.f14768j) {
            this.f14763e = j7;
        }
    }

    public final synchronized long j() {
        long j7;
        synchronized (this.f14768j) {
            j7 = this.f14763e;
        }
        return j7;
    }
}
