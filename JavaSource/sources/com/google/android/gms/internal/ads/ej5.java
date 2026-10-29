package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ej5 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7658a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7659b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7660c;

    public final ej5 a(boolean z7) {
        this.f7658a = true;
        return this;
    }

    public final ej5 b(boolean z7) {
        this.f7659b = z7;
        return this;
    }

    public final ej5 c(boolean z7) {
        this.f7660c = z7;
        return this;
    }

    public final fj5 d() {
        if (this.f7658a || !(this.f7659b || this.f7660c)) {
            return new fj5(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean e() {
        return this.f7658a;
    }

    final /* synthetic */ boolean f() {
        return this.f7659b;
    }

    final /* synthetic */ boolean g() {
        return this.f7660c;
    }
}
