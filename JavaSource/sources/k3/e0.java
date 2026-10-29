package k3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class e0 extends q3.a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();

    /* renamed from: q, reason: collision with root package name */
    private final boolean f24486q;

    /* renamed from: r, reason: collision with root package name */
    private final String f24487r;

    /* renamed from: s, reason: collision with root package name */
    private final int f24488s;

    /* renamed from: t, reason: collision with root package name */
    private final int f24489t;

    e0(boolean z7, String str, int i7, int i8) {
        this.f24486q = z7;
        this.f24487r = str;
        this.f24488s = l0.a(i7) - 1;
        this.f24489t = r.a(i8) - 1;
    }

    public final String M0() {
        return this.f24487r;
    }

    public final int N0() {
        return r.a(this.f24489t);
    }

    public final int O0() {
        return l0.a(this.f24488s);
    }

    public final boolean b() {
        return this.f24486q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 1, this.f24486q);
        q3.c.r(parcel, 2, this.f24487r, false);
        q3.c.l(parcel, 3, this.f24488s);
        q3.c.l(parcel, 4, this.f24489t);
        q3.c.b(parcel, a8);
    }
}
