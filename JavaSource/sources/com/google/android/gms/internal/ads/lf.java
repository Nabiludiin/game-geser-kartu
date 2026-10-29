package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lf {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11594a;

    /* renamed from: b, reason: collision with root package name */
    public final pe f11595b;

    /* renamed from: c, reason: collision with root package name */
    public final of f11596c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11597d;

    private lf(of ofVar) {
        this.f11597d = false;
        this.f11594a = null;
        this.f11595b = null;
        this.f11596c = ofVar;
    }

    public static lf a(Object obj, pe peVar) {
        return new lf(obj, peVar);
    }

    public static lf b(of ofVar) {
        return new lf(ofVar);
    }

    public final boolean c() {
        return this.f11596c == null;
    }

    private lf(Object obj, pe peVar) {
        this.f11597d = false;
        this.f11594a = obj;
        this.f11595b = peVar;
        this.f11596c = null;
    }
}
