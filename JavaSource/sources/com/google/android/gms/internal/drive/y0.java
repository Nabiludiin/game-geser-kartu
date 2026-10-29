package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.l0;

final class y0 implements v1 {

    /* renamed from: b, reason: collision with root package name */
    private static final h1 f20780b = new z0();

    /* renamed from: a, reason: collision with root package name */
    private final h1 f20781a;

    public y0() {
        this(new a1(k0.c(), c()));
    }

    private static boolean b(g1 g1Var) {
        return g1Var.a() == l0.c.f20649i;
    }

    private static h1 c() {
        try {
            return (h1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f20780b;
        }
    }

    @Override // com.google.android.gms.internal.drive.v1
    public final u1 a(Class cls) {
        w1.H(cls);
        g1 b8 = this.f20781a.b(cls);
        return b8.b() ? l0.class.isAssignableFrom(cls) ? n1.h(w1.z(), d0.b(), b8.c()) : n1.h(w1.x(), d0.c(), b8.c()) : l0.class.isAssignableFrom(cls) ? b(b8) ? m1.i(cls, b8, q1.b(), u0.d(), w1.z(), d0.b(), f1.b()) : m1.i(cls, b8, q1.b(), u0.d(), w1.z(), null, f1.b()) : b(b8) ? m1.i(cls, b8, q1.a(), u0.c(), w1.x(), d0.c(), f1.a()) : m1.i(cls, b8, q1.a(), u0.c(), w1.y(), null, f1.a());
    }

    private y0(h1 h1Var) {
        this.f20781a = (h1) m0.d(h1Var, "messageInfoFactory");
    }
}
