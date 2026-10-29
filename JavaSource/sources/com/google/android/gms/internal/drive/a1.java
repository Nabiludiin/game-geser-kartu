package com.google.android.gms.internal.drive;

final class a1 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    private h1[] f20549a;

    a1(h1... h1VarArr) {
        this.f20549a = h1VarArr;
    }

    @Override // com.google.android.gms.internal.drive.h1
    public final boolean a(Class cls) {
        for (h1 h1Var : this.f20549a) {
            if (h1Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.h1
    public final g1 b(Class cls) {
        for (h1 h1Var : this.f20549a) {
            if (h1Var.a(cls)) {
                return h1Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
