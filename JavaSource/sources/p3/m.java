package p3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public class m extends q3.a {
    public static final Parcelable.Creator<m> CREATOR = new i0();

    /* renamed from: q, reason: collision with root package name */
    private final int f25230q;

    /* renamed from: r, reason: collision with root package name */
    private final int f25231r;

    /* renamed from: s, reason: collision with root package name */
    private final int f25232s;

    /* renamed from: t, reason: collision with root package name */
    private final long f25233t;

    /* renamed from: u, reason: collision with root package name */
    private final long f25234u;

    /* renamed from: v, reason: collision with root package name */
    private final String f25235v;

    /* renamed from: w, reason: collision with root package name */
    private final String f25236w;

    /* renamed from: x, reason: collision with root package name */
    private final int f25237x;

    /* renamed from: y, reason: collision with root package name */
    private final int f25238y;

    public m(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10, int i11) {
        this.f25230q = i7;
        this.f25231r = i8;
        this.f25232s = i9;
        this.f25233t = j7;
        this.f25234u = j8;
        this.f25235v = str;
        this.f25236w = str2;
        this.f25237x = i10;
        this.f25238y = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f25230q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f25231r);
        q3.c.l(parcel, 3, this.f25232s);
        q3.c.o(parcel, 4, this.f25233t);
        q3.c.o(parcel, 5, this.f25234u);
        q3.c.r(parcel, 6, this.f25235v, false);
        q3.c.r(parcel, 7, this.f25236w, false);
        q3.c.l(parcel, 8, this.f25237x);
        q3.c.l(parcel, 9, this.f25238y);
        q3.c.b(parcel, a8);
    }
}
