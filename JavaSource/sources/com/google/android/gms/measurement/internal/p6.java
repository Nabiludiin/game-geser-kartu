package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.Objects;

/* compiled from: MyApplication */
final class p6 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f22472a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s6 f22473b;

    public p6(s6 s6Var, String str) {
        Objects.requireNonNull(s6Var);
        this.f22473b = s6Var;
        p3.o.m(str);
        this.f22472a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f22473b.f22928a.a().o().b(this.f22472a, th);
    }
}
