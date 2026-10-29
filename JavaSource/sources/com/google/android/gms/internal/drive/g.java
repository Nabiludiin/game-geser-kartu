package com.google.android.gms.internal.drive;

abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f20583a = c("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f20584b;

    static {
        f20584b = c("org.robolectric.Robolectric") != null;
    }

    static boolean a() {
        return (f20583a == null || f20584b) ? false : true;
    }

    static Class b() {
        return f20583a;
    }

    private static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
