package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class k0 extends yq implements l0 {
    public k0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            b();
        } else {
            if (i7 != 2) {
                return false;
            }
            x2 x2Var = (x2) zq.b(parcel, x2.CREATOR);
            zq.h(parcel);
            b1(x2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
