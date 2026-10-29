package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: MyApplication */
public final class p extends do5 implements e0 {
    private static final int[] F1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean G1;
    private static boolean H1;
    private int A1;
    private c0 B1;
    private long C1;
    private long D1;
    private boolean E1;
    private final Context T0;
    private final boolean U0;
    private final y0 V0;
    private final boolean W0;
    private final g0 X0;
    private final d0 Y0;
    private final long Z0;

    /* renamed from: a1, reason: collision with root package name */
    private final PriorityQueue f13565a1;

    /* renamed from: b1, reason: collision with root package name */
    private o f13566b1;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f13567c1;

    /* renamed from: d1, reason: collision with root package name */
    private boolean f13568d1;

    /* renamed from: e1, reason: collision with root package name */
    private f1 f13569e1;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f13570f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f13571g1;

    /* renamed from: h1, reason: collision with root package name */
    private List f13572h1;

    /* renamed from: i1, reason: collision with root package name */
    private Surface f13573i1;

    /* renamed from: j1, reason: collision with root package name */
    private r f13574j1;

    /* renamed from: k1, reason: collision with root package name */
    private z92 f13575k1;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f13576l1;

    /* renamed from: m1, reason: collision with root package name */
    private int f13577m1;

    /* renamed from: n1, reason: collision with root package name */
    private int f13578n1;

    /* renamed from: o1, reason: collision with root package name */
    private long f13579o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f13580p1;

    /* renamed from: q1, reason: collision with root package name */
    private int f13581q1;

    /* renamed from: r1, reason: collision with root package name */
    private int f13582r1;

    /* renamed from: s1, reason: collision with root package name */
    private xc5 f13583s1;

    /* renamed from: t1, reason: collision with root package name */
    private boolean f13584t1;

    /* renamed from: u1, reason: collision with root package name */
    private long f13585u1;

    /* renamed from: v1, reason: collision with root package name */
    private int f13586v1;

    /* renamed from: w1, reason: collision with root package name */
    private long f13587w1;

    /* renamed from: x1, reason: collision with root package name */
    private te0 f13588x1;

    /* renamed from: y1, reason: collision with root package name */
    private te0 f13589y1;

    /* renamed from: z1, reason: collision with root package name */
    private int f13590z1;

    protected p(n nVar) {
        super(2, nVar.g(), nVar.f(), false, 30.0f);
        Context applicationContext = nVar.e().getApplicationContext();
        this.T0 = applicationContext;
        this.f13569e1 = null;
        this.V0 = new y0(nVar.h(), nVar.i());
        this.U0 = this.f13569e1 == null;
        this.X0 = new g0(applicationContext, this, 0L);
        this.Y0 = new d0();
        this.W0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f13575k1 = z92.f20075c;
        this.f13577m1 = 1;
        this.f13578n1 = 0;
        this.f13588x1 = te0.f16148d;
        this.A1 = 0;
        this.f13589y1 = null;
        this.f13590z1 = -1000;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.f13565a1 = new PriorityQueue();
        this.Z0 = -9223372036854775807L;
        this.f13583s1 = null;
    }

    protected static int C1(qn5 qn5Var, eq5 eq5Var) {
        int i7 = eq5Var.f7776p;
        if (i7 == -1) {
            return v1(qn5Var, eq5Var);
        }
        List list = eq5Var.f7778r;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += ((byte[]) list.get(i9)).length;
        }
        return i7 + i8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
    
