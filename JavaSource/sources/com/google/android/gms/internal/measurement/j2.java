package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: MyApplication */
public final class j2 extends q3.a {
    public static final Parcelable.Creator<j2> CREATOR = new k2();

    /* renamed from: q, reason: collision with root package name */
    public final int f21050q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21051r;

    /* renamed from: s, reason: collision with root package name */
    public final Intent f21052s;

    public j2(int i7, String str, Intent intent) {
        this.f21050q = i7;
        this.f21051r = str;
        this.f21052s = intent;
    }

    public static j2 M0(Activity activity) {
        return new j2(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.f21050q == j2Var.f21050q && Objects.equals(this.f21051r, j2Var.f21051r) && Objects.equals(this.f21052s, j2Var.f21052s);
    }

    public final int hashCode() {
        return this.f21050q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f21050q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.r(parcel, 2, this.f21051r, false);
        q3.c.q(parcel, 3, this.f21052s, i7, false);
        q3.c.b(parcel, a8);
    }
}
