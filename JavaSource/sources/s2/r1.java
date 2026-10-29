package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class r1 extends yq implements s1 {
    public r1() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            x2 x2Var = (x2) zq.b(parcel, x2.CREATOR);
            zq.h(parcel);
            p5(x2Var);
        } else if (i7 == 2) {
            d();
        } else if (i7 == 3) {
            h();
        } else if (i7 == 4) {
            c();
        } else {
            if (i7 != 5) {
                return false;
            }
            e();
        }
        parcel2.writeNoException();
        return true;
    }
}
