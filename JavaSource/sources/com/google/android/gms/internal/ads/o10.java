package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract class o10 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f13154a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f13155b = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static m10 a() {
        return (m10) f13154a.get();
    }

    static n10 b() {
        android.support.v4.media.session.b.a(f13155b.get());
        return null;
    }

    public static void c(m10 m10Var) {
        f13154a.set(m10Var);
    }
}
