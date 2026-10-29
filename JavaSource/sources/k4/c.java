package k4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean[] zArr = null;
        boolean[] zArr2 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 == 2) {
                z9 = q3.b.n(parcel, s7);
            } else if (m7 == 3) {
                z10 = q3.b.n(parcel, s7);
            } else if (m7 == 4) {
                zArr = q3.b.a(parcel, s7);
            } else if (m7 != 5) {
                q3.b.y(parcel, s7);
            } else {
                zArr2 = q3.b.a(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new a(z8, z9, z10, zArr, zArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a[i7];
    }
}
