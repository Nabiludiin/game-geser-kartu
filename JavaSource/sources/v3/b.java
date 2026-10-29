package v3;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String str = null;
        int i7 = 0;
        int i8 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) q3.b.f(parcel, s7, ParcelFileDescriptor.CREATOR);
            } else if (m7 == 3) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 4) {
                i8 = q3.b.u(parcel, s7);
            } else if (m7 == 5) {
                driveId = (DriveId) q3.b.f(parcel, s7, DriveId.CREATOR);
            } else if (m7 == 7) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 != 8) {
                q3.b.y(parcel, s7);
            } else {
                str = q3.b.g(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new a(parcelFileDescriptor, i7, i8, driveId, z8, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a[i7];
    }
}
