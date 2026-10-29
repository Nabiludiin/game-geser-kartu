package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* compiled from: MyApplication */
public final class di0 extends q3.a {
    public static final Parcelable.Creator<di0> CREATOR = new ei0();

    /* renamed from: q, reason: collision with root package name */
    public final String f7114q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7115r;

    public di0(String str, int i7) {
        this.f7114q = str;
        this.f7115r = i7;
    }

    public static di0 M0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new di0(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj;
        return p3.n.a(this.f7114q, di0Var.f7114q) && p3.n.a(Integer.valueOf(this.f7115r), Integer.valueOf(di0Var.f7115r));
    }

    public final int hashCode() {
        return p3.n.b(this.f7114q, Integer.valueOf(this.f7115r));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f7114q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.l(parcel, 3, this.f7115r);
        q3.c.b(parcel, a8);
    }
}
