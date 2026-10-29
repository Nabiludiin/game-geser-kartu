package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public final class ol2 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final String f13374a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13376c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13377d;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r8 != 78) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.length != 8) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        com.google.android.gms.internal.ads.rx3.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r8 = 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5.equals("auxiliary.tracks.length") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5.equals("auxiliary.tracks.offset") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ol2(java.lang.String r5, byte[] r6, int r7, int r8) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1949883051: goto L5e;
                case -269399509: goto L41;
                case 1011693540: goto L28;
                case 1098277265: goto L1f;
                case 2002123038: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L75
        Le:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            if (r8 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            com.google.android.gms.internal.ads.rx3.a(r1)
            goto L75
        L1f:
            java.lang.String r0 = "auxiliary.tracks.offset"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            goto L30
        L28:
            java.lang.String r0 = "auxiliary.tracks.length"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
        L30:
            r0 = 78
            if (r8 != r0) goto L3c
            int r8 = r6.length
            r3 = 8
            if (r8 != r3) goto L3b
            r8 = r0
            goto L3d
        L3b:
            r8 = r0
        L3c:
            r1 = r2
        L3d:
            com.google.android.gms.internal.ads.rx3.a(r1)
            goto L75
        L41:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            r0 = 75
            if (r8 != r0) goto L59
            int r8 = r6.length
            if (r8 != r1) goto L58
            r8 = r6[r2]
            if (r8 == 0) goto L56
            if (r8 != r1) goto L58
        L56:
            r8 = r0
            goto L5a
        L58:
            r8 = r0
        L59:
            r1 = r2
        L5a:
            com.google.android.gms.internal.ads.rx3.a(r1)
            goto L75
        L5e:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
            r0 = 23
            if (r8 != r0) goto L71
            int r8 = r6.length
            r3 = 4
            if (r8 != r3) goto L70
            r8 = r0
            goto L72
        L70:
            r8 = r0
        L71:
            r1 = r2
        L72:
            com.google.android.gms.internal.ads.rx3.a(r1)
        L75:
            r4.f13374a = r5
            r4.f13375b = r6
            r4.f13376c = r7
            r4.f13377d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol2.<init>(java.lang.String, byte[], int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final List b() {
        rx3.i(this.f13374a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.f13375b;
        byte b8 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < b8; i7++) {
            arrayList.add(Integer.valueOf(bArr[i7 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ol2.class == obj.getClass()) {
            ol2 ol2Var = (ol2) obj;
            if (this.f13374a.equals(ol2Var.f13374a) && Arrays.equals(this.f13375b, ol2Var.f13375b) && this.f13376c == ol2Var.f13376c && this.f13377d == ol2Var.f13377d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13374a.hashCode() + 527) * 31) + Arrays.hashCode(this.f13375b)) * 31) + this.f13376c) * 31) + this.f13377d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[LOOP:0: B:18:0x0086->B:20:0x0089, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.f13377d
            r1 = 0
            if (r0 == 0) goto L59
            r2 = 1
            if (r0 == r2) goto L52
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L38
            r2 = 75
            if (r0 == r2) goto L2a
            r2 = 78
            if (r0 == r2) goto L19
            goto L7b
        L19:
            byte[] r0 = r5.f13375b
            com.google.android.gms.internal.ads.y82 r1 = new com.google.android.gms.internal.ads.y82
            r1.<init>(r0)
            long r0 = r1.j()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Laa
        L2a:
            byte[] r0 = r5.f13375b
            r0 = r0[r1]
            int r0 = com.google.android.gms.internal.ads.x82.a(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Laa
        L38:
            byte[] r0 = r5.f13375b
            int r0 = com.google.android.gms.internal.ads.m44.d(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Laa
        L43:
            byte[] r0 = r5.f13375b
            int r0 = com.google.android.gms.internal.ads.m44.d(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Laa
        L52:
            byte[] r0 = r5.f13375b
            java.lang.String r0 = com.google.android.gms.internal.ads.hi2.F(r0)
            goto Laa
        L59:
            java.lang.String r0 = r5.f13374a
            java.lang.String r2 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L7b
            java.util.List r0 = r5.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "track types = "
            r1.append(r2)
            java.lang.String r2 = ","
            com.google.android.gms.internal.ads.kx3.b(r1, r0, r2)
            java.lang.String r0 = r1.toString()
            goto Laa
        L7b:
            byte[] r0 = r5.f13375b
            java.lang.String r2 = com.google.android.gms.internal.ads.hi2.f9535a
            int r2 = r0.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r2
            r3.<init>(r2)
        L86:
            int r2 = r0.length
            if (r1 >= r2) goto La6
            r2 = r0[r1]
            int r2 = r2 >> 4
            r2 = r2 & 15
            r4 = 16
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            r2 = r0[r1]
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            r3.append(r2)
            int r1 = r1 + 1
            goto L86
        La6:
            java.lang.String r0 = r3.toString()
        Laa:
            java.lang.String r1 = r5.f13374a
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r2 = r2 + 18
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "mdta: key="
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = ", value="
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol2.toString():java.lang.String");
    }
}
