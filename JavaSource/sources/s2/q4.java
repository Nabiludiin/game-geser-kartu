package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class q4 extends q3.a {
    public static final Parcelable.Creator<q4> CREATOR = new r4();

    /* renamed from: q, reason: collision with root package name */
    public final String f26212q;

    q4(String str) {
        this.f26212q = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26212q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 15, str, false);
        q3.c.b(parcel, a8);
    }
}
