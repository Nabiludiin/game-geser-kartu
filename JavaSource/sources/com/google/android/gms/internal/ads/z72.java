package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class z72 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f20039a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a82 f20040b;

    z72(a82 a82Var, boolean z7) {
        this.f20039a = z7;
        Objects.requireNonNull(a82Var);
        this.f20040b = a82Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        int i7 = v2.n1.f26802b;
        w2.p.c("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // com.google.android.gms.internal.ads.m64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.a82 r0 = r8.f20040b
            com.google.android.gms.internal.ads.x81 r9 = (com.google.android.gms.internal.ads.x81) r9
            boolean r1 = r0.a()
            if (r1 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r9 = r9.f18664a
            java.lang.String r1 = "ad_types"
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L1a
            java.util.List r1 = (java.util.List) r1
            goto L24
        L1a:
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L4a
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L31
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L31
        L45:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L4c
        L4a:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L4c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L55:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L8a;
                case -1052618729: goto L7f;
                case -239580146: goto L74;
                case 604727084: goto L69;
                default: goto L68;
            }
        L68:
            goto L95
        L69:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.yw r2 = com.google.android.gms.internal.ads.yw.INTERSTITIAL
            goto L97
        L74:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.yw r2 = com.google.android.gms.internal.ads.yw.REWARD_BASED_VIDEO_AD
            goto L97
        L7f:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.yw r2 = com.google.android.gms.internal.ads.yw.NATIVE_APP_INSTALL
            goto L97
        L8a:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L95
            com.google.android.gms.internal.ads.yw r2 = com.google.android.gms.internal.ads.yw.BANNER
            goto L97
        L95:
            com.google.android.gms.internal.ads.yw r2 = com.google.android.gms.internal.ads.yw.AD_FORMAT_TYPE_UNSPECIFIED
        L97:
            r5.add(r2)
            goto L55
        L9b:
            com.google.android.gms.internal.ads.dv r7 = com.google.android.gms.internal.ads.a82.f(r9)
            com.google.android.gms.internal.ads.xu r6 = r0.c(r9)
            boolean r4 = r8.f20039a
            com.google.android.gms.internal.ads.y72 r2 = new com.google.android.gms.internal.ads.y72
            r3 = r8
            r2.<init>()
            com.google.android.gms.internal.ads.n72 r9 = r0.f5626b
            r9.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z72.b(java.lang.Object):void");
    }
}
