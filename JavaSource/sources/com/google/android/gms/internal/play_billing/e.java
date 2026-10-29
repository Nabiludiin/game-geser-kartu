package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class e implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f21518q;

    /* renamed from: r, reason: collision with root package name */
    private final String f21519r;

    protected e(IBinder iBinder, String str) {
        this.f21518q = iBinder;
        this.f21519r = str;
    }

    protected final Parcel O(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f21518q.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21519r);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21518q;
    }

    protected final void r0(int i7, Parcel parcel) {
        try {
            this.f21518q.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
