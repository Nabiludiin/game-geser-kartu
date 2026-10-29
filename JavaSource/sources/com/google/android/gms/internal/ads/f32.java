package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class f32 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8015a;

    private f32(w85 w85Var) {
        this.f8015a = w85Var;
    }

    public static f32 a(w85 w85Var) {
        return new f32(w85Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.b95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.w85 r0 = r4.f8015a
            com.google.android.gms.internal.ads.n91 r0 = (com.google.android.gms.internal.ads.n91) r0
            com.google.android.gms.internal.ads.w03 r0 = r0.a()
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.O7
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4d
            s2.b5 r1 = r0.f17958d
            java.lang.String r1 = r1.N
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L36
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L36
            r2.<init>(r1)     // Catch: org.json.JSONException -> L36
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L36
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L36
            if (r2 != 0) goto L36
            goto L5d
        L36:
            s2.b5 r0 = r0.f17958d
            s2.y0 r0 = r0.I
            if (r0 == 0) goto L4d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4d
            java.lang.String r0 = r0.f26265q     // Catch: org.json.JSONException -> L4d
            r1.<init>(r0)     // Catch: org.json.JSONException -> L4d
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L4d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L4d
            if (r0 == 0) goto L5d
        L4d:
            java.util.Random r0 = s2.z.e()
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L5d:
            com.google.android.gms.internal.ads.v85.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f32.b():java.lang.Object");
    }
}
