package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class nb implements vb {

    /* renamed from: a, reason: collision with root package name */
    private final vb[] f21154a;

    nb(vb... vbVarArr) {
        this.f21154a = vbVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.vb
    public final boolean a(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.f21154a[i7].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.vb
    public final ub b(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            vb vbVar = this.f21154a[i7];
            if (vbVar.a(cls)) {
                return vbVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
