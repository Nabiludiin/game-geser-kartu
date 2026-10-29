package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.l0;

final class k0 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private static final k0 f20635a = new k0();

    private k0() {
    }

    public static k0 c() {
        return f20635a;
    }

    @Override // com.google.android.gms.internal.drive.h1
    public final boolean a(Class cls) {
        return l0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.drive.h1
    public final g1 b(Class cls) {
        if (!l0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (g1) l0.p(cls.asSubclass(l0.class)).i(l0.c.f20643c, null, null);
        } catch (Exception e8) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e8);
        }
    }
}
