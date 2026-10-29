package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class l05 implements t05 {

    /* renamed from: a, reason: collision with root package name */
    private final t05[] f11327a;

    l05(t05... t05VarArr) {
        this.f11327a = t05VarArr;
    }

    @Override // com.google.android.gms.internal.ads.t05
    public final boolean a(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.f11327a[i7].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t05
    public final s05 b(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            t05 t05Var = this.f11327a[i7];
            if (t05Var.a(cls)) {
                return t05Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
