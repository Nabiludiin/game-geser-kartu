package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class g7 implements f7 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f8681a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8682b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8683c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8684d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8685e;

    private g7(long[] jArr, long[] jArr2, long j7, long j8, long j9, int i7) {
        this.f8681a = jArr;
        this.f8682b = jArr2;
        this.f8683c = j7;
        this.f8684d = j9;
        this.f8685e = i7;
    }

    public static g7 d(long j7, long j8, i3 i3Var, y82 y82Var) {
        int R;
        y82 y82Var2 = y82Var;
        y82Var2.J(6);
        int b8 = y82Var2.b();
        long j9 = i3Var.f9817c;
        long j10 = b8;
        if (y82Var2.b() <= 0) {
            return null;
        }
        long O = hi2.O((r4 * i3Var.f9821g) - 1, i3Var.f9818d);
        int S = y82Var2.S();
        int S2 = y82Var2.S();
        int S3 = y82Var2.S();
        y82Var2.J(2);
        long[] jArr = new long[S];
        long[] jArr2 = new long[S];
        int i7 = 0;
        long j11 = j8 + i3Var.f9817c;
        while (i7 < S) {
            long j12 = j9;
            jArr[i7] = (i7 * O) / S;
            jArr2[i7] = j11;
            if (S3 == 1) {
                R = y82Var2.R();
            } else if (S3 == 2) {
                R = y82Var2.S();
            } else if (S3 == 3) {
                R = y82Var2.W();
            } else {
                if (S3 != 4) {
                    return null;
                }
                R = y82Var2.h();
            }
            j11 += R * S2;
            i7++;
            y82Var2 = y82Var;
            S = S;
            j9 = j12;
        }
        long j13 = j8 + j9;
        long j14 = j13 + j10;
        if (j7 != -1 && j7 != j14) {
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 27 + String.valueOf(j14).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j7);
            sb.append(", ");
            sb.append(j14);
            gv1.c("VbriSeeker", sb.toString());
        }
        if (j14 != j11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j14).length() + 43 + String.valueOf(j11).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(j14);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append("\nSeeking will be inaccurate.");
            gv1.c("VbriSeeker", sb2.toString());
            j14 = Math.max(j14, j11);
        }
        return new g7(jArr, jArr2, O, j13, j14, i3Var.f9820f);
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f8683c;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        long[] jArr = this.f8681a;
        int J = hi2.J(jArr, j7, true, true);
        long j8 = jArr[J];
        long[] jArr2 = this.f8682b;
        r3 r3Var = new r3(j8, jArr2[J]);
        if (r3Var.f14718a >= j7 || J == jArr.length - 1) {
            return new o3(r3Var, r3Var);
        }
        int i7 = J + 1;
        return new o3(r3Var, new r3(jArr[i7], jArr2[i7]));
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long e() {
        return this.f8684d;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final int f() {
        return this.f8685e;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long g(long j7) {
        return this.f8681a[hi2.J(this.f8682b, j7, true, true)];
    }
}
