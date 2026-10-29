package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.List;

/* compiled from: MyApplication */
public final class ad implements m2 {

    /* renamed from: e, reason: collision with root package name */
    private boolean f4879e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4880f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4881g;

    /* renamed from: h, reason: collision with root package name */
    private long f4882h;

    /* renamed from: i, reason: collision with root package name */
    private xc f4883i;

    /* renamed from: j, reason: collision with root package name */
    private p2 f4884j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4885k;

    /* renamed from: a, reason: collision with root package name */
    private final ef2 f4875a = new ef2(0);

    /* renamed from: c, reason: collision with root package name */
    private final y82 f4877c = new y82(4096);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f4876b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final yc f4878d = new yc();

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[LOOP:0: B:13:0x002c->B:15:0x0034, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.ef2 r5 = r4.f4875a
            long r0 = r5.c()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.a()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.d(r7)
        L24:
            com.google.android.gms.internal.ads.xc r5 = r4.f4883i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.b(r7)
        L2c:
            android.util.SparseArray r5 = r4.f4876b
            int r7 = r5.size()
            if (r6 >= r7) goto L40
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zc r5 = (com.google.android.gms.internal.ads.zc) r5
            r5.a()
            int r6 = r6 + 1
            goto L2c
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad.i(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        byte[] bArr = new byte[14];
        b2 b2Var = (b2) n2Var;
        b2Var.x(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        b2Var.c(bArr[13] & 7, false);
        b2Var.x(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f4884j = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r14, com.google.android.gms.internal.ads.n3 r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ad.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }
}
