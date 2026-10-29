package v4;

import android.os.Parcel;
import android.os.Parcelable;
import p3.j0;

/* compiled from: MyApplication */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        j0 j0Var = null;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 != 2) {
                q3.b.y(parcel, s7);
            } else {
                j0Var = (j0) q3.b.f(parcel, s7, j0.CREATOR);
            }
        }
        q3.b.l(parcel, z7);
        return new j(i7, j0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new j[i7];
    }
}
