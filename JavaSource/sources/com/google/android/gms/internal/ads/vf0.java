package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;
import w3.a;

/* compiled from: MyApplication */
public final class vf0 extends q3.a {
    public static final Parcelable.Creator<vf0> CREATOR = new wf0();

    /* renamed from: q, reason: collision with root package name */
    public final View f17591q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f17592r;

    public vf0(IBinder iBinder, IBinder iBinder2) {
        this.f17591q = (View) w3.b.r0(a.AbstractBinderC0140a.O(iBinder));
        this.f17592r = (Map) w3.b.r0(a.AbstractBinderC0140a.O(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        View view = this.f17591q;
        int a8 = q3.c.a(parcel);
        q3.c.k(parcel, 1, w3.b.C1(view).asBinder(), false);
        q3.c.k(parcel, 2, w3.b.C1(this.f17592r).asBinder(), false);
        q3.c.b(parcel, a8);
    }
}
