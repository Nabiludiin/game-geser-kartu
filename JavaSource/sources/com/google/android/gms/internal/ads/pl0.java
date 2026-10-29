package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class pl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13914a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f13916c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f13915b = 0;

    /* synthetic */ pl0(byte[] bArr) {
    }

    public final void a() {
        long a8 = r2.t.o().a();
        synchronized (this.f13914a) {
            try {
                if (this.f13916c == 3) {
                    if (this.f13915b + ((Long) s2.b0.c().d(uy.f17260z6)).longValue() <= a8) {
                        this.f13916c = 1;
                    }
                }
            } finally {
            }
        }
        long a9 = r2.t.o().a();
        synchronized (this.f13914a) {
            try {
                if (this.f13916c != 2) {
                    return;
                }
                this.f13916c = 3;
                if (this.f13916c == 3) {
                    this.f13915b = a9;
                }
            } finally {
            }
        }
    }
}
