package p3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public class q extends q3.a {
    public static final Parcelable.Creator<q> CREATOR = new x0();

    /* renamed from: q, reason: collision with root package name */
    private final int f25258q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f25259r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f25260s;

    /* renamed from: t, reason: collision with root package name */
    private final int f25261t;

    /* renamed from: u, reason: collision with root package name */
    private final int f25262u;

    public q(int i7, boolean z7, boolean z8, int i8, int i9) {
        this.f25258q = i7;
        this.f25259r = z7;
        this.f25260s = z8;
        this.f25261t = i8;
        this.f25262u = i9;
    }

    public int M0() {
        return this.f25261t;
    }

    public int N0() {
        return this.f25262u;
    }

    public boolean O0() {
        return this.f25259r;
    }

    public boolean P0() {
        return this.f25260s;
    }

    public int Q0() {
        return this.f25258q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, Q0());
        q3.c.c(parcel, 2, O0());
        q3.c.c(parcel, 3, P0());
        q3.c.l(parcel, 4, M0());
        q3.c.l(parcel, 5, N0());
        q3.c.b(parcel, a8);
    }
}
