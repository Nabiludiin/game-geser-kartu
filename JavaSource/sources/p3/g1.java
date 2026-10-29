package p3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class g1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        Bundle bundle = null;
        e eVar = null;
        int i7 = 0;
        k3.d[] dVarArr = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 1) {
                bundle = q3.b.b(parcel, s7);
            } else if (m7 == 2) {
                dVarArr = (k3.d[]) q3.b.j(parcel, s7, k3.d.CREATOR);
            } else if (m7 == 3) {
                i7 = q3.b.u(parcel, s7);
            } else if (m7 != 4) {
                q3.b.y(parcel, s7);
            } else {
                eVar = (e) q3.b.f(parcel, s7, e.CREATOR);
            }
        }
        q3.b.l(parcel, z7);
        return new f1(bundle, dVarArr, i7, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new f1[i7];
    }
}
