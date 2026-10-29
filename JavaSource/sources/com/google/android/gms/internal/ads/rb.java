package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class rb implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final w72 f14818a;

    /* renamed from: b, reason: collision with root package name */
    private final y82 f14819b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14820c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14821d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14822e;

    /* renamed from: f, reason: collision with root package name */
    private String f14823f;

    /* renamed from: g, reason: collision with root package name */
    private a4 f14824g;

    /* renamed from: h, reason: collision with root package name */
    private int f14825h;

    /* renamed from: i, reason: collision with root package name */
    private int f14826i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14827j;

    /* renamed from: k, reason: collision with root package name */
    private long f14828k;

    /* renamed from: l, reason: collision with root package name */
    private eq5 f14829l;

    /* renamed from: m, reason: collision with root package name */
    private int f14830m;

    /* renamed from: n, reason: collision with root package name */
    private long f14831n;

    public rb(String str, int i7, String str2) {
        w72 w72Var = new w72(new byte[128], 128);
        this.f14818a = w72Var;
        this.f14819b = new y82(w72Var.f18098a);
        this.f14825h = 0;
        this.f14831n = -9223372036854775807L;
        this.f14820c = str;
        this.f14821d = i7;
        this.f14822e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        this.f14824g.getClass();
        while (y82Var.C() > 0) {
            int i7 = this.f14825h;
            if (i7 == 0) {
                while (true) {
                    if (y82Var.C() <= 0) {
                        break;
                    }
                    if (this.f14827j) {
                        int R = y82Var.R();
                        if (R == 119) {
                            this.f14827j = false;
                            this.f14825h = 1;
                            y82 y82Var2 = this.f14819b;
                            y82Var2.H()[0] = 11;
                            y82Var2.H()[1] = 119;
                            this.f14826i = 2;
                            break;
                        }
                        this.f14827j = R == 11;
                    } else {
                        this.f14827j = y82Var.R() == 11;
                    }
                }
            } else if (i7 != 1) {
                int min = Math.min(y82Var.C(), this.f14830m - this.f14826i);
                this.f14824g.e(y82Var, min);
                int i8 = this.f14826i + min;
                this.f14826i = i8;
                if (i8 == this.f14830m) {
                    rx3.h(this.f14831n != -9223372036854775807L);
                    this.f14824g.a(this.f14831n, 1, this.f14830m, 0, null);
                    this.f14831n += this.f14828k;
                    this.f14825h = 0;
                }
            } else {
                y82 y82Var3 = this.f14819b;
                byte[] H = y82Var3.H();
                int min2 = Math.min(y82Var.C(), 128 - this.f14826i);
                y82Var.L(H, this.f14826i, min2);
                int i9 = this.f14826i + min2;
                this.f14826i = i9;
                if (i9 == 128) {
                    w72 w72Var = this.f14818a;
                    w72Var.f(0);
                    j1 c8 = k1.c(w72Var);
                    eq5 eq5Var = this.f14829l;
                    if (eq5Var == null || c8.f10290c != eq5Var.G || c8.f10289b != eq5Var.H || !Objects.equals(c8.f10288a, eq5Var.f7775o)) {
                        xn5 xn5Var = new xn5();
                        xn5Var.A(this.f14823f);
                        xn5Var.k0(this.f14822e);
                        String str = c8.f10288a;
                        xn5Var.l0(str);
                        xn5Var.e(c8.f10290c);
                        xn5Var.f(c8.f10289b);
                        xn5Var.d0(this.f14820c);
                        xn5Var.f0(this.f14821d);
                        int i10 = c8.f10293f;
                        xn5Var.h0(i10);
                        if ("audio/ac3".equals(str)) {
                            xn5Var.g0(i10);
                        }
                        eq5 m7 = xn5Var.m();
                        this.f14829l = m7;
                        this.f14824g.c(m7);
                    }
                    this.f14830m = c8.f10291d;
                    this.f14828k = (c8.f10292e * 1000000) / this.f14829l.H;
                    y82Var3.G(0);
                    this.f14824g.e(y82Var3, 128);
                    this.f14825h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f14823f = qdVar.c();
        this.f14824g = p2Var.A(qdVar.b(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f14831n = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f14825h = 0;
        this.f14826i = 0;
        this.f14827j = false;
        this.f14831n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
