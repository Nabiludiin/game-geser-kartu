package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class y4 implements m2 {

    /* renamed from: d, reason: collision with root package name */
    private p2 f19357d;

    /* renamed from: e, reason: collision with root package name */
    private a4 f19358e;

    /* renamed from: g, reason: collision with root package name */
    private le f19360g;

    /* renamed from: h, reason: collision with root package name */
    private z2 f19361h;

    /* renamed from: i, reason: collision with root package name */
    private int f19362i;

    /* renamed from: j, reason: collision with root package name */
    private int f19363j;

    /* renamed from: k, reason: collision with root package name */
    private x4 f19364k;

    /* renamed from: l, reason: collision with root package name */
    private int f19365l;

    /* renamed from: m, reason: collision with root package name */
    private long f19366m;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f19354a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final y82 f19355b = new y82(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    private final t2 f19356c = new t2();

    /* renamed from: f, reason: collision with root package name */
    private int f19359f = 0;

    public y4(int i7) {
    }

    private final long a(y82 y82Var, boolean z7) {
        boolean z8;
        this.f19361h.getClass();
        int F = y82Var.F();
        while (F <= y82Var.D() - 16) {
            y82Var.G(F);
            z2 z2Var = this.f19361h;
            int i7 = this.f19363j;
            t2 t2Var = this.f19356c;
            if (u2.a(y82Var, z2Var, i7, t2Var)) {
                y82Var.G(F);
                return t2Var.f15947a;
            }
            F++;
        }
        if (!z7) {
            y82Var.G(F);
            return -1L;
        }
        while (F <= y82Var.D() - this.f19362i) {
            y82Var.G(F);
            try {
                z8 = u2.a(y82Var, this.f19361h, this.f19363j, this.f19356c);
            } catch (IndexOutOfBoundsException unused) {
                z8 = false;
            }
            if (y82Var.F() <= y82Var.D() && z8) {
                y82Var.G(F);
                return this.f19356c.f15947a;
            }
            F++;
        }
        y82Var.G(y82Var.D());
        return -1L;
    }

    private final void c() {
        long j7 = this.f19366m * 1000000;
        z2 z2Var = this.f19361h;
        String str = hi2.f9535a;
        this.f19358e.a(j7 / z2Var.f19984e, 1, this.f19365l, 0, null);
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
            this.f19359f = 0;
        } else {
            x4 x4Var = this.f19364k;
            if (x4Var != null) {
                x4Var.b(j8);
            }
        }
        this.f19366m = j8 != 0 ? -1L : 0L;
        this.f19365l = 0;
        this.f19355b.z(0);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        w2.a(n2Var, false);
        y82 y82Var = new y82(4);
        ((b2) n2Var).x(y82Var.H(), 0, 4, false);
        return y82Var.Y() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f19357d = p2Var;
        this.f19358e = p2Var.A(0, 1);
        p2Var.z();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        boolean b8;
        z2 z2Var;
        q3 p3Var;
        boolean z7;
        int i7 = this.f19359f;
        if (i7 == 0) {
            n2Var.k();
            long n7 = n2Var.n();
            le a8 = w2.a(n2Var, true);
            n2Var.B((int) (n2Var.n() - n7));
            this.f19360g = a8;
            this.f19359f = 1;
            return 0;
        }
        if (i7 == 1) {
            n2Var.u(this.f19354a, 0, 42);
            n2Var.k();
            this.f19359f = 2;
            return 0;
        }
        if (i7 == 2) {
            y82 y82Var = new y82(4);
            n2Var.s(y82Var.H(), 0, 4);
            if (y82Var.Y() != 1716281667) {
                throw wi.b("Failed to read FLAC stream marker.", null);
            }
            this.f19359f = 3;
            return 0;
        }
        if (i7 == 3) {
            v2 v2Var = new v2(this.f19361h);
            do {
                b8 = w2.b(n2Var, v2Var);
                z2Var = v2Var.f17362a;
                String str = hi2.f9535a;
                this.f19361h = z2Var;
            } while (!b8);
            z2Var.getClass();
            this.f19362i = Math.max(z2Var.f19982c, 6);
            eq5 c8 = this.f19361h.c(this.f19354a, this.f19360g);
            a4 a4Var = this.f19358e;
            xn5 a9 = c8.a();
            a9.k0("audio/flac");
            a4Var.c(a9.m());
            this.f19361h.a();
            this.f19359f = 4;
            return 0;
        }
        if (i7 == 4) {
            n2Var.k();
            y82 y82Var2 = new y82(2);
            n2Var.u(y82Var2.H(), 0, 2);
            int S = y82Var2.S();
            if ((S >> 2) != 16382) {
                n2Var.k();
                throw wi.b("First frame does not start with sync code.", null);
            }
            n2Var.k();
            this.f19363j = S;
            p2 p2Var = this.f19357d;
            String str2 = hi2.f9535a;
            long o7 = n2Var.o();
            long q7 = n2Var.q();
            z2 z2Var2 = this.f19361h;
            z2Var2.getClass();
            y2 y2Var = z2Var2.f19990k;
            if (y2Var != null && y2Var.f19339a.length > 0) {
                p3Var = new x2(z2Var2, o7);
            } else if (q7 == -1 || z2Var2.f19989j <= 0) {
                p3Var = new p3(z2Var2.a(), 0L);
            } else {
                x4 x4Var = new x4(z2Var2, this.f19363j, o7, q7);
                this.f19364k = x4Var;
                p3Var = x4Var.a();
            }
            p2Var.B(p3Var);
            this.f19359f = 5;
            return 0;
        }
        this.f19358e.getClass();
        z2 z2Var3 = this.f19361h;
        z2Var3.getClass();
        x4 x4Var2 = this.f19364k;
        if (x4Var2 != null && x4Var2.c()) {
            return x4Var2.d(n2Var, n3Var);
        }
        if (this.f19366m == -1) {
            this.f19366m = u2.b(n2Var, z2Var3);
            return 0;
        }
        y82 y82Var3 = this.f19355b;
        int D = y82Var3.D();
        if (D < 32768) {
            int r7 = n2Var.r(y82Var3.H(), D, 32768 - D);
            z7 = r7 == -1;
            if (!z7) {
                y82Var3.E(D + r7);
            } else if (y82Var3.C() == 0) {
                c();
                return -1;
            }
        } else {
            z7 = false;
        }
        int F = y82Var3.F();
        int i8 = this.f19365l;
        int i9 = this.f19362i;
        if (i8 < i9) {
            y82Var3.J(Math.min(i9 - i8, y82Var3.C()));
        }
        long a10 = a(y82Var3, z7);
        int F2 = y82Var3.F() - F;
        y82Var3.G(F);
        this.f19358e.e(y82Var3, F2);
        this.f19365l += F2;
        if (a10 != -1) {
            c();
            this.f19365l = 0;
            this.f19366m = a10;
        }
        int length = y82Var3.H().length - y82Var3.D();
        if (y82Var3.C() >= 16 || length >= 16) {
            return 0;
        }
        int C = y82Var3.C();
        System.arraycopy(y82Var3.H(), y82Var3.F(), y82Var3.H(), 0, C);
        y82Var3.G(0);
        y82Var3.E(C);
        return 0;
    }
}
