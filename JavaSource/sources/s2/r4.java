package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class r4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            if (q3.b.m(s7) != 15) {
                q3.b.y(parcel, s7);
            } else {
                str = q3.b.g(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new q4(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new q4[i7];
    }
}
