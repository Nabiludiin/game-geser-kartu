package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class sg4 {

    /* renamed from: a, reason: collision with root package name */
    private final hw4 f15606a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f15607b;

    /* synthetic */ sg4(hw4 hw4Var, Class cls, byte[] bArr) {
        this.f15606a = hw4Var;
        this.f15607b = cls;
    }

    public static sg4 d(rg4 rg4Var, hw4 hw4Var, Class cls) {
        return new qg4(hw4Var, cls, rg4Var);
    }

    public abstract b84 a(xi4 xi4Var, w84 w84Var);

    public final hw4 b() {
        return this.f15606a;
    }

    public final Class c() {
        return this.f15607b;
    }
}
