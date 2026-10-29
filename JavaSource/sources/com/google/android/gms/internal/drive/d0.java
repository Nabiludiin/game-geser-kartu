package com.google.android.gms.internal.drive;

abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b0 f20554a = new c0();

    /* renamed from: b, reason: collision with root package name */
    private static final b0 f20555b = a();

    private static b0 a() {
        try {
            return (b0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static b0 b() {
        return f20554a;
    }

    static b0 c() {
        b0 b0Var = f20555b;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
