package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class h5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        int i7 = 0;
        int i8 = 0;
        boolean z8 = false;
        int i9 = 0;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        String str = null;
        g5[] g5VarArr = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    str = q3.b.g(parcel, s7);
                    break;
                case 3:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 4:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 5:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 6:
                    i9 = q3.b.u(parcel, s7);
                    break;
                case 7:
                    i10 = q3.b.u(parcel, s7);
                    break;
                case 8:
                    g5VarArr = (g5[]) q3.b.j(parcel, s7, g5.CREATOR);
                    break;
                case 9:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 10:
                    z10 = q3.b.n(parcel, s7);
                    break;
                case 11:
                    z11 = q3.b.n(parcel, s7);
                    break;
                case 12:
                    z12 = q3.b.n(parcel, s7);
                    break;
                case 13:
                    z13 = q3.b.n(parcel, s7);
                    break;
                case 14:
                    z14 = q3.b.n(parcel, s7);
                    break;
                case 15:
                    z15 = q3.b.n(parcel, s7);
                    break;
                case 16:
                    z16 = q3.b.n(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new g5(str, i7, i8, z8, i9, i10, g5VarArr, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new g5[i7];
    }
}
