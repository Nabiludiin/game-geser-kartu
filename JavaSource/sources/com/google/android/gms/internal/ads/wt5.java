package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class wt5 extends pt5 {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final boolean G;
    private final int H;
    private final int I;
    private final boolean J;
    private final boolean K;
    private final int L;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f18423u;

    /* renamed from: v, reason: collision with root package name */
    private final zs5 f18424v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f18425w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f18426x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f18427y;

    /* renamed from: z, reason: collision with root package name */
    private final int f18428z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00fb A[EDGE_INSN: B:121:0x00fb->B:68:0x00fb BREAK  A[LOOP:1: B:60:0x00dc->B:119:0x00f8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wt5(int r5, com.google.android.gms.internal.ads.b00 r6, int r7, com.google.android.gms.internal.ads.zs5 r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wt5.<init>(int, com.google.android.gms.internal.ads.b00, int, com.google.android.gms.internal.ads.zs5, int, java.lang.String, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(wt5 wt5Var, wt5 wt5Var2) {
        j04 a8 = j04.f().d(wt5Var.f18426x, wt5Var2.f18426x).a(Integer.valueOf(wt5Var.C), Integer.valueOf(wt5Var2.C), p24.b().a()).b(wt5Var.D, wt5Var2.D).b(wt5Var.E, wt5Var2.E).a(Integer.valueOf(wt5Var.F), Integer.valueOf(wt5Var2.F), p24.b().a()).d(wt5Var.G, wt5Var2.G).b(wt5Var.H, wt5Var2.H).d(wt5Var.f18427y, wt5Var2.f18427y).d(wt5Var.f18423u, wt5Var2.f18423u).d(wt5Var.f18425w, wt5Var2.f18425w).a(Integer.valueOf(wt5Var.B), Integer.valueOf(wt5Var2.B), p24.b().a());
        boolean z7 = wt5Var.J;
        j04 d8 = a8.d(z7, wt5Var2.J);
        boolean z8 = wt5Var.K;
        j04 d9 = d8.d(z8, wt5Var2.K);
        if (z7 && z8) {
            d9 = d9.b(wt5Var.L, wt5Var2.L);
        }
        return d9.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(wt5 wt5Var, wt5 wt5Var2) {
        p24 p24Var;
        p24 a8;
        if (wt5Var.f18423u && wt5Var.f18426x) {
            a8 = xt5.f19028k;
        } else {
            p24Var = xt5.f19028k;
            a8 = p24Var.a();
        }
        j04 f8 = j04.f();
        boolean z7 = wt5Var.f18424v.F;
        return f8.a(Integer.valueOf(wt5Var.A), Integer.valueOf(wt5Var2.A), a8).a(Integer.valueOf(wt5Var.f18428z), Integer.valueOf(wt5Var2.f18428z), a8).e();
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final int a() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final /* bridge */ /* synthetic */ boolean c(pt5 pt5Var) {
        wt5 wt5Var = (wt5) pt5Var;
        if (!Objects.equals(this.f14107t.f7775o, wt5Var.f14107t.f7775o)) {
            return false;
        }
        boolean z7 = this.f18424v.M;
        return this.J == wt5Var.J && this.K == wt5Var.K;
    }
}
