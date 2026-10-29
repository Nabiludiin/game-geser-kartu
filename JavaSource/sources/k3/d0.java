package k3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    str = q3.b.g(parcel, s7);
                    break;
                case 2:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 3:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 4:
                    iBinder = q3.b.t(parcel, s7);
                    break;
                case 5:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 6:
                    z11 = q3.b.n(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new c0(str, z8, z9, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new c0[i7];
    }
}
