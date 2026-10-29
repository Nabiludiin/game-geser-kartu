package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* compiled from: MyApplication */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19982c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19983d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19984e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19985f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19986g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19987h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19988i;

    /* renamed from: j, reason: collision with root package name */
    public final long f19989j;

    /* renamed from: k, reason: collision with root package name */
    public final y2 f19990k;

    /* renamed from: l, reason: collision with root package name */
    private final le f19991l;

    z2(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, y2 y2Var, le leVar) {
        this.f19980a = i7;
        this.f19981b = i8;
        this.f19982c = i9;
        this.f19983d = i10;
        this.f19984e = i11;
        this.f19985f = f(i11);
        this.f19986g = i12;
        this.f19987h = i13;
        this.f19988i = g(i13);
        this.f19989j = j7;
        this.f19990k = y2Var;
        this.f19991l = leVar;
    }

    private static int f(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int g(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 20) {
            return 5;
        }
        if (i7 != 24) {
            return i7 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j7 = this.f19989j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f19984e;
    }

    public final long b(long j7) {
        String str = hi2.f9535a;
        return Math.max(0L, Math.min((j7 * this.f19984e) / 1000000, this.f19989j - 1));
    }

    public final eq5 c(byte[] bArr, le leVar) {
        bArr[4] = Byte.MIN_VALUE;
        le d8 = d(leVar);
        xn5 xn5Var = new xn5();
        xn5Var.l0("audio/flac");
        int i7 = this.f19983d;
        if (i7 <= 0) {
            i7 = -1;
        }
        xn5Var.m0(i7);
        xn5Var.e(this.f19986g);
        xn5Var.f(this.f19984e);
        xn5Var.g(hi2.W(this.f19987h, ByteOrder.LITTLE_ENDIAN));
        xn5Var.o0(Collections.singletonList(bArr));
        xn5Var.j0(d8);
        return xn5Var.m();
    }

    public final le d(le leVar) {
        le leVar2 = this.f19991l;
        return leVar2 == null ? leVar : leVar2.f(leVar);
    }

    public final z2 e(y2 y2Var) {
        return new z2(this.f19980a, this.f19981b, this.f19982c, this.f19983d, this.f19984e, this.f19986g, this.f19987h, this.f19989j, y2Var, this.f19991l);
    }

    public z2(byte[] bArr, int i7) {
        w72 w72Var = new w72(bArr, bArr.length);
        w72Var.f(i7 * 8);
        this.f19980a = w72Var.j(16);
        this.f19981b = w72Var.j(16);
        this.f19982c = w72Var.j(24);
        this.f19983d = w72Var.j(24);
        int j7 = w72Var.j(20);
        this.f19984e = j7;
        this.f19985f = f(j7);
        this.f19986g = w72Var.j(3) + 1;
        int j8 = w72Var.j(5) + 1;
        this.f19987h = j8;
        this.f19988i = g(j8);
        this.f19989j = w72Var.k(36);
        this.f19990k = null;
        this.f19991l = null;
    }
}
