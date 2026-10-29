package p3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class t1 extends o4.d implements o0 {
    public t1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static o0 O(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof o0 ? (o0) queryLocalInterface : new s1(iBinder);
    }

    @Override // o4.d
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            w3.a h8 = h();
            parcel2.writeNoException();
            o4.e.d(parcel2, h8);
        } else {
            if (i7 != 2) {
                return false;
            }
            int d8 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d8);
        }
        return true;
    }
}
