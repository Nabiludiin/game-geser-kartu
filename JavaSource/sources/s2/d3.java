package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class d3 extends yq implements e3 {
    public d3() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            c();
        } else if (i7 == 2) {
            e();
        } else if (i7 == 3) {
            f();
        } else if (i7 == 4) {
            g();
        } else {
            if (i7 != 5) {
                return false;
            }
            boolean a8 = zq.a(parcel);
            zq.h(parcel);
            z5(a8);
        }
        parcel2.writeNoException();
        return true;
    }
}
