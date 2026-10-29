package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class o4 extends q3.a {
    public static final Parcelable.Creator<o4> CREATOR = new p4();

    /* renamed from: q, reason: collision with root package name */
    public final int f26201q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26202r;

    public o4(int i7, int i8) {
        this.f26201q = i7;
        this.f26202r = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f26201q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f26202r);
        q3.c.b(parcel, a8);
    }

    public o4(k2.t tVar) {
        this.f26201q = tVar.c();
        this.f26202r = tVar.d();
    }
}
