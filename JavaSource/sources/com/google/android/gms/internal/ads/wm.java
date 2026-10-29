package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: MyApplication */
public final class wm implements zm {
    private static wm H;
    private final uo A;
    private final lo B;
    private final ao C;
    private volatile boolean F;
    private volatile boolean G;

    /* renamed from: q, reason: collision with root package name */
    private final Context f18303q;

    /* renamed from: r, reason: collision with root package name */
    private final xd3 f18304r;

    /* renamed from: s, reason: collision with root package name */
    private final ee3 f18305s;

    /* renamed from: t, reason: collision with root package name */
    private final ge3 f18306t;

    /* renamed from: u, reason: collision with root package name */
    private final co f18307u;

    /* renamed from: v, reason: collision with root package name */
    private final lc3 f18308v;

    /* renamed from: w, reason: collision with root package name */
    private final Executor f18309w;

    /* renamed from: x, reason: collision with root package name */
    private final mq f18310x;

    /* renamed from: y, reason: collision with root package name */
    private final de3 f18311y;
    volatile long D = 0;
    private final Object E = new Object();

    /* renamed from: z, reason: collision with root package name */
    private final CountDownLatch f18312z = new CountDownLatch(1);

    wm(Context context, lc3 lc3Var, xd3 xd3Var, ee3 ee3Var, ge3 ge3Var, co coVar, Executor executor, gc3 gc3Var, mq mqVar, uo uoVar, lo loVar, ao aoVar) {
        this.G = false;
        this.f18303q = context;
        this.f18308v = lc3Var;
        this.f18304r = xd3Var;
        this.f18305s = ee3Var;
        this.f18306t = ge3Var;
        this.f18307u = coVar;
        this.f18309w = executor;
        this.f18310x = mqVar;
        this.A = uoVar;
        this.B = loVar;
        this.C = aoVar;
        this.G = false;
        this.f18311y = new um(this, gc3Var);
    }

    public static synchronized wm a(Context context, bj bjVar, boolean z7) {
        wm s7;
        synchronized (wm.class) {
            mc3 h8 = nc3.h();
            h8.a(bjVar.d0());
            h8.b(bjVar.e0());
            s7 = s(context, Executors.newCachedThreadPool(), h8.h(), z7);
        }
        return s7;
    }

