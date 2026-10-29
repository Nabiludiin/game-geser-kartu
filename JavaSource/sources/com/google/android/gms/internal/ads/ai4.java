package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class ai4 {

    /* renamed from: a, reason: collision with root package name */
    private final hw4 f4989a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f4990b;

    /* synthetic */ ai4(hw4 hw4Var, Class cls, byte[] bArr) {
        this.f4989a = hw4Var;
        this.f4990b = cls;
    }

    public static ai4 d(zh4 zh4Var, hw4 hw4Var, Class cls) {
        return new yh4(hw4Var, cls, zh4Var);
    }

    public abstract s84 a(xi4 xi4Var);

    public final hw4 b() {
        return this.f4989a;
    }

    public final Class c() {
        return this.f4990b;
    }
}
