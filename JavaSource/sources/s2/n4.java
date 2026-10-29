package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class n4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        String str = null;
        b5 b5Var = null;
        int i8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 2) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 3) {
                b5Var = (b5) q3.b.f(parcel, s7, b5.CREATOR);
            } else if (m7 != 4) {
                q3.b.y(parcel, s7);
            } else {
                i8 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new m4(str, i7, b5Var, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new m4[i7];
    }
}
