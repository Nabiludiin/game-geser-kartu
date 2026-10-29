package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class bg4 {

    /* renamed from: a, reason: collision with root package name */
    final ag4 f5764a;

    /* renamed from: b, reason: collision with root package name */
    final long[] f5765b;

    bg4(ag4 ag4Var, long[] jArr) {
        this.f5764a = ag4Var;
        this.f5765b = jArr;
    }

    static /* synthetic */ bg4 a(bg4 bg4Var, zf4 zf4Var) {
        b(bg4Var, zf4Var);
        return bg4Var;
    }

    private static bg4 b(bg4 bg4Var, zf4 zf4Var) {
        ag4 ag4Var = zf4Var.f20162a;
        ag4 ag4Var2 = bg4Var.f5764a;
        long[] jArr = ag4Var2.f4944a;
        long[] jArr2 = ag4Var.f4944a;
        long[] jArr3 = zf4Var.f20163b;
        jg4.e(jArr, jArr2, jArr3);
        long[] jArr4 = ag4Var2.f4945b;
        long[] jArr5 = ag4Var.f4945b;
        long[] jArr6 = ag4Var.f4946c;
        jg4.e(jArr4, jArr5, jArr6);
        jg4.e(ag4Var2.f4946c, jArr6, jArr3);
        jg4.e(bg4Var.f5765b, jArr2, jArr5);
        return bg4Var;
    }

    bg4() {
        this(new ag4(), new long[10]);
    }

    bg4(zf4 zf4Var) {
        this();
        b(this, zf4Var);
    }
}
