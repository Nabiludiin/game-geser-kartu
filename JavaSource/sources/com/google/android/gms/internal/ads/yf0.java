package com.google.android.gms.internal.ads;

import java.lang.Thread;
import java.util.Objects;

/* compiled from: MyApplication */
final class yf0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f19545a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag0 f19546b;

    yf0(ag0 ag0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f19545a = uncaughtExceptionHandler;
        Objects.requireNonNull(ag0Var);
        this.f19546b = ag0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f19546b.i(thread, th);
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f19545a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            w2.p.c("AdMob exception reporter failed reporting the exception.");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f19545a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
