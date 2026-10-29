package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class b00 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5434a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5436c;

    /* renamed from: d, reason: collision with root package name */
    private final eq5[] f5437d;

    /* renamed from: e, reason: collision with root package name */
    private int f5438e;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public b00(String str, eq5... eq5VarArr) {
        int length = eq5VarArr.length;
        int i7 = 1;
        rx3.a(length > 0);
        this.f5435b = str;
        this.f5437d = eq5VarArr;
        this.f5434a = length;
        int g8 = th.g(eq5VarArr[0].f7775o);
        this.f5436c = g8 == -1 ? th.g(eq5VarArr[0].f7774n) : g8;
        String c8 = c(eq5VarArr[0].f7764d);
        int i8 = eq5VarArr[0].f7766f | 16384;
        while (true) {
            eq5[] eq5VarArr2 = this.f5437d;
            if (i7 >= eq5VarArr2.length) {
                return;
            }
            if (!c8.equals(c(eq5VarArr2[i7].f7764d))) {
                eq5[] eq5VarArr3 = this.f5437d;
                d("languages", eq5VarArr3[0].f7764d, eq5VarArr3[i7].f7764d, i7);
                return;
            } else {
                eq5[] eq5VarArr4 = this.f5437d;
                if (i8 != (eq5VarArr4[i7].f7766f | 16384)) {
                    d("role flags", Integer.toBinaryString(eq5VarArr4[0].f7766f), Integer.toBinaryString(this.f5437d[i7].f7766f), i7);
                    return;
                }
                i7++;
            }
        }
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i7) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i7).length() + 1);
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i7);
        sb.append(")");
        gv1.f("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final eq5 a(int i7) {
        return this.f5437d[i7];
    }

    public final int b(eq5 eq5Var) {
        int i7 = 0;
        while (true) {
            eq5[] eq5VarArr = this.f5437d;
            if (i7 >= eq5VarArr.length) {
                return -1;
            }
            if (eq5Var == eq5VarArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b00.class == obj.getClass()) {
            b00 b00Var = (b00) obj;
            if (this.f5435b.equals(b00Var.f5435b) && Arrays.equals(this.f5437d, b00Var.f5437d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f5438e;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = ((this.f5435b.hashCode() + 527) * 31) + Arrays.hashCode(this.f5437d);
        this.f5438e = hashCode;
        return hashCode;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f5437d);
        String str = this.f5435b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(arrays).length());
        sb.append(str);
        sb.append(": ");
        sb.append(arrays);
        return sb.toString();
    }
}
