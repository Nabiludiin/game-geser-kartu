package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class e0 extends q3.a implements Iterable {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: q, reason: collision with root package name */
    private final Bundle f22076q;

    e0(Bundle bundle) {
        this.f22076q = bundle;
    }

    final Object M0(String str) {
        return this.f22076q.get(str);
    }

    final Long N0(String str) {
        return Long.valueOf(this.f22076q.getLong(str));
    }

    final Double O0(String str) {
        return Double.valueOf(this.f22076q.getDouble("value"));
    }

    final String P0(String str) {
        return this.f22076q.getString(str);
    }

    public final int Q0() {
        return this.f22076q.size();
    }

    public final Bundle R0() {
        return new Bundle(this.f22076q);
    }

    final /* synthetic */ Bundle S0() {
        return this.f22076q;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d0(this);
    }

    public final String toString() {
        return this.f22076q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.f(parcel, 2, R0(), false);
        q3.c.b(parcel, a8);
    }
}
