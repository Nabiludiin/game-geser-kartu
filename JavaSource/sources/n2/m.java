package n2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        IBinder iBinder = null;
        boolean z8 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 == 2) {
                iBinder = q3.b.t(parcel, s7);
            } else if (m7 != 3) {
                q3.b.y(parcel, s7);
            } else {
                iBinder2 = q3.b.t(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new f(z8, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new f[i7];
    }
}
