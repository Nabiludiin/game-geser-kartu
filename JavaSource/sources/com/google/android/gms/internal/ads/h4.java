package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public final class h4 implements m2 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f9303p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f9304q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f9305r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f9306s;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f9308b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9309c;

    /* renamed from: d, reason: collision with root package name */
    private long f9310d;

    /* renamed from: e, reason: collision with root package name */
    private int f9311e;

    /* renamed from: f, reason: collision with root package name */
    private int f9312f;

    /* renamed from: h, reason: collision with root package name */
    private int f9314h;

    /* renamed from: i, reason: collision with root package name */
    private long f9315i;

    /* renamed from: j, reason: collision with root package name */
    private p2 f9316j;

    /* renamed from: k, reason: collision with root package name */
    private a4 f9317k;

    /* renamed from: l, reason: collision with root package name */
    private a4 f9318l;

    /* renamed from: m, reason: collision with root package name */
    private q3 f9319m;

    /* renamed from: n, reason: collision with root package name */
    private long f9320n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f9321o;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9307a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f9313g = -1;

    static {
        String str = hi2.f9535a;
        Charset charset = StandardCharsets.UTF_8;
        f9305r = "#!AMR\n".getBytes(charset);
        f9306s = "#!AMR-WB\n".getBytes(charset);
    }

    public h4(int i7) {
        h2 h2Var = new h2();
        this.f9308b = h2Var;
        this.f9318l = h2Var;
    }

    private final boolean a(n2 n2Var) {
        byte[] bArr = f9305r;
        if (c(n2Var, bArr)) {
            this.f9309c = false;
            n2Var.B(bArr.length);
            return true;
        }
        byte[] bArr2 = f9306s;
        if (!c(n2Var, bArr2)) {
            return false;
        }
        this.f9309c = true;
        n2Var.B(bArr2.length);
        return true;
    }

    private static boolean c(n2 n2Var, byte[] bArr) {
        n2Var.k();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        n2Var.u(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0085, B:42:0x0086, B:43:0x00a3), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x003a, B:24:0x0043, B:30:0x003f, B:40:0x005d, B:41:0x0085, B:42:0x0086, B:43:0x00a3), top: B:12:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int d(com.google.android.gms.internal.ads.n2 r12) {
        /*
            r11 = this;
            int r0 = r11.f9312f
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto La5
            java.lang.String r0 = "Invalid padding bits for frame header "
            r12.k()     // Catch: java.io.EOFException -> La4
            byte[] r4 = r11.f9307a     // Catch: java.io.EOFException -> La4
            r12.u(r4, r3, r2)     // Catch: java.io.EOFException -> La4
            r4 = r4[r3]     // Catch: java.io.EOFException -> La4
            r5 = r4 & 131(0x83, float:1.84E-43)
            r6 = 0
            if (r5 > 0) goto L86
            int r0 = r4 >> 3
            java.lang.String r4 = "Illegal AMR "
            java.lang.String r5 = " frame type "
            boolean r7 = r11.f9309c     // Catch: java.io.EOFException -> La4
            r0 = r0 & 15
            if (r7 == 0) goto L2d
            r8 = 10
            if (r0 < r8) goto L38
            r8 = 13
            if (r0 <= r8) goto L2d
            goto L38
        L2d:
            if (r7 != 0) goto L56
            r8 = 12
            if (r0 < r8) goto L38
            r8 = 14
            if (r0 > r8) goto L38
            goto L56
        L38:
            if (r7 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.h4.f9304q     // Catch: java.io.EOFException -> La4
            r0 = r4[r0]     // Catch: java.io.EOFException -> La4
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.h4.f9303p     // Catch: java.io.EOFException -> La4
            r0 = r4[r0]     // Catch: java.io.EOFException -> La4
        L43:
            r11.f9311e = r0     // Catch: java.io.EOFException -> La4
            r11.f9312f = r0
            int r4 = r11.f9313g
            if (r4 != r1) goto L4e
            r11.f9313g = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto La5
            int r4 = r11.f9314h
            int r4 = r4 + r2
            r11.f9314h = r4
            goto La5
        L56:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r7) goto L5d
            r12 = r3
        L5d:
            int r2 = r12.length()     // Catch: java.io.EOFException -> La4
            int r2 = r2 + 24
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.io.EOFException -> La4
            int r3 = r3.length()     // Catch: java.io.EOFException -> La4
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La4
            r3.<init>(r2)     // Catch: java.io.EOFException -> La4
            r3.append(r4)     // Catch: java.io.EOFException -> La4
            r3.append(r12)     // Catch: java.io.EOFException -> La4
            r3.append(r5)     // Catch: java.io.EOFException -> La4
            r3.append(r0)     // Catch: java.io.EOFException -> La4
            java.lang.String r12 = r3.toString()     // Catch: java.io.EOFException -> La4
            com.google.android.gms.internal.ads.wi r12 = com.google.android.gms.internal.ads.wi.b(r12, r6)     // Catch: java.io.EOFException -> La4
            throw r12     // Catch: java.io.EOFException -> La4
        L86:
            java.lang.String r12 = java.lang.String.valueOf(r4)     // Catch: java.io.EOFException -> La4
            int r12 = r12.length()     // Catch: java.io.EOFException -> La4
            int r12 = r12 + 38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La4
            r2.<init>(r12)     // Catch: java.io.EOFException -> La4
            r2.append(r0)     // Catch: java.io.EOFException -> La4
            r2.append(r4)     // Catch: java.io.EOFException -> La4
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> La4
            com.google.android.gms.internal.ads.wi r12 = com.google.android.gms.internal.ads.wi.b(r12, r6)     // Catch: java.io.EOFException -> La4
            throw r12     // Catch: java.io.EOFException -> La4
        La4:
            return r1
        La5:
            com.google.android.gms.internal.ads.a4 r4 = r11.f9318l
            int r12 = r4.f(r12, r0, r2)
            if (r12 != r1) goto Lae
            return r1
        Lae:
            int r0 = r11.f9312f
            int r0 = r0 - r12
            r11.f9312f = r0
            if (r0 <= 0) goto Lb6
            return r3
        Lb6:
            com.google.android.gms.internal.ads.a4 r4 = r11.f9318l
            long r5 = r11.f9310d
            int r8 = r11.f9311e
            r9 = 0
            r10 = 0
            r7 = 1
            r4.a(r5, r7, r8, r9, r10)
            long r0 = r11.f9310d
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f9310d = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h4.d(com.google.android.gms.internal.ads.n2):int");
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        this.f9310d = 0L;
        this.f9311e = 0;
        this.f9312f = 0;
        this.f9320n = j8;
        this.f9315i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        return a(n2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f9316j = p2Var;
        a4 A = p2Var.A(0, 1);
        this.f9317k = A;
        this.f9318l = A;
        p2Var.z();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int l(n2 n2Var, n3 n3Var) {
        this.f9317k.getClass();
        String str = hi2.f9535a;
        if (n2Var.o() == 0 && !a(n2Var)) {
            throw wi.b("Could not find AMR header.", null);
        }
        if (!this.f9321o) {
            this.f9321o = true;
            boolean z7 = this.f9309c;
            String str2 = true != z7 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z7 ? "audio/3gpp" : "audio/amr-wb";
            int i7 = true != z7 ? 8000 : 16000;
            int i8 = z7 ? f9304q[8] : f9303p[7];
            a4 a4Var = this.f9317k;
            xn5 xn5Var = new xn5();
            xn5Var.k0(str2);
            xn5Var.l0(str3);
            xn5Var.m0(i8);
            xn5Var.e(1);
            xn5Var.f(i7);
            a4Var.c(xn5Var.m());
        }
        int d8 = d(n2Var);
        if (this.f9319m == null) {
            p3 p3Var = new p3(-9223372036854775807L, 0L);
            this.f9319m = p3Var;
            this.f9316j.B(p3Var);
        }
        return d8 == -1 ? -1 : 0;
    }
}
