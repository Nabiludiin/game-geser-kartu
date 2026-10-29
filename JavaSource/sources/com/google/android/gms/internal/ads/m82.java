package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: MyApplication */
final class m82 extends k92 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f12125a;

    /* renamed from: b, reason: collision with root package name */
    private final u2.a0 f12126b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12127c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12128d;

    /* synthetic */ m82(Activity activity, u2.a0 a0Var, String str, String str2, byte[] bArr) {
        this.f12125a = activity;
        this.f12126b = a0Var;
        this.f12127c = str;
        this.f12128d = str2;
    }

    @Override // com.google.android.gms.internal.ads.k92
    public final Activity a() {
        return this.f12125a;
    }

    @Override // com.google.android.gms.internal.ads.k92
    public final u2.a0 b() {
        return this.f12126b;
    }

    @Override // com.google.android.gms.internal.ads.k92
    public final String c() {
        return this.f12127c;
    }

    @Override // com.google.android.gms.internal.ads.k92
    public final String d() {
        return this.f12128d;
    }

    public final boolean equals(Object obj) {
        u2.a0 a0Var;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k92) {
            k92 k92Var = (k92) obj;
            if (this.f12125a.equals(k92Var.a()) && ((a0Var = this.f12126b) != null ? a0Var.equals(k92Var.b()) : k92Var.b() == null) && ((str = this.f12127c) != null ? str.equals(k92Var.c()) : k92Var.c() == null) && ((str2 = this.f12128d) != null ? str2.equals(k92Var.d()) : k92Var.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12125a.hashCode() ^ 1000003;
        u2.a0 a0Var = this.f12126b;
        int hashCode2 = ((hashCode * 1000003) ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        String str = this.f12127c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12128d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.f12125a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f12126b);
        int length2 = valueOf.length();
        String str = this.f12127c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f12128d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb.append("OfflineUtilsParams{activity=");
        sb.append(obj);
        sb.append(", adOverlay=");
        sb.append(valueOf);
        sb.append(", gwsQueryId=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
