package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class sb implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final tb f15529a = new tb(null, 0, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    private final y82 f15530b = new y82(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f15531c;

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.f15531c = false;
        this.f15529a.a();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        int i7;
        y82 y82Var = new y82(10);
        int i8 = 0;
        while (true) {
            b2 b2Var = (b2) n2Var;
            b2Var.x(y82Var.H(), 0, 10, false);
            y82Var.G(0);
            if (y82Var.W() != 4801587) {
                break;
            }
            y82Var.J(3);
            int g8 = y82Var.g();
            i8 += g8 + 10;
            b2Var.c(g8, false);
        }
        n2Var.k();
        b2 b2Var2 = (b2) n2Var;
        b2Var2.c(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            b2Var2.x(y82Var.H(), 0, 7, false);
            y82Var.G(0);
            int S = y82Var.S();
            if (S == 44096 || S == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] H = y82Var.H();
                int i12 = n1.f12538b;
                if (H.length < 7) {
                    i7 = -1;
                } else {
                    int i13 = ((H[2] & 255) << 8) | (H[3] & 255);
                    if (i13 == 65535) {
                        i13 = ((H[4] & 255) << 16) | ((H[5] & 255) << 8) | (H[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (S == 44097) {
                        i11 += 2;
                    }
                    i7 = i13 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                b2Var2.c(i7 - 7, false);
            } else {
                n2Var.k();
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                b2Var2.c(i10, false);
                i9 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f15529a.C0(p2Var, new qd(Integer.MIN_VALUE, 0, 1));
        p2Var.z();
        p2Var.B(new p3(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        y82 y82Var = this.f15530b;
        int r7 = n2Var.r(y82Var.H(), 0, 16384);
        if (r7 == -1) {
            return -1;
        }
        y82Var.G(0);
        y82Var.E(r7);
        if (!this.f15531c) {
            this.f15529a.D0(0L, 4);
            this.f15531c = true;
        }
        this.f15529a.B0(y82Var);
        return 0;
    }
}
