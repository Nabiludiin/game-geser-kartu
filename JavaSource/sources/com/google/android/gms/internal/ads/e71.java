package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class e71 implements jd1, cj1 {

    /* renamed from: q, reason: collision with root package name */
    private yg0 f7448q;

    /* renamed from: s, reason: collision with root package name */
    private final Context f7450s;

    /* renamed from: t, reason: collision with root package name */
    private final e63 f7451t;

    /* renamed from: u, reason: collision with root package name */
    private final w2.a f7452u;

    /* renamed from: v, reason: collision with root package name */
    private final Executor f7453v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7454w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7455x = false;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f7449r = new AtomicBoolean();

    e71(Context context, e63 e63Var, w2.a aVar, Executor executor) {
        this.f7450s = context;
        this.f7451t = e63Var;
        this.f7452u = aVar;
        this.f7453v = executor;
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void a(b3.m0 m0Var) {
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, "service") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f7449r
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La5
        Lb:
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.w00.f17945l
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.w00.f17946m
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.g00 r0 = com.google.android.gms.internal.ads.w00.f17944k
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.ql0 r0 = r2.t.l()
            v2.p1 r0 = r0.q()
            com.google.android.gms.internal.ads.ll0 r0 = r0.j()
            java.lang.String r0 = r0.d()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La5
        L6f:
            android.content.Context r0 = r5.f7450s
            com.google.android.gms.internal.ads.e63 r2 = r5.f7451t
            com.google.android.gms.internal.ads.ga0 r3 = r2.t.v()
            w2.a r4 = w2.a.M0()
            com.google.android.gms.internal.ads.pa0 r0 = r3.a(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r5.f7450s
            com.google.android.gms.internal.ads.e63 r2 = r5.f7451t
            com.google.android.gms.internal.ads.ga0 r3 = r2.t.v()
            w2.a r4 = w2.a.M0()
            com.google.android.gms.internal.ads.pa0 r0 = r3.b(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.ja0 r3 = com.google.android.gms.internal.ads.ma0.f12152b
            com.google.android.gms.internal.ads.fa0 r0 = r0.a(r2, r3, r3)
            android.content.Context r2 = r5.f7450s
            w2.a r3 = r5.f7452u
            com.google.android.gms.internal.ads.ah0 r4 = new com.google.android.gms.internal.ads.ah0
            r4.<init>(r2, r0, r3)
            r5.f7448q = r4
            r5.f7454w = r1
        La5:
            boolean r0 = r5.f7454w
            if (r0 != 0) goto Laa
            goto Ld3
        Laa:
            com.google.android.gms.internal.ads.yg0 r0 = r5.f7448q
            if (r0 == 0) goto Ld3
            a5.d r0 = r0.a()
            boolean r1 = r5.f7455x
            if (r1 != 0) goto Lce
            com.google.android.gms.internal.ads.g00 r1 = com.google.android.gms.internal.ads.o00.f13129i
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lce
            com.google.android.gms.internal.ads.d71 r1 = new com.google.android.gms.internal.ads.d71
            r1.<init>()
            java.util.concurrent.Executor r2 = r5.f7453v
            r0.c(r1, r2)
        Lce:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.fm0.a(r0, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e71.b():void");
    }

    final /* synthetic */ void c() {
        fy.e(this.f7450s);
        this.f7455x = true;
    }

    @Override // com.google.android.gms.internal.ads.cj1
    public final void y(String str) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
    }
}
