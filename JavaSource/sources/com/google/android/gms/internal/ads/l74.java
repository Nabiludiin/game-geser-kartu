package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class l74 extends TimeoutException {
    /* synthetic */ l74(String str, byte[] bArr) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
