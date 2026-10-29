package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class h7 {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f9354a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9355b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9356c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9358e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f9359f;

    private h7(i3 i3Var, long j7, long j8, long[] jArr, int i7, int i8) {
        this.f9354a = new i3(i3Var);
        this.f9355b = j7;
        this.f9356c = j8;
        this.f9359f = jArr;
        this.f9357d = i7;
        this.f9358e = i8;
    }

    public static h7 a(i3 i3Var, y82 y82Var) {
        long[] jArr;
        int i7;
        int i8;
        int b8 = y82Var.b();
        int h8 = (b8 & 1) != 0 ? y82Var.h() : -1;
        long Y = (b8 & 2) != 0 ? y82Var.Y() : -1L;
        if ((b8 & 4) == 4) {
            jArr = new long[100];
            for (int i9 = 0; i9 < 100; i9++) {
                jArr[i9] = y82Var.R();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((b8 & 8) != 0) {
            y82Var.J(4);
        }
        if (y82Var.C() >= 24) {
            y82Var.J(21);
            int W = y82Var.W();
            i8 = W & 4095;
            i7 = W >> 12;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new h7(i3Var, h8, Y, jArr2, i7, i8);
    }

    public final long b() {
        long j7 = this.f9355b;
        if (j7 == -1 || j7 == 0) {
            return -9223372036854775807L;
        }
        return hi2.O((j7 * r4.f9821g) - 1, this.f9354a.f9818d);
    }
}
