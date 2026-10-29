package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
public final class us2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final v2.p1 f16959a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16960b;

    /* renamed from: c, reason: collision with root package name */
    private final z64 f16961c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f16962d;

    /* renamed from: e, reason: collision with root package name */
    private final ia2 f16963e;

    /* renamed from: f, reason: collision with root package name */
    private final w03 f16964f;

    /* renamed from: g, reason: collision with root package name */
    private final w2.a f16965g;

    us2(v2.p1 p1Var, Context context, z64 z64Var, ScheduledExecutorService scheduledExecutorService, ia2 ia2Var, w03 w03Var, w2.a aVar) {
        this.f16959a = p1Var;
        this.f16960b = context;
        this.f16961c = z64Var;
        this.f16962d = scheduledExecutorService;
        this.f16963e = ia2Var;
        this.f16964f = w03Var;
        this.f16965g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.f16960b.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.f16964f.f17958d.O != k2.t.b.DISABLED.c()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.yr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a5.d a() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.vb
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r0 = r1.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lfb
            v2.p1 r0 = r5.f16959a
            boolean r0 = r0.x()
            if (r0 == 0) goto Lfb
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.zb
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r0 = r1.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            com.google.android.gms.internal.ads.w03 r0 = r5.f16964f
            k2.t$b r1 = k2.t.b.DISABLED
            int r1 = r1.c()
            s2.b5 r0 = r0.f17958d
            int r0 = r0.O
            if (r0 == r1) goto Lfb
        L3a:
            w2.a r0 = r5.f16965g
            int r0 = r0.f27053s
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.tb
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            int r0 = android.os.Build.VERSION.SDK_INT
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.ub
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 < r1) goto Lfb
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.rb
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r0 = r1.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            goto La0
        L77:
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.sb
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r0 = r1.d(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L8a
            goto Lfb
        L8a:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.content.Context r1 = r5.f16960b
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lfb
        La0:
            com.google.android.gms.internal.ads.ia2 r0 = r5.f16963e     // Catch: java.lang.Exception -> Lc1
            r1 = 0
            a5.d r0 = r0.a(r1)     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.xb     // Catch: java.lang.Exception -> Lc1
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r1 = r2.d(r1)     // Catch: java.lang.Exception -> Lc1
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lc1
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lc1
            long r1 = (long) r1     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> Lc1
            java.util.concurrent.ScheduledExecutorService r4 = r5.f16962d     // Catch: java.lang.Exception -> Lc1
            a5.d r0 = com.google.android.gms.internal.ads.p64.i(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            r0 = move-exception
            a5.d r0 = com.google.android.gms.internal.ads.p64.c(r0)
        Lc6:
            com.google.android.gms.internal.ads.z64 r1 = r5.f16961c
            com.google.android.gms.internal.ads.h64 r0 = com.google.android.gms.internal.ads.h64.C(r0)
            com.google.android.gms.internal.ads.ts2 r2 = com.google.android.gms.internal.ads.ts2.f16350a
            a5.d r0 = com.google.android.gms.internal.ads.p64.j(r0, r2, r1)
            com.google.android.gms.internal.ads.h64 r0 = (com.google.android.gms.internal.ads.h64) r0
            com.google.android.gms.internal.ads.rs2 r2 = new com.google.android.gms.internal.ads.rs2
            r2.<init>()
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            a5.d r0 = com.google.android.gms.internal.ads.p64.h(r0, r3, r2, r1)
            com.google.android.gms.internal.ads.h64 r0 = (com.google.android.gms.internal.ads.h64) r0
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.xb
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.f16962d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            a5.d r0 = com.google.android.gms.internal.ads.p64.i(r0, r1, r4, r3)
            return r0
        Lfb:
            com.google.android.gms.internal.ads.vs2 r0 = new com.google.android.gms.internal.ads.vs2
            r1 = -1
            r2 = 0
            java.lang.String r3 = ""
            r0.<init>(r3, r1, r2)
            a5.d r0 = com.google.android.gms.internal.ads.p64.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.us2.a():a5.d");
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 56;
    }

    final /* synthetic */ a5.d c(final Throwable th) {
        this.f16961c.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.ss2
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) s2.b0.c().d(uy.wb)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    r2.t.l().k(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    r2.t.l().j(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return p64.a(th instanceof SecurityException ? new vs2("", 2, null) : th instanceof IllegalStateException ? new vs2("", 3, null) : th instanceof IllegalArgumentException ? new vs2("", 4, null) : th instanceof TimeoutException ? new vs2("", 5, null) : new vs2("", 0, null));
    }
}
