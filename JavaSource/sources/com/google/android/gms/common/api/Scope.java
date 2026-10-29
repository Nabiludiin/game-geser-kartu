package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p3.o;
import q3.c;

/* compiled from: MyApplication */
public final class Scope extends q3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    final int f4413q;

    /* renamed from: r, reason: collision with root package name */
    private final String f4414r;

    Scope(int i7, String str) {
        o.h(str, "scopeUri must not be null or empty");
        this.f4413q = i7;
        this.f4414r = str;
    }

    public String M0() {
        return this.f4414r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4414r.equals(((Scope) obj).f4414r);
        }
        return false;
    }

    public int hashCode() {
        return this.f4414r.hashCode();
    }

    public String toString() {
        return this.f4414r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f4413q;
        int a8 = c.a(parcel);
        c.l(parcel, 1, i8);
        c.r(parcel, 2, M0(), false);
        c.b(parcel, a8);
    }

    public Scope(String str) {
        this(1, str);
    }
}
