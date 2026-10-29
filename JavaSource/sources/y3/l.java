package y3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        long j7 = 0;
        long j8 = 0;
        h hVar = null;
        h hVar2 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                j7 = q3.b.v(parcel, s7);
            } else if (m7 == 2) {
                j8 = q3.b.v(parcel, s7);
            } else if (m7 == 3) {
                hVar = (h) q3.b.f(parcel, s7, h.CREATOR);
            } else if (m7 != 4) {
                q3.b.y(parcel, s7);
            } else {
                hVar2 = (h) q3.b.f(parcel, s7, h.CREATOR);
            }
        }
        q3.b.l(parcel, z7);
        return new i(j7, j8, hVar, hVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new i[i7];
    }
}
