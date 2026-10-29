package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: MyApplication */
final class yu3 extends aw3 {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f19794a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19795b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19796c;

    /* renamed from: d, reason: collision with root package name */
    private final float f19797d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19798e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19799f;

    /* synthetic */ yu3(IBinder iBinder, String str, int i7, float f8, int i8, int i9, String str2, int i10, String str3, String str4, String str5, byte[] bArr) {
        this.f19794a = iBinder;
        this.f19795b = str;
        this.f19796c = i7;
        this.f19797d = f8;
        this.f19798e = i10;
        this.f19799f = str4;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final IBinder a() {
        return this.f19794a;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final String b() {
        return this.f19795b;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final int c() {
        return this.f19796c;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final float d() {
        return this.f19797d;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aw3) {
            aw3 aw3Var = (aw3) obj;
            if (this.f19794a.equals(aw3Var.a()) && ((str = this.f19795b) != null ? str.equals(aw3Var.b()) : aw3Var.b() == null) && this.f19796c == aw3Var.c() && Float.floatToIntBits(this.f19797d) == Float.floatToIntBits(aw3Var.d())) {
                aw3Var.e();
                aw3Var.f();
                aw3Var.g();
                if (this.f19798e == aw3Var.h()) {
                    aw3Var.i();
                    String str2 = this.f19799f;
                    if (str2 != null ? str2.equals(aw3Var.j()) : aw3Var.j() == null) {
                        aw3Var.k();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final String g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final int h() {
        return this.f19798e;
    }

    public final int hashCode() {
        int hashCode = this.f19794a.hashCode() ^ 1000003;
        String str = this.f19795b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f19796c) * 1000003) ^ Float.floatToIntBits(this.f19797d);
        int i7 = this.f19798e;
        String str2 = this.f19799f;
        return ((((hashCode2 * 1525764945) ^ i7) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final String i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final String j() {
        return this.f19799f;
    }

    @Override // com.google.android.gms.internal.ads.aw3
    public final String k() {
        return null;
    }

    public final String toString() {
        String obj = this.f19794a.toString();
        int length = obj.length();
        String str = this.f19795b;
        int length2 = String.valueOf(str).length();
        int i7 = this.f19796c;
        int length3 = String.valueOf(i7).length();
        float f8 = this.f19797d;
        int length4 = String.valueOf(f8).length();
        int i8 = this.f19798e;
        int length5 = String.valueOf(i8).length();
        String str2 = this.f19799f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        sb.append("OverlayDisplayShowRequest{windowToken=");
        sb.append(obj);
        sb.append(", appId=");
        sb.append(str);
        sb.append(", layoutGravity=");
        sb.append(i7);
        sb.append(", layoutVerticalMargin=");
        sb.append(f8);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i8);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
