package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
final class qc {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f22549a;

    /* renamed from: b, reason: collision with root package name */
    private long f22550b;

    public qc(com.google.android.gms.common.util.e eVar) {
        p3.o.m(eVar);
        this.f22549a = eVar;
    }

    public final void a() {
        this.f22550b = this.f22549a.b();
    }

    public final void b() {
        this.f22550b = 0L;
    }

    public final boolean c(long j7) {
        return this.f22550b == 0 || this.f22549a.b() - this.f22550b >= 3600000;
    }
}
