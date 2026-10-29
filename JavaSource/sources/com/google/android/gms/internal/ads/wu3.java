package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class wu3 extends ev3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18434a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18435b;

    /* synthetic */ wu3(String str, String str2, byte[] bArr) {
        this.f18434a = str;
        this.f18435b = str2;
    }

    @Override // com.google.android.gms.internal.ads.ev3
    public final String a() {
        return this.f18434a;
    }

    @Override // com.google.android.gms.internal.ads.ev3
    public final String b() {
        return this.f18435b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ev3) {
            ev3 ev3Var = (ev3) obj;
            String str = this.f18434a;
            if (str != null ? str.equals(ev3Var.a()) : ev3Var.a() == null) {
                String str2 = this.f18435b;
                if (str2 != null ? str2.equals(ev3Var.b()) : ev3Var.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18434a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f18435b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f18434a;
        int length = String.valueOf(str).length();
        String str2 = this.f18435b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
