package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class cv3 extends fw3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6649a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6650b;

    /* synthetic */ cv3(String str, String str2, byte[] bArr) {
        this.f6649a = str;
        this.f6650b = str2;
    }

    @Override // com.google.android.gms.internal.ads.fw3
    public final String a() {
        return this.f6649a;
    }

    @Override // com.google.android.gms.internal.ads.fw3
    public final String b() {
        return this.f6650b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fw3) {
            fw3 fw3Var = (fw3) obj;
            String str = this.f6649a;
            if (str != null ? str.equals(fw3Var.a()) : fw3Var.a() == null) {
                String str2 = this.f6650b;
                if (str2 != null ? str2.equals(fw3Var.b()) : fw3Var.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6649a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f6650b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f6649a;
        int length = String.valueOf(str).length();
        String str2 = this.f6650b;
        StringBuilder sb = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        sb.append("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(str);
        sb.append(", appId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
