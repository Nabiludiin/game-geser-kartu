package s2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class u4 extends q3.a {
    public static final Parcelable.Creator<u4> CREATOR = new v4();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f26238q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f26239r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f26240s;

    public u4(k2.x xVar) {
        this(xVar.c(), xVar.b(), xVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f26238q;
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 2, z7);
        q3.c.c(parcel, 3, this.f26239r);
        q3.c.c(parcel, 4, this.f26240s);
        q3.c.b(parcel, a8);
    }

    public u4(boolean z7, boolean z8, boolean z9) {
        this.f26238q = z7;
        this.f26239r = z8;
        this.f26240s = z9;
    }
}
