package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class te0 {

    /* renamed from: d, reason: collision with root package name */
    public static final te0 f16148d = new te0(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f16149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16150b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16151c;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public te0(int i7, int i8, float f8) {
        this.f16149a = i7;
        this.f16150b = i8;
        this.f16151c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof te0) {
            te0 te0Var = (te0) obj;
            if (this.f16149a == te0Var.f16149a && this.f16150b == te0Var.f16150b && this.f16151c == te0Var.f16151c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16149a + 217) * 31) + this.f16150b) * 31) + Float.floatToRawIntBits(this.f16151c);
    }
}
