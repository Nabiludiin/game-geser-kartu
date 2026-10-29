package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class c8 implements m2 {
    private static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final eq5 M;
    private b8 A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean J;

    /* renamed from: a, reason: collision with root package name */
    private final q9 f6285a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6286b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6287c;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f6292h;

    /* renamed from: i, reason: collision with root package name */
    private final y82 f6293i;

    /* renamed from: q, reason: collision with root package name */
    private int f6301q;

    /* renamed from: r, reason: collision with root package name */
    private int f6302r;

    /* renamed from: s, reason: collision with root package name */
    private long f6303s;

    /* renamed from: t, reason: collision with root package name */
    private int f6304t;

    /* renamed from: u, reason: collision with root package name */
    private y82 f6305u;

    /* renamed from: v, reason: collision with root package name */
    private long f6306v;

    /* renamed from: w, reason: collision with root package name */
    private int f6307w;

    /* renamed from: j, reason: collision with root package name */
    private final p5 f6294j = new p5();

    /* renamed from: k, reason: collision with root package name */
    private final y82 f6295k = new y82(16);

    /* renamed from: e, reason: collision with root package name */
    private final y82 f6289e = new y82(p63.f13680a);

    /* renamed from: f, reason: collision with root package name */
    private final y82 f6290f = new y82(6);

    /* renamed from: g, reason: collision with root package name */
    private final y82 f6291g = new y82();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayDeque f6296l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque f6297m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray f6288d = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    private w04 f6300p = w04.m();

    /* renamed from: y, reason: collision with root package name */
    private long f6309y = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    private long f6308x = -9223372036854775807L;

    /* renamed from: z, reason: collision with root package name */
    private long f6310z = -9223372036854775807L;
    private p2 G = p2.f13635e;
    private a4[] H = new a4[0];
    private a4[] I = new a4[0];

    /* renamed from: n, reason: collision with root package name */
    private final sa3 f6298n = new sa3(new s93() { // from class: com.google.android.gms.internal.ads.z7
        @Override // com.google.android.gms.internal.ads.s93
        public final /* synthetic */ void a(long j7, y82 y82Var) {
            c8.this.a(j7, y82Var);
        }
    });

    /* renamed from: o, reason: collision with root package name */
    private final z1 f6299o = new z1();
    private long K = -1;

    static {
        xn5 xn5Var = new xn5();
        xn5Var.l0("application/x-emsg");
        M = xn5Var.m();
    }

    public c8(q9 q9Var, int i7, ef2 ef2Var, p8 p8Var, List list, a4 a4Var) {
        this.f6285a = q9Var;
        this.f6286b = i7;
        this.f6287c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f6292h = bArr;
        this.f6293i = new y82(bArr);
    }

    private final void c() {
        this.f6301q = 0;
        this.f6304t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d3, code lost:
    
        if ((com.google.android.gms.internal.ads.hi2.Q(r42, 1000000, r13, r48) + com.google.android.gms.internal.ads.hi2.Q(r2[0], 1000000, r5.f13694c, r48)) < r5.f13696e) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x076f, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0772, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(long r58) {
        /*
            Method dump skipped, instructions count: 1907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.d(long):void");
    }

    private static int f(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i7);
        throw wi.b(sb.toString(), null);
    }

    private static void g(y82 y82Var, int i7, r8 r8Var) {
        y82Var.G(i7 + 8);
        int b8 = y82Var.b();
        int i8 = w7.f18095b;
        if ((b8 & 1) != 0) {
            throw wi.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (b8 & 2) != 0;
        int h8 = y82Var.h();
        if (h8 == 0) {
            Arrays.fill(r8Var.f14781l, 0, r8Var.f14774e, false);
            return;
        }
        int i9 = r8Var.f14774e;
        if (h8 != i9) {
            StringBuilder sb = new StringBuilder(String.valueOf(h8).length() + 58 + String.valueOf(i9).length());
            sb.append("Senc sample count ");
            sb.append(h8);
            sb.append(" is different from fragment sample count");
            sb.append(i9);
            throw wi.b(sb.toString(), null);
        }
        Arrays.fill(r8Var.f14781l, 0, h8, z7);
        r8Var.a(y82Var.C());
        y82 y82Var2 = r8Var.f14783n;
        y82Var.L(y82Var2.H(), 0, y82Var2.D());
        y82Var2.G(0);
        r8Var.f14784o = false;
    }

    private static Pair h(y82 y82Var, long j7) {
        long j8;
        long j9;
        y82 y82Var2 = y82Var;
        y82Var2.G(8);
        int a8 = w7.a(y82Var2.b());
        y82Var2.J(4);
        long Y = y82Var2.Y();
        if (a8 == 0) {
            j8 = y82Var2.Y();
            j9 = y82Var2.Y();
        } else {
            j8 = y82Var2.j();
            j9 = y82Var2.j();
        }
        long j10 = j7 + j9;
        long Q = hi2.Q(j8, 1000000L, Y, RoundingMode.DOWN);
        y82Var2.J(2);
        int S = y82Var2.S();
        int[] iArr = new int[S];
        long[] jArr = new long[S];
        long[] jArr2 = new long[S];
        long[] jArr3 = new long[S];
        long j11 = j10;
        long j12 = Q;
        int i7 = 0;
        while (i7 < S) {
            int b8 = y82Var2.b();
            if ((Integer.MIN_VALUE & b8) != 0) {
                throw wi.b("Unhandled indirect reference", null);
            }
            long Y2 = y82Var2.Y();
            iArr[i7] = b8 & Integer.MAX_VALUE;
            jArr[i7] = j11;
            jArr3[i7] = j12;
            j8 += Y2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long Q2 = hi2.Q(j8, 1000000L, Y, RoundingMode.DOWN);
            jArr4[i7] = Q2 - jArr5[i7];
            y82Var2.J(4);
            j11 += iArr[i7];
            i7++;
            y82Var2 = y82Var;
            S = S;
            j12 = Q2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(Q), new y1(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.uj5 m(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.m(java.util.List):com.google.android.gms.internal.ads.uj5");
    }

    private static final x7 n(SparseArray sparseArray, int i7) {
        if (sparseArray.size() == 1) {
            return (x7) sparseArray.valueAt(0);
        }
        x7 x7Var = (x7) sparseArray.get(i7);
        x7Var.getClass();
        return x7Var;
    }

    final /* synthetic */ void a(long j7, y82 y82Var) {
        x1.a(j7, y82Var, this.I);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final /* synthetic */ List b() {
        return this.f6300p;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        SparseArray sparseArray = this.f6288d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((b8) sparseArray.valueAt(i7)).c();
        }
        this.f6297m.clear();
        this.f6307w = 0;
        this.f6298n.d();
        this.f6308x = j8;
        this.f6296l.clear();
        c();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        u3 a8 = o8.a(n2Var);
        this.f6300p = a8 != null ? w04.n(a8) : w04.m();
        return a8 == null;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        int i7;
        int i8 = this.f6286b;
        if ((i8 & 32) == 0) {
            p2Var = new t9(p2Var, this.f6285a);
        }
        this.G = p2Var;
        c();
        a4[] a4VarArr = new a4[2];
        this.H = a4VarArr;
        int i9 = 100;
        int i10 = 0;
        if ((i8 & 4) != 0) {
            a4VarArr[0] = this.G.A(100, 5);
            i7 = 1;
            i9 = 101;
        } else {
            i7 = 0;
        }
        a4[] a4VarArr2 = (a4[]) hi2.y(this.H, i7);
        this.H = a4VarArr2;
        for (a4 a4Var : a4VarArr2) {
            a4Var.c(M);
        }
        List list = this.f6287c;
        this.I = new a4[list.size()];
        while (i10 < this.I.length) {
            a4 A = this.G.A(i9, 3);
            A.c((eq5) list.get(i10));
            this.I[i10] = A;
            i10++;
            i9++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x009c, code lost:
    
        r10 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x00a4, code lost:
    
        if (r31.f6301q != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x00a6, code lost:
    
        r31.B = r2.f();
        r3 = r2.f5612d.f15486a.f13698g.f7775o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x00b8, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00ba, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00bd, code lost:
    
        r31.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00c3, code lost:
    
        if (r2.f5614f >= r2.f5617i) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x00c5, code lost:
    
        r32.B(r31.B);
        r1 = r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00ce, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00d1, code lost:
    
        r3 = r2.f5610b;
        r6 = r3.f14783n;
        r1 = r1.f14289d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x00d7, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00d9, code lost:
    
        r6.J(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x00e2, code lost:
    
        if (r3.b(r2.f5614f) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x00e4, code lost:
    
        r6.J(r6.S() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00f0, code lost:
    
        if (r2.h() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00f2, code lost:
    
        r31.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0336, code lost:
    
        r31.f6301q = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x033a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x00fd, code lost:
    
        if (r2.f5612d.f15486a.f13699h != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x00ff, code lost:
    
        r31.B -= 8;
        r32.B(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.f5612d.f15486a.f13698g.f7775o) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0118, code lost:
    
        r31.C = r2.i(r31.B, 7);
        r3 = r31.B;
        r12 = r31.f6293i;
        com.google.android.gms.internal.ads.n1.c(r3, r12);
        r2.f5609a.e(r12, 7);
        r3 = r31.C + 7;
        r31.C = r3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x013d, code lost:
    
        r31.B += r3;
        r31.f6301q = 4;
        r31.D = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0134, code lost:
    
        r8 = 0;
        r3 = r2.i(r31.B, 0);
        r31.C = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0146, code lost:
    
        r3 = r2.f5612d.f15486a;
        r8 = r2.f5609a;
        r12 = r2.d();
        r14 = r3.f13702k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0152, code lost:
    
        if (r14 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0154, code lost:
    
        r3 = r31.C;
        r5 = r31.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0158, code lost:
    
        if (r3 >= r5) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x015a, code lost:
    
        r31.C += r8.f(r32, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0166, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x02d5, code lost:
    
        r1 = r28.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x02db, code lost:
    
        if (r31.E != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x02dd, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x02e0, code lost:
    
        r22 = r1;
        r1 = r28.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x02e6, code lost:
    
        if (r1 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x02e8, code lost:
    
        r25 = r1.f14288c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x02ef, code lost:
    
        r8.a(r12, r22, r31.B, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x02fc, code lost:
    
        r1 = r31.f6297m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0302, code lost:
    
        if (r1.isEmpty() != false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0304, code lost:
    
        r1 = (com.google.android.gms.internal.ads.a8) r1.removeFirst();
        r2 = r31.f6307w;
        r7 = r1.f4791c;
        r31.f6307w = r2 - r7;
        r2 = r1.f4789a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0315, code lost:
    
        if (r1.f4790b == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0317, code lost:
    
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0319, code lost:
    
        r4 = r2;
        r1 = r31.H;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x031e, code lost:
    
        if (r10 >= r2) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0320, code lost:
    
        r1[r10].a(r4, 1, r7, r31.f6307w, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0330, code lost:
    
        if (r28.h() != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0332, code lost:
    
        r31.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0335, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x02ed, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x016a, code lost:
    
        r15 = r31.f6290f;
        r4 = r15.H();
        r4[0] = 0;
        r4[1] = 0;
        r4[r17] = 0;
        r7 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0180, code lost:
    
        if (r31.C >= r31.B) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0182, code lost:
    
        r5 = r31.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0184, code lost:
    
        if (r5 != 0) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0189, code lost:
    
        if (r31.I.length > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x018d, code lost:
    
        if (r31.E != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0190, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0192, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01a6, code lost:
    
        r32.s(r4, r7, r14 + r5);
        r15.G(0);
        r9 = r15.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01b3, code lost:
    
        if (r9 < 0) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01b5, code lost:
    
        r31.D = r9 - r5;
        r9 = r31.f6289e;
        r9.G(0);
        r8.e(r9, 4);
        r31.C += 4;
        r31.B += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01ce, code lost:
    
        if (r31.I.length <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01d0, code lost:
    
        if (r5 <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01d2, code lost:
    
        r9 = r3.f13698g;
        r11 = r4[4];
        r2 = com.google.android.gms.internal.ads.p63.f13680a;
        r2 = r9.f7775o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01de, code lost:
    
        if (java.util.Objects.equals(r2, r10) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x01e0, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01e8, code lost:
    
        if (com.google.android.gms.internal.ads.th.e(r9.f7771k, r10) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x01eb, code lost:
    
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01fc, code lost:
    
        if (java.util.Objects.equals(r2, "video/hevc") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0204, code lost:
    
        if (com.google.android.gms.internal.ads.th.e(r9.f7771k, "video/hevc") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0207, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x021a, code lost:
    
        r31.F = r2;
        r8.e(r15, r5);
        r31.C += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0224, code lost:
    
        if (r5 <= 0) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0228, code lost:
    
        if (r31.E != false) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0231, code lost:
    
        if (com.google.android.gms.internal.ads.p63.c(r4, 4, r5, r3.f13698g) == false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0241, code lost:
    
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0249, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0233, code lost:
    
        r31.E = r19;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x020f, code lost:
    
        if (((r11 & 126) >> 1) != 39) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0211, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x01f1, code lost:
    
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x01f6, code lost:
    
        if ((r11 & 31) == 6) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x01ef, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0214, code lost:
    
        r17 = r7;
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0254, code lost:
    
        throw com.google.android.gms.internal.ads.wi.b("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0194, code lost:
    
        r5 = com.google.android.gms.internal.ads.p63.b(r3.f13698g);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x01a3, code lost:
    
        if ((r14 + r5) <= (r31.B - r31.C)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0255, code lost:
    
        r28 = r2;
        r17 = r7;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x025e, code lost:
    
        if (r31.F == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0260, code lost:
    
        r2 = r31.f6291g;
        r2.z(r5);
        r32.s(r2.H(), 0, r31.D);
        r8.e(r2, r31.D);
        r5 = r31.D;
        r7 = com.google.android.gms.internal.ads.p63.a(r2.H(), r2.D());
        r2.G(0);
        r2.E(r7);
        r7 = r3.f13698g.f7777q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x028d, code lost:
    
        if (r7 != (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x028f, code lost:
    
        r7 = r31.f6298n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0295, code lost:
    
        if (r7.b() == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0297, code lost:
    
        r7.a(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x02a6, code lost:
    
        r7 = r31.f6298n;
        r7.c(r12, r2);
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02b3, code lost:
    
        if ((r28.g() & 4) == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x02b5, code lost:
    
        r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02c0, code lost:
    
        r31.C += r5;
        r31.D -= r5;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x029b, code lost:
    
        r9 = r31.f6298n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02a1, code lost:
    
        if (r9.b() == r7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x02a3, code lost:
    
        r9.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x02b9, code lost:
    
        r20 = 4;
        r5 = r8.f(r32, r5, false);
     */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r32, com.google.android.gms.internal.ads.n3 r33) {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c8.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }
}
