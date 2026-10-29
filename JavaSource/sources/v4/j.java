package v4;

import android.os.Parcel;
import android.os.Parcelable;
import p3.j0;

/* compiled from: MyApplication */
public final class j extends q3.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: q, reason: collision with root package name */
    final int f26909q;

    /* renamed from: r, reason: collision with root package name */
    final j0 f26910r;

    j(int i7, j0 j0Var) {
        this.f26909q = i7;
        this.f26910r = j0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, this.f26909q);
        q3.c.q(parcel, 2, this.f26910r, i7, false);
        q3.c.b(parcel, a8);
    }
}
