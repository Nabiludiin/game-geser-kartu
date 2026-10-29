package p3;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
final class q0 implements l {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f25263q;

    q0(IBinder iBinder) {
        this.f25263q = iBinder;
    }

    @Override // p3.l
    public final void C3(k kVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                i1.a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f25263q.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25263q;
    }
}
