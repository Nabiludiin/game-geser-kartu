package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: MyApplication */
abstract class k5 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f10887a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f10888b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f10889c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.j5 a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k5.a(java.lang.String):com.google.android.gms.internal.ads.j5");
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = f10887a;
        for (int i7 = 0; i7 < 4; i7++) {
            if (str.contains(String.valueOf(strArr[i7]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static w04 c(XmlPullParser xmlPullParser, String str, String str2) {
        int i7 = w04.f17978s;
        t04 t04Var = new t04();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (jj2.b(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String c8 = jj2.c(xmlPullParser, concat2);
                String c9 = jj2.c(xmlPullParser, concat3);
                String c10 = jj2.c(xmlPullParser, concat4);
                String c11 = jj2.c(xmlPullParser, concat5);
                if (c8 == null || c9 == null) {
                    return w04.m();
                }
                t04Var.g(new i5(c8, c9, c10 != null ? Long.parseLong(c10) : 0L, c11 != null ? Long.parseLong(c11) : 0L));
            }
        } while (!jj2.a(xmlPullParser, str.concat(":Directory")));
        return t04Var.j();
    }
}
