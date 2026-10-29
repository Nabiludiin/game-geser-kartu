package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cb5 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6351a;

    /* renamed from: b, reason: collision with root package name */
    public gc5 f6352b;

    /* renamed from: c, reason: collision with root package name */
    public int f6353c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6354d;

    /* renamed from: e, reason: collision with root package name */
    public int f6355e;

    public cb5(gc5 gc5Var) {
        this.f6352b = gc5Var;
    }

    public final void a(int i7) {
        this.f6351a = 1 == ((this.f6351a ? 1 : 0) | i7);
        this.f6353c += i7;
    }

    public final void b(gc5 gc5Var) {
        this.f6351a |= this.f6352b != gc5Var;
        this.f6352b = gc5Var;
    }

    public final void c(int i7) {
        if (this.f6354d && this.f6355e != 5) {
            rx3.a(i7 == 5);
            return;
        }
        this.f6351a = true;
        this.f6354d = true;
        this.f6355e = i7;
    }

    final /* synthetic */ boolean d() {
        return this.f6351a;
    }
}
