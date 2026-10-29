package u2;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        Bundle bundle = null;
        boolean z8 = false;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    str = q3.b.g(parcel, s7);
                    break;
                case 3:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 4:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 5:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 6:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 7:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 8:
                    str7 = q3.b.g(parcel, s7);
                    break;
                case 9:
                    intent = (Intent) q3.b.f(parcel, s7, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = q3.b.t(parcel, s7);
                    break;
                case 11:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 12:
                    bundle = q3.b.b(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new m(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z8, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new m[i7];
    }
}
