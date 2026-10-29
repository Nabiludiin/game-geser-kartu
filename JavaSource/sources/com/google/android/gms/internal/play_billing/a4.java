package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class a4 implements x4 {

    /* renamed from: a, reason: collision with root package name */
    private static final a4 f21480a = new a4();

    private a4() {
    }

    public static a4 c() {
        return f21480a;
    }

    @Override // com.google.android.gms.internal.play_billing.x4
    public final w4 a(Class cls) {
        if (!d4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (w4) d4.p(cls.asSubclass(d4.class)).h(3, null, null);
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x4
    public final boolean b(Class cls) {
        return d4.class.isAssignableFrom(cls);
    }
}
