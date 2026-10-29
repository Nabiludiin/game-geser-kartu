package h3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class f extends q3.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: q, reason: collision with root package name */
    private final String f24093q;

    /* renamed from: r, reason: collision with root package name */
    private final int f24094r;

    public f(String str, int i7) {
        this.f24093q = str;
        this.f24094r = i7;
    }

    public final int M0() {
        return this.f24094r;
    }

    public final String N0() {
        return this.f24093q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, this.f24093q, false);
        q3.c.l(parcel, 2, this.f24094r);
        q3.c.b(parcel, a8);
    }
}
