package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: MyApplication */
final class x64 {

    /* renamed from: a, reason: collision with root package name */
    private final ry3 f18635a = new ry3();

    /* renamed from: b, reason: collision with root package name */
    private final String f18636b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f18637c;

    x64(Class cls) {
        this.f18636b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f18637c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f18635a) {
            try {
                Logger logger2 = this.f18637c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f18636b);
                this.f18637c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
