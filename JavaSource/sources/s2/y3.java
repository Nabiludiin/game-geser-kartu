package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class y3 extends q3.a {
    public static final Parcelable.Creator<y3> CREATOR = new z3();

    /* renamed from: q, reason: collision with root package name */
    private final int f26267q;

    /* renamed from: r, reason: collision with root package name */
    private final int f26268r;

    /* renamed from: s, reason: collision with root package name */
    private final String f26269s;

    public y3(int i7, int i8, String str) {
        this.f26267q = i7;
        this.f26268r = i8;
        this.f26269s = str;
    }

    public final int M0() {
        return this.f26268r;
    }

    public final String N0() {
        return this.f26269s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, this.f26267q);
        q3.c.l(parcel, 2, this.f26268r);
        q3.c.r(parcel, 3, this.f26269s, false);
        q3.c.b(parcel, a8);
    }
}
