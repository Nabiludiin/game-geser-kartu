package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class wq2 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final float f18379a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18380b;

    public wq2(float f8, float f9) {
        boolean z7 = false;
        if (f8 >= -90.0f && f8 <= 90.0f && f9 >= -180.0f && f9 <= 180.0f) {
            z7 = true;
        }
        rx3.b(z7, "Invalid latitude or longitude");
        this.f18379a = f8;
        this.f18380b = f9;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wq2.class == obj.getClass()) {
            wq2 wq2Var = (wq2) obj;
            if (this.f18379a == wq2Var.f18379a && this.f18380b == wq2Var.f18380b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f18379a) + 527) * 31) + Float.floatToIntBits(this.f18380b);
    }

    public final String toString() {
        float f8 = this.f18379a;
        int length = String.valueOf(f8).length();
        float f9 = this.f18380b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f9).length());
        sb.append("xyz: latitude=");
        sb.append(f8);
        sb.append(", longitude=");
        sb.append(f9);
        return sb.toString();
    }
}
