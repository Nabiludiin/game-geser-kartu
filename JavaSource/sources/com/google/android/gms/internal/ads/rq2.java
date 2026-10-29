package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class rq2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private kh3 f15150a;

    /* renamed from: b, reason: collision with root package name */
    private kh3 f15151b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15152c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15153d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15154e = false;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15155f;

    public rq2(kh3 kh3Var, kh3 kh3Var2, boolean z7, boolean z8, boolean z9) {
        this.f15150a = kh3Var;
        this.f15151b = kh3Var2;
        this.f15152c = z7;
        this.f15153d = z8;
        this.f15155f = z9;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.B3)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r6.f15151b.c() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        r1.putString("paidv2_id_android", r6.f15151b.a());
        r1.putLong("paidv2_creation_time_android", r6.f15151b.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r6.f15152c);
        r1.putBoolean("paidv2_user_option_android", r6.f15153d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.D3)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.C3)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.A3)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6.f15150a.c() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r1.putString("paidv1_id_android", r6.f15150a.a());
        r1.putLong("paidv1_creation_time_android", r6.f15150a.b());
     */
    @Override // com.google.android.gms.internal.ads.wr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.x81 r7 = (com.google.android.gms.internal.ads.x81) r7
            android.os.Bundle r7 = r7.f18664a
            boolean r0 = r6.f15154e
            if (r0 == 0) goto La
            goto Lb5
        La:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.m13.a(r7, r0)
            boolean r2 = r6.f15155f
            if (r2 != 0) goto L26
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.A3
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r3 = r4.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L3a
        L26:
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.C3
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r3 = r4.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L58
        L3a:
            com.google.android.gms.internal.ads.kh3 r3 = r6.f15150a
            boolean r3 = r3.c()
            if (r3 == 0) goto L58
            com.google.android.gms.internal.ads.kh3 r3 = r6.f15150a
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "paidv1_id_android"
            r1.putString(r4, r3)
            com.google.android.gms.internal.ads.kh3 r3 = r6.f15150a
            long r3 = r3.b()
            java.lang.String r5 = "paidv1_creation_time_android"
            r1.putLong(r5, r3)
        L58:
            if (r2 != 0) goto L6c
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.B3
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r3 = r4.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L80
        L6c:
            if (r2 == 0) goto Lac
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.D3
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()
            java.lang.Object r2 = r3.d(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lac
        L80:
            com.google.android.gms.internal.ads.kh3 r2 = r6.f15151b
            boolean r2 = r2.c()
            if (r2 == 0) goto L9e
            com.google.android.gms.internal.ads.kh3 r2 = r6.f15151b
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.kh3 r2 = r6.f15151b
            long r2 = r2.b()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        L9e:
            boolean r2 = r6.f15152c
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r6.f15153d
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lac:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb5
            r7.putBundle(r0, r1)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rq2.d(java.lang.Object):void");
    }

    public rq2(boolean z7) {
        this.f15155f = z7;
    }
}
