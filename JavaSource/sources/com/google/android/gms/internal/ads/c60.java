package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class c60 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6270a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6271b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f6272c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f6273d = new AtomicBoolean(false);

    public final synchronized void a(boolean z7) {
        this.f6270a = z7;
        this.f6273d.set(true);
    }

    public final synchronized void b(boolean z7, float f8) {
        this.f6271b = z7;
        this.f6272c = f8;
    }

    public final synchronized boolean c(boolean z7) {
        if (!this.f6273d.get()) {
            return z7;
        }
        return this.f6270a;
    }

    public final synchronized boolean d() {
        return this.f6271b;
    }

    public final synchronized float e() {
        return this.f6272c;
    }
}
