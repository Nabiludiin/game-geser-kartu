package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: MyApplication */
abstract class wn5 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = com.google.android.gms.internal.ads.rn5.a(r2)
            r0 = 0
            if (r2 == 0) goto L50
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            goto L50
        Le:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = com.google.android.gms.internal.ads.sn5.a(r3, r4, r5)
            int r2 = c(r2, r3)
            r3 = 1
            if (r2 != r3) goto L4f
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.yn5.b()
            if (r4 != 0) goto L4f
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 35
            if (r4 < r5) goto L28
        L26:
            r3 = r0
            goto L3d
        L28:
            int r4 = b(r0)
            int r5 = b(r3)
            if (r4 != 0) goto L33
            goto L3d
        L33:
            r6 = 2
            if (r5 != 0) goto L39
            if (r4 == r6) goto L26
            goto L3d
        L39:
            if (r4 != r6) goto L3d
            if (r5 == r6) goto L26
        L3d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.yn5.c(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.yn5.b()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4f
            return r0
        L4f:
            return r2
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wn5.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(boolean r4) {
        /*
            r0 = 0
            com.google.android.gms.internal.ads.xn5 r1 = new com.google.android.gms.internal.ads.xn5     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            r1.<init>()     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            java.lang.String r2 = "video/avc"
            r1.l0(r2)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            com.google.android.gms.internal.ads.eq5 r1 = r1.m()     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            java.lang.String r2 = r1.f7775o     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            if (r2 == 0) goto L59
            com.google.android.gms.internal.ads.fo5 r2 = com.google.android.gms.internal.ads.fo5.f8371a     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            java.util.List r4 = com.google.android.gms.internal.ads.to5.c(r2, r1, r4, r0)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            r1 = r0
        L1a:
            int r2 = r4.size()     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            if (r1 >= r2) goto L59
            java.lang.Object r2 = r4.get(r1)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            com.google.android.gms.internal.ads.qn5 r2 = (com.google.android.gms.internal.ads.qn5) r2     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f14523d     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            if (r2 == 0) goto L56
            java.lang.Object r2 = r4.get(r1)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            com.google.android.gms.internal.ads.qn5 r2 = (com.google.android.gms.internal.ads.qn5) r2     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.f14523d     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            if (r2 == 0) goto L56
            java.util.List r2 = com.google.android.gms.internal.ads.rn5.a(r2)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            if (r2 == 0) goto L56
            boolean r3 = r2.isEmpty()     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            if (r3 != 0) goto L56
            com.google.android.gms.internal.ads.tn5.a()     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            r4 = 720(0x2d0, float:1.009E-42)
            r1 = 60
            r3 = 1280(0x500, float:1.794E-42)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = com.google.android.gms.internal.ads.sn5.a(r3, r4, r1)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            int r4 = c(r2, r4)     // Catch: com.google.android.gms.internal.ads.ho5 -> L59
            return r4
        L56:
            int r1 = r1 + 1
            goto L1a
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wn5.b(boolean):int");
    }

    private static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i7 = 0; i7 < list.size(); i7++) {
            covers = un5.a(list.get(i7)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
