package h3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class d extends q3.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: q, reason: collision with root package name */
    private final String f24091q;

    /* renamed from: r, reason: collision with root package name */
    private final String f24092r;

    public d(String str, String str2) {
        this.f24091q = str;
        this.f24092r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, this.f24091q, false);
        q3.c.r(parcel, 2, this.f24092r, false);
        q3.c.b(parcel, a8);
    }
}
