package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class ve implements Executor {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Handler f17586q;

    ve(xe xeVar, Handler handler) {
        this.f17586q = handler;
        Objects.requireNonNull(xeVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17586q.post(runnable);
    }
}
