package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class b60 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5587a;

    /* renamed from: b, reason: collision with root package name */
    private final b00 f5588b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5589c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f5590d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean[] f5591e;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public b60(b00 b00Var, boolean z7, int[] iArr, boolean[] zArr) {
        int i7 = b00Var.f5434a;
        this.f5587a = i7;
        rx3.a(i7 == iArr.length && i7 == zArr.length);
        this.f5588b = b00Var;
        this.f5589c = z7 && i7 > 1;
        this.f5590d = (int[]) iArr.clone();
        this.f5591e = (boolean[]) zArr.clone();
    }

    public final eq5 a(int i7) {
        return this.f5588b.a(i7);
    }

    public final boolean b() {
        for (boolean z7 : this.f5591e) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(int i7) {
        return this.f5591e[i7];
    }

    public final int d() {
        return this.f5588b.f5436c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b60.class == obj.getClass()) {
            b60 b60Var = (b60) obj;
            if (this.f5589c == b60Var.f5589c && this.f5588b.equals(b60Var.f5588b) && Arrays.equals(this.f5590d, b60Var.f5590d) && Arrays.equals(this.f5591e, b60Var.f5591e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f5588b.hashCode() * 31) + (this.f5589c ? 1 : 0)) * 31) + Arrays.hashCode(this.f5590d)) * 31) + Arrays.hashCode(this.f5591e);
    }
}
