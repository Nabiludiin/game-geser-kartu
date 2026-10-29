package com.google.android.gms.internal.drive;

final class x0 extends u0 {
    private x0() {
        super();
    }

    private static n0 e(Object obj, long j7) {
        return (n0) r2.G(obj, j7);
    }

    @Override // com.google.android.gms.internal.drive.u0
    final void a(Object obj, long j7) {
        e(obj, j7).q0();
    }

    @Override // com.google.android.gms.internal.drive.u0
    final void b(Object obj, Object obj2, long j7) {
        n0 e8 = e(obj, j7);
        n0 e9 = e(obj2, j7);
        int size = e8.size();
        int size2 = e9.size();
        if (size > 0 && size2 > 0) {
            if (!e8.m0()) {
                e8 = e8.w0(size2 + size);
            }
            e8.addAll(e9);
        }
        if (size > 0) {
            e9 = e8;
        }
        r2.g(obj, j7, e9);
    }
}
