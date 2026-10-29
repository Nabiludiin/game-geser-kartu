package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class o64 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13211a;

    /* renamed from: b, reason: collision with root package name */
    private final w04 f13212b;

    /* synthetic */ o64(boolean z7, w04 w04Var, byte[] bArr) {
        this.f13211a = z7;
        this.f13212b = w04Var;
    }

    public final a5.d a(Callable callable, Executor executor) {
        return new c64(this.f13212b, this.f13211a, executor, callable);
    }
}
