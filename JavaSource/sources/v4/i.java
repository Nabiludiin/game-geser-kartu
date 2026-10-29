package v4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                arrayList = q3.b.i(parcel, s7);
            } else if (m7 != 2) {
                q3.b.y(parcel, s7);
            } else {
                str = q3.b.g(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new h[i7];
    }
}
