package q4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class h implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f25652q;

    /* renamed from: r, reason: collision with root package name */
    private final String f25653r;

    protected h(IBinder iBinder, String str) {
        this.f25652q = iBinder;
        this.f25653r = str;
    }

    protected final Parcel O(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f25652q.transact(i7, parcel, obtain, 0);
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
        obtain.writeInterfaceToken(this.f25653r);
        return obtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f25652q;
    }

    protected final void r0(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25652q.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
