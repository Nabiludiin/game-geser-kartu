package q4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class a extends Binder implements IInterface {
    protected a(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean a(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        boolean z7;
        if (i7 > 16777215) {
            z7 = super.onTransact(i7, parcel, parcel2, i8);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z7 = false;
        }
        if (z7) {
            return true;
        }
        return a(i7, parcel, parcel2, i8);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
