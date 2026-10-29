package p3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class f1 extends q3.a {
    public static final Parcelable.Creator<f1> CREATOR = new g1();

    /* renamed from: q, reason: collision with root package name */
    Bundle f25184q;

    /* renamed from: r, reason: collision with root package name */
    k3.d[] f25185r;

    /* renamed from: s, reason: collision with root package name */
    int f25186s;

    /* renamed from: t, reason: collision with root package name */
    e f25187t;

    f1(Bundle bundle, k3.d[] dVarArr, int i7, e eVar) {
        this.f25184q = bundle;
        this.f25185r = dVarArr;
        this.f25186s = i7;
        this.f25187t = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.f(parcel, 1, this.f25184q, false);
        q3.c.u(parcel, 2, this.f25185r, i7, false);
        q3.c.l(parcel, 3, this.f25186s);
        q3.c.q(parcel, 4, this.f25187t, i7, false);
        q3.c.b(parcel, a8);
    }
}
