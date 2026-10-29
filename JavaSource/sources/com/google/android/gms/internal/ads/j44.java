package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class j44 implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    private static final j44 f10341s = new j44(new int[0], 0, 0);

    /* renamed from: q, reason: collision with root package name */
    private final int[] f10342q;

    /* renamed from: r, reason: collision with root package name */
    private final int f10343r;

    private j44(int[] iArr, int i7, int i8) {
        this.f10342q = iArr;
        this.f10343r = i8;
    }

    public static j44 a() {
        return f10341s;
    }

    public static j44 b(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        return new j44(copyOf, 0, copyOf.length);
    }

    public final int c() {
        return this.f10343r;
    }

    public final int d(int i7) {
        rx3.m(i7, this.f10343r, "index");
        return this.f10342q[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j44)) {
            return false;
        }
        j44 j44Var = (j44) obj;
        int i7 = this.f10343r;
        if (i7 != j44Var.f10343r) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (d(i8) != j44Var.d(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f10343r; i8++) {
            i7 = (i7 * 31) + this.f10342q[i8];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.f10343r;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i7 * 5);
        sb.append('[');
        int[] iArr = this.f10342q;
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < i7; i8++) {
            sb.append(", ");
            sb.append(iArr[i8]);
        }
        sb.append(']');
        return sb.toString();
    }
}
