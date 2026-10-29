package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class f3 extends q3.a {
    public static final Parcelable.Creator<f3> CREATOR = new g3();

    /* renamed from: q, reason: collision with root package name */
    public final int f26090q;

    public f3(int i7) {
        this.f26090q = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f26090q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 2, i8);
        q3.c.b(parcel, a8);
    }
}
