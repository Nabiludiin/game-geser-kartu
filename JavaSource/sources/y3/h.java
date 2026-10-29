package y3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class h extends c4.q {
    public static final Parcelable.Creator<h> CREATOR = new k();

    /* renamed from: q, reason: collision with root package name */
    private final int f27708q;

    /* renamed from: r, reason: collision with root package name */
    private final long f27709r;

    /* renamed from: s, reason: collision with root package name */
    private final long f27710s;

    public h(int i7, long j7, long j8) {
        p3.o.q(j7 >= 0, "Min XP must be positive!");
        p3.o.q(j8 > j7, "Max XP must be more than min XP!");
        this.f27708q = i7;
        this.f27709r = j7;
        this.f27710s = j8;
    }

    public final int M0() {
        return this.f27708q;
    }

    public final long N0() {
        return this.f27710s;
    }

    public final long O0() {
        return this.f27709r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        return p3.n.a(Integer.valueOf(hVar.M0()), Integer.valueOf(M0())) && p3.n.a(Long.valueOf(hVar.O0()), Long.valueOf(O0())) && p3.n.a(Long.valueOf(hVar.N0()), Long.valueOf(N0()));
    }

    public final int hashCode() {
        return p3.n.b(Integer.valueOf(this.f27708q), Long.valueOf(this.f27709r), Long.valueOf(this.f27710s));
    }

    public final String toString() {
        return p3.n.c(this).a("LevelNumber", Integer.valueOf(M0())).a("MinXp", Long.valueOf(O0())).a("MaxXp", Long.valueOf(N0())).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, M0());
        q3.c.o(parcel, 2, O0());
        q3.c.o(parcel, 3, N0());
        q3.c.b(parcel, a8);
    }
}
