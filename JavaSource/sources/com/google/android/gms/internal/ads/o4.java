package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
final class o4 implements i4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13181d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13182e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13183f;

    private o4(int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f13178a = i7;
        this.f13179b = i9;
        this.f13180c = i10;
        this.f13181d = i11;
        this.f13182e = i12;
        this.f13183f = i13;
    }

    public static o4 b(y82 y82Var) {
        int c8 = y82Var.c();
        y82Var.J(12);
        int c9 = y82Var.c();
        int c10 = y82Var.c();
        int c11 = y82Var.c();
        y82Var.J(4);
        int c12 = y82Var.c();
        int c13 = y82Var.c();
        y82Var.J(4);
        return new o4(c8, c9, c10, c11, c12, c13, y82Var.c());
    }

    @Override // com.google.android.gms.internal.ads.i4
    public final int a() {
        return 1752331379;
    }

    public final int c() {
        int i7 = this.f13178a;
        if (i7 == 1935960438) {
            return 2;
        }
        if (i7 == 1935963489) {
            return 1;
        }
        if (i7 == 1937012852) {
            return 3;
        }
        gv1.c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i7))));
        return -1;
    }

    public final long d() {
        return hi2.Q(this.f13181d, this.f13179b * 1000000, this.f13180c, RoundingMode.DOWN);
    }
}
