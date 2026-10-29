package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public final class j8 implements m2 {
    public static final /* synthetic */ int B = 0;
    private l5 A;

    /* renamed from: a, reason: collision with root package name */
    private final q9 f10364a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10365b;

    /* renamed from: c, reason: collision with root package name */
    private final y82 f10366c;

    /* renamed from: d, reason: collision with root package name */
    private final y82 f10367d;

    /* renamed from: e, reason: collision with root package name */
    private final y82 f10368e;

    /* renamed from: f, reason: collision with root package name */
    private final y82 f10369f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f10370g;

    /* renamed from: h, reason: collision with root package name */
    private final n8 f10371h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10372i;

    /* renamed from: j, reason: collision with root package name */
    private w04 f10373j;

    /* renamed from: k, reason: collision with root package name */
    private int f10374k;

    /* renamed from: l, reason: collision with root package name */
    private int f10375l;

    /* renamed from: m, reason: collision with root package name */
    private long f10376m;

    /* renamed from: n, reason: collision with root package name */
    private int f10377n;

    /* renamed from: o, reason: collision with root package name */
    private y82 f10378o;

    /* renamed from: p, reason: collision with root package name */
    private int f10379p;

    /* renamed from: q, reason: collision with root package name */
    private int f10380q;

    /* renamed from: r, reason: collision with root package name */
    private int f10381r;

    /* renamed from: s, reason: collision with root package name */
    private int f10382s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10383t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10384u;

    /* renamed from: v, reason: collision with root package name */
    private long f10385v;

    /* renamed from: w, reason: collision with root package name */
    private p2 f10386w;

    /* renamed from: x, reason: collision with root package name */
    private i8[] f10387x;

    /* renamed from: y, reason: collision with root package name */
    private long[][] f10388y;

    /* renamed from: z, reason: collision with root package name */
    private int f10389z;

    public j8() {
        this(q9.f14305a, 16);
    }

    static /* synthetic */ long a(s8 s8Var, long j7, long j8) {
        int g8 = g(s8Var, j7);
        return g8 == -1 ? j8 : Math.min(s8Var.f15488c[g8], j8);
    }

    private final void d() {
        this.f10374k = 0;
        this.f10377n = 0;
    }

    private final void f(long j7) {
        le leVar;
        int i7;
        ArrayDeque arrayDeque;
        List list;
        int i8;
        long j8;
        le leVar2;
        while (true) {
            ArrayDeque arrayDeque2 = this.f10370g;
            if (arrayDeque2.isEmpty() || ((qn2) arrayDeque2.peek()).f14517b != j7) {
                break;
            }
            qn2 qn2Var = (qn2) arrayDeque2.pop();
            if (qn2Var.f15739a == 1836019574) {
                qn2 e8 = qn2Var.e(1835365473);
                new ArrayList();
                le e9 = e8 != null ? w7.e(e8) : null;
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                boolean z7 = this.f10389z == 1;
                e3 e3Var = new e3();
                ro2 d8 = qn2Var.d(1969517665);
                if (d8 != null) {
                    le c8 = w7.c(d8);
                    e3Var.a(c8);
                    leVar = c8;
                } else {
                    leVar = null;
                }
                ro2 d9 = qn2Var.d(1836476516);
                d9.getClass();
                le leVar3 = new le(-9223372036854775807L, w7.d(d9.f15139b));
                int i10 = this.f10365b;
                List b8 = w7.b(qn2Var, e3Var, -9223372036854775807L, null, 1 == (i10 & 1), z7, g8.f8694a, false);
                String a8 = f8.a(b8);
                int i11 = 0;
                int i12 = 0;
                long j9 = -9223372036854775807L;
                int i13 = -1;
                while (i11 < b8.size()) {
                    s8 s8Var = (s8) b8.get(i11);
                    int i14 = i9;
                    if (s8Var.f15487b == 0) {
                        arrayDeque = arrayDeque2;
                        i8 = i11;
                        i7 = i12;
                        list = b8;
                    } else {
                        p8 p8Var = s8Var.f15486a;
                        p2 p2Var = this.f10386w;
                        i7 = i12 + 1;
                        arrayDeque = arrayDeque2;
                        int i15 = p8Var.f13693b;
                        i8 i8Var = new i8(p8Var, s8Var, p2Var.A(i12, i15));
                        list = b8;
                        long j10 = p8Var.f13696e;
                        if (j10 == -9223372036854775807L) {
                            j10 = s8Var.f15493h;
                        }
                        i8 = i11;
                        a4 a4Var = i8Var.f9874c;
                        long max = Math.max(j9, j10);
                        eq5 eq5Var = p8Var.f13698g;
                        String str = eq5Var.f7775o;
                        int i16 = "audio/true-hd".equals(str) ? s8Var.f15490e * 16 : s8Var.f15490e + 30;
                        xn5 a9 = eq5Var.a();
                        a9.m0(i16);
                        if (i15 == 2) {
                            int i17 = eq5Var.f7766f;
                            if ((i10 & 8) != 0) {
                                i17 |= i13 == -1 ? 1 : 2;
                            }
                            a9.f0(i17);
                            i15 = 2;
                        }
                        e8.b(i15, e3Var, a9);
                        le leVar4 = eq5Var.f7772l;
                        List list2 = this.f10372i;
                        if (list2.isEmpty()) {
                            j8 = max;
                            leVar2 = null;
                        } else {
                            j8 = max;
                            leVar2 = new le(list2);
                        }
                        le[] leVarArr = new le[3];
                        leVarArr[i14] = leVar2;
                        leVarArr[1] = leVar;
                        leVarArr[2] = leVar3;
                        e8.a(i15, e9, a9, leVar4, leVarArr);
                        a9.k0(a8);
                        if (Objects.equals(str, "audio/mpeg")) {
                            i8Var.f9877f = a9.m();
                        } else {
                            a4Var.c(a9.m());
                        }
                        if (i15 == 2 && i13 == -1) {
                            i13 = arrayList.size();
                        }
                        arrayList.add(i8Var);
                        j9 = j8;
                    }
                    i11 = i8 + 1;
                    b8 = list;
                    i9 = i14;
                    i12 = i7;
                    arrayDeque2 = arrayDeque;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i18 = -1;
                i8[] i8VarArr = (i8[]) arrayList.toArray(new i8[i9]);
                this.f10387x = i8VarArr;
                int length = i8VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i19 = 0; i19 < i8VarArr.length; i19++) {
                    jArr[i19] = new long[i8VarArr[i19].f9873b.f15487b];
                    jArr2[i19] = i8VarArr[i19].f9873b.f15491f[0];
                }
                long j11 = 0;
                int i20 = 0;
                while (i20 < i8VarArr.length) {
                    long j12 = Long.MAX_VALUE;
                    int i21 = i18;
                    for (int i22 = 0; i22 < i8VarArr.length; i22++) {
                        if (!zArr[i22]) {
                            long j13 = jArr2[i22];
                            if (j13 <= j12) {
                                i21 = i22;
                                j12 = j13;
                            }
                        }
                    }
                    int i23 = iArr[i21];
                    long[] jArr3 = jArr[i21];
                    jArr3[i23] = j11;
                    s8 s8Var2 = i8VarArr[i21].f9873b;
                    i8[] i8VarArr2 = i8VarArr;
                    boolean[] zArr2 = zArr;
                    j11 += s8Var2.f15489d[i23];
                    int i24 = i23 + 1;
                    iArr[i21] = i24;
                    if (i24 < jArr3.length) {
                        jArr2[i21] = s8Var2.f15491f[i24];
                    } else {
                        zArr2[i21] = true;
                        i20++;
                    }
                    i8VarArr = i8VarArr2;
                    zArr = zArr2;
                    i18 = -1;
                }
                this.f10388y = jArr;
                this.f10386w.z();
                this.f10386w.B(new h8(j9, this.f10387x, i13));
                arrayDeque3.clear();
                this.f10374k = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((qn2) arrayDeque2.peek()).c(qn2Var);
            }
        }
        if (this.f10374k != 2) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(s8 s8Var, long j7) {
        int a8 = s8Var.a(j7);
        return a8 == -1 ? s8Var.b(j7) : a8;
    }

    private static int h(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final /* synthetic */ List b() {
        return this.f10373j;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.f10370g.clear();
        this.f10377n = 0;
        this.f10379p = -1;
        this.f10380q = 0;
        this.f10381r = 0;
        this.f10382s = 0;
        this.f10383t = false;
        if (j7 == 0) {
            if (this.f10374k != 3) {
                d();
                return;
            } else {
                this.f10371h.a();
                this.f10372i.clear();
                return;
            }
        }
        for (i8 i8Var : this.f10387x) {
            s8 s8Var = i8Var.f9873b;
            int a8 = s8Var.a(j8);
            if (a8 == -1) {
                a8 = s8Var.b(j8);
            }
            i8Var.f9876e = a8;
            b4 b4Var = i8Var.f9875d;
            if (b4Var != null) {
                b4Var.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        u3 b8 = o8.b(n2Var, (this.f10365b & 2) != 0);
        this.f10373j = b8 != null ? w04.n(b8) : w04.m();
        return b8 == null;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        if ((this.f10365b & 16) == 0) {
            p2Var = new t9(p2Var, this.f10364a);
        }
        this.f10386w = p2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x04af, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0097 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r35, com.google.android.gms.internal.ads.n3 r36) {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j8.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }

    public j8(q9 q9Var, int i7) {
        this.f10364a = q9Var;
        this.f10365b = i7;
        this.f10373j = w04.m();
        this.f10374k = (i7 & 4) != 0 ? 3 : 0;
        this.f10371h = new n8();
        this.f10372i = new ArrayList();
        this.f10369f = new y82(16);
        this.f10370g = new ArrayDeque();
        this.f10366c = new y82(p63.f13680a);
        this.f10367d = new y82(6);
        this.f10368e = new y82();
        this.f10379p = -1;
        this.f10386w = p2.f13635e;
        this.f10387x = new i8[0];
    }
}
