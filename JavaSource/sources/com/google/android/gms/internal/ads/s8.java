package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public final p8 f15486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15487b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f15488c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f15489d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15490e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f15491f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f15492g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15493h;

    public s8(p8 p8Var, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7, int i8) {
        int length = iArr.length;
        int length2 = jArr2.length;
        rx3.a(length == length2);
        rx3.a(jArr.length == length2);
        int length3 = iArr2.length;
        rx3.a(length3 == length2);
        this.f15486a = p8Var;
        this.f15488c = jArr;
        this.f15489d = iArr;
        this.f15490e = i7;
        this.f15491f = jArr2;
        this.f15492g = iArr2;
        this.f15493h = j7;
        this.f15487b = i8;
        if (length3 > 0) {
            int i9 = length3 - 1;
            iArr2[i9] = iArr2[i9] | 536870912;
        }
    }

    public final int a(long j7) {
        for (int J = hi2.J(this.f15491f, j7, true, false); J >= 0; J--) {
            if ((this.f15492g[J] & 1) != 0) {
                return J;
            }
        }
        return -1;
    }

    public final int b(long j7) {
        long[] jArr = this.f15491f;
        for (int L = hi2.L(jArr, j7, true, false); L < jArr.length; L++) {
            if ((this.f15492g[L] & 1) != 0) {
                return L;
            }
        }
        return -1;
    }
}
