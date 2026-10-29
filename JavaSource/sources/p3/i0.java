package p3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        String str2 = null;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 3:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 4:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 5:
                    j8 = q3.b.v(parcel, s7);
                    break;
                case 6:
                    str = q3.b.g(parcel, s7);
                    break;
                case 7:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 8:
                    i11 = q3.b.u(parcel, s7);
                    break;
                case 9:
                    i7 = q3.b.u(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new m(i8, i9, i10, j7, j8, str, str2, i11, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new m[i7];
    }
}
