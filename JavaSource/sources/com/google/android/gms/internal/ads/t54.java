package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
final class t54 extends r54 {
    /* synthetic */ t54(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.r54
    final void a(u54 u54Var, Set set, Set set2) {
        synchronized (u54Var) {
            try {
                if (u54Var.f16602x == null) {
                    u54Var.f16602x = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    final int b(u54 u54Var) {
        int i7;
        synchronized (u54Var) {
            i7 = u54Var.f16603y - 1;
            u54Var.f16603y = i7;
        }
        return i7;
    }
}
