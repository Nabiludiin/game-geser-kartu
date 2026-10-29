package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* compiled from: MyApplication */
final class z1 {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f21819a = new c0();

    /* renamed from: b, reason: collision with root package name */
    private final String f21820b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f21821c;

    z1(Class cls) {
        this.f21820b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f21821c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f21819a) {
            try {
                Logger logger2 = this.f21821c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f21820b);
                this.f21821c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
