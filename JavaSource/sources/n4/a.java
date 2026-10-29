package n4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class a implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f25018q;

    /* renamed from: r, reason: collision with root package name */
    private final String f25019r;

    protected a(IBinder iBinder, String str) {
        this.f25018q = iBinder;
        this.f25019r = str;
    }

    protected final void O(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f25018q.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25019r);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25018q;
    }

    protected final void r0(int i7, Parcel parcel) {
        try {
            this.f25018q.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
