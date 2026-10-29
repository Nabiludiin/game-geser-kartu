package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract class do5 extends gu4 {
    private static final byte[] S0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean A0;
    private int B0;
    private int C0;
    private int D0;
    private boolean E0;
    private boolean F0;
    private boolean G0;
    private long H0;
    private final kn5 I;
    private boolean I0;
    private final fo5 J;
    private boolean J0;
    private final float K;
    private boolean K0;
    private final wj4 L;
    protected hv4 L0;
    private final wj4 M;
    private bo5 M0;
    private final wj4 N;
    private long N0;
    private final zm5 O;
    private boolean O0;
    private final MediaCodec.BufferInfo P;
    private boolean P0;
    private final ArrayDeque Q;
    private boolean Q0;
    private final xl5 R;
    private long R0;
    private eq5 S;
    private eq5 T;
    private cm5 U;
    private cm5 V;
    private nc5 W;
    private MediaCrypto X;
    private long Y;
    private float Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f7192a0;

    /* renamed from: b0, reason: collision with root package name */
    private nn5 f7193b0;

    /* renamed from: c0, reason: collision with root package name */
    private eq5 f7194c0;

    /* renamed from: d0, reason: collision with root package name */
    private MediaFormat f7195d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f7196e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f7197f0;

    /* renamed from: g0, reason: collision with root package name */
    private ArrayDeque f7198g0;

    /* renamed from: h0, reason: collision with root package name */
    private zn5 f7199h0;

    /* renamed from: i0, reason: collision with root package name */
    private qn5 f7200i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f7201j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f7202k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f7203l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f7204m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f7205n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f7206o0;

    /* renamed from: p0, reason: collision with root package name */
    private long f7207p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f7208q0;

    /* renamed from: r0, reason: collision with root package name */
    private long f7209r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f7210s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f7211t0;

    /* renamed from: u0, reason: collision with root package name */
    private ByteBuffer f7212u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f7213v0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f7214w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f7215x0;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f7216y0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f7217z0;

    public do5(int i7, kn5 kn5Var, fo5 fo5Var, boolean z7, float f8) {
        super(i7);
        this.I = kn5Var;
        fo5Var.getClass();
        this.J = fo5Var;
        this.K = f8;
        this.L = new wj4(0, 0);
        this.M = new wj4(0, 0);
        this.N = new wj4(2, 0);
        zm5 zm5Var = new zm5();
        this.O = zm5Var;
        this.P = new MediaCodec.BufferInfo();
        this.Z = 1.0f;
        this.f7192a0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.Q = new ArrayDeque();
        this.M0 = bo5.f5877f;
        zm5Var.j(0);
        zm5Var.f18271d.order(ByteOrder.nativeOrder());
        this.R = new xl5();
        this.f7197f0 = -1.0f;
        this.f7201j0 = 0;
        this.B0 = 0;
        this.f7210s0 = -1;
        this.f7211t0 = -1;
        this.f7209r0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.f7207p0 = -9223372036854775807L;
        this.C0 = 0;
        this.D0 = 0;
        this.L0 = new hv4();
        this.Q0 = false;
        this.R0 = 0L;
    }

    private final void T0() {
        this.f7215x0 = false;
        Y0();
    }

    private final void Y0() {
        b1();
        this.f7217z0 = false;
        this.O.a();
        this.N.a();
        this.f7216y0 = false;
        this.R.b();
    }

    private final boolean Z0() {
        if (this.f7193b0 == null) {
            return false;
        }
        if (r0()) {
            p0();
            return true;
        }
        if (s0()) {
            a1();
            return false;
        }
        this.Q0 = true;
        return false;
    }

    private final void a1() {
        try {
            nn5 nn5Var = this.f7193b0;
            if (nn5Var == null) {
                throw null;
            }
            nn5Var.i();
        } finally {
            u0();
        }
    }

    private final void b1() {
        this.H0 = -9223372036854775807L;
        this.M0.f5882e = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
    }

    private final boolean c1(int i7) {
        hb5 Q = Q();
        wj4 wj4Var = this.L;
        wj4Var.a();
        int Y = Y(Q, wj4Var, i7 | 4);
        if (Y == -5) {
            R0(Q);
            return true;
        }
        if (Y != -4 || !wj4Var.b()) {
            return false;
        }
        this.I0 = true;
        q1();
        return false;
    }

    private final boolean d1(long j7) {
        return this.Y == -9223372036854775807L || U().b() - j7 < this.Y;
    }

    protected static boolean i1(eq5 eq5Var) {
        return eq5Var.N == 0;
    }

    private final boolean k1() {
        return this.f7211t0 >= 0;
    }

    private final void l1() {
        this.f7210s0 = -1;
        this.M.f18271d = null;
    }

    private final void m1() {
        this.f7211t0 = -1;
        this.f7212u0 = null;
    }

    private final boolean n1(eq5 eq5Var) {
        if (this.f7193b0 != null && this.D0 != 3 && c() != 0) {
            float f8 = this.f7192a0;
            eq5Var.getClass();
            float N0 = N0(f8, eq5Var, R());
            float f9 = this.f7197f0;
            if (f9 != N0) {
                if (N0 == -1.0f) {
                    p1();
                    return false;
                }
                if (f9 != -1.0f || N0 > this.K) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", N0);
                    nn5 nn5Var = this.f7193b0;
                    nn5Var.getClass();
                    nn5Var.X(bundle);
                    this.f7197f0 = N0;
                }
            }
        }
        return true;
    }

    private final boolean o1() {
        if (this.E0) {
            this.C0 = 1;
            if (this.f7203l0) {
                this.D0 = 3;
                return false;
            }
            this.D0 = 2;
        } else {
            t1();
        }
        return true;
    }

    private final void p1() {
        if (this.E0) {
            this.C0 = 1;
            this.D0 = 3;
        } else {
            p0();
            f0();
        }
    }

    private final void q1() {
        int i7 = this.D0;
        if (i7 == 1) {
            a1();
            return;
        }
        if (i7 == 2) {
            a1();
            t1();
        } else if (i7 != 3) {
            this.J0 = true;
            W0();
        } else {
            p0();
            f0();
        }
    }

    private final void r1(bo5 bo5Var) {
        this.M0 = bo5Var;
        if (bo5Var.f5880c != -9223372036854775807L) {
            this.O0 = true;
        }
    }

    private final bo5 s1() {
        ArrayDeque arrayDeque = this.Q;
        return !arrayDeque.isEmpty() ? (bo5) arrayDeque.getLast() : this.M0;
    }

    private final void t1() {
        cm5 cm5Var = this.V;
        cm5Var.getClass();
        this.U = cm5Var;
        this.C0 = 0;
        this.D0 = 0;
    }

    private final boolean u1(long j7, long j8) {
        if (j8 >= j7) {
            return false;
        }
        eq5 eq5Var = this.T;
        return (eq5Var != null && Objects.equals(eq5Var.f7775o, "audio/opus") && l3.f(j7, j8)) ? false : true;
    }

    protected boolean A0(wj4 wj4Var) {
        return false;
    }

    protected final long B0() {
        return this.N0;
    }

    protected void C0(long j7) {
        this.N0 = j7;
        while (true) {
            ArrayDeque arrayDeque = this.Q;
            if (arrayDeque.isEmpty() || j7 < ((bo5) arrayDeque.peek()).f5878a) {
                return;
            }
            bo5 bo5Var = (bo5) arrayDeque.poll();
            bo5Var.getClass();
            r1(bo5Var);
            U0();
        }
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public void D(float f8, float f9) {
        this.Z = f8;
        this.f7192a0 = f9;
        n1(this.f7194c0);
    }

    protected final boolean D0() {
        if (this.S == null) {
            return false;
        }
        if (a0() || k1()) {
            return true;
        }
        return this.f7209r0 != -9223372036854775807L && U().b() < this.f7209r0;
    }

    protected final float E0() {
        return this.Z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final nc5 F0() {
        return this.W;
    }

    protected final boolean G0() {
        return n1(this.f7194c0);
    }

    @Override // com.google.android.gms.internal.ads.sc5
    public final int H(eq5 eq5Var) {
        try {
            return H0(this.J, eq5Var);
        } catch (ho5 e8) {
            throw X(e8, eq5Var, false, 4002);
        }
    }

    protected abstract int H0(fo5 fo5Var, eq5 eq5Var);

    @Override // com.google.android.gms.internal.ads.gu4
    protected void I(long j7, boolean z7, boolean z8) {
        if (z8) {
            this.I0 = false;
            this.J0 = false;
            if (this.f7215x0) {
                Y0();
            } else {
                q0();
            }
            de2 de2Var = this.M0.f5881d;
            if (de2Var.c() > 0) {
                this.K0 = true;
            }
            de2Var.b();
            this.Q.clear();
        }
    }

    protected abstract List I0(fo5 fo5Var, eq5 eq5Var, boolean z7);

    protected boolean J0(eq5 eq5Var) {
        return false;
    }

    protected abstract jn5 K0(qn5 qn5Var, eq5 eq5Var, MediaCrypto mediaCrypto, float f8);

    @Override // com.google.android.gms.internal.ads.gu4
    protected void L() {
        this.S = null;
        r1(bo5.f5877f);
        this.Q.clear();
        if (this.f7215x0) {
            T0();
        } else {
            Z0();
        }
    }

    protected abstract iw4 L0(qn5 qn5Var, eq5 eq5Var, eq5 eq5Var2);

    @Override // com.google.android.gms.internal.ads.gu4
    protected void M() {
        try {
            T0();
            p0();
        } finally {
            this.V = null;
        }
    }

    protected long M0(long j7, long j8, boolean z7) {
        return super.z(j7, j8);
    }

    protected abstract float N0(float f8, eq5 eq5Var, eq5[] eq5VarArr);

    protected abstract void O0(String str, jn5 jn5Var, long j7, long j8);

    protected abstract void P0(String str);

    protected abstract void Q0(Exception exc);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (o1() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (o1() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (o1() == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.google.android.gms.internal.ads.iw4 R0(com.google.android.gms.internal.ads.hb5 r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.do5.R0(com.google.android.gms.internal.ads.hb5):com.google.android.gms.internal.ads.iw4");
    }

    protected abstract void S0(eq5 eq5Var, MediaFormat mediaFormat);

    protected abstract void U0();

    protected abstract boolean V0(long j7, long j8, nn5 nn5Var, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, eq5 eq5Var);

    protected abstract void W0();

    protected abstract void X0(wj4 wj4Var);

    @Override // com.google.android.gms.internal.ads.gu4
    protected void d0(boolean z7, boolean z8) {
        this.L0 = new hv4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f7, code lost:
    
        if (r0 >= r5.f7778r.size()) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f9, code lost:
    
        r5 = (byte[]) r21.f7194c0.f7778r.get(r0);
        r6 = r21.M.f18271d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0407, code lost:
    
        if (r6 == null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0409, code lost:
    
        r6.put(r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x040f, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0410, code lost:
    
        r21.B0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0413, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0414, code lost:
    
        r0 = r21.M;
        r5 = r0.f18271d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0418, code lost:
    
        if (r5 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x041a, code lost:
    
        r5 = r5.position();
        r6 = Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0422, code lost:
    
        r0 = Y(r6, r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0427, code lost:
    
        if (r0 != (-3)) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x043a, code lost:
    
        if (r0 != (-5)) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x043e, code lost:
    
        if (r21.B0 != 2) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0440, code lost:
    
        r21.M.a();
        r21.B0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0447, code lost:
    
        R0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x044c, code lost:
    
        r0 = r21.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0452, code lost:
    
        if (r0.b() == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0488, code lost:
    
        if (r21.E0 != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x048e, code lost:
    
        if (r0.c() != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0490, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0495, code lost:
    
        if (r21.B0 != 2) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0497, code lost:
    
        r21.B0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x049f, code lost:
    
        if (A0(r0) != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04a1, code lost:
    
        r6 = r0.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04a5, code lost:
    
        if (r6 == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04a7, code lost:
    
        r0.f18270c.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04ac, code lost:
    
        r7 = r0.f18273f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04b0, code lost:
    
        if (r21.K0 == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04b2, code lost:
    
        r5 = s1().f5881d;
        r9 = r21.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04ba, code lost:
    
        if (r9 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04bc, code lost:
    
        r5.a(r7, r9);
        r21.K0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04c2, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04c3, code lost:
    
        r21.H0 = java.lang.Math.max(r21.H0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04cf, code lost:
    
        if (C() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04d5, code lost:
    
        if (r0.d() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04df, code lost:
    
        r0.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04e6, code lost:
    
        if (r0.e() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04e8, code lost:
    
        X0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04ed, code lost:
    
        if (r21.Q0 == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04ef, code lost:
    
        r9 = r21.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04f3, code lost:
    
        if (r7 > r9) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04f5, code lost:
    
        r21.R0 += (r9 - r7) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04ff, code lost:
    
        r21.H0 = r7;
        r21.Q0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0503, code lost:
    
        y0(r0);
        r10 = z0(r0);
        r7 = r7 + r21.R0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x050d, code lost:
    
        if (r6 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x050f, code lost:
    
        r4.b(r21.f7210s0, 0, r0.f18270c, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0528, code lost:
    
        l1();
        r21.E0 = true;
        r21.B0 = 0;
        r21.L0.f9713c++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0519, code lost:
    
        r5 = r21.f7210s0;
        r0 = r0.f18271d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x051e, code lost:
    
        if (r0 == null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0520, code lost:
    
        r4.a(r5, 0, r0.limit(), r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0537, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04d7, code lost:
    
        s1().f5882e = r21.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0454, code lost:
    
        s1().f5882e = r21.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x045e, code lost:
    
        if (r21.B0 != 2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0460, code lost:
    
        r0.a();
        r21.B0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0465, code lost:
    
        r21.I0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0469, code lost:
    
        if (r21.E0 != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x046b, code lost:
    
        q1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0472, code lost:
    
        if (r21.f7206o0 != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0474, code lost:
    
        r21.F0 = true;
        r4.a(r21.f7210s0, 0, 0, 0, 4);
        l1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x042d, code lost:
    
        if (C() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x042f, code lost:
    
        s1().f5882e = r21.H0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0538, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0539, code lost:
    
        Q0(r0);
        c1(0);
        a1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x054a, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x000d, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03a1, code lost:
    
        if (r21.f7206o0 != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03a3, code lost:
    
        r21.F0 = true;
        r4.a(r21.f7210s0, 0, 0, 0, 4);
        l1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03b7, code lost:
    
        r21.C0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x035d, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x026a, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x02d6, code lost:
    
        if (r21.T != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0372, code lost:
    
        r4 = r21.f7193b0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0374, code lost:
    
        if (r4 == null) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0379, code lost:
    
        if (r21.C0 == 2) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x037d, code lost:
    
        if (r21.I0 == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0385, code lost:
    
        if (r21.f7210s0 >= 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0387, code lost:
    
        r0 = r4.c();
        r21.f7210s0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x038d, code lost:
    
        if (r0 < 0) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x038f, code lost:
    
        r5 = r21.M;
        r5.f18271d = r4.F(r0);
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x039c, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x039d, code lost:
    
        if (r21.C0 != 1) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03be, code lost:
    
        if (r21.f7204m0 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03c1, code lost:
    
        r21.f7204m0 = false;
        r0 = r21.M.f18271d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03c7, code lost:
    
        if (r0 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03c9, code lost:
    
        r0.put(com.google.android.gms.internal.ads.do5.S0);
        r4.a(r21.f7210s0, 0, 38, 0, 0);
        l1();
        r21.E0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03e6, code lost:
    
        throw r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03ea, code lost:
    
        if (r21.B0 != 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03ec, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03ed, code lost:
    
        r5 = r21.f7194c0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03ef, code lost:
    
        if (r5 == null) goto L414;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0369 A[LOOP:0: B:20:0x01fa->B:58:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.google.android.gms.internal.ads.pc5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(long r22, long r24) {
        /*
            Method dump skipped, instructions count: 1483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.do5.e(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.gu4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void e0(com.google.android.gms.internal.ads.eq5[] r12, long r13, long r15, com.google.android.gms.internal.ads.xp5 r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.bo5 r12 = r11.M0
            long r0 = r12.f5880c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.bo5 r4 = new com.google.android.gms.internal.ads.bo5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.r1(r4)
            boolean r12 = r11.P0
            if (r12 == 0) goto L56
            r11.U0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.Q
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.H0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.N0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.bo5 r4 = new com.google.android.gms.internal.ads.bo5
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.r1(r4)
            com.google.android.gms.internal.ads.bo5 r12 = r11.M0
            long r12 = r12.f5880c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.U0()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.bo5 r0 = new com.google.android.gms.internal.ads.bo5
            long r1 = r11.H0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.do5.e0(com.google.android.gms.internal.ads.eq5[], long, long, com.google.android.gms.internal.ads.xp5):void");
    }

    public final void e1() {
        this.P0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213 A[Catch: Exception -> 0x0109, TryCatch #2 {Exception -> 0x0109, blocks: (B:51:0x00e3, B:53:0x00e9, B:55:0x00fd, B:58:0x013b, B:60:0x014d, B:61:0x0169, B:63:0x0171, B:65:0x0179, B:67:0x0183, B:69:0x018b, B:71:0x0193, B:74:0x01d9, B:76:0x01df, B:79:0x01ec, B:81:0x01f2, B:84:0x01ff, B:86:0x0205, B:90:0x025e, B:92:0x0264, B:94:0x026a, B:95:0x0278, B:105:0x0213, B:107:0x021b, B:109:0x0223, B:111:0x022b, B:113:0x0233, B:115:0x023b, B:117:0x0243, B:119:0x024d, B:121:0x0257, B:129:0x01a1, B:131:0x01a9, B:134:0x01b5, B:136:0x01bf, B:138:0x01c7, B:140:0x01cf), top: B:50:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02cb A[Catch: zn5 -> 0x0084, TryCatch #3 {zn5 -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:188:0x0062, B:190:0x0078, B:191:0x0089, B:29:0x0095, B:31:0x009d, B:33:0x00a1, B:35:0x00a5, B:37:0x00ae, B:151:0x02b1, B:153:0x02cb, B:154:0x02d4, B:159:0x02de, B:160:0x02e0, B:161:0x02ce, B:179:0x02e2, B:181:0x02e3, B:184:0x02e8, B:185:0x02e9, B:186:0x02f3, B:195:0x008c, B:196:0x0094, B:198:0x02f6), top: B:24:0x0057, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ce A[Catch: zn5 -> 0x0084, TryCatch #3 {zn5 -> 0x0084, blocks: (B:25:0x0057, B:27:0x005e, B:188:0x0062, B:190:0x0078, B:191:0x0089, B:29:0x0095, B:31:0x009d, B:33:0x00a1, B:35:0x00a5, B:37:0x00ae, B:151:0x02b1, B:153:0x02cb, B:154:0x02d4, B:159:0x02de, B:160:0x02e0, B:161:0x02ce, B:179:0x02e2, B:181:0x02e3, B:184:0x02e8, B:185:0x02e9, B:186:0x02f3, B:195:0x008c, B:196:0x0094, B:198:0x02f6), top: B:24:0x0057, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01df A[Catch: Exception -> 0x0109, TryCatch #2 {Exception -> 0x0109, blocks: (B:51:0x00e3, B:53:0x00e9, B:55:0x00fd, B:58:0x013b, B:60:0x014d, B:61:0x0169, B:63:0x0171, B:65:0x0179, B:67:0x0183, B:69:0x018b, B:71:0x0193, B:74:0x01d9, B:76:0x01df, B:79:0x01ec, B:81:0x01f2, B:84:0x01ff, B:86:0x0205, B:90:0x025e, B:92:0x0264, B:94:0x026a, B:95:0x0278, B:105:0x0213, B:107:0x021b, B:109:0x0223, B:111:0x022b, B:113:0x0233, B:115:0x023b, B:117:0x0243, B:119:0x024d, B:121:0x0257, B:129:0x01a1, B:131:0x01a9, B:134:0x01b5, B:136:0x01bf, B:138:0x01c7, B:140:0x01cf), top: B:50:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2 A[Catch: Exception -> 0x0109, TryCatch #2 {Exception -> 0x0109, blocks: (B:51:0x00e3, B:53:0x00e9, B:55:0x00fd, B:58:0x013b, B:60:0x014d, B:61:0x0169, B:63:0x0171, B:65:0x0179, B:67:0x0183, B:69:0x018b, B:71:0x0193, B:74:0x01d9, B:76:0x01df, B:79:0x01ec, B:81:0x01f2, B:84:0x01ff, B:86:0x0205, B:90:0x025e, B:92:0x0264, B:94:0x026a, B:95:0x0278, B:105:0x0213, B:107:0x021b, B:109:0x0223, B:111:0x022b, B:113:0x0233, B:115:0x023b, B:117:0x0243, B:119:0x024d, B:121:0x0257, B:129:0x01a1, B:131:0x01a9, B:134:0x01b5, B:136:0x01bf, B:138:0x01c7, B:140:0x01cf), top: B:50:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0205 A[Catch: Exception -> 0x0109, TryCatch #2 {Exception -> 0x0109, blocks: (B:51:0x00e3, B:53:0x00e9, B:55:0x00fd, B:58:0x013b, B:60:0x014d, B:61:0x0169, B:63:0x0171, B:65:0x0179, B:67:0x0183, B:69:0x018b, B:71:0x0193, B:74:0x01d9, B:76:0x01df, B:79:0x01ec, B:81:0x01f2, B:84:0x01ff, B:86:0x0205, B:90:0x025e, B:92:0x0264, B:94:0x026a, B:95:0x0278, B:105:0x0213, B:107:0x021b, B:109:0x0223, B:111:0x022b, B:113:0x0233, B:115:0x023b, B:117:0x0243, B:119:0x024d, B:121:0x0257, B:129:0x01a1, B:131:0x01a9, B:134:0x01b5, B:136:0x01bf, B:138:0x01c7, B:140:0x01cf), top: B:50:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0264 A[Catch: Exception -> 0x0109, TryCatch #2 {Exception -> 0x0109, blocks: (B:51:0x00e3, B:53:0x00e9, B:55:0x00fd, B:58:0x013b, B:60:0x014d, B:61:0x0169, B:63:0x0171, B:65:0x0179, B:67:0x0183, B:69:0x018b, B:71:0x0193, B:74:0x01d9, B:76:0x01df, B:79:0x01ec, B:81:0x01f2, B:84:0x01ff, B:86:0x0205, B:90:0x025e, B:92:0x0264, B:94:0x026a, B:95:0x0278, B:105:0x0213, B:107:0x021b, B:109:0x0223, B:111:0x022b, B:113:0x0233, B:115:0x023b, B:117:0x0243, B:119:0x024d, B:121:0x0257, B:129:0x01a1, B:131:0x01a9, B:134:0x01b5, B:136:0x01bf, B:138:0x01c7, B:140:0x01cf), top: B:50:0x00e3 }] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.google.android.gms.internal.ads.kn5] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.android.gms.internal.ads.jn5] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void f0() {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.do5.f0():void");
    }

    protected final long f1() {
        return this.M0.f5882e;
    }

    protected final boolean g0(eq5 eq5Var) {
        return this.V == null && J0(eq5Var);
    }

    protected final long g1() {
        return this.M0.f5880c;
    }

    protected boolean h0(qn5 qn5Var) {
        return true;
    }

    protected final long h1() {
        return this.M0.f5879b;
    }

    protected final boolean i0() {
        return this.f7215x0;
    }

    protected final nn5 j0() {
        return this.f7193b0;
    }

    final /* synthetic */ nc5 j1() {
        return this.W;
    }

    protected final eq5 k0() {
        return this.f7194c0;
    }

    protected final MediaFormat l0() {
        return this.f7195d0;
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public boolean n0() {
        return this.J0;
    }

    protected final qn5 o0() {
        return this.f7200i0;
    }

    protected final void p0() {
        try {
            nn5 nn5Var = this.f7193b0;
            if (nn5Var != null) {
                nn5Var.l();
                this.L0.f9712b++;
                qn5 qn5Var = this.f7200i0;
                if (qn5Var == null) {
                    throw null;
                }
                P0(qn5Var.f14520a);
            }
            this.f7193b0 = null;
            this.X = null;
            this.U = null;
            v0();
        } catch (Throwable th) {
            this.f7193b0 = null;
            this.X = null;
            this.U = null;
            v0();
            throw th;
        }
    }

    protected final boolean q0() {
        boolean Z0 = Z0();
        if (Z0) {
            f0();
        }
        return Z0;
    }

    protected boolean r0() {
        int i7 = this.D0;
        if (i7 == 3 || ((this.f7202k0 && !this.G0) || (this.f7203l0 && this.F0))) {
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        try {
            t1();
            return false;
        } catch (b45 e8) {
            gv1.d("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e8);
            return true;
        }
    }

    protected boolean s0() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sc5
    public final int t() {
        return 8;
    }

    protected final long t0() {
        return this.R0;
    }

    protected void u0() {
        l1();
        m1();
        b1();
        this.f7209r0 = -9223372036854775807L;
        this.F0 = false;
        this.f7207p0 = -9223372036854775807L;
        this.E0 = false;
        this.f7204m0 = false;
        this.f7205n0 = false;
        this.f7213v0 = false;
        this.f7214w0 = false;
        this.C0 = 0;
        this.D0 = 0;
        this.B0 = this.A0 ? 1 : 0;
        this.Q0 = false;
        this.R0 = 0L;
    }

    protected final void v0() {
        u0();
        this.f7198g0 = null;
        this.f7200i0 = null;
        this.f7194c0 = null;
        this.f7195d0 = null;
        this.f7196e0 = false;
        this.G0 = false;
        this.f7197f0 = -1.0f;
        this.f7201j0 = 0;
        this.f7202k0 = false;
        this.f7203l0 = false;
        this.f7206o0 = false;
        this.f7208q0 = false;
        this.A0 = false;
        this.B0 = 0;
    }

    protected pn5 w0(Throwable th, qn5 qn5Var) {
        return new pn5(th, qn5Var);
    }

    protected boolean x0(eq5 eq5Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.jc5
    public void y(int i7, Object obj) {
        if (i7 == 11) {
            nc5 nc5Var = (nc5) obj;
            nc5Var.getClass();
            this.W = nc5Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.pc5
    public final long z(long j7, long j8) {
        return M0(j7, j8, this.f7208q0);
    }

    protected int z0(wj4 wj4Var) {
        return 0;
    }

    protected void y0(wj4 wj4Var) {
    }
}
