package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class p2 extends yq implements q2 {
    public p2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static q2 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof q2 ? (q2) queryLocalInterface : new o2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            i5 i5Var = (i5) zq.b(parcel, i5.CREATOR);
            zq.h(parcel);
            f8(i5Var);
            parcel2.writeNoException();
        } else {
            if (i7 != 2) {
                return false;
            }
            boolean e8 = e();
            parcel2.writeNoException();
            int i9 = zq.f20279b;
            parcel2.writeInt(e8 ? 1 : 0);
        }
        return true;
    }
}
