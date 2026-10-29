package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

/* compiled from: MyApplication */
public final class qn5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14521b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14522c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f14523d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14524e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14525f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14526g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14527h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f14528i;

    /* renamed from: j, reason: collision with root package name */
    private int f14529j;

    /* renamed from: k, reason: collision with root package name */
    private int f14530k;

    /* renamed from: l, reason: collision with root package name */
    private float f14531l;

    qn5(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.f14520a = str;
        this.f14521b = str2;
        this.f14522c = str3;
        this.f14523d = codecCapabilities;
        this.f14526g = z7;
        this.f14524e = z10;
        this.f14525f = z12;
        this.f14527h = z13;
        this.f14528i = th.b(str2);
        this.f14531l = -3.4028235E38f;
        this.f14529j = -1;
        this.f14530k = -1;
    }

    public static qn5 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str6;
        boolean z16 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z17 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z18 = z11 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                str6 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z12 = z7;
                z13 = z8;
                z14 = z9;
                z15 = true;
                str4 = str;
                return new qn5(str4, str6, str5, codecCapabilities2, z12, z13, z14, z16, z17, z18, z15);
            }
        }
        str4 = str;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z12 = z7;
        z13 = z8;
        z14 = z9;
        z15 = false;
        str6 = str2;
        return new qn5(str4, str6, str5, codecCapabilities2, z12, z13, z14, z16, z17, z18, z15);
    }

    private final boolean j(eq5 eq5Var) {
        String str = this.f14521b;
        return str.equals(eq5Var.f7775o) || str.equals(to5.g(eq5Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r3.equals("video/hevc") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        if (r3.equals("video/av01") != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean k(com.google.android.gms.internal.ads.eq5 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qn5.k(com.google.android.gms.internal.ads.eq5, boolean):boolean");
    }

    private final boolean l(eq5 eq5Var) {
        return (Objects.equals(eq5Var.f7775o, "audio/flac") && eq5Var.I == 22 && Build.VERSION.SDK_INT < 34 && this.f14520a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void m(String str) {
        String str2 = hi2.f9535a;
        String str3 = this.f14521b;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.f14520a;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append("]");
        gv1.a("MediaCodecInfo", sb.toString());
    }

    private static boolean n(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d8) {
        Range<Double> achievableFrameRatesFor;
        Point o7 = o(videoCapabilities, i7, i8);
        int i9 = o7.x;
        int i10 = o7.y;
        if (d8 == -1.0d || d8 < 1.0d) {
            return videoCapabilities.isSizeSupported(i9, i10);
        }
        double floor = Math.floor(d8);
        if (videoCapabilities.areSizeAndRateSupported(i9, i10, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i9, i10)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }

    private static Point o(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = hi2.f9535a;
        return new Point((((i7 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i8 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final MediaCodecInfo.CodecProfileLevel[] b() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14523d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean c(eq5 eq5Var) {
        int i7;
        if (!j(eq5Var) || !k(eq5Var, true) || !l(eq5Var)) {
            return false;
        }
        if (this.f14528i) {
            int i8 = eq5Var.f7782v;
            if (i8 <= 0 || (i7 = eq5Var.f7783w) <= 0) {
                return true;
            }
            return g(i8, i7, eq5Var.f7786z);
        }
        int i9 = eq5Var.H;
        if (i9 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14523d;
            if (codecCapabilities == null) {
                m("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                m("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i9)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i9);
                m(sb.toString());
                return false;
            }
        }
        int i10 = eq5Var.G;
        if (i10 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f14523d;
            if (codecCapabilities2 == null) {
                m("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                m("channelCount.aCaps");
                return false;
            }
            String str = this.f14520a;
            String str2 = this.f14521b;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i11).length() + 1);
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i11);
                sb2.append("]");
                gv1.c("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i11;
            }
            if (maxInputChannelCount < i10) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 22);
                sb3.append("channelCount.support, ");
                sb3.append(i10);
                m(sb3.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean d(eq5 eq5Var) {
        return j(eq5Var) && k(eq5Var, false) && l(eq5Var);
    }

    public final boolean e(eq5 eq5Var) {
        if (this.f14528i) {
            return this.f14524e;
        }
        int i7 = to5.f16275b;
        Pair d8 = qe1.d(eq5Var);
        return d8 != null && ((Integer) d8.first).intValue() == 42;
    }

    public final iw4 f(eq5 eq5Var, eq5 eq5Var2) {
        eq5 eq5Var3;
        eq5 eq5Var4;
        int i7;
        int i8 = true != Objects.equals(eq5Var.f7775o, eq5Var2.f7775o) ? 8 : 0;
        if (this.f14528i) {
            if (eq5Var.A != eq5Var2.A) {
                i8 |= 1024;
            }
            boolean z7 = (eq5Var.f7782v == eq5Var2.f7782v && eq5Var.f7783w == eq5Var2.f7783w) ? false : true;
            if (!this.f14524e && z7) {
                i8 |= 512;
            }
            w25 w25Var = eq5Var.E;
            if ((!w25.a(w25Var) || !w25.a(eq5Var2.E)) && !Objects.equals(w25Var, eq5Var2.E)) {
                i8 |= 2048;
            }
            String str = this.f14520a;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !eq5Var.d(eq5Var2)) {
                i8 |= 2;
            }
            int i9 = eq5Var.f7784x;
            if (i9 != -1 && (i7 = eq5Var.f7785y) != -1 && i9 == eq5Var2.f7784x && i7 == eq5Var2.f7785y && z7) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new iw4(str, eq5Var, eq5Var2, true != eq5Var.d(eq5Var2) ? 2 : 3, 0);
            }
            eq5Var3 = eq5Var;
            eq5Var4 = eq5Var2;
        } else {
            eq5Var3 = eq5Var;
            eq5Var4 = eq5Var2;
            if (eq5Var3.G != eq5Var4.G) {
                i8 |= 4096;
            }
            if (eq5Var3.H != eq5Var4.H) {
                i8 |= 8192;
            }
            if (eq5Var3.I != eq5Var4.I) {
                i8 |= 16384;
            }
            if (i8 == 0) {
                String str2 = this.f14521b;
                if (str2.equals("audio/mp4a-latm") || str2.equals("audio/ac4")) {
                    int i10 = to5.f16275b;
                    Pair d8 = qe1.d(eq5Var3);
                    Pair d9 = qe1.d(eq5Var4);
                    if (d8 != null && d9 != null) {
                        int intValue = ((Integer) d8.first).intValue();
                        int intValue2 = ((Integer) d9.first).intValue();
                        if (intValue == 42 && intValue2 == 42) {
                            return new iw4(this.f14520a, eq5Var3, eq5Var4, 3, 0);
                        }
                        if (str2.equals("audio/ac4") && d8.equals(d9)) {
                            return new iw4(this.f14520a, eq5Var3, eq5Var4, 3, 0);
                        }
                    }
                }
            }
            if (i8 == 0) {
                String str3 = this.f14521b;
                if (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3")) {
                    return new iw4(this.f14520a, eq5Var3, eq5Var4, 3, 0);
                }
            }
            if (!eq5Var3.d(eq5Var4)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(this.f14521b)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new iw4(this.f14520a, eq5Var3, eq5Var4, 1, 0);
            }
        }
        return new iw4(this.f14520a, eq5Var3, eq5Var4, 0, i8);
    }

    public final boolean g(int i7, int i8, double d8) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14523d;
        if (codecCapabilities == null) {
            m("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a8 = yn5.a(videoCapabilities, i7, i8, d8);
            if (a8 != 2) {
                if (a8 == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20 + String.valueOf(i8).length() + 1 + String.valueOf(d8).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i7);
                    sb.append("x");
                    sb.append(i8);
                    sb.append("@");
                    sb.append(d8);
                    m(sb.toString());
                    return false;
                }
            }
            return true;
        }
        if (!n(videoCapabilities, i7, i8, d8)) {
            if (i7 < i8) {
                String str = this.f14520a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && n(videoCapabilities, i8, i7, d8)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d8).length());
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i8);
                    sb2.append("@");
                    sb2.append(d8);
                    String sb3 = sb2.toString();
                    String str2 = this.f14521b;
                    int length = str.length();
                    String str3 = hi2.f9535a;
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    sb4.append(", ");
                    sb4.append(str2);
                    sb4.append("] [");
                    sb4.append(str3);
                    sb4.append("]");
                    gv1.a("MediaCodecInfo", sb4.toString());
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i7).length() + 22 + String.valueOf(i8).length() + 1 + String.valueOf(d8).length());
            sb5.append("sizeAndRate.support, ");
            sb5.append(i7);
            sb5.append("x");
            sb5.append(i8);
            sb5.append("@");
            sb5.append(d8);
            m(sb5.toString());
            return false;
        }
        return true;
    }

    public final float h(int i7, int i8) {
        if (!this.f14528i) {
            return -3.4028235E38f;
        }
        float f8 = this.f14531l;
        if (f8 != -3.4028235E38f && this.f14529j == i7 && this.f14530k == i8) {
            return f8;
        }
        float f9 = 1024.0f;
        if (!g(i7, i8, 1024.0d)) {
            float f10 = 0.0f;
            while (true) {
                float f11 = f9 - f10;
                if (Math.abs(f11) <= 5.0f) {
                    break;
                }
                float f12 = (f11 / 2.0f) + f10;
                boolean g8 = g(i7, i8, f12);
                if (true == g8) {
                    f10 = f12;
                }
                if (true != g8) {
                    f9 = f12;
                }
            }
            f9 = f10;
        }
        this.f14531l = f9;
        this.f14529j = i7;
        this.f14530k = i8;
        return f9;
    }

    public final Point i(int i7, int i8) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14523d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return o(videoCapabilities, i7, i8);
    }

    public final String toString() {
        return this.f14520a;
    }
}
