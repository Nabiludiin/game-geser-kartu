package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class a5 implements m2 {

    /* renamed from: f, reason: collision with root package name */
    private p2 f4726f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4728h;

    /* renamed from: i, reason: collision with root package name */
    private long f4729i;

    /* renamed from: j, reason: collision with root package name */
    private int f4730j;

    /* renamed from: k, reason: collision with root package name */
    private int f4731k;

    /* renamed from: l, reason: collision with root package name */
    private int f4732l;

    /* renamed from: m, reason: collision with root package name */
    private long f4733m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4734n;

    /* renamed from: o, reason: collision with root package name */
    private z4 f4735o;

    /* renamed from: p, reason: collision with root package name */
    private e5 f4736p;

    /* renamed from: a, reason: collision with root package name */
    private final y82 f4721a = new y82(4);

    /* renamed from: b, reason: collision with root package name */
    private final y82 f4722b = new y82(9);

    /* renamed from: c, reason: collision with root package name */
    private final y82 f4723c = new y82(11);

    /* renamed from: d, reason: collision with root package name */
    private final y82 f4724d = new y82();

    /* renamed from: e, reason: collision with root package name */
    private final b5 f4725e = new b5();

    /* renamed from: g, reason: collision with root package name */
    private int f4727g = 1;

    private final y82 a(n2 n2Var) {
        y82 y82Var = this.f4724d;
        if (this.f4732l > y82Var.I()) {
            int I = y82Var.I();
            y82Var.A(new byte[Math.max(I + I, this.f4732l)], 0);
        } else {
            y82Var.G(0);
        }
        y82Var.E(this.f4732l);
        n2Var.s(y82Var.H(), 0, this.f4732l);
        return y82Var;
    }

    private final void c() {
        if (this.f4734n) {
            return;
        }
        this.f4726f.B(new p3(-9223372036854775807L, 0L));
        this.f4734n = true;
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
        if (j7 == 0) {
            this.f4727g = 1;
            this.f4728h = false;
        } else {
            this.f4727g = 3;
        }
        this.f4730j = 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        y82 y82Var = this.f4721a;
        b2 b2Var = (b2) n2Var;
        b2Var.x(y82Var.H(), 0, 3, false);
        y82Var.G(0);
        if (y82Var.W() != 4607062) {
            return false;
        }
        b2Var.x(y82Var.H(), 0, 2, false);
        y82Var.G(0);
        if ((y82Var.S() & 250) != 0) {
            return false;
        }
        b2Var.x(y82Var.H(), 0, 4, false);
        y82Var.G(0);
        int b8 = y82Var.b();
        n2Var.k();
        b2 b2Var2 = (b2) n2Var;
        b2Var2.c(b8, false);
        b2Var2.x(y82Var.H(), 0, 4, false);
        y82Var.G(0);
        return y82Var.b() == 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f4726f = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r17, com.google.android.gms.internal.ads.n3 r18) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a5.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }
}
