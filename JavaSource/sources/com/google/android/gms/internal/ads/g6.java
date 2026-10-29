package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class g6 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final int f8657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8658c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8659d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f8660e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8661f;

    public g6(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8657b = i7;
        this.f8658c = i8;
        this.f8659d = i9;
        this.f8660e = iArr;
        this.f8661f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g6.class == obj.getClass()) {
            g6 g6Var = (g6) obj;
            if (this.f8657b == g6Var.f8657b && this.f8658c == g6Var.f8658c && this.f8659d == g6Var.f8659d && Arrays.equals(this.f8660e, g6Var.f8660e) && Arrays.equals(this.f8661f, g6Var.f8661f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f8657b + 527) * 31) + this.f8658c) * 31) + this.f8659d) * 31) + Arrays.hashCode(this.f8660e)) * 31) + Arrays.hashCode(this.f8661f);
    }
}
