package r2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i7 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        float f8 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 3:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 4:
                    str = q3.b.g(parcel, s7);
                    break;
                case 5:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 6:
                    f8 = q3.b.q(parcel, s7);
                    break;
                case 7:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 8:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case 9:
                    z12 = q3.b.n(parcel, s7);
                    break;
                case 10:
                    z13 = q3.b.n(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new l(z8, z9, str, z10, f8, i7, z11, z12, z13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new l[i7];
    }
}
