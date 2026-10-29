package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* compiled from: MyApplication */
final class k82 extends n82 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10921a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10922b;

    /* renamed from: c, reason: collision with root package name */
    private final Drawable f10923c;

    k82(String str, String str2, Drawable drawable) {
        this.f10921a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f10922b = str2;
        this.f10923c = drawable;
    }

    @Override // com.google.android.gms.internal.ads.n82
    final String a() {
        return this.f10921a;
    }

    @Override // com.google.android.gms.internal.ads.n82
    final String b() {
        return this.f10922b;
    }

    @Override // com.google.android.gms.internal.ads.n82
    final Drawable c() {
        return this.f10923c;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n82) {
            n82 n82Var = (n82) obj;
            String str = this.f10921a;
            if (str != null ? str.equals(n82Var.a()) : n82Var.a() == null) {
                if (this.f10922b.equals(n82Var.b()) && ((drawable = this.f10923c) != null ? drawable.equals(n82Var.c()) : n82Var.c() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10921a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f10922b.hashCode();
        Drawable drawable = this.f10923c;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10923c);
        String str = this.f10921a;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.f10922b;
        StringBuilder sb = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb.append("OfflineAdAssets{advertiserName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
