package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public final class wl5 extends do5 implements ob5 {
    private final Context T0;
    private final tj5 U0;
    private final ck5 V0;
    private final in5 W0;
    private int X0;
    private boolean Y0;
    private boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    private eq5 f18294a1;

    /* renamed from: b1, reason: collision with root package name */
    private eq5 f18295b1;

    /* renamed from: c1, reason: collision with root package name */
    private long f18296c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f18297d1;

    /* renamed from: e1, reason: collision with root package name */
    private boolean f18298e1;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f18299f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f18300g1;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f18301h1;

    /* renamed from: i1, reason: collision with root package name */
    private long f18302i1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl5(Context context, kn5 kn5Var, fo5 fo5Var, boolean z7, Handler handler, vj5 vj5Var, ck5 ck5Var) {
        super(1, kn5Var, fo5Var, false, 44100.0f);
        byte[] bArr = null;
        in5 in5Var = Build.VERSION.SDK_INT >= 35 ? new in5(dn5.f7184a) : null;
        this.T0 = context.getApplicationContext();
        this.V0 = ck5Var;
        this.W0 = in5Var;
        this.f18300g1 = -1000;
        this.U0 = new tj5(handler, vj5Var);
        this.f18302i1 = -9223372036854775807L;
        ck5Var.l(new vl5(this, bArr));
    }

    private static List A1(fo5 fo5Var, eq5 eq5Var, boolean z7, ck5 ck5Var) {
        qn5 a8;
        return eq5Var.f7775o == null ? w04.m() : (!ck5Var.y0(eq5Var) || (a8 = to5.a()) == null) ? to5.c(fo5Var, eq5Var, false, false) : w04.n(a8);
    }

    private final int B1(qn5 qn5Var, eq5 eq5Var) {
        if ("OMX.google.raw.decoder".equals(qn5Var.f14520a) && Build.VERSION.SDK_INT == 23 && !hi2.n(this.T0)) {
            return -1;
        }
        return eq5Var.f7776p;
    }

    private final void m1() {
        long v02 = this.V0.v0(n0());
        if (v02 != Long.MIN_VALUE) {
            if (!this.f18297d1) {
                v02 = Math.max(this.f18296c1, v02);
            }
            this.f18296c1 = v02;
            this.f18297d1 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final int H0(fo5 fo5Var, eq5 eq5Var) {
        int i7;
        boolean z7;
        String str = eq5Var.f7775o;
        if (!th.a(str)) {
            return 128;
        }
        int i8 = eq5Var.N;
        boolean i12 = do5.i1(eq5Var);
        int i9 = 1;
        if (!i12 || (i8 != 0 && to5.a() == null)) {
            i7 = 0;
        } else {
            ck5 ck5Var = this.V0;
            fj5 d8 = ck5Var.d(eq5Var);
            if (d8.f8289a) {
                i7 = true != d8.f8290b ? 512 : 1536;
                if (d8.f8291c) {
                    i7 |= 2048;
                }
            } else {
                i7 = 0;
            }
            if (ck5Var.y0(eq5Var)) {
                return i7 | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.V0.y0(eq5Var)) {
            ck5 ck5Var2 = this.V0;
            if (ck5Var2.y0(hi2.V(2, eq5Var.G, eq5Var.H))) {
                List A1 = A1(fo5Var, eq5Var, false, ck5Var2);
                if (!A1.isEmpty()) {
                    if (i12) {
                        qn5 qn5Var = (qn5) A1.get(0);
                        boolean c8 = qn5Var.c(eq5Var);
                        if (!c8) {
                            for (int i10 = 1; i10 < A1.size(); i10++) {
                                qn5 qn5Var2 = (qn5) A1.get(i10);
                                if (qn5Var2.c(eq5Var)) {
                                    z7 = false;
                                    c8 = true;
                                    qn5Var = qn5Var2;
                                    break;
                                }
                            }
                        }
                        z7 = true;
                        int i11 = true != c8 ? 3 : 4;
                        int i13 = 8;
                        if (c8 && qn5Var.e(eq5Var)) {
                            i13 = 16;
                        }
                        return i11 | i13 | 32 | (true != qn5Var.f14526g ? 0 : 64) | (true != z7 ? 0 : 128) | i7;
                    }
                    i9 = 2;
                }
            }
        }
        return i9 | 128;
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void I(long j7, boolean z7, boolean z8) {
        super.I(j7, z7, z8);
        this.V0.x();
        this.f18296c1 = j7;
        this.f18302i1 = -9223372036854775807L;
        this.f18299f1 = false;
        this.f18297d1 = true;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final List I0(fo5 fo5Var, eq5 eq5Var, boolean z7) {
        return to5.e(A1(fo5Var, eq5Var, false, this.V0), eq5Var);
    }

    @Override // com.google.android.gms.internal.ads.gu4
    protected final void J() {
        this.V0.j();
        this.f18301h1 = true;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean J0(eq5 eq5Var) {
        S();
        return this.V0.y0(eq5Var);
    }

    @Override // com.google.android.gms.internal.ads.gu4
    protected final void K() {
        m1();
        this.f18301h1 = false;
        this.V0.E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if ("AXON 7 mini".equals(r4) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    @Override // com.google.android.gms.internal.ads.do5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.jn5 K0(com.google.android.gms.internal.ads.qn5 r10, com.google.android.gms.internal.ads.eq5 r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wl5.K0(com.google.android.gms.internal.ads.qn5, com.google.android.gms.internal.ads.eq5, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.jn5");
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void L() {
        this.f18298e1 = true;
        this.f18294a1 = null;
        this.f18302i1 = -9223372036854775807L;
        try {
            this.V0.x();
            super.L();
        } catch (Throwable th) {
            super.L();
            throw th;
        } finally {
            this.U0.g(this.L0);
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final iw4 L0(qn5 qn5Var, eq5 eq5Var, eq5 eq5Var2) {
        int i7;
        int i8;
        iw4 f8 = qn5Var.f(eq5Var, eq5Var2);
        int i9 = f8.f10249e;
        if (g0(eq5Var2)) {
            i9 |= 32768;
        }
        if (B1(qn5Var, eq5Var2) > this.X0) {
            i9 |= 64;
        }
        String str = qn5Var.f14520a;
        if (i9 != 0) {
            i8 = 0;
            i7 = i9;
        } else {
            i7 = 0;
            i8 = f8.f10248d;
        }
        return new iw4(str, eq5Var, eq5Var2, i8, i7);
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void M() {
        this.f18299f1 = false;
        this.f18302i1 = -9223372036854775807L;
        try {
            super.M();
            if (this.f18298e1) {
                this.f18298e1 = false;
                this.V0.C();
            }
        } catch (Throwable th) {
            if (this.f18298e1) {
                this.f18298e1 = false;
                this.V0.C();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final long M0(long j7, long j8, boolean z7) {
        ck5 ck5Var = this.V0;
        boolean z8 = false;
        if (ck5Var.o() && this.f18302i1 != -9223372036854775807L) {
            z8 = true;
        }
        if (!this.f18301h1) {
            return (z8 || super.n0()) ? 1000000L : 10000L;
        }
        long z9 = ck5Var.z();
        if (!z8 || z9 == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(z9, this.f18302i1 - j7) / (i() != null ? i().f19630a : 1.0f)) / 2.0f)) - (hi2.N(U().b()) - j8));
    }

    @Override // com.google.android.gms.internal.ads.gu4
    protected final void N() {
        in5 in5Var;
        this.V0.J();
        if (Build.VERSION.SDK_INT < 35 || (in5Var = this.W0) == null) {
            return;
        }
        in5Var.d();
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final float N0(float f8, eq5 eq5Var, eq5[] eq5VarArr) {
        int i7 = -1;
        for (eq5 eq5Var2 : eq5VarArr) {
            int i8 = eq5Var2.H;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return i7 * f8;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void O0(String str, jn5 jn5Var, long j7, long j8) {
        this.U0.b(str, j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.pc5, com.google.android.gms.internal.ads.sc5
    public final String P() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void P0(String str) {
        this.U0.f(str);
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void Q0(Exception exc) {
        gv1.f("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.U0.j(exc);
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final iw4 R0(hb5 hb5Var) {
        eq5 eq5Var = hb5Var.f9416b;
        eq5Var.getClass();
        this.f18294a1 = eq5Var;
        iw4 R0 = super.R0(hb5Var);
        this.U0.c(eq5Var, R0);
        return R0;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void S0(eq5 eq5Var, MediaFormat mediaFormat) {
        int i7;
        eq5 eq5Var2 = this.f18295b1;
        int[] iArr = null;
        boolean z7 = true;
        if (eq5Var2 != null) {
            eq5Var = eq5Var2;
        } else if (j0() != null) {
            mediaFormat.getClass();
            int W = "audio/raw".equals(eq5Var.f7775o) ? eq5Var.I : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? hi2.W(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            xn5 xn5Var = new xn5();
            xn5Var.l0("audio/raw");
            xn5Var.g(W);
            xn5Var.h(eq5Var.J);
            xn5Var.i(eq5Var.K);
            xn5Var.j0(eq5Var.f7772l);
            xn5Var.A(eq5Var.f7761a);
            xn5Var.b0(eq5Var.f7762b);
            xn5Var.c0(eq5Var.f7763c);
            xn5Var.d0(eq5Var.f7764d);
            xn5Var.e0(eq5Var.f7765e);
            xn5Var.f0(eq5Var.f7766f);
            xn5Var.e(mediaFormat.getInteger("channel-count"));
            xn5Var.f(mediaFormat.getInteger("sample-rate"));
            eq5 m7 = xn5Var.m();
            if (this.Y0 && m7.G == 6 && (i7 = eq5Var.G) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.Z0) {
                int i9 = m7.G;
                if (i9 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i9 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i9 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i9 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i9 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            eq5Var = m7;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                if (i0()) {
                    S();
                }
                if (i10 < 29) {
                    z7 = false;
                }
                rx3.h(z7);
            }
            this.V0.t(eq5Var, 0, iArr);
        } catch (xj5 e8) {
            throw X(e8, e8.f18854q, false, 5001);
        }
    }

    protected final void T0() {
        this.f18297d1 = true;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void U0() {
        this.V0.i();
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean V0(long j7, long j8, nn5 nn5Var, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, eq5 eq5Var) {
        byteBuffer.getClass();
        this.f18302i1 = -9223372036854775807L;
        if (this.f18295b1 != null && (i8 & 2) != 0) {
            nn5Var.getClass();
            nn5Var.e(i7, false);
            return true;
        }
        if (z7) {
            if (nn5Var != null) {
                nn5Var.e(i7, false);
            }
            this.L0.f9716f += i9;
            this.V0.i();
            return true;
        }
        try {
            if (!this.V0.c(byteBuffer, j9, i9)) {
                this.f18302i1 = j9;
                return false;
            }
            if (nn5Var != null) {
                nn5Var.e(i7, false);
            }
            this.L0.f9715e += i9;
            return true;
        } catch (bk5 e8) {
            if (i0()) {
                S();
            }
            throw X(e8, eq5Var, e8.f5846r, 5002);
        } catch (yj5 e9) {
            eq5 eq5Var2 = this.f18294a1;
            if (i0()) {
                S();
            }
            throw X(e9, eq5Var2, e9.f19628r, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void W0() {
        try {
            this.V0.k();
            if (f1() != -9223372036854775807L) {
                this.f18302i1 = f1();
            }
        } catch (bk5 e8) {
            throw X(e8, e8.f5847s, e8.f5846r, true != i0() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void X0(wj4 wj4Var) {
        eq5 eq5Var;
        if (Build.VERSION.SDK_INT < 29 || (eq5Var = wj4Var.f18269b) == null || !Objects.equals(eq5Var.f7775o, "audio/opus") || !i0()) {
            return;
        }
        ByteBuffer byteBuffer = wj4Var.f18274g;
        byteBuffer.getClass();
        eq5 eq5Var2 = wj4Var.f18269b;
        eq5Var2.getClass();
        int i7 = eq5Var2.J;
        if (byteBuffer.remaining() == 8) {
            this.V0.h(i7, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void d0(boolean z7, boolean z8) {
        super.d0(z7, z8);
        this.U0.a(this.L0);
        S();
        ck5 ck5Var = this.V0;
        ck5Var.r(T());
        ck5Var.b(U());
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final long f() {
        if (c() == 2) {
            m1();
        }
        return this.f18296c1;
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final boolean g() {
        boolean z7 = this.f18299f1;
        this.f18299f1 = false;
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final yk i() {
        return this.V0.s();
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final boolean m0() {
        return this.V0.o();
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.pc5
    public final boolean n0() {
        return super.n0() && this.V0.n();
    }

    @Override // com.google.android.gms.internal.ads.ob5
    public final void v(yk ykVar) {
        this.V0.q(ykVar);
    }

    final /* synthetic */ tj5 x1() {
        return this.U0;
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.jc5
    public final void y(int i7, Object obj) {
        in5 in5Var;
        if (i7 == 2) {
            ck5 ck5Var = this.V0;
            obj.getClass();
            ck5Var.m(((Float) obj).floatValue());
            return;
        }
        if (i7 == 3) {
            mb1 mb1Var = (mb1) obj;
            ck5 ck5Var2 = this.V0;
            mb1Var.getClass();
            ck5Var2.f(mb1Var);
            return;
        }
        if (i7 == 6) {
            o22 o22Var = (o22) obj;
            ck5 ck5Var3 = this.V0;
            o22Var.getClass();
            ck5Var3.p(o22Var);
            return;
        }
        if (i7 == 12) {
            this.V0.e((AudioDeviceInfo) obj);
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.f18300g1 = ((Integer) obj).intValue();
            nn5 j02 = j0();
            if (j02 == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f18300g1));
            j02.X(bundle);
            return;
        }
        if (i7 == 9) {
            ck5 ck5Var4 = this.V0;
            obj.getClass();
            ck5Var4.g(((Boolean) obj).booleanValue());
        } else {
            if (i7 != 10) {
                super.y(i7, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.V0.N(intValue);
            if (Build.VERSION.SDK_INT < 35 || (in5Var = this.W0) == null) {
                return;
            }
            in5Var.a(intValue);
        }
    }

    final /* synthetic */ in5 y1() {
        return this.W0;
    }

    final /* synthetic */ void z1(boolean z7) {
        this.f18299f1 = true;
    }

    @Override // com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.pc5
    public final ob5 h() {
        return this;
    }
}
