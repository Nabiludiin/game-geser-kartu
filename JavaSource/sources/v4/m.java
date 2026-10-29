package v4;

import android.os.Parcel;
import android.os.Parcelable;
import p3.l0;

/* compiled from: MyApplication */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        k3.b bVar = null;
        int i7 = 0;
        l0 l0Var = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 2) {
                bVar = (k3.b) q3.b.f(parcel, s7, k3.b.CREATOR);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                l0Var = (l0) q3.b.f(parcel, s7, l0.CREATOR);
            }
        }
        q3.b.l(parcel, z7);
        return new l(i7, bVar, l0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new l[i7];
    }
}
