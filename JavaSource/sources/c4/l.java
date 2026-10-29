package c4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Bundle bundle = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                bundle = q3.b.b(parcel, s7);
            } else if (m7 != 2) {
                q3.b.y(parcel, s7);
            } else {
                iBinder = q3.b.t(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new m(bundle, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new m[i7];
    }
}