        if (r1.equals("itel_S41") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:
    
        if (r1.equals("LS-5017") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        if (r1.equals("panell_d") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ca, code lost:
    
        if (r1.equals("j2xlteins") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d4, code lost:
    
        if (r1.equals("A7000plus") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01de, code lost:
    
        if (r1.equals("manning") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e8, code lost:
    
        if (r1.equals("GIONEE_WBL7519") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f2, code lost:
    
        if (r1.equals("GIONEE_WBL7365") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fc, code lost:
    
        if (r1.equals("GIONEE_WBL5708") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0206, code lost:
    
        if (r1.equals("QM16XE_U") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0210, code lost:
    
        if (r1.equals("Pixi5-10_4G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021a, code lost:
    
        if (r1.equals("TB3-850M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0224, code lost:
    
        if (r1.equals("TB3-850F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022e, code lost:
    
        if (r1.equals("TB3-730X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0238, code lost:
    
        if (r1.equals("TB3-730F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (r1.equals("A7020a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024c, code lost:
    
        if (r1.equals("A7010a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0256, code lost:
    
        if (r1.equals("griffin") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0260, code lost:
    
        if (r1.equals("marino_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026a, code lost:
    
        if (r1.equals("CPY83_I00") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0274, code lost:
    
        if (r1.equals("A2016a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027e, code lost:
    
        if (r1.equals("le_x6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0288, code lost:
    
        if (r1.equals("l5460") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0292, code lost:
    
        if (r1.equals("i9031") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029c, code lost:
    
        if (r1.equals("X3_HK") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a6, code lost:
    
        if (r1.equals("V23GB") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b0, code lost:
    
        if (r1.equals("Q4310") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ba, code lost:
    
        if (r1.equals("Q4260") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c4, code lost:
    
        if (r1.equals("PRO7S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ce, code lost:
    
        if (r1.equals("F3311") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r2.equals("machuca") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d8, code lost:
    
        if (r1.equals("F3215") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e2, code lost:
    
        if (r1.equals("F3213") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ec, code lost:
    
        if (r1.equals("F3211") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f6, code lost:
    
        if (r1.equals("F3116") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0300, code lost:
    
        if (r1.equals("F3113") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030a, code lost:
    
        if (r1.equals("F3111") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0314, code lost:
    
        if (r1.equals("E5643") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031e, code lost:
    
        if (r1.equals("A1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0328, code lost:
    
        if (r1.equals("Aura_Note_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0332, code lost:
    
        if (r1.equals("602LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033c, code lost:
    
        if (r1.equals("601LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0346, code lost:
    
        if (r1.equals("MEIZU_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0350, code lost:
    
        if (r1.equals("p212") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035a, code lost:
    
        if (r1.equals("mido") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0364, code lost:
    
        if (r1.equals("kate") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x036e, code lost:
    
        if (r1.equals("fugu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0378, code lost:
    
        if (r1.equals("XE2X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0382, code lost:
    
        if (r1.equals("Q427") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x038c, code lost:
    
        if (r1.equals("Q350") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0396, code lost:
    
        if (r1.equals("P681") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r2.equals("once") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a0, code lost:
    
        if (r1.equals("F04J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03aa, code lost:
    
        if (r1.equals("F04H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        if (r1.equals("F03H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03be, code lost:
    
        if (r1.equals("F02H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c8, code lost:
    
        if (r1.equals("F01J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03d2, code lost:
    
        if (r1.equals("F01H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03dc, code lost:
    
        if (r1.equals("1714") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e6, code lost:
    
        if (r1.equals("1713") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f0, code lost:
    
        if (r1.equals("1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03fa, code lost:
    
        if (r1.equals("flo") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r2.equals("magnolia") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0404, code lost:
    
        if (r1.equals("deb") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x040e, code lost:
    
        if (r1.equals("cv3") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0418, code lost:
    
        if (r1.equals("cv1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0422, code lost:
    
        if (r1.equals("Z80") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x042c, code lost:
    
        if (r1.equals("QX1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0436, code lost:
    
        if (r1.equals("PLE") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0440, code lost:
    
        if (r1.equals("P85") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x044a, code lost:
    
        if (r1.equals("MX6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0454, code lost:
    
        if (r1.equals("M5c") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x045e, code lost:
    
        if (r1.equals("M04") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r2.equals("aquaman") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0468, code lost:
    
        if (r1.equals("JGZ") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0472, code lost:
    
        if (r1.equals("mh") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x047c, code lost:
    
        if (r1.equals("b5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0486, code lost:
    
        if (r1.equals("V5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0490, code lost:
    
        if (r1.equals("V1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x049a, code lost:
    
        if (r1.equals("Q5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04a4, code lost:
    
        if (r1.equals("C1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04ae, code lost:
    
        if (r1.equals("woods_fn") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04b8, code lost:
    
        if (r1.equals("ELUGA_A3_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c2, code lost:
    
        if (r1.equals("Z12_PRO") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r2.equals("oneday") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04cc, code lost:
    
        if (r1.equals("BLACK-1X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d6, code lost:
    
        if (r1.equals("taido_row") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04e0, code lost:
    
        if (r1.equals("Pixi4-7_3G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04ea, code lost:
    
        if (r1.equals("GIONEE_GBL7360") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04f4, code lost:
    
        if (r1.equals("GiONEE_CBL7513") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04fe, code lost:
    
        if (r1.equals("OnePlus5T") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0508, code lost:
    
        if (r1.equals("whyred") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0512, code lost:
    
        if (r1.equals("watson") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x051c, code lost:
    
        if (r1.equals("SVP-DTV15") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0526, code lost:
    
        if (r1.equals("A7000-a") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r2.equals("dangalUHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0530, code lost:
    
        if (r1.equals("nicklaus_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x053a, code lost:
    
        if (r1.equals("tcl_eu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0544, code lost:
    
        if (r1.equals("ELUGA_Ray_X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x054e, code lost:
    
        if (r1.equals("s905x018") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0558, code lost:
    
        if (r1.equals("A10-70L") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0562, code lost:
    
        if (r1.equals("A10-70F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x056c, code lost:
    
        if (r1.equals("namath") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0576, code lost:
    
        if (r1.equals("Slate_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0580, code lost:
    
        if (r1.equals("iris60") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x058a, code lost:
    
        if (r1.equals("BRAVIA_ATV2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r2.equals("dangalFHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0594, code lost:
    
        if (r1.equals("GiONEE_GBL7319") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x059e, code lost:
    
        if (r1.equals("panell_dt") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05a8, code lost:
    
        if (r1.equals("panell_ds") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05b2, code lost:
    
        if (r1.equals("panell_dl") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05bc, code lost:
    
        if (r1.equals("vernee_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05c6, code lost:
    
        if (r1.equals("pacificrim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05d0, code lost:
    
        if (r1.equals("Phantom6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05da, code lost:
    
        if (r1.equals("ComioS1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05e4, code lost:
    
        if (r1.equals("XT1663") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05ee, code lost:
    
        if (r1.equals("RAIJIN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r2.equals("dangal") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05f8, code lost:
    
        if (r1.equals("AquaPowerM") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0601, code lost:
    
        if (r1.equals("PGN611") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x060a, code lost:
    
        if (r1.equals("PGN610") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0613, code lost:
    
        if (r1.equals("PGN528") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x061c, code lost:
    
        if (r1.equals("NX573J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0625, code lost:
    
        if (r1.equals("NX541J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x062e, code lost:
    
        if (r1.equals("CP8676_I02") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0637, code lost:
    
        if (r1.equals("K50a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0640, code lost:
    
        if (r1.equals("GIONEE_SWW1631") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0649, code lost:
    
        if (r1.equals("GIONEE_SWW1627") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0652, code lost:
    
        if (r1.equals("GIONEE_SWW1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0666, code lost:
    
        if (r2.equals("JSN-L21") == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r2.equals("AFTEUFF014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r2.equals("AFTSO001") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r2.equals("AFTEU014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r2.equals("AFTEU011") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        if (r2.equals("AFTR") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        if (r2.equals("AFTN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if (r2.equals("AFTA") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (r2.equals("AFTKMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        if (r2.equals("AFTJMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (r1.equals("HWWAS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
    
        if (r1.equals("HWVNS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        if (r1.equals("ELUGA_Prim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
    
        if (r1.equals("ELUGA_Note") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (r1.equals("ASUS_X00AD_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r1.equals("HWCAM-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r1.equals("HWBLN-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0134, code lost:
    
        if (r1.equals("DM-01K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013e, code lost:
    
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        if (r1.equals("Infinix-X572") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0152, code lost:
    
        if (r1.equals("PB2-670M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015c, code lost:
    
        if (r1.equals("santoni") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        if (r1.equals("iball8735_9806") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0170, code lost:
    
        if (r1.equals("CPH1715") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017a, code lost:
    
        if (r1.equals("CPH1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0184, code lost:
    
        if (r1.equals("woods_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018e, code lost:
    
        if (r1.equals("htc_e56ml_dtul") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0198, code lost:
    
        if (r1.equals("EverStar_S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a2, code lost:
    
        if (r1.equals("hwALE-H") != false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
    protected static final boolean G1(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p.G1(java.lang.String):boolean");
    }

    protected static final boolean H1(qn5 qn5Var) {
        return Build.VERSION.SDK_INT >= 35 && qn5Var.f14527h;
    }

    private static List I1(Context context, fo5 fo5Var, eq5 eq5Var, boolean z7, boolean z8) {
        String str = eq5Var.f7775o;
        if (str == null) {
            return w04.m();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !m.a(context)) {
            List d8 = to5.d(fo5Var, eq5Var, z7, z8);
            if (!d8.isEmpty()) {
                return d8;
            }
        }
        return to5.c(fo5Var, eq5Var, z7, z8);
    }

    private final void J1(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f13573i1 == surface) {
            if (surface != null) {
                R1();
                Surface surface2 = this.f13573i1;
                if (surface2 == null || !this.f13576l1) {
                    return;
                }
                this.V0.g(surface2);
                return;
            }
            return;
        }
        this.f13573i1 = surface;
        if (this.f13569e1 == null) {
            this.X0.d(surface);
        }
        this.f13576l1 = false;
        int c8 = c();
        nn5 j02 = j0();
        if (j02 != null && this.f13569e1 == null) {
            qn5 o02 = o0();
            o02.getClass();
            if (!N1(o02) || this.f13567c1) {
                p0();
                f0();
            } else {
                Surface O1 = O1(o02);
                if (O1 != null) {
                    j02.h(O1);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    j02.o();
                }
            }
        }
        if (surface != null) {
            R1();
        } else {
            this.f13589y1 = null;
            f1 f1Var = this.f13569e1;
            if (f1Var != null) {
                f1Var.m();
            }
        }
        if (c8 == 2) {
            f1 f1Var2 = this.f13569e1;
            if (f1Var2 != null) {
                f1Var2.x0(true);
            } else {
                this.X0.j(true);
            }
        }
    }

    private final boolean K1(wj4 wj4Var) {
        if (C() || wj4Var.d() || this.D1 == -9223372036854775807L) {
            return true;
        }
        return this.D1 - (wj4Var.f18273f - g1()) <= 100000;
    }

    private final boolean L1(wj4 wj4Var) {
        return wj4Var.f18273f < O();
    }

    private final void M1(long j7, long j8, eq5 eq5Var) {
        c0 c0Var = this.B1;
        if (c0Var != null) {
            c0Var.f(j7, j8, eq5Var, l0());
        }
    }

    private final boolean N1(qn5 qn5Var) {
        if (this.f13569e1 != null) {
            return true;
        }
        Surface surface = this.f13573i1;
        return (surface != null && surface.isValid()) || H1(qn5Var) || B1(qn5Var);
    }

    private final Surface O1(qn5 qn5Var) {
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            return f1Var.l();
        }
        Surface surface = this.f13573i1;
        if (surface != null) {
            return surface;
        }
        if (H1(qn5Var)) {
            return null;
        }
        rx3.h(B1(qn5Var));
        r rVar = this.f13574j1;
        if (rVar != null) {
            if (rVar.f14681q != qn5Var.f14525f) {
                P1();
            }
        }
        if (this.f13574j1 == null) {
            this.f13574j1 = r.f(this.T0, qn5Var.f14525f);
        }
        return this.f13574j1;
    }

    private final void P1() {
        r rVar = this.f13574j1;
        if (rVar != null) {
            rVar.release();
            this.f13574j1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public final void E1() {
        this.V0.g(this.f13573i1);
        this.f13576l1 = true;
    }

    private final void R1() {
        te0 te0Var = this.f13589y1;
        if (te0Var != null) {
            this.V0.f(te0Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v1(com.google.android.gms.internal.ads.qn5 r8, com.google.android.gms.internal.ads.eq5 r9) {
        /*
            int r0 = r9.f7782v
            int r1 = r9.f7783w
            r2 = -1
            if (r0 == r2) goto Lcc
            if (r1 != r2) goto Lb
            goto Lcc
        Lb:
            java.lang.String r3 = r9.f7775o
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/av01"
            java.lang.String r7 = "video/hevc"
            if (r4 == 0) goto L42
            int r3 = com.google.android.gms.internal.ads.to5.f16275b
            android.util.Pair r9 = com.google.android.gms.internal.ads.qe1.d(r9)
            if (r9 == 0) goto L41
            java.lang.Object r9 = r9.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r9 == r3) goto L3f
            r3 = 1
            if (r9 == r3) goto L3f
            r3 = 2
            if (r9 != r3) goto L39
            goto L3f
        L39:
            r3 = 1024(0x400, float:1.435E-42)
            if (r9 != r3) goto L41
            r3 = r6
            goto L42
        L3f:
            r3 = r5
            goto L42
        L41:
            r3 = r7
        L42:
            int r9 = r3.hashCode()
            r4 = 4
            switch(r9) {
                case -1664118616: goto Lbf;
                case -1662735862: goto Lb8;
                case -1662541442: goto La7;
                case 1187890754: goto L9e;
                case 1331836730: goto L61;
                case 1599127256: goto L58;
                case 1599127257: goto L4c;
                default: goto L4a;
            }
        L4a:
            goto Lcc
        L4c:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            r4 = 8
            goto Lc7
        L58:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        L61:
            boolean r9 = r3.equals(r5)
            if (r9 == 0) goto Lcc
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8f
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto Lcc
            java.lang.String r3 = "AFTS"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L8f
            boolean r8 = r8.f14525f
            if (r8 != 0) goto Lcc
        L8f:
            java.lang.String r8 = com.google.android.gms.internal.ads.hi2.f9535a
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r0 = r0 * r1
            int r0 = r0 * 768
            int r0 = r0 / r4
            return r0
        L9e:
            java.lang.String r8 = "video/mp4v-es"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
            goto Lc7
        La7:
            boolean r8 = r3.equals(r7)
            if (r8 == 0) goto Lcc
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r8 = 2097152(0x200000, float:2.938736E-39)
            int r8 = java.lang.Math.max(r8, r0)
            return r8
        Lb8:
            boolean r8 = r3.equals(r6)
            if (r8 == 0) goto Lcc
            goto Lc7
        Lbf:
            java.lang.String r8 = "video/3gpp"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto Lcc
        Lc7:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p.v1(com.google.android.gms.internal.ads.qn5, com.google.android.gms.internal.ads.eq5):int");
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean A0(wj4 wj4Var) {
        boolean z7 = false;
        if (K1(wj4Var)) {
            return false;
        }
        if (L1(wj4Var)) {
            if (wj4Var.e()) {
                return false;
            }
            if (wj4Var.f()) {
                wj4Var.a();
                z7 = true;
            }
            if (z7) {
                this.L0.f9714d++;
            }
        }
        return z7;
    }

    protected final void A1(nn5 nn5Var, int i7, long j7, long j8) {
        Trace.beginSection("releaseOutputBuffer");
        nn5Var.b0(i7, j8);
        Trace.endSection();
        this.L0.f9715e++;
        this.f13581q1 = 0;
        if (this.f13569e1 == null) {
            te0 te0Var = this.f13588x1;
            if (!te0Var.equals(te0.f16148d) && !te0Var.equals(this.f13589y1)) {
                this.f13589y1 = te0Var;
                this.V0.f(te0Var);
            }
            if (!this.X0.f() || this.f13573i1 == null) {
                return;
            }
            E1();
        }
    }

    protected final boolean B1(qn5 qn5Var) {
        if (G1(qn5Var.f14520a)) {
            return false;
        }
        return !qn5Var.f14525f || r.a(this.T0);
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void C0(long j7) {
        super.C0(j7);
        this.f13582r1--;
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.pc5
    public final void D(float f8, float f9) {
        super.D(f8, f9);
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            f1Var.z0(f8);
        } else {
            this.X0.n(f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e0
    public final boolean F(long j7, long j8, long j9, boolean z7, boolean z8) {
        int Z;
        if (this.f13569e1 != null && this.U0) {
            j8 -= -this.C1;
        }
        if (j7 >= -500000 || z7 || (Z = Z(j8)) == 0) {
            return false;
        }
        if (z8) {
            hv4 hv4Var = this.L0;
            int i7 = hv4Var.f9714d + Z;
            hv4Var.f9714d = i7;
            hv4Var.f9716f += this.f13582r1;
            hv4Var.f9714d = i7 + this.f13565a1.size();
        } else {
            this.L0.f9720j++;
            y1(Z + this.f13565a1.size(), this.f13582r1);
        }
        q0();
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            f1Var.v0(false);
        }
        return true;
    }

    final /* synthetic */ Surface F1() {
        return this.f13573i1;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final int H0(fo5 fo5Var, eq5 eq5Var) {
        boolean z7;
        String str = eq5Var.f7775o;
        if (!th.b(str)) {
            return 128;
        }
        Context context = this.T0;
        int i7 = 0;
        boolean z8 = eq5Var.f7779s != null;
        List I1 = I1(context, fo5Var, eq5Var, z8, false);
        if (z8 && I1.isEmpty()) {
            I1 = I1(context, fo5Var, eq5Var, false, false);
        }
        if (I1.isEmpty()) {
            return 129;
        }
        if (!do5.i1(eq5Var)) {
            return 130;
        }
        qn5 qn5Var = (qn5) I1.get(0);
        boolean c8 = qn5Var.c(eq5Var);
        if (!c8) {
            for (int i8 = 1; i8 < I1.size(); i8++) {
                qn5 qn5Var2 = (qn5) I1.get(i8);
                if (qn5Var2.c(eq5Var)) {
                    c8 = true;
                    z7 = false;
                    qn5Var = qn5Var2;
                    break;
                }
            }
        }
        z7 = true;
        int i9 = true != c8 ? 3 : 4;
        int i10 = true != qn5Var.e(eq5Var) ? 8 : 16;
        int i11 = true != qn5Var.f14526g ? 0 : 64;
        int i12 = true != z7 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !m.a(context)) {
            i12 = 256;
        }
        if (c8) {
            List I12 = I1(context, fo5Var, eq5Var, z8, true);
            if (!I12.isEmpty()) {
                qn5 qn5Var3 = (qn5) to5.e(I12, eq5Var).get(0);
                if (qn5Var3.c(eq5Var) && qn5Var3.e(eq5Var)) {
                    i7 = 32;
                }
            }
        }
        return i9 | i10 | i7 | i11 | i12;
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void I(long j7, boolean z7, boolean z8) {
        f1 f1Var = this.f13569e1;
        if (f1Var != null && !z7) {
            f1Var.v0(true);
        }
        super.I(j7, z7, z8);
        if (this.f13569e1 == null) {
            this.X0.l();
        }
        if (z7) {
            f1 f1Var2 = this.f13569e1;
            if (f1Var2 != null) {
                f1Var2.x0(false);
            } else {
                this.X0.j(false);
            }
        }
        this.f13581q1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final List I0(fo5 fo5Var, eq5 eq5Var, boolean z7) {
        return to5.e(I1(this.T0, fo5Var, eq5Var, false, false), eq5Var);
    }

    @Override // com.google.android.gms.internal.ads.gu4
    protected final void J() {
        this.f13580p1 = 0;
        this.f13579o1 = U().b();
        this.f13585u1 = 0L;
        this.f13586v1 = 0;
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            f1Var.a();
        } else {
            this.X0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.gu4
    protected final void K() {
        if (this.f13580p1 > 0) {
            long b8 = U().b();
            this.V0.d(this.f13580p1, b8 - this.f13579o1);
            this.f13580p1 = 0;
            this.f13579o1 = b8;
        }
        int i7 = this.f13586v1;
        if (i7 != 0) {
            this.V0.e(this.f13585u1, i7);
            this.f13585u1 = 0L;
            this.f13586v1 = 0;
        }
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            f1Var.b();
        } else {
            this.X0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final jn5 K0(qn5 qn5Var, eq5 eq5Var, MediaCrypto mediaCrypto, float f8) {
        int i7;
        o oVar;
        Point point;
        int i8;
        int i9;
        int i10;
        boolean z7;
        eq5[] eq5VarArr;
        char c8;
        boolean z8;
        int v12;
        eq5[] R = R();
        int length = R.length;
        int C1 = C1(qn5Var, eq5Var);
        int i11 = eq5Var.f7783w;
        int i12 = eq5Var.f7782v;
        if (length == 1) {
            if (C1 != -1 && (v12 = v1(qn5Var, eq5Var)) != -1) {
                C1 = Math.min((int) (C1 * 1.5f), v12);
            }
            oVar = new o(i12, i11, C1);
            i7 = 35;
        } else {
            int i13 = i11;
            int i14 = i12;
            int i15 = 0;
            boolean z9 = false;
            i7 = 35;
            while (i15 < length) {
                eq5 eq5Var2 = R[i15];
                w25 w25Var = eq5Var.E;
                if (w25Var != null && eq5Var2.E == null) {
                    xn5 a8 = eq5Var2.a();
                    a8.c(w25Var);
                    eq5Var2 = a8.m();
                }
                if (qn5Var.f(eq5Var, eq5Var2).f10248d != 0) {
                    int i16 = eq5Var2.f7782v;
                    c8 = 65535;
                    if (i16 != -1) {
                        eq5VarArr = R;
                        if (eq5Var2.f7783w != -1) {
                            z8 = false;
                            z9 |= z8;
                            i14 = Math.max(i14, i16);
                            i13 = Math.max(i13, eq5Var2.f7783w);
                            C1 = Math.max(C1, C1(qn5Var, eq5Var2));
                        }
                    } else {
                        eq5VarArr = R;
                    }
                    z8 = true;
                    z9 |= z8;
                    i14 = Math.max(i14, i16);
                    i13 = Math.max(i13, eq5Var2.f7783w);
                    C1 = Math.max(C1, C1(qn5Var, eq5Var2));
                } else {
                    eq5VarArr = R;
                    c8 = 65535;
                }
                i15++;
                R = eq5VarArr;
            }
            if (z9) {
                StringBuilder sb = new StringBuilder(String.valueOf(i14).length() + 44 + String.valueOf(i13).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i14);
                sb.append("x");
                sb.append(i13);
                gv1.c("MediaCodecVideoRenderer", sb.toString());
                boolean z10 = i11 > i12;
                int i17 = z10 ? i11 : i12;
                int i18 = true != z10 ? i11 : i12;
                int[] iArr = F1;
                int i19 = 0;
                while (i19 < 9) {
                    float f9 = i18;
                    float f10 = i17;
                    int i20 = iArr[i19];
                    int i21 = i19;
                    float f11 = i20;
                    if (i20 <= i17 || (i8 = (int) (f11 * (f9 / f10))) <= i18) {
                        break;
                    }
                    int i22 = i17;
                    if (true != z10) {
                        i9 = i18;
                        i10 = i20;
                    } else {
                        i9 = i18;
                        i10 = i8;
                    }
                    if (true != z10) {
                        i20 = i8;
                    }
                    point = qn5Var.i(i10, i20);
                    float f12 = eq5Var.f7786z;
                    if (point != null) {
                        z7 = z10;
                        if (qn5Var.g(point.x, point.y, f12)) {
                            break;
                        }
                    } else {
                        z7 = z10;
                    }
                    i19 = i21 + 1;
                    i17 = i22;
                    i18 = i9;
                    z10 = z7;
                }
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i13 = Math.max(i13, point.y);
                    xn5 a9 = eq5Var.a();
                    a9.s0(i14);
                    a9.t0(i13);
                    C1 = Math.max(C1, v1(qn5Var, a9.m()));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 35 + String.valueOf(i13).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i14);
                    sb2.append("x");
                    sb2.append(i13);
                    gv1.c("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            oVar = new o(i14, i13, C1);
        }
        String str = qn5Var.f14522c;
        this.f13566b1 = oVar;
        boolean z11 = this.W0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i11);
        jy1.a(mediaFormat, eq5Var.f7778r);
        float f13 = eq5Var.f7786z;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        jy1.b(mediaFormat, "rotation-degrees", eq5Var.A);
        w25 w25Var2 = eq5Var.E;
        if (w25Var2 != null) {
            jy1.b(mediaFormat, "color-transfer", w25Var2.f18006c);
            jy1.b(mediaFormat, "color-standard", w25Var2.f18004a);
            jy1.b(mediaFormat, "color-range", w25Var2.f18005b);
            byte[] bArr = w25Var2.f18007d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(eq5Var.f7775o)) {
            int i23 = to5.f16275b;
            Pair d8 = qe1.d(eq5Var);
            if (d8 != null) {
                jy1.b(mediaFormat, "profile", ((Integer) d8.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", oVar.f13114a);
        mediaFormat.setInteger("max-height", oVar.f13115b);
        jy1.b(mediaFormat, "max-input-size", oVar.f13116c);
        mediaFormat.setInteger("priority", 0);
        if (f8 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f8);
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i7) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f13590z1));
        }
        Surface O1 = O1(qn5Var);
        if (this.f13569e1 != null && !hi2.s(this.T0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return jn5.b(qn5Var, mediaFormat, eq5Var, O1, null);
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void L() {
        this.f13589y1 = null;
        this.D1 = -9223372036854775807L;
        this.f13576l1 = false;
        this.f13584t1 = true;
        try {
            super.L();
        } finally {
            y0 y0Var = this.V0;
            y0Var.i(this.L0);
            y0Var.f(te0.f16148d);
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final iw4 L0(qn5 qn5Var, eq5 eq5Var, eq5 eq5Var2) {
        int i7;
        int i8;
        iw4 f8 = qn5Var.f(eq5Var, eq5Var2);
        int i9 = f8.f10249e;
        o oVar = this.f13566b1;
        oVar.getClass();
        if (eq5Var2.f7782v > oVar.f13114a || eq5Var2.f7783w > oVar.f13115b) {
            i9 |= 256;
        }
        if (C1(qn5Var, eq5Var2) > oVar.f13116c) {
            i9 |= 64;
        }
        String str = qn5Var.f14520a;
        if (i9 != 0) {
            i8 = 0;
            i7 = i9;
        } else {
            i7 = 0;
            i8 = f8.f10248d;
        }
        return new iw4(str, eq5Var, eq5Var2, i8, i7);
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void M() {
        try {
            super.M();
        } finally {
            this.f13570f1 = false;
            this.C1 = -9223372036854775807L;
            P1();
        }
    }

    @Override // com.google.android.gms.internal.ads.gu4
    protected final void N() {
        f1 f1Var = this.f13569e1;
        if (f1Var == null || !this.U0) {
            return;
        }
        f1Var.H();
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final float N0(float f8, eq5 eq5Var, eq5[] eq5VarArr) {
        qn5 o02;
        float f9 = -1.0f;
        for (eq5 eq5Var2 : eq5VarArr) {
            float f10 = eq5Var2.f7786z;
            if (f10 != -1.0f) {
                f9 = Math.max(f9, f10);
            }
        }
        float f11 = f9 == -1.0f ? -1.0f : f9 * f8;
        if (this.f13583s1 == null || (o02 = o0()) == null) {
            return f11;
        }
        float h8 = o02.h(eq5Var.f7782v, eq5Var.f7783w);
        return f11 != -1.0f ? Math.max(f11, h8) : h8;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void O0(String str, jn5 jn5Var, long j7, long j8) {
        this.V0.b(str, j7, j8);
        this.f13567c1 = G1(str);
        qn5 o02 = o0();
        o02.getClass();
        boolean z7 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(o02.f14521b)) {
            MediaCodecInfo.CodecProfileLevel[] b8 = o02.b();
            int length = b8.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (b8[i7].profile == 16384) {
                    z7 = true;
                    break;
                }
                i7++;
            }
        }
        this.f13568d1 = z7;
    }

    @Override // com.google.android.gms.internal.ads.pc5, com.google.android.gms.internal.ads.sc5
    public final String P() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void P0(String str) {
        this.V0.h(str);
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void Q0(Exception exc) {
        gv1.f("MediaCodecVideoRenderer", "Video codec error", exc);
        this.V0.j(exc);
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final iw4 R0(hb5 hb5Var) {
        iw4 R0 = super.R0(hb5Var);
        eq5 eq5Var = hb5Var.f9416b;
        eq5Var.getClass();
        this.V0.c(eq5Var, R0);
        return R0;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void S0(eq5 eq5Var, MediaFormat mediaFormat) {
        nn5 j02 = j0();
        if (j02 != null) {
            j02.i0(this.f13577m1);
        }
        mediaFormat.getClass();
        boolean z7 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z7 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z7 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f8 = eq5Var.B;
        int i7 = eq5Var.A;
        if (i7 == 90 || i7 == 270) {
            f8 = 1.0f / f8;
            int i8 = integer2;
            integer2 = integer;
            integer = i8;
        }
        this.f13588x1 = new te0(integer, integer2, f8);
        f1 f1Var = this.f13569e1;
        if (f1Var == null || !this.E1) {
            this.X0.e(eq5Var.f7786z);
        } else {
            xn5 a8 = eq5Var.a();
            a8.s0(integer);
            a8.t0(integer2);
            a8.y0(f8);
            eq5 m7 = a8.m();
            int i9 = this.f13571g1;
            List list = this.f13572h1;
            if (list == null) {
                list = w04.m();
            }
            f1Var.F0(1, m7, h1(), i9, list);
            this.f13571g1 = 2;
        }
        this.E1 = false;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void U0() {
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            f1Var.j();
            long j7 = this.C1;
            if (j7 == -9223372036854775807L) {
                j7 = h1();
                this.C1 = j7;
            }
            this.f13569e1.H0(-j7);
        } else {
            this.X0.a(2);
        }
        this.E1 = true;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean V0(long j7, long j8, nn5 nn5Var, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, eq5 eq5Var) {
        p pVar;
        long j10;
        nn5Var.getClass();
        long g12 = j9 - g1();
        int i10 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f13565a1;
            Long l7 = (Long) priorityQueue.peek();
            if (l7 == null || l7.longValue() >= j9) {
                break;
            }
            priorityQueue.poll();
            i10++;
        }
        y1(i10, 0);
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            if (!z7 || z8) {
                return f1Var.A0(j9, new i(this, nn5Var, i7, g12));
            }
            w1(nn5Var, i7, g12);
            return true;
        }
        g0 g0Var = this.X0;
        long h12 = h1();
        d0 d0Var = this.Y0;
        int k7 = g0Var.k(j9, j7, j8, h12, z7, z8, d0Var);
        if (k7 == 0) {
            long d8 = U().d();
            M1(g12, d8, eq5Var);
            A1(nn5Var, i7, g12, d8);
            z1(d0Var.a());
            return true;
        }
        if (k7 != 1) {
            if (k7 == 2) {
                x1(nn5Var, i7, g12);
                z1(d0Var.a());
                return true;
            }
            if (k7 != 3) {
                return false;
            }
            w1(nn5Var, i7, g12);
            z1(d0Var.a());
            return true;
        }
        long b8 = d0Var.b();
        long a8 = d0Var.a();
        if (b8 == this.f13587w1) {
            w1(nn5Var, i7, g12);
            j10 = b8;
            pVar = this;
        } else {
            M1(g12, b8, eq5Var);
            A1(nn5Var, i7, g12, b8);
            pVar = this;
            j10 = b8;
        }
        pVar.z1(a8);
        pVar.f13587w1 = j10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.pc5
    public final void W() {
        f1 f1Var = this.f13569e1;
        if (f1Var == null) {
            this.X0.h();
            return;
        }
        int i7 = this.f13571g1;
        if (i7 == 0 || i7 == 1) {
            this.f13571g1 = 0;
        } else {
            f1Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void W0() {
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            f1Var.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void X0(wj4 wj4Var) {
        if (this.f13568d1) {
            ByteBuffer byteBuffer = wj4Var.f18274g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b9 = byteBuffer.get();
                byte b10 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 == -75 && s7 == 60 && s8 == 1 && b9 == 4) {
                    if (b10 == 0 || b10 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        nn5 j02 = j0();
                        j02.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        j02.X(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void d0(boolean z7, boolean z8) {
        super.d0(z7, z8);
        S();
        this.V0.a(this.L0);
        if (!this.f13570f1) {
            if (this.f13572h1 != null && this.f13569e1 == null) {
                t tVar = new t(this.T0, this.X0);
                tVar.a(true);
                long j7 = this.Z0;
                tVar.c(j7 != -9223372036854775807L ? -j7 : -9223372036854775807L);
                tVar.b(U());
                b0 d8 = tVar.d();
                d8.d(1);
                this.f13569e1 = d8.e(0);
            }
            this.f13570f1 = true;
        }
        int i7 = !z8 ? 1 : 0;
        f1 f1Var = this.f13569e1;
        if (f1Var == null) {
            g0 g0Var = this.X0;
            g0Var.g(U());
            g0Var.a(i7);
            return;
        }
        f1Var.B0(new h(this), g74.a());
        c0 c0Var = this.B1;
        if (c0Var != null) {
            this.f13569e1.D0(c0Var);
        }
        if (this.f13573i1 != null && !this.f13575k1.equals(z92.f20075c)) {
            this.f13569e1.G0(this.f13573i1, this.f13575k1);
        }
        this.f13569e1.w0(this.f13578n1);
        this.f13569e1.z0(E0());
        List list = this.f13572h1;
        if (list != null) {
            this.f13569e1.E0(list);
        }
        this.f13571g1 = i7;
        e1();
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.pc5
    public final void e(long j7, long j8) {
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            try {
                f1Var.C0(j7, j8);
            } catch (e1 e8) {
                throw X(e8, e8.f7385q, false, 7001);
            }
        }
        super.e(j7, j8);
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4
    protected final void e0(eq5[] eq5VarArr, long j7, long j8, xp5 xp5Var) {
        super.e0(eq5VarArr, j7, j8, xp5Var);
        az V = V();
        if (V.g()) {
            this.D1 = -9223372036854775807L;
        } else {
            this.D1 = V.o(xp5Var.f18924a, new ot()).f13478d;
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean h0(qn5 qn5Var) {
        return N1(qn5Var);
    }

    @Override // com.google.android.gms.internal.ads.pc5
    public final boolean m0() {
        boolean D0 = D0();
        f1 f1Var = this.f13569e1;
        if (f1Var != null) {
            return f1Var.o0(D0);
        }
        if (D0 && j0() == null) {
            return true;
        }
        return this.X0.i(D0);
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.pc5
    public final boolean n0() {
        if (!super.n0()) {
            return false;
        }
        f1 f1Var = this.f13569e1;
        return f1Var == null || f1Var.i();
    }

    @Override // com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.pc5
    public final boolean q(long j7) {
        long B0 = B0();
        return B0 == -9223372036854775807L || j7 > B0 - g1();
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean r0() {
        qn5 o02 = o0();
        if (this.f13569e1 != null && o02 != null) {
            String str = o02.f14520a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.r0();
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean s0() {
        boolean z7;
        eq5 k02 = k0();
        long j7 = this.D1;
        if (j7 != -9223372036854775807L) {
            if (t0() + j7 + 1 <= Long.MAX_VALUE - (g1() + this.D1)) {
                z7 = false;
                return this.f13583s1 == null || this.f13584t1 || (k02 != null && k02.f7777q > 0) || z7 || f1() != -9223372036854775807L;
            }
        }
        z7 = true;
        if (this.f13583s1 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void u0() {
        super.u0();
        this.f13565a1.clear();
        this.f13582r1 = 0;
        this.f13584t1 = false;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final pn5 w0(Throwable th, qn5 qn5Var) {
        return new g(th, qn5Var, this.f13573i1);
    }

    protected final void w1(nn5 nn5Var, int i7, long j7) {
        Trace.beginSection("skipVideoBuffer");
        nn5Var.e(i7, false);
        Trace.endSection();
        this.L0.f9716f++;
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final boolean x0(eq5 eq5Var) {
        f1 f1Var = this.f13569e1;
        if (f1Var == null || f1Var.c()) {
            return true;
        }
        try {
            f1Var.y0(eq5Var);
            return true;
        } catch (e1 e8) {
            throw X(e8, eq5Var, false, 7000);
        }
    }

    protected final void x1(nn5 nn5Var, int i7, long j7) {
        Trace.beginSection("dropVideoBuffer");
        nn5Var.e(i7, false);
        Trace.endSection();
        y1(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.do5, com.google.android.gms.internal.ads.gu4, com.google.android.gms.internal.ads.jc5
    public final void y(int i7, Object obj) {
        if (i7 == 1) {
            J1(obj);
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            c0 c0Var = (c0) obj;
            this.B1 = c0Var;
            f1 f1Var = this.f13569e1;
            if (f1Var != null) {
                f1Var.D0(c0Var);
                return;
            }
            return;
        }
        if (i7 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.A1 != intValue) {
                this.A1 = intValue;
                return;
            }
            return;
        }
        if (i7 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f13577m1 = intValue2;
            nn5 j02 = j0();
            if (j02 != null) {
                j02.i0(intValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f13578n1 = intValue3;
            f1 f1Var2 = this.f13569e1;
            if (f1Var2 != null) {
                f1Var2.w0(intValue3);
                return;
            } else {
                this.X0.m(intValue3);
                return;
            }
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(ab0.f4856a)) {
                f1 f1Var3 = this.f13569e1;
                if (f1Var3 == null || !f1Var3.c()) {
                    return;
                }
                f1Var3.e();
                return;
            }
            this.f13572h1 = list;
            f1 f1Var4 = this.f13569e1;
            if (f1Var4 != null) {
                f1Var4.E0(list);
                return;
            }
            return;
        }
        if (i7 == 14) {
            obj.getClass();
            z92 z92Var = (z92) obj;
            if (z92Var.a() == 0 || z92Var.b() == 0) {
                return;
            }
            this.f13575k1 = z92Var;
            f1 f1Var5 = this.f13569e1;
            if (f1Var5 != null) {
                Surface surface = this.f13573i1;
                surface.getClass();
                f1Var5.G0(surface, z92Var);
                return;
            }
            return;
        }
        switch (i7) {
            case 16:
                obj.getClass();
                this.f13590z1 = ((Integer) obj).intValue();
                nn5 j03 = j0();
                if (j03 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f13590z1));
                    j03.X(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f13573i1;
                J1(null);
                obj.getClass();
                ((p) obj).y(1, surface2);
                break;
            case 18:
                boolean z7 = this.f13583s1 != null;
                xc5 xc5Var = (xc5) obj;
                this.f13583s1 = xc5Var;
                if (z7 != (xc5Var != null)) {
                    G0();
                    break;
                }
                break;
            default:
                super.y(i7, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final void y0(wj4 wj4Var) {
        int z02 = z0(wj4Var);
        if (Build.VERSION.SDK_INT < 34 || (z02 & 32) == 0) {
            this.f13582r1++;
        }
    }

    protected final void y1(int i7, int i8) {
        hv4 hv4Var = this.L0;
        hv4Var.f9718h += i7;
        int i9 = i7 + i8;
        hv4Var.f9717g += i9;
        this.f13580p1 += i9;
        int i10 = this.f13581q1 + i9;
        this.f13581q1 = i10;
        hv4Var.f9719i = Math.max(i10, hv4Var.f9719i);
    }

    @Override // com.google.android.gms.internal.ads.do5
    protected final int z0(wj4 wj4Var) {
        return (Build.VERSION.SDK_INT < 34 || this.f13583s1 == null || !L1(wj4Var) || K1(wj4Var)) ? 0 : 32;
    }

    protected final void z1(long j7) {
        hv4 hv4Var = this.L0;
        hv4Var.f9721k += j7;
        hv4Var.f9722l++;
        this.f13585u1 += j7;
        this.f13586v1++;
    }
}
