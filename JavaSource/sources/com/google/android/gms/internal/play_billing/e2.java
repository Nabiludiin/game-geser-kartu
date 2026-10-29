package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class e2 extends TimeoutException {
    /* synthetic */ e2(String str, f2 f2Var) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
