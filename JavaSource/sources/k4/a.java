package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import p3.n;

/* compiled from: MyApplication */
public final class a extends q {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: q, reason: collision with root package name */
    private final boolean f24526q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f24527r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f24528s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean[] f24529t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean[] f24530u;

    public a(boolean z7, boolean z8, boolean z9, boolean[] zArr, boolean[] zArr2) {
        this.f24526q = z7;
        this.f24527r = z8;
        this.f24528s = z9;
        this.f24529t = zArr;
        this.f24530u = zArr2;
    }

    public final boolean[] M0() {
        return this.f24529t;
    }

    public final boolean[] N0() {
        return this.f24530u;
    }

    public final boolean O0() {
        return this.f24526q;
    }

    public final boolean P0() {
        return this.f24527r;
    }

    public final boolean Q0() {
        return this.f24528s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return n.a(aVar.M0(), M0()) && n.a(aVar.N0(), N0()) && n.a(Boolean.valueOf(aVar.O0()), Boolean.valueOf(O0())) && n.a(Boolean.valueOf(aVar.P0()), Boolean.valueOf(P0())) && n.a(Boolean.valueOf(aVar.Q0()), Boolean.valueOf(Q0()));
    }

    public final int hashCode() {
        return n.b(M0(), N0(), Boolean.valueOf(O0()), Boolean.valueOf(P0()), Boolean.valueOf(Q0()));
    }

    public final String toString() {
        return n.c(this).a("SupportedCaptureModes", M0()).a("SupportedQualityLevels", N0()).a("CameraSupported", Boolean.valueOf(O0())).a("MicSupported", Boolean.valueOf(P0())).a("StorageWriteSupported", Boolean.valueOf(Q0())).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.c(parcel, 1, O0());
        q3.c.c(parcel, 2, P0());
        q3.c.c(parcel, 3, Q0());
        q3.c.d(parcel, 4, M0(), false);
        q3.c.d(parcel, 5, N0(), false);
        q3.c.b(parcel, a8);
    }
}
