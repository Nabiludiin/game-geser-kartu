package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class e5 extends d5 {

    /* renamed from: b, reason: collision with root package name */
    private final y82 f7425b;

    /* renamed from: c, reason: collision with root package name */
    private final y82 f7426c;

    /* renamed from: d, reason: collision with root package name */
    private int f7427d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7428e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7429f;

    /* renamed from: g, reason: collision with root package name */
    private int f7430g;

    public e5(a4 a4Var) {
        super(a4Var);
        this.f7425b = new y82(p63.f13680a);
        this.f7426c = new y82(4);
    }

    @Override // com.google.android.gms.internal.ads.d5
    protected final boolean a(y82 y82Var) {
        int R = y82Var.R();
        int i7 = R >> 4;
        int i8 = R & 15;
        if (i8 == 7) {
            this.f7430g = i7;
            return i7 != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i8);
        throw new c5(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.d5
    protected final boolean b(y82 y82Var, long j7) {
        int i7;
        int R = y82Var.R();
        long X = y82Var.X();
        if (R == 0) {
            if (!this.f7428e) {
                y82 y82Var2 = new y82(new byte[y82Var.C()]);
                y82Var.L(y82Var2.H(), 0, y82Var.C());
                o1 a8 = o1.a(y82Var2);
                this.f7427d = a8.f13143b;
                xn5 xn5Var = new xn5();
                xn5Var.k0("video/x-flv");
                xn5Var.l0("video/avc");
                xn5Var.i0(a8.f13153l);
                xn5Var.s0(a8.f13144c);
                xn5Var.t0(a8.f13145d);
                xn5Var.y0(a8.f13152k);
                xn5Var.o0(a8.f13142a);
                this.f6921a.c(xn5Var.m());
                this.f7428e = true;
                return false;
            }
        } else if (R == 1 && this.f7428e) {
            int i8 = this.f7430g == 1 ? 1 : 0;
            if (this.f7429f) {
                i7 = i8;
            } else if (i8 != 0) {
                i7 = 1;
            }
            y82 y82Var3 = this.f7426c;
            byte[] H = y82Var3.H();
            H[0] = 0;
            H[1] = 0;
            H[2] = 0;
            int i9 = 4 - this.f7427d;
            int i10 = 0;
            while (y82Var.C() > 0) {
                y82Var.L(y82Var3.H(), i9, this.f7427d);
                y82Var3.G(0);
                y82 y82Var4 = this.f7425b;
                int h8 = y82Var3.h();
                y82Var4.G(0);
                a4 a4Var = this.f6921a;
                a4Var.e(y82Var4, 4);
                a4Var.e(y82Var, h8);
                i10 = i10 + 4 + h8;
            }
            this.f6921a.a(j7 + (X * 1000), i7, i10, 0, null);
            this.f7429f = true;
            return true;
        }
        return false;
    }
}
