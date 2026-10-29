package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: MyApplication */
final class vd implements wd {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f17557m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f17558n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final p2 f17559a;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f17560b;

    /* renamed from: c, reason: collision with root package name */
    private final zd f17561c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17562d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f17563e;

    /* renamed from: f, reason: collision with root package name */
    private final y82 f17564f;

    /* renamed from: g, reason: collision with root package name */
    private final int f17565g;

    /* renamed from: h, reason: collision with root package name */
    private final eq5 f17566h;

    /* renamed from: i, reason: collision with root package name */
    private int f17567i;

    /* renamed from: j, reason: collision with root package name */
    private long f17568j;

    /* renamed from: k, reason: collision with root package name */
    private int f17569k;

    /* renamed from: l, reason: collision with root package name */
    private long f17570l;

    public vd(p2 p2Var, a4 a4Var, zd zdVar) {
        this.f17559a = p2Var;
        this.f17560b = a4Var;
        this.f17561c = zdVar;
        int max = Math.max(1, zdVar.f20140c / 10);
        this.f17565g = max;
        y82 y82Var = new y82(zdVar.f20143f);
        y82Var.T();
        int T = y82Var.T();
        this.f17562d = T;
        int i7 = zdVar.f20139b;
        int i8 = zdVar.f20141d;
        int i9 = (((i8 - (i7 * 4)) * 8) / (zdVar.f20142e * i7)) + 1;
        if (T != i9) {
            StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 34 + String.valueOf(T).length());
            sb.append("Expected frames per block: ");
            sb.append(i9);
            sb.append("; got: ");
            sb.append(T);
            throw wi.b(sb.toString(), null);
        }
        String str = hi2.f9535a;
        int i10 = ((max + T) - 1) / T;
        this.f17563e = new byte[i8 * i10];
        this.f17564f = new y82(i10 * (T + T) * i7);
        int i11 = ((zdVar.f20140c * zdVar.f20141d) * 8) / T;
        xn5 xn5Var = new xn5();
        xn5Var.l0("audio/raw");
        xn5Var.g0(i11);
        xn5Var.h0(i11);
        xn5Var.m0((max + max) * i7);
        xn5Var.e(zdVar.f20139b);
        xn5Var.f(zdVar.f20140c);
        xn5Var.g(2);
        this.f17566h = xn5Var.m();
    }

    private final void c(int i7) {
        long Q = this.f17568j + hi2.Q(this.f17570l, 1000000L, this.f17561c.f20140c, RoundingMode.DOWN);
        int e8 = e(i7);
        this.f17560b.a(Q, 1, e8, this.f17569k - e8, null);
        this.f17570l += i7;
        this.f17569k -= e8;
    }

    private final int d(int i7) {
        int i8 = this.f17561c.f20139b;
        return i7 / (i8 + i8);
    }

    private final int e(int i7) {
        return (i7 + i7) * this.f17561c.f20139b;
    }

    @Override // com.google.android.gms.internal.ads.wd
    public final void K(long j7) {
        this.f17567i = 0;
        this.f17568j = j7;
        this.f17569k = 0;
        this.f17570l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.wd
    public final void a(int i7, long j7) {
        this.f17559a.B(new ce(this.f17561c, this.f17562d, i7, j7));
        this.f17560b.c(this.f17566h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.wd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.n2 r26, long r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vd.b(com.google.android.gms.internal.ads.n2, long):boolean");
    }
}
