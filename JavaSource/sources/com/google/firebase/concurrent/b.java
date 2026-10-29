package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f22965e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f22966a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f22967b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22968c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f22969d;

    b(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f22967b = str;
        this.f22968c = i7;
        this.f22969d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f22968c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f22969d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f22965e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this, runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f22967b, Long.valueOf(this.f22966a.getAndIncrement())));
        return newThread;
    }
}
