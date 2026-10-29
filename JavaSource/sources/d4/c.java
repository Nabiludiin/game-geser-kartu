package d4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long j7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    str = q3.b.g(parcel, s7);
                    break;
                case 2:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 3:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 4:
                    uri = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) q3.b.f(parcel, s7, Uri.CREATOR);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new a(str, str2, j7, uri, uri2, uri3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a[i7];
    }
}
