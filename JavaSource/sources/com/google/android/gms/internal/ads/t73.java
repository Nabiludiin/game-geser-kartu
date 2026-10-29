package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* compiled from: MyApplication */
public final class t73 {

    /* renamed from: a, reason: collision with root package name */
    private final yd2 f16012a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16013b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16014c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16015d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f16016e;

    /* renamed from: f, reason: collision with root package name */
    private final p03 f16017f;

    /* renamed from: g, reason: collision with root package name */
    private final q03 f16018g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f16019h;

    /* renamed from: i, reason: collision with root package name */
    private final fn f16020i;

    public t73(yd2 yd2Var, w2.a aVar, String str, String str2, Context context, p03 p03Var, q03 q03Var, com.google.android.gms.common.util.e eVar, fn fnVar) {
        this.f16012a = yd2Var;
        this.f16013b = aVar.f27051q;
        this.f16014c = str;
        this.f16015d = str2;
        this.f16016e = context;
        this.f16017f = p03Var;
        this.f16018g = q03Var;
        this.f16019h = eVar;
        this.f16020i = fnVar;
    }

    public static String d(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(String str) {
        return TextUtils.isEmpty(str) ? "" : w2.m.j() ? "fakeForAdDebugLog" : str;
    }

    public final List a(o03 o03Var, c03 c03Var, List list) {
        return b(o03Var, c03Var, false, "", "", list, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0105, code lost:
    
        if (r2 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.gms.internal.ads.o03 r11, com.google.android.gms.internal.ads.c03 r12, boolean r13, java.lang.String r14, java.lang.String r15, java.util.List r16, com.google.android.gms.internal.ads.p81 r17) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t73.b(com.google.android.gms.internal.ads.o03, com.google.android.gms.internal.ads.c03, boolean, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.ads.p81):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[LOOP:0: B:10:0x005a->B:12:0x0060, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(com.google.android.gms.internal.ads.c03 r11, java.util.List r12, com.google.android.gms.internal.ads.qh0 r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.e r1 = r10.f16019h
            long r1 = r1.a()
            java.lang.String r3 = r13.b()     // Catch: android.os.RemoteException -> Lab
            int r13 = r13.d()     // Catch: android.os.RemoteException -> Lab
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lab
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.f17068c4
            com.google.android.gms.internal.ads.sy r5 = s2.b0.c()
            java.lang.Object r4 = r5.d(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.q03 r4 = r10.f16018g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.px3 r4 = com.google.android.gms.internal.ads.px3.c()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.p03 r4 = r4.f14206a
        L34:
            com.google.android.gms.internal.ads.px3 r4 = com.google.android.gms.internal.ads.px3.d(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.p03 r4 = r10.f16017f
            goto L34
        L3c:
            com.google.android.gms.internal.ads.s73 r5 = com.google.android.gms.internal.ads.s73.f15484a
            com.google.android.gms.internal.ads.px3 r5 = r4.b(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.a(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.r73 r7 = com.google.android.gms.internal.ads.r73.f14769a
            com.google.android.gms.internal.ads.px3 r4 = r4.b(r7)
            java.lang.Object r4 = r4.a(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5a:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = d(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = d(r6, r7, r13)
            java.lang.String r7 = r10.f16013b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = d(r6, r8, r7)
            android.content.Context r7 = r10.f16016e
            boolean r8 = r11.W
            java.util.Map r9 = r11.f6195w0
            java.lang.String r6 = com.google.android.gms.internal.ads.lk0.a(r6, r7, r8, r9)
            r0.add(r6)
            goto L5a
        Laa:
            return r0
        Lab:
            r11 = move-exception
            int r12 = v2.n1.f26802b
            java.lang.String r12 = "Unable to determine award type and amount."
            w2.p.d(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t73.c(com.google.android.gms.internal.ads.c03, java.util.List, com.google.android.gms.internal.ads.qh0):java.util.List");
    }
}
