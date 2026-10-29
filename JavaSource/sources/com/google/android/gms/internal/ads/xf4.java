package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
class xf4 {

    /* renamed from: a, reason: collision with root package name */
    final long[] f18802a;

    /* renamed from: b, reason: collision with root package name */
    final long[] f18803b;

    /* renamed from: c, reason: collision with root package name */
    final long[] f18804c;

    xf4(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18802a = jArr;
        this.f18803b = jArr2;
        this.f18804c = jArr3;
    }

    void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void b(xf4 xf4Var, int i7) {
        wf4.a(this.f18802a, xf4Var.f18802a, i7);
        wf4.a(this.f18803b, xf4Var.f18803b, i7);
        wf4.a(this.f18804c, xf4Var.f18804c, i7);
    }

    xf4(xf4 xf4Var) {
        this.f18802a = Arrays.copyOf(xf4Var.f18802a, 10);
        this.f18803b = Arrays.copyOf(xf4Var.f18803b, 10);
        this.f18804c = Arrays.copyOf(xf4Var.f18804c, 10);
    }
}
