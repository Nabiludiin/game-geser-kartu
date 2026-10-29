package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class r4 implements x4 {

    /* renamed from: a, reason: collision with root package name */
    private final x4[] f21727a;

    r4(x4... x4VarArr) {
        this.f21727a = x4VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.x4
    public final w4 a(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            x4 x4Var = this.f21727a[i7];
            if (x4Var.b(cls)) {
                return x4Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.x4
    public final boolean b(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.f21727a[i7].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
