package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class ub implements m2 {

    /* renamed from: c, reason: collision with root package name */
    private final y82 f16674c;

    /* renamed from: d, reason: collision with root package name */
    private final w72 f16675d;

    /* renamed from: e, reason: collision with root package name */
    private p2 f16676e;

    /* renamed from: f, reason: collision with root package name */
    private long f16677f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16679h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16680i;

    /* renamed from: a, reason: collision with root package name */
    private final vb f16672a = new vb(true, null, 0, "audio/mp4a-latm");

    /* renamed from: b, reason: collision with root package name */
    private final y82 f16673b = new y82(2048);

    /* renamed from: g, reason: collision with root package name */
    private long f16678g = -1;

    public ub(int i7) {
        y82 y82Var = new y82(10);
        this.f16674c = y82Var;
        byte[] H = y82Var.H();
        this.f16675d = new w72(H, H.length);
    }

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
        this.f16679h = false;
        this.f16672a.a();
        this.f16677f = j8;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        y82 y82Var;
        int i7 = 0;
        while (true) {
            y82Var = this.f16674c;
            b2 b2Var = (b2) n2Var;
            b2Var.x(y82Var.H(), 0, 10, false);
            y82Var.G(0);
            if (y82Var.W() != 4801587) {
                break;
            }
            y82Var.J(3);
            int g8 = y82Var.g();
            i7 += g8 + 10;
            b2Var.c(g8, false);
        }
        n2Var.k();
        b2 b2Var2 = (b2) n2Var;
        b2Var2.c(i7, false);
        if (this.f16678g == -1) {
            this.f16678g = i7;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = i7;
        do {
            b2Var2.x(y82Var.H(), 0, 2, false);
            y82Var.G(0);
            if (vb.b(y82Var.S())) {
                i8++;
                if (i8 >= 4 && i9 > 188) {
                    return true;
                }
                b2Var2.x(y82Var.H(), 0, 4, false);
                w72 w72Var = this.f16675d;
                w72Var.f(14);
                int j7 = w72Var.j(13);
                if (j7 <= 6) {
                    i10++;
                    n2Var.k();
                    b2Var2.c(i10, false);
                } else {
                    b2Var2.c(j7 - 6, false);
                    i9 += j7;
                }
            } else {
                i10++;
                n2Var.k();
                b2Var2.c(i10, false);
            }
            i8 = 0;
            i9 = 0;
        } while (i10 - i7 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f16676e = p2Var;
        this.f16672a.C0(p2Var, new qd(Integer.MIN_VALUE, 0, 1));
        p2Var.z();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        this.f16676e.getClass();
        y82 y82Var = this.f16673b;
        int r7 = n2Var.r(y82Var.H(), 0, 2048);
        if (!this.f16680i) {
            this.f16676e.B(new p3(-9223372036854775807L, 0L));
            this.f16680i = true;
        }
        if (r7 == -1) {
            return -1;
        }
        y82Var.G(0);
        y82Var.E(r7);
        if (!this.f16679h) {
            this.f16672a.D0(this.f16677f, 4);
            this.f16679h = true;
        }
        this.f16672a.B0(y82Var);
        return 0;
    }
}
