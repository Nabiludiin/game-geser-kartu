package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class p0 implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f21217q;

    /* renamed from: r, reason: collision with root package name */
    private final String f21218r;

    protected p0(IBinder iBinder, String str) {
        this.f21217q = iBinder;
        this.f21218r = str;
    }

    protected final void C1(int i7, Parcel parcel) {
        try {
            this.f21217q.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel O() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21218r);
        return obtain;
    }

    protected final Parcel a(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f21217q.transact(i7, parcel, obtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21217q;
    }

    protected final void r0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21217q.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
