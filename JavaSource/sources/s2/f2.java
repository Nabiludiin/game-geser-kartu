package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;

/* compiled from: MyApplication */
public abstract class f2 extends yq implements g2 {
    public f2() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static g2 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof g2 ? (g2) queryLocalInterface : new e2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String c8 = c();
            parcel2.writeNoException();
            parcel2.writeString(c8);
        } else {
            if (i7 != 2) {
                return false;
            }
            String e8 = e();
            parcel2.writeNoException();
            parcel2.writeString(e8);
        }
        return true;
    }
}
