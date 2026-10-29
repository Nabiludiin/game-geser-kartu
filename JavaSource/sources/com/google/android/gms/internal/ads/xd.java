package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
final class xd implements wd {

    /* renamed from: a, reason: collision with root package name */
    private final p2 f18758a;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f18759b;

    /* renamed from: c, reason: collision with root package name */
    private final zd f18760c;

    /* renamed from: d, reason: collision with root package name */
    private final eq5 f18761d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18762e;

    /* renamed from: f, reason: collision with root package name */
    private long f18763f;

    /* renamed from: g, reason: collision with root package name */
    private int f18764g;

    /* renamed from: h, reason: collision with root package name */
    private long f18765h;

    public xd(p2 p2Var, a4 a4Var, zd zdVar, String str, int i7) {
        this.f18758a = p2Var;
        this.f18759b = a4Var;
        this.f18760c = zdVar;
        int i8 = zdVar.f20139b * zdVar.f20142e;
        int i9 = zdVar.f20141d;
        int i10 = i8 / 8;
        if (i9 != i10) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 28 + String.valueOf(i9).length());
            sb.append("Expected block size: ");
            sb.append(i10);
            sb.append("; got: ");
            sb.append(i9);
            throw wi.b(sb.toString(), null);
        }
        int i11 = zdVar.f20140c * i10;
        int i12 = i11 * 8;
        int max = Math.max(i10, i11 / 10);
        this.f18762e = max;
        xn5 xn5Var = new xn5();
        xn5Var.k0("audio/wav");
        xn5Var.l0(str);
        xn5Var.g0(i12);
        xn5Var.h0(i12);
        xn5Var.m0(max);
        xn5Var.e(zdVar.f20139b);
        xn5Var.f(zdVar.f20140c);
        xn5Var.g(i7);
        this.f18761d = xn5Var.m();
    }

    @Override // com.google.android.gms.internal.ads.wd
    public final void K(long j7) {
        this.f18763f = j7;
        this.f18764g = 0;
        this.f18765h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.wd
    public final void a(int i7, long j7) {
        this.f18758a.B(new ce(this.f18760c, 1, i7, j7));
        this.f18759b.c(this.f18761d);
    }

    @Override // com.google.android.gms.internal.ads.wd
    public final boolean b(n2 n2Var, long j7) {
        int i7;
        int i8;
        long j8 = j7;
        while (j8 > 0 && (i7 = this.f18764g) < (i8 = this.f18762e)) {
            int f8 = this.f18759b.f(n2Var, (int) Math.min(i8 - i7, j8), true);
            if (f8 == -1) {
                j8 = 0;
            } else {
                this.f18764g += f8;
                j8 -= f8;
            }
        }
        zd zdVar = this.f18760c;
        int i9 = this.f18764g;
        int i10 = zdVar.f20141d;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long Q = this.f18763f + hi2.Q(this.f18765h, 1000000L, zdVar.f20140c, RoundingMode.DOWN);
            int i12 = i11 * i10;
            int i13 = this.f18764g - i12;
            this.f18759b.a(Q, 1, i12, i13, null);
            this.f18765h += i11;
            this.f18764g = i13;
        }
        return j8 <= 0;
    }
}
