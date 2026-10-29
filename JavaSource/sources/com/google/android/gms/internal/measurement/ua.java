package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class ua implements vb {

    /* renamed from: a, reason: collision with root package name */
    private static final ua f21399a = new ua();

    private ua() {
    }

    public static ua c() {
        return f21399a;
    }

    @Override // com.google.android.gms.internal.measurement.vb
    public final boolean a(Class cls) {
        return xa.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.vb
    public final ub b(Class cls) {
        if (!xa.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (ub) xa.u(cls.asSubclass(xa.class)).E(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }
}
