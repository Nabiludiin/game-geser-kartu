package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class fb5 implements Handler.Callback, up5, fu5, ec5, w05, ic5, es4, c0 {

    /* renamed from: t0, reason: collision with root package name */
    private static final long f8128t0 = hi2.M(10000);
    private final yx A;
    private final ot B;
    private final long C;
    private final v15 D;
    private final ArrayList E;
    private final pd1 F;
    private final db5 G;
    private final sb5 H;
    private final fc5 I;
    private final long J;
    private final ni5 K;
    private final md5 L;
    private final zn1 M;
    private final boolean N;
    private final ft4 O;
    private yc5 P;
    private boolean R;
    private boolean S;
    private eb5 T;
    private int U;
    private gc5 V;
    private cb5 W;
    private boolean X;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f8129a0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f8131c0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f8134f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f8135g0;

    /* renamed from: h0, reason: collision with root package name */
    private eb5 f8136h0;

    /* renamed from: i0, reason: collision with root package name */
    private long f8137i0;

    /* renamed from: j0, reason: collision with root package name */
    private long f8138j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f8139k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f8140l0;

    /* renamed from: m0, reason: collision with root package name */
    private b45 f8141m0;

    /* renamed from: o0, reason: collision with root package name */
    private j95 f8143o0;

    /* renamed from: q, reason: collision with root package name */
    private final uc5[] f8145q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f8146q0;

    /* renamed from: r, reason: collision with root package name */
    private final sc5[] f8147r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean[] f8149s;

    /* renamed from: s0, reason: collision with root package name */
    private final jx4 f8150s0;

    /* renamed from: t, reason: collision with root package name */
    private final gu5 f8151t;

    /* renamed from: u, reason: collision with root package name */
    private final hu5 f8152u;

    /* renamed from: v, reason: collision with root package name */
    private final kb5 f8153v;

    /* renamed from: w, reason: collision with root package name */
    private final qu5 f8154w;

    /* renamed from: x, reason: collision with root package name */
    private final zn1 f8155x;

    /* renamed from: y, reason: collision with root package name */
    private final hc5 f8156y;

    /* renamed from: z, reason: collision with root package name */
    private final Looper f8157z;

    /* renamed from: p0, reason: collision with root package name */
    private long f8144p0 = -9223372036854775807L;

    /* renamed from: d0, reason: collision with root package name */
    private int f8132d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f8133e0 = false;
    private boolean Y = false;

    /* renamed from: r0, reason: collision with root package name */
    private float f8148r0 = 1.0f;
    private xc5 Q = xc5.f18749i;

    /* renamed from: n0, reason: collision with root package name */
    private long f8142n0 = -9223372036854775807L;

    /* renamed from: b0, reason: collision with root package name */
    private long f8130b0 = -9223372036854775807L;

    public fb5(Context context, pc5[] pc5VarArr, pc5[] pc5VarArr2, gu5 gu5Var, hu5 hu5Var, kb5 kb5Var, qu5 qu5Var, int i7, boolean z7, md5 md5Var, yc5 yc5Var, jx4 jx4Var, long j7, boolean z8, boolean z9, Looper looper, pd1 pd1Var, db5 db5Var, ni5 ni5Var, hc5 hc5Var, j95 j95Var, final c0 c0Var) {
        this.G = db5Var;
        this.f8151t = gu5Var;
        this.f8152u = hu5Var;
        this.f8153v = kb5Var;
        this.f8154w = qu5Var;
        this.P = yc5Var;
        this.f8150s0 = jx4Var;
        this.J = j7;
        this.F = pd1Var;
        this.K = ni5Var;
        this.f8143o0 = j95Var;
        this.L = md5Var;
        this.C = kb5Var.b(ni5Var);
        kb5Var.f(ni5Var);
        az azVar = az.f5406a;
        gc5 a8 = gc5.a(hu5Var);
        this.V = a8;
        this.W = new cb5(a8);
        int length = pc5VarArr.length;
        this.f8147r = new sc5[2];
        this.f8149s = new boolean[2];
        qc5 e8 = gu5Var.e();
        this.f8145q = new uc5[2];
        boolean z10 = false;
        for (int i8 = 0; i8 < 2; i8++) {
            pc5VarArr[i8].s(i8, ni5Var, pd1Var);
            this.f8147r[i8] = pc5VarArr[i8].b();
            this.f8147r[i8].E(e8);
            pc5 pc5Var = pc5VarArr2[i8];
            if (pc5Var != null) {
                pc5Var.s(i8, ni5Var, pd1Var);
                z10 = true;
            }
            this.f8145q[i8] = new uc5(pc5VarArr[i8], pc5VarArr2[i8], i8);
        }
        this.N = z10;
        this.D = new v15(this, pd1Var);
        this.E = new ArrayList();
        this.A = new yx();
        this.B = new ot();
        gu5Var.h(this, qu5Var);
        this.f8140l0 = true;
        zn1 c8 = pd1Var.c(looper, null);
        this.M = c8;
        this.H = new sb5(md5Var, c8, new ab5(this), j95Var);
        this.I = new fc5(this, md5Var, c8, ni5Var);
        hc5 hc5Var2 = new hc5(null);
        this.f8156y = hc5Var2;
        Looper a9 = hc5Var2.a();
        this.f8157z = a9;
        zn1 c9 = pd1Var.c(a9, this);
        this.f8155x = c9;
        this.O = new ft4(context, a9, this);
        c9.k(35, new c0() { // from class: com.google.android.gms.internal.ads.va5
            @Override // com.google.android.gms.internal.ads.c0
            public final /* synthetic */ void f(long j8, long j9, eq5 eq5Var, MediaFormat mediaFormat) {
                fb5.this.f(j8, j9, eq5Var, mediaFormat);
            }
        }).a();
    }

    private final void A(eb5 eb5Var, boolean z7) {
        long longValue;
        long j7;
        long j8;
        boolean z8;
        xp5 xp5Var;
        xp5 xp5Var2;
        boolean z9;
        long j9;
        long j10;
        xp5 xp5Var3;
        long j11;
        long j12;
        boolean z10;
        gc5 gc5Var;
        int i7;
        this.W.a(z7 ? 1 : 0);
        if (this.S) {
            if (this.T != null) {
                this.U++;
            }
            this.T = eb5Var;
            return;
        }
        az azVar = this.V.f8793a;
        int i8 = this.f8132d0;
        boolean z11 = this.f8133e0;
        yx yxVar = this.A;
        ot otVar = this.B;
        Pair M = M(azVar, eb5Var, true, i8, z11, yxVar, otVar);
        if (M == null) {
            Pair H = H(this.V.f8793a);
            xp5Var = (xp5) H.first;
            longValue = ((Long) H.second).longValue();
            z8 = !this.V.f8793a.g();
            j7 = -9223372036854775807L;
            j8 = 0;
        } else {
            Object obj = M.first;
            longValue = ((Long) M.second).longValue();
            long j13 = eb5Var.f7532c;
            j7 = j13 == -9223372036854775807L ? -9223372036854775807L : longValue;
            j8 = 0;
            xp5 K = this.H.K(this.V.f8793a, obj, longValue);
            if (K.b()) {
                this.V.f8793a.o(K.f18924a, otVar);
                if (otVar.d(K.f18925b) == K.f18926c) {
                    otVar.j();
                }
                xp5Var = K;
                z8 = true;
                longValue = 0;
            } else {
                z8 = j13 == -9223372036854775807L;
                xp5Var = K;
            }
        }
        try {
            if (this.V.f8793a.g()) {
                this.f8136h0 = eb5Var;
            } else if (M == null) {
                if (this.V.f8797e != 1) {
                    i(4);
                }
                G(false, true, false, true);
            } else {
                if (xp5Var.equals(this.V.f8794b)) {
                    pb5 y7 = this.H.y();
                    if (y7 == null || !y7.f13798e || longValue == j8) {
                        j10 = longValue;
                    } else {
                        vp5 vp5Var = y7.f13794a;
                        long j14 = yxVar.f19907l;
                        if (this.R && j14 != -9223372036854775807L) {
                            Double d8 = this.Q.f18751b;
                        }
                        j10 = vp5Var.r(longValue, this.P);
                    }
                    if (hi2.M(j10) == hi2.M(this.V.f8811s) && ((i7 = (gc5Var = this.V).f8797e) == 2 || i7 == 3)) {
                        longValue = gc5Var.f8811s;
                    }
                } else {
                    j10 = longValue;
                }
                this.S = this.R;
                long B = B(xp5Var, j10, this.V.f8797e == 4);
                boolean z12 = z8 | (longValue != B);
                try {
                    gc5 gc5Var2 = this.V;
                    az azVar2 = gc5Var2.f8793a;
                    xp5 xp5Var4 = xp5Var;
                    long j15 = j7;
                    try {
                        V(azVar2, xp5Var4, azVar2, gc5Var2.f8794b, j15, true);
                        xp5Var3 = xp5Var4;
                        j11 = j15;
                        j12 = B;
                        z10 = z12;
                        this.V = d0(xp5Var3, j12, j11, j12, z10, 2);
                    } catch (Throwable th) {
                        th = th;
                        xp5Var2 = xp5Var4;
                        j7 = j15;
                        j9 = B;
                        z9 = z12;
                        this.V = d0(xp5Var2, j9, j7, j9, z9, 2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xp5Var2 = xp5Var;
                }
            }
            z10 = z8;
            xp5Var3 = xp5Var;
            j12 = longValue;
            j11 = j7;
            this.V = d0(xp5Var3, j12, j11, j12, z10, 2);
        } catch (Throwable th3) {
            th = th3;
            xp5Var2 = xp5Var;
            z9 = z8;
            j9 = longValue;
        }
    }

    private final long B(xp5 xp5Var, long j7, boolean z7) {
        sb5 sb5Var = this.H;
        return C(xp5Var, j7, sb5Var.y() != sb5Var.z(), z7);
    }

    private final long C(xp5 xp5Var, long j7, boolean z7, boolean z8) {
        t();
        boolean z9 = true;
        L(false, true);
        if (z8 || this.V.f8797e == 3) {
            i(2);
        }
        sb5 sb5Var = this.H;
        pb5 y7 = sb5Var.y();
        pb5 pb5Var = y7;
        while (pb5Var != null && !xp5Var.equals(pb5Var.f13800g.f14361a)) {
            pb5Var = pb5Var.p();
        }
        if (z7 || y7 != pb5Var || (pb5Var != null && pb5Var.a() + j7 < 0)) {
            P();
            if (pb5Var != null) {
                while (sb5Var.y() != pb5Var) {
                    sb5Var.D();
                }
                sb5Var.E(pb5Var);
                pb5Var.b(1000000000000L);
                e0();
                pb5Var.f13801h = true;
            }
        }
        Q();
        if (pb5Var != null) {
            sb5Var.E(pb5Var);
            if (!pb5Var.f13798e) {
                pb5Var.f13800g = pb5Var.f13800g.a(j7);
            } else if (pb5Var.f13799f) {
                if (this.R) {
                    boolean z10 = this.Q.f18757h;
                    if (!this.V.f8793a.g() && pb5Var.f13800g.f14361a.equals(this.V.f8794b)) {
                        uc5[] uc5VarArr = this.f8145q;
                        boolean z11 = true;
                        for (int i7 = 0; i7 < 2; i7++) {
                            uc5 uc5Var = uc5VarArr[i7];
                            if (uc5Var.m()) {
                                z11 &= uc5Var.f(pb5Var, j7);
                            }
                        }
                        if (z11) {
                            vp5 vp5Var = pb5Var.f13794a;
                            long j8 = this.V.f8811s;
                            yc5 yc5Var = yc5.f19503d;
                            if (vp5Var.r(j8, yc5Var) == vp5Var.r(j7, yc5Var)) {
                                z9 = false;
                            }
                        }
                    }
                }
                vp5 vp5Var2 = pb5Var.f13794a;
                j7 = vp5Var2.n(j7);
                vp5Var2.f(j7 - this.C, false);
            }
            D(j7, z9);
            b0();
        } else {
            sb5Var.H();
            D(j7, true);
        }
        h0(false);
        this.f8155x.F(2);
        return j7;
    }

    private final void D(long j7, boolean z7) {
        pb5 y7 = this.H.y();
        long a8 = j7 + (y7 == null ? 1000000000000L : y7.a());
        this.f8137i0 = a8;
        this.D.c(a8);
        uc5[] uc5VarArr = this.f8145q;
        for (int i7 = 0; i7 < 2; i7++) {
            uc5VarArr[i7].e(y7, this.f8137i0, z7);
        }
        for (pb5 y8 = r0.y(); y8 != null; y8 = y8.p()) {
            for (zt5 zt5Var : y8.r().f9704c) {
            }
        }
    }

    private final void E() {
        int i7 = 0;
        while (true) {
            uc5[] uc5VarArr = this.f8145q;
            if (i7 >= 2) {
                return;
            }
            uc5VarArr[i7].Z(this.R ? this.Q : null);
            i7++;
        }
    }

    private final void F(boolean z7, boolean z8) {
        G(z7 || !this.f8134f0, false, true, false);
        this.W.a(z8 ? 1 : 0);
        this.f8153v.j(this.K);
        this.O.c(this.V.f8804l, 1);
        i(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r2.equals(r34.V.f8794b) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb5.G(boolean, boolean, boolean, boolean):void");
    }

    static final /* synthetic */ void G0(kc5 kc5Var) {
        try {
            N(kc5Var);
        } catch (b45 e8) {
            gv1.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e8);
            throw new RuntimeException(e8);
        }
    }

    private final Pair H(az azVar) {
        long j7 = 0;
        if (azVar.g()) {
            return Pair.create(gc5.b(), 0L);
        }
        int k7 = azVar.k(this.f8133e0);
        yx yxVar = this.A;
        ot otVar = this.B;
        Pair m7 = azVar.m(yxVar, otVar, k7, -9223372036854775807L);
        xp5 K = this.H.K(azVar, m7.first, 0L);
        long longValue = ((Long) m7.second).longValue();
        if (K.b()) {
            azVar.o(K.f18924a, otVar);
            if (K.f18926c == otVar.d(K.f18925b)) {
                otVar.j();
            }
        } else {
            j7 = longValue;
        }
        return Pair.create(K, Long.valueOf(j7));
    }

    private final void I(az azVar, az azVar2) {
        if (azVar.g() && azVar2.g()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final boolean D0() {
        if (!this.R) {
            return false;
        }
        boolean z7 = this.Q.f18755f;
        return true;
    }

    private static boolean K(gc5 gc5Var, ot otVar) {
        xp5 xp5Var = gc5Var.f8794b;
        az azVar = gc5Var.f8793a;
        return azVar.g() || azVar.o(xp5Var.f18924a, otVar).f13480f;
    }

    private final void L(boolean z7, boolean z8) {
        this.f8129a0 = z7;
        long j7 = -9223372036854775807L;
        if (z7 && !z8) {
            j7 = SystemClock.elapsedRealtime();
        }
        this.f8130b0 = j7;
    }

    private static Pair M(az azVar, eb5 eb5Var, boolean z7, int i7, boolean z8, yx yxVar, ot otVar) {
        Pair m7;
        az azVar2;
        az azVar3 = eb5Var.f7530a;
        if (azVar.g()) {
            return null;
        }
        if (true == azVar3.g()) {
            azVar3 = azVar;
        }
        try {
            m7 = azVar3.m(yxVar, otVar, eb5Var.f7531b, eb5Var.f7532c);
            azVar2 = azVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (azVar.equals(azVar2)) {
            return m7;
        }
        if (azVar.e(m7.first) != -1) {
            return (azVar2.o(m7.first, otVar).f13480f && azVar2.b(otVar.f13477c, yxVar, 0L).f19908m == azVar2.e(m7.first)) ? azVar.m(yxVar, otVar, azVar.o(m7.first, otVar).f13477c, eb5Var.f7532c) : m7;
        }
        int z02 = z0(yxVar, otVar, i7, z8, m7.first, azVar2, azVar);
        if (z02 != -1) {
            return azVar.m(yxVar, otVar, z02, -9223372036854775807L);
        }
        return null;
    }

    private static final void N(kc5 kc5Var) {
        kc5Var.h();
        try {
            kc5Var.a().y(kc5Var.c(), kc5Var.e());
        } finally {
            kc5Var.i(true);
        }
    }

    private static final boolean O(pb5 pb5Var) {
        if (pb5Var != null) {
            try {
                if (pb5Var.f13798e) {
                    qr5[] qr5VarArr = pb5Var.f13796c;
                    for (int i7 = 0; i7 < 2; i7++) {
                        qr5 qr5Var = qr5VarArr[i7];
                        if (qr5Var != null) {
                            qr5Var.d();
                        }
                    }
                } else {
                    pb5Var.f13794a.d();
                }
                if (pb5Var.g() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void P() {
        int i7 = 0;
        while (true) {
            uc5[] uc5VarArr = this.f8145q;
            if (i7 >= 2) {
                this.f8144p0 = -9223372036854775807L;
                return;
            }
            int D = uc5VarArr[i7].D();
            uc5VarArr[i7].a(this.D);
            w(i7, false);
            this.f8135g0 -= D;
            i7++;
        }
    }

    private final void Q() {
        if (this.N && o0()) {
            uc5[] uc5VarArr = this.f8145q;
            for (int i7 = 0; i7 < 2; i7++) {
                uc5 uc5Var = uc5VarArr[i7];
                int D = uc5Var.D();
                uc5Var.c(this.D);
                this.f8135g0 -= D - uc5Var.D();
            }
            this.f8144p0 = -9223372036854775807L;
        }
    }

    private final void R() {
        S();
        r(true);
    }

    private final void S() {
        fb5 fb5Var;
        int i7;
        boolean z7;
        v15 v15Var = this.D;
        float f8 = v15Var.i().f19630a;
        sb5 sb5Var = this.H;
        pb5 y7 = sb5Var.y();
        pb5 z8 = sb5Var.z();
        hu5 hu5Var = null;
        boolean z9 = true;
        while (y7 != null && y7.f13798e) {
            gc5 gc5Var = this.V;
            hu5 k7 = y7.k(f8, gc5Var.f8793a, gc5Var.f8804l);
            hu5 hu5Var2 = y7 == sb5Var.y() ? k7 : hu5Var;
            hu5 r7 = y7.r();
            boolean z10 = false;
            if (r7 != null) {
                zt5[] zt5VarArr = k7.f9704c;
                if (r7.f9704c.length == zt5VarArr.length) {
                    for (int i8 = 0; i8 < zt5VarArr.length; i8++) {
                        if (k7.b(r7, i8)) {
                        }
                    }
                    if (y7 != z8) {
                        z10 = true;
                    }
                    z9 &= z10;
                    y7 = y7.p();
                    hu5Var = hu5Var2;
                }
            }
            if (z9) {
                pb5 y8 = sb5Var.y();
                int E = sb5Var.E(y8) & 1;
                uc5[] uc5VarArr = this.f8145q;
                boolean[] zArr = new boolean[2];
                hu5Var2.getClass();
                long m7 = y8.m(hu5Var2, this.V.f8811s, 1 == E, zArr);
                gc5 gc5Var2 = this.V;
                if (gc5Var2.f8797e == 4 || m7 == gc5Var2.f8811s) {
                    z7 = false;
                } else {
                    z7 = false;
                    z10 = true;
                }
                gc5 gc5Var3 = this.V;
                boolean z11 = z7;
                i7 = 2;
                fb5Var = this;
                fb5Var.V = d0(gc5Var3.f8794b, m7, gc5Var3.f8795c, gc5Var3.f8796d, z10, 5);
                if (z10) {
                    fb5Var.D(m7, true);
                }
                fb5Var.Q();
                boolean[] zArr2 = new boolean[2];
                for (int i9 = z11; i9 < 2; i9++) {
                    int D = uc5VarArr[i9].D();
                    zArr2[i9] = uc5VarArr[i9].m();
                    uc5VarArr[i9].d(y8.f13796c[i9], v15Var, fb5Var.f8137i0, zArr[i9]);
                    if (D - uc5VarArr[i9].D() > 0) {
                        fb5Var.w(i9, z11);
                    }
                    fb5Var.f8135g0 -= D - uc5VarArr[i9].D();
                }
                fb5Var.f0(zArr2, fb5Var.f8137i0);
                y8.f13801h = true;
            } else {
                fb5Var = this;
                i7 = 2;
                sb5Var.E(y7);
                if (y7.f13798e) {
                    long max = Math.max(y7.f13800g.f14362b, fb5Var.f8137i0 - y7.a());
                    if (fb5Var.N && fb5Var.o0() && sb5Var.A() == y7) {
                        fb5Var.Q();
                    }
                    y7.l(k7, max, false);
                }
            }
            fb5Var.h0(true);
            if (fb5Var.V.f8797e != 4) {
                fb5Var.b0();
                fb5Var.u();
                fb5Var.f8155x.F(i7);
                return;
            }
            return;
        }
    }

    private final boolean T() {
        pb5 y7 = this.H.y();
        long j7 = y7.f13800g.f14365e;
        if (y7.f13798e) {
            return j7 == -9223372036854775807L || this.V.f8811s < j7 || !m0();
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:91|92|(1:94)(1:127)|95)|(5:(3:118|119|(10:121|122|98|99|100|101|102|103|104|(2:106|107)(2:108|(1:110))))|102|103|104|(0)(0))|97|98|99|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02c3, code lost:
    
        r2 = r31;
        r15 = r19;
        r10 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b8 A[Catch: all -> 0x02b1, TryCatch #0 {all -> 0x02b1, blocks: (B:107:0x02ad, B:108:0x02b8, B:110:0x02bb, B:51:0x02d0, B:53:0x02d8, B:55:0x02e0, B:57:0x02ea, B:59:0x02f5, B:62:0x02fa), top: B:49:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0383  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void U(com.google.android.gms.internal.ads.az r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb5.U(com.google.android.gms.internal.ads.az, boolean):void");
    }

    private final void V(az azVar, xp5 xp5Var, az azVar2, xp5 xp5Var2, long j7, boolean z7) {
        if (!y(azVar, xp5Var)) {
            yk ykVar = xp5Var.b() ? yk.f19629d : this.V.f8807o;
            if (this.D.i().equals(ykVar)) {
                return;
            }
            v(ykVar);
            a0(this.V.f8807o, ykVar.f19630a, false, false);
            return;
        }
        Object obj = xp5Var.f18924a;
        ot otVar = this.B;
        int i7 = azVar.o(obj, otVar).f13477c;
        yx yxVar = this.A;
        azVar.b(i7, yxVar, 0L);
        jx4 jx4Var = this.f8150s0;
        n4 n4Var = yxVar.f19904i;
        String str = hi2.f9535a;
        jx4Var.a(n4Var);
        if (j7 != -9223372036854775807L) {
            jx4Var.b(x(azVar, obj, j7));
            return;
        }
        if (!Objects.equals(!azVar2.g() ? azVar2.b(azVar2.o(xp5Var2.f18924a, otVar).f13477c, yxVar, 0L).f19896a : null, yxVar.f19896a) || z7) {
            jx4Var.b(-9223372036854775807L);
        }
    }

    private final long W(pb5 pb5Var) {
        if (pb5Var == null) {
            return 0L;
        }
        long a8 = pb5Var.a();
        if (pb5Var.f13798e) {
            int i7 = 0;
            while (true) {
                uc5[] uc5VarArr = this.f8145q;
                if (i7 >= 2) {
                    break;
                }
                if (uc5VarArr[i7].P(pb5Var)) {
                    long F = uc5VarArr[i7].F(pb5Var);
                    if (F == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    a8 = Math.max(F, a8);
                }
                i7++;
            }
        }
        return a8;
    }

    private final void X() {
        sb5 sb5Var = this.H;
        sb5Var.F();
        pb5 x7 = sb5Var.x();
        if (x7 != null) {
            if (!x7.f13797d || x7.f13798e) {
                vp5 vp5Var = x7.f13794a;
                if (vp5Var.o()) {
                    return;
                }
                if (this.f8153v.h(this.K, this.V.f8793a, x7.f13800g.f14361a, x7.f13798e ? vp5Var.j() : 0L)) {
                    if (!x7.f13797d) {
                        x7.t(this, x7.f13800g.f14362b);
                        return;
                    }
                    lb5 lb5Var = new lb5();
                    lb5Var.a(this.f8137i0 - x7.a());
                    lb5Var.b(this.D.i().f19630a);
                    lb5Var.c(this.f8130b0);
                    x7.j(new mb5(lb5Var, null));
                }
            }
        }
    }

    private final void Y() {
        pb5 y7 = this.H.y();
        boolean z7 = false;
        if (y7 != null && y7.f13800g.f14369i && this.Y) {
            z7 = true;
        }
        this.Z = z7;
    }

    private final void Z(yk ykVar, boolean z7) {
        a0(ykVar, ykVar.f19630a, true, z7);
    }

    private final void a0(yk ykVar, float f8, boolean z7, boolean z8) {
        int i7;
        if (z7) {
            if (z8) {
                this.W.a(1);
            }
            gc5 gc5Var = this.V;
            this.V = new gc5(gc5Var.f8793a, gc5Var.f8794b, gc5Var.f8795c, gc5Var.f8796d, gc5Var.f8797e, gc5Var.f8798f, gc5Var.f8799g, gc5Var.f8800h, gc5Var.f8801i, gc5Var.f8802j, gc5Var.f8803k, gc5Var.f8804l, gc5Var.f8805m, gc5Var.f8806n, ykVar, gc5Var.f8809q, gc5Var.f8810r, gc5Var.f8811s, gc5Var.f8812t, false);
        }
        float f9 = ykVar.f19630a;
        pb5 y7 = this.H.y();
        while (true) {
            i7 = 0;
            if (y7 == null) {
                break;
            }
            zt5[] zt5VarArr = y7.r().f9704c;
            int length = zt5VarArr.length;
            while (i7 < length) {
                zt5 zt5Var = zt5VarArr[i7];
                i7++;
            }
            y7 = y7.p();
        }
        uc5[] uc5VarArr = this.f8145q;
        while (i7 < 2) {
            uc5VarArr[i7].M(f8, f9);
            i7++;
        }
    }

    private final void b0() {
        long a8;
        long j7;
        sb5 sb5Var = this.H;
        boolean z7 = false;
        if (O(sb5Var.w())) {
            pb5 w7 = sb5Var.w();
            long j02 = j0(w7.g());
            if (w7 == sb5Var.y()) {
                a8 = this.f8137i0;
                j7 = w7.a();
            } else {
                a8 = this.f8137i0 - w7.a();
                j7 = w7.f13800g.f14362b;
            }
            ib5 ib5Var = new ib5(this.K, this.V.f8793a, w7.f13800g.f14361a, a8 - j7, j02, this.D.i().f19630a, this.V.f8804l, this.f8129a0, y(this.V.f8793a, w7.f13800g.f14361a) ? this.f8150s0.e() : -9223372036854775807L, this.f8130b0);
            kb5 kb5Var = this.f8153v;
            boolean c8 = kb5Var.c(ib5Var);
            pb5 y7 = sb5Var.y();
            if (c8 || !y7.f13798e || j02 >= 500000 || this.C <= 0) {
                z7 = c8;
            } else {
                y7.f13794a.f(this.V.f8811s, false);
                z7 = kb5Var.c(ib5Var);
            }
        }
        this.f8131c0 = z7;
        if (z7) {
            pb5 w8 = sb5Var.w();
            w8.getClass();
            lb5 lb5Var = new lb5();
            lb5Var.a(this.f8137i0 - w8.a());
            lb5Var.b(this.D.i().f19630a);
            lb5Var.c(this.f8130b0);
            w8.j(new mb5(lb5Var, null));
        }
        c0();
    }

    private final void c0() {
        pb5 w7 = this.H.w();
        boolean z7 = true;
        if (!this.f8131c0 && (w7 == null || !w7.f13794a.o())) {
            z7 = false;
        }
        gc5 gc5Var = this.V;
        if (z7 != gc5Var.f8799g) {
            this.V = gc5Var.g(z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd A[EDGE_INSN: B:51:0x00cd->B:52:0x00cd BREAK  A[LOOP:1: B:39:0x00ae->B:47:0x00ca], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.gc5 d0(com.google.android.gms.internal.ads.xp5 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb5.d0(com.google.android.gms.internal.ads.xp5, long, long, long, boolean, int):com.google.android.gms.internal.ads.gc5");
    }

    private final void e0() {
        f0(new boolean[2], this.H.z().c());
    }

    private final void f0(boolean[] zArr, long j7) {
        uc5[] uc5VarArr;
        long j8;
        pb5 z7 = this.H.z();
        hu5 r7 = z7.r();
        int i7 = 0;
        while (true) {
            uc5VarArr = this.f8145q;
            if (i7 >= 2) {
                break;
            }
            if (!r7.a(i7)) {
                uc5VarArr[i7].g();
            }
            i7++;
        }
        int i8 = 0;
        while (i8 < 2) {
            if (!r7.a(i8) || uc5VarArr[i8].P(z7)) {
                j8 = j7;
            } else {
                j8 = j7;
                g0(z7, i8, zArr[i8], j8);
            }
            i8++;
            j7 = j8;
        }
    }

    private final void g0(pb5 pb5Var, int i7, boolean z7, long j7) {
        uc5 uc5Var = this.f8145q[i7];
        if (uc5Var.m()) {
            return;
        }
        boolean z8 = pb5Var == this.H.y();
        hu5 r7 = pb5Var.r();
        tc5 tc5Var = r7.f9703b[i7];
        zt5 zt5Var = r7.f9704c[i7];
        boolean z9 = m0() && this.V.f8797e == 3;
        boolean z10 = !z7 && z9;
        this.f8135g0++;
        uc5Var.X(tc5Var, zt5Var, pb5Var.f13796c[i7], this.f8137i0, z10, z8, j7, pb5Var.a(), pb5Var.f13800g.f14361a, this.D);
        uc5Var.Y(11, new ua5(this), pb5Var);
        if (z9 && z8) {
            uc5Var.V();
        }
    }

    private final void h(IOException iOException, int i7) {
        sb5 sb5Var = this.H;
        b45 a8 = b45.a(iOException, i7);
        pb5 y7 = sb5Var.y();
        if (y7 != null) {
            a8 = a8.d(y7.f13800g.f14361a);
        }
        gv1.f("ExoPlayerImplInternal", "Playback error", a8);
        F(false, false);
        this.V = this.V.f(a8);
    }

    private final void h0(boolean z7) {
        pb5 w7 = this.H.w();
        xp5 xp5Var = w7 == null ? this.V.f8794b : w7.f13800g.f14361a;
        boolean equals = this.V.f8803k.equals(xp5Var);
        if (!equals) {
            this.V = this.V.h(xp5Var);
        }
        gc5 gc5Var = this.V;
        gc5Var.f8809q = w7 == null ? gc5Var.f8811s : w7.f();
        this.V.f8810r = i0();
        if ((!equals || z7) && w7 != null && w7.f13798e) {
            l0(w7.f13800g.f14361a, w7.q(), w7.r());
        }
    }

    private final void i(int i7) {
        gc5 gc5Var = this.V;
        if (gc5Var.f8797e != i7) {
            if (i7 != 2) {
                this.f8142n0 = -9223372036854775807L;
            }
            this.V = gc5Var.e(i7);
        }
    }

    private final long i0() {
        return j0(this.V.f8809q);
    }

    private final void j() {
        this.W.b(this.V);
        if (this.W.d()) {
            this.G.a(this.W);
            this.W = new cb5(this.V);
        }
    }

    private final long j0(long j7) {
        pb5 w7 = this.H.w();
        if (w7 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - (this.f8137i0 - w7.a()));
    }

    private final void k(float f8) {
        this.f8148r0 = f8;
        float a8 = f8 * this.O.a();
        int i7 = 0;
        while (true) {
            uc5[] uc5VarArr = this.f8145q;
            if (i7 >= 2) {
                return;
            }
            uc5VarArr[i7].l(a8);
            i7++;
        }
    }

    private final long k0(pb5 pb5Var) {
        rx3.h(pb5Var.f13798e);
        return (long) ((pb5Var.c() - this.f8137i0) / this.D.i().f19630a);
    }

    private final void l(boolean z7, int i7, boolean z8, int i8) {
        this.W.a(z8 ? 1 : 0);
        o(z7, i7, i8);
    }

    private final void l0(xp5 xp5Var, as5 as5Var, hu5 hu5Var) {
        long a8;
        long j7;
        sb5 sb5Var = this.H;
        pb5 w7 = sb5Var.w();
        w7.getClass();
        if (w7 == sb5Var.y()) {
            a8 = this.f8137i0;
            j7 = w7.a();
        } else {
            a8 = this.f8137i0 - w7.a();
            j7 = w7.f13800g.f14362b;
        }
        this.f8153v.e(new ib5(this.K, this.V.f8793a, xp5Var, a8 - j7, j0(w7.f()), this.D.i().f19630a, this.V.f8804l, this.f8129a0, y(this.V.f8793a, w7.f13800g.f14361a) ? this.f8150s0.e() : -9223372036854775807L, this.f8130b0), as5Var, hu5Var.f9704c);
    }

    private final boolean m0() {
        gc5 gc5Var = this.V;
        return gc5Var.f8804l && gc5Var.f8806n == 0;
    }

    private final void n() {
        gc5 gc5Var = this.V;
        o(gc5Var.f8804l, gc5Var.f8806n, gc5Var.f8805m);
    }

    private final void n0(int i7) {
        uc5 uc5Var = this.f8145q[i7];
        try {
            pb5 y7 = this.H.y();
            if (y7 == null) {
                throw null;
            }
            uc5Var.U(y7);
        } catch (IOException e8) {
            e = e8;
            uc5Var.E();
            throw e;
        } catch (RuntimeException e9) {
            e = e9;
            uc5Var.E();
            throw e;
        }
    }

    private final void o(boolean z7, int i7, int i8) {
        p(z7, this.O.c(z7, this.V.f8797e), i7, i8);
    }

    private final boolean o0() {
        if (!this.N) {
            return false;
        }
        uc5[] uc5VarArr = this.f8145q;
        for (int i7 = 0; i7 < 2; i7++) {
            if (uc5VarArr[i7].C()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p(boolean r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r5 == 0) goto La
            if (r6 == r0) goto L9
            r5 = r1
            goto Lb
        L9:
            r6 = r0
        La:
            r5 = r2
        Lb:
            r3 = 2
            if (r6 != r0) goto L10
            r8 = r3
            goto L13
        L10:
            if (r8 != r3) goto L13
            r8 = r1
        L13:
            boolean r0 = r4.R
            if (r6 != 0) goto L19
            r7 = r1
            goto L20
        L19:
            if (r7 != r1) goto L20
            if (r0 == 0) goto L1f
            r7 = 4
            goto L20
        L1f:
            r7 = r2
        L20:
            com.google.android.gms.internal.ads.gc5 r6 = r4.V
            boolean r0 = r6.f8804l
            if (r0 != r5) goto L2e
            int r0 = r6.f8806n
            if (r0 != r7) goto L2e
            int r0 = r6.f8805m
            if (r0 == r8) goto L85
        L2e:
            com.google.android.gms.internal.ads.gc5 r5 = r6.i(r5, r8, r7)
            r4.V = r5
            r4.L(r2, r2)
            com.google.android.gms.internal.ads.sb5 r5 = r4.H
            com.google.android.gms.internal.ads.pb5 r6 = r5.y()
        L3d:
            if (r6 == 0) goto L53
            com.google.android.gms.internal.ads.hu5 r7 = r6.r()
            com.google.android.gms.internal.ads.zt5[] r7 = r7.f9704c
            int r8 = r7.length
            r0 = r2
        L47:
            if (r0 >= r8) goto L4e
            r1 = r7[r0]
            int r0 = r0 + 1
            goto L47
        L4e:
            com.google.android.gms.internal.ads.pb5 r6 = r6.p()
            goto L3d
        L53:
            boolean r6 = r4.m0()
            if (r6 != 0) goto L69
            r4.t()
            r4.u()
            com.google.android.gms.internal.ads.gc5 r6 = r4.V
            boolean r6 = r6.f8808p
            long r6 = r4.f8137i0
            r5.r(r6)
            return
        L69:
            com.google.android.gms.internal.ads.gc5 r5 = r4.V
            int r5 = r5.f8797e
            r6 = 3
            if (r5 != r6) goto L7e
            com.google.android.gms.internal.ads.v15 r5 = r4.D
            r5.a()
            r4.s()
            com.google.android.gms.internal.ads.zn1 r5 = r4.f8155x
            r5.F(r3)
            return
        L7e:
            if (r5 != r3) goto L85
            com.google.android.gms.internal.ads.zn1 r5 = r4.f8155x
            r5.F(r3)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb5.p(boolean, int, int, int):void");
    }

    private final void r(boolean z7) {
        xp5 xp5Var = this.H.y().f13800g.f14361a;
        long C = C(xp5Var, this.V.f8811s, true, false);
        if (C != this.V.f8811s) {
            gc5 gc5Var = this.V;
            this.V = d0(xp5Var, C, gc5Var.f8795c, gc5Var.f8796d, z7, 5);
        }
    }

    private final void s() {
        pb5 y7 = this.H.y();
        if (y7 == null) {
            return;
        }
        hu5 r7 = y7.r();
        int i7 = 0;
        while (true) {
            uc5[] uc5VarArr = this.f8145q;
            if (i7 >= 2) {
                return;
            }
            if (r7.a(i7)) {
                uc5VarArr[i7].V();
            }
            i7++;
        }
    }

    private final void t() {
        this.D.b();
        int i7 = 0;
        while (true) {
            uc5[] uc5VarArr = this.f8145q;
            if (i7 >= 2) {
                return;
            }
            uc5VarArr[i7].W();
            i7++;
        }
    }

    private final void u() {
        sb5 sb5Var = this.H;
        pb5 y7 = sb5Var.y();
        if (y7 == null) {
            return;
        }
        long g8 = y7.f13798e ? y7.f13794a.g() : -9223372036854775807L;
        if (g8 != -9223372036854775807L) {
            if (!y7.d()) {
                sb5Var.E(y7);
                h0(false);
                b0();
            }
            D(g8, true);
            if (g8 != this.V.f8811s) {
                gc5 gc5Var = this.V;
                long j7 = g8;
                this.V = d0(gc5Var.f8794b, j7, gc5Var.f8795c, j7, true, 5);
            }
        } else {
            v15 v15Var = this.D;
            long h8 = v15Var.h(y7 != sb5Var.z());
            this.f8137i0 = h8;
            long a8 = h8 - y7.a();
            long j8 = this.V.f8811s;
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty() && !this.V.f8794b.b()) {
                if (this.f8140l0) {
                    this.f8140l0 = false;
                }
                gc5 gc5Var2 = this.V;
                gc5Var2.f8793a.e(gc5Var2.f8794b.f18924a);
                int min = Math.min(this.f8139k0, arrayList.size());
                if (min > 0) {
                    android.support.v4.media.session.b.a(arrayList.get(min - 1));
                }
                if (min < arrayList.size()) {
                    android.support.v4.media.session.b.a(arrayList.get(min));
                }
                this.f8139k0 = min;
            }
            if (v15Var.g()) {
                boolean z7 = !this.W.f6354d;
                gc5 gc5Var3 = this.V;
                this.V = d0(gc5Var3.f8794b, a8, gc5Var3.f8795c, a8, z7, 6);
            } else {
                gc5 gc5Var4 = this.V;
                gc5Var4.f8811s = a8;
                gc5Var4.f8812t = SystemClock.elapsedRealtime();
            }
        }
        this.V.f8809q = sb5Var.w().f();
        this.V.f8810r = i0();
        gc5 gc5Var5 = this.V;
        if (gc5Var5.f8804l && gc5Var5.f8797e == 3 && y(gc5Var5.f8793a, gc5Var5.f8794b)) {
            gc5 gc5Var6 = this.V;
            if (gc5Var6.f8807o.f19630a == 1.0f) {
                float d8 = this.f8150s0.d(x(gc5Var6.f8793a, gc5Var6.f8794b.f18924a, gc5Var6.f8811s), this.V.f8810r);
                v15 v15Var2 = this.D;
                if (v15Var2.i().f19630a != d8) {
                    v(new yk(d8, this.V.f8807o.f19631b));
                    a0(this.V.f8807o, v15Var2.i().f19630a, false, false);
                }
            }
        }
    }

    private final void v(yk ykVar) {
        this.f8155x.P(16);
        this.D.v(ykVar);
    }

    private final void w(final int i7, final boolean z7) {
        boolean[] zArr = this.f8149s;
        if (zArr[i7] != z7) {
            zArr[i7] = z7;
            this.M.j(new Runnable() { // from class: com.google.android.gms.internal.ads.wa5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    fb5.this.B0(i7, z7);
                }
            });
        }
    }

    private final long x(az azVar, Object obj, long j7) {
        int i7 = azVar.o(obj, this.B).f13477c;
        yx yxVar = this.A;
        azVar.b(i7, yxVar, 0L);
        if (yxVar.f19900e == -9223372036854775807L || !yxVar.b() || !yxVar.f19903h) {
            return -9223372036854775807L;
        }
        long j8 = yxVar.f19901f;
        String str = hi2.f9535a;
        return hi2.N((j8 == -9223372036854775807L ? System.currentTimeMillis() : j8 + SystemClock.elapsedRealtime()) - yxVar.f19900e) - j7;
    }

    private final boolean y(az azVar, xp5 xp5Var) {
        if (!xp5Var.b() && !azVar.g()) {
            int i7 = azVar.o(xp5Var.f18924a, this.B).f13477c;
            yx yxVar = this.A;
            azVar.b(i7, yxVar, 0L);
            if (yxVar.b() && yxVar.f19903h && yxVar.f19900e != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void z(long j7) {
        if (D0()) {
            r2 = this.V.f8797e != 3 ? f8128t0 : 1000L;
            uc5[] uc5VarArr = this.f8145q;
            for (int i7 = 0; i7 < 2; i7++) {
                r2 = Math.min(r2, hi2.M(uc5VarArr[i7].K(this.f8137i0, this.f8138j0)));
            }
            if (this.V.j()) {
                sb5 sb5Var = this.H;
                if ((sb5Var.y() != null ? sb5Var.y().p() : null) != null) {
                    if (this.f8137i0 + (hi2.N(r2) * this.V.f8807o.f19630a) >= r0.c()) {
                        r2 = Math.min(r2, f8128t0);
                    }
                }
            }
        } else if (this.V.f8797e != 3 || m0()) {
            r2 = f8128t0;
        }
        this.f8155x.c(2, j7 + r2);
    }

    static int z0(yx yxVar, ot otVar, int i7, boolean z7, Object obj, az azVar, az azVar2) {
        yx yxVar2 = yxVar;
        az azVar3 = azVar;
        Object obj2 = azVar3.b(azVar3.o(obj, otVar).f13477c, yxVar, 0L).f19896a;
        for (int i8 = 0; i8 < azVar2.a(); i8++) {
            if (azVar2.b(i8, yxVar, 0L).f19896a.equals(obj2)) {
                return i8;
            }
        }
        int e8 = azVar3.e(obj);
        int c8 = azVar3.c();
        int i9 = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= c8 || i9 != -1) {
                break;
            }
            az azVar4 = azVar3;
            int l7 = azVar4.l(e8, otVar, yxVar2, i7, z7);
            if (l7 == -1) {
                i9 = -1;
                break;
            }
            i9 = azVar2.e(azVar4.f(l7));
            i10++;
            azVar3 = azVar4;
            e8 = l7;
            yxVar2 = yxVar;
        }
        if (i9 == -1) {
            return -1;
        }
        return azVar2.d(i9, otVar, false).f13477c;
    }

    final /* synthetic */ pb5 A0(qb5 qb5Var, long j7) {
        ku5 d8 = this.f8153v.d(this.K);
        long j8 = this.f8143o0.f10416a;
        hu5 hu5Var = this.f8152u;
        fc5 fc5Var = this.I;
        return new pb5(this.f8147r, j7, this.f8151t, d8, fc5Var, qb5Var, hu5Var, -9223372036854775807L);
    }

    final /* synthetic */ void B0(int i7, boolean z7) {
        this.L.s(i7, this.f8145q[i7].E(), z7);
    }

    final /* synthetic */ void C0(int i7) {
        this.L.a0(i7);
    }

    final /* synthetic */ zn1 E0() {
        return this.f8155x;
    }

    public final void F0(List list, int i7, long j7, tr5 tr5Var) {
        this.f8155x.k(17, new bb5(list, tr5Var, i7, j7, null)).a();
    }

    @Override // com.google.android.gms.internal.ads.ic5
    public final void a(kc5 kc5Var) {
        if (!this.X && this.f8157z.getThread().isAlive()) {
            this.f8155x.k(14, kc5Var).a();
        } else {
            gv1.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            kc5Var.i(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.es4
    public final void b(int i7) {
        this.f8155x.e(33, i7, 0).a();
    }

    @Override // com.google.android.gms.internal.ads.rr5
    public final /* bridge */ /* synthetic */ void c(sr5 sr5Var) {
        this.f8155x.k(9, (vp5) sr5Var).a();
    }

    @Override // com.google.android.gms.internal.ads.w05
    public final void d(yk ykVar) {
        this.f8155x.k(16, ykVar).a();
    }

    @Override // com.google.android.gms.internal.ads.up5
    public final void e(vp5 vp5Var) {
        this.f8155x.k(8, vp5Var).a();
    }

    @Override // com.google.android.gms.internal.ads.c0
    public final void f(long j7, long j8, eq5 eq5Var, MediaFormat mediaFormat) {
        if (this.S) {
            this.f8155x.R(37).a();
        }
    }

    @Override // com.google.android.gms.internal.ads.es4
    public final void g(float f8) {
        this.f8155x.F(34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:391:0x09f7, code lost:
    
        if (r6 != false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a24, code lost:
    
        if (r7 == false) goto L536;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e9 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x04b6, b45 -> 0x04b9, TRY_ENTER, TRY_LEAVE, TryCatch #15 {RuntimeException -> 0x04b6, blocks: (B:638:0x04b0, B:639:0x04cf, B:641:0x04d5, B:642:0x04da, B:160:0x04e5, B:162:0x04e9, B:163:0x04fa, B:165:0x0501, B:167:0x0505, B:169:0x0509, B:171:0x050f, B:173:0x0515, B:175:0x051b, B:177:0x0521, B:179:0x0529, B:181:0x0535, B:183:0x053f, B:184:0x0545, B:186:0x0549, B:188:0x054f, B:190:0x0557, B:192:0x055f, B:628:0x04f7, B:643:0x04be, B:645:0x04c4), top: B:156:0x049a }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0758 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0772 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, LOOP:5: B:216:0x076e->B:218:0x0772, LOOP_END, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0792 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07c3 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07e3 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07ef A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0853 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, LOOP:8: B:265:0x0851->B:266:0x0853, LOOP_END, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0861 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0871 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0882 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a5f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0ac0 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0ad3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0ad4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05e0 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x057a, b45 -> 0x057d, TRY_LEAVE, TryCatch #26 {b45 -> 0x057d, RuntimeException -> 0x057a, blocks: (B:194:0x0576, B:196:0x0594, B:200:0x059d, B:202:0x05ae, B:204:0x05bc, B:205:0x05d5, B:208:0x0752, B:210:0x0758, B:212:0x075e, B:215:0x0763, B:216:0x076e, B:218:0x0772, B:223:0x0797, B:225:0x079d, B:227:0x07a5, B:229:0x07ad, B:233:0x07b0, B:235:0x07b9, B:289:0x0884, B:290:0x0890, B:295:0x089d, B:297:0x08a5, B:298:0x08ab, B:300:0x08b9, B:301:0x08d3, B:303:0x08d7, B:305:0x08df, B:307:0x090c, B:308:0x08e5, B:310:0x08f0, B:313:0x08f9, B:318:0x0909, B:325:0x0920, B:327:0x0926, B:331:0x092e, B:333:0x0936, B:335:0x093a, B:336:0x0945, B:338:0x094b, B:339:0x0a58, B:342:0x0a60, B:344:0x0a64, B:346:0x0a6c, B:348:0x0a6f, B:351:0x0a73, B:353:0x0a79, B:355:0x0a82, B:357:0x0a8c, B:359:0x0a92, B:361:0x0a98, B:362:0x0aba, B:364:0x0ac0, B:367:0x0aca, B:370:0x0ae3, B:376:0x0adc, B:378:0x0ae0, B:380:0x0a9f, B:383:0x0aad, B:384:0x0ab5, B:385:0x0ab6, B:386:0x0954, B:388:0x095b, B:390:0x095f, B:392:0x09f9, B:394:0x0a05, B:397:0x0969, B:399:0x096d, B:401:0x097f, B:402:0x098a, B:404:0x0994, B:407:0x099d, B:409:0x09a7, B:414:0x09b2, B:418:0x0a12, B:420:0x0a19, B:422:0x0a1d, B:425:0x0a26, B:427:0x0a36, B:429:0x0a3c, B:431:0x0a46, B:433:0x0a4b, B:435:0x0a50, B:436:0x0a55, B:438:0x0917, B:237:0x07c3, B:239:0x07c7, B:241:0x07cd, B:243:0x07d3, B:245:0x07dd, B:248:0x07e3, B:249:0x07e6, B:251:0x07ef, B:253:0x0801, B:255:0x080a, B:257:0x0812, B:260:0x081e, B:262:0x0848, B:264:0x084e, B:266:0x0853, B:268:0x085b, B:270:0x0861, B:271:0x0864, B:272:0x086d, B:274:0x0871, B:276:0x0877, B:278:0x087c, B:286:0x0883, B:444:0x05e0, B:478:0x05fc, B:485:0x060d, B:489:0x061f, B:494:0x0635, B:499:0x0674, B:501:0x067b, B:503:0x067f, B:505:0x068f, B:507:0x0693, B:511:0x069a, B:513:0x06a0, B:515:0x06bd, B:520:0x06c6, B:524:0x06cb, B:526:0x06d2, B:528:0x06da, B:530:0x06e0, B:532:0x0685, B:536:0x06ef, B:447:0x0719, B:449:0x071f, B:451:0x0723, B:453:0x0728, B:457:0x074f, B:458:0x0731, B:460:0x0737, B:464:0x0745, B:465:0x074c, B:656:0x0ae8, B:659:0x0af3), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0baf A[ADDED_TO_REGION, LOOP:19: B:561:0x0baf->B:564:0x0bb7, LOOP_START, PHI: r2
  0x0baf: PHI (r2v32 com.google.android.gms.internal.ads.pb5) = (r2v30 com.google.android.gms.internal.ads.pb5), (r2v33 com.google.android.gms.internal.ads.pb5) binds: [B:560:0x0bac, B:564:0x0bb7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x04f7 A[Catch: IOException -> 0x0029, zm3 -> 0x002c, wi -> 0x002f, bm5 -> 0x0032, RuntimeException -> 0x04b6, b45 -> 0x0584, TRY_ENTER, TryCatch #6 {b45 -> 0x0584, blocks: (B:160:0x04e5, B:163:0x04fa, B:165:0x0501, B:167:0x0505, B:169:0x0509, B:171:0x050f, B:173:0x0515, B:175:0x051b, B:177:0x0521, B:179:0x0529, B:181:0x0535, B:183:0x053f, B:184:0x0545, B:186:0x0549, B:188:0x054f, B:190:0x0557, B:192:0x055f, B:628:0x04f7), top: B:159:0x04e5 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r43) {
        /*
            Method dump skipped, instructions count: 3238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fb5.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.fu5
    public final void m() {
        this.f8155x.F(10);
    }

    public final void p0() {
        this.f8155x.R(29).a();
    }

    @Override // com.google.android.gms.internal.ads.ec5
    public final void q() {
        zn1 zn1Var = this.f8155x;
        zn1Var.P(2);
        zn1Var.F(22);
    }

    public final void q0(boolean z7, int i7, int i8) {
        this.f8155x.e(1, z7 ? 1 : 0, (i8 << 4) | 1).a();
    }

    public final void r0(az azVar, int i7, long j7) {
        this.f8155x.k(3, new eb5(azVar, i7, j7)).a();
    }

    public final void s0(xc5 xc5Var) {
        this.f8155x.k(38, xc5Var).a();
    }

    public final void t0() {
        this.f8155x.R(6).a();
    }

    public final void u0(mb1 mb1Var, boolean z7) {
        this.f8155x.m(31, 0, 0, mb1Var).a();
    }

    public final void v0(float f8) {
        this.f8155x.k(32, Float.valueOf(f8)).a();
    }

    public final boolean w0(Object obj, long j7) {
        if (this.X || !this.f8157z.getThread().isAlive()) {
            return true;
        }
        sg1 sg1Var = new sg1(this.F);
        this.f8155x.k(30, new Pair(obj, sg1Var)).a();
        if (j7 != -9223372036854775807L) {
            return sg1Var.e(j7);
        }
        return true;
    }

    public final boolean x0() {
        if (this.X || !this.f8157z.getThread().isAlive()) {
            return true;
        }
        this.X = true;
        sg1 sg1Var = new sg1(this.F);
        this.f8155x.k(7, sg1Var).a();
        return sg1Var.e(this.J);
    }

    public final Looper y0() {
        return this.f8157z;
    }
}
