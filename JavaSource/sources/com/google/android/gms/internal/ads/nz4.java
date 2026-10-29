package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class nz4 implements t05 {

    /* renamed from: a, reason: collision with root package name */
    private static final nz4 f13113a = new nz4();

    private nz4() {
    }

    public static nz4 c() {
        return f13113a;
    }

    @Override // com.google.android.gms.internal.ads.t05
    public final boolean a(Class cls) {
        return sz4.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.t05
    public final s05 b(Class cls) {
        if (!sz4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (s05) sz4.T(cls.asSubclass(sz4.class)).S();
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }
}
