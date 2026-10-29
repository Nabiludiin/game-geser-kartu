package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class y6 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f19389a = new y82(8);

    /* renamed from: b, reason: collision with root package name */
    private int f19390b;

    private final long b(n2 n2Var) {
        int i7;
        y82 y82Var = this.f19389a;
        b2 b2Var = (b2) n2Var;
        int i8 = 0;
        b2Var.x(y82Var.H(), 0, 1, false);
        int i9 = y82Var.H()[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while (true) {
            i7 = i11 + 1;
            if ((i9 & i10) != 0) {
                break;
            }
            i10 >>= 1;
            i11 = i7;
        }
        int i12 = i9 & (~i10);
        b2Var.x(y82Var.H(), 1, i11, false);
        while (i8 < i11) {
            i8++;
            i12 = (y82Var.H()[i8] & 255) + (i12 << 8);
        }
        this.f19390b += i7;
        return i12;
    }

    public final boolean a(n2 n2Var) {
        long q7 = n2Var.q();
        long j7 = 1024;
        if (q7 != -1 && q7 <= 1024) {
            j7 = q7;
        }
        y82 y82Var = this.f19389a;
        b2 b2Var = (b2) n2Var;
        b2Var.x(y82Var.H(), 0, 4, false);
        this.f19390b = 4;
        for (long Y = y82Var.Y(); Y != 440786851; Y = ((Y << 8) & (-256)) | (y82Var.H()[0] & 255)) {
            int i7 = (int) j7;
            int i8 = this.f19390b + 1;
            this.f19390b = i8;
            if (i8 == i7) {
                return false;
            }
            b2Var.x(y82Var.H(), 0, 1, false);
        }
        long b8 = b(n2Var);
        long j8 = this.f19390b;
        if (b8 != Long.MIN_VALUE) {
            long j9 = j8 + b8;
            if (q7 == -1 || j9 < q7) {
                while (true) {
                    long j10 = this.f19390b;
                    if (j10 < j9) {
                        if (b(n2Var) == Long.MIN_VALUE) {
                            return false;
                        }
                        long b9 = b(n2Var);
                        if (b9 < 0) {
                            return false;
                        }
                        if (b9 != 0) {
                            int i9 = (int) b9;
                            b2Var.c(i9, false);
                            this.f19390b += i9;
                        }
                    } else if (j10 == j9) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
