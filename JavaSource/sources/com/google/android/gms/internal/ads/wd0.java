package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class wd0 extends q3.a {
    public static final Parcelable.Creator<wd0> CREATOR = new xd0();

    /* renamed from: q, reason: collision with root package name */
    public final int f18202q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18203r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18204s;

    wd0(int i7, int i8, int i9) {
        this.f18202q = i7;
        this.f18203r = i8;
        this.f18204s = i9;
    }

    public static wd0 M0(k2.v vVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof wd0)) {
            wd0 wd0Var = (wd0) obj;
            if (wd0Var.f18204s == this.f18204s && wd0Var.f18203r == this.f18203r && wd0Var.f18202q == this.f18202q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f18202q, this.f18203r, this.f18204s});
    }

    public final String toString() {
        int i7 = this.f18202q;
        int length = String.valueOf(i7).length();
        int i8 = this.f18203r;
        int length2 = String.valueOf(i8).length();
        int i9 = this.f18204s;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i9).length());
        sb.append(i7);
        sb.append(".");
        sb.append(i8);
        sb.append(".");
        sb.append(i9);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f18202q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f18203r);
        q3.c.l(parcel, 3, this.f18204s);
        q3.c.b(parcel, a8);
    }
}
