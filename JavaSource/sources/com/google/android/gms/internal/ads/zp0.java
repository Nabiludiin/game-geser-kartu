package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: MyApplication */
public final class zp0 extends qp0 implements rn0 {

    /* renamed from: t, reason: collision with root package name */
    private sn0 f20264t;

    /* renamed from: u, reason: collision with root package name */
    private String f20265u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f20266v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20267w;

    /* renamed from: x, reason: collision with root package name */
    private hp0 f20268x;

    /* renamed from: y, reason: collision with root package name */
    private long f20269y;

    /* renamed from: z, reason: collision with root package name */
    private long f20270z;

    public zp0(bo0 bo0Var, ao0 ao0Var) {
        super(bo0Var);
        uq0 uq0Var = new uq0(bo0Var.getContext(), ao0Var, (bo0) this.f14549s.get(), null);
        int i7 = v2.n1.f26802b;
        w2.p.e("ExoPlayerAdapter initialized.");
        this.f20264t = uq0Var;
        uq0Var.O(this);
    }

    private final void A(long j7) {
        v2.f2.f26746l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.xp0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zp0.this.y();
            }
        }, j7);
    }

    private static String B(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    protected static final String z(String str) {
        return "cache:".concat(String.valueOf(w2.g.o(str)));
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void Q() {
        int i7 = v2.n1.f26802b;
        w2.p.f("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.qp0, l3.h
    public final void a() {
        sn0 sn0Var = this.f20264t;
        if (sn0Var != null) {
            sn0Var.O(null);
            this.f20264t.P();
        }
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void b(String str, Exception exc) {
        int i7 = v2.n1.f26802b;
        w2.p.g("Precache exception", exc);
        r2.t.l().j(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void e(String str, Exception exc) {
        int i7 = v2.n1.f26802b;
        w2.p.g("Precache error", exc);
        r2.t.l().j(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void f(final boolean z7, final long j7) {
        final bo0 bo0Var = (bo0) this.f14549s.get();
        if (bo0Var != null) {
            cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yp0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    bo0.this.b1(z7, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final boolean g(String str) {
        return h(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final boolean h(String str, String[] strArr) {
        com.google.android.gms.common.util.e eVar;
        String str2;
        String str3;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z7;
        this.f20265u = str;
        String z8 = z(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.f20264t.M(uriArr, this.f14548r);
            bo0 bo0Var = (bo0) this.f14549s.get();
            if (bo0Var != null) {
                bo0Var.z0(z8, this);
            }
            com.google.android.gms.common.util.e o7 = r2.t.o();
            long a8 = o7.a();
            long longValue = ((Long) s2.b0.c().d(uy.T)).longValue();
            long longValue2 = ((Long) s2.b0.c().d(uy.S)).longValue() * 1000;
            long intValue = ((Integer) s2.b0.c().d(uy.f17221v)).intValue();
            boolean booleanValue = ((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue();
            long j14 = -1;
            while (true) {
                synchronized (this) {
                    if (o7.a() - a8 > longValue2) {
                        long j15 = longValue2;
                        StringBuilder sb = new StringBuilder(String.valueOf(j15).length() + 27);
                        sb.append(str5);
                        sb.append(j15);
                        sb.append(str4);
                        throw new IOException(sb.toString());
                    }
                    if (this.f20266v) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f20267w) {
                        if (!this.f20264t.s()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long y7 = this.f20264t.y();
                        if (y7 > 0) {
                            eVar = o7;
                            long E = this.f20264t.E();
                            if (E != j14) {
                                if (E > 0) {
                                    j13 = longValue2;
                                    z7 = true;
                                } else {
                                    j13 = longValue2;
                                    z7 = false;
                                }
                                long j16 = longValue;
                                j11 = y7;
                                str3 = str5;
                                j10 = j16;
                                str2 = str4;
                                j12 = E;
                                j8 = intValue;
                                j7 = j13;
                                r(str, z8, j12, j11, z7, booleanValue ? this.f20264t.z() : -1L, booleanValue ? this.f20264t.A() : -1L, booleanValue ? this.f20264t.B() : -1L, sn0.G(), sn0.H());
                                j14 = j12;
                            } else {
                                str3 = str5;
                                j10 = longValue;
                                j8 = intValue;
                                j11 = y7;
                                str2 = str4;
                                j7 = longValue2;
                                j12 = E;
                            }
                            if (j12 >= j11) {
                                u(str, z8, j11);
                            } else if (this.f20264t.F() < j8 || j12 <= 0) {
                                j9 = j10;
                            }
                        } else {
                            eVar = o7;
                            str2 = str4;
                            str3 = str5;
                            j7 = longValue2;
                            j8 = intValue;
                            j9 = longValue;
                        }
                        try {
                            wait(j9);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                }
                longValue = j9;
                str4 = str2;
                longValue2 = j7;
                intValue = j8;
                str5 = str3;
                o7 = eVar;
            }
            return true;
        } catch (Exception e8) {
            String message = e8.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb2.append("Failed to preload url ");
            sb2.append(str);
            sb2.append(" Exception: ");
            sb2.append(message);
            String sb3 = sb2.toString();
            int i8 = v2.n1.f26802b;
            w2.p.f(sb3);
            r2.t.l().j(e8, "VideoStreamExoPlayerCache.preload");
            a();
            v(str, z8, "error", B("error", e8));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final boolean j(String str, String[] strArr, hp0 hp0Var) {
        this.f20265u = str;
        this.f20268x = hp0Var;
        String z7 = z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.f20264t.M(uriArr, this.f14548r);
            bo0 bo0Var = (bo0) this.f14549s.get();
            if (bo0Var != null) {
                bo0Var.z0(z7, this);
            }
            this.f20269y = r2.t.o().a();
            this.f20270z = -1L;
            A(0L);
            return true;
        } catch (Exception e8) {
            String message = e8.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i8 = v2.n1.f26802b;
            w2.p.f(sb2);
            r2.t.l().j(e8, "VideoStreamExoPlayerCache.preload");
            a();
            v(str, z7, "error", B("error", e8));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void k(int i7) {
        this.f20264t.x(i7);
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void m(int i7) {
        this.f20264t.w(i7);
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void n(int i7) {
        this.f20264t.U(i7);
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void o(int i7) {
        this.f20264t.V(i7);
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void q() {
        synchronized (this) {
            this.f20266v = true;
            notify();
            a();
        }
        String str = this.f20265u;
        if (str != null) {
            v(this.f20265u, z(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final sn0 x() {
        synchronized (this) {
            this.f20267w = true;
            notify();
        }
        this.f20264t.O(null);
        sn0 sn0Var = this.f20264t;
        this.f20264t = null;
        return sn0Var;
    }

    final /* synthetic */ void y() {
        long longValue;
        long intValue;
        boolean booleanValue;
        long j7;
        long j8;
        long j9;
        String z7 = z(this.f20265u);
        try {
            longValue = ((Long) s2.b0.c().d(uy.S)).longValue() * 1000;
            intValue = ((Integer) s2.b0.c().d(uy.f17221v)).intValue();
            booleanValue = ((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue();
        } catch (Exception e8) {
            String str = this.f20265u;
            String message = e8.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            String sb2 = sb.toString();
            int i7 = v2.n1.f26802b;
            w2.p.f(sb2);
            r2.t.l().j(e8, "VideoStreamExoPlayerCache.preload");
            a();
            v(this.f20265u, z7, "error", B("error", e8));
        }
        synchronized (this) {
            if (r2.t.o().a() - this.f20269y > longValue) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(longValue).length() + 27);
                sb3.append("Timeout reached. Limit: ");
                sb3.append(longValue);
                sb3.append(" ms");
                throw new IOException(sb3.toString());
            }
            if (this.f20266v) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!this.f20267w) {
                if (!this.f20264t.s()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long y7 = this.f20264t.y();
                if (y7 > 0) {
                    long E = this.f20264t.E();
                    if (E != this.f20270z) {
                        boolean z8 = E > 0;
                        j8 = y7;
                        j9 = E;
                        j7 = intValue;
                        r(this.f20265u, z7, j9, j8, z8, booleanValue ? this.f20264t.z() : -1L, booleanValue ? this.f20264t.A() : -1L, booleanValue ? this.f20264t.B() : -1L, sn0.G(), sn0.H());
                        this.f20270z = j9;
                    } else {
                        j7 = intValue;
                        j8 = y7;
                        j9 = E;
                    }
                    if (j9 >= j8) {
                        u(this.f20265u, z7, j8);
                    } else if (this.f20264t.F() >= j7 && j9 > 0) {
                    }
                }
                A(((Long) s2.b0.c().d(uy.T)).longValue());
                return;
            }
            r2.t.b().h(this.f20268x);
        }
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void N(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void c(int i7, int i8) {
    }
}
