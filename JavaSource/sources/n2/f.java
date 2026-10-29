package n2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s2.k1;
import s2.l1;

/* compiled from: MyApplication */
public final class f extends q3.a {
    public static final Parcelable.Creator<f> CREATOR = new m();

    /* renamed from: q, reason: collision with root package name */
    private final boolean f25010q;

    /* renamed from: r, reason: collision with root package name */
    private final l1 f25011r;

    /* renamed from: s, reason: collision with root package name */
    private final IBinder f25012s;

    f(boolean z7, IBinder iBinder, IBinder iBinder2) {
        this.f25010q = z7;
        this.f25011r = iBinder != null ? k1.j8(iBinder) : null;
        this.f25012s = iBinder2;
    }

    public final l1 M0() {
        return this.f25011r;
    }

    public final boolean a() {
        return this.f25010q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 1, this.f25010q);
        l1 l1Var = this.f25011r;
        q3.c.k(parcel, 2, l1Var == null ? null : l1Var.asBinder(), false);
        q3.c.k(parcel, 3, this.f25012s, false);
        q3.c.b(parcel, a8);
    }
}
