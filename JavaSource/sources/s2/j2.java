package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class j2 extends yq implements k2 {
    public j2() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        x2 x2Var = (x2) zq.b(parcel, x2.CREATOR);
        zq.h(parcel);
        T0(x2Var);
        parcel2.writeNoException();
        return true;
    }
}
