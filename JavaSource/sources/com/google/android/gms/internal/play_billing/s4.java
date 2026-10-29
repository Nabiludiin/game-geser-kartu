package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class s4 implements k5 {

    /* renamed from: b, reason: collision with root package name */
    private static final x4 f21735b = new q4();

    /* renamed from: a, reason: collision with root package name */
    private final x4 f21736a;

    public s4() {
        a4 c8 = a4.c();
        int i7 = g5.f21536d;
        r4 r4Var = new r4(c8, f21735b);
        byte[] bArr = j4.f21586b;
        this.f21736a = r4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.k5
    public final j5 a(Class cls) {
        int i7 = l5.f21607b;
        if (!d4.class.isAssignableFrom(cls)) {
            int i8 = g5.f21536d;
        }
        w4 a8 = this.f21736a.a(cls);
        if (a8.b()) {
            int i9 = g5.f21536d;
            return d5.j(l5.r(), w3.a(), a8.a());
        }
        int i10 = g5.f21536d;
        return c5.A(cls, a8, f5.a(), o4.a(), l5.r(), a8.d() + (-1) != 1 ? w3.a() : null, v4.a());
    }
}
