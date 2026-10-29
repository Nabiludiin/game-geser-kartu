package s2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class l5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        x2 x2Var = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    str = q3.b.g(parcel, s7);
                    break;
                case 2:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 3:
                    x2Var = (x2) q3.b.f(parcel, s7, x2.CREATOR);
                    break;
                case 4:
                    bundle = q3.b.b(parcel, s7);
                    break;
                case 5:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 6:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 7:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 8:
                    str5 = q3.b.g(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new k5(str, j7, x2Var, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new k5[i7];
    }
}
