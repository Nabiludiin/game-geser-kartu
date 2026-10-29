package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class x2 extends q3.a {
    public static final Parcelable.Creator<x2> CREATOR = new v3();

    /* renamed from: q, reason: collision with root package name */
    public final int f26259q;

    /* renamed from: r, reason: collision with root package name */
    public final String f26260r;

    /* renamed from: s, reason: collision with root package name */
    public final String f26261s;

    /* renamed from: t, reason: collision with root package name */
    public x2 f26262t;

    /* renamed from: u, reason: collision with root package name */
    public IBinder f26263u;

    public x2(int i7, String str, String str2, x2 x2Var, IBinder iBinder) {
        this.f26259q = i7;
        this.f26260r = str;
        this.f26261s = str2;
        this.f26262t = x2Var;
        this.f26263u = iBinder;
    }

    public final k2.b M0() {
        k2.b bVar;
        x2 x2Var = this.f26262t;
        if (x2Var == null) {
            bVar = null;
        } else {
            String str = x2Var.f26261s;
            bVar = new k2.b(x2Var.f26259q, x2Var.f26260r, str);
        }
        return new k2.b(this.f26259q, this.f26260r, this.f26261s, bVar);
    }

    public final k2.m N0() {
        k2.b bVar;
        x2 x2Var = this.f26262t;
        y2 y2Var = null;
        if (x2Var == null) {
            bVar = null;
        } else {
            bVar = new k2.b(x2Var.f26259q, x2Var.f26260r, x2Var.f26261s);
        }
        int i7 = this.f26259q;
        String str = this.f26260r;
        String str2 = this.f26261s;
        IBinder iBinder = this.f26263u;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            y2Var = queryLocalInterface instanceof y2 ? (y2) queryLocalInterface : new v2(iBinder);
        }
        return new k2.m(i7, str, str2, bVar, k2.u.e(y2Var));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f26259q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.r(parcel, 2, this.f26260r, false);
        q3.c.r(parcel, 3, this.f26261s, false);
        q3.c.q(parcel, 4, this.f26262t, i7, false);
        q3.c.k(parcel, 5, this.f26263u, false);
        q3.c.b(parcel, a8);
    }
}
