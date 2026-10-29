package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public abstract class a8 {

    /* renamed from: a, reason: collision with root package name */
    private static z7 f20802a;

    public static synchronized void a(z7 z7Var) {
        synchronized (a8.class) {
            if (f20802a != null) {
                throw new IllegalStateException("init() already called");
            }
            f20802a = z7Var;
        }
    }

    public static synchronized z7 b() {
        z7 z7Var;
        synchronized (a8.class) {
            try {
                if (f20802a == null) {
                    a(new d8());
                }
                z7Var = f20802a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7Var;
    }
}
