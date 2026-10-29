package o4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class a implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f25062q;

    /* renamed from: r, reason: collision with root package name */
    private final String f25063r;

    protected a(IBinder iBinder, String str) {
        this.f25062q = iBinder;
        this.f25063r = str;
    }

    protected final Parcel O() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25063r);
        return obtain;
    }

    protected final Parcel a(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f25062q.transact(i7, parcel, obtain, 0);
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
        return this.f25062q;
    }
}
