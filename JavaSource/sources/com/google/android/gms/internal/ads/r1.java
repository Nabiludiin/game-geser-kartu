package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f14694a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14695b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14696c;

    /* renamed from: d, reason: collision with root package name */
    private long f14697d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f14698e;

    /* renamed from: f, reason: collision with root package name */
    private long f14699f;

    /* renamed from: g, reason: collision with root package name */
    private long f14700g;

    /* renamed from: h, reason: collision with root package name */
    private long f14701h;

    protected r1(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f14694a = j7;
        this.f14695b = j8;
        this.f14698e = j10;
        this.f14699f = j11;
        this.f14700g = j12;
        this.f14696c = j13;
        this.f14701h = a(j8, 0L, j10, j11, j12, j13);
    }

    protected static long a(long j7, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || 1 + j8 >= j9) {
            return j10;
        }
        long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
        String str = hi2.f9535a;
        return Math.max(j10, Math.min(((j10 + j13) - j12) - (j13 / 20), j11 - 1));
    }

    private final void i() {
        this.f14701h = a(this.f14695b, this.f14697d, this.f14698e, this.f14699f, this.f14700g, this.f14696c);
    }

    final /* synthetic */ long b() {
        return this.f14699f;
    }

    final /* synthetic */ long c() {
        return this.f14700g;
    }

    final /* synthetic */ long d() {
        return this.f14695b;
    }

    final /* synthetic */ long e() {
        return this.f14694a;
    }

    final /* synthetic */ void f(long j7, long j8) {
        this.f14697d = j7;
        this.f14699f = j8;
        i();
    }

    final /* synthetic */ void g(long j7, long j8) {
        this.f14698e = j7;
        this.f14700g = j8;
        i();
    }

    final /* synthetic */ long h() {
        return this.f14701h;
    }
}
