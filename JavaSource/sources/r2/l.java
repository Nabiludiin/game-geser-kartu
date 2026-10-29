package r2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class l extends q3.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f25811q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f25812r;

    /* renamed from: s, reason: collision with root package name */
    public final String f25813s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f25814t;

    /* renamed from: u, reason: collision with root package name */
    public final float f25815u;

    /* renamed from: v, reason: collision with root package name */
    public final int f25816v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f25817w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25818x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f25819y;

    l(boolean z7, boolean z8, String str, boolean z9, float f8, int i7, boolean z10, boolean z11, boolean z12) {
        this.f25811q = z7;
        this.f25812r = z8;
        this.f25813s = str;
        this.f25814t = z9;
        this.f25815u = f8;
        this.f25816v = i7;
        this.f25817w = z10;
        this.f25818x = z11;
        this.f25819y = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f25811q;
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 2, z7);
        q3.c.c(parcel, 3, this.f25812r);
        q3.c.r(parcel, 4, this.f25813s, false);
        q3.c.c(parcel, 5, this.f25814t);
        q3.c.i(parcel, 6, this.f25815u);
        q3.c.l(parcel, 7, this.f25816v);
        q3.c.c(parcel, 8, this.f25817w);
        q3.c.c(parcel, 9, this.f25818x);
        q3.c.c(parcel, 10, this.f25819y);
        q3.c.b(parcel, a8);
    }

    public l(boolean z7, boolean z8, boolean z9, float f8, int i7, boolean z10, boolean z11, boolean z12) {
        this(z7, z8, null, z9, f8, -1, z10, z11, z12);
    }
}
