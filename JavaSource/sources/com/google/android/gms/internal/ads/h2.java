package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: MyApplication */
public final class h2 implements a4 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9291a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.a4
    public final int b(y95 y95Var, int i7, boolean z7, int i8) {
        int r7 = y95Var.r(this.f9291a, 0, Math.min(4096, i7));
        if (r7 != -1) {
            return r7;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void d(y82 y82Var, int i7, int i8) {
        y82Var.J(i7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public /* synthetic */ void e(y82 y82Var, int i7) {
        z3.b(this, y82Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public /* synthetic */ int f(y95 y95Var, int i7, boolean z7) {
        return z3.a(this, y95Var, i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void c(eq5 eq5Var) {
    }

    @Override // com.google.android.gms.internal.ads.a4
    public final void a(long j7, int i7, int i8, int i9, y3 y3Var) {
    }
}
