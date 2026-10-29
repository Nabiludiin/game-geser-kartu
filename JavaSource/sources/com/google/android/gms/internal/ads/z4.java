package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: MyApplication */
final class z4 extends d5 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f20002e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f20003b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20004c;

    /* renamed from: d, reason: collision with root package name */
    private int f20005d;

    public z4(a4 a4Var) {
        super(a4Var);
    }

    @Override // com.google.android.gms.internal.ads.d5
    protected final boolean a(y82 y82Var) {
        if (this.f20003b) {
            y82Var.J(1);
        } else {
            int R = y82Var.R();
            int i7 = R >> 4;
            this.f20005d = i7;
            if (i7 == 2) {
                int i8 = f20002e[(R >> 2) & 3];
                xn5 xn5Var = new xn5();
                xn5Var.k0("video/x-flv");
                xn5Var.l0("audio/mpeg");
                xn5Var.e(1);
                xn5Var.f(i8);
                this.f6921a.c(xn5Var.m());
                this.f20004c = true;
            } else if (i7 == 7 || i7 == 8) {
                xn5 xn5Var2 = new xn5();
                xn5Var2.k0("video/x-flv");
                xn5Var2.l0(i7 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                xn5Var2.e(1);
                xn5Var2.f(8000);
                this.f6921a.c(xn5Var2.m());
                this.f20004c = true;
            } else if (i7 != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i7);
                throw new c5(sb.toString());
            }
            this.f20003b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d5
    protected final boolean b(y82 y82Var, long j7) {
        if (this.f20005d == 2) {
            int C = y82Var.C();
            a4 a4Var = this.f6921a;
            a4Var.e(y82Var, C);
            a4Var.a(j7, 1, C, 0, null);
            return true;
        }
        int R = y82Var.R();
        if (R != 0 || this.f20004c) {
            if (this.f20005d == 10 && R != 1) {
                return false;
            }
            int C2 = y82Var.C();
            a4 a4Var2 = this.f6921a;
            a4Var2.e(y82Var, C2);
            a4Var2.a(j7, 1, C2, 0, null);
            return true;
        }
        int C3 = y82Var.C();
        byte[] bArr = new byte[C3];
        y82Var.L(bArr, 0, C3);
        g1 a8 = h1.a(bArr);
        xn5 xn5Var = new xn5();
        xn5Var.k0("video/x-flv");
        xn5Var.l0("audio/mp4a-latm");
        xn5Var.i0(a8.f8597c);
        xn5Var.e(a8.f8596b);
        xn5Var.f(a8.f8595a);
        xn5Var.o0(Collections.singletonList(bArr));
        this.f6921a.c(xn5Var.m());
        this.f20004c = true;
        return false;
    }
}
