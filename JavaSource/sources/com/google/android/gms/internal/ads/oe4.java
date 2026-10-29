package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class oe4 {

    /* renamed from: a, reason: collision with root package name */
    private int f13310a;

    public void a() {
        this.f13310a = 0;
    }

    public final boolean b() {
        return i(4);
    }

    public final boolean c() {
        return i(1);
    }

    public final boolean d() {
        return i(536870912);
    }

    public final boolean e() {
        return i(268435456);
    }

    public final boolean f() {
        return i(67108864);
    }

    public final void g(int i7) {
        this.f13310a = i7;
    }

    public final void h(int i7) {
        this.f13310a |= 536870912;
    }

    protected final boolean i(int i7) {
        return (this.f13310a & i7) == i7;
    }
}
