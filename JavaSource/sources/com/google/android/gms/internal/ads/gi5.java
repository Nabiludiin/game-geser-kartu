package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class gi5 implements qd5, hi5 {
    private PlaybackMetrics.Builder A;
    private int B;
    private xj E;
    private eg5 F;
    private eg5 G;
    private eg5 H;
    private eq5 I;
    private eq5 J;
    private eq5 K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;

    /* renamed from: q, reason: collision with root package name */
    private final Context f8940q;

    /* renamed from: s, reason: collision with root package name */
    private final ji5 f8942s;

    /* renamed from: t, reason: collision with root package name */
    private final PlaybackSession f8943t;

    /* renamed from: z, reason: collision with root package name */
    private String f8949z;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f8941r = f71.a();

    /* renamed from: v, reason: collision with root package name */
    private final yx f8945v = new yx();

    /* renamed from: w, reason: collision with root package name */
    private final ot f8946w = new ot();

    /* renamed from: y, reason: collision with root package name */
    private final HashMap f8948y = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    private final HashMap f8947x = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private final long f8944u = SystemClock.elapsedRealtime();
    private int C = 0;
    private int D = 0;

    private gi5(Context context, PlaybackSession playbackSession) {
        this.f8940q = context.getApplicationContext();
        this.f8943t = playbackSession;
        yf5 yf5Var = new yf5(yf5.f19554h);
        this.f8942s = yf5Var;
        yf5Var.c(this);
    }

    private final boolean A(eg5 eg5Var) {
        if (eg5Var != null) {
            return eg5Var.f7623c.equals(this.f8942s.e());
        }
        return false;
    }

    private final void B(long j7, eq5 eq5Var, int i7) {
        if (Objects.equals(this.I, eq5Var)) {
            return;
        }
        int i8 = this.I == null ? 1 : 0;
        this.I = eq5Var;
        l(1, j7, eq5Var, i8);
    }

    private final void C(long j7, eq5 eq5Var, int i7) {
        if (Objects.equals(this.J, eq5Var)) {
            return;
        }
        int i8 = this.J == null ? 1 : 0;
        this.J = eq5Var;
        l(0, j7, eq5Var, i8);
    }

    private final void D(long j7, eq5 eq5Var, int i7) {
        if (Objects.equals(this.K, eq5Var)) {
            return;
        }
        int i8 = this.K == null ? 1 : 0;
        this.K = eq5Var;
        l(2, j7, eq5Var, i8);
    }

    private final void l(int i7, long j7, eq5 eq5Var, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = bi5.a(i7).setTimeSinceCreatedMillis(j7 - this.f8944u);
        if (eq5Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i8 != 1 ? 1 : 2);
            String str = eq5Var.f7774n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = eq5Var.f7775o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = eq5Var.f7771k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = eq5Var.f7770j;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = eq5Var.f7782v;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = eq5Var.f7783w;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = eq5Var.G;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = eq5Var.H;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = eq5Var.f7764d;
            if (str4 != null) {
                String str5 = hi2.f9535a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f8 = eq5Var.f7786z;
            if (f8 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f8);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.Q = true;
        build = timeSinceCreatedMillis.build();
        this.f8941r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bg5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                gi5.this.y(build);
            }
        });
    }

    private final void p(az azVar, xp5 xp5Var) {
        int e8;
        PlaybackMetrics.Builder builder = this.A;
        if (xp5Var == null || (e8 = azVar.e(xp5Var.f18924a)) == -1) {
            return;
        }
        ot otVar = this.f8946w;
        int i7 = 0;
        azVar.d(e8, otVar, false);
        yx yxVar = this.f8945v;
        azVar.b(otVar.f13477c, yxVar, 0L);
        m5 m5Var = yxVar.f19898c.f10399b;
        if (m5Var != null) {
            int g8 = hi2.g(m5Var.f12071a);
            i7 = g8 != 0 ? g8 != 1 ? g8 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        long j7 = yxVar.f19907l;
        if (j7 != -9223372036854775807L && !yxVar.f19905j && !yxVar.f19903h && !yxVar.b()) {
            builder.setMediaDurationMillis(hi2.M(j7));
        }
        builder.setPlaybackType(true != yxVar.b() ? 1 : 2);
        this.Q = true;
    }

    private final void r() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.A;
        if (builder != null && this.Q) {
            builder.setAudioUnderrunCount(this.P);
            this.A.setVideoFramesDropped(this.N);
            this.A.setVideoFramesPlayed(this.O);
            Long l7 = (Long) this.f8947x.get(this.f8949z);
            this.A.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.f8948y.get(this.f8949z);
            this.A.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.A.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            build = this.A.build();
            this.f8941r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cg5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    gi5.this.z(build);
                }
            });
        }
        this.A = null;
        this.f8949z = null;
        this.P = 0;
        this.N = 0;
        this.O = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.Q = false;
    }

    private static int s(int i7) {
        switch (hi2.f(i7)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static gi5 t(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager a8 = fg5.a(context.getSystemService("media_metrics"));
        if (a8 == null) {
            return null;
        }
        createPlaybackSession = a8.createPlaybackSession();
        return new gi5(context, createPlaybackSession);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void a(nd5 nd5Var, int i7) {
        pd5.f(this, nd5Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void b(nd5 nd5Var, eq5 eq5Var, iw4 iw4Var) {
        pd5.h(this, nd5Var, eq5Var, iw4Var);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void c(nd5 nd5Var, te0 te0Var) {
        eg5 eg5Var = this.F;
        if (eg5Var != null) {
            eq5 eq5Var = eg5Var.f7621a;
            if (eq5Var.f7783w == -1) {
                xn5 a8 = eq5Var.a();
                a8.s0(te0Var.f16149a);
                a8.t0(te0Var.f16150b);
                this.F = new eg5(a8.m(), 0, eg5Var.f7623c);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hi5
    public final void d(nd5 nd5Var, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        xp5 xp5Var = nd5Var.f12712d;
        if (xp5Var == null || !xp5Var.b()) {
            r();
            this.f8949z = str;
            playerName = ci5.a().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.8.0");
            this.A = playerVersion;
            p(nd5Var.f12710b, xp5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void e(nd5 nd5Var, eq5 eq5Var, iw4 iw4Var) {
        pd5.g(this, nd5Var, eq5Var, iw4Var);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void f(nd5 nd5Var, xj xjVar) {
        this.E = xjVar;
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void g(nd5 nd5Var, hv4 hv4Var) {
        this.N += hv4Var.f9717g;
        this.O += hv4Var.f9715e;
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void h(nd5 nd5Var, tp5 tp5Var) {
        xp5 xp5Var = nd5Var.f12712d;
        if (xp5Var == null) {
            return;
        }
        eq5 eq5Var = tp5Var.f16298b;
        eq5Var.getClass();
        eg5 eg5Var = new eg5(eq5Var, 0, this.f8942s.d(nd5Var.f12710b, xp5Var));
        int i7 = tp5Var.f16297a;
        if (i7 != 0) {
            if (i7 == 1) {
                this.G = eg5Var;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.H = eg5Var;
                return;
            }
        }
        this.F = eg5Var;
    }

    @Override // com.google.android.gms.internal.ads.hi5
    public final void i(nd5 nd5Var, String str, boolean z7) {
        xp5 xp5Var = nd5Var.f12712d;
        if ((xp5Var == null || !xp5Var.b()) && str.equals(this.f8949z)) {
            r();
        }
        this.f8947x.remove(str);
        this.f8948y.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void j(nd5 nd5Var, int i7, long j7) {
        pd5.i(this, nd5Var, i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void k(nd5 nd5Var, lq lqVar, lq lqVar2, int i7) {
        if (i7 == 1) {
            this.L = true;
            i7 = 1;
        }
        this.B = i7;
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void m(nd5 nd5Var, int i7, long j7, long j8) {
        xp5 xp5Var = nd5Var.f12712d;
        if (xp5Var != null) {
            String d8 = this.f8942s.d(nd5Var.f12710b, xp5Var);
            HashMap hashMap = this.f8948y;
            Long l7 = (Long) hashMap.get(d8);
            HashMap hashMap2 = this.f8947x;
            Long l8 = (Long) hashMap2.get(d8);
            hashMap.put(d8, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j7));
            hashMap2.put(d8, Long.valueOf((l8 != null ? l8.longValue() : 0L) + i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public /* synthetic */ void n(nd5 nd5Var, Object obj, long j7) {
        pd5.j(this, nd5Var, obj, j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x01df, code lost:
    
        if (r12 != 1) goto L132;
     */
    @Override // com.google.android.gms.internal.ads.qd5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.google.android.gms.internal.ads.mr r20, com.google.android.gms.internal.ads.od5 r21) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gi5.o(com.google.android.gms.internal.ads.mr, com.google.android.gms.internal.ads.od5):void");
    }

    public final LogSessionId u() {
        LogSessionId sessionId;
        sessionId = this.f8943t.getSessionId();
        return sessionId;
    }

    final /* synthetic */ void v(PlaybackErrorEvent playbackErrorEvent) {
        this.f8943t.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void w(NetworkEvent networkEvent) {
        this.f8943t.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void x(PlaybackStateEvent playbackStateEvent) {
        this.f8943t.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void y(TrackChangeEvent trackChangeEvent) {
        this.f8943t.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void z(PlaybackMetrics playbackMetrics) {
        this.f8943t.reportPlaybackMetrics(playbackMetrics);
    }

    @Override // com.google.android.gms.internal.ads.qd5
    public final void q(nd5 nd5Var, op5 op5Var, tp5 tp5Var, IOException iOException, boolean z7) {
    }
}
