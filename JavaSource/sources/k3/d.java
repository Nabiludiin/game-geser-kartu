package k3;

import android.os.Parcel;
import android.os.Parcelable;
import p3.n;

/* compiled from: MyApplication */
public class d extends q3.a {
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* renamed from: q, reason: collision with root package name */
    private final String f24483q;

    /* renamed from: r, reason: collision with root package name */
    private final int f24484r;

    /* renamed from: s, reason: collision with root package name */
    private final long f24485s;

    public d(String str, int i7, long j7) {
        this.f24483q = str;
        this.f24484r = i7;
        this.f24485s = j7;
    }

    public long M0() {
        long j7 = this.f24485s;
        return j7 == -1 ? this.f24484r : j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((getName() != null && getName().equals(dVar.getName())) || (getName() == null && dVar.getName() == null)) && M0() == dVar.M0()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f24483q;
    }

    public final int hashCode() {
        return p3.n.b(getName(), Long.valueOf(M0()));
    }

    public final String toString() {
        n.a c8 = p3.n.c(this);
        c8.a("name", getName());
        c8.a("version", Long.valueOf(M0()));
        return c8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, getName(), false);
        q3.c.l(parcel, 2, this.f24484r);
        q3.c.o(parcel, 3, M0());
        q3.c.b(parcel, a8);
    }

    public d(String str, long j7) {
        this.f24483q = str;
        this.f24485s = j7;
        this.f24484r = -1;
    }
}
