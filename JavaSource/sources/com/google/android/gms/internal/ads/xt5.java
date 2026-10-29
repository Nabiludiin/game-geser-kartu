package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: MyApplication */
public final class xt5 extends du5 implements qc5 {

    /* renamed from: k, reason: collision with root package name */
    private static final p24 f19028k = p24.c(us5.f16969q);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f19029l = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19030c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f19031d;

    /* renamed from: e, reason: collision with root package name */
    private zs5 f19032e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f19033f;

    /* renamed from: g, reason: collision with root package name */
    private lt5 f19034g;

    /* renamed from: h, reason: collision with root package name */
    private mb1 f19035h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f19036i;

    /* renamed from: j, reason: collision with root package name */
    private final gs5 f19037j;

    public xt5(Context context) {
        gs5 gs5Var = new gs5();
        zs5 zs5Var = zs5.f20336a0;
        this.f19030c = new Object();
        byte[] bArr = null;
        this.f19031d = context != null ? context.getApplicationContext() : null;
        this.f19037j = gs5Var;
        if (kc0.a(zs5Var)) {
            this.f19032e = zs5Var;
        } else {
            ys5 ys5Var = new ys5(zs5Var, bArr);
            ys5Var.G(zs5Var);
            this.f19032e = new zs5(ys5Var, bArr);
        }
        this.f19035h = mb1.f12165b;
        if (this.f19032e.T && context == null) {
            gv1.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static String n(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int o(eq5 eq5Var, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(eq5Var.f7764d)) {
            return 4;
        }
        String n7 = n(str);
        String n8 = n(eq5Var.f7764d);
        if (n8 == null || n7 == null) {
            return (z7 && n8 == null) ? 1 : 0;
        }
        if (n8.startsWith(n7) || n7.startsWith(n8)) {
            return 3;
        }
        String str2 = hi2.f9535a;
        return n8.split("-", 2)[0].equals(n7.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int r(int i7, int i8) {
        if (i7 == 0 || i7 != i8) {
            return Integer.bitCount(i7 & i8);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ int s(com.google.android.gms.internal.ads.eq5 r5, com.google.android.gms.internal.ads.w04 r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.f7763c
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.es5 r3 = (com.google.android.gms.internal.ads.es5) r3
            java.lang.String r3 = r3.f7810b
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt5.s(com.google.android.gms.internal.ads.eq5, com.google.android.gms.internal.ads.w04):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        boolean z7;
        lt5 lt5Var;
        synchronized (this.f19030c) {
            try {
                z7 = false;
                if (this.f19032e.T && Build.VERSION.SDK_INT >= 32 && (lt5Var = this.f19034g) != null && lt5Var.a()) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            i();
        }
    }

    private static void v(as5 as5Var, a50 a50Var, Map map) {
        for (int i7 = 0; i7 < as5Var.f5278a; i7++) {
            android.support.v4.media.session.b.a(a50Var.H.get(as5Var.a(i7)));
        }
    }

    private static final Pair w(int i7, cu5 cu5Var, int[][][] iArr, nt5 nt5Var, Comparator comparator) {
        RandomAccess randomAccess;
        cu5 cu5Var2 = cu5Var;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < 2) {
            if (i7 == cu5Var2.a(i8)) {
                as5 b8 = cu5Var2.b(i8);
                for (int i9 = 0; i9 < b8.f5278a; i9++) {
                    b00 a8 = b8.a(i9);
                    List a9 = nt5Var.a(i8, a8, iArr[i8][i9]);
                    int i10 = a8.f5434a;
                    boolean[] zArr = new boolean[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        int i12 = i11 + 1;
                        pt5 pt5Var = (pt5) a9.get(i11);
                        int a10 = pt5Var.a();
                        if (!zArr[i11] && a10 != 0) {
                            if (a10 == 1) {
                                randomAccess = w04.n(pt5Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pt5Var);
                                for (int i13 = i12; i13 < i10; i13++) {
                                    pt5 pt5Var2 = (pt5) a9.get(i13);
                                    if (pt5Var2.a() == 2 && pt5Var.c(pt5Var2)) {
                                        arrayList2.add(pt5Var2);
                                        zArr[i13] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i11 = i12;
                    }
                }
            }
            i8++;
            cu5Var2 = cu5Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((pt5) list.get(i14)).f14106s;
        }
        pt5 pt5Var3 = (pt5) list.get(0);
        return Pair.create(new yt5(pt5Var3.f14105r, iArr2, 0), Integer.valueOf(pt5Var3.f14104q));
    }

    @Override // com.google.android.gms.internal.ads.qc5
    public final void a(pc5 pc5Var) {
        synchronized (this.f19030c) {
            boolean z7 = this.f19032e.X;
        }
    }

    @Override // com.google.android.gms.internal.ads.gu5
    public final void b() {
        lt5 lt5Var;
        synchronized (this.f19030c) {
            try {
                Thread thread = this.f19033f;
                if (thread != null) {
                    rx3.i(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (lt5Var = this.f19034g) != null) {
            lt5Var.e();
            this.f19034g = null;
        }
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.gu5
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gu5
    public final void d(mb1 mb1Var) {
        if (this.f19035h.equals(mb1Var)) {
            return;
        }
        this.f19035h = mb1Var;
        q();
    }

    @Override // com.google.android.gms.internal.ads.du5
    protected final Pair k(cu5 cu5Var, int[][][] iArr, final int[] iArr2, xp5 xp5Var, az azVar) {
        final zs5 zs5Var;
        int i7;
        final boolean z7;
        final String str;
        final String str2;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.f19030c) {
            this.f19033f = Thread.currentThread();
            zs5Var = this.f19032e;
        }
        if (this.f19036i == null && (context3 = this.f19031d) != null) {
            this.f19036i = Boolean.valueOf(hi2.n(context3));
        }
        if (zs5Var.T && Build.VERSION.SDK_INT >= 32 && this.f19034g == null) {
            this.f19034g = new lt5(this.f19031d, this, this.f19036i);
        }
        int i8 = 2;
        yt5[] yt5VarArr = new yt5[2];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i7 = 1;
            if (i10 >= 2) {
                z7 = false;
                break;
            }
            if (cu5Var.a(i10) == 2 && cu5Var.b(i10).f5278a > 0) {
                z7 = true;
                break;
            }
            i10++;
        }
        Pair w7 = w(1, cu5Var, iArr, new nt5() { // from class: com.google.android.gms.internal.ads.qs5
            @Override // com.google.android.gms.internal.ads.nt5
            public final /* synthetic */ List a(int i11, b00 b00Var, int[] iArr4) {
                final xt5 xt5Var = xt5.this;
                final zs5 zs5Var2 = zs5Var;
                sx3 sx3Var = new sx3() { // from class: com.google.android.gms.internal.ads.ts5
                    @Override // com.google.android.gms.internal.ads.sx3
                    public final /* synthetic */ boolean d(Object obj) {
                        return xt5.this.p(zs5Var2, (eq5) obj);
                    }
                };
                int i12 = iArr2[i11];
                int i13 = w04.f17978s;
                t04 t04Var = new t04();
                for (int i14 = 0; i14 < b00Var.f5434a; i14++) {
                    t04Var.g(new ls5(i11, b00Var, i14, zs5Var2, iArr4[i14], z7, sx3Var, i12));
                }
                return t04Var.j();
            }
        }, ms5.f12410q);
        if (w7 != null) {
            yt5VarArr[((Integer) w7.second).intValue()] = (yt5) w7.first;
        }
        if (w7 == null) {
            str = null;
        } else {
            Object obj = w7.first;
            str = ((yt5) obj).f19789a.a(((yt5) obj).f19790b[0]).f7764d;
        }
        int i11 = zs5Var.f4759w.f5518a;
        final Point p7 = (!zs5Var.f4747k || (context2 = this.f19031d) == null) ? null : hi2.p(context2);
        Pair w8 = w(2, cu5Var, iArr, new nt5() { // from class: com.google.android.gms.internal.ads.vs5
            /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
            @Override // com.google.android.gms.internal.ads.nt5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.util.List a(int r18, com.google.android.gms.internal.ads.b00 r19, int[] r20) {
                /*
                    Method dump skipped, instructions count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vs5.a(int, com.google.android.gms.internal.ads.b00, int[]):java.util.List");
            }
        }, ps5.f14094q);
        int i12 = 4;
        Pair w9 = w8 == null ? w(4, cu5Var, iArr, new nt5() { // from class: com.google.android.gms.internal.ads.ss5
            @Override // com.google.android.gms.internal.ads.nt5
            public final /* synthetic */ List a(int i13, b00 b00Var, int[] iArr4) {
                int i14 = xt5.f19029l;
                int i15 = w04.f17978s;
                t04 t04Var = new t04();
                for (int i16 = 0; i16 < b00Var.f5434a; i16++) {
                    t04Var.g(new ws5(i13, b00Var, i16, zs5.this, iArr4[i16]));
                }
                return t04Var.j();
            }
        }, ns5.f12892q) : null;
        if (w9 != null) {
            yt5VarArr[((Integer) w9.second).intValue()] = (yt5) w9.first;
        } else if (w8 != null) {
            yt5VarArr[((Integer) w8.second).intValue()] = (yt5) w8.first;
        }
        if (!zs5Var.B || (context = this.f19031d) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            String str3 = hi2.f9535a;
            str2 = locale.toLanguageTag();
        }
        int i13 = 3;
        Pair w10 = w(3, cu5Var, iArr, new nt5() { // from class: com.google.android.gms.internal.ads.rs5
            @Override // com.google.android.gms.internal.ads.nt5
            public final /* synthetic */ List a(int i14, b00 b00Var, int[] iArr4) {
                int i15 = xt5.f19029l;
                int i16 = w04.f17978s;
                t04 t04Var = new t04();
                for (int i17 = 0; i17 < b00Var.f5434a; i17++) {
                    t04Var.g(new mt5(i14, b00Var, i17, zs5.this, iArr4[i17], str, str2));
                }
                return t04Var.j();
            }
        }, os5.f13474q);
        if (w10 != null) {
            yt5VarArr[((Integer) w10.second).intValue()] = (yt5) w10.first;
        }
        int i14 = 0;
        while (i14 < i8) {
            int a8 = cu5Var.a(i14);
            if (a8 != i8 && a8 != i7 && a8 != i13 && a8 != i12) {
                as5 b8 = cu5Var.b(i14);
                int[][] iArr4 = iArr[i14];
                int i15 = i9;
                int i16 = i15;
                b00 b00Var = null;
                xs5 xs5Var = null;
                while (i15 < b8.f5278a) {
                    b00 a9 = b8.a(i15);
                    int[] iArr5 = iArr4[i15];
                    xs5 xs5Var2 = xs5Var;
                    for (int i17 = i9; i17 < a9.f5434a; i17++) {
                        if (rc5.a(iArr5[i17], zs5Var.U)) {
                            xs5 xs5Var3 = new xs5(a9.a(i17), iArr5[i17]);
                            if (xs5Var2 == null || xs5Var3.compareTo(xs5Var2) > 0) {
                                b00Var = a9;
                                xs5Var2 = xs5Var3;
                                i16 = i17;
                            }
                        }
                    }
                    i15++;
                    xs5Var = xs5Var2;
                    i9 = 0;
                }
                yt5VarArr[i14] = b00Var == null ? null : new yt5(b00Var, new int[]{i16}, 0);
            }
            i14++;
            i8 = 2;
            i9 = 0;
            i13 = 3;
            i7 = 1;
            i12 = 4;
        }
        HashMap hashMap = new HashMap();
        int i18 = 2;
        for (int i19 = 0; i19 < 2; i19++) {
            v(cu5Var.b(i19), zs5Var, hashMap);
        }
        v(cu5Var.e(), zs5Var, hashMap);
        for (int i20 = 0; i20 < 2; i20++) {
            android.support.v4.media.session.b.a(hashMap.get(Integer.valueOf(cu5Var.a(i20))));
        }
        int i21 = 0;
        while (i21 < i18) {
            as5 b9 = cu5Var.b(i21);
            if (zs5Var.b(i21, b9)) {
                zs5Var.c(i21, b9);
                yt5VarArr[i21] = null;
            }
            i21++;
            i18 = 2;
        }
        int i22 = 0;
        while (i22 < i18) {
            int a10 = cu5Var.a(i22);
            if (zs5Var.a(i22) || zs5Var.I.contains(Integer.valueOf(a10))) {
                yt5VarArr[i22] = null;
            }
            i22++;
            i18 = 2;
        }
        gs5 gs5Var = this.f19037j;
        qu5 j7 = j();
        w04 e8 = hs5.e(yt5VarArr);
        int i23 = 2;
        zt5[] zt5VarArr = new zt5[2];
        int i24 = 0;
        while (i24 < i23) {
            yt5 yt5Var = yt5VarArr[i24];
            if (yt5Var != null && (length = (iArr3 = yt5Var.f19790b).length) != 0) {
                zt5VarArr[i24] = length == 1 ? new au5(yt5Var.f19789a, iArr3[0], 0, 0, null) : gs5Var.a(yt5Var.f19789a, iArr3, 0, j7, (w04) e8.get(i24));
            }
            i24++;
            i23 = 2;
        }
        tc5[] tc5VarArr = new tc5[i23];
        for (int i25 = 0; i25 < i23; i25++) {
            tc5VarArr[i25] = (zs5Var.a(i25) || zs5Var.I.contains(Integer.valueOf(cu5Var.a(i25))) || (cu5Var.a(i25) != -2 && zt5VarArr[i25] == null)) ? null : tc5.f16137b;
        }
        return Pair.create(tc5VarArr, zt5VarArr);
    }

    public final zs5 l() {
        zs5 zs5Var;
        synchronized (this.f19030c) {
            zs5Var = this.f19032e;
        }
        return zs5Var;
    }

    public final void m(ys5 ys5Var) {
        boolean equals;
        zs5 zs5Var = new zs5(ys5Var, null);
        synchronized (this.f19030c) {
            equals = this.f19032e.equals(zs5Var);
            this.f19032e = zs5Var;
        }
        if (equals) {
            return;
        }
        if (zs5Var.T && this.f19031d == null) {
            gv1.c("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        i();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r4.equals("audio/eac3") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 32) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r4 = r3.f19034g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r4.a() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r4.equals("audio/ac4") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
    
        if (r4.equals("audio/ac3") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r4.equals("audio/eac3-joc") != false) goto L31;
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
    final /* synthetic */ boolean p(com.google.android.gms.internal.ads.zs5 r4, com.google.android.gms.internal.ads.eq5 r5) {
        /*
            r3 = this;
            boolean r4 = r4.T
            r0 = 1
            if (r4 == 0) goto L83
            java.lang.Boolean r4 = r3.f19036i
            if (r4 == 0) goto L11
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            int r4 = r5.G
            r1 = -1
            if (r4 == r1) goto L83
            r1 = 2
            if (r4 <= r1) goto L83
            java.lang.String r4 = r5.f7775o
            r1 = 32
            if (r4 != 0) goto L20
            goto L5a
        L20:
            int r2 = r4.hashCode()
            switch(r2) {
                case -2123537834: goto L43;
                case 187078296: goto L3a;
                case 187078297: goto L31;
                case 1504578661: goto L28;
                default: goto L27;
            }
        L27:
            goto L5a
        L28:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L31:
            java.lang.String r2 = "audio/ac4"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L3a:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L43:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
        L4b:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L59
            com.google.android.gms.internal.ads.lt5 r4 = r3.f19034g
            if (r4 == 0) goto L59
            boolean r4 = r4.a()
            if (r4 != 0) goto L5a
        L59:
            return r0
        L5a:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            if (r4 < r1) goto L82
            com.google.android.gms.internal.ads.lt5 r4 = r3.f19034g
            if (r4 == 0) goto L82
            boolean r1 = r4.a()
            if (r1 == 0) goto L82
            boolean r4 = r4.b()
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.lt5 r4 = r3.f19034g
            boolean r4 = r4.c()
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.lt5 r4 = r3.f19034g
            com.google.android.gms.internal.ads.mb1 r1 = r3.f19035h
            boolean r4 = r4.d(r1, r5)
            if (r4 == 0) goto L82
            return r0
        L82:
            return r2
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt5.p(com.google.android.gms.internal.ads.zs5, com.google.android.gms.internal.ads.eq5):boolean");
    }

    @Override // com.google.android.gms.internal.ads.gu5
    public final qc5 e() {
        return this;
    }
}
