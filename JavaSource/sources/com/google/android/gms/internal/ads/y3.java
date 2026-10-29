package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19346a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19348c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19349d;

    public y3(int i7, byte[] bArr, int i8, int i9) {
        this.f19346a = i7;
        this.f19347b = bArr;
        this.f19348c = i8;
        this.f19349d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y3.class == obj.getClass()) {
            y3 y3Var = (y3) obj;
            if (this.f19346a == y3Var.f19346a && this.f19348c == y3Var.f19348c && this.f19349d == y3Var.f19349d && Arrays.equals(this.f19347b, y3Var.f19347b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f19346a * 31) + Arrays.hashCode(this.f19347b)) * 31) + this.f19348c) * 31) + this.f19349d;
    }
}
