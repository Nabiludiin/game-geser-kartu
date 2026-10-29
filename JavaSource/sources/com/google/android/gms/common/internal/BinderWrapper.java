package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f4552q;

    public BinderWrapper(IBinder iBinder) {
        this.f4552q = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStrongBinder(this.f4552q);
    }
}
