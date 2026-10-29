package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class a implements IInterface {

    /* renamed from: q, reason: collision with root package name */
    private final IBinder f24890q;

    /* renamed from: r, reason: collision with root package name */
    private final String f24891r = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(IBinder iBinder, String str) {
        this.f24890q = iBinder;
    }

    protected final void O(int i7, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f24890q.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f24891r);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24890q;
    }
}
