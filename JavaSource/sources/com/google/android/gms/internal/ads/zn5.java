package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class zn5 extends Exception {

    /* renamed from: q, reason: collision with root package name */
    public final String f20250q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20251r;

    /* renamed from: s, reason: collision with root package name */
    public final qn5 f20252s;

    /* renamed from: t, reason: collision with root package name */
    public final String f20253t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zn5(com.google.android.gms.internal.ads.eq5 r12, java.lang.Throwable r13, boolean r14, int r15) {
        /*
            r11 = this;
            java.lang.String r14 = r12.toString()
            java.lang.String r0 = java.lang.String.valueOf(r15)
            int r0 = r0.length()
            int r1 = r14.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 25
            int r0 = r0 + r1
            r2.<init>(r0)
            java.lang.String r0 = "Decoder init failed: ["
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = "], "
            r2.append(r0)
            r2.append(r14)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r12.f7775o
            int r12 = java.lang.Math.abs(r15)
            java.lang.String r14 = java.lang.String.valueOf(r12)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 60
            r15.<init>(r14)
            java.lang.String r14 = "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"
            r15.append(r14)
            r15.append(r12)
            java.lang.String r9 = r15.toString()
            r10 = 0
            r7 = 0
            r8 = 0
            r3 = r11
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zn5.<init>(com.google.android.gms.internal.ads.eq5, java.lang.Throwable, boolean, int):void");
    }

    final /* synthetic */ zn5 a(zn5 zn5Var) {
        return new zn5(getMessage(), getCause(), this.f20250q, false, this.f20252s, this.f20253t, zn5Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zn5(com.google.android.gms.internal.ads.eq5 r9, java.lang.Throwable r10, boolean r11, com.google.android.gms.internal.ads.qn5 r12) {
        /*
            r8 = this;
            java.lang.String r0 = r12.f14520a
            int r1 = r0.length()
            java.lang.String r3 = r9.toString()
            int r4 = r3.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r1 = r1 + 23
            int r1 = r1 + r4
            r6.<init>(r1)
            java.lang.String r1 = "Decoder init failed: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = r9.f7775o
            boolean r0 = r10 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L39
            r0 = r10
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
        L37:
            r6 = r0
            goto L3b
        L39:
            r0 = 0
            goto L37
        L3b:
            r4 = 0
            r7 = 0
            r0 = r8
            r2 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zn5.<init>(com.google.android.gms.internal.ads.eq5, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.qn5):void");
    }

    private zn5(String str, Throwable th, String str2, boolean z7, qn5 qn5Var, String str3, zn5 zn5Var) {
        super(str, th);
        this.f20250q = str2;
        this.f20251r = false;
        this.f20252s = qn5Var;
        this.f20253t = str3;
    }
}
