package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class zf4 {

    /* renamed from: a, reason: collision with root package name */
    final ag4 f20162a;

    /* renamed from: b, reason: collision with root package name */
    final long[] f20163b;

    zf4(ag4 ag4Var, long[] jArr) {
        this.f20162a = ag4Var;
        this.f20163b = jArr;
    }

    zf4(zf4 zf4Var) {
        this.f20162a = new ag4(zf4Var.f20162a);
        this.f20163b = Arrays.copyOf(zf4Var.f20163b, 10);
    }
}
