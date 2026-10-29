package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class y0 extends q3.a {
    public static final Parcelable.Creator<y0> CREATOR = new x1();

    /* renamed from: q, reason: collision with root package name */
    public final String f26265q;

    /* renamed from: r, reason: collision with root package name */
    public final String f26266r;

    public y0(String str, String str2) {
        this.f26265q = str;
        this.f26266r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26265q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.r(parcel, 2, this.f26266r, false);
        q3.c.b(parcel, a8);
    }
}
