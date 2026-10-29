package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o2.a;

/* compiled from: MyApplication */
public final class zs2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20325a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f20326b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f20327c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20328d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20329e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f20330f;

    /* renamed from: g, reason: collision with root package name */
    private final il0 f20331g;

    zs2(il0 il0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, boolean z7, boolean z8) {
        this.f20331g = il0Var;
        this.f20325a = context;
        this.f20326b = scheduledExecutorService;
        this.f20327c = executor;
        this.f20328d = i7;
        this.f20329e = z7;
        this.f20330f = z8;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        h64 C = h64.C(this.f20331g.a(this.f20325a, this.f20328d));
        hx3 hx3Var = new hx3() { // from class: com.google.android.gms.internal.ads.ys2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return zs2.this.c((a.C0117a) obj);
            }
        };
        Executor executor = this.f20327c;
        return (h64) p64.g((h64) p64.i((h64) p64.k(C, hx3Var, executor), ((Long) s2.b0.c().d(uy.f17159n1)).longValue(), TimeUnit.MILLISECONDS, this.f20326b), Throwable.class, new hx3() { // from class: com.google.android.gms.internal.ads.xs2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return zs2.this.d((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.G3)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.F3)).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.bt2 c(o2.a.C0117a r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.kh3 r0 = new com.google.android.gms.internal.ads.kh3
            r0.<init>()
            boolean r1 = r7.f20329e
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.F3
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L1c:
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.G3
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2f
            goto L6b
        L2f:
            android.content.Context r0 = r7.f20325a     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.oh3 r1 = com.google.android.gms.internal.ads.oh3.i(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r2 = r8.a()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.L3     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Object r0 = r4.d(r0)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            boolean r6 = r7.f20330f     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            com.google.android.gms.internal.ads.kh3 r0 = r1.k(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5a java.io.IOException -> L5c
            goto L6b
        L5a:
            r0 = move-exception
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.ql0 r2 = r2.t.l()
            r2.i(r0, r1)
            com.google.android.gms.internal.ads.kh3 r0 = new com.google.android.gms.internal.ads.kh3
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.bt2 r1 = new com.google.android.gms.internal.ads.bt2
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zs2.c(o2.a$a):com.google.android.gms.internal.ads.bt2");
    }

    final /* synthetic */ bt2 d(Throwable th) {
        s2.z.a();
        ContentResolver contentResolver = this.f20325a.getContentResolver();
        return new bt2(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new kh3());
    }
}
