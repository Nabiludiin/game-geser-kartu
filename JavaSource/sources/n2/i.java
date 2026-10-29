package n2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            if (q3.b.m(s7) != 1) {
                q3.b.y(parcel, s7);
            } else {
                z8 = q3.b.n(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new a(z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a[i7];
    }
}
