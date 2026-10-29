package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class n0 extends yq implements o0 {
    public n0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            b5 b5Var = (b5) zq.b(parcel, b5.CREATOR);
            zq.h(parcel);
            U0(b5Var);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            String e8 = e();
            parcel2.writeNoException();
            parcel2.writeString(e8);
        } else if (i7 == 3) {
            boolean f8 = f();
            parcel2.writeNoException();
            int i9 = zq.f20279b;
            parcel2.writeInt(f8 ? 1 : 0);
        } else if (i7 == 4) {
            String g8 = g();
            parcel2.writeNoException();
            parcel2.writeString(g8);
        } else {
            if (i7 != 5) {
                return false;
            }
            b5 b5Var2 = (b5) zq.b(parcel, b5.CREATOR);
            int readInt = parcel.readInt();
            zq.h(parcel);
            w7(b5Var2, readInt);
            parcel2.writeNoException();
        }
        return true;
    }
}
