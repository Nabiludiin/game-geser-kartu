package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
final class yt0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f19773a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private final int f19774b;

    final /* synthetic */ int a() {
        return this.f19774b;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f19773a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 26);
        sb.append("AdWorker(WebViewStartup) #");
        sb.append(andIncrement);
        return new xt0(this, runnable, sb.toString(), runnable);
    }
}
