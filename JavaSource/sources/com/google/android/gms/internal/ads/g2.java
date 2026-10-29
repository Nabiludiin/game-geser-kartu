package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;

/* compiled from: MyApplication */
public final class g2 implements s2 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f8617c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: d, reason: collision with root package name */
    private static final f2 f8618d = new f2(d2.f6910a);

    /* renamed from: e, reason: collision with root package name */
    private static final f2 f8619e = new f2(c2.f6222a);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8620f = 0;

    /* renamed from: a, reason: collision with root package name */
    private w04 f8621a;

    /* renamed from: b, reason: collision with root package name */
    private final q9 f8622b = new l9();

    private final void c(int i7, List list) {
        switch (i7) {
            case 0:
                list.add(new qb());
                break;
            case 1:
                list.add(new sb());
                break;
            case 2:
                list.add(new ub(0));
                break;
            case 3:
                list.add(new h4(0));
                break;
            case 4:
                m2 a8 = f8618d.a(0);
                if (a8 == null) {
                    list.add(new y4(0));
                    break;
                } else {
                    list.add(a8);
                    break;
                }
            case 5:
                list.add(new a5());
                break;
            case 6:
                list.add(new x6(this.f8622b, 0));
                break;
            case 7:
                list.add(new d7(0));
                break;
            case 8:
                q9 q9Var = this.f8622b;
                list.add(new c8(q9Var, 0, null, null, w04.m(), null));
                list.add(new j8(q9Var, 0));
                break;
            case 9:
                list.add(new y8());
                break;
            case 10:
                list.add(new ad());
                break;
            case 11:
                if (this.f8621a == null) {
                    this.f8621a = w04.m();
                }
                list.add(new md(1, 0, this.f8622b, new ef2(0L), new wb(0, this.f8621a), 112800));
                break;
            case 12:
                list.add(new yd());
                break;
            case 14:
                list.add(new g5(0));
                break;
            case 15:
                m2 a9 = f8619e.a(new Object[0]);
                if (a9 != null) {
                    list.add(a9);
                    break;
                }
                break;
            case 16:
                list.add(new l4(0, this.f8622b));
                break;
            case 17:
                list.add(new i9());
                break;
            case 18:
                list.add(new de());
                break;
            case 19:
                list.add(new u4());
                break;
            case 20:
                list.add(new f5());
                break;
            case 21:
                list.add(new t4());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final synchronized m2[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x013e, code lost:
    
        if (r4.equals("application/mp4") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0169, code lost:
    
        if (r4.equals("image/heic") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x017d, code lost:
    
        if (r4.equals("audio/amr-wb") != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0187, code lost:
    
        if (r4.equals("video/webm") != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01a6, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L113;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ab A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ab, B:15:0x01ae, B:20:0x0362, B:21:0x0365, B:23:0x036a, B:26:0x0370, B:28:0x0373, B:32:0x0376, B:37:0x01b7, B:39:0x01bf, B:41:0x01ca, B:44:0x01d6, B:46:0x01de, B:48:0x01e9, B:51:0x01f4, B:54:0x01ff, B:57:0x020a, B:59:0x0212, B:61:0x021a, B:63:0x0226, B:65:0x0234, B:67:0x023f, B:70:0x024a, B:72:0x0252, B:74:0x0260, B:76:0x026e, B:78:0x0280, B:80:0x028e, B:82:0x029a, B:84:0x02a2, B:86:0x02aa, B:88:0x02b2, B:90:0x02be, B:92:0x02c6, B:94:0x02d7, B:96:0x02df, B:98:0x02eb, B:100:0x02f3, B:102:0x02fe, B:104:0x0306, B:106:0x0310, B:109:0x031b, B:112:0x0326, B:115:0x0331, B:117:0x0339, B:119:0x0343, B:121:0x034b, B:123:0x0355, B:139:0x0049, B:140:0x0051, B:142:0x0055, B:146:0x005f, B:149:0x0069, B:152:0x0074, B:155:0x0080, B:158:0x008b, B:162:0x0095, B:166:0x009f, B:170:0x00a9, B:173:0x00b5, B:176:0x00c1, B:179:0x00cb, B:182:0x00d5, B:185:0x00e1, B:188:0x00eb, B:191:0x00f6, B:194:0x0100, B:197:0x010a, B:200:0x0116, B:203:0x0121, B:206:0x012c, B:209:0x0138, B:211:0x0144, B:214:0x0150, B:217:0x015a, B:221:0x0163, B:223:0x016d, B:226:0x0177, B:228:0x0181, B:230:0x018b, B:233:0x0195, B:236:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x036a A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ab, B:15:0x01ae, B:20:0x0362, B:21:0x0365, B:23:0x036a, B:26:0x0370, B:28:0x0373, B:32:0x0376, B:37:0x01b7, B:39:0x01bf, B:41:0x01ca, B:44:0x01d6, B:46:0x01de, B:48:0x01e9, B:51:0x01f4, B:54:0x01ff, B:57:0x020a, B:59:0x0212, B:61:0x021a, B:63:0x0226, B:65:0x0234, B:67:0x023f, B:70:0x024a, B:72:0x0252, B:74:0x0260, B:76:0x026e, B:78:0x0280, B:80:0x028e, B:82:0x029a, B:84:0x02a2, B:86:0x02aa, B:88:0x02b2, B:90:0x02be, B:92:0x02c6, B:94:0x02d7, B:96:0x02df, B:98:0x02eb, B:100:0x02f3, B:102:0x02fe, B:104:0x0306, B:106:0x0310, B:109:0x031b, B:112:0x0326, B:115:0x0331, B:117:0x0339, B:119:0x0343, B:121:0x034b, B:123:0x0355, B:139:0x0049, B:140:0x0051, B:142:0x0055, B:146:0x005f, B:149:0x0069, B:152:0x0074, B:155:0x0080, B:158:0x008b, B:162:0x0095, B:166:0x009f, B:170:0x00a9, B:173:0x00b5, B:176:0x00c1, B:179:0x00cb, B:182:0x00d5, B:185:0x00e1, B:188:0x00eb, B:191:0x00f6, B:194:0x0100, B:197:0x010a, B:200:0x0116, B:203:0x0121, B:206:0x012c, B:209:0x0138, B:211:0x0144, B:214:0x0150, B:217:0x015a, B:221:0x0163, B:223:0x016d, B:226:0x0177, B:228:0x0181, B:230:0x018b, B:233:0x0195, B:236:0x01a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b7 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:14:0x01ab, B:15:0x01ae, B:20:0x0362, B:21:0x0365, B:23:0x036a, B:26:0x0370, B:28:0x0373, B:32:0x0376, B:37:0x01b7, B:39:0x01bf, B:41:0x01ca, B:44:0x01d6, B:46:0x01de, B:48:0x01e9, B:51:0x01f4, B:54:0x01ff, B:57:0x020a, B:59:0x0212, B:61:0x021a, B:63:0x0226, B:65:0x0234, B:67:0x023f, B:70:0x024a, B:72:0x0252, B:74:0x0260, B:76:0x026e, B:78:0x0280, B:80:0x028e, B:82:0x029a, B:84:0x02a2, B:86:0x02aa, B:88:0x02b2, B:90:0x02be, B:92:0x02c6, B:94:0x02d7, B:96:0x02df, B:98:0x02eb, B:100:0x02f3, B:102:0x02fe, B:104:0x0306, B:106:0x0310, B:109:0x031b, B:112:0x0326, B:115:0x0331, B:117:0x0339, B:119:0x0343, B:121:0x034b, B:123:0x0355, B:139:0x0049, B:140:0x0051, B:142:0x0055, B:146:0x005f, B:149:0x0069, B:152:0x0074, B:155:0x0080, B:158:0x008b, B:162:0x0095, B:166:0x009f, B:170:0x00a9, B:173:0x00b5, B:176:0x00c1, B:179:0x00cb, B:182:0x00d5, B:185:0x00e1, B:188:0x00eb, B:191:0x00f6, B:194:0x0100, B:197:0x010a, B:200:0x0116, B:203:0x0121, B:206:0x012c, B:209:0x0138, B:211:0x0144, B:214:0x0150, B:217:0x015a, B:221:0x0163, B:223:0x016d, B:226:0x0177, B:228:0x0181, B:230:0x018b, B:233:0x0195, B:236:0x01a0), top: B:3:0x0003 }] */
    @Override // com.google.android.gms.internal.ads.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.m2[] b(android.net.Uri r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g2.b(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.m2[]");
    }
}
