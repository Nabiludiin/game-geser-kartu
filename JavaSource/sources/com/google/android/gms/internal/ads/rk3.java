package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class rk3 implements ik3, ek3, zk3 {

    /* renamed from: t, reason: collision with root package name */
    private static final b35 f14965t;

    /* renamed from: a, reason: collision with root package name */
    private final Context f14966a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f14967b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f14968c;

    /* renamed from: d, reason: collision with root package name */
    private final lj3 f14969d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14970e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14971f;

    /* renamed from: g, reason: collision with root package name */
    private final long f14972g;

    /* renamed from: h, reason: collision with root package name */
    private final long f14973h;

    /* renamed from: i, reason: collision with root package name */
    private final double f14974i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14975j;

    /* renamed from: k, reason: collision with root package name */
    private final long f14976k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f14977l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    private final Object f14978m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final Object f14979n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private final Object f14980o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private final cj f14981p = dj.d0();

    /* renamed from: q, reason: collision with root package name */
    private final List f14982q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private boolean f14983r = false;

    /* renamed from: s, reason: collision with root package name */
    private final HashMap f14984s = new HashMap();

    static {
        v25 d02 = b35.d0();
        d02.E(17);
        f14965t = (b35) d02.A();
    }

    public rk3(Context context, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, lj3 lj3Var, Random random, String str, long j7, long j8, double d8, String str2, long j9) {
        this.f14966a = context;
        this.f14967b = scheduledExecutorService;
        this.f14968c = executorService;
        this.f14969d = lj3Var;
        this.f14971f = str;
        this.f14972g = j7;
        this.f14973h = j8;
        this.f14974i = d8;
        this.f14975j = str2;
        this.f14976k = j9;
        this.f14970e = random.nextDouble() < d8;
    }

    @Override // com.google.android.gms.internal.ads.ek3
    public final a5.d a() {
        return p64.e(new Runnable() { // from class: com.google.android.gms.internal.ads.pk3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                rk3.this.f();
            }
        }, this.f14968c);
    }

    @Override // com.google.android.gms.internal.ads.zk3
    public final void b(yk3 yk3Var) {
        synchronized (this.f14978m) {
            this.f14981p.N(yk3Var.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.ik3
    public final void c(int i7, long j7, Throwable th, String str) {
        long longValue;
        if (this.f14970e) {
            synchronized (this.f14979n) {
                try {
                    List list = this.f14982q;
                    synchronized (this.f14980o) {
                        try {
                            HashMap hashMap = this.f14984s;
                            Integer valueOf = Integer.valueOf(i7);
                            Long l7 = (Long) hashMap.get(valueOf);
                            if (l7 == null) {
                                l7 = 0L;
                            }
                            longValue = 1 + l7.longValue();
                            hashMap.put(valueOf, Long.valueOf(longValue));
                        } finally {
                        }
                    }
                    list.add(new ok3(i7, j7, th, str, longValue));
                    if (!this.f14983r) {
                        this.f14983r = true;
                        this.f14967b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.qk3
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                rk3.this.d();
                            }
                        }, this.f14973h, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    final void d() {
        cj cjVar;
        w04 u7;
        String str;
        synchronized (this.f14978m) {
            cjVar = (cj) this.f14981p.clone();
        }
        synchronized (this.f14979n) {
            List list = this.f14982q;
            u7 = w04.u(list);
            list.clear();
            this.f14983r = false;
        }
        int size = u7.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            ok3 ok3Var = (ok3) u7.get(i7);
            if (i8 >= this.f14972g) {
                e((dj) cjVar.A());
                cjVar.F();
                i8 = 0;
            }
            uj d02 = vj.d0();
            d02.E(ok3Var.f13359a);
            d02.F(ok3Var.f13360b);
            d02.I(ok3Var.f13363e);
            String str2 = ok3Var.f13362d;
            if (str2 != null) {
                d02.J(str2);
            }
            Throwable th = ok3Var.f13361c;
            d02.K(th == null ? 2 : 3);
            if (th != null) {
                d02.G(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    str = "";
                }
                d02.H(str);
            }
            cjVar.E((vj) d02.A());
            i7++;
            i8++;
        }
        if (i8 > 0) {
            e((dj) cjVar.A());
            cjVar.F();
        }
    }

    protected final void e(dj djVar) {
        try {
            mk3 d02 = nk3.d0();
            d02.F(f14965t);
            kk3 d03 = lk3.d0();
            d03.E(djVar);
            d02.E((lk3) d03.A());
            this.f14969d.a(this.f14971f, ((nk3) d02.A()).e(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void f() {
        int i7;
        if (!this.f14970e || this.f14977l.getAndSet(true)) {
            return;
        }
        Context context = this.f14966a;
        String str = this.f14975j;
        double d8 = this.f14974i;
        long j7 = this.f14976k;
        Locale locale = Locale.getDefault();
        cj d02 = dj.d0();
        d02.G(Build.VERSION.SDK_INT);
        d02.H(Build.MODEL);
        d02.I(locale.getLanguage());
        d02.J(locale.getCountry());
        d02.M(str);
        d02.K(context.getPackageName());
        d02.P(j7);
        if (d8 > 0.0d) {
            d02.O((int) (1.0d / d8));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            d02.L(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i7 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i7 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i7 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i7 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            d02.Q(i7);
        } catch (RuntimeException unused2) {
        }
        dj djVar = (dj) d02.A();
        synchronized (this.f14978m) {
            this.f14981p.B(djVar);
        }
    }
}
