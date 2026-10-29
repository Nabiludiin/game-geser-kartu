package y3;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class i extends c4.q {
    public static final Parcelable.Creator<i> CREATOR = new l();

    /* renamed from: q, reason: collision with root package name */
    private final long f27711q;

    /* renamed from: r, reason: collision with root package name */
    private final long f27712r;

    /* renamed from: s, reason: collision with root package name */
    private final h f27713s;

    /* renamed from: t, reason: collision with root package name */
    private final h f27714t;

    public i(long j7, long j8, h hVar, h hVar2) {
        p3.o.p(j7 != -1);
        p3.o.m(hVar);
        p3.o.m(hVar2);
        this.f27711q = j7;
        this.f27712r = j8;
        this.f27713s = hVar;
        this.f27714t = hVar2;
    }

    public final h M0() {
        return this.f27713s;
    }

    public final long N0() {
        return this.f27711q;
    }

    public final long O0() {
        return this.f27712r;
    }

    public final h P0() {
        return this.f27714t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        return p3.n.a(Long.valueOf(this.f27711q), Long.valueOf(iVar.f27711q)) && p3.n.a(Long.valueOf(this.f27712r), Long.valueOf(iVar.f27712r)) && p3.n.a(this.f27713s, iVar.f27713s) && p3.n.a(this.f27714t, iVar.f27714t);
    }

    public final int hashCode() {
        return p3.n.b(Long.valueOf(this.f27711q), Long.valueOf(this.f27712r), this.f27713s, this.f27714t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.o(parcel, 1, N0());
        q3.c.o(parcel, 2, O0());
        q3.c.q(parcel, 3, M0(), i7, false);
        q3.c.q(parcel, 4, P0(), i7, false);
        q3.c.b(parcel, a8);
    }
}
