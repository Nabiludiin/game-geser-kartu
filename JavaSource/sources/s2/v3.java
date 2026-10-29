package s2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class v3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        x2 x2Var = null;
        IBinder iBinder = null;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 2) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 3) {
                str2 = q3.b.g(parcel, s7);
            } else if (m7 == 4) {
                x2Var = (x2) q3.b.f(parcel, s7, x2.CREATOR);
            } else if (m7 != 5) {
                q3.b.y(parcel, s7);
            } else {
                iBinder = q3.b.t(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new x2(i7, str, str2, x2Var, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new x2[i7];
    }
}
