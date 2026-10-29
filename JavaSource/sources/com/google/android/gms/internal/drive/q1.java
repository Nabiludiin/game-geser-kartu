package com.google.android.gms.internal.drive;

abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    private static final o1 f20706a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final o1 f20707b = new p1();

    static o1 a() {
        return f20706a;
    }

    static o1 b() {
        return f20707b;
    }

    private static o1 c() {
        try {
            return (o1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
