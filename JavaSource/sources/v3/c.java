package v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        long j7 = 0;
        long j8 = 0;
        int i7 = -1;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 2) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 3) {
                j7 = q3.b.v(parcel, s7);
            } else if (m7 == 4) {
                j8 = q3.b.v(parcel, s7);
            } else if (m7 != 5) {
                q3.b.y(parcel, s7);
            } else {
                i7 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new DriveId(str, j7, j8, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new DriveId[i7];
    }
}
