package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        long j7 = -1;
        int i7 = 0;
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 2) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                j7 = q3.b.v(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new d(str, i7, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new d[i7];
    }
}
