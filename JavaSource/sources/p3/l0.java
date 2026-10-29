package p3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p3.j;

/* compiled from: MyApplication */
public final class l0 extends q3.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: q, reason: collision with root package name */
    final int f25224q;

    /* renamed from: r, reason: collision with root package name */
    final IBinder f25225r;

    /* renamed from: s, reason: collision with root package name */
    private final k3.b f25226s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f25227t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f25228u;

    l0(int i7, IBinder iBinder, k3.b bVar, boolean z7, boolean z8) {
        this.f25224q = i7;
        this.f25225r = iBinder;
        this.f25226s = bVar;
        this.f25227t = z7;
        this.f25228u = z8;
    }

    public final k3.b M0() {
        return this.f25226s;
    }

    public final j N0() {
        IBinder iBinder = this.f25225r;
        if (iBinder == null) {
            return null;
        }
        return j.a.O(iBinder);
    }

    public final boolean O0() {
        return this.f25227t;
    }

    public final boolean P0() {
        return this.f25228u;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f25226s.equals(l0Var.f25226s) && n.a(N0(), l0Var.N0());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, this.f25224q);
        q3.c.k(parcel, 2, this.f25225r, false);
        q3.c.q(parcel, 3, this.f25226s, i7, false);
        q3.c.c(parcel, 4, this.f25227t);
        q3.c.c(parcel, 5, this.f25228u);
        q3.c.b(parcel, a8);
    }
}
