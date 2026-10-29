package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class tu5 implements qu5, kb4 {
    public static final w04 D = w04.q(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final w04 E = w04.q(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final w04 F = w04.q(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final w04 G = w04.q(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final w04 H = w04.q(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final w04 I = w04.q(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static tu5 J;
    private long A;
    private int B;
    private String C;

    /* renamed from: q, reason: collision with root package name */
    private final Context f16378q;

    /* renamed from: r, reason: collision with root package name */
    private final z04 f16379r;

    /* renamed from: s, reason: collision with root package name */
    private final nu5 f16380s;

    /* renamed from: t, reason: collision with root package name */
    private final hv5 f16381t;

    /* renamed from: u, reason: collision with root package name */
    private int f16382u;

    /* renamed from: v, reason: collision with root package name */
    private long f16383v;

    /* renamed from: w, reason: collision with root package name */
    private long f16384w;

    /* renamed from: x, reason: collision with root package name */
    private long f16385x;

    /* renamed from: y, reason: collision with root package name */
    private long f16386y;

    /* renamed from: z, reason: collision with root package name */
    private long f16387z;

    /* synthetic */ tu5(Context context, Map map, int i7, pd1 pd1Var, boolean z7, byte[] bArr) {
        this.f16378q = context == null ? null : context.getApplicationContext();
        this.f16379r = z04.c(map);
        this.f16380s = new nu5();
        this.f16381t = new hv5(2000);
        if (context == null) {
            this.B = 0;
            this.f16387z = 1000000L;
            return;
        }
        v62 a8 = v62.a(context);
        int c8 = a8.c();
        this.B = c8;
        this.f16387z = j(c8);
        a8.b(new m02() { // from class: com.google.android.gms.internal.ads.su5
            @Override // com.google.android.gms.internal.ads.m02
            public final /* synthetic */ void L(int i8) {
                tu5.this.f(i8);
            }
        }, f71.a());
    }

    public static synchronized tu5 e(Context context) {
        tu5 tu5Var;
        synchronized (tu5.class) {
            try {
                if (J == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    pd1 pd1Var = pd1.f13828a;
                    HashMap hashMap = new HashMap(8);
                    hashMap.put(0, 1000000L);
                    hashMap.put(2, -9223372036854775807L);
                    hashMap.put(3, -9223372036854775807L);
                    hashMap.put(4, -9223372036854775807L);
                    hashMap.put(5, -9223372036854775807L);
                    hashMap.put(10, -9223372036854775807L);
                    hashMap.put(9, -9223372036854775807L);
                    hashMap.put(7, -9223372036854775807L);
                    J = new tu5(applicationContext, hashMap, 2000, pd1Var, true, null);
                }
                tu5Var = J;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tu5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0007, code lost:
    
        if (r8.C == null) goto L11;
     */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(int r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.B     // Catch: java.lang.Throwable -> L82
            if (r0 != r9) goto L12
            java.lang.String r0 = r8.C     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto La
            goto L12
        La:
            r2 = r8
            goto L85
        Ld:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L87
        L12:
            r8.B = r9     // Catch: java.lang.Throwable -> L82
            r0 = 1
            if (r9 == r0) goto La
            if (r9 == 0) goto La
            r0 = 8
            if (r9 != r0) goto L1e
            goto La
        L1e:
            java.lang.String r0 = r8.C     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L4f
            android.content.Context r0 = r8.f16378q     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = com.google.android.gms.internal.ads.hi2.f9535a     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L41
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> Ld
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Ld
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto L41
            java.lang.String r0 = com.google.android.gms.internal.ads.zw3.b(r0)     // Catch: java.lang.Throwable -> Ld
            goto L4d
        L41:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.getCountry()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = com.google.android.gms.internal.ads.zw3.b(r0)     // Catch: java.lang.Throwable -> Ld
        L4d:
            r8.C = r0     // Catch: java.lang.Throwable -> Ld
        L4f:
            long r0 = r8.j(r9)     // Catch: java.lang.Throwable -> L82
            r8.f16387z = r0     // Catch: java.lang.Throwable -> L82
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L82
            int r9 = r8.f16382u     // Catch: java.lang.Throwable -> L82
            if (r9 <= 0) goto L64
            long r2 = r8.f16383v     // Catch: java.lang.Throwable -> Ld
            long r2 = r0 - r2
            int r9 = (int) r2
        L62:
            r3 = r9
            goto L66
        L64:
            r9 = 0
            goto L62
        L66:
            long r4 = r8.f16384w     // Catch: java.lang.Throwable -> L82
            long r6 = r8.f16387z     // Catch: java.lang.Throwable -> L82
            r2 = r8
            r2.h(r3, r4, r6)     // Catch: java.lang.Throwable -> L7f
            r2.f16383v = r0     // Catch: java.lang.Throwable -> L7f
            r0 = 0
            r2.f16384w = r0     // Catch: java.lang.Throwable -> L7f
            r2.f16386y = r0     // Catch: java.lang.Throwable -> L7f
            r2.f16385x = r0     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.hv5 r9 = r2.f16381t     // Catch: java.lang.Throwable -> L7f
            r9.a()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r8)
            return
        L7f:
            r0 = move-exception
        L80:
            r9 = r0
            goto L87
        L82:
            r0 = move-exception
            r2 = r8
            goto L80
        L85:
            monitor-exit(r8)
            return
        L87:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7f
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tu5.f(int):void");
    }

    private final void h(int i7, long j7, long j8) {
        int i8;
        long j9;
        if (i7 == 0) {
            if (j7 != 0) {
                j9 = j7;
            } else if (j8 == this.A) {
                return;
            } else {
                j9 = 0;
            }
            i8 = 0;
        } else {
            i8 = i7;
            j9 = j7;
        }
        this.A = j8;
        this.f16380s.c(i8, j9, j8);
    }

    private final long j(int i7) {
        long longValue;
        z04 z04Var = this.f16379r;
        Long l7 = (Long) z04Var.get(Integer.valueOf(i7));
        if (l7 == null) {
            l7 = (Long) z04Var.get(0);
        } else if (l7.longValue() == -9223372036854775807L) {
            int[] m7 = m(iy3.a(this.C));
            if (i7 != 2) {
                if (i7 == 3) {
                    longValue = ((Long) E.get(m7[1])).longValue();
                } else if (i7 == 4) {
                    longValue = ((Long) F.get(m7[2])).longValue();
                } else if (i7 == 5) {
                    longValue = ((Long) G.get(m7[3])).longValue();
                } else if (i7 != 7) {
                    longValue = i7 != 9 ? i7 != 10 ? 1000000L : ((Long) H.get(m7[4])).longValue() : ((Long) I.get(m7[5])).longValue();
                }
                l7 = Long.valueOf(longValue);
            }
            longValue = ((Long) D.get(m7[0])).longValue();
            l7 = Long.valueOf(longValue);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    private static boolean k(cq3 cq3Var, boolean z7) {
        return z7 && !cq3Var.a(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013b, code lost:
    
        if (r3.equals("YT") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0526, code lost:
    
        return new int[]{2, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0145, code lost:
    
        if (r3.equals("YE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0b12, code lost:
    
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x015d, code lost:
    
        if (r3.equals("WS") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0542, code lost:
    
        return new int[]{3, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        if (r3.equals("WF") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x060e, code lost:
    
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0171, code lost:
    
        if (r3.equals("VU") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x072c, code lost:
    
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a5, code lost:
    
        if (r3.equals("VE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01af, code lost:
    
        if (r3.equals("VC") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b9, code lost:
    
        if (r3.equals("VA") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0bf6, code lost:
    
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01fb, code lost:
    
        if (r3.equals("UA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0ae8, code lost:
    
        return new int[]{0, 2, 1, 2, 3, 3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0221, code lost:
    
        if (r3.equals("TV") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0239, code lost:
    
        if (r3.equals("TR") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0be8, code lost:
    
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x025f, code lost:
    
        if (r3.equals("TM") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0269, code lost:
    
        if (r3.equals("TL") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0a7c, code lost:
    
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0273, code lost:
    
        if (r3.equals("TJ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x09f2, code lost:
    
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x027d, code lost:
    
        if (r3.equals("TH") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0ac2, code lost:
    
        return new int[]{0, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0295, code lost:
    
        if (r3.equals("TD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b3c, code lost:
    
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02ad, code lost:
    
        if (r3.equals("SZ") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0b99, code lost:
    
        return new int[]{4, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b7, code lost:
    
        if (r3.equals("SY") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x02c1, code lost:
    
        if (r3.equals("SX") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x02e7, code lost:
    
        if (r3.equals("SS") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08be, code lost:
    
        return new int[]{4, 3, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r3.equals("CI") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x031b, code lost:
    
        if (r3.equals("SM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0325, code lost:
    
        if (r3.equals("SL") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0b66, code lost:
    
        return new int[]{4, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x033d, code lost:
    
        if (r3.equals("SJ") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0974, code lost:
    
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0347, code lost:
    
        if (r3.equals("SI") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0b8b, code lost:
    
        return new int[]{2, 4, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0b2e, code lost:
    
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0351, code lost:
    
        if (r3.equals("SH") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0369, code lost:
    
        if (r3.equals("SE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0373, code lost:
    
        if (r3.equals("SD") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x037d, code lost:
    
        if (r3.equals("SC") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0387, code lost:
    
        if (r3.equals("SB") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03f7, code lost:
    
        if (r3.equals("PY") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x040f, code lost:
    
        if (r3.equals("PT") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0435, code lost:
    
        if (r3.equals("PM") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r3.equals("CG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0469, code lost:
    
        if (r3.equals("PG") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0698, code lost:
    
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x048f, code lost:
    
        if (r3.equals("PA") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0c12, code lost:
    
        return new int[]{2, 3, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x09c8, code lost:
    
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x04b5, code lost:
    
        if (r3.equals("NU") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x04bf, code lost:
    
        if (r3.equals("NR") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x04f3, code lost:
    
        if (r3.equals("NI") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0a8a, code lost:
    
        return new int[]{2, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x050b, code lost:
    
        if (r3.equals("NF") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0515, code lost:
    
        if (r3.equals("NE") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x051f, code lost:
    
        if (r3.equals("NC") != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x053b, code lost:
    
        if (r3.equals("MZ") != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x058f, code lost:
    
        if (r3.equals("MT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0599, code lost:
    
        if (r3.equals("MS") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05a3, code lost:
    
        if (r3.equals("MR") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0ab4, code lost:
    
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05bb, code lost:
    
        if (r3.equals("MP") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x05e5, code lost:
    
        if (r3.equals("MM") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x06b0, code lost:
    
        return new int[]{3, 2, 3, 3, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x05ef, code lost:
    
        if (r3.equals("ML") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0ada, code lost:
    
        return new int[]{3, 3, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0607, code lost:
    
        if (r3.equals("MH") != false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0615, code lost:
    
        if (r3.equals("MG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0649, code lost:
    
        if (r3.equals("MC") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x08cc, code lost:
    
        return new int[]{1, 2, 2, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0661, code lost:
    
        if (r3.equals("LY") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066b, code lost:
    
        if (r3.equals("LV") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
    
        if (r3.equals("LS") != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x069f, code lost:
    
        if (r3.equals("LR") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a00, code lost:
    
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x06a9, code lost:
    
        if (r3.equals("LK") != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x06b7, code lost:
    
        if (r3.equals("LI") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06f9, code lost:
    
        if (r3.equals("KY") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0703, code lost:
    
        if (r3.equals("KW") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0836, code lost:
    
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x071b, code lost:
    
        if (r3.equals("KN") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0725, code lost:
    
        if (r3.equals("KM") != false) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0733, code lost:
    
        if (r3.equals("KI") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0775, code lost:
    
        if (r3.equals("JO") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x078d, code lost:
    
        if (r3.equals("JE") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r3.equals("BQ") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x08da, code lost:
    
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x07a5, code lost:
    
        if (r3.equals("IS") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bda, code lost:
    
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07e7, code lost:
    
        if (r3.equals("IM") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x081b, code lost:
    
        if (r3.equals("HU") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0825, code lost:
    
        if (r3.equals("HT") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x082f, code lost:
    
        if (r3.equals("HR") != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0891, code lost:
    
        if (r3.equals("GQ") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x08b7, code lost:
    
        if (r3.equals("GM") != false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x08c5, code lost:
    
        if (r3.equals("GL") != false) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x08d3, code lost:
    
        if (r3.equals("GI") != false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x096d, code lost:
    
        if (r3.equals("FK") != false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x09b3, code lost:
    
        if (r3.equals("ER") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x09c1, code lost:
    
        if (r3.equals("EG") != false) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x09cf, code lost:
    
        if (r3.equals("EE") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x09eb, code lost:
    
        if (r3.equals("DZ") != false) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x09f9, code lost:
    
        if (r3.equals("DO") != false) goto L748;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0a07, code lost:
    
        if (r3.equals("DM") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
    
        if (r3.equals("BL") != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x0a1f, code lost:
    
        if (r3.equals("DJ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0a53, code lost:
    
        if (r3.equals("CX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0a5d, code lost:
    
        if (r3.equals("CW") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x05c2, code lost:
    
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x0a75, code lost:
    
        if (r3.equals("CU") != false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x0a83, code lost:
    
        if (r3.equals("CR") != false) goto L788;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x0aad, code lost:
    
        if (r3.equals("CM") != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0abb, code lost:
    
        if (r3.equals("CL") != false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0ac9, code lost:
    
        if (r3.equals("CK") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0bbe, code lost:
    
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0ad3, code lost:
    
        if (r3.equals("CD") != false) goto L811;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0ae1, code lost:
    
        if (r3.equals("CA") != false) goto L815;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0b0b, code lost:
    
        if (r3.equals("BI") != false) goto L827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x0b27, code lost:
    
        if (r3.equals("BG") != false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0b35, code lost:
    
        if (r3.equals("BF") != false) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x0b5f, code lost:
    
        if (r3.equals("AZ") != false) goto L851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e5, code lost:
    
        if (r3.equals("AT") != false) goto L736;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0b7b, code lost:
    
        if (r3.equals("AI") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x0b84, code lost:
    
        if (r3.equals("AG") != false) goto L862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x0b92, code lost:
    
        if (r3.equals("AF") != false) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0bae, code lost:
    
        if (r3.equals("AD") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x0bb7, code lost:
    
        if (r3.equals("BZ") != false) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x0bd3, code lost:
    
        if (r3.equals("BB") != false) goto L885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x09d6, code lost:
    
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0be1, code lost:
    
        if (r3.equals("BA") != false) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0bef, code lost:
    
        if (r3.equals("AX") != false) goto L893;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x0c0b, code lost:
    
        if (r3.equals("AM") != false) goto L901;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x010b, code lost:
    
        if (r3.equals("AQ") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x09ba, code lost:
    
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0115, code lost:
    
        if (r3.equals("ZW") != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x038e, code lost:
    
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] m(java.lang.String r3) {
        /*
            Method dump skipped, instructions count: 6672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tu5.m(java.lang.String):int[]");
    }

    @Override // com.google.android.gms.internal.ads.qu5
    public final void a(Handler handler, ou5 ou5Var) {
        ou5Var.getClass();
        this.f16380s.a(handler, ou5Var);
    }

    @Override // com.google.android.gms.internal.ads.qu5
    public final void b(ou5 ou5Var) {
        this.f16380s.b(ou5Var);
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final synchronized void i(yl3 yl3Var, cq3 cq3Var, boolean z7, int i7) {
        if (k(cq3Var, z7)) {
            this.f16384w += i7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r10.f16386y >= 524288) goto L22;
     */
    @Override // com.google.android.gms.internal.ads.kb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void l(com.google.android.gms.internal.ads.yl3 r11, com.google.android.gms.internal.ads.cq3 r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = k(r12, r13)     // Catch: java.lang.Throwable -> L6d
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f16382u     // Catch: java.lang.Throwable -> L6d
            if (r11 <= 0) goto Lf
            r11 = 1
            goto L10
        Lf:
            r11 = 0
        L10:
            com.google.android.gms.internal.ads.rx3.h(r11)     // Catch: java.lang.Throwable -> L6d
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6d
            long r0 = r10.f16383v     // Catch: java.lang.Throwable -> L6d
            long r0 = r11 - r0
            long r2 = r10.f16385x     // Catch: java.lang.Throwable -> L6d
            int r5 = (int) r0     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L6d
            long r2 = r2 + r0
            r10.f16385x = r2     // Catch: java.lang.Throwable -> L6d
            long r0 = r10.f16386y     // Catch: java.lang.Throwable -> L6d
            long r2 = r10.f16384w     // Catch: java.lang.Throwable -> L6d
            long r0 = r0 + r2
            r10.f16386y = r0     // Catch: java.lang.Throwable -> L6d
            if (r5 <= 0) goto L70
            float r13 = (float) r2     // Catch: java.lang.Throwable -> L6d
            com.google.android.gms.internal.ads.hv5 r0 = r10.f16381t     // Catch: java.lang.Throwable -> L6d
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L6d
            double r1 = java.lang.Math.sqrt(r1)     // Catch: java.lang.Throwable -> L6d
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L6d
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r13 = r13 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L6d
            float r13 = r13 / r2
            r0.b(r1, r13)     // Catch: java.lang.Throwable -> L6d
            long r1 = r10.f16385x     // Catch: java.lang.Throwable -> L6d
            r3 = 2000(0x7d0, double:9.88E-321)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L52
            long r1 = r10.f16386y     // Catch: java.lang.Throwable -> L4e
            r3 = 524288(0x80000, double:2.590327E-318)
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L5b
            goto L52
        L4e:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L79
        L52:
            r13 = 1056964608(0x3f000000, float:0.5)
            float r13 = r0.c(r13)     // Catch: java.lang.Throwable -> L6d
            long r0 = (long) r13     // Catch: java.lang.Throwable -> L6d
            r10.f16387z = r0     // Catch: java.lang.Throwable -> L6d
        L5b:
            long r6 = r10.f16384w     // Catch: java.lang.Throwable -> L6d
            long r8 = r10.f16387z     // Catch: java.lang.Throwable -> L6d
            r4 = r10
            r4.h(r5, r6, r8)     // Catch: java.lang.Throwable -> L6a
            r4.f16383v = r11     // Catch: java.lang.Throwable -> L6a
            r11 = 0
            r4.f16384w = r11     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L79
        L6d:
            r0 = move-exception
            r4 = r10
            goto L6b
        L70:
            r4 = r10
        L71:
            int r11 = r4.f16382u     // Catch: java.lang.Throwable -> L6a
            int r11 = r11 + (-1)
            r4.f16382u = r11     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r10)
            return
        L79:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tu5.l(com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.cq3, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final synchronized void p(yl3 yl3Var, cq3 cq3Var, boolean z7) {
        try {
            if (k(cq3Var, z7)) {
                if (this.f16382u == 0) {
                    this.f16383v = SystemClock.elapsedRealtime();
                }
                this.f16382u++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.qu5
    public final kb4 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void d(yl3 yl3Var, cq3 cq3Var, boolean z7) {
    }
}
