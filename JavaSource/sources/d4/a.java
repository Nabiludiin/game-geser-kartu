package d4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c4.q;
import p3.n;

/* compiled from: MyApplication */
public final class a extends q implements b {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: q, reason: collision with root package name */
    private final String f23121q;

    /* renamed from: r, reason: collision with root package name */
    private final String f23122r;

    /* renamed from: s, reason: collision with root package name */
    private final long f23123s;

    /* renamed from: t, reason: collision with root package name */
    private final Uri f23124t;

    /* renamed from: u, reason: collision with root package name */
    private final Uri f23125u;

    /* renamed from: v, reason: collision with root package name */
    private final Uri f23126v;

    a(String str, String str2, long j7, Uri uri, Uri uri2, Uri uri3) {
        this.f23121q = str;
        this.f23122r = str2;
        this.f23123s = j7;
        this.f23124t = uri;
        this.f23125u = uri2;
        this.f23126v = uri3;
    }

    static int M0(b bVar) {
        return n.b(bVar.l(), bVar.t(), Long.valueOf(bVar.U()), bVar.g0(), bVar.G(), bVar.P());
    }

    static boolean N0(b bVar, Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (bVar == obj) {
            return true;
        }
        b bVar2 = (b) obj;
        return n.a(bVar2.l(), bVar.l()) && n.a(bVar2.t(), bVar.t()) && n.a(Long.valueOf(bVar2.U()), Long.valueOf(bVar.U())) && n.a(bVar2.g0(), bVar.g0()) && n.a(bVar2.G(), bVar.G()) && n.a(bVar2.P(), bVar.P());
    }

    static String O0(b bVar) {
        return n.c(bVar).a("GameId", bVar.l()).a("GameName", bVar.t()).a("ActivityTimestampMillis", Long.valueOf(bVar.U())).a("GameIconUri", bVar.g0()).a("GameHiResUri", bVar.G()).a("GameFeaturedUri", bVar.P()).toString();
    }

    @Override // d4.b
    public final Uri G() {
        return this.f23125u;
    }

    @Override // d4.b
    public final Uri P() {
        return this.f23126v;
    }

    @Override // d4.b
    public final long U() {
        return this.f23123s;
    }

    public final boolean equals(Object obj) {
        return N0(this, obj);
    }

    @Override // d4.b
    public final Uri g0() {
        return this.f23124t;
    }

    public final int hashCode() {
        return M0(this);
    }

    @Override // d4.b
    public final String l() {
        return this.f23121q;
    }

    @Override // d4.b
    public final String t() {
        return this.f23122r;
    }

    public final String toString() {
        return O0(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 1, this.f23121q, false);
        q3.c.r(parcel, 2, this.f23122r, false);
        q3.c.o(parcel, 3, this.f23123s);
        q3.c.q(parcel, 4, this.f23124t, i7, false);
        q3.c.q(parcel, 5, this.f23125u, i7, false);
        q3.c.q(parcel, 6, this.f23126v, i7, false);
        q3.c.b(parcel, a8);
    }
}
