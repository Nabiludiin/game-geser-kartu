package v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.iy3;
import com.google.android.gms.internal.ads.z13;

/* compiled from: MyApplication */
public final class c0 extends q3.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: q, reason: collision with root package name */
    public final String f26729q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26730r;

    c0(String str, int i7) {
        this.f26729q = str == null ? "" : str;
        this.f26730r = i7;
    }

    public static c0 M0(Throwable th) {
        s2.x2 a8 = z13.a(th);
        return new c0(iy3.c(th.getMessage()) ? a8.f26260r : th.getMessage(), a8.f26259q);
    }

    public final a0 N0() {
        return new a0(this.f26729q, this.f26730r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f26729q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, str, false);
        q3.c.l(parcel, 2, this.f26730r);
        q3.c.b(parcel, a8);
    }
}
