package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class a05 implements kb5 {

    /* renamed from: p, reason: collision with root package name */
    public static final w04 f4651p = w04.r("file", "content", "data", "android.resource", "rawresource", "asset");

    /* renamed from: a, reason: collision with root package name */
    private final yx f4652a;

    /* renamed from: b, reason: collision with root package name */
    private final ot f4653b;

    /* renamed from: c, reason: collision with root package name */
    private final ru5 f4654c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4655d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4656e;

    /* renamed from: f, reason: collision with root package name */
    private final long f4657f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4658g;

    /* renamed from: h, reason: collision with root package name */
    private final long f4659h;

    /* renamed from: i, reason: collision with root package name */
    private final long f4660i;

    /* renamed from: j, reason: collision with root package name */
    private final long f4661j;

    /* renamed from: k, reason: collision with root package name */
    private final long f4662k;

    /* renamed from: l, reason: collision with root package name */
    private final long f4663l;

    /* renamed from: m, reason: collision with root package name */
    private final z04 f4664m;

    /* renamed from: n, reason: collision with root package name */
    private final ConcurrentHashMap f4665n;

    /* renamed from: o, reason: collision with root package name */
    private long f4666o;

    public a05() {
        ru5 ru5Var = new ru5(true, 65536);
        z04 a8 = z04.a();
        q(1000, 0, "bufferForPlaybackMs", "0");
        q(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        q(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        q(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        q(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        q(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        q(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        q(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        q(50000, 50000, "maxBufferMs", "minBufferMs");
        q(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        q(0, 0, "backBufferDurationMs", "0");
        this.f4652a = new yx();
        this.f4653b = new ot();
        this.f4654c = ru5Var;
        this.f4655d = hi2.N(50000L);
        this.f4656e = hi2.N(1000L);
        this.f4657f = hi2.N(50000L);
        this.f4658g = hi2.N(50000L);
        this.f4659h = hi2.N(1000L);
        this.f4660i = hi2.N(1000L);
        this.f4661j = hi2.N(2000L);
        this.f4662k = hi2.N(1000L);
        this.f4663l = hi2.N(0L);
        this.f4665n = new ConcurrentHashMap();
        this.f4664m = z04.c(a8);
        this.f4666o = -1L;
    }

    private final int m(ni5 ni5Var) {
        Integer num = (Integer) this.f4664m.get(ni5Var.f12748a);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void n(ni5 ni5Var) {
        ConcurrentHashMap concurrentHashMap = this.f4665n;
        gz4 gz4Var = (gz4) concurrentHashMap.get(ni5Var);
        if (gz4Var != null) {
            int i7 = gz4Var.f9263a - 1;
            gz4Var.f9263a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(ni5Var);
                o();
            }
        }
    }

    private final void o() {
        ConcurrentHashMap concurrentHashMap = this.f4665n;
        if (concurrentHashMap.isEmpty()) {
            this.f4654c.d();
            return;
        }
        ru5 ru5Var = this.f4654c;
        Iterator it = concurrentHashMap.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((gz4) it.next()).f9265c;
        }
        ru5Var.e(i7);
    }

    private final boolean p(ib5 ib5Var) {
        az azVar = ib5Var.f9955b;
        m5 m5Var = azVar.b(azVar.o(ib5Var.f9956c.f18924a, this.f4653b).f13477c, this.f4652a, 0L).f19898c.f10399b;
        if (m5Var == null) {
            return false;
        }
        String scheme = m5Var.f12071a.getScheme();
        return TextUtils.isEmpty(scheme) || f4651p.contains(scheme);
    }

    private static void q(int i7, int i8, String str, String str2) {
        if (i7 < i8) {
            throw new IllegalArgumentException(iy3.d("%s cannot be less than %s", str, str2));
        }
    }

    private final int r(ni5 ni5Var) {
        gz4 gz4Var = (gz4) this.f4665n.get(ni5Var);
        gz4Var.getClass();
        return gz4Var.c() * 65536;
    }

    private final int s(ni5 ni5Var) {
        gz4 gz4Var = (gz4) this.f4665n.get(ni5Var);
        gz4Var.getClass();
        return gz4Var.f9265c;
    }

    private static final boolean t(boolean z7) {
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void a(ni5 ni5Var) {
        long id = Thread.currentThread().getId();
        long j7 = this.f4666o;
        rx3.i(j7 == -1 || j7 == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f4666o = id;
        ConcurrentHashMap concurrentHashMap = this.f4665n;
        gz4 gz4Var = (gz4) concurrentHashMap.get(ni5Var);
        if (gz4Var == null) {
            concurrentHashMap.put(ni5Var, new gz4());
        } else {
            gz4Var.f9263a++;
        }
        gz4 gz4Var2 = (gz4) concurrentHashMap.get(ni5Var);
        gz4Var2.getClass();
        int m7 = m(ni5Var);
        if (m7 == -1) {
            m7 = 13107200;
        }
        gz4Var2.f9265c = m7;
        gz4Var2.f9264b = false;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final long b(ni5 ni5Var) {
        return this.f4663l;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean c(ib5 ib5Var) {
        ConcurrentHashMap concurrentHashMap = this.f4665n;
        ni5 ni5Var = ib5Var.f9954a;
        gz4 gz4Var = (gz4) concurrentHashMap.get(ni5Var);
        gz4Var.getClass();
        int r7 = r(ni5Var);
        int s7 = s(ni5Var);
        if (ni5Var.equals(ni5.f12747d)) {
            return r7 < s7;
        }
        boolean p7 = p(ib5Var);
        long j7 = p7 ? this.f4656e : this.f4655d;
        long j8 = p7 ? this.f4658g : this.f4657f;
        float f8 = ib5Var.f9959f;
        if (f8 > 1.0f) {
            j7 = Math.min(hi2.S(j7, f8), j8);
        }
        long j9 = ib5Var.f9958e;
        if (j9 < Math.max(j7, 500000L)) {
            boolean z7 = t(p7) || r7 < s7;
            gz4Var.f9264b = z7;
            if (!z7 && j9 < 500000) {
                gv1.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= j8 || r7 >= s7) {
            gz4Var.f9264b = false;
        }
        return gz4Var.f9264b;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final ku5 d(ni5 ni5Var) {
        return new hy4(this, ni5Var);
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void e(ib5 ib5Var, as5 as5Var, zt5[] zt5VarArr) {
        ConcurrentHashMap concurrentHashMap = this.f4665n;
        ni5 ni5Var = ib5Var.f9954a;
        int m7 = m(ni5Var);
        gz4 gz4Var = (gz4) concurrentHashMap.get(ni5Var);
        gz4Var.getClass();
        if (m7 == -1) {
            boolean p7 = p(ib5Var);
            int length = zt5VarArr.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = 13107200;
                if (i7 < length) {
                    zt5 zt5Var = zt5VarArr[i7];
                    if (zt5Var != null) {
                        switch (zt5Var.a().f5436c) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i9 = 144310272;
                                break;
                            case 2:
                                if (!p7) {
                                    i9 = 131072000;
                                    break;
                                } else {
                                    i9 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i9 = 131072;
                                break;
                            case 4:
                                i9 = 26214400;
                                break;
                        }
                        i8 += i9;
                    }
                    i7++;
                } else {
                    m7 = Math.max(13107200, i8);
                }
            }
        }
        gz4Var.f9265c = m7;
        o();
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean f(ni5 ni5Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean g(ib5 ib5Var) {
        long j7;
        boolean z7;
        boolean z8 = ib5Var.f9960g;
        long j8 = ib5Var.f9958e;
        float f8 = ib5Var.f9959f;
        boolean p7 = p(ib5Var);
        long T = hi2.T(j8, f8);
        if (z8) {
            if (p7) {
                j7 = this.f4662k;
                z7 = true;
            } else {
                j7 = this.f4661j;
                z7 = false;
            }
        } else if (p7) {
            j7 = this.f4660i;
            z7 = true;
        } else {
            j7 = this.f4659h;
            z7 = false;
        }
        long j9 = ib5Var.f9961h;
        if (j9 != -9223372036854775807L) {
            j7 = Math.min(j9 / 2, j7);
        }
        if (j7 <= 0 || T >= j7) {
            return true;
        }
        if (!t(z7)) {
            ni5 ni5Var = ib5Var.f9954a;
            if (r(ni5Var) >= s(ni5Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final boolean h(ni5 ni5Var, az azVar, xp5 xp5Var, long j7) {
        Iterator it = this.f4665n.values().iterator();
        while (it.hasNext()) {
            if (((gz4) it.next()).f9264b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void i(ni5 ni5Var) {
        n(ni5Var);
        if (this.f4665n.isEmpty()) {
            this.f4666o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb5
    public final void j(ni5 ni5Var) {
        n(ni5Var);
    }

    final /* synthetic */ ru5 k() {
        return this.f4654c;
    }

    final /* synthetic */ ConcurrentHashMap l() {
        return this.f4665n;
    }
}
