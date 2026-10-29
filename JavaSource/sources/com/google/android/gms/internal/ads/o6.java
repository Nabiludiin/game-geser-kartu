package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o6 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final float f13203a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13204b;

    public o6(float f8, int i7) {
        this.f13203a = f8;
        this.f13204b = i7;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public /* synthetic */ void a(lb lbVar) {
        kd.a(this, lbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o6.class == obj.getClass()) {
            o6 o6Var = (o6) obj;
            if (this.f13203a == o6Var.f13203a && this.f13204b == o6Var.f13204b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f13203a) + 527) * 31) + this.f13204b;
    }

    public final String toString() {
        float f8 = this.f13203a;
        int length = String.valueOf(f8).length();
        int i7 = this.f13204b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i7).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f8);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i7);
        return sb.toString();
    }
}
