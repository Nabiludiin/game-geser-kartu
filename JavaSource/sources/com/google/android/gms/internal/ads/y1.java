package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class y1 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19331a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19332b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f19333c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f19334d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f19335e;

    /* renamed from: f, reason: collision with root package name */
    private final long f19336f;

    public y1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f19332b = iArr;
        this.f19333c = jArr;
        this.f19334d = jArr2;
        this.f19335e = jArr3;
        int length = iArr.length;
        this.f19331a = length;
        if (length <= 0) {
            this.f19336f = 0L;
        } else {
            int i7 = length - 1;
            this.f19336f = jArr2[i7] + jArr3[i7];
        }
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f19336f;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        long[] jArr = this.f19335e;
        int J = hi2.J(jArr, j7, true, true);
        long j8 = jArr[J];
        long[] jArr2 = this.f19333c;
        r3 r3Var = new r3(j8, jArr2[J]);
        if (r3Var.f14718a >= j7 || J == this.f19331a - 1) {
            return new o3(r3Var, r3Var);
        }
        int i7 = J + 1;
        return new o3(r3Var, new r3(jArr[i7], jArr2[i7]));
    }

    public final String toString() {
        long[] jArr = this.f19334d;
        long[] jArr2 = this.f19335e;
        long[] jArr3 = this.f19333c;
        String arrays = Arrays.toString(this.f19332b);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        int i7 = this.f19331a;
        int length = String.valueOf(i7).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i7);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
