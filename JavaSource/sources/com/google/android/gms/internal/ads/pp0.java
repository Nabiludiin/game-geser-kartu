package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class pp0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f13996q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f13997r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f13998s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f13999t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ qp0 f14000u;

    pp0(qp0 qp0Var, String str, String str2, String str3, String str4) {
        this.f13996q = str;
        this.f13997r = str2;
        this.f13998s = str3;
        this.f13999t = str4;
        Objects.requireNonNull(qp0Var);
        this.f14000u = qp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r1.equals("expireFailed") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r1.equals("externalAbort") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r3 = "policy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r1.equals("sizeExceeded") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r1.equals("downloadTimeout") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        r3 = "network";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r1.equals("badUrl") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r1.equals("noCacheDir") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        r3 = "io";
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "precacheCanceled"
            r0.put(r1, r2)
            java.lang.String r1 = "src"
            java.lang.String r2 = r4.f13996q
            r0.put(r1, r2)
            java.lang.String r1 = r4.f13997r
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L20
            java.lang.String r2 = "cachedSrc"
            r0.put(r2, r1)
        L20:
            java.lang.String r1 = r4.f13998s
            int r2 = r1.hashCode()
            java.lang.String r3 = "internal"
            switch(r2) {
                case -1947652542: goto L7a;
                case -1396664534: goto L6f;
                case -1347010958: goto L6c;
                case -918817863: goto L63;
                case -659376217: goto L60;
                case -642208130: goto L5d;
                case -354048396: goto L52;
                case -32082395: goto L49;
                case 3387234: goto L46;
                case 96784904: goto L40;
                case 580119100: goto L35;
                case 725497484: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L7d
        L2c:
            java.lang.String r2 = "noCacheDir"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto L3d
        L35:
            java.lang.String r2 = "expireFailed"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
        L3d:
            java.lang.String r3 = "io"
            goto L7d
        L40:
            java.lang.String r2 = "error"
        L42:
            r1.equals(r2)
            goto L7d
        L46:
            java.lang.String r2 = "noop"
            goto L42
        L49:
            java.lang.String r2 = "externalAbort"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto L5a
        L52:
            java.lang.String r2 = "sizeExceeded"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
        L5a:
            java.lang.String r3 = "policy"
            goto L7d
        L5d:
            java.lang.String r2 = "playerFailed"
            goto L42
        L60:
            java.lang.String r2 = "contentLengthMissing"
            goto L42
        L63:
            java.lang.String r2 = "downloadTimeout"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto L77
        L6c:
            java.lang.String r2 = "inProgress"
            goto L42
        L6f:
            java.lang.String r2 = "badUrl"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
        L77:
            java.lang.String r3 = "network"
            goto L7d
        L7a:
            java.lang.String r2 = "interrupted"
            goto L42
        L7d:
            java.lang.String r2 = "type"
            r0.put(r2, r3)
            java.lang.String r2 = "reason"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f13999t
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L94
            java.lang.String r2 = "message"
            r0.put(r2, r1)
        L94:
            com.google.android.gms.internal.ads.qp0 r1 = r4.f14000u
            java.lang.String r2 = "onPrecacheEvent"
            r1.w(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pp0.run():void");
    }
}
