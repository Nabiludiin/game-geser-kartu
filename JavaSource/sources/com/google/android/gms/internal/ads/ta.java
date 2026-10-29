package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: MyApplication */
public final class ta implements s9 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f16051b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f16052c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f16053d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f16054e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f16055f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f16056g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f16057h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    private static final ra f16058i = new ra(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f16059a;

    public ta() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f16059a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    private static String[] c(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = hi2.f9535a;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0274, code lost:
    
        if (r3.equals("text") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0288, code lost:
    
        r0 = e(r0);
        r0.I(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x027d, code lost:
    
        if (r3.equals("base") != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02bc, code lost:
    
        r0 = e(r0);
        r0.I(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0286, code lost:
    
        if (r3.equals("textContainer") != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ba, code lost:
    
        if (r3.equals("baseContainer") != false) goto L128;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126 A[Catch: o9 -> 0x018f, TryCatch #1 {o9 -> 0x018f, blocks: (B:33:0x00af, B:35:0x00cb, B:36:0x00e1, B:38:0x00e7, B:40:0x00ed, B:49:0x0105, B:50:0x0120, B:52:0x0126, B:54:0x012f, B:57:0x0130, B:58:0x014d, B:62:0x0111, B:66:0x011d, B:69:0x014e, B:71:0x014f, B:72:0x016c, B:74:0x00d4, B:76:0x016d, B:77:0x018e), top: B:32:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.wa d(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.wa r18) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ta.d(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.wa):com.google.android.gms.internal.ads.wa");
    }

    private static wa e(wa waVar) {
        return waVar == null ? new wa() : waVar;
    }

    private static Layout.Alignment f(String str) {
        String a8 = zw3.a(str);
        switch (a8.hashCode()) {
            case -1364013995:
                if (a8.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!a8.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!a8.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!a8.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!a8.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static long g(String str, ra raVar) {
        double d8;
        double d9;
        Matcher matcher = f16051b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            long parseLong = Long.parseLong(group) * 3600;
            String group2 = matcher.group(2);
            group2.getClass();
            long parseLong2 = Long.parseLong(group2) * 60;
            String group3 = matcher.group(3);
            group3.getClass();
            double d10 = parseLong + parseLong2;
            double parseLong3 = Long.parseLong(group3);
            String group4 = matcher.group(4);
            double parseDouble = group4 != null ? Double.parseDouble(group4) : 0.0d;
            double d11 = d10 + parseLong3;
            return (long) ((d11 + parseDouble + (matcher.group(5) != null ? Long.parseLong(r12) / raVar.f14807a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / raVar.f14808b) / raVar.f14807a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f16052c.matcher(str);
        if (!matcher2.matches()) {
            throw new o9("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String group5 = matcher2.group(1);
        group5.getClass();
        double parseDouble2 = Double.parseDouble(group5);
        String group6 = matcher2.group(2);
        group6.getClass();
        int hashCode = group6.hashCode();
        if (hashCode == 102) {
            if (group6.equals("f")) {
                d8 = raVar.f14807a;
                parseDouble2 /= d8;
            }
            return (long) (parseDouble2 * 1000000.0d);
        }
        if (hashCode != 104) {
            if (hashCode != 109) {
                if (hashCode != 3494) {
                    if (hashCode == 115) {
                        group6.equals("s");
                    } else if (hashCode == 116 && group6.equals("t")) {
                        d8 = raVar.f14809c;
                        parseDouble2 /= d8;
                    }
                } else if (group6.equals("ms")) {
                    d8 = 1000.0d;
                    parseDouble2 /= d8;
                }
            } else if (group6.equals("m")) {
                d9 = 60.0d;
                parseDouble2 *= d9;
            }
        } else if (group6.equals("h")) {
            d9 = 3600.0d;
            parseDouble2 *= d9;
        }
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        m9.a(b(bArr, i7, i8), r9Var, th1Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:242|243|244|(3:246|247|73)|290|291|(3:293|(4:295|(1:297)(1:321)|298|(1:300)(1:301))|322)(1:323)|302|(2:304|(1:306)(7:(2:308|(1:310))|311|312|313|314|315|(1:317)))|320|312|313|314|315|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:353|(1:(6:356|357|358|34|(2:326|(1:328)(4:329|330|331|(2:333|(1:335)(2:336|337))(2:338|339)))|36)(1:361))(1:363)|362|357|358|34|(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04ca, code lost:
    
        if (r0.equals("tblr") != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d5, code lost:
    
        r40 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04d3, code lost:
    
        if (r0.equals("tb") != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0687, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:247:0x0580. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ba A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x045d A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0683 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, o9 -> 0x0687, TRY_LEAVE, TryCatch #8 {o9 -> 0x0687, blocks: (B:315:0x067e, B:317:0x0683), top: B:314:0x067e }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0174 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_ENTER, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0271 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, LOOP:1: B:76:0x0271->B:91:0x0543, LOOP_START, PHI: r1 r3 r7 r8 r13 r14 r15
  0x0271: PHI (r1v18 java.lang.String) = (r1v9 java.lang.String), (r1v53 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r3v27 java.lang.String) = (r3v1 java.lang.String), (r3v51 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r7v6 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v31 java.util.HashMap) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r8v14 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v22 java.util.HashMap) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r13v11 java.lang.String) = (r13v8 java.lang.String), (r13v29 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r14v24 java.lang.String) = (r14v10 java.lang.String), (r14v27 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r15v10 java.lang.String) = (r15v9 java.lang.String), (r15v14 java.lang.String) binds: [B:75:0x026f, B:91:0x0543] A[DONT_GENERATE, DONT_INLINE], TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:18:0x009b, B:20:0x00a3, B:23:0x00b9, B:24:0x00d4, B:26:0x00de, B:27:0x00e2, B:29:0x00ee, B:30:0x00f2, B:34:0x0167, B:38:0x01c2, B:41:0x01d6, B:43:0x01dc, B:45:0x01e4, B:47:0x01ec, B:49:0x01f4, B:51:0x01fc, B:53:0x0204, B:55:0x020a, B:57:0x0212, B:59:0x021a, B:61:0x0220, B:63:0x0226, B:65:0x022c, B:67:0x0234, B:70:0x023d, B:73:0x0703, B:74:0x026b, B:76:0x0271, B:78:0x027a, B:80:0x0289, B:82:0x0296, B:84:0x02ac, B:86:0x02b2, B:89:0x0537, B:99:0x02bd, B:102:0x02c9, B:106:0x04e7, B:109:0x02e7, B:111:0x02ef, B:113:0x02f7, B:115:0x02ff, B:118:0x030c, B:122:0x0325, B:124:0x032b, B:126:0x0338, B:127:0x03a0, B:129:0x03a6, B:131:0x03ac, B:133:0x03b4, B:135:0x03ba, B:139:0x03cd, B:141:0x03d3, B:143:0x03e0, B:144:0x0455, B:146:0x045d, B:155:0x0498, B:157:0x04a2, B:167:0x04da, B:179:0x03eb, B:182:0x03ec, B:183:0x03ed, B:185:0x03fa, B:188:0x0402, B:191:0x0410, B:193:0x0416, B:195:0x0421, B:197:0x0435, B:199:0x0436, B:200:0x0437, B:201:0x0444, B:204:0x0341, B:206:0x0342, B:207:0x0343, B:208:0x034e, B:211:0x0358, B:214:0x0361, B:216:0x0367, B:218:0x0372, B:220:0x0384, B:222:0x0385, B:223:0x0386, B:224:0x038e, B:228:0x04fa, B:230:0x0507, B:232:0x0512, B:234:0x0518, B:235:0x0524, B:244:0x0551, B:246:0x0574, B:250:0x0626, B:261:0x059b, B:264:0x05a4, B:255:0x0695, B:272:0x05c6, B:278:0x05e0, B:281:0x05f6, B:284:0x060a, B:287:0x061e, B:293:0x0637, B:297:0x0643, B:300:0x064c, B:306:0x065e, B:308:0x0667, B:312:0x0672, B:315:0x067e, B:317:0x0683, B:326:0x0174, B:328:0x0180, B:331:0x0189, B:333:0x018f, B:335:0x019a, B:337:0x01a6, B:339:0x01a7, B:340:0x01a8, B:341:0x010b, B:343:0x0117, B:346:0x0121, B:348:0x0127, B:351:0x012e, B:353:0x0134, B:358:0x0149, B:360:0x015f, B:366:0x0156, B:372:0x015e, B:382:0x06b6, B:385:0x06c3, B:388:0x06c7, B:390:0x06d1, B:392:0x06db, B:393:0x06e3, B:396:0x06e0, B:400:0x06f8, B:405:0x0700, B:411:0x071f), top: B:2:0x0008, inners: #1, #2, #3, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0543 A[LOOP:1: B:76:0x0271->B:91:0x0543, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x053d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.wa, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.n9 b(byte[] r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ta.b(byte[], int, int):com.google.android.gms.internal.ads.n9");
    }
}
