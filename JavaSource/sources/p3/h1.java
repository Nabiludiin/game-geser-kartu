package p3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        q qVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z8 = false;
        boolean z9 = false;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    qVar = (q) q3.b.f(parcel, s7, q.CREATOR);
                    break;
                case 2:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 3:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 4:
                    iArr = q3.b.d(parcel, s7);
                    break;
                case 5:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 6:
                    iArr2 = q3.b.d(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new e(qVar, z8, z9, iArr, i7, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new e[i7];
    }
}
