package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class f71 {

    /* renamed from: a, reason: collision with root package name */
    private static Executor f8052a;

    public static synchronized Executor a() {
        Executor executor;
        synchronized (f71.class) {
            try {
                if (f8052a == null) {
                    f8052a = hi2.C("ExoPlayer:BackgroundExecutor");
                }
                executor = f8052a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executor;
    }
}
