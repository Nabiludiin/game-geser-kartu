package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ue {

    /* renamed from: a, reason: collision with root package name */
    private int f16729a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f16730b;

    public final int a() {
        return this.f16729a;
    }

    public final int b() {
        return this.f16730b;
    }

    public final void c(of ofVar) {
        int i7 = this.f16730b + 1;
        this.f16730b = i7;
        int i8 = this.f16729a;
        this.f16729a = i8 + i8;
        if (i7 > 1) {
            throw ofVar;
        }
    }
}
