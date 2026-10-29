package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4615b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri[] f4616c;

    /* renamed from: d, reason: collision with root package name */
    public final j9[] f4617d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f4618e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f4619f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f4620g;

    /* renamed from: h, reason: collision with root package name */
    public final kq[] f4621h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4622i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4623j;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public a(long j7) {
        this(0L, -1, -1, new int[0], new j9[0], new long[0], 0L, false, new String[0], new kq[0], false);
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f4618e;
            if (i9 >= iArr.length || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final a b(int i7) {
        int[] iArr = this.f4618e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f4619f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        j9[] j9VarArr = (j9[]) Arrays.copyOf(this.f4617d, 0);
        String[] strArr = (String[]) Arrays.copyOf(this.f4620g, 0);
        kq[] kqVarArr = this.f4621h;
        return new a(0L, 0, -1, copyOf, j9VarArr, copyOf2, 0L, false, strArr, (kq[]) Arrays.copyOf(kqVarArr, Math.max(0, kqVarArr.length)), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4615b == aVar.f4615b && Arrays.equals(this.f4617d, aVar.f4617d) && Arrays.equals(this.f4618e, aVar.f4618e) && Arrays.equals(this.f4619f, aVar.f4619f) && Arrays.equals(this.f4620g, aVar.f4620g) && Arrays.equals(this.f4621h, aVar.f4621h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f4615b * 31) - 1) * 961) + Arrays.hashCode(this.f4617d)) * 31) + Arrays.hashCode(this.f4618e)) * 31) + Arrays.hashCode(this.f4619f)) * 29791) + Arrays.hashCode(this.f4620g)) * 31) + Arrays.hashCode(this.f4621h)) * 31;
    }

    private a(long j7, int i7, int i8, int[] iArr, j9[] j9VarArr, long[] jArr, long j8, boolean z7, String[] strArr, kq[] kqVarArr, boolean z8) {
        Uri uri;
        int length = iArr.length;
        int length2 = j9VarArr.length;
        int i9 = 0;
        rx3.a(length == length2);
        rx3.a(length == kqVarArr.length);
        this.f4614a = 0L;
        this.f4615b = i7;
        this.f4618e = iArr;
        this.f4617d = j9VarArr;
        this.f4619f = jArr;
        this.f4622i = 0L;
        this.f4623j = false;
        this.f4616c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f4616c;
            if (i9 >= uriArr.length) {
                this.f4620g = strArr;
                this.f4621h = kqVarArr;
                return;
            }
            j9 j9Var = j9VarArr[i9];
            if (j9Var == null) {
                uri = null;
            } else {
                m5 m5Var = j9Var.f10399b;
                m5Var.getClass();
                uri = m5Var.f12071a;
            }
            uriArr[i9] = uri;
            i9++;
        }
    }
}
