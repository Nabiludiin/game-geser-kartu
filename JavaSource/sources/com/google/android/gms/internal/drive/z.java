package com.google.android.gms.internal.drive;

abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f20782a = a();

    private static Class a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static a0 b() {
        if (f20782a != null) {
            try {
                return c("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return a0.f20547c;
    }

    private static final a0 c(String str) {
        return (a0) f20782a.getDeclaredMethod(str, null).invoke(null, null);
    }
}
