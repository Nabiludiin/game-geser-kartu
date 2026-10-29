package p3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        boolean z8 = false;
        boolean z9 = false;
        IBinder iBinder = null;
        k3.b bVar = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 == 2) {
                iBinder = q3.b.t(parcel, s7);
            } else if (m7 == 3) {
                bVar = (k3.b) q3.b.f(parcel, s7, k3.b.CREATOR);
            } else if (m7 == 4) {
                z8 = q3.b.n(parcel, s7);
            } else if (m7 != 5) {
                q3.b.y(parcel, s7);
            } else {
                z9 = q3.b.n(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new l0(i7, iBinder, bVar, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new l0[i7];
    }
}
