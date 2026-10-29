package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: MyApplication */
public abstract class to5 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f16274a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16275b = 0;

    public static qn5 a() {
        List b8 = b("audio/raw", false, false);
        if (b8.isEmpty()) {
            return null;
        }
        return (qn5) b8.get(0);
    }

    public static synchronized List b(String str, boolean z7, boolean z8) {
        synchronized (to5.class) {
            try {
                go5 go5Var = new go5(str, z7, z8);
                HashMap hashMap = f16274a;
                List list = (List) hashMap.get(go5Var);
                if (list != null) {
                    return list;
                }
                ArrayList h8 = h(go5Var, new ko5(z7, z8, str.equals("video/mv-hevc")));
                if (z7 && h8.isEmpty() && Build.VERSION.SDK_INT == 23) {
                    h8 = h(go5Var, new jo5(null));
                    if (!h8.isEmpty()) {
                        String str2 = ((qn5) h8.get(0)).f14520a;
                        StringBuilder sb = new StringBuilder(str.length() + 63 + str2.length());
                        sb.append("MediaCodecList API didn't list secure decoder for: ");
                        sb.append(str);
                        sb.append(". Assuming: ");
                        sb.append(str2);
                        gv1.c("MediaCodecUtil", sb.toString());
                    }
                }
                if ("audio/raw".equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && h8.size() == 1 && ((qn5) h8.get(0)).f14520a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        h8.add(qn5.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    j(h8, lo5.f11714a);
                }
                if (Build.VERSION.SDK_INT < 32 && h8.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((qn5) h8.get(0)).f14520a)) {
                    h8.add((qn5) h8.remove(0));
                }
                w04 u7 = w04.u(h8);
                hashMap.put(go5Var, u7);
                return u7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List c(fo5 fo5Var, eq5 eq5Var, boolean z7, boolean z8) {
        List a8 = fo5Var.a(eq5Var.f7775o, z7, z8);
        List d8 = d(fo5Var, eq5Var, z7, z8);
        int i7 = w04.f17978s;
        t04 t04Var = new t04();
        t04Var.i(a8);
        t04Var.i(d8);
        return t04Var.j();
    }

    public static List d(fo5 fo5Var, eq5 eq5Var, boolean z7, boolean z8) {
        String g8 = g(eq5Var);
        return g8 == null ? w04.m() : fo5Var.a(g8, z7, z8);
    }

    public static List e(List list, final eq5 eq5Var) {
        ArrayList arrayList = new ArrayList(list);
        j(arrayList, new oo5() { // from class: com.google.android.gms.internal.ads.no5
            @Override // com.google.android.gms.internal.ads.oo5
            public final /* synthetic */ int d(Object obj) {
                int i7 = to5.f16275b;
                return ((qn5) obj).d(eq5.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel f(int i7, int i8) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i7;
        codecProfileLevel.level = i8;
        return codecProfileLevel;
    }

    public static String g(eq5 eq5Var) {
        Pair d8;
        String str = eq5Var.f7775o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (d8 = qe1.d(eq5Var)) != null) {
            int intValue = ((Integer) d8.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(1:(1:58))|59|60|(2:113|114)(2:62|(1:64)(1:112))|65|66|(1:68)(2:104|(1:111)(1:110))|(9:(1:71)|72|73|74|75|76|77|35|36)|(4:97|(2:100|102)|35|36)|72|73|74|75|76|77|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x022a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x027f, code lost:
    
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 46);
        r7.append("Skipping codec ");
        r7.append(r3);
        r7.append(" (failed to query capabilities)");
        com.google.android.gms.internal.ads.gv1.e("MediaCodecUtil", r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022d, code lost:
    
        r3 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e5 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:114:0x01bb, B:66:0x01d6, B:68:0x01e0, B:104:0x01e5, B:106:0x01f5, B:108:0x01fd, B:62:0x01ca), top: B:113:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6 A[Catch: Exception -> 0x0041, TryCatch #5 {Exception -> 0x0041, blocks: (B:3:0x0012, B:5:0x0027, B:7:0x0031, B:13:0x0044, B:17:0x0052, B:22:0x0067, B:24:0x0071, B:30:0x00dd, B:32:0x00e5, B:37:0x00ed, B:39:0x00f6, B:80:0x0271, B:83:0x0279, B:85:0x027f, B:87:0x02a0, B:88:0x02ce, B:41:0x0103, B:127:0x0106, B:129:0x010e, B:132:0x0119, B:134:0x0121, B:139:0x012f, B:141:0x0137, B:143:0x013f, B:146:0x014a, B:148:0x0152, B:151:0x015d, B:153:0x0165, B:156:0x0170, B:158:0x0178, B:161:0x007d, B:163:0x0089, B:165:0x0093, B:167:0x009b, B:169:0x00a3, B:171:0x00ab, B:173:0x00b3, B:175:0x00bb, B:177:0x00c3), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ca A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:114:0x01bb, B:66:0x01d6, B:68:0x01e0, B:104:0x01e5, B:106:0x01f5, B:108:0x01fd, B:62:0x01ca), top: B:113:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0 A[Catch: Exception -> 0x01c2, TryCatch #3 {Exception -> 0x01c2, blocks: (B:114:0x01bb, B:66:0x01d6, B:68:0x01e0, B:104:0x01e5, B:106:0x01f5, B:108:0x01fd, B:62:0x01ca), top: B:113:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0279 A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #5 {Exception -> 0x0041, blocks: (B:3:0x0012, B:5:0x0027, B:7:0x0031, B:13:0x0044, B:17:0x0052, B:22:0x0067, B:24:0x0071, B:30:0x00dd, B:32:0x00e5, B:37:0x00ed, B:39:0x00f6, B:80:0x0271, B:83:0x0279, B:85:0x027f, B:87:0x02a0, B:88:0x02ce, B:41:0x0103, B:127:0x0106, B:129:0x010e, B:132:0x0119, B:134:0x0121, B:139:0x012f, B:141:0x0137, B:143:0x013f, B:146:0x014a, B:148:0x0152, B:151:0x015d, B:153:0x0165, B:156:0x0170, B:158:0x0178, B:161:0x007d, B:163:0x0089, B:165:0x0093, B:167:0x009b, B:169:0x00a3, B:171:0x00ab, B:173:0x00b3, B:175:0x00bb, B:177:0x00c3), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList h(com.google.android.gms.internal.ads.go5 r27, com.google.android.gms.internal.ads.io5 r28) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.to5.h(com.google.android.gms.internal.ads.go5, com.google.android.gms.internal.ads.io5):java.util.ArrayList");
    }

    private static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (Build.VERSION.SDK_INT >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (th.a(str)) {
            return true;
        }
        String a8 = zw3.a(mediaCodecInfo.getName());
        if (a8.startsWith("arc.")) {
            return false;
        }
        if (a8.startsWith("omx.google.") || a8.startsWith("omx.ffmpeg.") || ((a8.startsWith("omx.sec.") && a8.contains(".sw.")) || a8.equals("omx.qcom.video.decoder.hevcswvdec") || a8.startsWith("c2.android.") || a8.startsWith("c2.google."))) {
            return true;
        }
        return (a8.startsWith("omx.") || a8.startsWith("c2.")) ? false : true;
    }

    private static void j(List list, final oo5 oo5Var) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.mo5
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i7 = to5.f16275b;
                oo5 oo5Var2 = oo5.this;
                return oo5Var2.d(obj2) - oo5Var2.d(obj);
            }
        });
    }
}
