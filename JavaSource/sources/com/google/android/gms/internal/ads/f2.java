package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
final class f2 {

    /* renamed from: a, reason: collision with root package name */
    private final e2 f7973a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7974b = new AtomicBoolean(false);

    public f2(e2 e2Var) {
        this.f7973a = e2Var;
    }

    public final m2 a(Object... objArr) {
        Constructor a8;
        AtomicBoolean atomicBoolean = this.f7974b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    a8 = this.f7973a.a();
                } catch (ClassNotFoundException unused) {
                    this.f7974b.set(true);
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating extension", e8);
                }
            }
            a8 = null;
        }
        if (a8 == null) {
            return null;
        }
        try {
            return (m2) a8.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }
}
