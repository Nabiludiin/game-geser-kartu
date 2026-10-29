package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
final class dr5 implements vp5, p2, vu5, av5, or5 {

    /* renamed from: d0, reason: collision with root package name */
    private static final Map f7267d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final eq5 f7268e0;
    private final sq5 A;
    private up5 F;
    private s5 G;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private cr5 N;
    private q3 O;
    private long P;
    private boolean Q;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private boolean W;
    private long X;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f7269a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f7270b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f7271c0;

    /* renamed from: q, reason: collision with root package name */
    private final Uri f7272q;

    /* renamed from: r, reason: collision with root package name */
    private final yl3 f7273r;

    /* renamed from: s, reason: collision with root package name */
    private final jm5 f7274s;

    /* renamed from: t, reason: collision with root package name */
    private final jq5 f7275t;

    /* renamed from: u, reason: collision with root package name */
    private final em5 f7276u;

    /* renamed from: v, reason: collision with root package name */
    private final vq5 f7277v;

    /* renamed from: w, reason: collision with root package name */
    private final ku5 f7278w;

    /* renamed from: x, reason: collision with root package name */
    private final long f7279x;

    /* renamed from: y, reason: collision with root package name */
    private final long f7280y;

    /* renamed from: z, reason: collision with root package name */
    private final dv5 f7281z = new dv5("ProgressiveMediaPeriod");
    private final sg1 B = new sg1(pd1.f13828a);
    private final Runnable C = new Runnable() { // from class: com.google.android.gms.internal.ads.zq5
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            dr5.this.t();
        }
    };
    private final Runnable D = new Runnable() { // from class: com.google.android.gms.internal.ads.wq5
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            dr5.this.u();
        }
    };
    private final Handler E = hi2.z(null);
    private br5[] I = new br5[0];
    private pr5[] H = new pr5[0];
    private long Y = -9223372036854775807L;
    private int R = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f7267d0 = Collections.unmodifiableMap(hashMap);
        xn5 xn5Var = new xn5();
        xn5Var.A("icy");
        xn5Var.l0("application/x-icy");
        f7268e0 = xn5Var.m();
    }

    public dr5(Uri uri, yl3 yl3Var, sq5 sq5Var, jm5 jm5Var, em5 em5Var, uu5 uu5Var, jq5 jq5Var, vq5 vq5Var, ku5 ku5Var, String str, int i7, int i8, eq5 eq5Var, long j7, kv5 kv5Var) {
        this.f7272q = uri;
        this.f7273r = yl3Var;
        this.f7274s = jm5Var;
        this.f7276u = em5Var;
        this.f7275t = jq5Var;
        this.f7277v = vq5Var;
        this.f7278w = ku5Var;
        this.f7279x = i7;
        this.A = sq5Var;
        this.f7280y = j7;
    }

    private final void K(int i7) {
        U();
        cr5 cr5Var = this.N;
        boolean[] zArr = cr5Var.f6593d;
        if (zArr[i7]) {
            return;
        }
        eq5 a8 = cr5Var.f6590a.a(i7).a(0);
        this.f7275t.h(new tp5(1, th.g(a8.f7775o), a8, 0, null, hi2.M(this.X), -9223372036854775807L));
        zArr[i7] = true;
    }

    private final void L(int i7) {
        U();
        if (this.Z) {
            if ((!this.L || this.N.f6591b[i7]) && !this.H[i7].E(false)) {
                this.Y = 0L;
                this.Z = false;
                this.T = true;
                this.X = 0L;
                this.f7269a0 = 0;
                for (pr5 pr5Var : this.H) {
                    pr5Var.u(false);
                }
                up5 up5Var = this.F;
                up5Var.getClass();
                up5Var.c(this);
            }
        }
    }

    private final boolean M() {
        return this.T || S();
    }

    private final a4 N(br5 br5Var) {
        int length = this.H.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (br5Var.equals(this.I[i7])) {
                return this.H[i7];
            }
        }
        if (this.J) {
            int i8 = br5Var.f5961a;
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i8);
            sb.append(") after finishing tracks.");
            gv1.c("ProgressiveMediaPeriod", sb.toString());
            return new h2();
        }
        pr5 pr5Var = new pr5(this.f7278w, this.f7274s, this.f7276u);
        pr5Var.M(this);
        int i9 = length + 1;
        br5[] br5VarArr = (br5[]) Arrays.copyOf(this.I, i9);
        br5VarArr[length] = br5Var;
        String str = hi2.f9535a;
        this.I = br5VarArr;
        pr5[] pr5VarArr = (pr5[]) Arrays.copyOf(this.H, i9);
        pr5VarArr[length] = pr5Var;
        this.H = pr5VarArr;
        return pr5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void t() {
        int i7;
        if (this.f7271c0 || this.K || !this.J || this.O == null) {
            return;
        }
        for (pr5 pr5Var : this.H) {
            if (pr5Var.B() == null) {
                return;
            }
        }
        this.B.b();
        int length = this.H.length;
        b00[] b00VarArr = new b00[length];
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            eq5 B = this.H[i8].B();
            B.getClass();
            String str = B.f7775o;
            boolean a8 = th.a(str);
            boolean z7 = a8 || th.b(str);
            zArr[i8] = z7;
            this.L = z7 | this.L;
            this.M = this.f7280y != -9223372036854775807L && length == 1 && th.c(str);
            s5 s5Var = this.G;
            if (s5Var != null) {
                if (a8 || this.I[i8].f5962b) {
                    le leVar = B.f7772l;
                    le leVar2 = leVar == null ? new le(-9223372036854775807L, s5Var) : leVar.g(s5Var);
                    xn5 a9 = B.a();
                    a9.j0(leVar2);
                    B = a9.m();
                }
                if (a8 && B.f7768h == -1 && B.f7769i == -1 && (i7 = s5Var.f15457a) != -1) {
                    xn5 a10 = B.a();
                    a10.g0(i7);
                    B = a10.m();
                }
            }
            eq5 b8 = B.b(this.f7274s.a(B));
            b00VarArr[i8] = new b00(Integer.toString(i8), b8);
            this.U = b8.f7781u | this.U;
        }
        this.N = new cr5(new as5(b00VarArr), zArr);
        if (this.M && this.P == -9223372036854775807L) {
            this.P = this.f7280y;
            this.O = new tq5(this, this.O);
        }
        this.f7277v.b(this.P, this.O, this.Q);
        this.K = true;
        up5 up5Var = this.F;
        up5Var.getClass();
        up5Var.e(this);
    }

    private final void P() {
        uq5 uq5Var = new uq5(this, this.f7272q, this.f7273r, this.A, this, this.B);
        if (this.K) {
            rx3.h(S());
            long j7 = this.P;
            if (j7 != -9223372036854775807L && this.Y > j7) {
                this.f7270b0 = true;
                this.Y = -9223372036854775807L;
                return;
            }
            q3 q3Var = this.O;
            q3Var.getClass();
            uq5Var.c(q3Var.c(this.Y).f13172a.f14719b, this.Y);
            for (pr5 pr5Var : this.H) {
                pr5Var.v(this.Y);
            }
            this.Y = -9223372036854775807L;
        }
        this.f7269a0 = Q();
        this.f7281z.d(uq5Var, this, uu5.a(this.R));
    }

    private final int Q() {
        int i7 = 0;
        for (pr5 pr5Var : this.H) {
            i7 += pr5Var.w();
        }
        return i7;
    }

    private final long R(boolean z7) {
        int i7;
        long j7 = Long.MIN_VALUE;
        while (true) {
            pr5[] pr5VarArr = this.H;
            if (i7 >= pr5VarArr.length) {
                return j7;
            }
            if (!z7) {
                cr5 cr5Var = this.N;
                cr5Var.getClass();
                i7 = cr5Var.f6592c[i7] ? 0 : i7 + 1;
            }
            j7 = Math.max(j7, pr5VarArr[i7].C());
        }
    }

    private final boolean S() {
        return this.Y != -9223372036854775807L;
    }

    private final void U() {
        rx3.h(this.K);
        this.N.getClass();
        this.O.getClass();
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final a4 A(int i7, int i8) {
        return N(new br5(i7, false));
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void B(final q3 q3Var) {
        this.E.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xq5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                dr5.this.v(q3Var);
            }
        });
    }

    final /* synthetic */ long E() {
        return this.f7279x;
    }

    final /* synthetic */ Runnable F() {
        return this.D;
    }

    final /* synthetic */ Handler G() {
        return this.E;
    }

    final /* synthetic */ s5 H() {
        return this.G;
    }

    final /* synthetic */ void I(s5 s5Var) {
        this.G = s5Var;
    }

    final /* synthetic */ long J() {
        return this.P;
    }

    public final void T() {
        if (this.K) {
            for (pr5 pr5Var : this.H) {
                pr5Var.x();
            }
        }
        this.f7281z.g(this);
        this.E.removeCallbacksAndMessages(null);
        this.F = null;
        this.f7271c0 = true;
    }

    final boolean V(int i7) {
        return !M() && this.H[i7].E(this.f7270b0);
    }

    final void W(int i7) {
        this.H[i7].y();
        X();
    }

    final void X() {
        this.f7281z.h(uu5.a(this.R));
    }

    final int Y(int i7, hb5 hb5Var, wj4 wj4Var, int i8) {
        if (M()) {
            return -3;
        }
        K(i7);
        int F = this.H[i7].F(hb5Var, wj4Var, i8, this.f7270b0);
        if (F == -3) {
            L(i7);
        }
        return F;
    }

    final int Z(int i7, long j7) {
        if (M()) {
            return 0;
        }
        K(i7);
        pr5 pr5Var = this.H[i7];
        int I = pr5Var.I(j7, this.f7270b0);
        pr5Var.J(I);
        if (I != 0) {
            return I;
        }
        L(i7);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean a(mb5 mb5Var) {
        if (this.f7270b0) {
            return false;
        }
        dv5 dv5Var = this.f7281z;
        if (dv5Var.b() || this.Z) {
            return false;
        }
        if (this.K && this.V == 0) {
            return false;
        }
        boolean a8 = this.B.a();
        if (dv5Var.e()) {
            return a8;
        }
        P();
        return true;
    }

    final a4 a0() {
        return N(new br5(0, true));
    }

    @Override // com.google.android.gms.internal.ads.vu5
    public final /* bridge */ /* synthetic */ void c(zu5 zu5Var, long j7, long j8, int i7) {
        uq5 uq5Var = (uq5) zu5Var;
        ka4 f8 = uq5Var.f();
        this.f7275t.d(i7 == 0 ? new op5(uq5Var.e(), uq5Var.h(), j7) : new op5(uq5Var.e(), uq5Var.h(), f8.e(), f8.f(), j7, j8, f8.c()), new tp5(1, -1, null, 0, null, hi2.M(uq5Var.g()), hi2.M(this.P)), i7);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void d() {
        X();
        if (this.f7270b0 && !this.K) {
            throw wi.b("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    @Override // com.google.android.gms.internal.ads.vu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.xu5 e(com.google.android.gms.internal.ads.zu5 r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dr5.e(com.google.android.gms.internal.ads.zu5, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.xu5");
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void f(long j7, boolean z7) {
        if (this.M) {
            return;
        }
        U();
        if (S()) {
            return;
        }
        boolean[] zArr = this.N.f6592c;
        int length = this.H.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.H[i7].K(j7, false, zArr[i7]);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long g() {
        if (this.U) {
            this.U = false;
        } else {
            if (!this.T) {
                return -9223372036854775807L;
            }
            if (!this.f7270b0 && Q() <= this.f7269a0) {
                return -9223372036854775807L;
            }
            this.T = false;
        }
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final as5 h() {
        U();
        return this.N.f6590a;
    }

    @Override // com.google.android.gms.internal.ads.vu5
    public final /* bridge */ /* synthetic */ void i(zu5 zu5Var, long j7, long j8) {
        uq5 uq5Var = (uq5) zu5Var;
        if (this.P == -9223372036854775807L && this.O != null) {
            long R = R(true);
            long j9 = R == Long.MIN_VALUE ? 0L : R + 10000;
            this.P = j9;
            this.f7277v.b(j9, this.O, this.Q);
        }
        ka4 f8 = uq5Var.f();
        op5 op5Var = new op5(uq5Var.e(), uq5Var.h(), f8.e(), f8.f(), j7, j8, f8.c());
        uq5Var.e();
        this.f7275t.e(op5Var, new tp5(1, -1, null, 0, null, hi2.M(uq5Var.g()), hi2.M(this.P)));
        this.f7270b0 = true;
        up5 up5Var = this.F;
        up5Var.getClass();
        up5Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long j() {
        long j7;
        U();
        if (this.f7270b0 || this.V == 0) {
            return Long.MIN_VALUE;
        }
        if (S()) {
            return this.Y;
        }
        if (this.L) {
            int length = this.H.length;
            j7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                cr5 cr5Var = this.N;
                if (cr5Var.f6591b[i7] && cr5Var.f6592c[i7] && !this.H[i7].D()) {
                    j7 = Math.min(j7, this.H[i7].C());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = R(false);
        }
        return j7 == Long.MIN_VALUE ? this.X : j7;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final long k() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.vu5
    public final /* bridge */ /* synthetic */ void l(zu5 zu5Var, long j7, long j8, boolean z7) {
        uq5 uq5Var = (uq5) zu5Var;
        ka4 f8 = uq5Var.f();
        op5 op5Var = new op5(uq5Var.e(), uq5Var.h(), f8.e(), f8.f(), j7, j8, f8.c());
        uq5Var.e();
        this.f7275t.f(op5Var, new tp5(1, -1, null, 0, null, hi2.M(uq5Var.g()), hi2.M(this.P)));
        if (z7) {
            return;
        }
        for (pr5 pr5Var : this.H) {
            pr5Var.u(false);
        }
        if (this.V > 0) {
            up5 up5Var = this.F;
            up5Var.getClass();
            up5Var.c(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.or5
    public final void m(eq5 eq5Var) {
        this.E.post(this.C);
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long n(long j7) {
        U();
        boolean[] zArr = this.N.f6591b;
        if (true != this.O.b()) {
            j7 = 0;
        }
        this.T = false;
        long j8 = this.X;
        this.X = j7;
        if (S()) {
            this.Y = j7;
            return j7;
        }
        if (this.R != 7 && (this.f7270b0 || this.f7281z.e())) {
            int length = this.H.length;
            for (int i7 = 0; i7 < length; i7++) {
                pr5 pr5Var = this.H[i7];
                if (pr5Var.A() != 0 || j8 != j7) {
                    if (this.M ? pr5Var.G(pr5Var.z()) : pr5Var.H(j7, this.f7270b0)) {
                        continue;
                    } else if (!zArr[i7] && this.L) {
                    }
                }
            }
            return j7;
        }
        this.Z = false;
        this.Y = j7;
        this.f7270b0 = false;
        this.U = false;
        dv5 dv5Var = this.f7281z;
        if (dv5Var.e()) {
            for (pr5 pr5Var2 : this.H) {
                pr5Var2.L();
            }
            dv5Var.f();
            return j7;
        }
        dv5Var.c();
        for (pr5 pr5Var3 : this.H) {
            pr5Var3.u(false);
        }
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final boolean o() {
        return this.f7281z.e() && this.B.f();
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final long p(zt5[] zt5VarArr, boolean[] zArr, qr5[] qr5VarArr, boolean[] zArr2, long j7) {
        zt5 zt5Var;
        U();
        cr5 cr5Var = this.N;
        as5 as5Var = cr5Var.f6590a;
        boolean[] zArr3 = cr5Var.f6592c;
        int i7 = this.V;
        int i8 = 0;
        for (int i9 = 0; i9 < zt5VarArr.length; i9++) {
            qr5 qr5Var = qr5VarArr[i9];
            if (qr5Var != null && (zt5VarArr[i9] == null || !zArr[i9])) {
                int c8 = ((ar5) qr5Var).c();
                rx3.h(zArr3[c8]);
                this.V--;
                zArr3[c8] = false;
                qr5VarArr[i9] = null;
            }
        }
        boolean z7 = !this.S ? j7 == 0 || this.M : i7 != 0;
        for (int i10 = 0; i10 < zt5VarArr.length; i10++) {
            if (qr5VarArr[i10] == null && (zt5Var = zt5VarArr[i10]) != null) {
                rx3.h(zt5Var.c() == 1);
                rx3.h(zt5Var.B(0) == 0);
                int b8 = as5Var.b(zt5Var.a());
                rx3.h(!zArr3[b8]);
                this.V++;
                zArr3[b8] = true;
                this.U = zt5Var.d().f7781u | this.U;
                qr5VarArr[i10] = new ar5(this, b8);
                zArr2[i10] = true;
                if (!z7) {
                    pr5 pr5Var = this.H[b8];
                    z7 = (pr5Var.A() == 0 || pr5Var.H(j7, true)) ? false : true;
                }
            }
        }
        if (this.V == 0) {
            this.Z = false;
            this.T = false;
            this.U = false;
            dv5 dv5Var = this.f7281z;
            if (dv5Var.e()) {
                pr5[] pr5VarArr = this.H;
                int length = pr5VarArr.length;
                while (i8 < length) {
                    pr5VarArr[i8].L();
                    i8++;
                }
                dv5Var.f();
            } else {
                this.f7270b0 = false;
                for (pr5 pr5Var2 : this.H) {
                    pr5Var2.u(false);
                }
            }
        } else if (z7) {
            j7 = n(j7);
            while (i8 < qr5VarArr.length) {
                if (qr5VarArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.S = true;
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.av5
    public final void q() {
        for (pr5 pr5Var : this.H) {
            pr5Var.t();
        }
        this.A.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r23 == Long.MIN_VALUE) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0080  */
    @Override // com.google.android.gms.internal.ads.vp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long r(long r28, com.google.android.gms.internal.ads.yc5 r30) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dr5.r(long, com.google.android.gms.internal.ads.yc5):long");
    }

    @Override // com.google.android.gms.internal.ads.vp5
    public final void s(up5 up5Var, long j7) {
        this.F = up5Var;
        this.B.a();
        P();
    }

    final /* synthetic */ void u() {
        if (this.f7271c0) {
            return;
        }
        up5 up5Var = this.F;
        up5Var.getClass();
        up5Var.c(this);
    }

    final /* synthetic */ void v(q3 q3Var) {
        this.O = this.G == null ? q3Var : new p3(-9223372036854775807L, 0L);
        this.P = q3Var.a();
        boolean z7 = false;
        if (!this.W && q3Var.a() == -9223372036854775807L) {
            z7 = true;
        }
        this.Q = z7;
        this.R = true == z7 ? 7 : 1;
        if (this.K) {
            this.f7277v.b(this.P, q3Var, z7);
        } else {
            t();
        }
    }

    final /* synthetic */ void w() {
        this.W = true;
    }

    final /* synthetic */ void x() {
        this.E.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yq5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                dr5.this.w();
            }
        });
    }

    final /* synthetic */ long y(boolean z7) {
        return R(true);
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void z() {
        this.J = true;
        this.E.post(this.C);
    }

    @Override // com.google.android.gms.internal.ads.vp5, com.google.android.gms.internal.ads.sr5
    public final void b(long j7) {
    }
}
