package g4;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
final class c implements Parcelable.Creator {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a[i7];
    }
}