    private static synchronized wm s(Context context, Executor executor, nc3 nc3Var, boolean z7) {
        wm wmVar;
        synchronized (wm.class) {
            try {
                if (H == null) {
                    lc3 a8 = lc3.a(context, executor, z7);
                    ln a9 = ((Boolean) s2.b0.c().d(uy.S3)).booleanValue() ? ln.a(context) : null;
                    uo a10 = ((Boolean) s2.b0.c().d(uy.T3)).booleanValue() ? uo.a(context, executor) : null;
                    lo loVar = ((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue() ? new lo() : null;
                    ao aoVar = ((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue() ? new ao() : null;
                    cd3 a11 = cd3.a(context, executor, a8, nc3Var);
                    bo boVar = new bo(context);
                    co coVar = new co(nc3Var, a11, new ro(context, boVar), boVar, a9, a10, loVar, aoVar);
                    mq b8 = jd3.b(context, a8);
                    gc3 gc3Var = new gc3();
                    wm wmVar2 = new wm(context, a8, new xd3(context, b8), new ee3(context, b8, new tm(a8), ((Boolean) s2.b0.c().d(uy.L2)).booleanValue()), new ge3(context, coVar, a8, gc3Var, false), coVar, executor, gc3Var, b8, a10, loVar, aoVar);
                    H = wmVar2;
                    wmVar2.c();
                    H.d();
                }
                wmVar = H;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wmVar;
    }

    private final void t() {
        uo uoVar = this.A;
        if (uoVar != null) {
            uoVar.b();
        }
    }

    private final wd3 u(int i7) {
        if (jd3.a(this.f18310x)) {
            return ((Boolean) s2.b0.c().d(uy.J2)).booleanValue() ? this.f18305s.c(1) : this.f18304r.b(1);
        }
        return null;
    }

    public final synchronized boolean b() {
        return this.G;
    }

    final synchronized void c() {
        long currentTimeMillis = System.currentTimeMillis();
        wd3 u7 = u(1);
        if (u7 == null) {
            this.f18308v.b(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f18306t.a(u7)) {
            this.G = true;
            this.f18312z.countDown();
        }
    }

    public final void d() {
        if (this.F) {
            return;
        }
        synchronized (this.E) {
            try {
                if (!this.F) {
                    if ((System.currentTimeMillis() / 1000) - this.D < 3600) {
                        return;
                    }
                    wd3 c8 = this.f18306t.c();
                    if ((c8 == null || c8.e(3600L)) && jd3.a(this.f18310x)) {
                        this.f18309w.execute(new vm(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void e(int i7, int i8, int i9) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) s2.b0.c().d(uy.Yc)).booleanValue() || (displayMetrics = this.f18303q.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f8 = i7;
        float f9 = displayMetrics.density;
        float f10 = i8;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f8 * f9, f10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(obtain);
        obtain.recycle();
        float f11 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f8 * f11, f10 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(obtain2);
        obtain2.recycle();
        float f12 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i9, 1, f8 * f12, f10 * f12, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void f(MotionEvent motionEvent) {
        oc3 b8 = this.f18306t.b();
        if (b8 != null) {
            try {
                b8.c(null, motionEvent);
            } catch (fe3 e8) {
                this.f18308v.c(e8.a(), -1L, e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String g(Context context, String str, View view, Activity activity) {
        t();
        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
            this.B.c();
        }
        d();
        oc3 b8 = this.f18306t.b();
        if (b8 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String b9 = b8.b(context, null, str, view, activity);
        this.f18308v.d(5000, System.currentTimeMillis() - currentTimeMillis, b9, null);
        return b9;
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String h(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void i(StackTraceElement[] stackTraceElementArr) {
        ao aoVar = this.C;
        if (aoVar != null) {
            aoVar.a(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String j(Context context) {
        t();
        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
            this.B.a();
        }
        d();
        oc3 b8 = this.f18306t.b();
        if (b8 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a8 = b8.a(context, null);
        this.f18308v.d(5001, System.currentTimeMillis() - currentTimeMillis, a8, null);
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void k(View view) {
        this.f18307u.a(view);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String l(Context context, String str, View view) {
        return g(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String m(Context context, View view, Activity activity) {
        t();
        if (((Boolean) s2.b0.c().d(uy.f17058b3)).booleanValue()) {
            this.B.b(context, view);
        }
        d();
        oc3 b8 = this.f18306t.b();
        if (b8 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String d8 = b8.d(context, null, view, activity);
        this.f18308v.d(5002, System.currentTimeMillis() - currentTimeMillis, d8, null);
        return d8;
    }

    final /* synthetic */ void n() {
        String str;
        String str2;
        int length;
        boolean a8;
        long currentTimeMillis = System.currentTimeMillis();
        wd3 u7 = u(1);
        if (u7 != null) {
            String d02 = u7.a().d0();
            str2 = u7.a().e0();
            str = d02;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.f18303q;
                mq mqVar = this.f18310x;
                lc3 lc3Var = this.f18308v;
                be3 a9 = vc3.a(context, 1, mqVar, str, str2, "1", lc3Var);
                byte[] bArr = a9.f5735r;
                if (bArr == null || (length = bArr.length) == 0) {
                    lc3Var.b(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        oq g02 = oq.g0(qy4.s(bArr, 0, length), ez4.a());
                        if (!g02.d0().d0().isEmpty()) {
                            if (!g02.d0().e0().isEmpty()) {
                                if (g02.f0().w().length != 0) {
                                    wd3 u8 = u(1);
                                    if (u8 != null) {
                                        uq a10 = u8.a();
                                        if (a10 != null) {
                                            if (g02.d0().d0().equals(a10.d0())) {
                                                if (!g02.d0().e0().equals(a10.e0())) {
                                                }
                                            }
                                        }
                                    }
                                    de3 de3Var = this.f18311y;
                                    int i7 = a9.f5736s;
                                    if (!((Boolean) s2.b0.c().d(uy.J2)).booleanValue()) {
                                        a8 = this.f18304r.a(g02, de3Var);
                                    } else if (i7 == 3) {
                                        a8 = this.f18305s.b(g02);
                                    } else {
                                        if (i7 == 4) {
                                            a8 = this.f18305s.a(g02, de3Var);
                                        }
                                        this.f18308v.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (a8) {
                                        wd3 u9 = u(1);
                                        if (u9 != null) {
                                            if (this.f18306t.a(u9)) {
                                                this.G = true;
                                            }
                                            this.D = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.f18308v.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.f18308v.b(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f18308v.b(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (e05 e8) {
                this.f18308v.c(4002, System.currentTimeMillis() - currentTimeMillis, e8);
            }
            this.f18312z.countDown();
        } catch (Throwable th) {
            this.f18312z.countDown();
            throw th;
        }
    }

    final /* synthetic */ lc3 o() {
        return this.f18308v;
    }

    final /* synthetic */ Object p() {
        return this.E;
    }

    final /* synthetic */ boolean q() {
        return this.F;
    }

    final /* synthetic */ void r(boolean z7) {
        this.F = z7;
    }
}
