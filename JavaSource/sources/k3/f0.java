package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        int i7 = 0;
        String str = null;
        int i8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 == 2) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 3) {
                i8 = q3.b.u(parcel, s7);
            } else if (m7 != 4) {
                q3.b.y(parcel, s7);
            } else {
                i7 = q3.b.u(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new e0(z8, str, i8, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new e0[i7];
    }
}
