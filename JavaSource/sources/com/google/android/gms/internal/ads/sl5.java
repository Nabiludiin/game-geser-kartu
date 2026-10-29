package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class sl5 implements ck5 {

    /* renamed from: h0, reason: collision with root package name */
    private static final Object f15673h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    private static ScheduledExecutorService f15674i0;

    /* renamed from: j0, reason: collision with root package name */
    private static int f15675j0;
    private long A;
    private long B;
    private long C;
    private long D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private float I;
    private ByteBuffer J;
    private int K;
    private ByteBuffer L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private int Q;
    private boolean R;
    private o22 S;
    private AudioDeviceInfo T;
    private long U;
    private boolean V;
    private boolean W;
    private Looper X;
    private long Y;
    private long Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15676a;

    /* renamed from: a0, reason: collision with root package name */
    private Handler f15677a0;

    /* renamed from: b, reason: collision with root package name */
    private final hk5 f15678b;

    /* renamed from: b0, reason: collision with root package name */
    private Context f15679b0;

    /* renamed from: c, reason: collision with root package name */
    private final am5 f15680c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f15681c0;

    /* renamed from: d, reason: collision with root package name */
    private final tu0 f15682d;

    /* renamed from: d0, reason: collision with root package name */
    private int f15683d0;

    /* renamed from: e, reason: collision with root package name */
    private final zl5 f15684e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f15685e0;

    /* renamed from: f, reason: collision with root package name */
    private final w04 f15686f;

    /* renamed from: f0, reason: collision with root package name */
    private final ok5 f15687f0;

    /* renamed from: g, reason: collision with root package name */
    private final gk5 f15688g;

    /* renamed from: g0, reason: collision with root package name */
    private final kk5 f15689g0;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayDeque f15690h;

    /* renamed from: i, reason: collision with root package name */
    private kl5 f15691i;

    /* renamed from: j, reason: collision with root package name */
    private final el5 f15692j;

    /* renamed from: k, reason: collision with root package name */
    private final el5 f15693k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15694l;

    /* renamed from: m, reason: collision with root package name */
    private ni5 f15695m;

    /* renamed from: n, reason: collision with root package name */
    private zj5 f15696n;

    /* renamed from: o, reason: collision with root package name */
    private nk5 f15697o;

    /* renamed from: p, reason: collision with root package name */
    private nk5 f15698p;

    /* renamed from: q, reason: collision with root package name */
    private hm0 f15699q;

    /* renamed from: r, reason: collision with root package name */
    private AudioTrack f15700r;

    /* renamed from: s, reason: collision with root package name */
    private yi5 f15701s;

    /* renamed from: t, reason: collision with root package name */
    private dj5 f15702t;

    /* renamed from: u, reason: collision with root package name */
    private dl5 f15703u;

    /* renamed from: v, reason: collision with root package name */
    private mb1 f15704v;

    /* renamed from: w, reason: collision with root package name */
    private uk5 f15705w;

    /* renamed from: x, reason: collision with root package name */
    private uk5 f15706x;

    /* renamed from: y, reason: collision with root package name */
    private yk f15707y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15708z;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a5, code lost:
    
        r10 = r10.b().getDeviceId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ sl5(com.google.android.gms.internal.ads.mk5 r10, byte[] r11) {
        /*
            r9 = this;
            r9.<init>()
            android.content.Context r11 = r10.b()
            r0 = 0
            if (r11 != 0) goto Lc
            r11 = r0
            goto L14
        Lc:
            android.content.Context r11 = r10.b()
            android.content.Context r11 = r11.getApplicationContext()
        L14:
            r9.f15676a = r11
            com.google.android.gms.internal.ads.mb1 r1 = com.google.android.gms.internal.ads.mb1.f12165b
            r9.f15704v = r1
            if (r11 == 0) goto L1e
            r11 = r0
            goto L22
        L1e:
            com.google.android.gms.internal.ads.yi5 r11 = r10.c()
        L22:
            r9.f15701s = r11
            com.google.android.gms.internal.ads.ok5 r11 = r10.d()
            r9.f15687f0 = r11
            com.google.android.gms.internal.ads.kk5 r11 = r10.e()
            r11.getClass()
            r9.f15689g0 = r11
            com.google.android.gms.internal.ads.gk5 r11 = new com.google.android.gms.internal.ads.gk5
            com.google.android.gms.internal.ads.fl5 r1 = new com.google.android.gms.internal.ads.fl5
            r1.<init>(r9, r0)
            r11.<init>(r1)
            r9.f15688g = r11
            com.google.android.gms.internal.ads.hk5 r11 = new com.google.android.gms.internal.ads.hk5
            r11.<init>()
            r9.f15678b = r11
            com.google.android.gms.internal.ads.am5 r0 = new com.google.android.gms.internal.ads.am5
            r0.<init>()
            r9.f15680c = r0
            com.google.android.gms.internal.ads.tu0 r1 = new com.google.android.gms.internal.ads.tu0
            r1.<init>()
            r9.f15682d = r1
            com.google.android.gms.internal.ads.zl5 r1 = new com.google.android.gms.internal.ads.zl5
            r1.<init>()
            r9.f15684e = r1
            com.google.android.gms.internal.ads.w04 r11 = com.google.android.gms.internal.ads.w04.o(r0, r11)
            r9.f15686f = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.I = r11
            r11 = 0
            r9.Q = r11
            com.google.android.gms.internal.ads.o22 r0 = new com.google.android.gms.internal.ads.o22
            r1 = 0
            r0.<init>(r11, r1)
            r9.S = r0
            com.google.android.gms.internal.ads.uk5 r2 = new com.google.android.gms.internal.ads.uk5
            com.google.android.gms.internal.ads.yk r3 = com.google.android.gms.internal.ads.yk.f19629d
            r6 = 0
            r8 = 0
            r4 = 0
            r2.<init>(r3, r4, r6, r8)
            r9.f15706x = r2
            r9.f15707y = r3
            r9.f15708z = r11
            java.util.ArrayDeque r11 = new java.util.ArrayDeque
            r11.<init>()
            r9.f15690h = r11
            com.google.android.gms.internal.ads.el5 r11 = new com.google.android.gms.internal.ads.el5
            r11.<init>()
            r9.f15692j = r11
            com.google.android.gms.internal.ads.el5 r11 = new com.google.android.gms.internal.ads.el5
            r11.<init>()
            r9.f15693k = r11
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r1 = -1
            if (r11 < r0) goto Lb3
            android.content.Context r11 = r10.b()
            if (r11 != 0) goto La5
            goto Lb3
        La5:
            android.content.Context r10 = r10.b()
            int r10 = com.google.android.gms.internal.ads.ol5.a(r10)
            if (r10 == 0) goto Lb3
            if (r10 != r1) goto Lb2
            goto Lb3
        Lb2:
            r1 = r10
        Lb3:
            r9.f15694l = r1
            r10 = 1
            r9.f15681c0 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl5.<init>(com.google.android.gms.internal.ads.mk5, byte[]):void");
    }

    static /* synthetic */ boolean B() {
        boolean z7;
        synchronized (f15673h0) {
            z7 = f15675j0 > 0;
        }
        return z7;
    }

    private final void I() {
        hm0 hm0Var = this.f15698p.f12777i;
        this.f15699q = hm0Var;
        hm0Var.b(ko0.f11167b);
    }

    private final AudioTrack K(nk5 nk5Var) {
        Context context;
        Context createDeviceContext;
        try {
            int i7 = this.Q;
            int i8 = this.f15694l;
            Context context2 = null;
            if (i8 != -1 && (context = this.f15676a) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.f15679b0 == null) {
                    createDeviceContext = context.createDeviceContext(i8);
                    this.f15679b0 = createDeviceContext;
                }
                context2 = this.f15679b0;
                i7 = 0;
            }
            return d0(nk5Var.a(), this.f15704v, i7, nk5Var.f12769a, context2);
        } catch (yj5 e8) {
            zj5 zj5Var = this.f15696n;
            if (zj5Var != null) {
                zj5Var.c(e8);
            }
            throw e8;
        }
    }

    private final void L(long j7) {
        P(j7);
        if (this.L != null) {
            return;
        }
        if (!this.f15699q.c()) {
            ByteBuffer byteBuffer = this.J;
            if (byteBuffer != null) {
                O(byteBuffer);
                P(j7);
                return;
            }
            return;
        }
        while (!this.f15699q.g()) {
            do {
                ByteBuffer e8 = this.f15699q.e();
                if (e8.hasRemaining()) {
                    O(e8);
                    P(j7);
                } else {
                    ByteBuffer byteBuffer2 = this.J;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f15699q.d(this.J);
                    }
                }
            } while (this.L == null);
            return;
        }
    }

    private final boolean M() {
        if (!this.f15699q.c()) {
            P(Long.MIN_VALUE);
            return this.L == null;
        }
        this.f15699q.f();
        L(Long.MIN_VALUE);
        if (!this.f15699q.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.L;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void O(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl5.O(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void P(long r8) {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.L
            if (r8 != 0) goto L6
            goto Lbb
        L6:
            com.google.android.gms.internal.ads.el5 r8 = r7.f15693k
            boolean r9 = r8.b()
            if (r9 != 0) goto Lbb
            java.nio.ByteBuffer r9 = r7.L
            int r9 = r9.remaining()
            android.media.AudioTrack r0 = r7.f15700r
            java.nio.ByteBuffer r1 = r7.L
            r2 = 1
            int r0 = r0.write(r1, r9, r2)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r7.U = r3
            r3 = 0
            r1 = 0
            if (r0 >= 0) goto L72
            int r9 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r9 < r5) goto L31
            r9 = -6
            if (r0 == r9) goto L35
        L31:
            r9 = -32
            if (r0 != r9) goto L4a
        L35:
            long r5 = r7.A()
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 <= 0) goto L3e
            goto L4b
        L3e:
            android.media.AudioTrack r9 = r7.f15700r
            boolean r9 = Z(r9)
            if (r9 == 0) goto L4a
            r7.Q()
            goto L4b
        L4a:
            r2 = r1
        L4b:
            com.google.android.gms.internal.ads.bk5 r9 = new com.google.android.gms.internal.ads.bk5
            com.google.android.gms.internal.ads.nk5 r1 = r7.f15698p
            com.google.android.gms.internal.ads.eq5 r1 = r1.f12769a
            r9.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zj5 r0 = r7.f15696n
            if (r0 == 0) goto L5b
            r0.c(r9)
        L5b:
            boolean r0 = r9.f5846r
            if (r0 == 0) goto L6e
            android.content.Context r0 = r7.f15676a
            if (r0 != 0) goto L64
            goto L6e
        L64:
            com.google.android.gms.internal.ads.yi5 r8 = com.google.android.gms.internal.ads.yi5.f19608c
            r7.f15701s = r8
            com.google.android.gms.internal.ads.dj5 r0 = r7.f15702t
            r0.a(r8)
            throw r9
        L6e:
            r8.a(r9)
            return
        L72:
            r8.c()
            android.media.AudioTrack r8 = r7.f15700r
            boolean r8 = Z(r8)
            if (r8 == 0) goto L91
            long r5 = r7.D
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L85
            r7.W = r1
        L85:
            boolean r8 = r7.P
            if (r8 == 0) goto L91
            com.google.android.gms.internal.ads.zj5 r8 = r7.f15696n
            if (r8 == 0) goto L91
            if (r0 >= r9) goto L91
            com.google.android.gms.internal.ads.vl5 r8 = (com.google.android.gms.internal.ads.vl5) r8
        L91:
            com.google.android.gms.internal.ads.nk5 r8 = r7.f15698p
            int r8 = r8.f12771c
            if (r8 != 0) goto L9d
            long r3 = r7.C
            long r5 = (long) r0
            long r3 = r3 + r5
            r7.C = r3
        L9d:
            if (r0 != r9) goto Lbb
            if (r8 == 0) goto Lb8
            java.nio.ByteBuffer r8 = r7.L
            java.nio.ByteBuffer r9 = r7.J
            if (r8 != r9) goto La8
            goto La9
        La8:
            r2 = r1
        La9:
            com.google.android.gms.internal.ads.rx3.h(r2)
            long r8 = r7.D
            int r0 = r7.E
            long r0 = (long) r0
            int r2 = r7.K
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.D = r8
        Lb8:
            r8 = 0
            r7.L = r8
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl5.P(long):void");
    }

    private final void Q() {
        if (this.f15698p.f12771c == 1) {
            this.V = true;
        }
    }

    private final void R() {
        if (V()) {
            this.f15700r.setVolume(this.I);
        }
    }

    private final void S(yk ykVar) {
        uk5 uk5Var = new uk5(ykVar, -9223372036854775807L, -9223372036854775807L, null);
        if (V()) {
            this.f15705w = uk5Var;
        } else {
            this.f15706x = uk5Var;
        }
    }

    private final void T(long j7) {
        yk ykVar;
        boolean z7;
        if (U()) {
            ok5 ok5Var = this.f15687f0;
            ykVar = this.f15707y;
            ok5Var.b(ykVar);
        } else {
            ykVar = yk.f19629d;
        }
        yk ykVar2 = ykVar;
        this.f15707y = ykVar2;
        if (U()) {
            ok5 ok5Var2 = this.f15687f0;
            z7 = this.f15708z;
            ok5Var2.c(z7);
        } else {
            z7 = false;
        }
        this.f15708z = z7;
        this.f15690h.add(new uk5(ykVar2, Math.max(0L, j7), hi2.O(A(), this.f15698p.f12773e), null));
        I();
        zj5 zj5Var = this.f15696n;
        if (zj5Var != null) {
            ((vl5) zj5Var).f17669a.x1().h(this.f15708z);
        }
    }

    private final boolean U() {
        nk5 nk5Var = this.f15698p;
        if (nk5Var.f12771c != 0) {
            return false;
        }
        int i7 = nk5Var.f12769a.I;
        return true;
    }

    private final boolean V() {
        return this.f15700r != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final long y() {
        return this.f15698p.f12771c == 0 ? this.A / r0.f12770b : this.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final long A() {
        nk5 nk5Var = this.f15698p;
        if (nk5Var.f12771c != 0) {
            return this.D;
        }
        long j7 = this.C;
        long j8 = nk5Var.f12772d;
        String str = hi2.f9535a;
        return ((j7 + j8) - 1) / j8;
    }

    private final void Y() {
        Context context;
        Looper myLooper = Looper.myLooper();
        boolean z7 = true;
        if (this.f15702t != null && this.X != myLooper) {
            z7 = false;
        }
        rx3.j(z7, "DefaultAudioSink accessed on multiple threads: %s and %s", c0(this.X), c0(myLooper));
        if (this.f15702t == null && (context = this.f15676a) != null) {
            this.X = myLooper;
            dj5 dj5Var = new dj5(context, new cj5() { // from class: com.google.android.gms.internal.ads.pk5
                @Override // com.google.android.gms.internal.ads.cj5
                public final /* synthetic */ void a(yi5 yi5Var) {
                    sl5.this.u(yi5Var);
                }
            }, this.f15704v, this.T);
            this.f15702t = dj5Var;
            this.f15701s = dj5Var.d();
        }
        this.f15701s.getClass();
    }

    private static boolean Z(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private final void a0() {
        if (this.N) {
            return;
        }
        this.N = true;
        this.f15688g.f(A());
        if (Z(this.f15700r)) {
            this.O = false;
        }
        this.f15700r.stop();
    }

    private final boolean b0(long j7) {
        long b8 = this.f15688g.b();
        AudioTrack audioTrack = this.f15700r;
        audioTrack.getClass();
        return j7 > hi2.P(b8, audioTrack.getSampleRate());
    }

    private static String c0(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private static final AudioTrack d0(wj5 wj5Var, mb1 mb1Var, int i7, eq5 eq5Var, Context context) {
        eq5 eq5Var2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(mb1Var.a()).setAudioFormat(hi2.c(wj5Var.f18277b, wj5Var.f18278c, wj5Var.f18276a)).setTransferMode(1).setBufferSizeInBytes(wj5Var.f18280e).setSessionId(i7);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29) {
                try {
                    sessionId.setOffloadedPlayback(wj5Var.f18279d);
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    exc = e;
                    eq5Var2 = eq5Var;
                    throw new yj5(0, wj5Var.f18277b, wj5Var.f18278c, wj5Var.f18276a, wj5Var.f18280e, eq5Var2, wj5Var.f18279d, exc);
                } catch (UnsupportedOperationException e9) {
                    e = e9;
                    exc = e;
                    eq5Var2 = eq5Var;
                    throw new yj5(0, wj5Var.f18277b, wj5Var.f18278c, wj5Var.f18276a, wj5Var.f18280e, eq5Var2, wj5Var.f18279d, exc);
                }
            }
            if (i8 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            int state = build.getState();
            if (state == 1) {
                return build;
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new yj5(state, wj5Var.f18277b, wj5Var.f18278c, wj5Var.f18276a, wj5Var.f18280e, eq5Var, wj5Var.f18279d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            eq5Var2 = eq5Var;
            exc = e10;
        }
    }

    static /* synthetic */ void w(AudioTrack audioTrack, final zj5 zj5Var, Handler handler, final wj5 wj5Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zj5Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.rk5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zj5.this.b(wj5Var);
                    }
                });
            }
            synchronized (f15673h0) {
                try {
                    int i7 = f15675j0 - 1;
                    f15675j0 = i7;
                    if (i7 == 0) {
                        f15674i0.shutdown();
                        f15674i0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (zj5Var != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sk5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zj5.this.b(wj5Var);
                    }
                });
            }
            synchronized (f15673h0) {
                try {
                    int i8 = f15675j0 - 1;
                    f15675j0 = i8;
                    if (i8 == 0) {
                        f15674i0.shutdown();
                        f15674i0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void C() {
        x();
        w04 w04Var = this.f15686f;
        int size = w04Var.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((nq0) w04Var.get(i7)).i();
        }
        this.f15682d.i();
        this.f15684e.i();
        hm0 hm0Var = this.f15699q;
        if (hm0Var != null) {
            hm0Var.h();
        }
        this.P = false;
        this.V = false;
    }

    final /* synthetic */ zj5 D() {
        return this.f15696n;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void E() {
        this.P = false;
        if (V()) {
            this.f15688g.g();
            if (!this.N || Z(this.f15700r)) {
                this.f15700r.pause();
            }
        }
    }

    final /* synthetic */ AudioTrack F() {
        return this.f15700r;
    }

    final /* synthetic */ void G(boolean z7) {
        this.O = true;
    }

    final /* synthetic */ boolean H() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void J() {
        dj5 dj5Var = this.f15702t;
        if (dj5Var != null) {
            dj5Var.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void N(int i7) {
        if (this.R) {
            if (this.Q != i7) {
                return;
            } else {
                this.R = false;
            }
        }
        if (this.Q != i7) {
            this.Q = i7;
            x();
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final int a(eq5 eq5Var) {
        Y();
        if (!"audio/raw".equals(eq5Var.f7775o)) {
            return this.f15701s.d(eq5Var, this.f15704v) != null ? 2 : 0;
        }
        int i7 = eq5Var.I;
        if (hi2.a(i7)) {
            return i7 != 2 ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 22);
        sb.append("Invalid PCM encoding: ");
        sb.append(i7);
        gv1.c("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void b(pd1 pd1Var) {
        this.f15688g.i(pd1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030c  */
    @Override // com.google.android.gms.internal.ads.ck5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.nio.ByteBuffer r30, long r31, int r33) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sl5.c(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final fj5 d(eq5 eq5Var) {
        return this.V ? fj5.f8288d : this.f15689g0.a(eq5Var, this.f15704v);
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void e(AudioDeviceInfo audioDeviceInfo) {
        this.T = audioDeviceInfo;
        dj5 dj5Var = this.f15702t;
        if (dj5Var != null) {
            dj5Var.c(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f15700r;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(this.T);
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void f(mb1 mb1Var) {
        if (this.f15704v.equals(mb1Var)) {
            return;
        }
        this.f15704v = mb1Var;
        dj5 dj5Var = this.f15702t;
        if (dj5Var != null) {
            dj5Var.b(mb1Var);
        }
        x();
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void g(boolean z7) {
        this.f15708z = z7;
        S(this.f15707y);
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void h(int i7, int i8) {
        AudioTrack audioTrack = this.f15700r;
        if (audioTrack != null) {
            Z(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void i() {
        this.F = true;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void j() {
        this.P = true;
        if (V()) {
            this.f15688g.c();
            if (!this.N || Z(this.f15700r)) {
                this.f15700r.play();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void k() {
        if (!this.M && V() && M()) {
            a0();
            this.M = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void l(zj5 zj5Var) {
        this.f15696n = zj5Var;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void m(float f8) {
        if (this.I != f8) {
            this.I = f8;
            R();
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final boolean n() {
        if (V()) {
            return this.M && !o();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final boolean o() {
        boolean isOffloadedPlayback;
        if (!V()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            isOffloadedPlayback = this.f15700r.isOffloadedPlayback();
            if (isOffloadedPlayback && this.O) {
                return false;
            }
        }
        return b0(A());
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void p(o22 o22Var) {
        if (this.S.equals(o22Var)) {
            return;
        }
        if (this.f15700r != null) {
            int i7 = this.S.f13167a;
        }
        this.S = o22Var;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void q(yk ykVar) {
        float f8 = ykVar.f19630a;
        String str = hi2.f9535a;
        this.f15707y = new yk(Math.max(0.1f, Math.min(f8, 8.0f)), Math.max(0.1f, Math.min(ykVar.f19631b, 8.0f)));
        S(ykVar);
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void r(ni5 ni5Var) {
        this.f15695m = ni5Var;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final yk s() {
        return this.f15707y;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void t(eq5 eq5Var, int i7, int[] iArr) {
        hm0 hm0Var;
        int i8;
        int i9;
        int i10;
        int intValue;
        int i11;
        int i12;
        Y();
        if ("audio/raw".equals(eq5Var.f7775o)) {
            int i13 = eq5Var.I;
            rx3.a(hi2.a(i13));
            int i14 = eq5Var.G;
            i10 = hi2.e(i13) * i14;
            t04 t04Var = new t04();
            t04Var.i(this.f15686f);
            t04Var.g(this.f15682d);
            t04Var.h(this.f15687f0.a());
            hm0Var = new hm0(t04Var.j());
            if (hm0Var.equals(this.f15699q)) {
                hm0Var = this.f15699q;
            }
            this.f15680c.o(eq5Var.J, eq5Var.K);
            this.f15678b.o(iArr);
            try {
                jn0 a8 = hm0Var.a(new jn0(eq5Var.H, i14, i13));
                int i15 = a8.f10655c;
                i8 = a8.f10653a;
                int i16 = a8.f10654b;
                int b8 = hi2.b(i16);
                int e8 = hi2.e(i15) * i16;
                i9 = 0;
                intValue = b8;
                i11 = i15;
                i12 = e8;
            } catch (lp0 e9) {
                throw new xj5(e9, eq5Var);
            }
        } else {
            hm0Var = new hm0(w04.m());
            i8 = eq5Var.H;
            fj5 fj5Var = fj5.f8288d;
            Pair d8 = this.f15701s.d(eq5Var, this.f15704v);
            if (d8 == null) {
                throw new xj5("Unable to configure passthrough for: ".concat(String.valueOf(eq5Var)), eq5Var);
            }
            int intValue2 = ((Integer) d8.first).intValue();
            i9 = 2;
            i10 = -1;
            intValue = ((Integer) d8.second).intValue();
            i11 = intValue2;
            i12 = -1;
        }
        int i17 = i8;
        if (i11 == 0) {
            String valueOf = String.valueOf(eq5Var);
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 37 + valueOf.length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i9);
            sb.append(") for: ");
            sb.append(valueOf);
            throw new xj5(sb.toString(), eq5Var);
        }
        if (intValue == 0) {
            String valueOf2 = String.valueOf(eq5Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 43 + valueOf2.length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i9);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new xj5(sb2.toString(), eq5Var);
        }
        int i18 = eq5Var.f7770j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(eq5Var.f7775o) && i18 == -1) {
            i18 = 768000;
        }
        int i19 = i18;
        int minBufferSize = AudioTrack.getMinBufferSize(i17, intValue, i11);
        rx3.h(minBufferSize != -2);
        int i20 = i12 != -1 ? i12 : 1;
        int i21 = i11;
        int b9 = ul5.b(minBufferSize, i21, i9, i20, i17, i19);
        int i22 = i20;
        this.V = false;
        nk5 nk5Var = new nk5(eq5Var, i10, i9, i12, i17, intValue, i21, (((Math.max(minBufferSize, b9) + i22) - 1) / i22) * i22, hm0Var, false, false, false);
        if (V()) {
            this.f15697o = nk5Var;
        } else {
            this.f15698p = nk5Var;
        }
    }

    public final void u(yi5 yi5Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.X;
        rx3.j(looper == myLooper, "Current looper (%s) is not the playback looper (%s)", c0(myLooper), c0(this.X));
        yi5 yi5Var2 = this.f15701s;
        if (yi5Var2 == null || yi5Var.equals(yi5Var2)) {
            return;
        }
        this.f15701s = yi5Var;
        zj5 zj5Var = this.f15696n;
        if (zj5Var != null) {
            ((vl5) zj5Var).f17669a.b0();
        }
    }

    final /* synthetic */ void v() {
        if (this.Z >= 300000) {
            ((vl5) this.f15696n).f17669a.z1(true);
            this.Z = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final long v0(boolean z7) {
        ArrayDeque arrayDeque;
        long j7;
        if (!V() || this.G) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f15688g.b(), hi2.O(A(), this.f15698p.f12773e));
        while (true) {
            arrayDeque = this.f15690h;
            if (arrayDeque.isEmpty() || min < ((uk5) arrayDeque.getFirst()).f16808c) {
                break;
            }
            this.f15706x = (uk5) arrayDeque.remove();
        }
        uk5 uk5Var = this.f15706x;
        long j8 = min - uk5Var.f16808c;
        long S = hi2.S(j8, uk5Var.f16806a.f19630a);
        if (arrayDeque.isEmpty()) {
            long d8 = this.f15687f0.d(j8);
            uk5 uk5Var2 = this.f15706x;
            j7 = uk5Var2.f16807b + d8;
            uk5Var2.f16809d = d8 - S;
        } else {
            uk5 uk5Var3 = this.f15706x;
            j7 = uk5Var3.f16807b + S + uk5Var3.f16809d;
        }
        long e8 = this.f15687f0.e();
        long O = j7 + hi2.O(e8, this.f15698p.f12773e);
        long j9 = this.Y;
        if (e8 > j9) {
            long O2 = hi2.O(e8 - j9, this.f15698p.f12773e);
            this.Y = e8;
            this.Z += O2;
            if (this.f15677a0 == null) {
                this.f15677a0 = new Handler(Looper.myLooper());
            }
            this.f15677a0.removeCallbacksAndMessages(null);
            this.f15677a0.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.tk5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    sl5.this.v();
                }
            }, 100L);
        }
        return O;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final void x() {
        dl5 dl5Var;
        if (V()) {
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.W = false;
            this.E = 0;
            this.f15706x = new uk5(this.f15707y, 0L, 0L, null);
            this.H = 0L;
            this.f15705w = null;
            this.f15690h.clear();
            this.J = null;
            this.K = 0;
            this.L = null;
            this.N = false;
            this.M = false;
            this.O = false;
            this.f15680c.p();
            I();
            gk5 gk5Var = this.f15688g;
            if (gk5Var.d()) {
                this.f15700r.pause();
            }
            if (Z(this.f15700r)) {
                kl5 kl5Var = this.f15691i;
                kl5Var.getClass();
                kl5Var.b(this.f15700r);
            }
            final wj5 a8 = this.f15698p.a();
            nk5 nk5Var = this.f15697o;
            if (nk5Var != null) {
                this.f15698p = nk5Var;
                this.f15697o = null;
            }
            gk5Var.h();
            if (Build.VERSION.SDK_INT >= 24 && (dl5Var = this.f15703u) != null) {
                dl5Var.a();
                this.f15703u = null;
            }
            final AudioTrack audioTrack = this.f15700r;
            final zj5 zj5Var = this.f15696n;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f15673h0) {
                try {
                    if (f15674i0 == null) {
                        f15674i0 = hi2.D("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f15675j0++;
                    f15674i0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.qk5
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            sl5.w(audioTrack, zj5Var, handler, a8);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f15700r = null;
        }
        this.f15693k.c();
        this.f15692j.c();
        this.Y = 0L;
        this.Z = 0L;
        Handler handler2 = this.f15677a0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final boolean y0(eq5 eq5Var) {
        return a(eq5Var) != 0;
    }

    @Override // com.google.android.gms.internal.ads.ck5
    public final long z() {
        if (!V()) {
            return -9223372036854775807L;
        }
        nk5 nk5Var = this.f15698p;
        if (nk5Var.f12771c == 0) {
            return hi2.O(this.f15700r.getBufferSizeInFrames(), nk5Var.f12773e);
        }
        long bufferSizeInFrames = this.f15700r.getBufferSizeInFrames();
        int f8 = q2.f(this.f15698p.f12775g);
        rx3.h(f8 != -2147483647);
        return hi2.Q(bufferSizeInFrames, 1000000L, f8, RoundingMode.DOWN);
    }
}
