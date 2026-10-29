package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class xq implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f18929q;

    /* renamed from: r, reason: collision with root package name */
    private final String f18930r;

    protected xq(IBinder iBinder, String str) {
        this.f18929q = iBinder;
        this.f18930r = str;
    }

    protected final void C1(int i7, Parcel parcel) {
        try {
            this.f18929q.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel O(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f18929q.transact(i7, parcel, obtain, 0);
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
        obtain.writeInterfaceToken(this.f18930r);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18929q;
    }

    protected final void r0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18929q.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
