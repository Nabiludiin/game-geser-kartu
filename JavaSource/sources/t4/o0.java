package t4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            if (q3.b.m(s7) != 1) {
                q3.b.y(parcel, s7);
            } else {
                arrayList = q3.b.e(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new n0(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new n0[i7];
    }
}
