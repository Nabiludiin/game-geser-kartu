package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
public final class ye {

    /* renamed from: a, reason: collision with root package name */
    private final String f19533a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19534b;

    public ye(String str, String str2) {
        this.f19533a = str;
        this.f19534b = str2;
    }

    public final String a() {
        return this.f19533a;
    }

    public final String b() {
        return this.f19534b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye.class == obj.getClass()) {
            ye yeVar = (ye) obj;
            if (TextUtils.equals(this.f19533a, yeVar.f19533a) && TextUtils.equals(this.f19534b, yeVar.f19534b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f19533a.hashCode() * 31) + this.f19534b.hashCode();
    }

    public final String toString() {
        String str = this.f19533a;
        int length = String.valueOf(str).length();
        String str2 = this.f19534b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
