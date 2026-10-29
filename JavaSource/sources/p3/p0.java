package p3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class p0 extends o4.d implements k {
    public p0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // o4.d
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o4.e.a(parcel, Bundle.CREATOR);
            o4.e.b(parcel);
            y4(readInt, readStrongBinder, bundle);
        } else if (i7 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) o4.e.a(parcel, Bundle.CREATOR);
            o4.e.b(parcel);
            D0(readInt2, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            f1 f1Var = (f1) o4.e.a(parcel, f1.CREATOR);
            o4.e.b(parcel);
            j4(readInt3, readStrongBinder2, f1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
