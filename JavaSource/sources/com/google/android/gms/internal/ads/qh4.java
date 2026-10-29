package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class qh4 {

    /* renamed from: b, reason: collision with root package name */
    private static final qh4 f14443b = new qh4();

    /* renamed from: c, reason: collision with root package name */
    private static final ph4 f14444c = new ph4(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f14445a = new AtomicReference();

    public static qh4 a() {
        return f14443b;
    }

    public final hh4 b() {
        hh4 hh4Var = (hh4) this.f14445a.get();
        return hh4Var == null ? f14444c : hh4Var;
    }
}
