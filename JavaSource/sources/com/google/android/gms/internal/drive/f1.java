package com.google.android.gms.internal.drive;

abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    private static final d1 f20577a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final d1 f20578b = new e1();

    static d1 a() {
        return f20577a;
    }

    static d1 b() {
        return f20578b;
    }

    private static d1 c() {
        try {
            return (d1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
