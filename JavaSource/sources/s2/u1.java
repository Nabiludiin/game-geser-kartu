package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class u1 extends yq implements v1 {
    public u1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static v1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new t1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            y3 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zq.d(parcel2, liteSdkVersion);
        } else {
            if (i7 != 2) {
                return false;
            }
            kb0 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zq.e(parcel2, adapterCreator);
        }
        return true;
    }
}
