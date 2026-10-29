package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class di4 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f7122a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f7123b;

    /* synthetic */ di4(Class cls, Class cls2, byte[] bArr) {
        this.f7122a = cls;
        this.f7123b = cls2;
    }

    public static di4 d(ci4 ci4Var, Class cls, Class cls2) {
        return new bi4(cls, cls2, ci4Var);
    }

    public abstract xi4 a(s84 s84Var);

    public final Class b() {
        return this.f7122a;
    }

    public final Class c() {
        return this.f7123b;
    }
}
