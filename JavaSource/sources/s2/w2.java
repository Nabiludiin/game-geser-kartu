package s2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import java.util.List;

/* compiled from: MyApplication */
public abstract class w2 extends yq implements y2 {
    public w2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static y2 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof y2 ? (y2) queryLocalInterface : new v2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                String c8 = c();
                parcel2.writeNoException();
                parcel2.writeString(c8);
                return true;
            case 2:
                String e8 = e();
                parcel2.writeNoException();
                parcel2.writeString(e8);
                return true;
            case 3:
                List f8 = f();
                parcel2.writeNoException();
                parcel2.writeTypedList(f8);
                return true;
            case 4:
                k5 g8 = g();
                parcel2.writeNoException();
                zq.d(parcel2, g8);
                return true;
            case 5:
                Bundle j7 = j();
                parcel2.writeNoException();
                zq.d(parcel2, j7);
                return true;
            case 6:
                String i9 = i();
                parcel2.writeNoException();
                parcel2.writeString(i9);
                return true;
            default:
                return false;
        }
    }
}
