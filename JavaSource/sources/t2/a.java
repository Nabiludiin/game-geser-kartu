package t2;

import android.os.Parcel;
import android.os.Parcelable;
import q3.c;

/* compiled from: MyApplication */
public final class a extends q3.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: q, reason: collision with root package name */
    public final String f26390q;

    /* renamed from: r, reason: collision with root package name */
    public final String f26391r;

    /* renamed from: s, reason: collision with root package name */
    public final String f26392s;

    public a(String str, String str2, String str3) {
        this.f26390q = str;
        this.f26391r = str2;
        this.f26392s = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26390q;
        int a8 = c.a(parcel);
        c.r(parcel, 1, str, false);
        c.r(parcel, 2, this.f26391r, false);
        c.r(parcel, 3, this.f26392s, false);
        c.b(parcel, a8);
    }
}
