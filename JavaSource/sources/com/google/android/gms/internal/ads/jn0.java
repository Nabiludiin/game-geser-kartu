package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class jn0 {

    /* renamed from: e, reason: collision with root package name */
    public static final jn0 f10652e = new jn0(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f10653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10656d;

    public jn0(int i7, int i8, int i9) {
        this.f10653a = i7;
        this.f10654b = i8;
        this.f10655c = i9;
        this.f10656d = hi2.a(i9) ? hi2.e(i9) * i8 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0)) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        return this.f10653a == jn0Var.f10653a && this.f10654b == jn0Var.f10654b && this.f10655c == jn0Var.f10655c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10653a), Integer.valueOf(this.f10654b), Integer.valueOf(this.f10655c));
    }

    public final String toString() {
        int i7 = this.f10653a;
        int length = String.valueOf(i7).length();
        int i8 = this.f10654b;
        int length2 = String.valueOf(i8).length();
        int i9 = this.f10655c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i9).length() + 1);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i7);
        sb.append(", channelCount=");
        sb.append(i8);
        sb.append(", encoding=");
        sb.append(i9);
        sb.append("]");
        return sb.toString();
    }
}
