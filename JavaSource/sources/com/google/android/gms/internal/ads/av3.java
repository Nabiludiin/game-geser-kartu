package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class av3 extends cw3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5305a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5306b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5307c;

    /* synthetic */ av3(int i7, String str, int i8, byte[] bArr) {
        this.f5305a = i7;
        this.f5306b = str;
        this.f5307c = i8;
    }

    @Override // com.google.android.gms.internal.ads.cw3
    public final int a() {
        return this.f5305a;
    }

    @Override // com.google.android.gms.internal.ads.cw3
    public final String b() {
        return this.f5306b;
    }

    @Override // com.google.android.gms.internal.ads.cw3
    public final int c() {
        return this.f5307c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cw3) {
            cw3 cw3Var = (cw3) obj;
            if (this.f5305a == cw3Var.a() && ((str = this.f5306b) != null ? str.equals(cw3Var.b()) : cw3Var.b() == null) && this.f5307c == cw3Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5306b;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.f5305a ^ 1000003) * 1000003)) * 1000003) ^ this.f5307c;
    }

    public final String toString() {
        int i7 = this.f5305a;
        int length = String.valueOf(i7).length();
        String str = this.f5306b;
        int length2 = String.valueOf(str).length();
        int i8 = this.f5307c;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i8).length() + 1);
        sb.append("OverlayDisplayState{statusCode=");
        sb.append(i7);
        sb.append(", sessionToken=");
        sb.append(str);
        sb.append(", uiMode=");
        sb.append(i8);
        sb.append("}");
        return sb.toString();
    }
}
