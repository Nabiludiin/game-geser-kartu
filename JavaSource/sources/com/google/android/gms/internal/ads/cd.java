package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cd implements rd {

    /* renamed from: a, reason: collision with root package name */
    private final bd f6375a;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f6376b = new y82(32);

    /* renamed from: c, reason: collision with root package name */
    private int f6377c;

    /* renamed from: d, reason: collision with root package name */
    private int f6378d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6379e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6380f;

    public cd(bd bdVar) {
        this.f6375a = bdVar;
    }

    @Override // com.google.android.gms.internal.ads.rd
    public final void a(ef2 ef2Var, p2 p2Var, qd qdVar) {
        this.f6375a.a(ef2Var, p2Var, qdVar);
        this.f6380f = true;
    }

    @Override // com.google.android.gms.internal.ads.rd
    public final void b() {
        this.f6380f = true;
    }

    @Override // com.google.android.gms.internal.ads.rd
    public final void c(y82 y82Var, int i7) {
        int i8 = i7 & 1;
        int F = i8 != 0 ? y82Var.F() + y82Var.R() : -1;
        if (this.f6380f) {
            if (i8 == 0) {
                return;
            }
            this.f6380f = false;
            y82Var.G(F);
            this.f6378d = 0;
        }
        while (y82Var.C() > 0) {
            int i9 = this.f6378d;
            if (i9 < 3) {
                if (i9 == 0) {
                    int R = y82Var.R();
                    y82Var.G(y82Var.F() - 1);
                    if (R == 255) {
                        this.f6380f = true;
                        return;
                    }
                }
                int min = Math.min(y82Var.C(), 3 - this.f6378d);
                y82 y82Var2 = this.f6376b;
                y82Var.L(y82Var2.H(), this.f6378d, min);
                int i10 = this.f6378d + min;
                this.f6378d = i10;
                if (i10 == 3) {
                    y82Var2.G(0);
                    y82Var2.E(3);
                    y82Var2.J(1);
                    int R2 = y82Var2.R();
                    boolean z7 = (R2 & 128) != 0;
                    int R3 = y82Var2.R();
                    this.f6379e = z7;
                    this.f6377c = (((R2 & 15) << 8) | R3) + 3;
                    int I = y82Var2.I();
                    int i11 = this.f6377c;
                    if (I < i11) {
                        int I2 = y82Var2.I();
                        y82Var2.B(Math.min(4098, Math.max(i11, I2 + I2)));
                    }
                }
            } else {
                int min2 = Math.min(y82Var.C(), this.f6377c - this.f6378d);
                y82 y82Var3 = this.f6376b;
                y82Var.L(y82Var3.H(), this.f6378d, min2);
                int i12 = this.f6378d + min2;
                this.f6378d = i12;
                int i13 = this.f6377c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.f6379e) {
                        y82Var3.E(i13);
                    } else {
                        if (hi2.h(y82Var3.H(), 0, i13, -1) != 0) {
                            this.f6380f = true;
                            return;
                        }
                        y82Var3.E(this.f6377c - 4);
                    }
                    y82Var3.G(0);
                    this.f6375a.b(y82Var3);
                    this.f6378d = 0;
                }
            }
        }
    }
}
