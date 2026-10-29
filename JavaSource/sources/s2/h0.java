package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class h0 extends yq implements i0 {
    public h0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                b();
                break;
            case 2:
                int readInt = parcel.readInt();
                zq.h(parcel);
                R(readInt);
                break;
            case 3:
                break;
            case 4:
                e();
                break;
            case 5:
                f();
                break;
            case 6:
                g();
                break;
            case 7:
                i();
                break;
            case 8:
                x2 x2Var = (x2) zq.b(parcel, x2.CREATOR);
                zq.h(parcel);
                u0(x2Var);
                break;
            case 9:
                j();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
