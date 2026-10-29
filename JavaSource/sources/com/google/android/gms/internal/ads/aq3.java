package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class aq3 implements he3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5212a;

    /* renamed from: b, reason: collision with root package name */
    private final ft3 f5213b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5214c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5215d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5216e;

    aq3(Context context, li3 li3Var, ft3 ft3Var) {
        this.f5212a = context;
        this.f5214c = li3Var.i0();
        this.f5215d = li3Var.p0();
        this.f5216e = li3Var.q0();
        this.f5213b = ft3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = "v"
            java.lang.String r1 = r5.f5214c
            r6.put(r0, r1)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.String r1 = "t"
            r6.put(r1, r0)
            java.lang.String r0 = "E"
            java.lang.String r1 = "gs"
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Throwable -> L45
            a5.d r1 = (a5.d) r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L45
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r3 = 31
            if (r2 < r3) goto L29
            boolean r2 = r1.isDone()     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L45
        L29:
            long r2 = r5.f5215d     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r1.get(r2, r4)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.xk r1 = (com.google.android.gms.internal.ads.xk) r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L45
            java.lang.String r2 = r1.Z0()     // Catch: java.lang.Throwable -> L45
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L45
            r3 = 1
            if (r2 <= r3) goto L45
            java.lang.String r1 = r1.Z0()     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r1 = r0
        L46:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L67
            java.lang.String r0 = "ai"
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L67
            a5.d r0 = (a5.d) r0     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L67
            long r2 = r5.f5216e     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = r0.get(r2, r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L67
            boolean r2 = com.google.android.gms.internal.ads.iy3.c(r0)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            r1 = r0
        L67:
            java.lang.String r0 = "int"
            r6.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aq3.a(java.util.Map):void");
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map b() {
        Map b8 = this.f5213b.b();
        a(b8);
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map d() {
        Map c8 = this.f5213b.c(this.f5212a, null);
        a(c8);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.he3
    public final Map h() {
        Map d8 = this.f5213b.d();
        a(d8);
        return d8;
    }
}
